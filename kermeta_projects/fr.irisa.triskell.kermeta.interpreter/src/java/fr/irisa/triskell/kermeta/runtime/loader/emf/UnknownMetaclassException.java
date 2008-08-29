/*$Id: UnknownMetaclassException.java,v 1.1 2008-08-29 14:43:22 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	UnknownMetaclassException.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 26 août 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.runtime.loader.emf;

public class UnknownMetaclassException extends Exception {

	public String metaclassName;
	public UnknownMetaclassException(String mcName,String msg) {
		super(msg);
		metaclassName = mcName;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5795127866631098284L;

}
