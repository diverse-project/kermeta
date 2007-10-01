

/*$Id: Merger.java,v 1.1 2007-10-01 15:07:49 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	Merger.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 sept. 07
* Authors : paco
*/

package org.kermeta.merger;

import java.io.IOException;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.kmt.fixer.TypeContainementFixer;
import org.kermeta.merger.internal.MergeContext;
import org.kermeta.merger.internal.Pass1;
import org.kermeta.merger.internal.Pass2;
import org.kermeta.merger.internal.Pass3;
import org.kermeta.merger.internal.Pass4;

import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.loader.kmt.AbstractBuildingState;

public class Merger {

	private KermetaUnit kermetaUnit = null;
	
	public String process(Set<KermetaUnit> kermetaUnitsToMerge) throws IOException, URIMalformedException {
		String s = getDefaultPath(kermetaUnitsToMerge, true);
		process(kermetaUnitsToMerge, s);		
		return s;
	}
	
	private String getDefaultPath(Set<KermetaUnit> kermetaUnitsToMerge, boolean setPath) {
		String s = "";
		String path = "";
		for ( KermetaUnit unit : kermetaUnitsToMerge ) {
			if ( ! unit.isFramework() && ! unit.getUri().startsWith("http://") ) {
				int i = unit.getUri().lastIndexOf("/");
				int j = unit.getUri().lastIndexOf(".");
				if ( setPath ) {
					if ( path.equals("") )
						path = unit.getUri().substring(0, i);
				}
				s += unit.getUri().substring(i+1, j);
			}
		}
		if ( setPath )
			return path + "/" + s + ".km";
		else
			return s + ".km";
	}
	
	public String process(Set<KermetaUnit> kermetaUnitsToMerge, String path, String fileName) throws URIMalformedException, IOException {
		String s = "";
		if ( fileName == null )
			s = path + "/" + getDefaultPath(kermetaUnitsToMerge, false);
		else
			s = path + "/" + fileName;
		process(kermetaUnitsToMerge, s);
		return s;
	}
	
	public void process(Set<KermetaUnit> kermetaUnitsToMerge, String outputFile) throws URIMalformedException, IOException {
		IOPlugin.getDefault().unload(outputFile);
		kermetaUnit = IOPlugin.getDefault().basicGetKermetaUnit(outputFile);
		
		MergeContext context = new MergeContext(kermetaUnitsToMerge);
		
		/*
		 * 
		 * We need to be carefull about the usings.
		 * If two class definitions with the same name (not the same qualified name) exist, it
		 * could happen that during the type definition looking the result is not the good
		 * type definition.
		 * 
		 */
		for ( KermetaUnit unit : kermetaUnitsToMerge ) {
			if ( ! unit.isFramework() )
				for ( String s : unit.getUsings() )
					context.addPreUsing(s);
			else
				for ( String s : unit.getUsings() )
					context.addPostUsing(s);
		}
		
		try {
			
			/*
			 * 
			 * Structure creation
			 * 
			 */
			Pass1 pass1 = new Pass1(kermetaUnit, context);
			pass1.process();
			
			/*
			 * 
			 * Features creation
			 * 
			 */
			Pass2 pass2 = new Pass2(kermetaUnit, context);
			pass2.process();
			
			/*
			 * 
			 * Type setting
			 * 
			 */
			Pass3 pass3 = new Pass3(kermetaUnit, context);
			pass3.process();
	
			/*
			 * 
			 * Operations bodies creation
			 * 
			 */
			Pass4 pass4 = new Pass4(kermetaUnit, context);
			pass4.process();

			for ( String s : context.getPostUsingsToAdd() )
				kermetaUnit.addUsing( s );
			
			((AbstractBuildingState) kermetaUnit.getBuildingState()).loaded = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		for ( Package p : kermetaUnit.getPackages() )
			fixTypeContainement(p);
		
		URI uri = URI.createURI( kermetaUnit.getUri() );
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		
		resource.getContents().add( kermetaUnit.getModelingUnit() );
		resource.save(null);
	}
	
	/**
	 * Define a container for each element of the root package.
	 */
	public void fixTypeContainement(Package p) {
		TreeIterator<EObject> it = p.eAllContents();
		TypeContainementFixer fixer = new TypeContainementFixer();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Object o = (fr.irisa.triskell.kermeta.language.structure.Object)it.next();
			if (o instanceof CallExpression) {
			    CallExpression e = (CallExpression)o;
			    fixer.addContainedTypes(e.getStaticTypeVariableBindings(), e);
			}
			
			if (o instanceof Expression) {
				Expression e = (Expression)o;
				if (e.getStaticType() != null) {
					fixer.addContainedTypes(e.getStaticType(), e);	
				}
			}
			else if (o instanceof TypeContainer) {
				if (o != null) fixer.accept(o);
			}
		}
	}


}


