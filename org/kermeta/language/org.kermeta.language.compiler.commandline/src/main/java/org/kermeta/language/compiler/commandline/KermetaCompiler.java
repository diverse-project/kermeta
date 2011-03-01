/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.loader.kp.KpLoader;
import org.kermeta.language.language.merger.binarymergerrunner.MainRunner;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;

/**
 * Basic compilation process for Kermeta2
 * This class is a facade for producing bytecode from a kermeta2 project
 */
public class KermetaCompiler {
	
	public Boolean saveIntermediateFiles = false;
	public String targetFolder;
	
	/**
	 * This initialization must be called before everything related to eclipse 
	 */
	public static void initializeFactory(){
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		org.kermeta.language.language.ecore2kmrunner.MainRunner.init();		
	}
	
	public KermetaCompiler(String targetFolder){
		// make sure initialize has been call : note that if some other EMF related things have 
		// been done before, the initialize should be done earlier too
		initializeFactory();
		this.targetFolder = targetFolder;
	}
	
	public void kp2bytecode(String kpFileURL) throws IOException {
		
	}
	
	public List<ModelingUnit> getAllReferedModelingUnits(String kpFileURL) throws IOException {
		KpLoader ldr = new KpLoader();
		KermetaProject kp = ldr.loadKp(kpFileURL);
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();
		
		
		
		return modelingUnits;
	}
}
