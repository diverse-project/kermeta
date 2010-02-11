package main;

import patternframeworkScalaAspect.MainAspect;
import patternframeworkScalaAspect.RichMain;
import runner.MainRunner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//TODO à n'appeler que si en dehors d'eclipse.
		MainRunner.init();
		long start = java.lang.System.currentTimeMillis();
		MainAspect main = new RichMain();
		main.process("file:/home/barais/workspaces/divaDrools/DroolsGenerator/v2/01_LoggingAdapter.smART", "/tmp/test.drl");
		long end = java.lang.System.currentTimeMillis();
		
		java.lang.System.err.println("Execution time was "+(end-start)+" ms.");

	}

}
