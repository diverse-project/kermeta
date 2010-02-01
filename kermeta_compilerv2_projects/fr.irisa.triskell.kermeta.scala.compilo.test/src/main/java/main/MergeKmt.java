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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

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

		URIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI
				.createURI("file:" + basePATH + "/../../plugins/"));
		URIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI
				.createURI("file:" + basePATH + "/../../../"));

		List<String> files = new ArrayList<String>();
		folderName = "src/test/resources/";
		File folderTest = new File(folderName);

		this.listFiles(folderTest, files);
		for (String s : files) {

			KermetaUnit kermetaUnit = null;
			kermetaUnit = LoaderPlugin.getDefault().load(
					"platform:/resource/fr.irisa.triskell.kermeta.scala.compilo.test/"
							+ s, null);
			// kermetaUnit = LoaderPlugin.getDefault().getFramework();

			kermetaUnit.setFramework(false);
			for (KermetaUnit unit : KermetaUnitHelper
					.getAllImportedKermetaUnits(kermetaUnit))
				unit.setFramework(false);

			if (kermetaUnit.isIndirectlyErroneous()) {
				System.err.println("Standard library contains type errors:");
				System.err.println(KermetaUnitHelper
						.getAllErrorsAsString(kermetaUnit));
				// System.exit(0);
			} else {
				if (kermetaUnit.isWarned()) {
					System.err
							.println("Standard library contains type warnings:");
					System.err.println(KermetaUnitHelper
							.getAllWarningsAsString(kermetaUnit));
				}

				// final String dist_folder =
				// "platform:/plugin/fr.irisa.triskell.kermeta.framework/dist";

				System.out.println("Merging and Saving...");
				Merger merger = new Merger();

				Set<KermetaUnit> l = new HashSet<KermetaUnit>();
				l.add(kermetaUnit);
				l.addAll(KermetaUnitHelper
						.getAllImportedKermetaUnits(kermetaUnit));
				System.err.println(l.size());
				for (KermetaUnit u : l) {
					System.err.println(u.getUri());
				}
				KermetaUnit mergedUnit = merger
						.process(
								l,
								"platform:/resource/fr.irisa.triskell.kermeta.scala.compilo.test" +s.substring(0,s.length()-1),
								true, true);
				System.out.println("Mergin and Saving done");
			}
		}

	}
}
