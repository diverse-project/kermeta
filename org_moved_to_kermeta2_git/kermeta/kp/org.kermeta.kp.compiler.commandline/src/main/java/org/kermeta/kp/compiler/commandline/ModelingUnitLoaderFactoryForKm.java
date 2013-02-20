package org.kermeta.kp.compiler.commandline;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class ModelingUnitLoaderFactoryForKm implements
ModelingUnitLoaderFactory {

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse) {
		return new ModelingUnitLoaderForKm(logger, runInEclipse);
	}

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse, Boolean saveIntermediateFiles,
			String targetIntermediateFolder) {
		return new ModelingUnitLoaderForKm(logger, runInEclipse, saveIntermediateFiles, targetIntermediateFolder);
	}

}
