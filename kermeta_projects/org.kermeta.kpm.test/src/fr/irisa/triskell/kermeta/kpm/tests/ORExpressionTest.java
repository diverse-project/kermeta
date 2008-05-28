/**
 * <copyright>
 * </copyright>
 *
 * $Id: ORExpressionTest.java,v 1.1 2008-05-28 11:33:31 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import junit.textui.TestRunner;
import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.ORExpression;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OR Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ORExpressionTest extends NestedExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ORExpressionTest.class);
	}

	/**
	 * Constructs a new OR Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OR Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ORExpression getFixture() {
		return (ORExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		ORExpression or = KpmFactory.eINSTANCE.createORExpression();
		
		FilterExpression left = KpmFactory.eINSTANCE.createFilterExpression();
		NameFilter namefilter = KpmFactory.eINSTANCE.createNameFilter();
		namefilter.setRegex("*.kmt");
		left.setFilter(namefilter);
		
		FilterExpression right = KpmFactory.eINSTANCE.createFilterExpression();
		namefilter = KpmFactory.eINSTANCE.createNameFilter();
		namefilter.setRegex("*.ecore");
		right.setFilter(namefilter);
		
		or.setLeft(left);
		or.setRight(right);
		
		setFixture(or);
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
	public void testEvaluateIn__Unit() {
		Unit u1 = KpmFactory.eINSTANCE.createUnit();
		u1.setName("someFile.kmt");
		assertTrue( fixture.evaluateIn(u1) );

		Unit u2 = KpmFactory.eINSTANCE.createUnit();
		u2.setName("someFile.ecore");
		assertTrue( fixture.evaluateIn(u2) );
		
		Unit u3 = KpmFactory.eINSTANCE.createUnit();
		u3.setName("someFile.km");
		assertFalse( fixture.evaluateIn(u3) );
	}

} //ORExpressionTest
