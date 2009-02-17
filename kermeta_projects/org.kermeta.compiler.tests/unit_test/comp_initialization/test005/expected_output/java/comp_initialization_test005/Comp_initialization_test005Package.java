/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_initialization_test005Package.java,v 1.2 2009-02-17 13:40:57 cfaucher Exp $
 */
package comp_initialization_test005;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see comp_initialization_test005.Comp_initialization_test005Factory
 * @model kind="package"
 * @generated
 */
public interface Comp_initialization_test005Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "comp_initialization_test005";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "platform:/resource/org.kermeta.compiler.tests/unit_test/comp_initialization/test005/input/kermeta/comp_initialization_test005.ecore#/comp_initialization_test005";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "comp_initialization_test005";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comp_initialization_test005Package eINSTANCE = comp_initialization_test005.impl.Comp_initialization_test005PackageImpl.init();

  /**
   * The meta object id for the '{@link comp_initialization_test005.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see comp_initialization_test005.impl.MainImpl
   * @see comp_initialization_test005.impl.Comp_initialization_test005PackageImpl#getMain()
   * @generated
   */
  int MAIN = 0;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link comp_initialization_test005.impl.AImpl <em>A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see comp_initialization_test005.impl.AImpl
   * @see comp_initialization_test005.impl.Comp_initialization_test005PackageImpl#getA()
   * @generated
   */
  int A = 1;

  /**
   * The number of structural features of the '<em>A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '<em>Kermeta Special Types Alias </em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see comp_initialization_test005.impl.Comp_initialization_test005PackageImpl#get_KermetaSpecialTypesAlias_()
   * @generated
   */
  int _KERMETA_SPECIAL_TYPES_ALIAS_ = 2;


  /**
   * Returns the meta object for class '{@link comp_initialization_test005.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see comp_initialization_test005.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for class '{@link comp_initialization_test005.A <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>A</em>'.
   * @see comp_initialization_test005.A
   * @generated
   */
  EClass getA();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>Kermeta Special Types Alias </em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Kermeta Special Types Alias </em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object"
   * @generated
   */
  EDataType get_KermetaSpecialTypesAlias_();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Comp_initialization_test005Factory getComp_initialization_test005Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link comp_initialization_test005.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see comp_initialization_test005.impl.MainImpl
     * @see comp_initialization_test005.impl.Comp_initialization_test005PackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '{@link comp_initialization_test005.impl.AImpl <em>A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see comp_initialization_test005.impl.AImpl
     * @see comp_initialization_test005.impl.Comp_initialization_test005PackageImpl#getA()
     * @generated
     */
    EClass A = eINSTANCE.getA();

    /**
     * The meta object literal for the '<em>Kermeta Special Types Alias </em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see comp_initialization_test005.impl.Comp_initialization_test005PackageImpl#get_KermetaSpecialTypesAlias_()
     * @generated
     */
    EDataType _KERMETA_SPECIAL_TYPES_ALIAS_ = eINSTANCE.get_KermetaSpecialTypesAlias_();

  }

} //Comp_initialization_test005Package
