/* $Id:$ 
 * Creation : 1 dec. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.result;

import org.kermeta.language.structure.ModelingUnit;

/**
 * Error aware result that contains a Kermeta ModelingUnit
 */
public class ModelingUnitResult extends ErrorProneResult {

	protected ModelingUnit modelingUnit;

	public ModelingUnit getModelingUnit() {
		return modelingUnit;
	}

	public void setModelingUnit(ModelingUnit modelingUnit) {
		this.modelingUnit = modelingUnit;
	}

	public ModelingUnitResult(ModelingUnit modelingUnit) {
		super();
		this.modelingUnit = modelingUnit;
	}
	
}
