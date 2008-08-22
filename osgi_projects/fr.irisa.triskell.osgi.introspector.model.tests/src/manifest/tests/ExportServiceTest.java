/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportServiceTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;

import manifest.ExportService;
import manifest.ManifestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Export Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExportServiceTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExportServiceTest.class);
	}

	/**
	 * Constructs a new Export Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Export Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExportService getFixture() {
		return (ExportService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createExportService());
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

} //ExportServiceTest
