/* $Id: CreateOptimizedVisitor.java,v 1.11 2008-06-11 08:45:50 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.model
 * File       : CreateGenericVisitor.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 8 janv. 2005
 * Authors : 
 *       Franck Fleurey  <ffleurey@irisa.fr>
 *       Didier Vojtisek <dvojtise@irisa.fr>
 * Description : 
 *       this Programs aims to generate a visitor (in java) for an ecore model
 */

package fr.irisa.triskell.kermeta.dev.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


//import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
//import fr.irisa.triskell.kermeta.language.structure.NamedElement;


/**
 * @author franck
 *
 * this Programs generates a visitor (in java) for an ecore model
 */
public class CreateOptimizedVisitor {
	
	/**
	 * @param args
	 * there should be 3 args :
	 * 1/ the model (.ecore)
	 * 2/ the name of the package to generate in
	 * 3/ output directory
	 * 4/ Class name
	 */
	public static void main(String[] args) {
		
		//String ecorefile = args[0];
		String packagename = args[1];
		String outdir = args[2];		
		String className = args[3];
		
		// load the ecore model
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		ResourceSet resource_set = new ResourceSetImpl();
		Resource resource = resource_set.getResource(URI.createFileURI(args[0]), true);
		
		String result = getClassTemplate();
		
		String cmds = "";
		String initcmds = "";
		
		String methods = "";
		// add a method per concrete class
		TreeIterator<EObject> it = resource.getAllContents();
		while(it.hasNext()) {
			EObject o = it.next();
			if (o instanceof EClass) {
				EClass c = (EClass)o;
				if (!c.isAbstract()) {
					
					String myCmd = getvisitCmdClassTemplate();
					myCmd = myCmd.replaceAll("XNodeTypeNameX", getQualifiedName(c));
					myCmd = myCmd.replaceAll("XNodeClassNameX", c.getName());
					cmds += myCmd;
					
					String myInitCmd = getvisitInitCmdTemplate();
					myInitCmd = myInitCmd.replaceAll("XNodeTypeNameX", getQualifiedName(c));
					myInitCmd = myInitCmd.replaceAll("XNodeClassNameX", c.getName());
					initcmds += myInitCmd;
					
					String myOp = getvisitMethodTemplate();
					myOp = myOp.replaceAll("XNodeTypeNameX", getQualifiedName(c));
					myOp = myOp.replaceAll("XNodeClassNameX", c.getName());
					methods += myOp + '\n';
				}
			}
		}
		result = result.replaceAll("XvisitMethodsX", methods);
		
		result = result.replaceAll("XinitCmdsX", initcmds);
		result = result.replaceAll("XAcceptCommandsX", cmds);
		
		result = result.replaceAll("XclassNameX", className + "OptimizedVisitor");
		result = result.replaceAll("XpackageNameX", packagename);
		
		String outfile = new File(outdir).getAbsolutePath() + "/" +className + "OptimizedVisitor" + ".java";
		
		try {
			FileWriter w = new FileWriter(outfile);
			w.write(result);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String getQualifiedName(ENamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof ENamedElement)
			return getQualifiedName((ENamedElement)element.eContainer()) + "." + element.getName();
		else return element.getName();
	}
	
	protected static String visitMethodTemplate;
	protected static String visitCmdClassTemplate;
	protected static String visitInitCmdTemplate;
	
	protected static String getParentAttributeAccessors() {
		String result =
			" \n  public void setParent(fr.irisa.triskell.kermeta.language.structure.Object parent) {\n";
		result += "    this.parent = parent; }\n";
		result +=
			" \n  public fr.irisa.triskell.kermeta.language.structure.Object getParent() {\n";
		result += "    return parent; }\n";
		return result;
	}
	
	protected static String getvisitMethodTemplate() {
		if (visitMethodTemplate == null) {
			visitMethodTemplate = "	public Object visitXNodeClassNameX(fr.irisa.triskell.XNodeTypeNameX node) {\n";
			visitMethodTemplate += "	return genericVisitChildren(node);\n";
			visitMethodTemplate += "	}\n";
		}
		return visitMethodTemplate;
	}
	
	protected static String getvisitCmdClassTemplate() {
		if (visitCmdClassTemplate == null) {
			visitCmdClassTemplate = "class XNodeClassNameXAcceptCommand extends AcceptCommand {\n";
			visitCmdClassTemplate += "	public Object accept(EObject node, XclassNameX visitor) {\n";
			visitCmdClassTemplate += "		return visitor\n";
			visitCmdClassTemplate += "				.visitXNodeClassNameX((fr.irisa.triskell.XNodeTypeNameX) node);\n";
			visitCmdClassTemplate += "	}\n";
			visitCmdClassTemplate += "}\n";
		}
		return visitCmdClassTemplate;
	}
	
	protected static String getvisitInitCmdTemplate() {
		if (visitInitCmdTemplate == null) {
			visitInitCmdTemplate = "			acceptCmds.put(\"XNodeClassNameX\",\n";
			visitInitCmdTemplate += "					new XNodeClassNameXAcceptCommand());\n";
		}
		return visitInitCmdTemplate;
	}
	
	
	
	protected static String classTemplate;
	protected static String getClassTemplate() {
		if (classTemplate == null) {
			classTemplate = "";
			
			classTemplate += "//$Id:"+
								   "$\n";
			classTemplate += "/*\n";
			classTemplate += " * This code has been generated to visit a kermeta model\n";
			classTemplate += " * Creation date: " + new java.util.Date().toString() + "\n" ;
			classTemplate += " * Template Created on feb. 2005\n";
			classTemplate += " * By Franck FLEUREY (ffleurey@irisa.fr)\n";
			classTemplate += " * IRISA / INRIA / University of rennes 1\n";
			classTemplate += " * Distributed under the terms of the EPL license\n";
			classTemplate += " */\n";
			classTemplate += "package XpackageNameX;\n";

			classTemplate += "import java.util.Hashtable;\n";
			classTemplate += "import java.util.Iterator;\n";
			classTemplate += "import org.eclipse.emf.ecore.EObject;\n";
			classTemplate += "import org.slf4j.Logger;\n";
			classTemplate += "import org.slf4j.LoggerFactory;\n";
			classTemplate += "import fr.irisa.triskell.kermeta.language.structure.NamedElement;\n";
			classTemplate += "import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;\n";

			classTemplate += "public class XclassNameX {\n";

			classTemplate += "  final static public Logger internalLog = LoggerFactory\n";
			classTemplate += "			.getLogger(\"KMT.model\");\n";

			classTemplate += "  /** The parent of the node currently visited. */\n";
			classTemplate += "  protected fr.irisa.triskell.kermeta.language.structure.Object parent;\n";
			classTemplate += "	private static Hashtable<String,AcceptCommand> acceptCmds = null;\n";
			classTemplate += getParentAttributeAccessors();
			classTemplate += "	private static AcceptCommand getAcceptCmd(EObject node) {\n";
			classTemplate += "		if (acceptCmds == null) {\n";
			classTemplate += "			acceptCmds = new Hashtable<String,AcceptCommand>();\n";
			classTemplate += "XinitCmdsX\n";
			classTemplate += "		}\n";
			classTemplate += "		return acceptCmds.get(node.eClass().getName());\n";
			classTemplate += "	}\n";

			classTemplate += "	// This is a generic visit method.\n";
			classTemplate += "	public Object genericVisitChildren(EObject node) {\n";
			classTemplate += "		Object result = null;\n";
			classTemplate += "		Iterator<EObject> children = node.eContents().iterator();\n";
			classTemplate += "		while (children.hasNext()) {\n";
			classTemplate += "			EObject child = children.next();\n";
			classTemplate += "			accept(child);\n";
			classTemplate += "		}\n";
			classTemplate += "		return result;\n";
			classTemplate += "	}\n";

			classTemplate += "	public Object accept(EObject node) {\n";

			classTemplate += "		// Throw an error if the node is null\n";
			classTemplate += "      if (node == null) {\n";
			classTemplate += "          String msg = \"Error in visitor: visited node is null\";\n";
			classTemplate += "          if (parent!=null) {\n";
			classTemplate += "             msg += \"   (when visiting parent\\n    '\" + parent.getClass().getName() + \"'\";\n";
			classTemplate += "             if (parent instanceof NamedElement) \n";
			classTemplate += "                msg += \"\\n    parent's name: '\" + ((NamedElement)parent).getName() + \"')\\n\";\n";
			classTemplate += "             else if (parent instanceof VariableDecl) \n";
			classTemplate += "                msg += \"\\n    parent's name (it's a variable): '\" + ((VariableDecl)parent).getIdentifier() + \"')\\n\";\n          }\n";
			classTemplate += "          throw new Error(msg);\n";
			classTemplate += "		}\n";

			classTemplate += "		// Get the accept command\n";
			classTemplate += "		AcceptCommand cmd = getAcceptCmd(node);\n";

			classTemplate += "		// Throw an error is the command is null\n";
			classTemplate += "		if (cmd == null) {\n";
			classTemplate += "         String msg = \"Error in visitor : no strategy to handle node of type \"\n";
			classTemplate += "                 + node.getClass().getName();\n";
			classTemplate += "         if (parent!=null) {\n";
			classTemplate += "             msg += \"   (when visiting parent '\" + parent.getClass().getName() + \"'\";\n";
			classTemplate += "             if (parent instanceof NamedElement) msg += \" named: '\" + ((NamedElement)parent).getName() + \"')\";\n";
			classTemplate += "             else if (parent instanceof VariableDecl) msg += \" named: '\" + ((VariableDecl)parent).getIdentifier() + \"')\";\n          }\n";
			classTemplate += "         throw new Error(msg);\n";
			classTemplate += "		}\n";

			classTemplate += "		// accept the node\n";
			classTemplate += "		return cmd.accept(node, this);\n";
			classTemplate += "	}\n";

			classTemplate += "	XvisitMethodsX\n";

			classTemplate += "}\n";

			classTemplate += "abstract class AcceptCommand {\n";
			classTemplate += "	public abstract Object accept(EObject node, XclassNameX visitor);\n";
			classTemplate += "}\n";

			classTemplate += "XAcceptCommandsX\n";
			
		}
		return classTemplate;
	}
}
