package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedReader;
import java.io.PrintStream;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class KInterpreter extends AbstractKInterpreter {

	public KInterpreter(KermetaUnit program, BufferedReader inputReader, PrintStream outputWriter, PrintStream errorWriter) {
		super(program, inputReader, outputWriter, errorWriter );
	}

	@Override
	protected ExpressionInterpreter createBasicInterpreter() {
		return new ExpressionInterpreter(_memory);
	}
}
