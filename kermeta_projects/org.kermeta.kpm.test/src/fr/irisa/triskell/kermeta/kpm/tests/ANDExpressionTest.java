/**
 * <copyright>
 * </copyright>
 *
 * $Id: ANDExpressionTest.java,v 1.1 2008-05-28 11:33:30 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import fr.irisa.triskell.kermeta.kpm.ANDExpression;
import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.NullExpression;
import fr.irisa.triskell.kermeta.kpm.Unit;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AND Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ANDExpressionTest extends NestedExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ANDExpressionTest.class);
	}

	/**
	 * Constructs a new AND Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this AND Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ANDExpression getFixture() {
		return (ANDExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		ANDExpression and = KpmFactory.eINSTANCE.createANDExpression();
		
		FilterExpression left = KpmFactory.eINSTANCE.createFilterExpression();
		NameFilter namefilter = KpmFactory.eINSTANCE.createNameFilter();
		namefilter.setRegex("*.kmt");
		left.setFilter(namefilter);
		
		NullExpression right = KpmFactory.eINSTANCE.createNullExpression();
		
		and.setLeft(left);
		and.setRight(right);
		
		setFixture(and);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void testEvaluateIn__Unit() {
		Unit u1 = KpmFactory.eINSTANCE.createUnit();
		u1.setName("platform:/resource/onePorject/oneFolder/oneFile.kmt");
		assertTrue( fixture.evaluateIn(u1) );

		Unit u2 = KpmFactory.eINSTANCE.createUnit();
		u2.setName("platform:/resource/onePorject/oneFolder/oneFile.ecore");
		assertFalse( fixture.evaluateIn(u2) );
	}

} //ANDExpressionTest
