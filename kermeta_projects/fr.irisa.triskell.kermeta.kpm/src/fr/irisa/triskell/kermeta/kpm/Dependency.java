/**
 * <copyright>
 * </copyright>
 *
 * $Id: Dependency.java,v 1.4 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

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
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getIn <em>In</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getOuts <em>Outs</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Dependency#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.In#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(In)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_In()
	 * @see fr.irisa.triskell.kermeta.kpm.In#getDependency
	 * @model opposite="dependency" containment="true"
	 * @generated
	 */
	In getIn();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(In value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Outs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Out}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Out#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outs</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDependency_Outs()
	 * @see fr.irisa.triskell.kermeta.kpm.Out#getDependency
	 * @model type="fr.irisa.triskell.kermeta.kpm.Out" opposite="dependency" containment="true"
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="fr.irisa.triskell.kermeta.kpm.IProgressMonitor"
	 * @generated
	 */
	void process(Unit unit, boolean synchrone, Map args, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEvent(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Out findOut(String actionId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeOut(String actionId);

} // Dependency