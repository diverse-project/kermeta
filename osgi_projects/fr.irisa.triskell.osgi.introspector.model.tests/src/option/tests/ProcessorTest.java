/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcessorTest.java,v 1.1 2008-08-22 12:40:02 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.Processor;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorTest extends NativeCodeDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessorTest.class);
	}

	/**
	 * Constructs a new Processor test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcessorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Processor getFixture() {
		return (Processor)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createProcessor());
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

} // ProcessorTest
