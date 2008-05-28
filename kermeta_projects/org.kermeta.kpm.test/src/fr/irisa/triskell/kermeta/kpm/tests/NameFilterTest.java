/**
 * <copyright>
 * </copyright>
 *
 * $Id: NameFilterTest.java,v 1.1 2008-05-28 11:33:29 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Name Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NameFilterTest extends FilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NameFilterTest.class);
	}

	/**
	 * Constructs a new Name Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Name Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NameFilter getFixture() {
		return (NameFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("*.kmt");
		setFixture(filter);
	}

	@Override
	public void testMatches__Unit() {
		Unit u1 = KpmFactory.eINSTANCE.createUnit();
		u1.setName("platform:/resource/oneProject/oneFolder/oneFile.kmt");

		Unit u2 = KpmFactory.eINSTANCE.createUnit();
		u2.setName("platform:/resource/oneProject/oneFolder/oneFile.ecore");

		assertTrue( fixture.matches(u1) );
		assertFalse( fixture.matches(u2) );
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

} //NameFilterTest
