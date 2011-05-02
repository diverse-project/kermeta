/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/

package org.kermeta.language.builder.eclipse.internal;

public class ResourceIdentifier {
	
	public String key;
	public boolean inModification;
	
	public ResourceIdentifier(String key, boolean inModification) {
		this.key = key;
		this.inModification = inModification;
	}

}
