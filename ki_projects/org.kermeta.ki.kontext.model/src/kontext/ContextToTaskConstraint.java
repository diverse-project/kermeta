/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kontext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.kermeta.ki.task.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context To Task Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kontext.ContextToTaskConstraint#getExp <em>Exp</em>}</li>
 *   <li>{@link kontext.ContextToTaskConstraint#getName <em>Name</em>}</li>
 *   <li>{@link kontext.ContextToTaskConstraint#getClasses <em>Classes</em>}</li>
 *   <li>{@link kontext.ContextToTaskConstraint#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see kontext.KontextPackage#getContextToTaskConstraint()
 * @model
 * @generated
 */
public interface ContextToTaskConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Expression)
	 * @see kontext.KontextPackage#getContextToTaskConstraint_Exp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link kontext.ContextToTaskConstraint#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kontext.KontextPackage#getContextToTaskConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kontext.ContextToTaskConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see kontext.KontextPackage#getContextToTaskConstraint_Classes()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.ki.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see kontext.KontextPackage#getContextToTaskConstraint_Tasks()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // ContextToTaskConstraint
