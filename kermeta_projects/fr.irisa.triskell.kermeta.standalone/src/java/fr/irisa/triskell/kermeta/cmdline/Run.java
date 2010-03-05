/*
 * Created on 1 d�c. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.irisa.triskell.kermeta.cmdline;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.interpreter.ExpressionCallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

/**
 * @author franck
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Run {

	public static void main(String[] args) throws Exception{
		
		Hashtable variables = new Hashtable();

		KermetaUnit.STD_LIB_URI = "lib/framework.km";
		KermetaUnit std = KermetaUnit.getStdLib();
		KermetaInterpreter i = new KermetaInterpreter(std);
		ExpressionInterpreter exp_interpreter = new ExpressionInterpreter(i.getMemory());

		DynamicExpressionUnit unit = new DynamicExpressionUnit(std.packages);
		ClassDefinition v = (ClassDefinition)std.typeDefinitionLookup("kermeta::standard::Void");
	    ExpressionCallFrame f =  new ExpressionCallFrame(exp_interpreter.getInterpreterContext(), unit, i.getMemory().voidINSTANCE);

	
		BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
		String exp;
		
		while ( !(exp = sr.readLine()).equals("quit")) {
			if (exp.equals("")) continue;
			
			//System.out.println("exp = " + exp);
			
			try {
				unit.resetMessages();
				unit.parse(exp, v, new Hashtable());
			}
			catch (Throwable e) {
				System.err.println("Parse error");
				//e.printStackTrace();
				//continue;
			}
			
				if (!unit.messages.hasError()) unit.typeCheck(null);
			    if (unit.messages.hasError()) {
			       System.err.println("ERROR " + unit.messages.getAllMessagesAsString());
			      
			    }
		    else {
			    RuntimeObject res = f.eval(exp_interpreter);
			    System.out.println(" > " + res.toString());
		    }
		}
	}
}
