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
import org.kermeta.language.resolver.internal.KmResolverOperations;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class KmResolverImpl implements KmResolver {

	KmResolverOperations operations = null;
	
	/** constructor for use in standalone mode, where we must set the MessagingSystem for internal logging
	 * 
	 * @param logger, if null will use the default System.out MessagingSystem
	 */
	public KmResolverImpl(MessagingSystem logger){   	
		org.kermeta.language.language.resolverrunner.MainRunner.init();
		FullStaticResolver resolver = org.kermeta.language.resolver.KerRichFactory.createFullStaticResolver();
    	operations = new KmResolverOperations(resolver, logger);
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
