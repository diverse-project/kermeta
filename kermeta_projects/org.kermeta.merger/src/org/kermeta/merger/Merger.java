

/*$Id: Merger.java,v 1.7 2008-07-08 13:18:34 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	Merger.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 sept. 07
* Authors : paco <ftanguy@irisa.fr>
*/

package org.kermeta.merger;

import java.io.IOException;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.kmt.fixer.TypeContainementFixer;
import org.kermeta.merger.internal.MergeContext;
import org.kermeta.merger.internal.Pass1;
import org.kermeta.merger.internal.Pass2;
import org.kermeta.merger.internal.Pass3;
import org.kermeta.merger.internal.Pass4;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.loader.kmt.AbstractBuildingState;
import fr.irisa.triskell.traceability.helper.Tracer;

public class Merger {
	
	private KermetaUnit kermetaUnit = null;
	
	public String process(Set<KermetaUnit> kermetaUnitsToMerge, boolean trace, boolean executable) throws IOException, URIMalformedException, NotRegisteredURIException {
		String s = getDefaultPath(kermetaUnitsToMerge, true);
		process(kermetaUnitsToMerge, s, trace, executable);		
		return s;
	}
	
	static public String getDefaultPath(Set<KermetaUnit> kermetaUnitsToMerge, boolean setPath) {
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
		

		if ( s.length() > 14*4 ) {
			s = s.substring(0, 14*4);
		}
		
		if ( setPath )
			return path + "/" + s + ".km";
		else
			return s + ".km";
	}
	
	public String process(Set<KermetaUnit> kermetaUnitsToMerge, String path, String fileName, boolean trace, boolean executable) throws URIMalformedException, IOException, NotRegisteredURIException {
		String s = "";
		if ( fileName == null )
			s = path + "/" + getDefaultPath(kermetaUnitsToMerge, false);
		else
			s = path + "/" + fileName;
		process(kermetaUnitsToMerge, s, trace, executable);
		return s;
	}
	
	public void process(Set<KermetaUnit> kermetaUnitsToMerge, String outputFile, boolean executable) throws URIMalformedException, NotRegisteredURIException, IOException {
		process(kermetaUnitsToMerge, outputFile, true, executable);
	}
	
	public KermetaUnit process(Set<KermetaUnit> kermetaUnitsToMerge, String outputFile, boolean trace, boolean executable) throws URIMalformedException, IOException, NotRegisteredURIException {
		
		processInMemory(kermetaUnitsToMerge, outputFile, trace);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		/*
		 * 
		 * Creating the resource the kermeta model.
		 * 
		 */
		URI uri = URI.createURI( kermetaUnit.getUri() );
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add( kermetaUnit.getModelingUnit() );
		
		/*
		 * 
		 * Creating the resource for the trace model.
		 * 
		 */
    	int index = outputFile.lastIndexOf(".");
    	String traceFile = outputFile.substring(0, index) + ".traceability";
		URI traceModelURI = URI.createURI(traceFile);
		Resource traceResource = resourceSet.createResource(traceModelURI);
		if ( kermetaUnit.getTracer().getTraceModel() != null ) {
			traceResource.getContents().add( kermetaUnit.getTracer().getTraceModel() );
			try {
				traceResource.save(null);
			} catch(IOWrappedException e) {
				System.out.println();
			}
		}
		
		if ( executable ) {
			KermetaUnitChecker.check( kermetaUnit.getUri() );
		}
		
		resource.save(null);
		return kermetaUnit;
	}
	
	public KermetaUnit processInMemory(Set<KermetaUnit> kermetaUnitsToMerge, String outputFile) throws NotRegisteredURIException, URIMalformedException, IOException {
		return processInMemory(kermetaUnitsToMerge, outputFile, true);
	}
	
	public KermetaUnit processInMemory(Set<KermetaUnit> kermetaUnitsToMerge, String outputFile, boolean trace) throws NotRegisteredURIException, URIMalformedException, IOException {
		LoaderPlugin.getDefault().unload(outputFile);
		kermetaUnit = IOPlugin.getDefault().basicGetKermetaUnit(outputFile);
		Tag t = KermetaModelHelper.Tag.create(KermetaModelHelper.Tag.KERMETA_EXECUTABLE, "true");
		kermetaUnit.getModelingUnit().getOwnedTags().add(t);
		
		MergeContext context = null;
		if ( trace ) {
			kermetaUnit.setTracer( new Tracer() );
			context = new MergeContext(kermetaUnitsToMerge, kermetaUnit.getTracer());
		} else
			context = new MergeContext(kermetaUnitsToMerge, null);
			
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

		return kermetaUnit;
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


