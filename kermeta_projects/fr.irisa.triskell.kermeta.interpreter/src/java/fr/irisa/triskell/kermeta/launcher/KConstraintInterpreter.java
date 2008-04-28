package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedReader;
import java.io.PrintStream;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.interpreter.ConstraintInterpreter;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class KConstraintInterpreter extends AbstractKInterpreter {

	public KConstraintInterpreter(KermetaUnit program, BufferedReader inputReader, PrintStream errorWriter, PrintStream outputWriter) {
		super(program, inputReader, errorWriter, outputWriter);
	}

	@Override
	protected ExpressionInterpreter createBasicInterpreter() {
		return new ConstraintInterpreter(_memory);
	}
}
