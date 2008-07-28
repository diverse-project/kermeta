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

package org.kermeta.interpreter.runtime.basetypes.ocl.helpers;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.ParserException;

import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.ocl.OCLFileParser;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class OCLText_OCLCST_Helper {
	
	/**
	 * implementation for the interpreter of textFile_2_xmiFile operation
	 * @param self
	 * @param oclInputFileURI
	 * @param xmiFileOutputURI
	 */
    public static RuntimeObject textFile_2_xmiFile(
    		RuntimeObject self,
    		RuntimeObject oclInputFileURI, 
    		RuntimeObject xmiFileOutputURI)
    {
        java.lang.String str_oclInputFileURI = String.getValue(oclInputFileURI);
        java.lang.String str_xmiFileOutputURI = String.getValue(xmiFileOutputURI);
        try {
				OCLFileParser.parseTextFileToXmiFile(URI.createURI(str_oclInputFileURI), URI.createURI(str_xmiFileOutputURI));
		} catch (ParserException e) {
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::Exception",
	    			"Not able to parse " + str_oclInputFileURI + " to xmi file " + str_xmiFileOutputURI,
	    			self.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	    			self.getFactory().getMemory(),
	    			e);
		}catch (IOException e) {
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ResourceLoadException",
	    			"Not able to parse " + str_oclInputFileURI + " to xmi file " + str_xmiFileOutputURI,
	    			self.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	    			self.getFactory().getMemory(),
	    			e);
		}
		
        return self.getFactory().getMemory().voidINSTANCE;
    }
}
