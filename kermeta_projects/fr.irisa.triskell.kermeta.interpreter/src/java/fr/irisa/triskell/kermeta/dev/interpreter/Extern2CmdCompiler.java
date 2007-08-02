/** $Id: Extern2CmdCompiler.java,v 1.8 2007-08-02 17:07:59 dvojtise Exp $
 * Project   : kermeta interpreter
 * File      : Extern2CmdCompiler.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors       : 
 *     Franck Fleurey <ffleurey.irisa.fr>
 */
package fr.irisa.triskell.kermeta.dev.interpreter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;



/**
 * @author Franck Fleurey
 * This class compiles all the exten calls of the standard
 * library to a command pattern. This greatly improves the performances
 */
public class Extern2CmdCompiler extends KermetaOptimizedVisitor {

	
	private void initialize() {
		IOPlugin.LOCAL_USE = true;
		// make sure the plugin is loaded
		new IOPlugin();
	}
	
	public static void main(String args[]) {

		Extern2CmdCompiler generator = new Extern2CmdCompiler();
		generator.initialize();
		String code = generator.generate( IOPlugin.getDefault().getFramework() );
		
		try {
			FileWriter w = new FileWriter("src/java/fr/irisa/triskell/kermeta/runtime/FrameworkExternCommand.java");
			w.write(code);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected String commands;
	protected String initcmds;
	
	protected Hashtable<String,String> created;
	
	protected String generate(KermetaUnit unit) {
		String result = getFileTemplate();
		commands = ""; initcmds = "";
		created = new Hashtable<String,String>();
		
		accept( unit.getModelingUnit() );
		for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(unit) )
			accept( importedUnit.getModelingUnit() );
				
		result = result.replaceAll("XInitCmdsX", initcmds);
		result = result.replaceAll("XCommandsX", commands);
		return result;
	}
	
	public Object visitJavaStaticCall(JavaStaticCall arg0) {
		String cmdID = arg0.getJclass() + "_" + arg0.getJmethod() + "_" + arg0.getParameters().size();
		cmdID = cmdID.replaceAll(":", "_");
		if (created.containsKey(cmdID)) return null;
		created.put(cmdID, cmdID);
		String javaMethod = arg0.getJclass().replaceAll("::", ".") + "." + arg0.getJmethod();
		String javaParams = "";
		for(int i=0; i<arg0.getParameters().size(); i++) {
			javaParams += "params["+i+"]";
			if (i<arg0.getParameters().size()-1) javaParams +=", ";
		}
		
		String command = getCmdTemplate();
		command = command.replaceAll("XCmdIDX", cmdID);
		command = command.replaceAll("XJavaMethodX", javaMethod);
		command = command.replaceAll("XJavaParamsX", javaParams);
		
		String initcmd = getInitTemplate();
		initcmd = initcmd.replaceAll("XCmdIDX", cmdID);
		
		commands += command;
		initcmds += initcmd;
		
		return null;
	}
	
	protected String fileTemplate = null;
	protected String cmdTemplate = null;
	protected String initTemplate = null;
	
	protected String getFileTemplate() {
		if (fileTemplate == null) {
			fileTemplate  = "/** $Id: Extern2CmdCompiler.java,v 1.8 2007-08-02 17:07:59 dvojtise Exp $ \n";
			fileTemplate += " * Generated by fr.irisa.triskell.kermeta.dev.interpreter.Extern2CmdCompiler\n";
			fileTemplate += " */\n";
			fileTemplate += "package fr.irisa.triskell.kermeta.runtime;\n";
			fileTemplate += "\n";
			fileTemplate += "import java.util.Hashtable;\n";
			fileTemplate += "import fr.irisa.triskell.kermeta.runtime.RuntimeObject;\n";
			fileTemplate += "\n";
			fileTemplate += "/** \n";
			fileTemplate += " * Command pattern that allows to call directly the methods instead of using java reflexivity for all the framework types\n";
			fileTemplate += " */\n";
			fileTemplate += "public abstract class FrameworkExternCommand {\n";
			fileTemplate += "	private static Hashtable<String,FrameworkExternCommand> commands = null;\n";
			fileTemplate += "	public static FrameworkExternCommand getCommand(String id) {\n";
			fileTemplate += "		if (commands == null) {\n";
			fileTemplate += "			commands = new Hashtable<String,FrameworkExternCommand>();\n";
			fileTemplate += "			XInitCmdsX\n";
			fileTemplate += "		}\n";
			fileTemplate += "		return (FrameworkExternCommand)commands.get(id);\n";
			fileTemplate += "	}\n";
			fileTemplate += "	public abstract RuntimeObject execute(RuntimeObject[] params);\n";
			fileTemplate += "}\n";
			fileTemplate += "XCommandsX";
			
		}
		return fileTemplate;
	}
	
	protected String getCmdTemplate() {
		if (cmdTemplate == null) {
			cmdTemplate  = "\n";
			cmdTemplate += "class XCmdIDXComd extends FrameworkExternCommand {\n";
			cmdTemplate += "	public RuntimeObject execute(RuntimeObject[] params) {\n";
			cmdTemplate += "		return (RuntimeObject)XJavaMethodX(XJavaParamsX);\n";
			cmdTemplate += "	}\n";
			cmdTemplate += "}\n";
		}
		return cmdTemplate;
	}
	
	protected String getInitTemplate() {
		if (initTemplate == null) {
			initTemplate  = "commands.put(\"XCmdIDX\", new XCmdIDXComd());\n";
		}
		return initTemplate;
	}
	
	
}
