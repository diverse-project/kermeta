/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ModelingUnit.java,v 1.1 2008-07-02 09:13:20 ftanguy Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getUsings <em>Usings</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model annotation="kermeta documentation='The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\nIt also reference others modeling unit.'"
 * @generated
 */
public interface ModelingUnit extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Using}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getModelingUnit_Usings()
   * @model containment="true"
   * @generated
   */
  EList<Using> getUsings();

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getModelingUnit_Packages()
   * @model containment="true"
   * @generated
   */
  EList<kermeta.language.structure.Package> getPackages();

  /**
   * Returns the value of the '<em><b>Include Filters</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Filter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Filters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Filters</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getModelingUnit_IncludeFilters()
   * @model containment="true"
   * @generated
   */
  EList<Filter> getIncludeFilters();

  /**
   * Returns the value of the '<em><b>Exclude Filters</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Filter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Filters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Filters</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getModelingUnit_ExcludeFilters()
   * @model containment="true"
   * @generated
   */
  EList<Filter> getExcludeFilters();

  /**
   * Returns the value of the '<em><b>Referenced Modeling Units</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.ModelingUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Modeling Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Modeling Units</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getModelingUnit_ReferencedModelingUnits()
   * @model
   * @generated
   */
  EList<ModelingUnit> getReferencedModelingUnits();

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Require}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getModelingUnit_Requires()
   * @model containment="true"
   * @generated
   */
  EList<Require> getRequires();

} // ModelingUnit
