package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class CollectionUtil<G> {

	static public <G> void add(Collection<G> c, Object o) {
		try {
			c.getValues().add((G) o);
		} catch (NullPointerException e) {
			c.setValues( new BasicEList<G>() );
			c.getValues().add((G) o);
		}
	}
	
	static public <G> void remove(Collection<G> c, Object o) {
		try {
			c.getValues().remove(o);
		} catch (NullPointerException e) {
		}
	}
	
	static public <G> void clear(Collection<G> c) {
		try {
			c.getValues().clear();
		} catch (NullPointerException e) {
			c.setValues( new BasicEList<G>() );
		}
	}
	
	static public <G> int size(Collection<G> c) {
		try {
			return c.getValues().size();
		} catch (NullPointerException e) {
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
}
