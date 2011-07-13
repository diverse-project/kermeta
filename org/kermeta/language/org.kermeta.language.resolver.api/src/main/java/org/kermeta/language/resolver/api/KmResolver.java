/* $Id:$ 
 * Creation : November, 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek
 */
package org.kermeta.language.resolver.api;

import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.language.structure.ModelingUnit;

/**
 ** This service offers to resolve and to set static types of a ModelingUnit
 */
public interface KmResolver {
	
	public final static String LOG_MESSAGE_GROUP = "org.kermeta.language.resolver";
	public ErrorProneResult<ModelingUnit> resolve(ModelingUnit mu);
	public ErrorProneResult<ModelingUnit> doResolving(ModelingUnit mu);
    public ErrorProneResult<ModelingUnit> doStaticSetting(ModelingUnit mu);

}
