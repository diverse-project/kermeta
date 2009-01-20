
package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.BasicEList;

public class MapUtil {
	
	// Implementation of method size called as :
	public static <K, V> java.lang.Integer size(kermeta.utils.Hashtable<K, V> self) {
		initialize(self);
		return self.getWrappedHashtable().size();
	}

	// Implementation of method keyIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.keysIterator()
	public static <K, V> kermeta.standard.Iterator<K> keysIterator(kermeta.utils.Hashtable<K, V> self) {
		initialize(self);
		
		kermeta.standard.Set<K> newSet = StandardFactory.eINSTANCE.createSet();
		newSet.setValues( new BasicEList<K>() );
		newSet.getValues().addAll(self.getWrappedHashtable().keySet());
		
		return newSet.iterator();
	}

	// Implementation of method valueIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.valueIterator()
	public static <K, V> kermeta.standard.Iterator<V> valueIterator(kermeta.utils.Hashtable<K, V> self) {
		initialize(self);
		
		kermeta.standard.Bag<V> newBag = StandardFactory.eINSTANCE.createBag();
		newBag.setValues( new BasicEList<V>() );
		newBag.getValues().addAll(self.getWrappedHashtable().values());
		
		return newBag.iterator();
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.get(key)
	public static <K, V> V get(kermeta.utils.Hashtable<K, V> self, K key) {
		initialize(self);
		return self.getWrappedHashtable().get(key);
	}

	// Implementation of method put called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.put(key, value)
	public static <K, V> void put(kermeta.utils.Hashtable<K, V> self, K key, V value) {
		initialize(self);
		self.getWrappedHashtable().put(key, value);
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.remove(key)
	public static <K, V> void remove(kermeta.utils.Hashtable<K, V> self, K key) {
		initialize(self);
		self.getWrappedHashtable().remove(key);
	}

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.clear(self)
	public static <K, V> void clear(kermeta.utils.Hashtable<K, V> self) {
		initialize(self);
		self.getWrappedHashtable().clear();
	}
	
	/**
	 * Initialize the wrapped Hashtable
	 * 
	 * @param <K>
	 * @param <V>
	 * @param self
	 */
	private static <K, V> void initialize(kermeta.utils.Hashtable<K, V> self) {
		if(self.getWrappedHashtable()==null) {
			self.setWrappedHashtable(new java.util.Hashtable<K, V>());
		}
	}

}
/* END OF FILE */
