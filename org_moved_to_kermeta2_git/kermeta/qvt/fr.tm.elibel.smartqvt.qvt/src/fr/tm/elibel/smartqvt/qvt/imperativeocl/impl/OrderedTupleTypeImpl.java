/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl.impl;

import fr.tm.elibel.smartqvt.qvt.emof.Type;

import fr.tm.elibel.smartqvt.qvt.emof.impl.ClassImpl;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage;
import fr.tm.elibel.smartqvt.qvt.imperativeocl.OrderedTupleType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.impl.OrderedTupleTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderedTupleTypeImpl extends ClassImpl implements OrderedTupleType {
	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected EList elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedTupleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImperativeoclPackage.Literals.ORDERED_TUPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementType() {
		if (elementType == null) {
			elementType = new EObjectResolvingEList(Type.class, this, ImperativeoclPackage.ORDERED_TUPLE_TYPE__ELEMENT_TYPE);
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImperativeoclPackage.ORDERED_TUPLE_TYPE__ELEMENT_TYPE:
				return getElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImperativeoclPackage.ORDERED_TUPLE_TYPE__ELEMENT_TYPE:
				getElementType().clear();
				getElementType().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImperativeoclPackage.ORDERED_TUPLE_TYPE__ELEMENT_TYPE:
				getElementType().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImperativeoclPackage.ORDERED_TUPLE_TYPE__ELEMENT_TYPE:
				return elementType != null && !elementType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderedTupleTypeImpl
