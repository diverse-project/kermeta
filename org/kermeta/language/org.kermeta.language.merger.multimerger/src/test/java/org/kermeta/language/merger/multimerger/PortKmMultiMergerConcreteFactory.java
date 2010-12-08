package org.kermeta.language.merger.multimerger;

import java.lang.reflect.InvocationTargetException;

import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.tests.factory.PortKmMultiMergerAbstractFactory;
import org.kermeta.language.merger.binarymerger.art2.impl.Art2ComponentKmBinaryMerger;
import org.kermeta.language.merger.multimerger.art2.impl.Art2ComponentKmMultiMerger;

public class PortKmMultiMergerConcreteFactory extends PortKmMultiMergerAbstractFactory {

	public PortKmMerger create() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
		
		// Definir les differents ports utilises

		//PortKmBinaryMerger bmerger = (PortKmBinaryMerger) myclass.getConstructors()[0].newInstance();
		//PortKmBinaryMerger bmerger = (PortKmBinaryMerger) PortKmBinaryMerger.class.getConstructors()[0].newInstance();
		//Art2ComponentKmBinaryMerger bmerger = Art2ComponentKmBinaryMerger.class;
		
		PortKmBinaryMerger bmerger = new Art2ComponentKmBinaryMerger();
		Art2ComponentKmMultiMerger mmerger = new Art2ComponentKmMultiMerger();
		
		mmerger.setBinaryMerger(bmerger);
		
		
		return mmerger;
	}
}
