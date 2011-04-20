package org.kermeta.language.eclipse.builder.chainexecution;

import org.eclipse.core.resources.IResource;
import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.texteditor.eclipse.ProblemLogger;

public class ParserCaller {
	
	private static KMTparser temporalParser = new KMTparser();
	
	public static void specificParsing(final IResource currentFile) {
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
