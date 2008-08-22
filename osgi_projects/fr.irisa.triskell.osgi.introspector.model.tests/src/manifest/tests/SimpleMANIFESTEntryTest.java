/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleMANIFESTEntryTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import org.junit.Test;

import junit.textui.TestRunner;

import manifest.ManifestFactory;
import manifest.SimpleMANIFESTEntry;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple MANIFEST Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleMANIFESTEntryTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleMANIFESTEntryTest.class);
	}

	/**
	 * Constructs a new Simple MANIFEST Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMANIFESTEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple MANIFEST Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleMANIFESTEntry getFixture() {
		return (SimpleMANIFESTEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createSimpleMANIFESTEntry());
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

} //SimpleMANIFESTEntryTest
