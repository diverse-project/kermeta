package org.kermeta.runner.launching;

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.IProcessFactory;
import org.eclipse.debug.core.model.IProcess;
import org.kermeta.runner.model.KProcess;

public class KProcessFactory implements IProcessFactory {

	public IProcess newProcess(ILaunch launch, Process process, String label, Map attributes) {
		return new KProcess(launch, (KBasicProcess) process, label, attributes);
	}

}
