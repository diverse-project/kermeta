/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.ki.task.tests;

import junit.textui.TestRunner;

import org.kermeta.ki.task.Abstract;
import org.kermeta.ki.task.TaskFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractTest extends TaskTest {

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
		TestRunner.run(AbstractTest.class);
	}

	/**
	 * Constructs a new Abstract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Abstract getFixture() {
		return (Abstract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskFactory.eINSTANCE.createAbstract());
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

} //AbstractTest
