package org.kermeta.alf.alf2km.api;

import org3.kermeta.alf.*;
import org.kermeta.language.structure.ModelingUnit;

public interface Alf2KM {
	public ModelingUnit convertPackage(final CLASSSTRUCT rootPackage);
}
