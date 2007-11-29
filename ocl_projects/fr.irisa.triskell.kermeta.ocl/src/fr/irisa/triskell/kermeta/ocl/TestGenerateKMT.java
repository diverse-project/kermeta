/*$Id: TestGenerateKMT.java,v 1.4 2007-11-29 16:59:03 dvojtise Exp $
* Project : org.kermeta.ocl
* File : 	TestGenerateKMT.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 29 juin 07
* Authors : 
* 		Mark Skipper
* 		Olivier Barais
*/
package fr.irisa.triskell.kermeta.ocl;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;

import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;


public class TestGenerateKMT {

	private static final String workbench_path = "platform:/resource/";
	private static final String project = "fr.irisa.triskell.kermeta.ocl";
	private static final String ecorePath = workbench_path + project+  "/ocl/sample.ecore"; 
	private static final String oclPath =  workbench_path + project + "/ocl/70.ocl";
	private static final String kmtPath =  workbench_path + project + "/ocl/70.kmt";
	
	
	public static void test(){
		URI ecoreURI = URI.createURI(ecorePath);
		URI oclURI = URI.createURI(oclPath);
		URI kmtURI = URI.createURI(kmtPath);
		System.out.println("ecore file: "+ecoreURI);
		System.out.println("ocl file: "    + oclURI);
		System.out.println("kmt file: "   + kmtURI);
		new GenerateKMT().generate(ecoreURI, oclURI, kmtURI);
	}
	
	public static void main(String[] args) {
		URIConverter.URI_MAP.putAll(URIMapUtil.readMapFile(new File("uri.map")));
		test();
	}
	
}
