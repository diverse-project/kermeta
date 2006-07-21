/* $Id: SystemIOStream.java,v 1.3 2006-07-21 10:41:20 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: SystemIOStream.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runtime.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 */
public class SystemIOStream implements KermetaIOStream {

    /**
     * 
     */
    public SystemIOStream() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void print(Object outputObject)
    {
        System.out.print(outputObject);
    }
    
    // FIXME : Object->String
    public Object read(String prompt)
    {
        String input = null;
        System.out.print(prompt+" ");
		// open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(
		        System.in
		        ));
		// read data from standard input
		try {
		    input = br.readLine();
		} catch (IOException ioe) {
		    System.out.println("JavaStaticCall error : IO error trying to read from input");
		    
		}
        return input;
    }

	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
