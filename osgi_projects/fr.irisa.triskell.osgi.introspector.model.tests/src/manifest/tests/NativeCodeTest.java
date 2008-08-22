/**
 * <copyright>
 * </copyright>
 *
 * $Id: NativeCodeTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import manifest.ManifestFactory;
import manifest.NativeCode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Native Code</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NativeCodeTest extends TestCase {

	/**
	 * The fixture for this Native Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NativeCode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NativeCodeTest.class);
	}

	/**
	 * Constructs a new Native Code test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeCodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Native Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NativeCode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Native Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NativeCode getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createNativeCode());
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

} //NativeCodeTest
