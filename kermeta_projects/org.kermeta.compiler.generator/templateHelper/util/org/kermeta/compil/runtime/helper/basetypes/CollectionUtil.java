package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.EList;

public class CollectionUtil {

	static public void add(Collection c, Object o) {
		try {
			c.getValues().add(o);
		} catch (NullPointerException e) {
			c.setValues( new ArrayList() );
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
			c.setValues( new ArrayList() );
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
	
	
	
	/*********
	*** Conversion CallFeature (property)
	*********/
	
	public static <G> kermeta.standard.Bag<G> convertAsBag(EList<G> l) {
		kermeta.standard.Bag<G> newBag = StandardFactory.eINSTANCE.createBag();
		newBag.getValues().addAll(l);
		return newBag;
	}
	
	public static <G> kermeta.standard.Set<G> convertAsSet(EList l) {
		kermeta.standard.Set<G> newSet = StandardFactory.eINSTANCE.createSet();
		newSet.getValues().addAll(l);
		return newSet;
	}
	
	public static <G> kermeta.standard.OrderedSet<G> convertAsOrderedSet(EList l) {
		kermeta.standard.OrderedSet<G> newOrderedSet = StandardFactory.eINSTANCE.createOrderedSet();
		newOrderedSet.getValues().addAll(l);
		return newOrderedSet;
	}
	
	public static <G> kermeta.standard.Sequence<G> convertAsSequence(EList l) {
		kermeta.standard.Sequence<G> newSequence = StandardFactory.eINSTANCE.createSequence();
		newSequence.getValues().addAll(l);
		return newSequence;
	}
}
