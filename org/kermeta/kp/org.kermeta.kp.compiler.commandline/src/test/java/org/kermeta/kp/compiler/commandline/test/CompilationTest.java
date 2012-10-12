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
import java.util.List;
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




public class CompilationTest extends TestCase {
	String kpFile;
	String targetFolder;
	String testName;


    public CompilationTest(String testName,String kpFile, String targetFolder) {
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
        List<String> repositories = new ArrayList<String>();
        repositories.add("http://maven.inria.fr/artifactory/repo");
        //repositories.add("http://maven.inria.fr/artifactory/public-release");
        //repositories.add("http://maven.inria.fr/artifactory/public-snapshot");
		ArrayList<String> additionalClassPath = new ArrayList<String>();
		AetherUtil aetherUtil = new AetherUtil();
		//aetherUtil.
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("mvn:org.kermeta.scala/scala-library/2.9.0-1", repositories).getAbsolutePath());
		//additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.scala", "scala-library", "2.9.0-1", scala.collection.JavaConversions.asScalaBuffer(repositoriesList)).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("mvn:org.kermeta.emf/emf.lib/2.7.0", repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.emf", "emf.genmodel", currentKermetaVersion, repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.eclipse", "org.eclipse.emf.codegen", "2.6.0.v20100914-1218", repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.eclipse", "org.eclipse.emf.codegen.ecore", "2.6.1.v20100914-1218", repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.eclipse", "org.eclipse.jdt.core", "3.6.2.v_A76_R36x", repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.language", "language.library.core", currentKermetaVersion, repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.language", "language.model", currentKermetaVersion, repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.utils", "utils.helpers", currentKermetaVersion, repositories).getAbsolutePath());
		additionalClassPath.add(aetherUtil.resolveMavenArtifact4J("org.kermeta.utils", "utils.systemservices.api", currentKermetaVersion, repositories).getAbsolutePath());
		
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

