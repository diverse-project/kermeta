package org.eclipse.emf.emfatic.core.generics.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;

public class OneToOneMap<K, V> {

	private Map<K, V> fst2snd = new HashMap<K, V>();
	private Map<V, K> snd2fst = new HashMap<V, K>();

	/**
	 * only non-null args are stored
	 */
	public void put(K fst, V snd) {
		if (fst == null || snd == null) {
			return;
		}
		fst2snd.put(fst, snd);
		snd2fst.put(snd, fst);
	}

	public V get(K k) {
		return fst2snd.get(k);
	}

	public K getInv(V v) {
		return snd2fst.get(v);
	}

	public void clear() {
		fst2snd.clear();
		snd2fst.clear();
	}

	public Set<K> keySet() {
		return fst2snd.keySet();
	}

	public Collection<V> values() {
		return fst2snd.values();
	}

}
