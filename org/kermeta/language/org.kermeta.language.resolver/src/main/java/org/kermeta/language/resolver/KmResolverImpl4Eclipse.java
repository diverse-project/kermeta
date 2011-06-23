/*$Id:  $
 * License : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : 19 avr. 2011
 * Authors : 
 *      Didier Vojtisek <didier.vojtisek@inria.fr>
 *      Cédric Bouhours <cedric.bouhours@inria.fr>
 */
package org.kermeta.language.resolver;

import org.kermeta.language.resolver.api.KmResolver;
import org.kermeta.language.resolver.internal.Activator;
import org.kermeta.language.resolver.internal.KmResolverOperations;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;

public class KmResolverImpl4Eclipse implements KmResolver {

	KmResolverOperations operations = null;

	public KmResolverImpl4Eclipse(){   	
		org.kermeta.language.language.resolverrunner.MainRunner.init4eclipse();
		Activator.getDefault().reflexivityLoaderContext();
		FullStaticResolver resolver = org.kermeta.language.resolver.KerRichFactory.createFullStaticResolver();
		operations = new KmResolverOperations(resolver);
	}

	@Override
	public ErrorProneResult<ModelingUnit> doResolving(ModelingUnit mu) {	  	
		return operations.doResolving(mu);
	}

	@Override
	public ErrorProneResult<ModelingUnit> doStaticSetting(ModelingUnit mu) {		
		return operations.doStaticSetting(mu);
	}

	@Override
	public ErrorProneResult<ModelingUnit> resolve(ModelingUnit mu) {    	
		return operations.resolve(mu);
	}
}
