/* $Id: ExternJavaClassGenerator.java,v 1.17 2008-01-02 10:28:17 vmahe Exp $
 * Project : Kermeta (First iteration)
 * File : ExternJavaClassGenerator.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 17, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 * Description :
 * 	Generate the external java wrapper for a given kermeta model that makes extern calls
 *  to a system class (the basic classes of kermeta that are implemented in Java) 
 * History :
 * 	- Method modified to handle the generation of only
 * 
*/
package fr.irisa.triskell.kermeta.dev.framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class ExternJavaClassGenerator extends KermetaVisitor {

	private KermetaUnit unit;
	
	protected IOPlugin ioPlugin = null;
	
	private void initialize() {
		IOPlugin.LOCAL_USE = true;
		ioPlugin = IOPlugin.getDefault();
	}
	
	public String out_dir = "src/java";
	
	/**
	 * 
	 */
	public ExternJavaClassGenerator() {
		super();
	}
	
	public void loadmodel() throws KermetaIOFileNotFoundException, URIMalformedException {
		loadmodelfromfile( IOPlugin.FRAMEWORK_KM_URI );
	}
	
	public void loadmodelfromfile(String fileName) throws KermetaIOFileNotFoundException, URIMalformedException {
		unit = IOPlugin.getDefault().getKermetaUnit(fileName);
//	    unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(kmt_filename);
		unit.load();
		if ( unit.isIndirectlyErroneous() ) {
			System.out.println( KermetaUnitHelper.getErrors(unit).size() + " Load error : " + KermetaUnitHelper.getErrorsAsString(unit));
		}
		
		accept( unit.getModelingUnit() );
		
		for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits( unit ) )
			accept( importedUnit.getModelingUnit() );
		
		Enumeration<String> e = classes.keys();
		while(e.hasMoreElements()) {
			/*String code =*/ generateclass((String)e.nextElement());
			//	System.out.println(code);
		}
	}
	
	public String generateclass(String qname) {
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		String pname = qname.substring(0, qname.lastIndexOf('.'));
		String cname = qname.substring(qname.lastIndexOf('.') + 1);
		System.out.println("Generate class : " + qname);
		
		String result = getCTemplate();
		result = result.replaceAll("CLASSNAME", cname);
		result = result.replaceAll("PACKAGENAME", pname);
		String methods = "";
		ArrayList<JavaStaticCall> mths = (ArrayList<JavaStaticCall>)classes.get(qname);
		for(int i=0; i<mths.size(); i++) {
			JavaStaticCall node = (JavaStaticCall)mths.get(i);
			String method = getMTemplate();
			method = method.replaceAll("METHODNAME", node.getJmethod());
			String params = "";
			for(int k=0; k<node.getParameters().size(); k++) {
				params += ", KermetaObject param"+k;
			}
			method = method.replaceAll("MPARAMS", params);
			method = method.replaceAll("EXTERNCALL", pp.accept(node).toString());
			methods += method;
		}
		result = result.replaceAll("METHODS", methods);
		
		File out = new File(out_dir + "/" + pname.replace('.', '/'));
		if (! out.exists() ) out.mkdirs();
		out = new File(out_dir + "/" + pname.replace('.', '/') + "/" + cname + ".java");
		if (!out.exists()) {
			try {
				BufferedWriter w = new BufferedWriter(new FileWriter(out));
				w.write(result);
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		return result;
	}
	
	
	protected Hashtable<String,ArrayList<JavaStaticCall>> classes = new Hashtable<String,ArrayList<JavaStaticCall>>();
	
	
	

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall)
	 */
	public Object visit(JavaStaticCall node) {
		//System.out.println("node : " + node);
		String cname = node.getJclass();
		cname = cname.replaceAll("::", ".");
		ArrayList<JavaStaticCall> listmeth = (ArrayList<JavaStaticCall>)classes.get(cname);
		if (listmeth == null) {
			listmeth = new ArrayList<JavaStaticCall>();
			classes.put(cname, listmeth);
		}
		listmeth.add(node);
		return null;
	}
	
	public static String class_template = null;
	public static String create_template = null;
	public static String method_template = null;
	
	public static String getCTemplate() {
		if (class_template == null) {
			class_template  = "/* Implementation of Kermeta base type CLASSNAME */\n\n";
			class_template += "package PACKAGENAME;\n\nimport fr.irisa.triskell.kermeta.runtime.KermetaObject;\n\n";
			class_template += "public class CLASSNAME {\n";
			class_template += "\n";
			class_template += "METHODS";
			class_template += "\n";
			class_template += "}\n";
			class_template += "/* END OF FILE */\n";
		}
		return class_template;
	}
	
	public static String getCreateTemplate() {
		if (create_template == null) {
			create_template  = "/* Implementation of Kermeta base type CLASSNAME */\n\n";
			create_template += "package fr.irisa.triskell.kermeta.runtime.factory;\n\nimport fr.irisa.triskell.kermeta.runtime.KermetaObject;\n\n";
			create_template += "public class CLASSNAMECreationCommand extends CreationCommand {\n";
			create_template += "\n";
			create_template += "\tpublic void execute(KermetaObject object) {\n";
			create_template += "\t\t// TODO Auto-generated method stub\n";
			create_template += "\t}\n\n";
			create_template += "}\n";
			create_template += "/* END OF FILE */\n";
		}
		return create_template;
	}
	
	public static String getMTemplate() {
		if (method_template == null) {
			method_template  = "\t// Implementation of method METHODNAME called as :\n";
			method_template += "\t// EXTERNCALL\n";
			method_template += "\tpublic static KermetaObject METHODNAME(KermetaObject selfMPARAMS) {\n";
			method_template += "\t\t// TODO : implement that\n";
			method_template += "\t\treturn null;\n";
			method_template += "\t}\n\n";
		}
		return method_template;
	}
	
	/**
	 * 
	 * @param args if no args are given, all kermeta wrapped classes are regenerated. Otherwise
	 * we assume that the first args is a kermeta file, and we only generate its classes. 
	 */
	public static void main(String[] args) {
		ExternJavaClassGenerator g = new ExternJavaClassGenerator();
		g.initialize();
	    
	    try {
	    	if (args.length == 0)
	    		g.loadmodel();
	    	else
	        	g.loadmodelfromfile(args[0]);
		} catch (KermetaIOFileNotFoundException e) {
		    System.err.println("'"+args[0]+"' is not a valid file name");
		    //e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
