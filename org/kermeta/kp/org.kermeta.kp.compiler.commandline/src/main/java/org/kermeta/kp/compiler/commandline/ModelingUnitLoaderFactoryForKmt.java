package org.kermeta.kp.compiler.commandline;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class ModelingUnitLoaderFactoryForKmt implements
ModelingUnitLoaderFactory {

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse) {
		return new ModelingUnitLoaderForKmt(logger, runInEclipse);
	}

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem logger,
			Boolean runInEclipse, Boolean saveIntermediateFiles,
			String targetIntermediateFolder) {
		return new ModelingUnitLoaderForKmt(logger, runInEclipse, saveIntermediateFiles, targetIntermediateFolder);
	}

}
