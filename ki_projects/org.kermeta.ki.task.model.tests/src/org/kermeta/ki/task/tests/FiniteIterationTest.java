/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.ki.task.tests;

import junit.textui.TestRunner;

import org.kermeta.ki.task.FiniteIteration;
import org.kermeta.ki.task.TaskFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Finite Iteration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiniteIterationTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Arnaud Blouin - INRIA, Centre Rennes, Triskell Team, France";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FiniteIterationTest.class);
	}

	/**
	 * Constructs a new Finite Iteration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteIterationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Finite Iteration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FiniteIteration getFixture() {
		return (FiniteIteration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskFactory.eINSTANCE.createFiniteIteration());
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

} //FiniteIterationTest
