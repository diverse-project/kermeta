/* $Id:$ 
 * Creation : 7 févr. 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.port;

import java.util.Collection;
import java.util.List;

import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.api.port.option.ServiceOption;

/**
 * This port provides a complex service, mostly for User Interface
 * Components that implement it will probably reuse other basic services.
 */
public interface PortURIs2MergedKm {
	/**
	 * Loads a set of URI convert them into km model, merge them	 
	 */
	public ModelingUnit merge(List<String> URIs);
	
	/**
	 * Same as previous but with options 
	 * @param URIs
	 * @param options
	 */
	public void merge(List<String> URIs,  Collection<ServiceOption> options);
	
	/**
	 * Loads a set of URI convert them into km model, merge them, and save the result to the given URI	 
	 */
	public void merge(List<String> URIs, String destURI);
	
	/**
	 * Same as previous but with options 
	 * @param URIs
	 * @param destURI
	 * @param options
	 */
	public void merge(List<String> URIs, String destURI, Collection<ServiceOption> options);
}
