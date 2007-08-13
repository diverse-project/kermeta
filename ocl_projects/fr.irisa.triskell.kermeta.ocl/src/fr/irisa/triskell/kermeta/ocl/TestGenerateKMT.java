package fr.irisa.triskell.kermeta.ocl;

import java.util.Map;

public class TestGenerateKMT {

	private static String workbench_path = GenerateKMT.workbench_path;
	
	public static void test(){
		String project = "fr.irisa.triskell.kermeta.ocl";
		new GenerateKMT().generate( 
				workbench_path + project+  "/ocl/sample.ecore", 
				workbench_path + project + "/ocl/70.ocl",
				workbench_path + project + "/ocl/70.kmt");
	}
	
	public static void main(String[] args) {
			test();
		}

	
}
