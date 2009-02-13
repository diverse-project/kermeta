/* $Id: CompilerUtil.java,v 1.11 2009-02-13 11:01:59 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompilerUtil.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 28, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Provide some useful methods to manage the Kermeta Compiler
 */
public class CompilerUtil {
	
	public static List<String> readStringByLine( InputStream in ){
		
		List<String> list = new ArrayList<String>();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(in));
		try {
			String thisLine;
			while ((thisLine = input.readLine()) != null) {
				list.add(thisLine);
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
