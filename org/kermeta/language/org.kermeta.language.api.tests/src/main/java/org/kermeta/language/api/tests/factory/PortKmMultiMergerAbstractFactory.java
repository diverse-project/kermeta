package org.kermeta.language.api.tests.factory;

import java.lang.reflect.InvocationTargetException;

import org.kermeta.language.api.port.PortKmMerger;

public abstract class PortKmMultiMergerAbstractFactory {

	abstract public PortKmMerger create() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException;
	
}
