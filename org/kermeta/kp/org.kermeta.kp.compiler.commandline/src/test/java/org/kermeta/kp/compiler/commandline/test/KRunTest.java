/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.TestCase;

import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.kp.compiler.commandline.KermetaRunner;
import org.kermeta.kp.compiler.commandline.KpVariableExpander;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactory;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForEcore;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForKm;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForKmt;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactoryForUmlProfile;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.language.helper.tests.utils.ErrorAwareMessagingSystem;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.aether.AetherUtil;
import org.kermeta.utils.helpers.FileExtensionComparator;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.SimpleLocalFileConverter;
import org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper;



public class KRunTest extends TestCase {
	String kpFile;
	String targetFolder;
	String testName;


    public KRunTest(String testName,String kpFile, String targetFolder) {
		super();
		this.kpFile = kpFile.replaceAll("\\\\","/");
		this.targetFolder = targetFolder.replaceAll("\\\\","/");
		this.testName = testName;
	}



	public void test() throws IOException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException  {
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
		
		// copy resources in class folder to enable reflexivity
		FileHelpers.copyDirectory(new File(targetFolder+"resources/"), new File(targetFolder+"classes/"));
		compiler.setModelingUnitLoaders(getDefaultMuLoaders());
		
		KpLoaderImpl ldr = new KpLoaderImpl(compiler.logger);
		
		// Load KP file
		KermetaProject kp = ldr.loadKp("file:/"+kpFile);
		if (kp == null) {
			fail("Invalid kp file.");			
		}
		
		
		KpVariableExpander varExpander = new KpVariableExpander("file:/"+kpFile, kp, compiler.fileSystemConverter, compiler.logger);

		createURIMapFile(kp, varExpander, compiler);
		
		ArrayList<String> fullClassPath = new ArrayList<String>();
		fullClassPath.addAll(additionalClassPath);
		fullClassPath.addAll(compiler.getBinaryDependencyClasspath(kp, varExpander));
		fullClassPath.add(targetFolder+"emfclasses/");
		
		// set location of urimap file
		System.setProperty(ExtensibleURIConverterImplURIMapHelper.URIMAP_LOCATION_SYSTEM_PROPERTY, targetFolder+File.separator+"urimap.properties");
		
		ErrorAwareMessagingSystem errorAwareLogger = new ErrorAwareMessagingSystem();
		KermetaRunner runner = new KermetaRunner(targetFolder+"classes/", 
				kp.getGroup()+"."+ kp.getName(),
				fullClassPath,
				errorAwareLogger);
		ArrayList<String> params = new ArrayList<String>();
		runner.runK2Program(params,targetFolder+File.separator+"urimap.properties");
				
		
		if(errorAwareLogger.errorTrace.size() > 0){
			assertTrue("Execution has reported "+errorAwareLogger.errorTrace.size()+" error(s) in logger : "+errorAwareLogger.errorTrace.get(0), errorAwareLogger.errorTrace.size() == 0);
		}
        
    }
	
	
	public void createURIMapFile(KermetaProject kp, KpVariableExpander varExpander, KermetaCompiler compiler) throws IOException{
		Properties props = new Properties();
		String key = "platform:/resource/"+kp.getName();
		String value = "file:/"+targetFolder;
		props.put(key, value);
		
		for(Dependency dep : kp.getDependencies()){
			createURIMapEntryForDependency(props, dep, varExpander, compiler);
		}
		
		FileOutputStream fos;
		fos = new FileOutputStream(targetFolder+File.separator+"urimap.properties");
		props.store(fos, "Simulating resolution of eclipse workbench URIs resolution using URI map translation");
		fos.close();		
	}
    
    private void createURIMapEntryForDependency(Properties props, Dependency dep, KpVariableExpander varExpander, KermetaCompiler compiler) {
		// if there is more than one url for a dependency we may try to create an uri map if one of them is a platform:/...
    	if(dep.getUrl().size() > 1){
			String platformUrl = null;
			for(String url : dep.getUrl()){
				if(url.startsWith("platform:/")){
					platformUrl = url;
					if(!platformUrl.endsWith("/")) platformUrl = platformUrl + "/";
				}
			}
			String resolvedURL;
			try {
				resolvedURL = "file:/"+compiler.getResolvedDependencyURL(dep,varExpander);
				if(resolvedURL.endsWith(".jar"))  resolvedURL= "jar:"+resolvedURL+"!/"; 
				//platform\:/plugin/org.eclipse.emf.ecore/=jar\:file\:/C\:/eclipse3.7_base/eclipse/plugins/org.eclipse.emf.ecore_2.7.0.v20120127-1122.jar\!/
				
				if(platformUrl != null && resolvedURL != null){
					props.put(platformUrl, resolvedURL);
					return;
				}
			} catch (IOException e) {}
			
		}
    	
    	// if one of the dependency comes from eclipse (ie. special name pattern in the maven group+artifact id) then we may consider it as a platform:/plugin
    	String mvnUrl = null;
		for(String url : dep.getUrl()){
			if(url.startsWith("mvn:")){
				mvnUrl = url;
			}
		}
		if(mvnUrl != null){
			Pattern pattern = Pattern.compile("mvn:([\\w\\.]*)/(\\w*)");
			Matcher matcher = pattern.matcher(mvnUrl);
			// Check all occurance
			while (matcher.find()) {
				String groupId = matcher.group(1);
				String artefactId = matcher.group(2);
				String resolvedURL;
				try {
					resolvedURL = "jar:file:/"+compiler.getResolvedDependencyURL(dep,varExpander)+"!/";
					if(resolvedURL != null){
						props.put("platform:/plugin/"+groupId+"."+artefactId+"/", resolvedURL);
						return;
					}
				} catch (IOException e) {}
			}
		}
		
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

