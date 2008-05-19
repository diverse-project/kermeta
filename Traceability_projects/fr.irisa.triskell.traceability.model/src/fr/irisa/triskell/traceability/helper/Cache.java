

/*$Id: Cache.java,v 1.1 2008-05-19 13:50:46 ftanguy Exp $
* Project : fr.irisa.triskell.traceability.model
* File : 	Cache.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 mai 08
* Authors : paco
*/

package fr.irisa.triskell.traceability.helper;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

/**
 * 
 * @author paco
 *
 * @param <Key>
 * @param <G>
 */
public abstract class Cache<Key, G> {
	
	/**
	 * The collection storing cached objects.
	 */
	protected Map<Key, List<G>> _cache = new HashMap<Key, List<G>>();
	
	/**
	 * The binded type at runtime for G type parameter.
	 * This is because we cannot use isInstanceof statement with type parameter. We have to do this with the java reflection.
	 */
	private Class<?> _clazz;
	
	/**
	 * The model used to get the initial collection of objects.
	 */
	private EObject _model;
	
	/**
	 * The feature used to handle notifications.
	 */
	private EStructuralFeature _feature;
	
	/**
	 * 
	 * @param model
	 * @param feature
	 */
	protected Cache(EObject model, EStructuralFeature feature) {
		_feature = feature;
		_model = model;
		// Adding a content adapter on the model.
		_model.eAdapters().add( new ContentAdapter() );
		// Getting the actual bind type for G and store it.
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		_clazz = (Class<?>) pt.getActualTypeArguments()[1];
		// Creating the cache
		constructCache();
	}
	
	/**
	 * Get the initial collection of objects by getting the value of the structural feature in the model.
	 * @return
	 */
	private EList<?> getInitialObjects() {
		Object o = _model.eGet(_feature);
		if ( o instanceof EList<?> )
			return (EList<?>) o;
		else
			return null;
	}
	
	/**
	 * Adding to the cache all objects from the initial collection of objects that are instances of G.
	 */
	private void constructCache() {
		EList<?> initialObjects = getInitialObjects();
		if ( initialObjects != null ) {
			for ( Object o : initialObjects ) {
				if ( _clazz.isInstance(o) )
					addToCache( (G) o ); 
			}
		}
	}
	
	/**
	 * Add to the cache the given object.
	 * @param reference
	 */
	abstract protected void addToCache(G o);
	
	/**
	 * Remove from the cache the given object.
	 * @param o
	 */
	abstract protected void removeFromCache(G o);
	
	/**
	 * Looks for the first G object which has been cached with the given key.
	 * @param key
	 * @return
	 */
	public G getOne(Key key) {
		// Getting the list for the given key.
		List<G> l = _cache.get(key);
		if ( l == null )
			// If no list, no cached object.
			return null;
		try {
			// Try to get the first one.
			return l.get(0);
		} catch (IndexOutOfBoundsException e) {
			// If the list is empty, no cached object.
			return null;
		}
	}

	/**
	 * Gets the list of G objects that have been cached with the given key.
	 * @param key
	 * @return
	 */
	public List<G> get(Key key) {
		return _cache.get(key);
	}
	
	/**
	 * 
	 * @author paco
	 *
	 */
	private class ContentAdapter extends EContentAdapter {
		
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			
			if ( notification.getFeature() == _feature ) {
				if ( _clazz.isInstance(notification.getNewValue()) ) {
					switch ( notification.getEventType() ) {
					case Notification.ADD :
						addToCache( (G) notification.getNewValue() );
						break;
					case Notification.REMOVE :
						removeFromCache( (G) notification.getNewValue() );
						break;
					default :
						break;
					}
					
				}
			}
		}
				
	}
}


