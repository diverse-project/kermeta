package org.kermeta.kp.compiler.commandline;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class ModelingUnitLoaderFactoryForEcore implements
		ModelingUnitLoaderFactory {

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse) {
		return new ModelingUnitLoaderForEcore(logger, runInEclipse);
	}

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse, Boolean saveIntermediateFiles,
			String targetIntermediateFolder) {
		return new ModelingUnitLoaderForEcore(logger, runInEclipse, saveIntermediateFiles, targetIntermediateFolder);
	}

}
