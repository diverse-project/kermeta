package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;

import kermeta.standard.Collection;

public class OrderedCollectionUtil {

	static public void addAt(Collection c, Object o, int index) {
		try {
			c.getValues().add(index, o);
		} catch (NullPointerException e) {
			c.setValues( new ArrayList() );
		}
	}
	
	static public void removeAt(Collection c, int index) {
		try {
			c.getValues().remove(index);
		} catch (NullPointerException e) {
		}
	}
	
	static public Object elementAt(Collection c, int index) {
		try {
			return c.getValues().get(index);
		} catch (NullPointerException e) {
			return null;
		}
	}
	
}
