package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class CollectionUtil<G> {

	static public <G> void add(Collection<G> c, Object o) {
		// The addUnique method is called instead of add to fix
		// the problem of uniqueness, the uniqueness constraint is
		// checked before this calling in function of the type given
		// of the Collection: bag, seq, set, oset
		if( c.getValues() != null ) {
			((BasicEList<G>) c.getValues()).addUnique((G) o);
		} else {
			c.setValues( new BasicEList<G>() );
			((BasicEList<G>) c.getValues()).addUnique((G) o);
		}
	}
	
	static public <G> void remove(Collection<G> c, Object o) {
		if( c.getValues() != null ) {
			c.getValues().remove(o);
		}
	}
	
	static public <G> void clear(Collection<G> c) {
		if( c.getValues() != null ) {
			c.getValues().clear();
		} else {
			c.setValues( new BasicEList<G>() );
		}
	}
	
	static public <G> int size(Collection<G> c) {
		if( c.getValues() != null ) {
			return c.getValues().size();
		} else {
			return 0;
		}
	}
	
	static public <G> void iterator(Collection<G> c, Iterator<G> i) {
		i.setKermetaCollection( c );
	}
	
	
	
	/*********
	*** Conversion CallFeature (property)
	*********/
	
	public static <G> kermeta.standard.Bag<G> convertAsBag(EList<G> l) {
		kermeta.standard.Bag<G> newBag = StandardFactory.eINSTANCE.createBag();
		if( newBag.getValues() == null ) {
			newBag.setValues( new BasicEList<G>() );
		}
		newBag.setValues(l);
		return newBag;
	}
	
	public static <G> kermeta.standard.Set<G> convertAsSet(EList<G> l) {
		kermeta.standard.Set<G> newSet = StandardFactory.eINSTANCE.createSet();
		if( newSet.getValues() == null ) {
			newSet.setValues( new BasicEList<G>() );
		}
		newSet.setValues(l);
		return newSet;
	}
	
	public static <G> kermeta.standard.OrderedSet<G> convertAsOrderedSet(EList<G> l) {
		kermeta.standard.OrderedSet<G> newOrderedSet = StandardFactory.eINSTANCE.createOrderedSet();
		if( newOrderedSet.getValues() == null ) {
			newOrderedSet.setValues( new BasicEList<G>() );
		}
		newOrderedSet.setValues(l);
		return newOrderedSet;
	}
	
	public static <G> kermeta.standard.Sequence<G> convertAsSequence(EList<G> l) {
		kermeta.standard.Sequence<G> newSequence = StandardFactory.eINSTANCE.createSequence();
		if( newSequence.getValues() == null ) {
			newSequence.setValues( new BasicEList<G>() );
		}
		newSequence.setValues(l);
		return newSequence;
	}
	
	public static <G> EList<G> convertAsEList(kermeta.standard.Collection<G> col) {
		EList<G> newEList = new BasicEList<G>(); 
		newEList = col.getValues();
		return newEList;
	}

}
