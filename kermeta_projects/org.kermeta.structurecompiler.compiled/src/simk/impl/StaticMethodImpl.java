/**
 * <copyright>
 * </copyright>
 *
 * $Id: StaticMethodImpl.java,v 1.2 2008-09-11 12:34:39 cfaucher Exp $
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

import simk.SMContext;
import simk.SMParameter;
import simk.SMReturn;
import simk.SMUsage;
import simk.SimkPackage;
import simk.StaticMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simk.impl.StaticMethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getParentAttribute <em>Parent Attribute</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getParentMethod <em>Parent Method</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link simk.impl.StaticMethodImpl#getParentReference <em>Parent Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticMethodImpl extends SMNamedElementImpl implements
		StaticMethod {
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
	 * The cached value of the '{@link #getParentAttribute() <em>Parent Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute parentAttribute;

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
	 * The cached value of the '{@link #getParentMethod() <em>Parent Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentMethod()
	 * @generated
	 * @ordered
	 */
	protected EOperation parentMethod;

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
	 * The cached value of the '{@link #getParentReference() <em>Parent Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentReference()
	 * @generated
	 * @ordered
	 */
	protected EReference parentReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticMethodImpl() {
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
					SimkPackage.STATIC_METHOD__BODY, oldBody, body));
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
					SimkPackage.STATIC_METHOD__TYPE_PARAMETERS,
					oldTypeParameters, typeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAttribute() {
		if (parentAttribute != null && parentAttribute.eIsProxy()) {
			InternalEObject oldParentAttribute = (InternalEObject) parentAttribute;
			parentAttribute = (EAttribute) eResolveProxy(oldParentAttribute);
			if (parentAttribute != oldParentAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.STATIC_METHOD__PARENT_ATTRIBUTE,
							oldParentAttribute, parentAttribute));
			}
		}
		return parentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetParentAttribute() {
		return parentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAttribute(EAttribute newParentAttribute) {
		EAttribute oldParentAttribute = parentAttribute;
		parentAttribute = newParentAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.STATIC_METHOD__PARENT_ATTRIBUTE,
					oldParentAttribute, parentAttribute));
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
					SimkPackage.STATIC_METHOD__SM_PARAMETERS);
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
								- SimkPackage.STATIC_METHOD__SM_RETURN, null,
						null);
				if (newSMReturn.eInternalContainer() == null) {
					msgs = newSMReturn.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- SimkPackage.STATIC_METHOD__SM_RETURN, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.STATIC_METHOD__SM_RETURN, oldSMReturn,
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
					Notification.SET, SimkPackage.STATIC_METHOD__SM_RETURN,
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
								- SimkPackage.STATIC_METHOD__SM_RETURN, null,
						msgs);
			if (newSMReturn != null)
				msgs = ((InternalEObject) newSMReturn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- SimkPackage.STATIC_METHOD__SM_RETURN, null,
						msgs);
			msgs = basicSetSMReturn(newSMReturn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.STATIC_METHOD__SM_RETURN, newSMReturn,
					newSMReturn));
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
							SimkPackage.STATIC_METHOD__SM_CONTEXT,
							oldSMContext, sMContext));
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
					Notification.SET, SimkPackage.STATIC_METHOD__SM_CONTEXT,
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
						SimkPackage.SM_CONTEXT__STATIC_METHODS,
						SMContext.class, msgs);
			if (newSMContext != null)
				msgs = ((InternalEObject) newSMContext).eInverseAdd(this,
						SimkPackage.SM_CONTEXT__STATIC_METHODS,
						SMContext.class, msgs);
			msgs = basicSetSMContext(newSMContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.STATIC_METHOD__SM_CONTEXT, newSMContext,
					newSMContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParentMethod() {
		if (parentMethod != null && parentMethod.eIsProxy()) {
			InternalEObject oldParentMethod = (InternalEObject) parentMethod;
			parentMethod = (EOperation) eResolveProxy(oldParentMethod);
			if (parentMethod != oldParentMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.STATIC_METHOD__PARENT_METHOD,
							oldParentMethod, parentMethod));
			}
		}
		return parentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetParentMethod() {
		return parentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMethod(EOperation newParentMethod) {
		EOperation oldParentMethod = parentMethod;
		parentMethod = newParentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.STATIC_METHOD__PARENT_METHOD, oldParentMethod,
					parentMethod));
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
					SimkPackage.STATIC_METHOD__USAGES, oldUsages, usages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentReference() {
		if (parentReference != null && parentReference.eIsProxy()) {
			InternalEObject oldParentReference = (InternalEObject) parentReference;
			parentReference = (EReference) eResolveProxy(oldParentReference);
			if (parentReference != oldParentReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.STATIC_METHOD__PARENT_REFERENCE,
							oldParentReference, parentReference));
			}
		}
		return parentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetParentReference() {
		return parentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentReference(EReference newParentReference) {
		EReference oldParentReference = parentReference;
		parentReference = newParentReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.STATIC_METHOD__PARENT_REFERENCE,
					oldParentReference, parentReference));
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
	public EOperation getParentMethodFromModel() {
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
		case SimkPackage.STATIC_METHOD__SM_CONTEXT:
			if (sMContext != null)
				msgs = ((InternalEObject) sMContext).eInverseRemove(this,
						SimkPackage.SM_CONTEXT__STATIC_METHODS,
						SMContext.class, msgs);
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
		case SimkPackage.STATIC_METHOD__SM_PARAMETERS:
			return ((InternalEList<?>) getSMParameters()).basicRemove(otherEnd,
					msgs);
		case SimkPackage.STATIC_METHOD__SM_RETURN:
			return basicSetSMReturn(null, msgs);
		case SimkPackage.STATIC_METHOD__SM_CONTEXT:
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
		case SimkPackage.STATIC_METHOD__BODY:
			return getBody();
		case SimkPackage.STATIC_METHOD__TYPE_PARAMETERS:
			return getTypeParameters();
		case SimkPackage.STATIC_METHOD__PARENT_ATTRIBUTE:
			if (resolve)
				return getParentAttribute();
			return basicGetParentAttribute();
		case SimkPackage.STATIC_METHOD__SM_PARAMETERS:
			return getSMParameters();
		case SimkPackage.STATIC_METHOD__SM_RETURN:
			if (resolve)
				return getSMReturn();
			return basicGetSMReturn();
		case SimkPackage.STATIC_METHOD__SM_CONTEXT:
			if (resolve)
				return getSMContext();
			return basicGetSMContext();
		case SimkPackage.STATIC_METHOD__PARENT_METHOD:
			if (resolve)
				return getParentMethod();
			return basicGetParentMethod();
		case SimkPackage.STATIC_METHOD__USAGES:
			return getUsages();
		case SimkPackage.STATIC_METHOD__PARENT_REFERENCE:
			if (resolve)
				return getParentReference();
			return basicGetParentReference();
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
		case SimkPackage.STATIC_METHOD__BODY:
			setBody((String) newValue);
			return;
		case SimkPackage.STATIC_METHOD__TYPE_PARAMETERS:
			setTypeParameters((String) newValue);
			return;
		case SimkPackage.STATIC_METHOD__PARENT_ATTRIBUTE:
			setParentAttribute((EAttribute) newValue);
			return;
		case SimkPackage.STATIC_METHOD__SM_PARAMETERS:
			getSMParameters().clear();
			getSMParameters().addAll(
					(Collection<? extends SMParameter>) newValue);
			return;
		case SimkPackage.STATIC_METHOD__SM_RETURN:
			setSMReturn((SMReturn) newValue);
			return;
		case SimkPackage.STATIC_METHOD__SM_CONTEXT:
			setSMContext((SMContext) newValue);
			return;
		case SimkPackage.STATIC_METHOD__PARENT_METHOD:
			setParentMethod((EOperation) newValue);
			return;
		case SimkPackage.STATIC_METHOD__USAGES:
			setUsages((SMUsage) newValue);
			return;
		case SimkPackage.STATIC_METHOD__PARENT_REFERENCE:
			setParentReference((EReference) newValue);
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
		case SimkPackage.STATIC_METHOD__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case SimkPackage.STATIC_METHOD__TYPE_PARAMETERS:
			setTypeParameters(TYPE_PARAMETERS_EDEFAULT);
			return;
		case SimkPackage.STATIC_METHOD__PARENT_ATTRIBUTE:
			setParentAttribute((EAttribute) null);
			return;
		case SimkPackage.STATIC_METHOD__SM_PARAMETERS:
			getSMParameters().clear();
			return;
		case SimkPackage.STATIC_METHOD__SM_RETURN:
			setSMReturn((SMReturn) null);
			return;
		case SimkPackage.STATIC_METHOD__SM_CONTEXT:
			setSMContext((SMContext) null);
			return;
		case SimkPackage.STATIC_METHOD__PARENT_METHOD:
			setParentMethod((EOperation) null);
			return;
		case SimkPackage.STATIC_METHOD__USAGES:
			setUsages(USAGES_EDEFAULT);
			return;
		case SimkPackage.STATIC_METHOD__PARENT_REFERENCE:
			setParentReference((EReference) null);
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
		case SimkPackage.STATIC_METHOD__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT
					.equals(body);
		case SimkPackage.STATIC_METHOD__TYPE_PARAMETERS:
			return TYPE_PARAMETERS_EDEFAULT == null ? typeParameters != null
					: !TYPE_PARAMETERS_EDEFAULT.equals(typeParameters);
		case SimkPackage.STATIC_METHOD__PARENT_ATTRIBUTE:
			return parentAttribute != null;
		case SimkPackage.STATIC_METHOD__SM_PARAMETERS:
			return sMParameters != null && !sMParameters.isEmpty();
		case SimkPackage.STATIC_METHOD__SM_RETURN:
			return sMReturn != null;
		case SimkPackage.STATIC_METHOD__SM_CONTEXT:
			return sMContext != null;
		case SimkPackage.STATIC_METHOD__PARENT_METHOD:
			return parentMethod != null;
		case SimkPackage.STATIC_METHOD__USAGES:
			return usages != USAGES_EDEFAULT;
		case SimkPackage.STATIC_METHOD__PARENT_REFERENCE:
			return parentReference != null;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", typeParameters: ");
		result.append(typeParameters);
		result.append(", usages: ");
		result.append(usages);
		result.append(')');
		return result.toString();
	}

} //StaticMethodImpl
