/* $Id: Generator.java,v 1.8 2008-02-06 10:14:38 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.ket
 * File       : GeneratorHelper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 Jul. 2007
 * Authors : 
 * 			Olivier Barais <barais@irisa.fr>
 * 			Cyril Faucher <cfaucher@irisa.fr>
 * 			Cyril Faucher <cyril.faucher@univ-lr.fr>
 * Description : 
 * 			Helpers for launch the compilation process of a *.ket file into kmt file
 */

package fr.irisa.triskell.kermeta.ket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.jet.core.parser.IJETParser;
import org.eclipse.jet.core.parser.ITagLibraryResolver;
import org.eclipse.jet.core.parser.ITemplateInput;
import org.eclipse.jet.core.parser.ITemplateResolver;
import org.eclipse.jet.core.parser.RecursiveIncludeException;
import org.eclipse.jet.core.parser.ast.JETCompilationUnit;
import org.eclipse.jet.taglib.TagLibrary;

import fr.irisa.triskell.kermeta.ket.builder.Visitor;
import fr.irisa.triskell.kermeta.ket.parser.KetParser;
import fr.irisa.triskell.kermeta.ket.parser.KetTagLibrary;

public class GeneratorHelper {

	private final class NullTagLibraryResolver implements ITagLibraryResolver {

		public TagLibrary getLibrary(String tagLibraryID) {
			return new KetTagLibrary();
		}
	}

	private final ITemplateResolver nullTemplateResolver = new ITemplateResolver() {

		public URI[] getBaseLocations() {
			URI nullURI;
			try {
				nullURI = new URI(""); //$NON-NLS-1$
				return new URI[] { nullURI };
			} catch (URISyntaxException e) {
				throw new RuntimeException(e);
			}
		}

		public ITemplateInput getIncludedInput(String templatePath,
				ITemplateInput[] activeInputs) throws RecursiveIncludeException {
			return null;
		}

		public ITemplateInput getInput(String templatePath) {
			return null;
		}

	};

	/**
	 * 
	 * @param ketfile
	 */
	public void generate(IFile ketfile) {
		String outputURI = ketfile.getLocation().removeFileExtension()
				.addFileExtension("kmt").toOSString();
		generate(ketfile, outputURI);
	}

	/**
	 * 
	 * @param ketfile
	 * @param outputURI
	 */
	public void generate(IFile ketfile, String outputURI) {
		IJETParser p = new KetParser(nullTemplateResolver,
				new NullTagLibraryResolver(), new HashMap());
		String content = "";
		try {
			FileInputStream stream = new FileInputStream(ketfile.getLocation()
					.toString());
			content = readAll(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JETCompilationUnit cu = (JETCompilationUnit) p.parse(content
				.toCharArray());
		PrintWriter fo = null;
		File f = new File(outputURI);
		try {
			fo = new PrintWriter(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Visitor v = new Visitor(fo);
		cu.accept(v);
		fo.flush();
		fo.close();
	}

	/**
	 * 
	 * @param in
	 * @return
	 */
	private String readAll(InputStream in) {
		StringBuffer output = new StringBuffer();
		try {
			int c;
			// int charcount = 0; int linenum = 1; int c_old = -1;
			while ((c = in.read()) != -1) {
				output.append((char) c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output.toString();
	}

}
