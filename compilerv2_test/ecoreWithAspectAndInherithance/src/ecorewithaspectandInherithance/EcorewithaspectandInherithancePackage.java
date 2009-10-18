/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorewithaspectandInherithance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ecorewithaspectandInherithance.EcorewithaspectandInherithanceFactory
 * @model kind="package"
 * @generated
 */
public interface EcorewithaspectandInherithancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecorewithaspectandInherithance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorewithaspectandInherithancePackage eINSTANCE = ecorewithaspectandInherithance.impl.EcorewithaspectandInherithancePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecorewithaspectandInherithance.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorewithaspectandInherithance.impl.AImpl
	 * @see ecorewithaspectandInherithance.impl.EcorewithaspectandInherithancePackageImpl#getA()
	 * @generated
	 */
	int A = 0;

	/**
	 * The feature id for the '<em><b>Foo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__FOO = 0;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecorewithaspectandInherithance.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecorewithaspectandInherithance.impl.BImpl
	 * @see ecorewithaspectandInherithance.impl.EcorewithaspectandInherithancePackageImpl#getB()
	 * @generated
	 */
	int B = 1;

	/**
	 * The feature id for the '<em><b>Foo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__FOO = A__FOO;

	/**
	 * The feature id for the '<em><b>Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__BAR = A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = A_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ecorewithaspectandInherithance.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see ecorewithaspectandInherithance.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the attribute '{@link ecorewithaspectandInherithance.A#getFoo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foo</em>'.
	 * @see ecorewithaspectandInherithance.A#getFoo()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Foo();

	/**
	 * Returns the meta object for class '{@link ecorewithaspectandInherithance.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see ecorewithaspectandInherithance.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the attribute '{@link ecorewithaspectandInherithance.B#getBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar</em>'.
	 * @see ecorewithaspectandInherithance.B#getBar()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Bar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcorewithaspectandInherithanceFactory getEcorewithaspectandInherithanceFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecorewithaspectandInherithance.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorewithaspectandInherithance.impl.AImpl
		 * @see ecorewithaspectandInherithance.impl.EcorewithaspectandInherithancePackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Foo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__FOO = eINSTANCE.getA_Foo();

		/**
		 * The meta object literal for the '{@link ecorewithaspectandInherithance.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecorewithaspectandInherithance.impl.BImpl
		 * @see ecorewithaspectandInherithance.impl.EcorewithaspectandInherithancePackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__BAR = eINSTANCE.getB_Bar();

	}

} //EcorewithaspectandInherithancePackage
