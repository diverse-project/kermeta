/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/

package org.kermeta.language.builder.eclipse;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.kermeta.language.builder.eclipse.internal.BuilderFromKP;
import org.kermeta.language.builder.eclipse.internal.CompilerFromKP;
import org.kermeta.language.builder.eclipse.internal.KPBuilder;
import org.kermeta.language.builder.eclipse.internal.KPFilesContainer;
import org.kermeta.language.builder.eclipse.internal.KermetaParser;
import org.kermeta.language.builder.eclipse.internal.executionner.KermetaRunner;

public class KermetaBuilder extends org.kermeta.language.builder.api.Builder{
	
	public HashMap<String,KPBuilder> kpBuilders = new HashMap<String,KPBuilder>();
	
	private static KermetaBuilder instance = null;
	private static Map<IResource,String> _parsingInProgress = new HashMap<IResource,String>();
	private static Map<IResource,String> _parsingInPending = new HashMap<IResource,String>();
	private static Map<IResource,String> parsingInProgress = Collections.synchronizedMap(_parsingInProgress);
	private static Map<IResource,String> parsingInPending = Collections.synchronizedMap(_parsingInPending);
	private static Map<HashMap<String,KPBuilder>,String> _compilingInProgress = new HashMap<HashMap<String,KPBuilder>,String>();
	private static Map<HashMap<String,KPBuilder>,String> _compilingInPending = new HashMap<HashMap<String,KPBuilder>,String>();
	private static Map<HashMap<String,KPBuilder>,String> compilingInProgress = Collections.synchronizedMap(_compilingInProgress);
	private static Map<HashMap<String,KPBuilder>,String> compilingInPending = Collections.synchronizedMap(_compilingInPending);
	private static Map<HashMap<String,KPBuilder>,String> _buildingInProgress = new HashMap<HashMap<String,KPBuilder>,String>();
	private static Map<HashMap<String,KPBuilder>,String> _buildingInPending = new HashMap<HashMap<String,KPBuilder>,String>();
	private static Map<HashMap<String,KPBuilder>,String> buildingInProgress = Collections.synchronizedMap(_buildingInProgress);
	private static Map<HashMap<String,KPBuilder>,String> buildingInPending = Collections.synchronizedMap(_buildingInPending);
	

	private KermetaBuilder(){	
		super();
	}
	
	public static KermetaBuilder getDefault() {
		if (instance == null) {
			instance = new KermetaBuilder();
		}
		return instance;
	}
	
	@Override
	public String generateIdentifier(IResource element) {
		return element.getFullPath().toOSString();		
	}

	@Override
	public void buildFromKP(String kpIdentifier) {
		KermetaRunner<HashMap<String,KPBuilder>,String> theRunner = new KermetaRunner<HashMap<String,KPBuilder>,String>(buildingInPending, buildingInProgress, kpBuilders, kpIdentifier, new BuilderFromKP());
		theRunner.start();
	}
	
	@Override
	public void compileFromKP(String kpIdentifier) {
		KermetaRunner<HashMap<String,KPBuilder>,String> theRunner = new KermetaRunner<HashMap<String,KPBuilder>,String>(compilingInPending, compilingInProgress, kpBuilders, kpIdentifier, new CompilerFromKP());
		theRunner.start();
	}

	@Override
	public void parseSpecificFile(IResource toParse, String content) {
		KermetaRunner<IResource,String> theRunner = new KermetaRunner<IResource,String>(parsingInPending, parsingInProgress, toParse, content, new KermetaParser());
		theRunner.start();		
	}

	@Override
	public String findKPidentifierFromKMT(IResource kmt) {
		String kmtIdentifier = generateIdentifier(kmt);
		for (String aKPIdentifier : kpBuilders.keySet()) {
			for (String anIdentifier : kpBuilders.get(aKPIdentifier).kpFiles.keySet()) {
				if (kmtIdentifier.equals(anIdentifier)) {
					return aKPIdentifier;
				}
			}			
		}
		return null;
	}

	@Override
	public void setDirty(IResource kmt, boolean dirty) {
		kpBuilders.get(findKPidentifierFromKMT(kmt)).kpFiles.get(generateIdentifier(kmt)).dirtyFile = dirty;		
	}
}
