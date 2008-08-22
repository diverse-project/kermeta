/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleClassPathTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.BundleClassPath;
import manifest.ClassPath;
import manifest.ManifestFactory;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Class Path</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleClassPathTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleClassPathTest.class);
	}

	/**
	 * Constructs a new Bundle Class Path test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleClassPathTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Class Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleClassPath getFixture() {
		return (BundleClassPath)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleClassPath());
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
	public void testAddClassPath() {
		ClassPath classPath = ManifestFactory.eINSTANCE.createClassPath();
		classPath.setReference("lib/test.jar");
		getFixture().addClassPath(classPath);
		
		assertEquals(1, getFixture().getClassPaths().size());
		
		classPath = ManifestFactory.eINSTANCE.createClassPath();
		classPath.setReference("lib/test2.jar");
		getFixture().addClassPath(classPath);

		assertEquals(2, getFixture().getClassPaths().size());
		
		classPath = ManifestFactory.eINSTANCE.createClassPath();
		classPath.setReference("test.jar");
		getFixture().addClassPath(classPath);

		assertEquals(3, getFixture().getClassPaths().size());
		
		classPath = ManifestFactory.eINSTANCE.createClassPath();
		classPath.setReference("lib/test.jar");
		getFixture().addClassPath(classPath);

		assertEquals(3, getFixture().getClassPaths().size());

		getFixture().addClassPath(null);

		assertEquals(3, getFixture().getClassPaths().size());

		classPath = ManifestFactory.eINSTANCE.createClassPath();
		classPath.setReference(null);
		getFixture().addClassPath(classPath);

		assertEquals(3, getFixture().getClassPaths().size());
		
	}

} //BundleClassPathTest
