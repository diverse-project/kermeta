package org.kermeta.compil.runtime.helper.basetypes;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;

public class CollectionUtil {

	static public void add(Collection c, Object o) {
		try {
			c.getValues().add(o);
		} catch (NullPointerException e) {
			c.setValues( new BasicEList() );
		}
	}
	
	static public void remove(Collection c, Object o) {
		try {
			c.getValues().remove(o);
		} catch (NullPointerException e) {
		}
	}
	
	static public void clear(Collection c) {
		try {
			c.getValues().clear();
		} catch (NullPointerException e) {
			c.setValues( new BasicEList() );
		}
	}
	
	static public int size(Collection c) {
		try {
			return c.getValues().size();
		} catch (NullPointerException e) {
			return 0;
		}
	}
	
	static public void iterator(Collection c, Iterator i) {
		i.setKermetaCollection( c );
	}
}
