package org.kermeta.smartadapters.diva.toDrools.ui;

import patternframeworkScalaAspect.MainAspect;
import patternframeworkScalaAspect.RichMain;
import runner.MainRunner;

public class AspectCompiler {

	/**
	 * @param args
	 */
	public static void compile(String file) {
		MainRunner.init();
		long start = java.lang.System.currentTimeMillis();
		MainAspect main = new RichMain();
		System.out.println("file: "+file);
		System.out.println("file2: "+file.replace(".smART", ".drl").replace("file:/",""));
		main.process(file, file.replace(".smART", ".drl").replace("file:/",""));
		long end = java.lang.System.currentTimeMillis();
		
		java.lang.System.err.println("Compiling time was "+(end-start)+" ms.");

	}

}
