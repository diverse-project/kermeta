/**
 * <copyright>
 * </copyright>
 *
 * $Id: NullExpressionTest.java,v 1.1 2008-05-28 11:33:31 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NullExpression;
import fr.irisa.triskell.kermeta.kpm.Unit;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Null Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NullExpressionTest extends SimpleExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NullExpressionTest.class);
	}

	/**
	 * Constructs a new Null Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Null Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NullExpression getFixture() {
		return (NullExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KpmFactory.eINSTANCE.createNullExpression());
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
		Unit u = KpmFactory.eINSTANCE.createUnit();
		assertTrue( fixture.evaluateIn(u) );
	}

} //NullExpressionTest
