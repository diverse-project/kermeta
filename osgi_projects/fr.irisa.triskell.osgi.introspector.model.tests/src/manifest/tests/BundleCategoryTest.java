/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleCategoryTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import static org.junit.Assert.fail;

import org.junit.Test;

import junit.textui.TestRunner;

import manifest.BundleCategory;
import manifest.ManifestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Category</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleCategoryTest extends SimpleManifestEntryManyValuesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleCategoryTest.class);
	}

	/**
	 * Constructs a new Bundle Category test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleCategoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleCategory getFixture() {
		return (BundleCategory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleCategory());
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

} //BundleCategoryTest
