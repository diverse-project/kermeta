/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoaderImpl.java,v 1.2 2008-02-14 07:12:47 uid21732 Exp $
 */
package org.kermeta.io.loader.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.Loader;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.LoadingStep;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.impl.LoaderImpl#getDatas <em>Datas</em>}</li>
 *   <li>{@link org.kermeta.io.loader.impl.LoaderImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LoaderImpl extends AbstractStepImpl implements Loader {
	/**
	 * The cached value of the '{@link #getDatas() <em>Datas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatas()
	 * @generated
	 * @ordered
	 */
	protected ILoadingDatas datas;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final URI URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected URI uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoaderPackage.Literals.LOADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILoadingDatas getDatas() {
		return datas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatas(ILoadingDatas newDatas, NotificationChain msgs) {
		ILoadingDatas oldDatas = datas;
		datas = newDatas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADER__DATAS, oldDatas, newDatas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatas(ILoadingDatas newDatas) {
		if (newDatas != datas) {
			NotificationChain msgs = null;
			if (datas != null)
				msgs = ((InternalEObject)datas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LoaderPackage.LOADER__DATAS, null, msgs);
			if (newDatas != null)
				msgs = ((InternalEObject)newDatas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LoaderPackage.LOADER__DATAS, null, msgs);
			msgs = basicSetDatas(newDatas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADER__DATAS, newDatas, newDatas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(URI newUri) {
		URI oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADER__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void load(Map<?, ?> options) {
		while ( goToNextStep() ) {
			LoadingStep step = getCurrentStep();
			step.process( getDatas(), options );
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initialize(Map<?, ?> options) {
		if ( options != null && options.get( LoadingOptions.FRAMEWORK_LOADING ) != null ) {
			boolean value = (Boolean) options.get( LoadingOptions.FRAMEWORK_LOADING );
			if ( value )
				datas.getKermetaUnit().setFramework(value);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void load(String stepName, Map<?, ?> options) {
		/*
		 * 
		 * Find the step with the given name.
		 * Getting the list of steps to process before the found one.
		 * 
		 */
		LoadingStep step = null;
		Iterator<LoadingStep> iterator = getSteps().iterator();
		List<LoadingStep> steps = new ArrayList<LoadingStep>();
		while ( (step == null) && iterator.hasNext() ) {
			LoadingStep currentStep = iterator.next();			
			if ( currentStep.getName().equals(stepName) )
				step = currentStep;
			steps.add(currentStep);
		}
		
		if ( step != null ) {
			/*
			 * 
			 * Make sure datas object has a reference to the kermeta unit.
			 * 
			 */
			if ( getDatas().getKermetaUnit() == null ) {
				try {
					KermetaUnit kermetaUnit = IOPlugin.getDefault().getKermetaUnit(uri.toString());
					getDatas().setKermetaUnit( kermetaUnit );
				} catch (URIMalformedException e) {
					e.printStackTrace();
					return;
				} catch (NotRegisteredURIException e) {
					e.printStackTrace();
					return;
				}
				
			}	
			for ( LoadingStep currentStep : steps )
				currentStep.process( getDatas(), options );
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoaderPackage.LOADER__DATAS:
				return basicSetDatas(null, msgs);
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
			case LoaderPackage.LOADER__DATAS:
				return getDatas();
			case LoaderPackage.LOADER__URI:
				return getUri();
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
			case LoaderPackage.LOADER__DATAS:
				setDatas((ILoadingDatas)newValue);
				return;
			case LoaderPackage.LOADER__URI:
				setUri((URI)newValue);
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
			case LoaderPackage.LOADER__DATAS:
				setDatas((ILoadingDatas)null);
				return;
			case LoaderPackage.LOADER__URI:
				setUri(URI_EDEFAULT);
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
			case LoaderPackage.LOADER__DATAS:
				return datas != null;
			case LoaderPackage.LOADER__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //LoaderImpl
