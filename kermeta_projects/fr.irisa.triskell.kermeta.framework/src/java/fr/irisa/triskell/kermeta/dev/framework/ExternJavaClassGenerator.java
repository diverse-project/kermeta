/*
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.dev.framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.naming.ldap.HasControls;

import fr.irisa.triskell.kermeta.behavior.FJavaStaticCall;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ExternJavaClassGenerator extends KermetaVisitor {

	KermetaUnit unit;
	
	public String out_dir = "src/java";
	
	/**
	 * 
	 */
	public ExternJavaClassGenerator() {
		super();
	}
	
	public void loadmodel() {
		unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("src/kermeta/kermeta.kmt");
		unit.load();
		if (unit.error.size() > 0) {
			System.out.println(unit.error.size() + " Load error : " + ((KMUnitMessage)unit.error.get(0)).getMessage());
		}
		FPackage pkg = (FPackage)unit.packageLookup("kermeta");
		this.accept(pkg);
		Enumeration e = classes.keys();
		while(e.hasMoreElements()) {
			String code = generateclass((String)e.nextElement());
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
		ArrayList mths = (ArrayList)classes.get(qname);
		for(int i=0; i<mths.size(); i++) {
			FJavaStaticCall node = (FJavaStaticCall)mths.get(i);
			String method = getMTemplate();
			method = method.replaceAll("METHODNAME", node.getFJmethod());
			String params = "";
			for(int k=0; k<node.getFParameters().size(); k++) {
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
		
		/*
		String createcode = getCreateTemplate();
		createcode = createcode.replaceAll("CLASSNAME", cname);
		
		out = new File(out_dir + "/fr/irisa/triskell/kermeta/runtime/factory/" + cname + "CreationCommand.java");
		
		if (!out.exists()) {
			try {
				BufferedWriter w = new BufferedWriter(new FileWriter(out));
				w.write(createcode);
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		*/
		return result;
	}
	
	
	protected Hashtable classes = new Hashtable();
	
	
	

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FJavaStaticCall)
	 */
	public Object visit(FJavaStaticCall node) {
		//System.out.println("node : " + node);
		String cname = node.getFJclass();
		cname = cname.replaceAll("::", ".");
		ArrayList listmeth = (ArrayList)classes.get(cname);
		if (listmeth == null) {
			listmeth = new ArrayList();
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
	
	public static void main(String[] args) {
		ExternJavaClassGenerator g = new ExternJavaClassGenerator(); 
		g.loadmodel();
	}
	
	

}
