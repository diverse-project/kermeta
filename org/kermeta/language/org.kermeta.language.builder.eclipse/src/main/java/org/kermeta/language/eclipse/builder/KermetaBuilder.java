/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/

package org.kermeta.language.eclipse.builder;

import org.eclipse.core.resources.IResource;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.language.builder.api.Builder;
import org.kermeta.language.eclipse.builder.internal.Activator;
import org.kermeta.language.eclipse.builder.internal.ResourceIdentifier;
import org.kermeta.language.structure.ModelingUnit;

import fr.irisa.triskell.cache.utilities.SoftReferenceMapCache;

public class KermetaBuilder extends Builder{
	
	public SoftReferenceMapCache<ResourceIdentifier, ModelingUnit> currentModelingUnits = new SoftReferenceMapCache<ResourceIdentifier, ModelingUnit>();
	
	private static KermetaBuilder instance = null;

	private KermetaBuilder(){
		super();
	}
	
	public static Builder getDefault() {
		if (instance == null) {
			instance = new KermetaBuilder();
		}
		return instance;
	}
	
	@Override
	public ModelingUnit parseSpecificFile(IResource toParse, boolean inModification) {
		System.out.println("Coucou 0");
		String cleanURI = toParse.getLocationURI().toString();
		if (cleanURI.startsWith("file:/")) {
			cleanURI = cleanURI.replaceFirst("file:/", "");
		}
		System.out.println("Coucou 1");
		KermetaCompiler theCompiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem());
		System.out.println("Coucou 2");
		
		ModelingUnit freshModelingUnit = theCompiler.parse(cleanURI);
		System.out.println("Coucou 3");
		
		ResourceIdentifier theCurrentResourceIdentifier = getResourceIdentifier(toParse.getFullPath().toOSString());
		System.out.println("Coucou 4");
		if (theCurrentResourceIdentifier==null) {
			theCurrentResourceIdentifier = new ResourceIdentifier(toParse.getFullPath().toOSString(), inModification);
		}
		currentModelingUnits.put(theCurrentResourceIdentifier, freshModelingUnit);
		System.out.println("Coucou 5");
		return freshModelingUnit;
	}
	
	public ResourceIdentifier getResourceIdentifier(String key) {
		for (ResourceIdentifier anElement : currentModelingUnits.keySet()) {
			if (anElement.key.equals(key)) {
				return anElement;
			}
		}
		return null;
	}

}
