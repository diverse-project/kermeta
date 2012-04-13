/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline.test;

import java.io.IOException;
import java.util.ArrayList;

import junit.framework.TestCase;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.aether.AetherUtil;
import org.kermeta.utils.helpers.SimpleLocalFileConverter;



public class CommandLineKermetaCompilerTest extends TestCase {
	String kpFile;
	String targetFolder;
	String testName;


    public CommandLineKermetaCompilerTest(String testName,String kpFile, String targetFolder) {
		super();
		this.kpFile = kpFile;
		this.targetFolder = targetFolder;
		this.testName = testName;
	}



	public void test() throws IOException  {
        System.out.println("Test compiling " + kpFile);
        System.out.println("            to " + targetFolder);
        
        // Phase 1 : compiles without crashing
        KermetaCompiler compiler = new KermetaCompiler(true, new StdioSimpleMessagingSystem(), new SimpleLocalFileConverter(), false);
                
        String currentKermetaVersion = "2.0.1-SNAPSHOT";
        String mavenRepository = "http://maven.irisa.fr/artifactory/repo";
		ArrayList<String> additionalClassPath = new ArrayList<String>();
		AetherUtil aetherUtil = new AetherUtil();
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.scala", "scala-library", "2.9.0-1", "http://maven.irisa.fr/artifactory/kermeta-public-release").getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.emf", "emf.lib", "2.7.0", "http://maven.irisa.fr/artifactory/kermeta-public-release").getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.language", "language.library.core", currentKermetaVersion, mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.language", "language.model", currentKermetaVersion, mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.utils", "utils.helpers", currentKermetaVersion, mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.utils", "utils.systemservices.api", currentKermetaVersion, mavenRepository).getAbsolutePath());
		
		compiler.initializeTargetFolders(targetFolder, targetFolder,
				targetFolder+"scala/", targetFolder+"classes/", 
				targetFolder+"genmodel/", 
				targetFolder+"java/", targetFolder+"emfclasses/", targetFolder+"resources/");
		compiler.kp2bytecode("file:/"+kpFile,additionalClassPath, KermetaCompiler.PHASE_GENERATE_SCALA_BYTECODE);
				
		assertTrue("Failure = " + compiler.errorMessage, !compiler.hasFailed);
		// TODO add more phase and assertions, ex: run the result if runnable ?
		
        //assert(true);
    }
    
    @Override
    public String getName() {
        return testName;
    }

    @Override
    public void runTest() throws Throwable  {
        test();
    }

    @Override
    protected void tearDown() throws Exception {
        //
    }
}

