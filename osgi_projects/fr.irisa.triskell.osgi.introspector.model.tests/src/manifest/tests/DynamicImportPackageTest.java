/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicImportPackageTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.DynamicImportPackage;
import manifest.ManifestFactory;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dynamic Import Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicImportPackageTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DynamicImportPackageTest.class);
	}

	/**
	 * Constructs a new Dynamic Import Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicImportPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dynamic Import Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DynamicImportPackage getFixture() {
		return (DynamicImportPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createDynamicImportPackage());
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
	public void testAddPackageReference() {
		getFixture().addPackageReference("fr.irisa.triskell");
		
		assertEquals(1, getFixture().getPackages().size());
		
		getFixture().addPackageReference("fr.irisa.triskell");

		assertEquals(1, getFixture().getPackages().size());
		
		getFixture().addPackageReference("fr.irisa.triskell2");

		assertEquals(2, getFixture().getPackages().size());
		
		getFixture().addPackageReference(null);

		assertEquals(2, getFixture().getPackages().size());
		
		getFixture().addPackageReference("fr.irisa.triskell2");

		assertEquals(2, getFixture().getPackages().size());
		
		getFixture().addPackageReference("fr.irisa.triskell");

		assertEquals(2, getFixture().getPackages().size());
	}

} //DynamicImportPackageTest
