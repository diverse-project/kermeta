/**
 * $Id: SMMethodImpl.java,v 1.1 2008-09-25 08:50:46 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMMethodImpl.java,v 1.1 2008-09-25 08:50:46 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

import org.kermeta.simk.SMAccess;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMMethod;
import org.kermeta.simk.SMParameter;
import org.kermeta.simk.SMReturn;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getParentEOperation <em>Parent EOperation</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getParentEReference <em>Parent EReference</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getParentEAttribute <em>Parent EAttribute</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMMethodImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMMethodImpl extends SMNamedElementImpl implements SMMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SM_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SMParameter> getSMParameters() {
		return (EList<SMParameter>)eGet(SimkPackage.Literals.SM_METHOD__SM_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMReturn getSMReturn() {
		return (SMReturn)eGet(SimkPackage.Literals.SM_METHOD__SM_RETURN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMReturn(SMReturn newSMReturn) {
		eSet(SimkPackage.Literals.SM_METHOD__SM_RETURN, newSMReturn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext getSMContext() {
		return (SMContext)eGet(SimkPackage.Literals.SM_METHOD__SM_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMContext(SMContext newSMContext) {
		eSet(SimkPackage.Literals.SM_METHOD__SM_CONTEXT, newSMContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeParameters() {
		return (String)eGet(SimkPackage.Literals.SM_METHOD__TYPE_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParameters(String newTypeParameters) {
		eSet(SimkPackage.Literals.SM_METHOD__TYPE_PARAMETERS, newTypeParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return (String)eGet(SimkPackage.Literals.SM_METHOD__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		eSet(SimkPackage.Literals.SM_METHOD__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMUsage getUsages() {
		return (SMUsage)eGet(SimkPackage.Literals.SM_METHOD__USAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsages(SMUsage newUsages) {
		eSet(SimkPackage.Literals.SM_METHOD__USAGES, newUsages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParentEOperation() {
		return (EOperation)eGet(SimkPackage.Literals.SM_METHOD__PARENT_EOPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEOperation(EOperation newParentEOperation) {
		eSet(SimkPackage.Literals.SM_METHOD__PARENT_EOPERATION, newParentEOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentEReference() {
		return (EReference)eGet(SimkPackage.Literals.SM_METHOD__PARENT_EREFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEReference(EReference newParentEReference) {
		eSet(SimkPackage.Literals.SM_METHOD__PARENT_EREFERENCE, newParentEReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentEAttribute() {
		return (EAttribute)eGet(SimkPackage.Literals.SM_METHOD__PARENT_EATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEAttribute(EAttribute newParentEAttribute) {
		eSet(SimkPackage.Literals.SM_METHOD__PARENT_EATTRIBUTE, newParentEAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMAccess getAccess() {
		return (SMAccess)eGet(SimkPackage.Literals.SM_METHOD__ACCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(SMAccess newAccess) {
		eSet(SimkPackage.Literals.SM_METHOD__ACCESS, newAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return ((Boolean)eGet(SimkPackage.Literals.SM_METHOD__STATIC, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		eSet(SimkPackage.Literals.SM_METHOD__STATIC, new Boolean(newStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return ((Boolean)eGet(SimkPackage.Literals.SM_METHOD__ABSTRACT, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		eSet(SimkPackage.Literals.SM_METHOD__ABSTRACT, new Boolean(newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParentEOperationFromModel() {
		return getParentEOperation();
	}

} //SMMethodImpl
