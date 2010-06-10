package org.kermeta.ki.malai.kermetaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class Source2TargetMapExtern {
	public static RuntimeObject cleanMap(final RuntimeObject selfRO) {
		Source2TargetMap.MAP.cleanMap();
		return selfRO.getFactory().getMemory().voidINSTANCE;
	}
}
