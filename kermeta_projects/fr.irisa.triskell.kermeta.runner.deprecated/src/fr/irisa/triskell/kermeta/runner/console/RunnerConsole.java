

/*$Id: RunnerConsole.java,v 1.1 2007-11-21 14:13:05 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.runner
* File : 	RunnerConsole.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 nov. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.runner.console;

import org.eclipse.jface.resource.ImageDescriptor;

import fr.irisa.triskell.eclipse.console.KermetaConsole;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;

public class RunnerConsole extends KermetaConsole {

    public RunnerConsole(String name, String consoleType, ImageDescriptor imageDescriptor, boolean autoLifecycle) {
        super(name, consoleType, imageDescriptor, autoLifecycle);
    }

    public RunnerConsole(String name, String consoleType, ImageDescriptor imageDescriptor, String encoding, boolean autoLifecycle) {
        super(name, consoleType, imageDescriptor, encoding, autoLifecycle);
    }

    public RunnerConsole(String name, String consoleType, ImageDescriptor imageDescriptor) {
        super(name, consoleType, imageDescriptor);
    }    

    public RunnerConsole(String name, ImageDescriptor imageDescriptor) {
        super(name, imageDescriptor);
    }
	
	private AbstractKermetaTarget target = null;
	
	public void setTarget(AbstractKermetaTarget target) {
		this.target = target;
	}
	
	public AbstractKermetaTarget getTarget() {
		return target;
	}
	
}


