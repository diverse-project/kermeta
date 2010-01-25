package org.kermeta.compiler.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

public class ExternRunner {
	
	static public void launch(String command){
		final BufferedReader stdout;
		final BufferedReader stderr;
		final Vector outputLines;
		try {
			Runtime r = Runtime.getRuntime();
			Process p = r.exec(command);

			System.out.println("-------------------- OUTPUT TEST ----------------------------");
			InputStream is = p.getInputStream();
			stdout = new BufferedReader(new InputStreamReader(is));
			is = p.getErrorStream();
			stderr = new BufferedReader(new InputStreamReader(is));
			outputLines = new Vector();
			Thread stdoutThread = new Thread() {
				public void run() {
					try {
						int l;
						String line;
						for (l = 0; (line = stdout.readLine()) != null;) {
							if (line.length() > 0) {
								l++;
								outputLines.addElement(line);
							}
							System.out.println(line);
						}
						System.out.println("\nRead " + l
								+ " lines from stdout.");
						stdout.close();
					} catch (IOException ie) {
						System.out.println("IO exception on stdout: " + ie);
						System.out.println("-------------------- OUTPUT TEST ----------------------------");
					}
				}
			};
			stdoutThread.start();
			Thread stderrThread = new Thread() {
				public void run() {
					try {
						int l;
						String line;
						for (l = 0; (line = stderr.readLine()) != null;) {
							if (line.length() > 0)
								l++;
							System.out.print(",");
						}
						System.out.println("\nRead " + l
								+ " lines from stderr.");
						stderr.close();
					} catch (IOException ie) {
						System.out.println("IO exception on stderr: " + ie);
					}
				}
			};
			stderrThread.start();
			p.waitFor();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

