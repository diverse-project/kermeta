package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.kermeta.kp.ImportFile;
import org.kermeta.kp.ImportProjectJar;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.PackageEquivalence;
import org.kermeta.kp.compiler.commandline.callable.CallableModelingUnitLoader;
import org.kermeta.kp.editor.analysis.helper.KermetaProjectHelper;
import org.kermeta.kp.editor.analysis.helper.KpResourceHelper;
import org.kermeta.kp.editor.analysis.helper.KpVariableExpander;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl4Eclipse;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class CollectSourcesHelper {
	public MessagingSystem logger;
	public KermetaCompiler compiler;
	
	public CollectSourcesHelper(KermetaCompiler compiler, MessagingSystem logger) {
		this.logger = logger;
		this.compiler = compiler;
	}
	
	/**
	 * If dirtyMU isn't empty, then return null
	 * else, return the last modified file
	 */
	public TracedURL getLastModifiedFile(ArrayList<TracedURL> sourcesUrls, HashMap<URL, ModelingUnit> dirtyMU){
		if (dirtyMU != null && !dirtyMU.isEmpty()) {
			return null;
		}
		TracedURL result = null;
		long newerDate = 0;
		
		for(TracedURL sourceUrl : sourcesUrls){
			
			try {
				java.net.URI fileUri;
				boolean isLibraryCoreObject = sourceUrl.getUrl().toString().endsWith("baseType.kmt") && sourceUrl.getUrl().toString().contains("language.library.core");
				
				boolean isDependency = sourceUrl.getSource() instanceof ImportProjectJar || sourceUrl.getSource() instanceof ImportProjectSources ;
				if(sourceUrl.getUrl().getProtocol().equals("jar")){
					String jarUrl = sourceUrl.getUrl().toString();
					fileUri =  java.net.URI.create(jarUrl.substring(4, jarUrl.indexOf("!")));
					logger.debug("jar detected trying to find its location = "+fileUri, getMessageGroup());
				}
				else{
					fileUri = sourceUrl.getUrl().toURI();
				}
				
				File file = new java.io.File(fileUri);
				if(newerDate < file.lastModified()){
					if(!(isDependency || isLibraryCoreObject)){
						logger.debug("changed to newer file = "+fileUri.toString(), getMessageGroup());
						newerDate =  file.lastModified();
						result = sourceUrl;
					}
					else{
						logger.debug("ignoring url that might contains Object from latest modified= "+fileUri.toString(), getMessageGroup());
					}
				} 
				
				
			} catch (Exception e) {
				logger.warn("cannot get lastModified of "+sourceUrl.getUrl(), getMessageGroup());
			}
			
		}
		if(result == null){
			logger.warn("cannot get lastModified from sourcesUrls.size="+sourcesUrls.size(), getMessageGroup());
			if(sourcesUrls.size() >0){
			logger.warn("cannot get lastModified from sourcesUrl.get(0)"+sourcesUrls.get(0), getMessageGroup());
			logger.warn("cannot get lastModified from sourcesUrl.get(0).getUrl"+sourcesUrls.get(0).getUrl(), getMessageGroup());
			}
		}
		return result;
	}
	
	/**
	 * If dirtyMU isn't empty, then return all urls except those that are dirty (ie. being modified)
	 * else, return the all but the last modified file
	 */
	public ArrayList<TracedURL> getAllButLastModifiedFile(ArrayList<TracedURL> sourcesUrls, HashMap<URL, ModelingUnit> dirtyMU){
		
		ArrayList<TracedURL> result = new ArrayList<TracedURL>();
		if (dirtyMU != null && !dirtyMU.isEmpty()) {
			for(TracedURL sourceUrl : sourcesUrls){
				if(!dirtyMU.containsKey(sourceUrl.getUrl())){
					result.add(sourceUrl);
				}
			}
		}
		else{
			TracedURL lastModified = getLastModifiedFile(sourcesUrls, dirtyMU);
			
			for(TracedURL sourceUrl : sourcesUrls){
				System.out.println("lastModified.getUrl()="+lastModified.getUrl());
				System.out.println("sourceUrl.getUrl()="+sourceUrl.getUrl());
				if(!sourceUrl.getUrl().equals(lastModified.getUrl())){
					result.add(sourceUrl);
				}
			}
		}
		return result;
	}
	
	/**
	 * returns the ImportFiles of this kp only
	 * @param kpString
	 * @return
	 * @throws IOException
	 */
	public ArrayList<TracedURL> getDirectImportFiles(String kpString) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		KermetaProject kp = ldr.loadKp(kpString);
		if (kp != null) {
			return getDirectImportFiles(kp, kpString);
		} else {
			return new ArrayList<TracedURL>();
		}
	}
	public ArrayList<TracedURL> getResolvedImportProjectSources(String kpString) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		KermetaProject kp = ldr.loadKp(kpString);
		if (kp != null) {
			return getResolvedImportProjectSources(kp, kpString);
		} else {
			return new ArrayList<TracedURL>();
		}
	}
	
	/**
	 * returns the ImportFiles of this kp only
	 * @param kp
	 * @param kpFileUrl
	 * @param varExpander
	 * @return
	 * @throws IOException
	 */
	public ArrayList<TracedURL> getDirectImportFiles(KermetaProject kp, String kpFileUrl) throws IOException {
		KpVariableExpander varExpander = new KpVariableExpander( kpFileUrl ,kp, compiler.fileSystemConverter, logger);
		// Note that source is relative to the kp file not the jvm current dir
		List<ImportFile> srcs = new ArrayList<ImportFile>();
		for(org.kermeta.kp.Metamodel kpMm : kp.getMetamodels()){
			srcs.addAll(kpMm.getImportedFiles());
		}
		logger.debug("getmetamodels.size="+kp.getMetamodels().size()+" gives srcs.size="+srcs.size(), getMessageGroup());
		ArrayList<TracedURL> kpSources = new ArrayList<TracedURL>();
		for (ImportFile src : srcs) {
			String currentUrl=null;
			try{
				String sourceURLWithVariable = src.getUrl();
				sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default set to emptyString rather than null
				String sourceURL = varExpander.expandVariables(sourceURLWithVariable);
				currentUrl = sourceURL;
				kpSources.add(new TracedURL(src, FileHelpers.StringToURL(sourceURL)));
				logger.debug("     FileHelpers.StringToURL(sourceURL) : " + FileHelpers.StringToURL(sourceURL), getMessageGroup());
			}
			catch(IOException e){
				logger.logProblem(MessagingSystem.Kind.UserERROR, "Cannot load source "+currentUrl+ " "+e.getMessage(), 
						getMessageGroup(), KpResourceHelper.createFileReference(src));
				compiler.hasFailed = true; // notify that something has gone wrong
				if(compiler.errorMessage.isEmpty()) compiler.errorMessage = "Cannot load source "+currentUrl+ " "+e.getMessage(); // store first error
			}
		}
		return kpSources;
	}
	
	/**
	 * returns the ImportFiles that are imported through the importProjectSources
	 * @param kp
	 * @param kpFileUrl
	 * @return
	 * @throws IOException
	 */
	public ArrayList<TracedURL> getResolvedImportProjectSources(KermetaProject kp, String kpFileUrl) throws IOException {
			
		ArrayList<TracedURL> kpSourceFiles = new ArrayList<TracedURL>();
		for(KermetaProject importedSourceProject : KermetaProjectHelper.collectKermetaProjectFromImportProjectSources(kp)){
			// get importfiles from this refered project			
			kpSourceFiles.addAll(getDirectImportFiles(importedSourceProject, importedSourceProject.eResource().getURI().toString()));
			
			// recursively get resolved imporProjectsources
			kpSourceFiles.addAll(getResolvedImportProjectSources(importedSourceProject, importedSourceProject.eResource().getURI().toString()));
		}
		
		return kpSourceFiles;
	}
	
	
	/**
	 * Get all sources for the given project including dependencies (ie. ImportProjectJar and ImportProjectSources) and indirectly loaded sources
	 * Ie. everything that need to go in the merge process
	 * @param kp
	 * @param kpFileUrl
	 * @return
	 * @throws IOException
	 */
	public ArrayList<TracedURL> getSources4Merge(KermetaProject kp, String kpFileUrl) throws IOException {
		
		// get ImportFiles and indirectly loaded ImportProjectSources
		ArrayList<TracedURL> kpSources = getDirectImportFiles(kp, kpFileUrl); 
		kpSources.addAll(getResolvedImportProjectSources(kp, kpFileUrl));
		logger.debug("(getSources4Merge) found "+kpSources.size()+" files sources", getMessageGroup());
		KpVariableExpander varExpander = new KpVariableExpander(kp.eResource().getURI().toString(),
				kp, 
				compiler.fileSystemConverter, 
				logger);

		// get ImportProjectJar
		for (ImportProjectJar importedProjectJar : kp.getImportedProjectJars()) {
			String containerUrl = varExpander.expandVariables(importedProjectJar.getUrl());
			KermetaProject foundProject = KpResourceHelper.findKermetaProject(containerUrl.endsWith(".jar")? "jar:"+containerUrl+"!"+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_JAR : containerUrl+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_FOLDER,
					kp.eResource());
			if(foundProject != null){
				if(containerUrl.endsWith(".jar")){

					kpSources.add(new TracedURL(importedProjectJar, FileHelpers.StringToURL("jar:"+containerUrl+"!"+KermetaCompiler.DEFAULT_ALL_IMPORTFILE_RESULT_LOCATION_IN_JAR)));
				}
				else{
					kpSources.add(new TracedURL(importedProjectJar, FileHelpers.StringToURL(containerUrl+KermetaCompiler.DEFAULT_ALL_IMPORTFILE_RESULT_LOCATION_IN_ECLIPSE)));
				}
			}
		}
		
		return kpSources;
	}

	
	

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, String kpFileURL, KpVariableExpander varExpander, HashMap<URL, ModelingUnit> dirtyMU) throws IOException {
		ArrayList<TracedURL> kpSources = getSources4Merge(kp,kpFileURL);
		return getSourceModelingUnits(kp, kpSources, kp.getEclipseName(), dirtyMU);
	}

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, String kpFileURL, KpVariableExpander varExpander) throws IOException {
		return getSourceModelingUnits(kp, kpFileURL, varExpander, new HashMap<URL, ModelingUnit>());
	}
	
	/**
	 * returns the collection of ModelingUnit corresponding to the kpSources
	 * @param kp
	 * @param kpSources
	 * @param projectName
	 * @param dirtyMU
	 * @return
	 */
	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, ArrayList<TracedURL> kpSources, String projectName, HashMap<URL, ModelingUnit> dirtyMU) {
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();

		
		// try to load similar compatible files in parallel
		logger.initProgress(compiler.getMainProgressGroup()+".getSourceModelingUnits", "Loading "+kpSources.size()+" sources...", getMessageGroup(), 3);
		ArrayList<TracedURL> ecoreURLs = new ArrayList<TracedURL>();
		ArrayList<TracedURL> normalLoadURLs = new ArrayList<TracedURL>();
	
		ArrayList<TracedURL> umlProfilesURLs = new ArrayList<TracedURL>();
		
		for (TracedURL oneURL : kpSources) {
			if (dirtyMU.get(oneURL) != null) {
				modelingUnits.add(dirtyMU.get(oneURL));
			} else {
				if(oneURL.getUrl().getFile().endsWith(".ecore")){
					ecoreURLs.add(oneURL);
				}
				else if (oneURL.getUrl().getFile().endsWith(".profile.uml")){
					umlProfilesURLs.add(oneURL);
				}
				else{
					normalLoadURLs.add(oneURL);
				}
			}
		}
		
		
		// launch uml profile threads
		ArrayList<Future<Collection<ModelingUnit>>> umlprofileFutures = new ArrayList<Future<Collection<ModelingUnit>>>();
		for (TracedURL umlprofileURL : umlProfilesURLs) {
			umlprofileFutures.add(compiler.getSingleThreadExector().submit(new CallableModelingUnitLoader(umlprofileURL, compiler, kp, projectName)));
		}
		// join
		for(Future<Collection<ModelingUnit>> future : umlprofileFutures){
			try {
				Collection<ModelingUnit> mus = future.get();
				//ModelingUnit mu = future.get();
				//if(mu!= null) modelingUnits.add(mu); // no need to log, this has been already done by the thread
				if (mus!=null) {
					for (ModelingUnit mu : mus) {
						modelingUnits.add(mu);
					}
				}
			} catch (InterruptedException e) {
				logger.error("Load of an UML Profile interrupted", getMessageGroup(), e);
			} catch (ExecutionException e) {
				logger.error("Load of an UML Profile failed "+ e, getMessageGroup(), e);
			}
		}
		logger.progress(compiler.getMainProgressGroup()+".getSourceModelingUnits", "All "+umlProfilesURLs.size()+" UML profile loaded.", getMessageGroup(), 1);

				
		
		// launch ecore threads
		ArrayList<Future<Collection<ModelingUnit>>> ecoreFutures = new ArrayList<Future<Collection<ModelingUnit>>>();
		for(TracedURL ecoreURL : ecoreURLs){
			// TODO EMF isn't thread safe, cannot even run the same transfo in parallel ! => singleThreadExecutor
			ecoreFutures.add(compiler.getSingleThreadExector().submit(new CallableModelingUnitLoader(ecoreURL, compiler, kp, projectName)));
		}
		// join
		for(Future<Collection<ModelingUnit>> future : ecoreFutures){
			try {
				Collection<ModelingUnit> mus = future.get();
				if (mus!=null) {
					for (ModelingUnit mu : mus) {
						modelingUnits.add(mu);
					}
				}
				/*ModelingUnit mu = future.get();
				if(mu!= null) modelingUnits.add(mu); // no need to log, this has been already done by the thread*/
			} catch (InterruptedException e) {
				logger.error("Load of an Ecore ModelingUnit interrupted", getMessageGroup(), e);
			} catch (ExecutionException e) {
				logger.error("Load of a ModelingUnit failed "+ e, getMessageGroup(), e);
			}
		}
		logger.progress(compiler.getMainProgressGroup()+".getSourceModelingUnits", "All "+ecoreURLs.size()+" ecore loaded", getMessageGroup(), 1);
		
		
		// prepare the factory to be directly the one that will use our result (will save a few ms)
		if (compiler.runInEclipse) {
			new KmBinaryMergerImpl4Eclipse();
		} else {
			new KmBinaryMergerImpl();
		}
		// launch normalLoad threads
		ArrayList<Future<Collection<ModelingUnit>>> normalLoadFutures = new ArrayList<Future<Collection<ModelingUnit>>>();
		for(TracedURL normalLoadURL : normalLoadURLs){
			normalLoadFutures.add(compiler.getThreadExector().submit(new CallableModelingUnitLoader(normalLoadURL, compiler, kp, projectName)));
		}
		// join
		for(Future<Collection<ModelingUnit>> future : normalLoadFutures){
			try {
				Collection<ModelingUnit> mus = future.get();
				if (mus!=null) {
					for (ModelingUnit mu : mus) {
						modelingUnits.add(mu);
					}
				}
				/*ModelingUnit mu = future.get();
				if(mu!= null) modelingUnits.add(mu); // no need to log, this has been already done by the thread*/
			} catch (InterruptedException e) {
				logger.error("Load of a ModelingUnit interrupted", getMessageGroup(), e);
			} catch (ExecutionException e) {
				logger.error("Load of a ModelingUnit failed "+ e, getMessageGroup(), e);
			}
		}
		logger.doneProgress(compiler.getMainProgressGroup()+".getSourceModelingUnits", "All "+kpSources.size()+" sources loaded.", getMessageGroup());

		
		
		return modelingUnits;
	}
	
	
	public List<PackageEquivalence> collectAllPackageEquivalences(KermetaProject kp){
		List<PackageEquivalence> result = new ArrayList<PackageEquivalence>();
		
		try {
			for(TracedURL tracedUrl : getSources4Merge(kp, kp.eResource().getURI().toString())){
				if(tracedUrl.getSource() instanceof ImportFile){
					result.addAll(((ImportFile)tracedUrl.getSource()).getPackageEquivalences());
				}
			}
		} catch (IOException e) {
			logger.error("pb while collectAllPackageEquivalences" +e, getMessageGroup(), e);
		}
		return result;
	}
	
	
	public String getMessageGroup(){
		return KermetaCompiler.LOG_MESSAGE_GROUP;
	}

}
