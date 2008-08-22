/**
 * <copyright>
 * </copyright>
 *
 * $Id: VisibilityTest.java,v 1.1 2008-08-22 12:40:03 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.Visibility;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisibilityTest extends RequireBundleDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VisibilityTest.class);
	}

	/**
	 * Constructs a new Visibility test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VisibilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Visibility test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Visibility getFixture() {
		return (Visibility)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createVisibility());
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

} // VisibilityTest
