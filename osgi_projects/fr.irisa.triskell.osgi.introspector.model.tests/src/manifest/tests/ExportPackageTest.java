/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportPackageTest.java,v 1.1 2008-08-22 12:39:59 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.ExportPackage;
import manifest.ManifestFactory;
import manifest.Package;

import option.ExportPackageDirective;
import option.OptionFactory;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Export Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExportPackageTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExportPackageTest.class);
	}

	/**
	 * Constructs a new Export Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Export Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExportPackage getFixture() {
		return (ExportPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createExportPackage());
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
	public void testAddPackage() {
		Package _package = ManifestFactory.eINSTANCE.createPackage();
		getFixture().addPackage(_package);
		
		assertEquals(1, getFixture().getPackages().size());
	}

	@Test
	public void testAddDirective() {
		ExportPackageDirective directive = OptionFactory.eINSTANCE.createExcludeClasses();
		ExportPackageDirective directive1 = OptionFactory.eINSTANCE.createIncludeClasses();
		ExportPackageDirective directive2 = OptionFactory.eINSTANCE.createMandatory();
		ExportPackageDirective directive3 = OptionFactory.eINSTANCE.createUses();
		getFixture().addDirective(directive);
		
		assertEquals(1, getFixture().getDirectives().size());
		assertEquals(directive, getFixture().getDirectives().get(0));
		
		getFixture().addDirective(directive);

		assertEquals(1, getFixture().getDirectives().size());
		
		getFixture().addDirective(directive1);

		assertEquals(2, getFixture().getDirectives().size());
		
		getFixture().addDirective(directive2);

		assertEquals(3, getFixture().getDirectives().size());
		
		getFixture().addDirective(directive3);

		assertEquals(4, getFixture().getDirectives().size());
		
		directive3 = OptionFactory.eINSTANCE.createMandatory();
		getFixture().addDirective(directive3);

		assertEquals(4, getFixture().getDirectives().size());
		
		
		
		
	}

} //ExportPackageTest
