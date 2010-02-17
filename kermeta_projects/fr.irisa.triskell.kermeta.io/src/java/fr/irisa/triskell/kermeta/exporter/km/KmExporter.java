

/*$Id: KmExporter.java,v 1.11 2008-04-30 13:57:53 ftanguy Exp $
* Project : io
* File : 	EcoreExporter.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.exporter.km;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.core.helper.FileHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.kmt.fixer.TypeContainementFixer;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;

public class KmExporter {

	
	private ResourceSet resourceSet = new ResourceSetImpl();
	
	/**		The set of kermeta unit and resources used for the export.		*/
	private Hashtable <KermetaUnit, Resource> resources = new Hashtable <KermetaUnit, Resource> ();
	
	/**		The set of uris used to save models.		*/
	private Hashtable <KermetaUnit, String> uris = new Hashtable <KermetaUnit, String> ();
	
	/**		The set of special resources that must not be saved.		*/
	private Hashtable <Resource, KermetaUnit> resourcesNotToSave = new Hashtable <Resource, KermetaUnit> ();
	
	private String pathToRemove = "";

	/**
	 * 
	 * @param kermetaUnit
	 * @param rep
	 * @param fileName
	 * @param trace
	 */
	public void export(KermetaUnit kermetaUnit, String rep, String fileName, boolean trace) {
		
		setUri(kermetaUnit, rep + "/", fileName);
		fillResourceSet(kermetaUnit);
		//addResourceReferences();
		try {
			for ( Entry<KermetaUnit, Resource> entry : resources.entrySet() ) {
				if ( ! resourcesNotToSave.containsKey(entry.getValue()) ) {
					entry.getValue().save(null);
					if ( trace ) {
						if ( entry.getKey().getTracer() != null ) {
							Resource traceResource = resourceSet.createResource( getTraceURI(entry.getValue()) );
							if ( entry.getKey().getTracer().getTraceModel() != null ) {
								traceResource.getContents().add( entry.getKey().getTracer().getTraceModel() );
								traceResource.save(null);
							}
						}
					}
				}
			}
		} catch (IOException e) {
			IOPlugin.logErrorMessage("Error while saving " + fileName,e);
		}
		
	}	
	
	/**
	 * 
	 * @param kermetaUnit
	 * @param rep
	 * @param trace
	 */
	public void export(KermetaUnit kermetaUnit, String rep, boolean trace) {
		export(kermetaUnit, rep, null, trace);
	}
	
	private void fillResourceSet(KermetaUnit kermetaUnit) {
		if ( resources.containsKey(kermetaUnit) )
			return;
		
		URI uri;
		if ( kermetaUnit.isFramework() ) {
			Resource resource = kermetaUnit.getModelingUnit().eResource();
			resourceSet.getResources().add( resource );
			resourcesNotToSave.put(resource, kermetaUnit);
			/*Resource resource = resourceSet.createResource( URI.createURI( kermetaUnit.getUri() )  );
			resource.getContents().add( kermetaUnit.getCompilationUnit() );
			resourcesNotToSave.put(resource, kermetaUnit);
			resources.put(kermetaUnit, resource);*/
			return;
		} else if ( ! uris.containsKey(kermetaUnit) ) {
			// URI like http://*
			
		} else {
			uri = EcoreHelper.createURI( uris.get(kermetaUnit) );
			Resource resource = resourceSet.createResource(uri);
	
			Iterator<Package> it = kermetaUnit.getInternalPackages().iterator();
			while ( it.hasNext() )
				fixTypeContainement( it.next() );

			resource.getContents().add( kermetaUnit.getModelingUnit() );
			resources.put(kermetaUnit, resource);

		}
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			fillResourceSet(current);
		}
	}
	

	/**
	 * Define a container for each element of the root package.
	 */
	private void fixTypeContainement(Package p) {
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
	
	
	private void setUri(KermetaUnit kermetaUnit, String rep, String fileName) {
		if ( uris.containsKey(kermetaUnit) )
			return;
		
		if ( kermetaUnit.isFramework() ) {
			uris.put(kermetaUnit, kermetaUnit.getUri());
			return;
		}

		String uri = kermetaUnit.getUri();

		/*
		 * 
		 * Checking the pathToRemove existency
		 * 
		 */
		if ( pathToRemove.equals("") ) {
			int index = uri.lastIndexOf("/");
			if ( index != -1 )
				pathToRemove = uri.substring(0, index);
		}
		
		/*
		 * 
		 * Remove part of path if not a registered file
		 * 
		 */
		if ( ! kermetaUnit.getUri().startsWith("http://") ) {
			String regex = pathToRemove + ".+";
			if ( uri.matches(regex) ) {
				uri = uri.replace(pathToRemove + "/", "");
				uri = rep + uri;
			} else {
				int index = uri.lastIndexOf("/");
				if ( index != -1 )
					uri = rep + uri.substring(index+1);
			}
		} else {
			int index = kermetaUnit.getUri().lastIndexOf("/");
			uri = rep + kermetaUnit.getUri().substring(index+1) + ".km";
		}

		if ( fileName != null )
			uris.put(kermetaUnit, fileName);
		else {
			uri = FileHelper.replaceExtension(uri, "km");
			uris.put(kermetaUnit, uri);
		}
			
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			setUri(current, rep, null);
		}
		
	}
	
	/**
	 * Calculate the uri for the trace model.
	 * @param resource
	 * @return
	 */
	private URI getTraceURI(Resource resource) {
		StringBuffer s = new StringBuffer();
		s.append("file:/");
		for ( int i=0; i<resource.getURI().segmentCount()-1; i++ )
			s.append(resource.getURI().segment(i) + "/");
		s .append(resource.getURI().lastSegment().replaceAll("\\..+", ".traceability"));
		return URI.createURI(s.toString());
	}
	
}


