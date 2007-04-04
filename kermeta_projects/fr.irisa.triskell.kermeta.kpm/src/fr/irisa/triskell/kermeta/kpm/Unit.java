/**
 * <copyright>
 * </copyright>
 *
 * $Id: Unit.java,v 1.10 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import java.util.Date;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getLastTimeModified <em>Last Time Modified</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getValue <em>Value</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getDependsOnUnits <em>Depends On Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getDependentUnits <em>Dependent Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Dependencies()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Dependency"
	 * @generated
	 */
	EList getDependencies();

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
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Time Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Time Modified</em>' attribute.
	 * @see #setLastTimeModified(Date)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_LastTimeModified()
	 * @model
	 * @generated
	 */
	Date getLastTimeModified();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getLastTimeModified <em>Last Time Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Time Modified</em>' attribute.
	 * @see #getLastTimeModified()
	 * @generated
	 */
	void setLastTimeModified(Date value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Depends On Units</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.DependencyEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On Units</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_DependsOnUnits()
	 * @model type="fr.irisa.triskell.kermeta.kpm.DependencyEntry" containment="true"
	 * @generated
	 */
	EList getDependsOnUnits();

	/**
	 * Returns the value of the '<em><b>Dependent Units</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.DependencyEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Units</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_DependentUnits()
	 * @model type="fr.irisa.triskell.kermeta.kpm.DependencyEntry" containment="true"
	 * @generated
	 */
	EList getDependentUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="fr.irisa.triskell.kermeta.kpm.IProgressMonitor"
	 * @generated
	 */
	void receiveEvent(String event, boolean synchrone, Map args, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasDependencyNamed(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receiveSynchroneEvent(String event, Map args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receiveAsynchroneEvent(String event, Map args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void beDependentOf(Unit unit, DependencyType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getFree(DependencyType type, Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DependencyEntry findDependentUnit(DependencyType type, Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DependencyEntry findUnitIDependOn(DependencyType type, Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DependencyEntry findUnitIDependOn(String type, Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DependencyEntry findDependentUnit(String type, Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="fr.irisa.triskell.kermeta.kpm.IProgressMonitor"
	 * @generated
	 */
	void receiveSynchroneEvent(String event, Map args, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Dependency findDependency(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void beDependentOf(Unit unit, Dependency dependency);

} // Unit