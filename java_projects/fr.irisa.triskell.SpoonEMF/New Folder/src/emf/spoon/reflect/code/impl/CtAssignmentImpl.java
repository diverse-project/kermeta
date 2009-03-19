/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAssignmentImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.code.CtStatement;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtAssignment;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtAssignmentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtAssignmentImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtAssignmentImpl#getAssigned <em>Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtAssignmentImpl extends CtExpressionImpl implements CtAssignment {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected CtExpression assignment = null;

	/**
	 * The cached value of the '{@link #getAssigned() <em>Assigned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigned()
	 * @generated
	 * @ordered
	 */
	protected CtExpression assigned = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_ASSIGNMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getAssignment() {
		if (assignment != null && assignment.eIsProxy()) {
			InternalEObject oldAssignment = (InternalEObject)assignment;
			assignment = (CtExpression)eResolveProxy(oldAssignment);
			if (assignment != oldAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_ASSIGNMENT__ASSIGNMENT, oldAssignment, assignment));
			}
		}
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(CtExpression newAssignment) {
		CtExpression oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_ASSIGNMENT__ASSIGNMENT, oldAssignment, assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getAssigned() {
		if (assigned != null && assigned.eIsProxy()) {
			InternalEObject oldAssigned = (InternalEObject)assigned;
			assigned = (CtExpression)eResolveProxy(oldAssigned);
			if (assigned != oldAssigned) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_ASSIGNMENT__ASSIGNED, oldAssigned, assigned));
			}
		}
		return assigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetAssigned() {
		return assigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssigned(CtExpression newAssigned) {
		CtExpression oldAssigned = assigned;
		assigned = newAssigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_ASSIGNMENT__ASSIGNED, oldAssigned, assigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_ASSIGNMENT__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_ASSIGNMENT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_ASSIGNMENT__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_ASSIGNMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_ASSIGNMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_ASSIGNMENT__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_ASSIGNMENT__LABEL:
				return getLabel();
			case CodePackage.CT_ASSIGNMENT__ASSIGNMENT:
				if (resolve) return getAssignment();
				return basicGetAssignment();
			case CodePackage.CT_ASSIGNMENT__ASSIGNED:
				if (resolve) return getAssigned();
				return basicGetAssigned();
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
			case CodePackage.CT_ASSIGNMENT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__ASSIGNMENT:
				setAssignment((CtExpression)newValue);
				return;
			case CodePackage.CT_ASSIGNMENT__ASSIGNED:
				setAssigned((CtExpression)newValue);
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
			case CodePackage.CT_ASSIGNMENT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_ASSIGNMENT__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_ASSIGNMENT__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_ASSIGNMENT__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_ASSIGNMENT__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_ASSIGNMENT__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_ASSIGNMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_ASSIGNMENT__ASSIGNMENT:
				setAssignment((CtExpression)null);
				return;
			case CodePackage.CT_ASSIGNMENT__ASSIGNED:
				setAssigned((CtExpression)null);
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
			case CodePackage.CT_ASSIGNMENT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_ASSIGNMENT__POSITION:
				return position != null;
			case CodePackage.CT_ASSIGNMENT__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_ASSIGNMENT__PARENT:
				return parent != null;
			case CodePackage.CT_ASSIGNMENT__TYPE:
				return type != null;
			case CodePackage.CT_ASSIGNMENT__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_ASSIGNMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_ASSIGNMENT__ASSIGNMENT:
				return assignment != null;
			case CodePackage.CT_ASSIGNMENT__ASSIGNED:
				return assigned != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_ASSIGNMENT__LABEL: return CodePackage.CT_STATEMENT__LABEL;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtAssignment.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == CtStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_STATEMENT__LABEL: return CodePackage.CT_ASSIGNMENT__LABEL;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtAssignment.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //CtAssignmentImpl