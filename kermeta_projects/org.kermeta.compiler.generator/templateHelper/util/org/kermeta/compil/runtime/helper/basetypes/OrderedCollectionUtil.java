package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.standard.Collection;

import org.eclipse.emf.common.util.BasicEList;

public class OrderedCollectionUtil {

	static public <G> void addAt(Collection<G> c, int index, Object o) {
		try {
			c.getValues().add(index, (G) o);
		} catch (NullPointerException e) {
			c.setValues( new BasicEList<G>() );
		}
	}
	
	static public <G> void removeAt(Collection<G> c, int index) {
		try {
			c.getValues().remove(index);
		} catch (NullPointerException e) {
		}
	}
	
	static public <G> Object elementAt(Collection<G> c, int index) {
		try {
			return c.getValues().get(index);
		} catch (NullPointerException e) {
			return null;
		}
	}
	
}
