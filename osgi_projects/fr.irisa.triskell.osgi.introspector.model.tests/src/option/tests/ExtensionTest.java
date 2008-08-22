/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionTest.java,v 1.1 2008-08-22 12:40:03 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.Extension;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionTest extends FragmentHostDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExtensionTest.class);
	}

	/**
	 * Constructs a new Extension test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtensionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Extension test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Extension getFixture() {
		return (Extension)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createExtension());
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

} // ExtensionTest
