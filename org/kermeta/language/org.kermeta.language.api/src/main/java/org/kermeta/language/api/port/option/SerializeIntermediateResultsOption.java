/* $Id:$ 
 * Creation : 8 févr. 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.port.option;

/**
 * This option indicates to a service that intermediate results should be serialized 
 */
public class SerializeIntermediateResultsOption extends ServiceOption {
	protected boolean isRecursive = false;
	protected String baseOutputFolder = ".";
	
	public SerializeIntermediateResultsOption(boolean isRecursive,
			String baseOutputFolder) {
		super();
		this.isRecursive = isRecursive;
		this.baseOutputFolder = baseOutputFolder;
	}
	public boolean isRecursive() {
		return isRecursive;
	}
	public void setRecursive(boolean isRecursive) {
		this.isRecursive = isRecursive;
	}
	public String getBaseOutputFolder() {
		return baseOutputFolder;
	}
	public void setBaseOutputFolder(String baseOutputFolder) {
		this.baseOutputFolder = baseOutputFolder;
	}
	
	
}
