/*$Id: OCLText_OCLCST_Helper.java,v 1.1 2008-07-28 08:32:24 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.ocl
* File : 	OCLText_OCLCST_Helper.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 24 juil. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.compiler.runtime.basetypes.ocl.helpers;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.ParserException;

import fr.irisa.triskell.kermeta.ocl.OCLFileParser;

public class OCLText_OCLCST_Helper {
	
	/**
	 * implementation for the compiler of textFile_2_xmiFile opertaion
	 * @param self
	 * @param oclInputFileURI
	 * @param xmiFileOutputURI
	 */
    public static void textFile_2_xmiFile(
    		Object self,
    		String oclInputFileURI, 
    		String xmiFileOutputURI)
    {
    	try {
			OCLFileParser.parseTextFileToXmiFile(URI.createURI(oclInputFileURI), URI.createURI(xmiFileOutputURI));
		} catch (ParserException e) {
			// TODO should throw a better exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		        
        
    }
}
