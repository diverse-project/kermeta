/*
 * Created on 9 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.dev.transfo.antlr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TokenTypes2KWList {

	
	public static void main(String[] args) {
		String tokenfile = args[0];
		String templatefile = args[1];
		String outputfile = args[2];
		String result = "";
		try {
			BufferedReader r = new BufferedReader(new FileReader(tokenfile));
			while (r.ready()) {
				String line = r.readLine();
				if (line.indexOf('"') > -1) {
					String kw  = line.substring(line.indexOf('"')+1, line.lastIndexOf('"'));
					result += "addKeyword(\""+kw+"\");\n";
					System.out.println(kw);
				}
			}
			r.close();
			
			String template = getTemplate(templatefile);
			
			result = template.replaceAll("KEWORDS", result);
			
			FileWriter w = new FileWriter(outputfile);
			w.write(result);
			w.close();
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getTemplate(String file) throws Exception {
		String result = "";
		BufferedReader r = new BufferedReader(new FileReader(file));
		while (r.ready()) {
			result += r.readLine() + "\n";
		}
		r.close();
		return result;
	}

}
