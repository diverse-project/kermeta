/* $Id: StdIOUtil.java,v 1.3 2008-10-09 08:51:35 cfaucher Exp $
 * Project : Kermeta (First iteration)
 * File : Io.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 4, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 */
package org.kermeta.compil.runtime.helper.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Implementation of input and output methods (see io.kmt)
 * Warning: the following methods are not "static", because a singleton has been used
 */
public class StdIOUtil {
	
	private StdIOUtil() {
	}
	
	static private StdIOUtil _instance;

	static public StdIOUtil getInstance() {
		if (_instance == null)
			_instance = new StdIOUtil();
		return _instance;
	}
    
	// Implementation of method write called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.write(output)
	public void write(String output) {
		System.out.print(output);
	}
	
	// Implementation of method writeln called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.writeln(output)
	public void writeln(java.lang.String output) {
		System.out.println(output);
	}
	
	// Implementation of method error called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.error(output)
	public void error(java.lang.String output) {
		System.err.print(output);
	}

	// Implementation of method errorln called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.errorln(output)
	public void errorln(java.lang.String output) {
		System.err.println(output);
	}
	
	// Implementation of method read called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.read(prompt)
	public java.lang.String read(java.lang.String prompt) {
		System.out.println(prompt);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		try {
			str = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read.");
			System.exit(1);
		}
		
		return str;
	}
	
}
