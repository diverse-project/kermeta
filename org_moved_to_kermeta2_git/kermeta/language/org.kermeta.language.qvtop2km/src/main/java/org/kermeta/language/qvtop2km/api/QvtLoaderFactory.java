package org.kermeta.language.qvtop2km.api;

import org.kermeta.kp.compiler.commandline.ModelingUnitLoader;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactory;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class QvtLoaderFactory implements ModelingUnitLoaderFactory {

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem arg0,
			Boolean arg1) {
		return new QvtLoader(arg0, arg1);
	}

	@Override
	public ModelingUnitLoader createModelingUnitLoader(MessagingSystem arg0,
			Boolean arg1, Boolean arg2, String arg3) {
		return new QvtLoader(arg0, arg1, arg2, arg3);
	}

}
