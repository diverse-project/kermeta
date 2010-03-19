/* $Id: CreateGenericVisitor.java,v 1.11 2008-06-11 08:45:50 cfaucher Exp $
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


/**
 * @author franck
 *
 * this Programs generates a visitor (in java) for an ecore model
 */
public class CreateGenericVisitor {
	
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
		result = result.replaceAll("XclassNameX", className + "Visitor");
		result = result.replaceAll("XpackageNameX", packagename);
		
		String methods = "";
		// add a method per concrete class
		TreeIterator<EObject> it = resource.getAllContents();
		while(it.hasNext()) {
			EObject o = it.next();
			if (o instanceof EClass) {
				EClass c = (EClass)o;
				if (!c.isAbstract()) {
					String myOp = getvisitMethodTemplate();
					myOp = myOp.replaceAll("XtypeNameX", getQualifiedName(c));
					methods += myOp + '\n';
				}
			}
		}
		result = result.replaceAll("XvisitMethodsX", methods);
		
		String outfile = new File(outdir).getAbsolutePath() + "/" +className + "Visitor" + ".java";
		
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
	
	protected static String getvisitMethodTemplate() {
		if (visitMethodTemplate == null) {
			visitMethodTemplate = "	public Object visit(fr.irisa.triskell.XtypeNameX node) {\n";
			visitMethodTemplate += "	return genericVisitChildren(node);\n";
			visitMethodTemplate += "	}\n";
		}
		return visitMethodTemplate;
	}
	
	protected static String classTemplate;
	protected static String getClassTemplate() {
		if (classTemplate == null) {
			classTemplate += "//$Id:"+
								   "$\n";
			classTemplate = "/*\n";
			classTemplate += " * This code has been generated to visit a kermeta model\n";
			classTemplate += " * Creation date: " + new java.util.Date().toString() + "\n" ;
			classTemplate += " * Template Created on feb. 2005\n";
			classTemplate += " * By Franck FLEUREY (ffleurey@irisa.fr)\n";
			classTemplate += " * IRISA / INRIA / University of rennes 1\n";
			classTemplate += " * Distributed under the terms of the EPL license\n";
			classTemplate += " */\n";
			classTemplate += "package XpackageNameX;\n";
			classTemplate += "\n";
			classTemplate += "import java.lang.reflect.*;\n";
			classTemplate += "import java.util.Iterator;\n";
			classTemplate += "import org.eclipse.emf.ecore.EObject;\n";
			classTemplate += "import fr.irisa.triskell.kermeta.error.KermetaVisitorError;\n";
			classTemplate += "import org.slf4j.Logger;\n";
			classTemplate += "import org.slf4j.LoggerFactory;\n";
			classTemplate += "\n";
			classTemplate += "/**\n";
			classTemplate += " * @author Franck Fleurey\n";
			classTemplate += " * IRISA / INRIA / University of rennes 1\n";
			classTemplate += " * Distributed under the terms of the EPL license\n";
			classTemplate += " */\n";
			classTemplate += "public class XclassNameX {\n";
			classTemplate += "\n";
			classTemplate += "	final static public Logger internalLog = LoggerFactory.getLogger(\"KMT.model\");\n";
			classTemplate +="			// This is a generic visit method.\n";
			classTemplate +="			public Object genericVisitChildren(EObject node) {\n";
			classTemplate +="				Object result = null;\n";
			classTemplate +="				Iterator<EObject> children = node.eContents().iterator();\n";
			classTemplate +="				while (children.hasNext()) {\n";
			classTemplate +="					EObject child = children.next();\n";
			classTemplate +="					accept(child);\n";
			classTemplate +="				}\n";
			classTemplate +="				return result;\n";
			classTemplate +="			}\n";
			classTemplate +="			\n";
			classTemplate +="			public Object accept(EObject node) {\n";
			classTemplate +="				Object result = null;\n";
			classTemplate +="				String cname=\"\";\n";
			classTemplate +="				String methodName=\"\";\n";
			classTemplate +="				try {\n";
			classTemplate +="					Class<?>[] ptypes = new Class[1];\n";
			classTemplate +="					cname = node.getClass().getName();\n";
			classTemplate +="					cname = cname.substring(0, cname.length()-4).replaceAll(\".impl\", \"\");\n";
			classTemplate +="					ptypes[0] = Class.forName(cname);\n";
			classTemplate +="					Method m = this.getClass().getMethod(\"visit\", ptypes);\n";
			classTemplate +="					methodName = m.getName();\n";
			classTemplate +="					Object[] params = new Object[1];\n";
			classTemplate +="					params[0] = node;\n";
			classTemplate +="					result = m.invoke(this, params);\n";
			classTemplate +="				}\n";
			classTemplate +="				catch (Exception e) {\n";
			classTemplate +="					if (e instanceof InvocationTargetException && ((InvocationTargetException)e).getTargetException() instanceof Error) throw (Error)((InvocationTargetException)e).getTargetException();\n";
			classTemplate +="					Throwable cause = e.getCause();\n";
			classTemplate +="					String message = \"Kermeta visitor \" + this.getClass().getName() +  \", error accepting a \" + cname + \" : \" + e.getMessage();\n";
			classTemplate +="		    		if (cause != null)				   \n";    
			classTemplate +="		        		if (cause.getClass().getName().compareTo(\"fr.irisa.triskell.kermeta.error.KermetaVisitorError\")==0)\n";
			classTemplate +="			    		{\n";
			classTemplate +="		            		internalLog.error(message, e);\n";					       
			classTemplate +="		            		// this Exception was due to a KermetaVisitorError create a new one with the precedent content\n";
			classTemplate +="		            		throw new KermetaVisitorError(message, cause.getCause());\n";
			classTemplate +="		        		}\n";
			classTemplate +="		        		else\n";
			classTemplate +="		        		{\n";
			classTemplate +="							internalLog.error(message, e);\n";
			classTemplate +="							throw	new KermetaVisitorError(e.getClass().getName() + \" invoking \"+ methodName + \" on Class \" +cname  ,e);\n";
			classTemplate +="						}\n";
			classTemplate +="		        	else\n";
			classTemplate +="		        	{\n";
			classTemplate +="						internalLog.error(message, e);\n";
			classTemplate +="						throw	new KermetaVisitorError(e.getClass().getName() + \" invoking \"+ methodName + \" on Class \" +cname  ,e);\n";
			classTemplate +="					}\n";
			classTemplate +="				}\n";
			classTemplate +="				return result;\n";
			classTemplate +="			}\n";
			classTemplate += "\n";	
			classTemplate += "XvisitMethodsX\n";	
			classTemplate += "\n";	
			classTemplate += "}\n";	
		}
		return classTemplate;
	}
}
