/* $Id: $
 * Project    : org.kermeta.language.ecore2km
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 25 nov. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 *            Arnaud Blouin
 *            Cédric Bouhours
 */
package org.kermeta.language.merger.binarymerger;

import org.kermeta.language.merger.BinaryMerger;
import org.kermeta.language.merger.binarymerger.internal.Activator;
import org.kermeta.language.merger.binarymerger.internal.KmBinaryMergerOperations;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;


public class KmBinaryMergerImpl4Eclipse implements org.kermeta.language.merger.binarymerger.api.KmBinaryMerger {
	
	KmBinaryMergerOperations operations = null;
	
	public KmBinaryMergerImpl4Eclipse() {
		org.kermeta.language.language.merger.binarymergerrunner.MainRunner.init4eclipse();
		Activator.getDefault().reflexivityLoaderContext();
		BinaryMerger merger = org.kermeta.language.merger.KerRichFactory.createBinaryMerger();
		operations = new KmBinaryMergerOperations(merger);
	}

	@Override
	public ErrorProneResult<ModelingUnit> merge(ModelingUnit first_mu, ModelingUnit second_mu) {
	
        return operations.merge(first_mu, second_mu);
	}
	@Override
	public ErrorProneResult<ModelingUnit> genericMerge(ModelingUnit first_mu, ModelingUnit second_mu) {
	
        return operations.genericMerge(first_mu, second_mu);
	}
}
