/**
 * <copyright>
 * </copyright>
 *
 * $Id: IteratorImpl.java,v 1.3 2008-09-22 14:48:28 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.standard.impl.IteratorImpl#getJavaIterator <em>Java Iterator</em>}</li>
 *   <li>{@link kermeta.standard.impl.IteratorImpl#getKermetaCollection <em>Kermeta Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IteratorImpl<G> extends ObjectImpl implements Iterator<G> {
	/**
	 * The cached value of the '{@link #getJavaIterator() <em>Java Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaIterator()
	 * @generated
	 * @ordered
	 */
	protected java.util.Iterator<G> javaIterator;

	/**
	 * The cached value of the '{@link #getKermetaCollection() <em>Kermeta Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKermetaCollection()
	 * @generated
	 * @ordered
	 */
	protected Collection<G> kermetaCollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.ITERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Iterator<G> getJavaIterator() {
		return javaIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaIterator(java.util.Iterator<G> newJavaIterator) {
		java.util.Iterator<G> oldJavaIterator = javaIterator;
		javaIterator = newJavaIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StandardPackage.ITERATOR__JAVA_ITERATOR, oldJavaIterator,
					javaIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Collection<G> getKermetaCollection() {
		if (kermetaCollection != null && kermetaCollection.eIsProxy()) {
			InternalEObject oldKermetaCollection = (InternalEObject) kermetaCollection;
			kermetaCollection = (Collection<G>) eResolveProxy(oldKermetaCollection);
			if (kermetaCollection != oldKermetaCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StandardPackage.ITERATOR__KERMETA_COLLECTION,
							oldKermetaCollection, kermetaCollection));
			}
		}
		return kermetaCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<G> basicGetKermetaCollection() {
		return kermetaCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKermetaCollection(Collection<G> newKermetaCollection) {
		Collection<G> oldKermetaCollection = kermetaCollection;
		kermetaCollection = newKermetaCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StandardPackage.ITERATOR__KERMETA_COLLECTION,
					oldKermetaCollection, kermetaCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean hasNext() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.IteratorUtil
				.hasNext(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G next() {

		G result = null;

		java.lang.Boolean idIfCond_107 = false;
		idIfCond_107 = kermeta.standard.helper.BooleanWrapper.not(this
				.hasNext());

		if (idIfCond_107) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IteratorIsOff) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.IteratorIsOff")));

		}

		result = (G) org.kermeta.compil.runtime.helper.basetypes.IteratorUtil
				.next(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isOff() {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper.not(this.hasNext());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StandardPackage.ITERATOR__JAVA_ITERATOR:
			return getJavaIterator();
		case StandardPackage.ITERATOR__KERMETA_COLLECTION:
			if (resolve)
				return getKermetaCollection();
			return basicGetKermetaCollection();
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
		case StandardPackage.ITERATOR__JAVA_ITERATOR:
			setJavaIterator((java.util.Iterator<G>) newValue);
			return;
		case StandardPackage.ITERATOR__KERMETA_COLLECTION:
			setKermetaCollection((Collection<G>) newValue);
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
		case StandardPackage.ITERATOR__JAVA_ITERATOR:
			setJavaIterator((java.util.Iterator<G>) null);
			return;
		case StandardPackage.ITERATOR__KERMETA_COLLECTION:
			setKermetaCollection((Collection<G>) null);
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
		case StandardPackage.ITERATOR__JAVA_ITERATOR:
			return javaIterator != null;
		case StandardPackage.ITERATOR__KERMETA_COLLECTION:
			return kermetaCollection != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (javaIterator: ");
		result.append(javaIterator);
		result.append(')');
		return result.toString();
	}

} //IteratorImpl
