package org.kermeta.kp.compiler.commandline;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class ModelingUnitLoaderFactoryForUmlProfile implements
ModelingUnitLoaderFactory {

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse) {
		return new ModelingUnitLoaderForUmlProfile(logger, runInEclipse);
	}

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse, Boolean saveIntermediateFiles,
			String targetIntermediateFolder) {
		return new ModelingUnitLoaderForUmlProfile(logger, runInEclipse, saveIntermediateFiles, targetIntermediateFolder);
	}

}
