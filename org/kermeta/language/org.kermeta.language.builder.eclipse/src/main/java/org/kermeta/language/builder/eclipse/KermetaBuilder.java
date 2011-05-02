/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/

package org.kermeta.language.builder.eclipse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.kermeta.language.builder.api.Builder;
import org.kermeta.language.builder.eclipse.internal.KermetaParser;
import org.kermeta.language.builder.eclipse.internal.ResourceIdentifier;
import org.kermeta.language.builder.eclipse.internal.executionner.KermetaRunner;
import org.kermeta.language.structure.ModelingUnit;

import fr.irisa.triskell.cache.utilities.SoftReferenceMapCache;

public class KermetaBuilder extends Builder{
	
	public SoftReferenceMapCache<ResourceIdentifier, ModelingUnit> currentModelingUnits = new SoftReferenceMapCache<ResourceIdentifier, ModelingUnit>();
	
	private static KermetaBuilder instance = null;
	private static Map<IResource,String> _parsingInProgress = new HashMap<IResource,String>();
	private static Map<IResource,String> _parsingInPending = new HashMap<IResource,String>();
	private static Map<IResource,String> parsingInProgress = Collections.synchronizedMap(_parsingInProgress);
	private static Map<IResource,String> parsingInPending = Collections.synchronizedMap(_parsingInPending);
	

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
	public ModelingUnit parseSpecificFile(IResource toParse, String content, boolean inModification) {
		KermetaRunner<String> theRunner = new KermetaRunner<String>(parsingInPending, parsingInProgress, toParse, content, new KermetaParser(inModification));
		theRunner.run();
		return currentModelingUnits.get(toParse.getFullPath().toOSString());
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
