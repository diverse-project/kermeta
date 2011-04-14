package org.kermeta.language.texteditor.eclipse.internal.chainexecution;

import org.eclipse.core.resources.IFile;
import org.kermeta.language.loader.kmt.scala.KMTparser;

public class ParserCaller {
	
	private static KMTparser temporalParser = new KMTparser();
	
	public static void specificParsing(final IFile currentFile) {
		new Runnable() {
			
			@Override
			public void run() {
				String cleanURI = currentFile.getLocationURI().toString();
				if (cleanURI.startsWith("file:/")) {
					cleanURI = cleanURI.replaceFirst("file:/", "");
				}
				System.out.println(cleanURI);
				temporalParser.load(cleanURI, "", new ProblemLogger());				
			}
		}.run();
	}

}
