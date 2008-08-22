/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportPackageTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import jar.JarFactory;
import junit.textui.TestRunner;
import manifest.ImportPackage;
import manifest.ManifestFactory;
import manifest.Package;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Import Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportPackageTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImportPackageTest.class);
	}

	/**
	 * Constructs a new Import Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Import Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImportPackage getFixture() {
		return (ImportPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createImportPackage());
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
	
	@Test
	public void testAddPackagesReference() {
		String reference = "test1";
		getFixture().addPackagesReference(reference);
		
		assertEquals(1, getFixture().getPackageReferences().size());
		
		reference = "test1";
		getFixture().addPackagesReference(reference);

		assertEquals(1, getFixture().getPackageReferences().size());
		
		reference = "test2";
		getFixture().addPackagesReference(reference);

		assertEquals(2, getFixture().getPackageReferences().size());
		
		String reference2 = "test2";
		getFixture().addPackagesReference(reference2);

		assertEquals(2, getFixture().getPackageReferences().size());
		
		reference = null;
		getFixture().addPackagesReference(reference);
		
		assertEquals(2, getFixture().getPackageReferences().size());
	}
	
	@Test
	public void testAddPackages() {
		Package _package = ManifestFactory.eINSTANCE.createPackage();
		_package.setReference("org.irisa.triskell");
		getFixture().addPackage(_package);
		
		assertEquals(1, getFixture().getPackages().size());
		assertEquals(_package, getFixture().getPackages().get(0));

		getFixture().addPackage(_package);
		
		assertEquals(1, getFixture().getPackages().size());
		
		_package = ManifestFactory.eINSTANCE.createPackage();
		_package.setReference("org.irisa.triskell2");
		getFixture().addPackage(_package);
		
		assertEquals(2, getFixture().getPackages().size());
		
		_package = null;

		getFixture().addPackage(_package);
		
		assertEquals(2, getFixture().getPackages().size());
	}

} //ImportPackageTest
