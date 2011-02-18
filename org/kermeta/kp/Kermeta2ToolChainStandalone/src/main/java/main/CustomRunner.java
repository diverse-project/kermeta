/* $Id:$ 
 * Creation : 15 févr. 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Olivier Barais
 * Customize this class for your local configuration
 * This file is here as a template
 * Usually you are not supposed to commit your change here, except if you enhance the template
 * A future 
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.language.structure.ModelingUnit;

public class CustomRunner {
	public static void main(String[] args) throws IOException {

		Main m = new Main();
		
		/*MainLoadUnit mainLoad = new MainLoadUnit();
		MainMerger mainMerger = new MainMerger();
		MainTypeSetter mainTypeSetter = new MainTypeSetter(); */
		
		// Parse framework and test File
		List<String> uris = new ArrayList<String>();
		//uris.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/org.kermeta.language.api.tests/src/main/resources/KMTLoader_Valid/300_testHelloWorld_standalone.kmt");
		uris
				.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/org.kermeta.language.loader.kmt.scala/test.kmt");
		uris
				.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/org.kermeta.language.library.core/src/main/kmt/kermeta/emfpersistence/emfpersitence.kmt");
		uris
				.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/org.kermeta.language.library.core/src/main/kmt/kermeta/io/io.kmt");
		uris
				.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/org.kermeta.language.library.core/src/main/kmt/kermeta/standard/baseType.kmt");
		uris
				.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/org.kermeta.language.library.core/src/main/kmt/kermeta/standard/collections.kmt");
		uris
				.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/org.kermeta.language.library.core/src/main/kmt/kermeta/utils/hashtable.kmt");

		uris
				.add("C:/Users/dvojtise/workspaces/kermetaV2_svn_3/Kermeta2ToolChainStandalone/model/My.ecore");				
		// use global main
		m.k2Compile(uris, null, null);
		
		// Use each main separately
	// Loader
	//List<ModelingUnit> loadModelingUnits =	 mainLoad.k2CompileLoadUnit(uris,null, null);
	
	// Merger
	//ModelingUnit mergedMU = mainMerger.k2CompileMerger(uris, null, null, loadModelingUnits);
	
	// Type Setter
	//mainTypeSetter.k2CompileTypeSetter(uris, null, null, mergedMU);
		

	}
}
