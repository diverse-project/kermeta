/**
 * <copyright>
 * </copyright>
 *
 * $Id: Dependency.java,v 1.2 2006-12-12 16:06:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getIn <em>In</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getOuts <em>Outs</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DependencyType)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Type()
	 * @model required="true"
	 * @generated
	 */
	DependencyType getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DependencyType value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(DependencyEvent)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Event()
	 * @model required="true"
	 * @generated
	 */
	DependencyEvent getEvent();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(DependencyEvent value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Actions()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Action"
	 * @generated
	 */
	EList getActions();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Expression)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_In()
	 * @model required="true"
	 * @generated
	 */
	Expression getIn();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Expression value);

	/**
	 * Returns the value of the '<em><b>Outs</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outs</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Outs()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Expression"
	 * @generated
	 */
	EList getOuts();

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
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Name()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean isExecutable(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean couldBeExecutable(Unit unit);

} // Dependency