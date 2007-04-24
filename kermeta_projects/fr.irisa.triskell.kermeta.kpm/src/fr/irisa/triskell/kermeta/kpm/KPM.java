/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPM.java,v 1.6 2007-04-24 12:39:38 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getFilters <em>Filters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getUnits <em>Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getRuleTypes <em>Rule Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM()
 * @model
 * @generated
 */
public interface KPM extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Actions()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Action" containment="true"
	 * @generated
	 */
	EList getActions();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Filters()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Filter" containment="true"
	 * @generated
	 */
	EList getFilters();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Types()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Type" containment="true"
	 * @generated
	 */
	EList getTypes();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Rules()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Rule" containment="true"
	 * @generated
	 */
	EList getRules();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Events()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Event" containment="true"
	 * @generated
	 */
	EList getEvents();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Units()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Unit" containment="true"
	 * @generated
	 */
	EList getUnits();

	/**
	 * Returns the value of the '<em><b>Rule Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Types</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_RuleTypes()
	 * @model type="fr.irisa.triskell.kermeta.kpm.RuleType" containment="true"
	 * @generated
	 */
	EList getRuleTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Action createAction(String extensionPoint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Action findAction(String extensionPoint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Event findEvent(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NameFilter createNameFilter(String regex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NameFilter findNameFilter(String regex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ExistFilter getExistFilter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RuleType findRuleType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RuleType getRuleType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Rule findRule(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Event getEvent(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Unit findUnit(String name);

} // KPM