/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportServiceTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;

import manifest.ImportService;
import manifest.ManifestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Import Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportServiceTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImportServiceTest.class);
	}

	/**
	 * Constructs a new Import Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Import Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImportService getFixture() {
		return (ImportService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createImportService());
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

} //ImportServiceTest
