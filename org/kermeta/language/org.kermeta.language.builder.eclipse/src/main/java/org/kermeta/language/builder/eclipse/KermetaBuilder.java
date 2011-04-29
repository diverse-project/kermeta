/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/

package org.kermeta.language.builder.eclipse;

import java.net.MalformedURLException;

import org.eclipse.core.resources.IResource;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.language.builder.api.Builder;
import org.kermeta.language.eclipse.builder.internal.Activator;
import org.kermeta.language.eclipse.builder.internal.ResourceIdentifier;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.eclipse.ResourceHelpers;

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
						
		try {
			KermetaCompiler theCompiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem());
					
			ModelingUnit freshModelingUnit = theCompiler.parse(ResourceHelpers.IResourceToURL(toParse));
						
			ResourceIdentifier theCurrentResourceIdentifier = getResourceIdentifier(toParse.getFullPath().toOSString());
		
			if (theCurrentResourceIdentifier==null) {
				theCurrentResourceIdentifier = new ResourceIdentifier(toParse.getFullPath().toOSString(), inModification);
			}
			currentModelingUnits.put(theCurrentResourceIdentifier, freshModelingUnit);
		
			return freshModelingUnit;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
