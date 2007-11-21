/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompUnitImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.CompUnit;
import gymnast.HeaderSection;
import gymnast.Rule;
import gymnast.gymnastPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.CompUnitImpl#getHeaderSection <em>Header Section</em>}</li>
 *   <li>{@link gymnast.impl.CompUnitImpl#getGrammar <em>Grammar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompUnitImpl extends EObjectImpl implements CompUnit {
	/**
	 * The cached value of the '{@link #getHeaderSection() <em>Header Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderSection()
	 * @generated
	 * @ordered
	 */
	protected HeaderSection headerSection = null;

	/**
	 * The cached value of the '{@link #getGrammar() <em>Grammar</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> grammar = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.COMP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderSection getHeaderSection() {
		if (headerSection != null && headerSection.eIsProxy()) {
			InternalEObject oldHeaderSection = (InternalEObject)headerSection;
			headerSection = (HeaderSection)eResolveProxy(oldHeaderSection);
			if (headerSection != oldHeaderSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.COMP_UNIT__HEADER_SECTION, oldHeaderSection, headerSection));
			}
		}
		return headerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderSection basicGetHeaderSection() {
		return headerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderSection(HeaderSection newHeaderSection) {
		HeaderSection oldHeaderSection = headerSection;
		headerSection = newHeaderSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.COMP_UNIT__HEADER_SECTION, oldHeaderSection, headerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getGrammar() {
		if (grammar == null) {
			grammar = new EObjectResolvingEList<Rule>(Rule.class, this, gymnastPackage.COMP_UNIT__GRAMMAR);
		}
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.COMP_UNIT__HEADER_SECTION:
				if (resolve) return getHeaderSection();
				return basicGetHeaderSection();
			case gymnastPackage.COMP_UNIT__GRAMMAR:
				return getGrammar();
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
			case gymnastPackage.COMP_UNIT__HEADER_SECTION:
				setHeaderSection((HeaderSection)newValue);
				return;
			case gymnastPackage.COMP_UNIT__GRAMMAR:
				getGrammar().clear();
				getGrammar().addAll((Collection<? extends Rule>)newValue);
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
			case gymnastPackage.COMP_UNIT__HEADER_SECTION:
				setHeaderSection((HeaderSection)null);
				return;
			case gymnastPackage.COMP_UNIT__GRAMMAR:
				getGrammar().clear();
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
			case gymnastPackage.COMP_UNIT__HEADER_SECTION:
				return headerSection != null;
			case gymnastPackage.COMP_UNIT__GRAMMAR:
				return grammar != null && !grammar.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompUnitImpl
