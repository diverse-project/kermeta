package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.standard.Collection;

import org.eclipse.emf.common.util.BasicEList;

public class OrderedCollectionUtil {

	static public <G> void addAt(Collection<G> c, int index, Object o) {
		if( c.getValues() != null ) {
			((BasicEList<G>)c.getValues()).addUnique(index, (G) o);
		} else {
			c.setValues( new BasicEList<G>() );
			((BasicEList<G>)c.getValues()).addUnique(index, (G) o);
		}
	}
	
	static public <G> void removeAt(Collection<G> c, int index) {
		if( c.getValues() != null ) {
			c.getValues().remove(index);
		}
	}
	
	static public <G> Object elementAt(Collection<G> c, int index) {
		if( c.getValues() != null ) {
			return c.getValues().get(index);
		} else {
			return null;
		}
	}
	
}
