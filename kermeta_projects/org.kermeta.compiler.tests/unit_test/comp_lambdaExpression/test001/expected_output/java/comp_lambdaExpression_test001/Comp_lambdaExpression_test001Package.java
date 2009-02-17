/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_lambdaExpression_test001Package.java,v 1.2 2009-02-17 13:40:54 cfaucher Exp $
 */
package comp_lambdaExpression_test001;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see comp_lambdaExpression_test001.Comp_lambdaExpression_test001Factory
 * @model kind="package"
 * @generated
 */
public interface Comp_lambdaExpression_test001Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "comp_lambdaExpression_test001";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "platform:/resource/org.kermeta.compiler.tests/unit_test/comp_lambdaExpression/test001/input/kermeta/comp_lambdaExpression_test001.ecore#/comp_lambdaExpression_test001";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "comp_lambdaExpression_test001";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comp_lambdaExpression_test001Package eINSTANCE = comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl.init();

  /**
   * The meta object id for the '{@link comp_lambdaExpression_test001.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see comp_lambdaExpression_test001.impl.MainImpl
   * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#getMain()
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
   * The meta object id for the '{@link comp_lambdaExpression_test001.impl.AImpl <em>A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see comp_lambdaExpression_test001.impl.AImpl
   * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#getA()
   * @generated
   */
  int A = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A__REF = 0;

  /**
   * The number of structural features of the '<em>A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '<em>String</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#getString()
   * @generated
   */
  int STRING = 2;

  /**
   * The meta object id for the '<em>Kermeta Special Types Alias </em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#get_KermetaSpecialTypesAlias_()
   * @generated
   */
  int _KERMETA_SPECIAL_TYPES_ALIAS_ = 3;


  /**
   * Returns the meta object for class '{@link comp_lambdaExpression_test001.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see comp_lambdaExpression_test001.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for class '{@link comp_lambdaExpression_test001.A <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>A</em>'.
   * @see comp_lambdaExpression_test001.A
   * @generated
   */
  EClass getA();

  /**
   * Returns the meta object for the attribute list '{@link comp_lambdaExpression_test001.A#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ref</em>'.
   * @see comp_lambdaExpression_test001.A#getRef()
   * @see #getA()
   * @generated
   */
  EAttribute getA_Ref();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>String</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   * @generated
   */
  EDataType getString();

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
  Comp_lambdaExpression_test001Factory getComp_lambdaExpression_test001Factory();

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
     * The meta object literal for the '{@link comp_lambdaExpression_test001.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see comp_lambdaExpression_test001.impl.MainImpl
     * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '{@link comp_lambdaExpression_test001.impl.AImpl <em>A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see comp_lambdaExpression_test001.impl.AImpl
     * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#getA()
     * @generated
     */
    EClass A = eINSTANCE.getA();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute A__REF = eINSTANCE.getA_Ref();

    /**
     * The meta object literal for the '<em>String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#getString()
     * @generated
     */
    EDataType STRING = eINSTANCE.getString();

    /**
     * The meta object literal for the '<em>Kermeta Special Types Alias </em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see comp_lambdaExpression_test001.impl.Comp_lambdaExpression_test001PackageImpl#get_KermetaSpecialTypesAlias_()
     * @generated
     */
    EDataType _KERMETA_SPECIAL_TYPES_ALIAS_ = eINSTANCE.get_KermetaSpecialTypesAlias_();

  }

} //Comp_lambdaExpression_test001Package
