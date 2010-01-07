package fr.irisa.triskell.maven.merger;

import org.apache.maven.plugin.MojoExecutionException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner runner = new Runner();
		try {
			
			
			runner.execute();
			
			
		} catch (MojoExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
