/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id: ModelingUnit.java,v 1.3 2008-01-22 14:24:30 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit#getUsings <em>Usings</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit#getExcludeFilters <em>Exclude Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model
 * @generated
 */
public interface ModelingUnit extends fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit_Packages()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Require}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit_Requires()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Require> getRequires();

	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit_Usings()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Using> getUsings();

	/**
	 * Returns the value of the '<em><b>Referenced Modeling Units</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.ModelingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Modeling Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Modeling Units</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit_ReferencedModelingUnits()
	 * @model
	 * @generated
	 */
	EList<ModelingUnit> getReferencedModelingUnits();

	/**
	 * Returns the value of the '<em><b>Include Filters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Filters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit_IncludeFilters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Filter> getIncludeFilters();

	/**
	 * Returns the value of the '<em><b>Exclude Filters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Filters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit_ExcludeFilters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Filter> getExcludeFilters();

	/**
	 * Returns the value of the '<em><b>Owned Tags</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tags</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelingUnit_OwnedTags()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Tag> getOwnedTags();

} // ModelingUnit
