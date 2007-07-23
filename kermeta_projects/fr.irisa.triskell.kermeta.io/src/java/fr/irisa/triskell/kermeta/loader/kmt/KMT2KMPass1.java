/* $Id: KMT2KMPass1.java,v 1.11 2007-07-23 13:57:20 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass1.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 2, 2005
 * Author : Franck Fleurey <ffleurey@irisa.fr>
 * Description :
 * 	This is the first pass aimed at consqtructing the complete kcore representation of 
 * a Kermeta program. It collects import and usings and update the KermetaUnit attribute
 * importedUnits.
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.LoadingContext;


import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.ast.*;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Using;


/**
 * PASS 1 : Collect imports and usings
 */
public class KMT2KMPass1 extends KMT2KMPass {
	
	/** Contains the qualified ids that are allowed to follow a "require"*/
	private static ArrayList<String> allowedQualifiedIDs ;
	
	public static ArrayList<String> getAllowedQualifiedIDs() 
	{
		if (allowedQualifiedIDs == null)
		{
			allowedQualifiedIDs = new ArrayList<String>();
			allowedQualifiedIDs.add("kermeta"); 
			allowedQualifiedIDs.add("java_rt_jar");
		}
		return allowedQualifiedIDs;
	}
	
	protected Boolean existUsing = false;
	
	protected KermetaUnit currentImportedUnit;
	protected boolean isExcludeFilter;
	
	/**
	 * @param builder
	 */
	public KMT2KMPass1(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
	}
	
	
	public boolean beginVisit(PackageDecl node) {
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ImportStmt)
	 */
	public boolean beginVisit(ImportStmt importStmt) {
		StringLiteralOrQualifiedID node = importStmt.getUri();
		String uriRequire = "";
		boolean error = false;
		
		if (node instanceof QualifiedID) {
		
			// The only qualified ID for now is 'kermeta' and 'java_rt_jar'. Any other is forbidden.
			uriRequire = qualifiedIDAsString((QualifiedID)node);
			if ( getAllowedQualifiedIDs().contains(uriRequire) )
				try {
					currentImportedUnit = IOPlugin.getDefault().getKermetaUnit( uriRequire );
				} catch ( URIMalformedException exception ) {
					builder.error( exception.getMessage() );
				}
			else
				builder.error("PASS 1 : invalid require was found : 'require " + uriRequire + "'" );
		
		} else {
		
			String s = ((StringLiteralContainer)node).getString_literal().getText();
			s = s.substring(1, s.length() -1 );
			
			String fileURI = "";
			if ( s.equals("kermeta") )
				fileURI = s;
			else {
				
				if ( ! s.startsWith("platform:/") && ! s.startsWith("http://") ) {
					int index = builder.getUri().lastIndexOf("/");
					String path = builder.getUri().substring(0, index);
					fileURI = path + "/" + s;

				} else
					fileURI = s;
				
				URI uri = URI.createURI( fileURI );
				uri = EcoreHelper.getCanonicalURI(uri);
				fileURI = uri.toString();
				URIConverter converter = new URIConverterImpl();
				uri = converter.normalize(uri);
				try {
					InputStream stream = converter.createInputStream(uri);
					stream.close();
					uriRequire = s;
				} catch (IOException e) {
					if ( fileURI.matches("http://.+") ) {
						error = false;
						uriRequire = fileURI;
					} else
						error = true;
				} catch (IllegalArgumentException e) {
					error = true;
				}
			}
			
			if ( ! error ) {
				try {
					currentImportedUnit = IOPlugin.getDefault().getKermetaUnit( fileURI );
					currentImportedUnit.setNeedASTTraces(true);
				} catch ( URIMalformedException exception ) {
					builder.error( exception.getMessage() );
				}
			} else
				if ( error )
					builder.error("The file " + fileURI + " does not exist", importStmt);

		}
		
		if ( currentImportedUnit != null) {
			if ( ! builder.getImportedKermetaUnits().contains( currentImportedUnit ) ) {
				builder.getImportedKermetaUnits().add( currentImportedUnit );
				Require require = builder.addRequire( uriRequire );
				builder.storeTrace(require, importStmt);
			} else if ( ! currentImportedUnit.getUri().equals(IOPlugin.FRAMEWORK_KM_URI) ){
				builder.warning("Duplicate require of " + currentImportedUnit.getUri() + ".", importStmt);
			}
		}
		
		isExcludeFilter= true;
		if(importStmt.getExcludeFilter() != null)
			visit(importStmt.getExcludeFilter().getFilters());
		isExcludeFilter = false;
		if(importStmt.getIncludeFilter() != null)
			visit(importStmt.getIncludeFilter().getFilters());
		return false;
	}
	
	public boolean beginVisit(Filter filter) {
		String filterText = filter.getString_literal().getText();
		// trim leading and trailing "
		if ( filterText.length() > 2)
			filterText = filterText.substring(1, filterText.length()-1);
		fr.irisa.triskell.kermeta.language.structure.Filter f = StructureFactory.eINSTANCE.createFilter();
		f.setQualifiedName( filterText );
		if ( isExcludeFilter ) {
			currentImportedUnit.getModelingUnit().getExcludeFilters().add(f);
			AbstractBuildingState state = (AbstractBuildingState) currentImportedUnit.getBuildingState();
			state.loaded = false;
		} else {
			currentImportedUnit.getModelingUnit().getIncludeFilters().add(f);
			AbstractBuildingState state = (AbstractBuildingState) currentImportedUnit.getBuildingState();
			state.loaded = false;
		}
		return false;
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.UsingStmt)
	 */
	public boolean beginVisit(UsingStmt usingStmt) {
		Using using = builder.addUsing(qualifiedIDAsString(usingStmt.getName()));
		builder.storeTrace(using, usingStmt);
		existUsing = true;
		return false;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.ast.KermetaASTNodeVisitor#beginVisit(fr.irisa.triskell.kermeta.ast.TopLevelDecls)
	 */
	public boolean beginVisit(TopLevelDecls decls)
	{
		if (decls.getChildCount()== 0 && existUsing == true)
			builder.error(
			"PASS 1 : Either 'using' declaration is misplaced (should be put after 'require'), " +
			"or there is a 'using' declaration, but no element defined in your file.");
		return super.beginVisit(decls);
	}
	
}
