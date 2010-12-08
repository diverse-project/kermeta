/* $Id:$ 
 * Creation : 7 dec. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.kevent;

/** 
 * Event that capture the User request for an executable Km
 * 
 */
public class KExecutableKmUserRequestEvent extends KEvent {

	/**
	 * URI of the input description that will be processed
	 * This can be either :
	 * - a folder
	 * - a kp file (kermeta project file)
	 *
	 */
    protected String inputDescriptionURI = "";
    
    /**
     * URI of where the result will be saved
     */
    protected String outputURI = "";
    
    /**
     * Used for Debug
     * URI of where the intermediate files can be saved, if null or empty, no intermediate file will be saved
     */
    protected String intermediateDebugOutputURI = "";

  
	public KExecutableKmUserRequestEvent(String inputDescriptionURI,
			String outputURI,
			String intermediateDebugOutputURI) {
		super();
		this.inputDescriptionURI = inputDescriptionURI;
		this.outputURI = outputURI;
		this.intermediateDebugOutputURI = intermediateDebugOutputURI;
	}

	public String getInputDescriptionURI() {
		return inputDescriptionURI;
	}

	public void setInputDescriptionURI(String inputDescriptionURI) {
		this.inputDescriptionURI = inputDescriptionURI;
	}

	public String getOutputURI() {
		return outputURI;
	}

	public void setOutputURI(String outputURI) {
		this.outputURI = outputURI;
	}
	  
	public String getIntermediateDebugOutputURI() {
		return intermediateDebugOutputURI;
	}

	public void setIntermediateDebugOutputURI(String intermediateDebugOutputURI) {
		this.intermediateDebugOutputURI = intermediateDebugOutputURI;
	}

}
