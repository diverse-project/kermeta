/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResolutionTest.java,v 1.1 2008-08-22 12:40:03 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.Resolution;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolutionTest extends ImportPackageDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResolutionTest.class);
	}

	/**
	 * Constructs a new Resolution test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resolution test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Resolution getFixture() {
		return (Resolution)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createResolution());
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

} // ResolutionTest
