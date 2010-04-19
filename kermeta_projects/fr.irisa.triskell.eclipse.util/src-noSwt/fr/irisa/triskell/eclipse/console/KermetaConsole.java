

/*$Id: KermetaConsole.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	KermetaConsole.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 nov. 07
* Authors : paco
*/

package fr.irisa.triskell.eclipse.console;
/*
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.IOConsole;*/

public class KermetaConsole /*extends IOConsole*/ {

    public KermetaConsole(String name, String consoleType/*, ImageDescriptor imageDescriptor*/, boolean autoLifecycle) {
       // super(name, consoleType, imageDescriptor, autoLifecycle);
    }

    public KermetaConsole(String name, String consoleType/*, ImageDescriptor imageDescriptor*/, String encoding, boolean autoLifecycle) {
       // super(name, consoleType, imageDescriptor, encoding, autoLifecycle);
    }

    public KermetaConsole(String name, String consoleType/*, ImageDescriptor imageDescriptor*/) {
       // super(name, consoleType, imageDescriptor);
    }    

    public KermetaConsole(String name/*, ImageDescriptor imageDescriptor*/) {
        //super(name, imageDescriptor);
    }
	
}


