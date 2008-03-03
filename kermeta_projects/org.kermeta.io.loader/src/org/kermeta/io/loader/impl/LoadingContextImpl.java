/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoadingContextImpl.java,v 1.3 2008-03-03 09:29:57 cfaucher Exp $
 */
package org.kermeta.io.loader.impl;

import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.io.loader.Loader;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.LoadingContext;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loading Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.impl.LoadingContextImpl#getLoaders <em>Loaders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadingContextImpl extends EObjectImpl implements LoadingContext {
	/**
	 * The cached value of the '{@link #getLoaders() <em>Loaders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Loader> loaders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadingContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoaderPackage.Literals.LOADING_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loader> getLoaders() {
		if (loaders == null) {
			loaders = new EObjectContainmentEList<Loader>(Loader.class, this, LoaderPackage.LOADING_CONTEXT__LOADERS);
		}
		return loaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws URIMalformedException 
	 * @generated NOT
	 */
	public void load(String uri, Map<?, ?> options) throws URIMalformedException, NotRegisteredURIException {
		URI emfURI = URI.createURI(uri);
		
		Loader loaderToUse = getLoaderToUse(emfURI, options);
		
		/**
		 * 
		 * TODO take care about a null pointer. Maybe raise an exception here
		 * 
		 */
		loaderToUse.load(options);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Loader getLoader(URI uri) {
		for ( Loader l : getLoaders() )
			if ( l.getUri().equals(uri) )
				return l;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws URIMalformedException 
	 * @generated NOT
	 */
	public void load(String uri, String stepName, Map<?, ?> options) throws URIMalformedException, NotRegisteredURIException {
		URI emfURI = URI.createURI(uri);
		
		Loader loaderToUse = getLoaderToUse(emfURI, options);
		
		/**
		 * 
		 * TODO take care about a null pointer. Maybe raise an exception here
		 * 
		 */
		loaderToUse.load(stepName, options);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws URIMalformedException 
	 * @generated NOT
	 */
	public Loader getLoaderToUse(URI uri, Map<?, ?> options) throws URIMalformedException, NotRegisteredURIException {
		/*
		 * 
		 * Looking for an existing loader
		 * 
		 */
		Loader loaderToUse = getLoader(uri);		
		
		if ( loaderToUse == null ) {
			/*
			 * 
			 * Getting the loader corresponding to the file extension.
			 * 
			 */
			String extension = uri.fileExtension();
			if ( extension == null )
				loaderToUse = LoaderPlugin.getDefault().getNewEcoreLoader();
			else if ( extension.equals("kmt") )
				loaderToUse = LoaderPlugin.getDefault().getNewKMTLoader();
			else if ( extension.equals("km") )
				loaderToUse = LoaderPlugin.getDefault().getNewKMLoader();
			else if ( extension.equals("ecore") )
				loaderToUse = LoaderPlugin.getDefault().getNewEcoreLoader();
			else {
				// We are in the case with an unknown extension or an URI
				loaderToUse = LoaderPlugin.getDefault().getNewEcoreLoader();
			}
		
			if ( loaderToUse != null ) {
				loaderToUse.setUri(uri);
				loaderToUse.initializeDatas();
				loaderToUse.getDatas().setKermetaUnit( IOPlugin.getDefault().getKermetaUnit( uri.toString() ) );
				loaderToUse.initialize(options);
				getLoaders().add( loaderToUse );
			}
		}
		
		return loaderToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoaderPackage.LOADING_CONTEXT__LOADERS:
				return ((InternalEList<?>)getLoaders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoaderPackage.LOADING_CONTEXT__LOADERS:
				return getLoaders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LoaderPackage.LOADING_CONTEXT__LOADERS:
				getLoaders().clear();
				getLoaders().addAll((Collection<? extends Loader>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LoaderPackage.LOADING_CONTEXT__LOADERS:
				getLoaders().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LoaderPackage.LOADING_CONTEXT__LOADERS:
				return loaders != null && !loaders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadingContextImpl
