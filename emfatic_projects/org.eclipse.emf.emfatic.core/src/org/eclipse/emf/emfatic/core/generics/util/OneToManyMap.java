package org.eclipse.emf.emfatic.core.generics.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OneToManyMap<K, V> {

	private Map<K, Set<V>> m = new HashMap<K, Set<V>>();
	private Map<V, K> snd2fst = new HashMap<V, K>();

	/**
	 * only non-null args are stored
	 */
	public void put(K k, V v) {
		if (k == null || v == null) {
			return;
		}
		snd2fst.put(v,k);
		Set<V> vs = m.get(k);
		if (vs != null) {
			vs.add(v);
		} else {
			vs = new HashSet<V>();
			vs.add(v);
			m.put(k, vs);
		}
	}

	/**
	 * never returns null but empty set
	 */
	public Set<V> get(K k) {
		if (m.get(k) == null) {
			return Collections.EMPTY_SET;
		} else {
			return m.get(k);
		}
	}
	
	public K getInv(V v) {
		return snd2fst.get(v);
	}

	public void clear() {
		m.clear();
	}

	public Set<K> keySet() {
		return m.keySet();
	}

	public Collection<V> values() {
		Collection<Set<V>> csv = m.values();
		Set<V> res = new HashSet<V>();
		for (Set<V> vs : csv) {
			res.addAll(vs);
		}
		return res;
	}

}
