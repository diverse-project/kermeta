/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMMethodImpl.java,v 1.2 2008-10-16 13:17:44 cfaucher Exp $
 */
package simk.impl;

import ecore.EAttribute;
import ecore.EOperation;
import ecore.EReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simk.SMAccess;
import simk.SMContext;
import simk.SMMethod;
import simk.SMParameter;
import simk.SMReturn;
import simk.SMUsage;
import simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simk.impl.SMMethodImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getParentEReference <em>Parent EReference</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getParentEOperation <em>Parent EOperation</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getParentEAttribute <em>Parent EAttribute</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link simk.impl.SMMethodImpl#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMMethodImpl extends SMNamedElementImpl implements SMMethod {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentEReference() <em>Parent EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference parentEReference;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected String typeParameters = TYPE_PARAMETERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentEOperation() <em>Parent EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation parentEOperation;

	/**
	 * The cached value of the '{@link #getParentEAttribute() <em>Parent EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute parentEAttribute;

	/**
	 * The cached value of the '{@link #getSMParameters() <em>SM Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SMParameter> sMParameters;

	/**
	 * The cached value of the '{@link #getSMReturn() <em>SM Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMReturn()
	 * @generated
	 * @ordered
	 */
	protected SMReturn sMReturn;

	/**
	 * The cached value of the '{@link #getSMContext() <em>SM Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMContext()
	 * @generated
	 * @ordered
	 */
	protected SMContext sMContext;

	/**
	 * The default value of the '{@link #getUsages() <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected static final SMUsage USAGES_EDEFAULT = SMUsage.DEFAULT;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected SMUsage usages = USAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final SMAccess ACCESS_EDEFAULT = SMAccess.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected SMAccess access = ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMMethodImpl() {
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
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentEReference() {
		if (parentEReference != null && parentEReference.eIsProxy()) {
			InternalEObject oldParentEReference = (InternalEObject) parentEReference;
			parentEReference = (EReference) eResolveProxy(oldParentEReference);
			if (parentEReference != oldParentEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.SM_METHOD__PARENT_EREFERENCE,
							oldParentEReference, parentEReference));
			}
		}
		return parentEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetParentEReference() {
		return parentEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEReference(EReference newParentEReference) {
		EReference oldParentEReference = parentEReference;
		parentEReference = newParentEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__PARENT_EREFERENCE,
					oldParentEReference, parentEReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeParameters() {
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParameters(String newTypeParameters) {
		String oldTypeParameters = typeParameters;
		typeParameters = newTypeParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__TYPE_PARAMETERS, oldTypeParameters,
					typeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParentEOperation() {
		if (parentEOperation != null && parentEOperation.eIsProxy()) {
			InternalEObject oldParentEOperation = (InternalEObject) parentEOperation;
			parentEOperation = (EOperation) eResolveProxy(oldParentEOperation);
			if (parentEOperation != oldParentEOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.SM_METHOD__PARENT_EOPERATION,
							oldParentEOperation, parentEOperation));
			}
		}
		return parentEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetParentEOperation() {
		return parentEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEOperation(EOperation newParentEOperation) {
		EOperation oldParentEOperation = parentEOperation;
		parentEOperation = newParentEOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__PARENT_EOPERATION,
					oldParentEOperation, parentEOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentEAttribute() {
		if (parentEAttribute != null && parentEAttribute.eIsProxy()) {
			InternalEObject oldParentEAttribute = (InternalEObject) parentEAttribute;
			parentEAttribute = (EAttribute) eResolveProxy(oldParentEAttribute);
			if (parentEAttribute != oldParentEAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.SM_METHOD__PARENT_EATTRIBUTE,
							oldParentEAttribute, parentEAttribute));
			}
		}
		return parentEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetParentEAttribute() {
		return parentEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEAttribute(EAttribute newParentEAttribute) {
		EAttribute oldParentEAttribute = parentEAttribute;
		parentEAttribute = newParentEAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__PARENT_EATTRIBUTE,
					oldParentEAttribute, parentEAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SMParameter> getSMParameters() {
		if (sMParameters == null) {
			sMParameters = new EObjectContainmentEList.Resolving<SMParameter>(
					SMParameter.class, this,
					SimkPackage.SM_METHOD__SM_PARAMETERS);
		}
		return sMParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMReturn getSMReturn() {
		if (sMReturn != null && sMReturn.eIsProxy()) {
			InternalEObject oldSMReturn = (InternalEObject) sMReturn;
			sMReturn = (SMReturn) eResolveProxy(oldSMReturn);
			if (sMReturn != oldSMReturn) {
				InternalEObject newSMReturn = (InternalEObject) sMReturn;
				NotificationChain msgs = oldSMReturn.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- SimkPackage.SM_METHOD__SM_RETURN, null, null);
				if (newSMReturn.eInternalContainer() == null) {
					msgs = newSMReturn.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- SimkPackage.SM_METHOD__SM_RETURN, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.SM_METHOD__SM_RETURN, oldSMReturn,
							sMReturn));
			}
		}
		return sMReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMReturn basicGetSMReturn() {
		return sMReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSMReturn(SMReturn newSMReturn,
			NotificationChain msgs) {
		SMReturn oldSMReturn = sMReturn;
		sMReturn = newSMReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, SimkPackage.SM_METHOD__SM_RETURN,
					oldSMReturn, newSMReturn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMReturn(SMReturn newSMReturn) {
		if (newSMReturn != sMReturn) {
			NotificationChain msgs = null;
			if (sMReturn != null)
				msgs = ((InternalEObject) sMReturn).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- SimkPackage.SM_METHOD__SM_RETURN, null, msgs);
			if (newSMReturn != null)
				msgs = ((InternalEObject) newSMReturn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- SimkPackage.SM_METHOD__SM_RETURN, null, msgs);
			msgs = basicSetSMReturn(newSMReturn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__SM_RETURN, newSMReturn, newSMReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext getSMContext() {
		if (sMContext != null && sMContext.eIsProxy()) {
			InternalEObject oldSMContext = (InternalEObject) sMContext;
			sMContext = (SMContext) eResolveProxy(oldSMContext);
			if (sMContext != oldSMContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.SM_METHOD__SM_CONTEXT, oldSMContext,
							sMContext));
			}
		}
		return sMContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext basicGetSMContext() {
		return sMContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSMContext(SMContext newSMContext,
			NotificationChain msgs) {
		SMContext oldSMContext = sMContext;
		sMContext = newSMContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, SimkPackage.SM_METHOD__SM_CONTEXT,
					oldSMContext, newSMContext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMContext(SMContext newSMContext) {
		if (newSMContext != sMContext) {
			NotificationChain msgs = null;
			if (sMContext != null)
				msgs = ((InternalEObject) sMContext).eInverseRemove(this,
						SimkPackage.SM_CONTEXT__SM_METHODS, SMContext.class,
						msgs);
			if (newSMContext != null)
				msgs = ((InternalEObject) newSMContext).eInverseAdd(this,
						SimkPackage.SM_CONTEXT__SM_METHODS, SMContext.class,
						msgs);
			msgs = basicSetSMContext(newSMContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__SM_CONTEXT, newSMContext,
					newSMContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMUsage getUsages() {
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsages(SMUsage newUsages) {
		SMUsage oldUsages = usages;
		usages = newUsages == null ? USAGES_EDEFAULT : newUsages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__USAGES, oldUsages, usages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMAccess getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(SMAccess newAccess) {
		SMAccess oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_METHOD__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapperUsage() {

		this.setUsages(simk.SMUsage.getByName("Wrapper"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParentEOperationFromModel() {
		ecore.EOperation result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimkPackage.SM_METHOD__SM_CONTEXT:
			if (sMContext != null)
				msgs = ((InternalEObject) sMContext).eInverseRemove(this,
						SimkPackage.SM_CONTEXT__SM_METHODS, SMContext.class,
						msgs);
			return basicSetSMContext((SMContext) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimkPackage.SM_METHOD__SM_PARAMETERS:
			return ((InternalEList<?>) getSMParameters()).basicRemove(otherEnd,
					msgs);
		case SimkPackage.SM_METHOD__SM_RETURN:
			return basicSetSMReturn(null, msgs);
		case SimkPackage.SM_METHOD__SM_CONTEXT:
			return basicSetSMContext(null, msgs);
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
		case SimkPackage.SM_METHOD__ABSTRACT:
			return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
		case SimkPackage.SM_METHOD__BODY:
			return getBody();
		case SimkPackage.SM_METHOD__PARENT_EREFERENCE:
			if (resolve)
				return getParentEReference();
			return basicGetParentEReference();
		case SimkPackage.SM_METHOD__STATIC:
			return isStatic() ? Boolean.TRUE : Boolean.FALSE;
		case SimkPackage.SM_METHOD__TYPE_PARAMETERS:
			return getTypeParameters();
		case SimkPackage.SM_METHOD__PARENT_EOPERATION:
			if (resolve)
				return getParentEOperation();
			return basicGetParentEOperation();
		case SimkPackage.SM_METHOD__PARENT_EATTRIBUTE:
			if (resolve)
				return getParentEAttribute();
			return basicGetParentEAttribute();
		case SimkPackage.SM_METHOD__SM_PARAMETERS:
			return getSMParameters();
		case SimkPackage.SM_METHOD__SM_RETURN:
			if (resolve)
				return getSMReturn();
			return basicGetSMReturn();
		case SimkPackage.SM_METHOD__SM_CONTEXT:
			if (resolve)
				return getSMContext();
			return basicGetSMContext();
		case SimkPackage.SM_METHOD__USAGES:
			return getUsages();
		case SimkPackage.SM_METHOD__ACCESS:
			return getAccess();
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
		case SimkPackage.SM_METHOD__ABSTRACT:
			setAbstract(((Boolean) newValue).booleanValue());
			return;
		case SimkPackage.SM_METHOD__BODY:
			setBody((String) newValue);
			return;
		case SimkPackage.SM_METHOD__PARENT_EREFERENCE:
			setParentEReference((EReference) newValue);
			return;
		case SimkPackage.SM_METHOD__STATIC:
			setStatic(((Boolean) newValue).booleanValue());
			return;
		case SimkPackage.SM_METHOD__TYPE_PARAMETERS:
			setTypeParameters((String) newValue);
			return;
		case SimkPackage.SM_METHOD__PARENT_EOPERATION:
			setParentEOperation((EOperation) newValue);
			return;
		case SimkPackage.SM_METHOD__PARENT_EATTRIBUTE:
			setParentEAttribute((EAttribute) newValue);
			return;
		case SimkPackage.SM_METHOD__SM_PARAMETERS:
			getSMParameters().clear();
			getSMParameters().addAll(
					(Collection<? extends SMParameter>) newValue);
			return;
		case SimkPackage.SM_METHOD__SM_RETURN:
			setSMReturn((SMReturn) newValue);
			return;
		case SimkPackage.SM_METHOD__SM_CONTEXT:
			setSMContext((SMContext) newValue);
			return;
		case SimkPackage.SM_METHOD__USAGES:
			setUsages((SMUsage) newValue);
			return;
		case SimkPackage.SM_METHOD__ACCESS:
			setAccess((SMAccess) newValue);
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
		case SimkPackage.SM_METHOD__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case SimkPackage.SM_METHOD__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case SimkPackage.SM_METHOD__PARENT_EREFERENCE:
			setParentEReference((EReference) null);
			return;
		case SimkPackage.SM_METHOD__STATIC:
			setStatic(STATIC_EDEFAULT);
			return;
		case SimkPackage.SM_METHOD__TYPE_PARAMETERS:
			setTypeParameters(TYPE_PARAMETERS_EDEFAULT);
			return;
		case SimkPackage.SM_METHOD__PARENT_EOPERATION:
			setParentEOperation((EOperation) null);
			return;
		case SimkPackage.SM_METHOD__PARENT_EATTRIBUTE:
			setParentEAttribute((EAttribute) null);
			return;
		case SimkPackage.SM_METHOD__SM_PARAMETERS:
			getSMParameters().clear();
			return;
		case SimkPackage.SM_METHOD__SM_RETURN:
			setSMReturn((SMReturn) null);
			return;
		case SimkPackage.SM_METHOD__SM_CONTEXT:
			setSMContext((SMContext) null);
			return;
		case SimkPackage.SM_METHOD__USAGES:
			setUsages(USAGES_EDEFAULT);
			return;
		case SimkPackage.SM_METHOD__ACCESS:
			setAccess(ACCESS_EDEFAULT);
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
		case SimkPackage.SM_METHOD__ABSTRACT:
			return abstract_ != ABSTRACT_EDEFAULT;
		case SimkPackage.SM_METHOD__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT
					.equals(body);
		case SimkPackage.SM_METHOD__PARENT_EREFERENCE:
			return parentEReference != null;
		case SimkPackage.SM_METHOD__STATIC:
			return static_ != STATIC_EDEFAULT;
		case SimkPackage.SM_METHOD__TYPE_PARAMETERS:
			return TYPE_PARAMETERS_EDEFAULT == null ? typeParameters != null
					: !TYPE_PARAMETERS_EDEFAULT.equals(typeParameters);
		case SimkPackage.SM_METHOD__PARENT_EOPERATION:
			return parentEOperation != null;
		case SimkPackage.SM_METHOD__PARENT_EATTRIBUTE:
			return parentEAttribute != null;
		case SimkPackage.SM_METHOD__SM_PARAMETERS:
			return sMParameters != null && !sMParameters.isEmpty();
		case SimkPackage.SM_METHOD__SM_RETURN:
			return sMReturn != null;
		case SimkPackage.SM_METHOD__SM_CONTEXT:
			return sMContext != null;
		case SimkPackage.SM_METHOD__USAGES:
			return usages != USAGES_EDEFAULT;
		case SimkPackage.SM_METHOD__ACCESS:
			return access != ACCESS_EDEFAULT;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", body: ");
		result.append(body);
		result.append(", static: ");
		result.append(static_);
		result.append(", typeParameters: ");
		result.append(typeParameters);
		result.append(", usages: ");
		result.append(usages);
		result.append(", access: ");
		result.append(access);
		result.append(')');
		return result.toString();
	}

} //SMMethodImpl
