package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.EList;

public class CollectionUtil<G> {

	static public <G> void add(Collection<G> c, Object o) {
		try {
			c.getValues().add((G) o);
		} catch (NullPointerException e) {
			c.setValues( new ArrayList<G>() );
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
			c.setValues( new ArrayList<G>() );
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
		newBag.getValues().addAll(l);
		return newBag;
	}
	
	public static <G> kermeta.standard.Set<G> convertAsSet(EList<G> l) {
		kermeta.standard.Set<G> newSet = StandardFactory.eINSTANCE.createSet();
		if( newSet.getValues()==null ) {
			newSet.setValues( new ArrayList<G>() );
		}
		newSet.getValues().addAll(l);
		return newSet;
	}
	
	public static <G> kermeta.standard.OrderedSet<G> convertAsOrderedSet(EList<G> l) {
		kermeta.standard.OrderedSet<G> newOrderedSet = StandardFactory.eINSTANCE.createOrderedSet();
		newOrderedSet.getValues().addAll(l);
		return newOrderedSet;
	}
	
	public static <G> kermeta.standard.Sequence<G> convertAsSequence(EList<G> l) {
		kermeta.standard.Sequence<G> newSequence = StandardFactory.eINSTANCE.createSequence();
		newSequence.getValues().addAll(l);
		return newSequence;
	}
}
