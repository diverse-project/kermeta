/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kontext.impl;

import java.util.Collection;

import kontext.ContextToTaskConstraint;
import kontext.Expression;
import kontext.KontextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.ki.task.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context To Task Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kontext.impl.ContextToTaskConstraintImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link kontext.impl.ContextToTaskConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link kontext.impl.ContextToTaskConstraintImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link kontext.impl.ContextToTaskConstraintImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextToTaskConstraintImpl extends EObjectImpl implements ContextToTaskConstraint {
	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected Expression exp;

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
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> classes;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextToTaskConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KontextPackage.Literals.CONTEXT_TO_TASK_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs) {
		Expression oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp(Expression newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP, newExp, newExp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList<EClass>(EClass.class, this, KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP:
				return basicSetExp(null, msgs);
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
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP:
				return getExp();
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__NAME:
				return getName();
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__CLASSES:
				return getClasses();
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__TASKS:
				return getTasks();
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
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP:
				setExp((Expression)newValue);
				return;
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends EClass>)newValue);
				return;
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP:
				setExp((Expression)null);
				return;
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__CLASSES:
				getClasses().clear();
				return;
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__TASKS:
				getTasks().clear();
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
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__EXP:
				return exp != null;
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__CLASSES:
				return classes != null && !classes.isEmpty();
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT__TASKS:
				return tasks != null && !tasks.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContextToTaskConstraintImpl
