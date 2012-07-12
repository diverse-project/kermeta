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

import org.eclipse.emf.common.util.URI;
import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Source;
import org.kermeta.kp.compiler.commandline.callable.CallableModelingUnitLoader;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl4Eclipse;
import org.kermeta.language.structure.ModelingUnit;
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
				
				boolean isDependency = sourceUrl.getSource() instanceof Dependency;
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
				if(!sourceUrl.getUrl().equals(lastModified.getUrl())){
					result.add(sourceUrl);
				}
			}
		}
		return result;
	}
	public ArrayList<TracedURL> getDirectSources(String kpString) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		KermetaProject kp = ldr.loadKp(kpString);
		if (kp != null) {
			return getDirectSources(kp, kpString, new KpVariableExpander(kpString, kp,compiler.fileSystemConverter, logger));
		} else {
			return new ArrayList<TracedURL>();
		}
	}
	public ArrayList<TracedURL> getSources(String kpString) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		KermetaProject kp = ldr.loadKp(kpString);
		if (kp != null) {
			return getSources(kp, kpString, new KpVariableExpander(kpString, kp,compiler.fileSystemConverter, logger));
		} else {
			return new ArrayList<TracedURL>();
		}
	}
	
	public ArrayList<TracedURL> getDirectSources(KermetaProject kp, String kpFileUrl, KpVariableExpander varExpander) throws IOException {
		// Note that source is relative to the kp file not the jvm current dir
		List<Source> srcs = kp.getSources();
		ArrayList<TracedURL> kpSources = new ArrayList<TracedURL>();
		for (Source src : srcs) {
			String currentUrl=null;
			try{
				String sourceURLWithVariable = src.getUrl();
				sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default set to emptyString rather than null
				String sourceURL = varExpander.expandSourceVariables(sourceURLWithVariable);
				if (sourceURLWithVariable.contains("${")) {
					// deal with variable expansion
					logger.debug("sourceURL : " + sourceURLWithVariable + " (expanded to : " + sourceURL + ")", getMessageGroup());
				} else {
					logger.debug("sourceURL : " + sourceURLWithVariable, getMessageGroup());
				}
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
	 * Get all sources for the given project including dependencies
	 * @param kp
	 * @param kpFileUrl
	 * @param varExpander
	 * @return
	 * @throws IOException
	 */
	public ArrayList<TracedURL> getSources(KermetaProject kp, String kpFileUrl, KpVariableExpander varExpander) throws IOException {
		KpLoaderImpl ldr = new KpLoaderImpl(logger);
		// Note that source is relative to the kp file not the jvm current dir
		List<Source> srcs = kp.getSources();
		ArrayList<TracedURL> kpSources = getDirectSources(kp, kpFileUrl, varExpander);

		// get km from dependencies
		List<Dependency> dependencies = kp.getDependencies();
		for (Dependency dep : dependencies) {
			// ignore dependencies that are meant to be used in a require or as bytcode only
			if(!(dep.isSourceOnly() || dep.isByteCodeOnly())){
				
				String baseUriForDependency = varExpander.expandSourceVariables("${"+dep.getName()+KpVariableExpander.BASEURI_VARIABLE+"}");
				boolean isDirectory = false;
				try{
					URI depURI = URI.createURI(baseUriForDependency+"/");
					if((depURI.isPlatformResource() && depURI.fileExtension() == null) || (depURI.isPlatformResource() && ! depURI.fileExtension().equals("jar"))){
						isDirectory = true;
					}
				}catch( Exception e){
					logger.error(e.toString()+ " on " +baseUriForDependency, getMessageGroup(),e);
					compiler.hasFailed = true; // notify that something has gone wrong
					if(compiler.errorMessage.isEmpty()) compiler.errorMessage = e.getMessage(); // store first error
				}
				
				
				URI	dependencyKPURI = URI.createURI(baseUriForDependency+KermetaCompiler.DEFAULT_KP_LOCATION_IN_JAR);
				logger.debug("loading dependency kp : "+dependencyKPURI.toString(), getMessageGroup());
				ldr = new KpLoaderImpl(logger);				
				KermetaProject dependencyKP = ldr.loadKp(dependencyKPURI);
				
				if (dependencyKP == null) {
					if(findSourceUsingDependency(kp,dep) != null){
						logger.debug("\tdependency used at least for one require", getMessageGroup());
					}
					else if(!dep.isByteCodeOnly()){
						logger.logProblem(MessagingSystem.Kind.UserWARNING, "dependency neither contains a kp file nor is used in a require. If you use it as a binary classpath complement only, please add the byteCodeOnly modifier. ", 
								getMessageGroup(), KpResourceHelper.createFileReference(dep));
					}
				} else {
					String dependencyMergedKMUrl;
					if(isDirectory && compiler.runInEclipse){
						dependencyMergedKMUrl = baseUriForDependency + KermetaCompiler.DEFAULT_BINARY_LOCATION_IN_ECLIPSE +KermetaCompiler.DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
						
					} else {
						dependencyMergedKMUrl = baseUriForDependency + KermetaCompiler.DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/" + dependencyKP.getName() + ".km";
					}
					kpSources.add(new TracedURL(dep, FileHelpers.StringToURL(dependencyMergedKMUrl)));
				}
				
			}
		}
		return kpSources;
	}
	
	// TODO move to a kp helper project/class
	protected Source findSourceUsingDependency(KermetaProject kp, Dependency dep){
		List<Source> srcs = kp.getSources();		
		for (Source src : srcs) {
			if(src.getUrl().contains("${"+dep.getName()+KpVariableExpander.BASEURI_VARIABLE+"}")){
				return src;
			}
		}
		return null;
	}
	
	

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp, String kpFileURL, KpVariableExpander varExpander, HashMap<URL, ModelingUnit> dirtyMU) throws IOException {
		ArrayList<TracedURL> kpSources = getSources(kp,kpFileURL, varExpander);
		return getSourceModelingUnits(kp, kpSources, kp.getName(), dirtyMU);
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
	
	public String getMessageGroup(){
		return KermetaCompiler.LOG_MESSAGE_GROUP;
	}

}
