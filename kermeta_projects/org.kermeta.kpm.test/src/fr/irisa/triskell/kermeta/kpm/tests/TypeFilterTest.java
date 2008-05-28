/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeFilterTest.java,v 1.1 2008-05-28 11:33:28 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import junit.textui.TestRunner;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.TypeFilter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeFilterTest extends FilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeFilterTest.class);
	}

	/**
	 * Constructs a new Type Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeFilter getFixture() {
		return (TypeFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KpmFactory.eINSTANCE.createTypeFilter());
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
		fail("This feature can only be tested in a workbench because it uses IResource implementation.");
	}

} //TypeFilterTest
