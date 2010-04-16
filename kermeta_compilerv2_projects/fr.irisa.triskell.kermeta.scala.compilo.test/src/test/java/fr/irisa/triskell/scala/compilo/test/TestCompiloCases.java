package fr.irisa.triskell.scala.compilo.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public abstract class TestCompiloCases extends TestCase {

	void listJar(File folderTest, List<String> files) {
		System.err.println(folderTest.getAbsolutePath());
		for (File f : folderTest.listFiles(new FileFilter() {

			public boolean accept(File arg0) {
				return (!arg0.isDirectory()) && arg0.getName().endsWith(".jar");
			}

		})) {
			files.add((f.getAbsolutePath()));
		}
	}

	public List<String> getJars(String testcase) {

		List<String> res = new ArrayList<String>();
		listJar(new File((testcase.substring(0, testcase.lastIndexOf("/")))),
				res);
		return res;
	}

	public void process(String testcase) {

		String basePATH = this.getClass().getResource("/").getPath();
		basePATH = basePATH.substring(0, basePATH
				.lastIndexOf("fr.irisa.triskell.kermeta.scala.compilo.test"));

		fr.irisa.triskell.kermeta.compilo.scala.Main.init(
				"Compiler.properties", "", "", "", this.getJars(testcase), "",
				null);
		String[] arg = new String[2];
		arg[0] = "-i";
		arg[1] = testcase + ".km";

		fr.irisa.triskell.kermeta.compilo.scala.Main.main(arg);
		assertEquals(fr.irisa.triskell.kermeta.compilo.scala.Main.getResult(),
				0);

	}
}