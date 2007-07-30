/*
 * Created on 1 déc. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.irisa.triskell.kermeta.ocl.kmtactions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.interpreter.ExpressionCallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

/**
 * @author franck
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Run {

	public static void main(String[] args) throws Exception{
		
		KermetaUnit std = IOPlugin.getDefault().getFramework();
		KermetaInterpreter i = new KermetaInterpreter(std);
		ExpressionInterpreter exp_interpreter = new ExpressionInterpreter(i.getMemory());
		
		KermetaTypeChecker typechecker = new KermetaTypeChecker(std);
		typechecker.checkUnit();

		DynamicExpressionUnit unit = new DynamicExpressionUnit(std);
		ClassDefinition v = (ClassDefinition)std.getTypeDefinitionByQualifiedName("kermeta::standard::Void");
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
			
				if (!unit.isErrored()) unit.typeCheck(null);
			    if (unit.isErrored()) {
			       System.err.println("ERROR " + KermetaUnitHelper.getAllMessagesAsString(std));
			      
			    }
		    else {
			    RuntimeObject res = f.eval(exp_interpreter);
			    System.out.println(" > " + res.toString());
		    }
		}
	}
}
