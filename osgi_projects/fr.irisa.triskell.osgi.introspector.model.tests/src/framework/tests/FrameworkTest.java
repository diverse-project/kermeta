package framework.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import manifest.BadVersionValueException;
import manifest.BundleSymbolicName;
import manifest.BundleVersion;
import manifest.MANIFEST;
import manifest.ManifestFactory;
import manifest.Version;
import framework.Bundle;
import framework.Framework;
import framework.FrameworkFactory;

public class FrameworkTest extends TestCase {

	/**
	 * The fixture for this Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Framework fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FrameworkTest.class);
	}

	/**
	 * Constructs a new Framework test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Framework fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Framework getFixture() {
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
		setFixture(FrameworkFactory.eINSTANCE.createFramework());
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

	private Bundle createBundle(String symbolicName) {
		Bundle bundle = FrameworkFactory.eINSTANCE.createBundle();
		MANIFEST manifest = ManifestFactory.eINSTANCE.createMANIFEST();
		BundleSymbolicName bundleSymbolicName = ManifestFactory.eINSTANCE.createBundleSymbolicName();
		bundleSymbolicName.setSymbolicName(symbolicName);
		manifest.setBundleSymbolicName(bundleSymbolicName);
		BundleVersion bundleVersion = ManifestFactory.eINSTANCE.createBundleVersion();
		Version version = ManifestFactory.eINSTANCE.createVersion();
		try {
			version.setVersionValue("0.0.0");
		} catch (BadVersionValueException e) {
			// never appears
		}
		bundleVersion.setVersion(version);
		manifest.setBundleVersion(bundleVersion);
		bundle.setManifest(manifest);
		return bundle;
	}
	
	public void testAddBundle() {
		Bundle bundle = this.createBundle("bundle1");
		
		assertEquals(true, getFixture().addBundle(bundle));

		assertEquals(1, getFixture().getBundles().size());
		
		assertEquals(false, getFixture().addBundle(bundle));
		
		assertEquals(1, getFixture().getBundles().size());

		assertEquals(false, getFixture().addBundle(bundle));
		
		assertEquals(1, getFixture().getBundles().size());
		
		bundle = this.createBundle("bundle2");
		
		assertEquals(true, getFixture().addBundle(bundle));
		
		assertEquals(2, getFixture().getBundles().size());
		
		assertEquals(false, getFixture().addBundle(getFixture().getBundles().get(0)));
		
		assertEquals(2,getFixture().getBundles().size());

	}

	public void testFindBundles() {
		Bundle bundle = this.createBundle("bundle1");
		getFixture().addBundle(bundle);
		
		bundle = this.createBundle("bundle1");
		bundle.getManifest().getBundleVersion().getVersion().setMajor(1);
		bundle.getManifest().getBundleVersion().getVersion().setMinor(0);
		bundle.getManifest().getBundleVersion().getVersion().setMicro(0);
		getFixture().addBundle(bundle);
		
		bundle = this.createBundle("bundle2");
		getFixture().addBundle(bundle);
		
		bundle = this.createBundle("bundle3");
		getFixture().addBundle(bundle);
		
		bundle = this.createBundle("bundle4");
		getFixture().addBundle(bundle);
		
		assertEquals(2, getFixture().findBundles("bundle1").size());
		assertEquals(1, getFixture().findBundles("bundle3").size());
		assertEquals(null, getFixture().findBundles("bundle5"));
	}

	public void testFindBundle() {
		Bundle bundle = FrameworkFactory.eINSTANCE.createBundle();
		MANIFEST manifest = ManifestFactory.eINSTANCE.createMANIFEST();
		BundleSymbolicName symbolicName = ManifestFactory.eINSTANCE.createBundleSymbolicName();
		symbolicName.setSymbolicName("bundle1");
		manifest.setBundleSymbolicName(symbolicName);
		BundleVersion version = ManifestFactory.eINSTANCE.createBundleVersion();
		Version v = ManifestFactory.eINSTANCE.createVersion();
		try {
			v.setVersionValue("0.0.0");
		} catch (BadVersionValueException e) {
			// do nothing because never happens
			fail("BadVersionValue exception");
		}
		version.setVersion(v);
		manifest.setBundleVersion(version);
		bundle.setManifest(manifest);
		getFixture().addBundle(bundle);
		
		Bundle bundle1 = FrameworkFactory.eINSTANCE.createBundle();
		manifest = ManifestFactory.eINSTANCE.createMANIFEST();
		symbolicName = ManifestFactory.eINSTANCE.createBundleSymbolicName();
		symbolicName.setSymbolicName("bundle1");
		version = ManifestFactory.eINSTANCE.createBundleVersion();
		Version v1 = ManifestFactory.eINSTANCE.createVersion();
		try {
			v1.setVersionValue("0.0.0.V2");
		} catch (BadVersionValueException e) {
			// do nothing because never happens
			fail("BadVersionValue exception");
		}
		version.setVersion(v1);
		manifest.setBundleVersion(version);
		manifest.setBundleSymbolicName(symbolicName);
		bundle1.setManifest(manifest);
		getFixture().addBundle(bundle1);
		
		Bundle bundle2 = FrameworkFactory.eINSTANCE.createBundle();
		manifest = ManifestFactory.eINSTANCE.createMANIFEST();
		symbolicName = ManifestFactory.eINSTANCE.createBundleSymbolicName();
		symbolicName.setSymbolicName("bundle2");
		version = ManifestFactory.eINSTANCE.createBundleVersion();
		Version v2 = ManifestFactory.eINSTANCE.createVersion();
		try {
			v2.setVersionValue("1.0.45");
		} catch (BadVersionValueException e) {
			// do nothing because never happens
			fail("BadVersionValue exception");
		}
		version.setVersion(v2);
		manifest.setBundleVersion(version);
		manifest.setBundleSymbolicName(symbolicName);
		bundle2.setManifest(manifest);
		getFixture().addBundle(bundle2);
		
		Bundle bundle3 = FrameworkFactory.eINSTANCE.createBundle();
		manifest = ManifestFactory.eINSTANCE.createMANIFEST();
		symbolicName = ManifestFactory.eINSTANCE.createBundleSymbolicName();
		symbolicName.setSymbolicName("bundle3");
		version = ManifestFactory.eINSTANCE.createBundleVersion();
		Version v3 = ManifestFactory.eINSTANCE.createVersion();
		try {
			v3.setVersionValue("0.99.0.RC32_2008");
		} catch (BadVersionValueException e) {
			// do nothing because never happens
			fail("BadVersionValue exception");
		}
		version.setVersion(v3);
		manifest.setBundleVersion(version);
		manifest.setBundleSymbolicName(symbolicName);
		bundle3.setManifest(manifest);
		getFixture().addBundle(bundle3);
		
		Bundle bundle4 = FrameworkFactory.eINSTANCE.createBundle();
		manifest = ManifestFactory.eINSTANCE.createMANIFEST();
		symbolicName = ManifestFactory.eINSTANCE.createBundleSymbolicName();
		symbolicName.setSymbolicName("bundle4");
		version = ManifestFactory.eINSTANCE.createBundleVersion();
		Version v4 = ManifestFactory.eINSTANCE.createVersion();
		try {
			v.setVersionValue("0.0.0.__-");
		} catch (BadVersionValueException e) {
			// do nothing because never happens
			fail("BadVersionValue exception");
		}
		version.setVersion(v4);
		manifest.setBundleVersion(version);
		manifest.setBundleSymbolicName(symbolicName);
		bundle4.setManifest(manifest);
		getFixture().addBundle(bundle4);
		
		Version v5 = ManifestFactory.eINSTANCE.createVersion();
		try {
			v5.setVersionValue("0.0.0.87");
		} catch (BadVersionValueException e) {
			// do nothing because never happens
			fail("BadVersionValue exception");
		}
		
		assertEquals(bundle1, getFixture().findBundle("bundle1", v1));
		assertEquals(bundle, getFixture().findBundle("bundle1", v));
		assertNull(getFixture().findBundle("bundle1", v2));
		assertNull(getFixture().findBundle("bundle2", v1));
		assertNull(getFixture().findBundle("bundle1", v5));
		assertNull(getFixture().findBundle("bundle5", v5));
		assertNull(getFixture().findBundle("bundle5", v4));
	}

}
