package org.kermeta.compil.runtime.helper.persistence;

import kermeta.persistence.Resource;


public class KmReflectionHelper {
	
	public static void load(Resource self) {
		self.clear();
		org.kermeta.compil.runtime.helper.persistence.Loader.load(self.getValues(), self.getUri(), self.getMetaModelURI());
	}
}
