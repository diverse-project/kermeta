/**
 * $Id: StaticMethodImpl.java,v 1.6 2008-08-18 13:06:15 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: StaticMethodImpl.java,v 1.6 2008-08-18 13:06:15 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.EReference;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMParameter;
import org.kermeta.simk.SMReturn;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.SimkPackage;
import org.kermeta.simk.StaticMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getParentMethod <em>Parent Method</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getParentReference <em>Parent Reference</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.StaticMethodImpl#getParentAttribute <em>Parent Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticMethodImpl extends SMNamedElementImpl implements StaticMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.STATIC_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SMParameter> getSMParameters() {
		return (EList<SMParameter>)eGet(SimkPackage.Literals.STATIC_METHOD__SM_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMReturn getSMReturn() {
		return (SMReturn)eGet(SimkPackage.Literals.STATIC_METHOD__SM_RETURN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMReturn(SMReturn newSMReturn) {
		eSet(SimkPackage.Literals.STATIC_METHOD__SM_RETURN, newSMReturn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext getSMContext() {
		return (SMContext)eGet(SimkPackage.Literals.STATIC_METHOD__SM_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMContext(SMContext newSMContext) {
		eSet(SimkPackage.Literals.STATIC_METHOD__SM_CONTEXT, newSMContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(SimkPackage.Literals.STATIC_METHOD__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(SimkPackage.Literals.STATIC_METHOD__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return (String)eGet(SimkPackage.Literals.STATIC_METHOD__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		eSet(SimkPackage.Literals.STATIC_METHOD__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SMUsage getUsages() {
		return (SMUsage)eGet(SimkPackage.Literals.STATIC_METHOD__USAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsages(SMUsage newUsages) {
		eSet(SimkPackage.Literals.STATIC_METHOD__USAGES, newUsages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParentMethod() {
		return (EOperation)eGet(SimkPackage.Literals.STATIC_METHOD__PARENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMethod(EOperation newParentMethod) {
		eSet(SimkPackage.Literals.STATIC_METHOD__PARENT_METHOD, newParentMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentReference() {
		return (EReference)eGet(SimkPackage.Literals.STATIC_METHOD__PARENT_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentReference(EReference newParentReference) {
		eSet(SimkPackage.Literals.STATIC_METHOD__PARENT_REFERENCE, newParentReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAttribute() {
		return (EAttribute)eGet(SimkPackage.Literals.STATIC_METHOD__PARENT_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAttribute(EAttribute newParentAttribute) {
		eSet(SimkPackage.Literals.STATIC_METHOD__PARENT_ATTRIBUTE, newParentAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParentMethodFromModel() {
		return getParentMethod();
	}

} //StaticMethodImpl
