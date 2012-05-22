package org.kermeta.kp.compiler.commandline;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public interface ModelingUnitLoaderFactory {
	
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger, Boolean runInEclipse);
	
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger, Boolean runInEclipse, Boolean saveIntermediateFiles, String targetIntermediateFolder);

}
