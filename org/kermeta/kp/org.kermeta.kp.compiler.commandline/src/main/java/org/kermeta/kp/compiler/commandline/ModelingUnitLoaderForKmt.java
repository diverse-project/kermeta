package org.kermeta.kp.compiler.commandline;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.URI;
import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import scala.collection.Iterator;

public class ModelingUnitLoaderForKmt implements ModelingUnitLoader{
	MessagingSystem logger;
	Boolean runInEclipse;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	
	
	/** Error message of the last load or empty string if last load was successful */
	public String lastLoadErrorMessage = "";
	
	public ModelingUnitLoaderForKmt(MessagingSystem logger, Boolean runInEclipse) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
	}
	public ModelingUnitLoaderForKmt(MessagingSystem logger, Boolean runInEclipse, Boolean saveIntermediateFiles, String targetIntermediateFolder) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
	}
	
	
	public Collection<ModelingUnit> loadModelingUnitFromURL(String urlString) throws IOException{
		lastLoadErrorMessage = "";
		URI uri =  URI.createURI(URLDecoder.decode(urlString,"UTF-8"));
		ModelingUnit mu = null;
		Collection<ModelingUnit> mus = new ArrayList<ModelingUnit>(); 
		
		if (urlString.endsWith(".kmt")) {
			try {
				// Flush all problems marked on the file
				// done in a more clever way  // logger.flushAllProblems(new URL(urlString));

				mu = this.loadKMT(urlString);
				if(saveIntermediateFiles && mu != null){
					// URI targetIntermediateFolderuri =  URI.createURI(targetIntermediateFolder);
					URI saveKMURI = URI.createFileURI(targetIntermediateFolder+"/kmt2km"+uri.path()+".km");
					new ModelingUnitConverter(true,saveKMURI.toFileString(), logger).saveMu(mu, saveKMURI);
				}
				if (mu != null) {
					mus.add(mu);
				}
			} catch (MalformedURLException e) {
				lastLoadErrorMessage = e.toString();
				this.logger.debug(e.toString(),this.getClass().getName());
				//e.printStackTrace();
			} catch (URISyntaxException e) {
				lastLoadErrorMessage = e.toString();
				this.logger.debug(e.toString(),this.getClass().getName());
				//e.printStackTrace();
			}
		} 
		return mus;
	}
	
	protected ModelingUnit loadKMT(String fileuri) throws URISyntaxException, MalformedURLException  {
		//StructurePackage.eINSTANCE.setEFactoryInstance(StructureFactoryImpl.init());
		//BehaviorPackage.eINSTANCE.setEFactoryInstance(BehaviorFactoryImpl.init());

				
		KMTparser parser = new KMTparser();		
		java.io.File file = new java.io.File(FileHelpers.StringToURI(fileuri));
		Iterator<String> src = scala.io.Source.fromFile( file,
				"UTF8").getLines();

		StringBuffer buf = new StringBuffer();
		while (src.hasNext()) {
			buf.append(src.next() + "\n");
		}


		ModelingUnit mu = parser.load(FileHelpers.StringToURL(fileuri), buf.toString(), logger);
		mu.setName(file.getName());
		return mu;

	}

	@Override
	public String getLastLoadErrorMessage() {
		return lastLoadErrorMessage;
	}
}
