/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExistFilterTest.java,v 1.1 2008-05-28 11:33:28 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exist Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExistFilterTest extends FilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExistFilterTest.class);
	}

	/**
	 * Constructs a new Exist Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exist Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExistFilter getFixture() {
		return (ExistFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KpmFactory.eINSTANCE.createExistFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	@Override
	public void testMatches__Unit() {
		assertFalse("This feature must be tested in a workbench. The exist test is based on IResource implementation only available in a workbench.", true);
	}
	
} //ExistFilterTest
