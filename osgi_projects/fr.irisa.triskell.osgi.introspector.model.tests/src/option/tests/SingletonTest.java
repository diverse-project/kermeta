/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingletonTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.Singleton;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Singleton</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingletonTest extends SymbolicNameDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingletonTest.class);
	}

	/**
	 * Constructs a new Singleton test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SingletonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Singleton test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Singleton getFixture() {
		return (Singleton)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createSingleton());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} // SingletonTest
