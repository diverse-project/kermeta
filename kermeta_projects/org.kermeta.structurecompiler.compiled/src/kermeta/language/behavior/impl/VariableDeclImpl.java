/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclImpl.java,v 1.4 2008-10-08 14:37:39 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.TypeReference;
import kermeta.language.behavior.VariableDecl;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.VariableDeclImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.VariableDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.VariableDeclImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclImpl extends ExpressionImpl implements VariableDecl {
	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected Expression initialization;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference type;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.VARIABLE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialization() {
		if (initialization != null && initialization.eIsProxy()) {
			InternalEObject oldInitialization = (InternalEObject) initialization;
			initialization = (Expression) eResolveProxy(oldInitialization);
			if (initialization != oldInitialization) {
				InternalEObject newInitialization = (InternalEObject) initialization;
				NotificationChain msgs = oldInitialization
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- BehaviorPackage.VARIABLE_DECL__INITIALIZATION,
								null, null);
				if (newInitialization.eInternalContainer() == null) {
					msgs = newInitialization
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- BehaviorPackage.VARIABLE_DECL__INITIALIZATION,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.VARIABLE_DECL__INITIALIZATION,
							oldInitialization, initialization));
			}
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialization(
			Expression newInitialization, NotificationChain msgs) {
		Expression oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					BehaviorPackage.VARIABLE_DECL__INITIALIZATION,
					oldInitialization, newInitialization);
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
	public void setInitialization(Expression newInitialization) {
		if (newInitialization != initialization) {
			NotificationChain msgs = null;
			if (initialization != null)
				msgs = ((InternalEObject) initialization)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- BehaviorPackage.VARIABLE_DECL__INITIALIZATION,
								null, msgs);
			if (newInitialization != null)
				msgs = ((InternalEObject) newInitialization)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- BehaviorPackage.VARIABLE_DECL__INITIALIZATION,
								null, msgs);
			msgs = basicSetInitialization(newInitialization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.VARIABLE_DECL__INITIALIZATION,
					newInitialization, newInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (TypeReference) eResolveProxy(oldType);
			if (type != oldType) {
				InternalEObject newType = (InternalEObject) type;
				NotificationChain msgs = oldType.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.VARIABLE_DECL__TYPE, null,
						null);
				if (newType.eInternalContainer() == null) {
					msgs = newType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- BehaviorPackage.VARIABLE_DECL__TYPE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.VARIABLE_DECL__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeReference newType,
			NotificationChain msgs) {
		TypeReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.VARIABLE_DECL__TYPE,
					oldType, newType);
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
	public void setType(TypeReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.VARIABLE_DECL__TYPE, null,
						msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.VARIABLE_DECL__TYPE, null,
						msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.VARIABLE_DECL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.VARIABLE_DECL__IDENTIFIER, oldIdentifier,
					identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = "";

		java.lang.String localType = this.getStaticType().createBehaviorJava(
				context);

		java.lang.String var_id = kermeta.standard.helper.StringWrapper
				.plus(
						((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("km2ecore.helper.java.IdentifierHelper"))
								.getMangledIdentifier(this.getIdentifier(),
										context), context.printFtSuffix());

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(result,
								localType), " "), var_id);

		java.lang.Boolean idIfCond_669 = false;
		idIfCond_669 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.getInitialization()));

		if (idIfCond_669) {

			java.lang.Boolean idIfCond_670 = false;
			idIfCond_670 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							this.getInitialization(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.Conditional"));

			if (idIfCond_670) {

				context.getResultLastStatementStack().push(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus(var_id, " = "), context
												.getTYPE_SEPARATOR()),
								localType));

				result = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(result,
								" = null;\n"), this.getInitialization()
								.createBehaviorJava(context));

				context.getResultLastStatementStack().pop();
			} else {

				result = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(result,
								" = "), this.getInitialization()
								.createBehaviorJava(context));
			}

		} else {

			result = kermeta.standard.helper.StringWrapper.plus(result,
					" = null;");
		}

		return result;

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
		case BehaviorPackage.VARIABLE_DECL__INITIALIZATION:
			return basicSetInitialization(null, msgs);
		case BehaviorPackage.VARIABLE_DECL__TYPE:
			return basicSetType(null, msgs);
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
		case BehaviorPackage.VARIABLE_DECL__INITIALIZATION:
			if (resolve)
				return getInitialization();
			return basicGetInitialization();
		case BehaviorPackage.VARIABLE_DECL__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case BehaviorPackage.VARIABLE_DECL__IDENTIFIER:
			return getIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviorPackage.VARIABLE_DECL__INITIALIZATION:
			setInitialization((Expression) newValue);
			return;
		case BehaviorPackage.VARIABLE_DECL__TYPE:
			setType((TypeReference) newValue);
			return;
		case BehaviorPackage.VARIABLE_DECL__IDENTIFIER:
			setIdentifier((String) newValue);
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
		case BehaviorPackage.VARIABLE_DECL__INITIALIZATION:
			setInitialization((Expression) null);
			return;
		case BehaviorPackage.VARIABLE_DECL__TYPE:
			setType((TypeReference) null);
			return;
		case BehaviorPackage.VARIABLE_DECL__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
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
		case BehaviorPackage.VARIABLE_DECL__INITIALIZATION:
			return initialization != null;
		case BehaviorPackage.VARIABLE_DECL__TYPE:
			return type != null;
		case BehaviorPackage.VARIABLE_DECL__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null
					: !IDENTIFIER_EDEFAULT.equals(identifier);
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //VariableDeclImpl
