/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAnnotationElementValueImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.declaration.CtAnnotationElementValue;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.reference.CtReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Annotation Element Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl#getKey <em>Key</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl#getValueElement <em>Value Element</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl#getMany <em>Many</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtAnnotationElementValueImpl extends EObjectImpl implements CtAnnotationElementValue {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected EList valueString = null;

	/**
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected EList valueRef = null;

	/**
	 * The cached value of the '{@link #getValueElement() <em>Value Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueElement()
	 * @generated
	 * @ordered
	 */
	protected EList valueElement = null;

	/**
	 * The default value of the '{@link #getMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMany()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMany()
	 * @generated
	 * @ordered
	 */
	protected Boolean many = MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtAnnotationElementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_ANNOTATION_ELEMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getValueString() {
		if (valueString == null) {
			valueString = new EDataTypeUniqueEList(String.class, this, DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING);
		}
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getValueRef() {
		if (valueRef == null) {
			valueRef = new EObjectResolvingEList(CtReference.class, this, DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF);
		}
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getValueElement() {
		if (valueElement == null) {
			valueElement = new EObjectResolvingEList(CtElement.class, this, DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT);
		}
		return valueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMany() {
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(Boolean newMany) {
		Boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__MANY, oldMany, many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__KEY:
				return getKey();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING:
				return getValueString();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF:
				return getValueRef();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT:
				return getValueElement();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__MANY:
				return getMany();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__KEY:
				setKey((String)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING:
				getValueString().clear();
				getValueString().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF:
				getValueRef().clear();
				getValueRef().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT:
				getValueElement().clear();
				getValueElement().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__MANY:
				setMany((Boolean)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING:
				getValueString().clear();
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF:
				getValueRef().clear();
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT:
				getValueElement().clear();
				return;
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__MANY:
				setMany(MANY_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING:
				return valueString != null && !valueString.isEmpty();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF:
				return valueRef != null && !valueRef.isEmpty();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT:
				return valueElement != null && !valueElement.isEmpty();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE__MANY:
				return MANY_EDEFAULT == null ? many != null : !MANY_EDEFAULT.equals(many);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", valueString: ");
		result.append(valueString);
		result.append(", Many: ");
		result.append(many);
		result.append(')');
		return result.toString();
	}

} //CtAnnotationElementValueImpl