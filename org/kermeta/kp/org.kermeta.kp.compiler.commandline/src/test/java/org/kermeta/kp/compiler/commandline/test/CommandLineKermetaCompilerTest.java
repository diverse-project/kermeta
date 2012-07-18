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
import java.util.NavigableMap;
import java.util.TreeMap;

import junit.framework.TestCase;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactory;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForEcore;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForKm;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForKmt;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForUmlProfile;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.aether.AetherUtil;
import org.kermeta.utils.helpers.FileExtensionComparator;
import org.kermeta.utils.helpers.SimpleLocalFileConverter;



public class CommandLineKermetaCompilerTest extends TestCase {
	String kpFile;
	String targetFolder;
	String testName;


    public CommandLineKermetaCompilerTest(String testName,String kpFile, String targetFolder) {
		super();
		this.kpFile = kpFile.replaceAll("\\\\","/");
		this.targetFolder = targetFolder.replaceAll("\\\\","/");
		this.testName = testName;
	}



	public void test() throws IOException  {
        System.out.println("Test compiling " + kpFile);
        System.out.println("            to " + targetFolder);
        
        // Phase 1 : compiles without crashing
        KermetaCompiler compiler = new KermetaCompiler(true, new StdioSimpleMessagingSystem(), new SimpleLocalFileConverter(), false);
        
        String currentKermetaVersion = "LATEST";
        String mavenRepository = "http://maven.inria.fr/artifactory/repo";
		ArrayList<String> additionalClassPath = new ArrayList<String>();
		AetherUtil aetherUtil = new AetherUtil();
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.scala", "scala-library", "2.9.0-1", "http://maven.inria.fr/artifactory/public-release").getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.emf", "emf.lib", "2.7.0", "http://maven.inria.fr/artifactory/public-release").getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.emf", "emf.genmodel", currentKermetaVersion, mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.eclipse", "org.eclipse.emf.codegen", "2.6.0.v20100914-1218", mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.eclipse", "org.eclipse.emf.codegen.ecore", "2.6.1.v20100914-1218", mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.eclipse", "org.eclipse.jdt.core", "3.6.2.v_A76_R36x", mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.language", "language.library.core", currentKermetaVersion, mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.language", "language.model", currentKermetaVersion, mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.utils", "utils.helpers", currentKermetaVersion, mavenRepository).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact("org.kermeta.utils", "utils.systemservices.api", currentKermetaVersion, mavenRepository).getAbsolutePath());
		
		compiler.initializeTargetFolders(targetFolder, targetFolder,
				targetFolder+"scala/", targetFolder+"classes/", 
				targetFolder+"genmodel/", 
				targetFolder+"java/", targetFolder+"emfclasses/", targetFolder+"resources/");
		compiler.setModelingUnitLoaders(getDefaultMuLoaders());
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
    
    private NavigableMap<String, ModelingUnitLoaderFactory> getDefaultMuLoaders(){
    	NavigableMap<String, ModelingUnitLoaderFactory> muLoaders;
		muLoaders = new TreeMap<String, ModelingUnitLoaderFactory>(new FileExtensionComparator());
		muLoaders.put(".km", new ModelingUnitLoaderFactoryForKm());
		muLoaders.put(".kmt", new ModelingUnitLoaderFactoryForKmt());
		muLoaders.put(".ecore", new ModelingUnitLoaderFactoryForEcore());
		muLoaders.put(".profile.uml", new ModelingUnitLoaderFactoryForUmlProfile());
		return muLoaders;
	}
}

