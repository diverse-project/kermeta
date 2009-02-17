/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_body_test001Package.java,v 1.3 2009-02-17 13:41:03 cfaucher Exp $
 */
package comp_body_test001;

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
 * @see comp_body_test001.Comp_body_test001Factory
 * @model kind="package"
 * @generated
 */
public interface Comp_body_test001Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "comp_body_test001";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "platform:/resource/org.kermeta.compiler.tests/unit_test/comp_body/test001/input/kermeta/comp_body_test001.ecore#/comp_body_test001";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "comp_body_test001";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comp_body_test001Package eINSTANCE = comp_body_test001.impl.Comp_body_test001PackageImpl.init();

  /**
   * The meta object id for the '{@link comp_body_test001.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see comp_body_test001.impl.MainImpl
   * @see comp_body_test001.impl.Comp_body_test001PackageImpl#getMain()
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
   * The meta object id for the '<em>Kermeta Special Types Alias </em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see comp_body_test001.impl.Comp_body_test001PackageImpl#get_KermetaSpecialTypesAlias_()
   * @generated
   */
  int _KERMETA_SPECIAL_TYPES_ALIAS_ = 1;


  /**
   * Returns the meta object for class '{@link comp_body_test001.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see comp_body_test001.Main
   * @generated
   */
  EClass getMain();

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
  Comp_body_test001Factory getComp_body_test001Factory();

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
     * The meta object literal for the '{@link comp_body_test001.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see comp_body_test001.impl.MainImpl
     * @see comp_body_test001.impl.Comp_body_test001PackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em>Kermeta Special Types Alias </em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see comp_body_test001.impl.Comp_body_test001PackageImpl#get_KermetaSpecialTypesAlias_()
     * @generated
     */
    EDataType _KERMETA_SPECIAL_TYPES_ALIAS_ = eINSTANCE.get_KermetaSpecialTypesAlias_();

  }

} //Comp_body_test001Package
