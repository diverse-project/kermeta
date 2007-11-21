/**
 * <copyright>
 * </copyright>
 *
 * $Id: AltRuleDeclImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.AltRuleDecl;
import gymnast.AltRuleKind;
import gymnast.Attrs;
import gymnast.gymnastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alt Rule Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.AltRuleDeclImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gymnast.impl.AltRuleDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link gymnast.impl.AltRuleDeclImpl#getAttrs <em>Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AltRuleDeclImpl extends EObjectImpl implements AltRuleDecl {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final AltRuleKind KIND_EDEFAULT = AltRuleKind.ABSTRACT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected AltRuleKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrs()
	 * @generated
	 * @ordered
	 */
	protected Attrs attrs = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltRuleDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.ALT_RULE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(AltRuleKind newKind) {
		AltRuleKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.ALT_RULE_DECL__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.ALT_RULE_DECL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attrs getAttrs() {
		if (attrs != null && attrs.eIsProxy()) {
			InternalEObject oldAttrs = (InternalEObject)attrs;
			attrs = (Attrs)eResolveProxy(oldAttrs);
			if (attrs != oldAttrs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.ALT_RULE_DECL__ATTRS, oldAttrs, attrs));
			}
		}
		return attrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attrs basicGetAttrs() {
		return attrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrs(Attrs newAttrs) {
		Attrs oldAttrs = attrs;
		attrs = newAttrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.ALT_RULE_DECL__ATTRS, oldAttrs, attrs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.ALT_RULE_DECL__KIND:
				return getKind();
			case gymnastPackage.ALT_RULE_DECL__NAME:
				return getName();
			case gymnastPackage.ALT_RULE_DECL__ATTRS:
				if (resolve) return getAttrs();
				return basicGetAttrs();
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
			case gymnastPackage.ALT_RULE_DECL__KIND:
				setKind((AltRuleKind)newValue);
				return;
			case gymnastPackage.ALT_RULE_DECL__NAME:
				setName((String)newValue);
				return;
			case gymnastPackage.ALT_RULE_DECL__ATTRS:
				setAttrs((Attrs)newValue);
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
			case gymnastPackage.ALT_RULE_DECL__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case gymnastPackage.ALT_RULE_DECL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case gymnastPackage.ALT_RULE_DECL__ATTRS:
				setAttrs((Attrs)null);
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
			case gymnastPackage.ALT_RULE_DECL__KIND:
				return kind != KIND_EDEFAULT;
			case gymnastPackage.ALT_RULE_DECL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case gymnastPackage.ALT_RULE_DECL__ATTRS:
				return attrs != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AltRuleDeclImpl
