/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.tests.factory;

import java.lang.reflect.InvocationTargetException;

import org.kermeta.language.api.port.PortResourceLoader;

public abstract class PortAbstractFactory {

	abstract public PortResourceLoader create() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException;
	
}
