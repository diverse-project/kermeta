package main;

/* $Id: CompileFramework.java,v 1.21 2008-05-28 15:43:56 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta.framework
 * File : CompileFramework.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 18 apr. 2005
 * Author : Olivier Barais
 */

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.merger.exporter.FullMergeKmExporter;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * this class is supposed to compile the standard library into several km and
 * ecore models
 */
public class MergeKmt {

	private String folderName;

	public static void main(String[] args) throws NotRegisteredURIException,
			URIMalformedException, IOException {
		//System.out.println("toto".substring(0,3));
		new MergeKmt().process();
	}

	void listFiles(File folderTest, List<String> files) {
		for (File f : folderTest.listFiles(new FileFilter() {

			public boolean accept(File arg0) {
				return (!arg0.isDirectory()) && arg0.getName().endsWith(".kmt");
			}

		})) {
			files.add(folderName + f.getName());
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

	void process() throws URIMalformedException, NotRegisteredURIException,
			IOException {
		String basePATH = this.getClass().getResource("/").getPath();


		List<String> files = new ArrayList<String>();
		folderName = "src/test/resources/";
		File folderTest = new File(folderName);

		this.listFiles(folderTest, files);
		FullMergeKmExporter merger = new FullMergeKmExporter("", "", "file:" + basePATH + "/../../plugins/fr.irisa.triskell.kermeta.io/src/kermeta/framework.km", "file:" + basePATH + "/../../plugins/", "file:" + basePATH + "/../../plugins/org.kermeta.io.loader/instances/");
		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI("file:" + basePATH + "/../../plugins/"));
		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI("file:" + basePATH + "/../../../"));
		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("kconf:/loader/"), URI.createURI("file:" + basePATH + "/../../plugins/org.kermeta.io.loader/"));   

		for (String s : files) {
			merger.merge("platform:/resource/fr.irisa.triskell.kermeta.scala.compilo.test/"+s,
								"platform:/resource/fr.irisa.triskell.kermeta.scala.compilo.test/" +s.substring(0,s.length()-1));
				System.out.println("Mergin and Saving done for " +"platform:/resource/fr.irisa.triskell.kermeta.scala.compilo.test/" +s.substring(0,s.length()-1));
			
		}

	}
}
