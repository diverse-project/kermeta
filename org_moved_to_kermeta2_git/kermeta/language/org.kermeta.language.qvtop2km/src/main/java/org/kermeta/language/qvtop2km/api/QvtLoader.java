package org.kermeta.language.qvtop2km.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.kermeta.kp.compiler.commandline.ModelingUnitLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class QvtLoader implements ModelingUnitLoader {

	private MessagingSystem logger;
	private Boolean runInEclipse;
	private Boolean saveIntermediateFiles=false;
	private String targetIntermediateFolder;

	public QvtLoader(MessagingSystem logger, Boolean runInEclipse) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
	}
	
	public QvtLoader(MessagingSystem logger, Boolean runInEclipse, Boolean saveIntermediateFiles, String targetIntermediateFolder) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
	}
	
	@Override
	public String getLastLoadErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ModelingUnit> loadModelingUnitFromURL(String uri)
			throws IOException {
		Collection<ModelingUnit> result = new ArrayList<ModelingUnit>();
		
		QvtOp2KM converter;
		if(runInEclipse){
			converter = new QvtOp2KMImpl4Eclipse(); 
		}
		else{
			converter = new QvtOp2KMImpl();
		}
		
		result.add(converter.convert(uri));
		
		return result;	
	}

}
