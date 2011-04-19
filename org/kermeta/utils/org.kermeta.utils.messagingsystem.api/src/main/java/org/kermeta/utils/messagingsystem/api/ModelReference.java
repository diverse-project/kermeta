/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 19 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.messagingsystem.api;

import org.eclipse.emf.ecore.EObject;

public class ModelReference extends Reference {
	
	
	public ModelReference(EObject modelRef) {
		super();
		this.modelRef = modelRef;
	}

	protected EObject modelRef;

	public EObject getModelRef() {
		return modelRef;
	}

	public void setModelRef(EObject modelRef) {
		this.modelRef = modelRef;
	} 
	

}
