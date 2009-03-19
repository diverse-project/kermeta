/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAbstractInvocationImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtAbstractInvocation;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.declaration.impl.CtElementImpl;
import emf.spoon.reflect.reference.CtExecutableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Abstract Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtAbstractInvocationImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtAbstractInvocationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtAbstractInvocationImpl extends CtElementImpl implements CtAbstractInvocation {
	/**
	 * The cached value of the '{@link #getExecutable() <em>Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected CtExecutableReference executable = null;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList arguments = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtAbstractInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_ABSTRACT_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutableReference getExecutable() {
		if (executable != null && executable.eIsProxy()) {
			InternalEObject oldExecutable = (InternalEObject)executable;
			executable = (CtExecutableReference)eResolveProxy(oldExecutable);
			if (executable != oldExecutable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_ABSTRACT_INVOCATION__EXECUTABLE, oldExecutable, executable));
			}
		}
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutableReference basicGetExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(CtExecutableReference newExecutable) {
		CtExecutableReference oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_ABSTRACT_INVOCATION__EXECUTABLE, oldExecutable, executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList(CtExpression.class, this, CodePackage.CT_ABSTRACT_INVOCATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_ABSTRACT_INVOCATION__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_ABSTRACT_INVOCATION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_ABSTRACT_INVOCATION__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_ABSTRACT_INVOCATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_ABSTRACT_INVOCATION__EXECUTABLE:
				if (resolve) return getExecutable();
				return basicGetExecutable();
			case CodePackage.CT_ABSTRACT_INVOCATION__ARGUMENTS:
				return getArguments();
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
			case CodePackage.CT_ABSTRACT_INVOCATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__EXECUTABLE:
				setExecutable((CtExecutableReference)newValue);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
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
			case CodePackage.CT_ABSTRACT_INVOCATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__EXECUTABLE:
				setExecutable((CtExecutableReference)null);
				return;
			case CodePackage.CT_ABSTRACT_INVOCATION__ARGUMENTS:
				getArguments().clear();
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
			case CodePackage.CT_ABSTRACT_INVOCATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_ABSTRACT_INVOCATION__POSITION:
				return position != null;
			case CodePackage.CT_ABSTRACT_INVOCATION__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_ABSTRACT_INVOCATION__PARENT:
				return parent != null;
			case CodePackage.CT_ABSTRACT_INVOCATION__EXECUTABLE:
				return executable != null;
			case CodePackage.CT_ABSTRACT_INVOCATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CtAbstractInvocationImpl