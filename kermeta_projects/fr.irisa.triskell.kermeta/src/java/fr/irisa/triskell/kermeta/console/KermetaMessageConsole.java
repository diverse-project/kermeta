package fr.irisa.triskell.kermeta.console;

import org.eclipse.ui.console.MessageConsole;

public class KermetaMessageConsole extends KermetaIOConsole {

	public KermetaMessageConsole(String name) {
		super();
		console = new MessageConsole(name, null);
		initialize();
	}
	
}
