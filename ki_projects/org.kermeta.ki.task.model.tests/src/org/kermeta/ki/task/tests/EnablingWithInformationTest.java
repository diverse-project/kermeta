/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.ki.task.tests;

import junit.textui.TestRunner;

import org.kermeta.ki.task.EnablingWithInformation;
import org.kermeta.ki.task.TaskFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enabling With Information</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnablingWithInformationTest extends OperatorTest {

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
		TestRunner.run(EnablingWithInformationTest.class);
	}

	/**
	 * Constructs a new Enabling With Information test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnablingWithInformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enabling With Information test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnablingWithInformation getFixture() {
		return (EnablingWithInformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskFactory.eINSTANCE.createEnablingWithInformation());
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

} //EnablingWithInformationTest
