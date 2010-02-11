package org.kermeta.smartadapters.drools.utils;

import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class TreeIterable<EObject> implements Iterable<EObject>{
	TreeIterator<EObject> wrapper;
	public TreeIterable(TreeIterator<EObject> o ) {
		wrapper = o;
	}
	
	@Override
	public Iterator<EObject> iterator() {
		return wrapper;
	}

}
