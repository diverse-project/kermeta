package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class KDebugger extends AbstractKInterpreter {
	
	private int _requestPort;
	
	private int _eventPort;
	
	public KDebugger(KermetaUnit program, BufferedReader inputReader, PrintStream outputWriter, PrintStream errorWriter, int requestPort, int eventPort) {
		super(program, inputReader, outputWriter, errorWriter);
		_requestPort = requestPort;
		_eventPort = eventPort;
	}
	
	@Override
	protected ExpressionInterpreter createBasicInterpreter() {
		try {
			return new DebugInterpreter(_memory, _requestPort, _eventPort);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean isDebugger() {
		return true;
	}
}
