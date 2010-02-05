package main;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
				return (!arg0.isDirectory()) && arg0.getName().endsWith(".kmt");
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
		
		

		
		StringTemplateGroup group = new StringTemplateGroup("tests");
		StringTemplate st = group.getInstanceOf("group/templates/TestCompiloCases");
		StringBuilder output = new StringBuilder();
		output.append(st.toString());
		for (String s : files)
			System.err.println(s);
		

		for (String s : files){		
			StringTemplate test = group.getInstanceOf("group/templates/Tests");
			String testRep = s.substring(0,s.lastIndexOf("/"));
			String testname = s.substring(s.lastIndexOf("/")+1, s.length()-4);
			
			//System.err.println(testRep);
			//System.err.println(testname);
			output.append("\t");

			test.setAttribute("testname", testname);
			test.setAttribute("testnametest", testname.replace(".", ""));
			test.setAttribute("testRep", testRep);			
			output.append(test.toString());
			output.append("\n");

		}
		
		
		output.append("}");
		
		//System.out.println(output.toString());
		File f = new File("src/test/java/fr/irisa/triskell/scala/compilo/test/TestCompiloCases.java");
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
	

}
