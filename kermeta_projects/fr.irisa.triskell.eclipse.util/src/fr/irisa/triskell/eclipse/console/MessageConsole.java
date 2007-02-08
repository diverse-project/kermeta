package fr.irisa.triskell.eclipse.console;

//import org.eclipse.ui.console.MessageConsole;

public class MessageConsole extends IOConsole {

	public MessageConsole(String name) {
		super();
		console = new org.eclipse.ui.console.MessageConsole(name, null);
		initialize();
	}
	
}
