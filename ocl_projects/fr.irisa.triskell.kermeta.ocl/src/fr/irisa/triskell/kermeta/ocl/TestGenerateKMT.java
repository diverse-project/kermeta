package fr.irisa.triskell.kermeta.ocl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.ui.views.navigator.CollapseAllAction;

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

	private void openURI(){
		URI oclURI = URI.createURI(oclPath);
		URIConverter converter = new URIConverterImpl();
		InputStream in;
		String s = "";
		try {
			in = converter.createInputStream(oclURI);
    		BufferedReader reader = new BufferedReader( 	new	InputStreamReader(in));
    		while ((s= reader.readLine()) != null) {
    			System.out.println(s);
    		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
