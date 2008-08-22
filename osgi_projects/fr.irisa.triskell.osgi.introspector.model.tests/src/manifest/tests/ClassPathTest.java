/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassPathTest.java,v 1.1 2008-08-22 12:39:59 edaubert Exp $
 */
package manifest.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import manifest.ClassPath;
import manifest.ManifestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class Path</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassPathTest extends TestCase {

	/**
	 * The fixture for this Class Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassPath fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassPathTest.class);
	}

	/**
	 * Constructs a new Class Path test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassPathTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Class Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ClassPath fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Class Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassPath getFixture() {
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
		setFixture(ManifestFactory.eINSTANCE.createClassPath());
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

} //ClassPathTest
