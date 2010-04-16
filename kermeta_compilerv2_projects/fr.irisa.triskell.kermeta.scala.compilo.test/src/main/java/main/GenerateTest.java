package main;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

public class GenerateTest {
 
	
	private String folderName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Look for templates in CLASSPATH as resources
		new GenerateTest().process();
		
	}
	
	void listFiles(File folderTest, List<String> files) {
		for (File f : folderTest.listFiles(new FileFilter() {

			public boolean accept(File arg0) {
				return (!arg0.isDirectory()) && arg0.getName().endsWith(".km");
			}

		})) {
			files.add((folderName + f.getName()).replace("src/test/resources/", ""));
		}

		for (File f : folderTest.listFiles(new FileFilter() {

			public boolean accept(File arg0) {
				return arg0.isDirectory();
			}

		})) {
			String lastfolderName = folderName;
			folderName = folderName + f.getName() + "/";
			this.listFiles(f, files);
			folderName = lastfolderName;

		}

	}

	void process(){
		List<String> files = new ArrayList<String>();
		folderName = "src/test/resources/";
		File folderTest = new File(folderName);

		this.listFiles(folderTest, files);
		
		

		
		

		for (String s : files){		

			String testRep = s.substring(0,s.lastIndexOf("/"));
			String testname =   s.substring(s.lastIndexOf("/")+1, s.length()-3);
			StringTemplateGroup group = new StringTemplateGroup("tests");
//			StringTemplate st = group.getInstanceOf("group/templates/TestCompiloCases");
			StringBuilder output = new StringBuilder();
			output.append("package fr.irisa.triskell.scala.compilo.test;\n import org.junit.Test;\n	public class " +testRep.replace("/", "_") + testname.replace(".", "") + " extends TestCompiloCases{\n");

			
			//System.err.println(testRep);
			//System.err.println(testname);
			StringTemplate test = group.getInstanceOf("group/templates/Tests");
			
			output.append("\t");

			test.setAttribute("testname", testname);
			test.setAttribute("testnametest", testRep.replace("/", "_") + testname.replace(".", ""));
			test.setAttribute("testRep", testRep);			
			output.append(test.toString());
			output.append("\n");
			File f = new File("src/test/java/fr/irisa/triskell/scala/compilo/test/"+ testRep.replace("/", "_") + testname.replace(".", "")+ ".java");
			
			output.append("}");

			try {
				PrintWriter writer  =new PrintWriter(f);
				writer.append(output.toString());
				writer.flush();
				writer.close();
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		
		
		
		//System.out.println(output.toString());
		
	}
	

}
