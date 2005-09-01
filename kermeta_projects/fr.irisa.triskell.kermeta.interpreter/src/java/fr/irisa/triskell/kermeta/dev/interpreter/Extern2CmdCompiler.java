
package fr.irisa.triskell.kermeta.dev.interpreter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.behavior.FJavaStaticCall;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;



/**
 * @author Franck Fleurey
 * This class compiles all the exten calls of the standard
 * library to a command pattern
 */
public class Extern2CmdCompiler extends KermetaOptimizedVisitor {

	
	public static void main(String args[]) {
		
		// load the std lib
		KermetaUnit.STD_LIB_URI = "lib/framework.km";
		Extern2CmdCompiler generator = new Extern2CmdCompiler();
		String code = generator.generate(KermetaUnit.getStdLib());
		
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
	
	protected Hashtable created;
	
	protected String generate(KermetaUnit unit) {
		String result = getFileTemplate();
		commands = ""; initcmds = "";
		created = new Hashtable();
		this.accept(unit.packageLookup("kermeta"));
		result = result.replaceAll("XInitCmdsX", initcmds);
		result = result.replaceAll("XCommandsX", commands);
		return result;
	}
	
	public Object visitFJavaStaticCall(FJavaStaticCall arg0) {
		String cmdID = arg0.getFJclass() + "_" + arg0.getFJmethod() + "_" + arg0.getFParameters().size();
		cmdID = cmdID.replaceAll(":", "_");
		if (created.containsKey(cmdID)) return null;
		created.put(cmdID, cmdID);
		String javaMethod = arg0.getFJclass().replaceAll("::", ".") + "." + arg0.getFJmethod();
		String javaParams = "";
		for(int i=0; i<arg0.getFParameters().size(); i++) {
			javaParams += "params["+i+"]";
			if (i<arg0.getFParameters().size()-1) javaParams +=", ";
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
			fileTemplate  = "package fr.irisa.triskell.kermeta.runtime;\n";
			fileTemplate += "\n";
			fileTemplate += "import java.util.Hashtable;\n";
			fileTemplate += "import fr.irisa.triskell.kermeta.runtime.RuntimeObject;\n";
			fileTemplate += "\n";
			fileTemplate += "public abstract class FrameworkExternCommand {\n";
			fileTemplate += "	private static Hashtable commands = null;\n";
			fileTemplate += "	public static FrameworkExternCommand getCommand(String id) {\n";
			fileTemplate += "		if (commands == null) {\n";
			fileTemplate += "			commands = new Hashtable();\n";
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
