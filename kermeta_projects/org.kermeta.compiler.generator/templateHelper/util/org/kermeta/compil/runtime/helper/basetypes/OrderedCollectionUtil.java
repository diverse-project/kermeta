package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;

import kermeta.standard.Collection;

public class OrderedCollectionUtil {

	static public <G> void addAt(Collection<G> c, int index, Object o) {
		try {
			c.getValues().add(index, (G) o);
		} catch (NullPointerException e) {
			c.setValues( new ArrayList<G>() );
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
