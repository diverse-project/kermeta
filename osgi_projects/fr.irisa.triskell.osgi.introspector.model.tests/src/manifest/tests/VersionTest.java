/**
 * <copyright>
 * </copyright>
 *
 * $Id: VersionTest.java,v 1.2 2008-08-25 06:58:54 edaubert Exp $
 */
package manifest.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import manifest.BadVersionValueException;
import manifest.ManifestFactory;
import manifest.Version;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VersionTest extends TestCase {

	/**
	 * The fixture for this Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Version fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VersionTest.class);
	}

	/**
	 * Constructs a new Version test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Version fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Version getFixture() {
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
		setFixture(ManifestFactory.eINSTANCE.createVersion());
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
	public void testGreaterThan() {
		Version version = null;
		
		assertTrue(getFixture().greaterThan(version, true));
		assertTrue(getFixture().greaterThan(version, false));
		
		version = ManifestFactory.eINSTANCE.createVersion();
		version.setMajor(0);
		version.setMinor(0);
		version.setMicro(1);
		
		assertFalse(getFixture().greaterThan(version, true));
		assertFalse(getFixture().greaterThan(version, false));
		
		version.setMajor(0);
		version.setMinor(1);
		version.setMicro(0);
		
		assertFalse(getFixture().greaterThan(version, true));
		assertFalse(getFixture().greaterThan(version, false));
		
		version.setMajor(1);
		version.setMinor(0);
		version.setMicro(0);
		
		assertFalse(getFixture().greaterThan(version, true));
		assertFalse(getFixture().greaterThan(version, false));
		
		version.setMajor(0);
		version.setMinor(0);
		version.setMicro(0);
		
		assertFalse(getFixture().greaterThan(version, true));
		assertTrue(getFixture().greaterThan(version, false));
		
		getFixture().setMajor(1);
		
		assertTrue(getFixture().greaterThan(version, true));
		assertTrue(getFixture().greaterThan(version, false));
		
		version.setMajor(1);
		version.setMinor(0);
		version.setMicro(0);
		version.setQualifier("_-");
		
		assertFalse(getFixture().greaterThan(version, true));
		assertFalse(getFixture().greaterThan(version, false));
		
		getFixture().setQualifier("2008");
		
		assertFalse(getFixture().greaterThan(version, true));
		assertFalse(getFixture().greaterThan(version, false));
		
		getFixture().setQualifier("_-");
		version.setQualifier("2008");
		
		assertTrue(getFixture().greaterThan(version, true));
		assertTrue(getFixture().greaterThan(version, false));
		
		getFixture().setMajor(0);
		
		assertFalse(getFixture().greaterThan(version, true));
		assertFalse(getFixture().greaterThan(version, false));
	}

	@Test
	public void testLesserThan() {
		Version version = null;
		
		assertTrue(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
		
		version = ManifestFactory.eINSTANCE.createVersion();
		version.setMajor(0);
		version.setMinor(0);
		version.setMicro(1);
		
		assertTrue(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
		
		version.setMajor(0);
		version.setMinor(1);
		version.setMicro(0);
		
		assertTrue(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
		
		version.setMajor(1);
		version.setMinor(0);
		version.setMicro(0);
		
		assertTrue(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
		
		version.setMajor(0);
		version.setMinor(0);
		version.setMicro(0);
		
		assertFalse(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
		
		getFixture().setMajor(1);
		
		assertFalse(getFixture().lesserThan(version, true));
		assertFalse(getFixture().lesserThan(version, false));
		
		version.setMajor(1);
		version.setMinor(0);
		version.setMicro(0);
		version.setQualifier("_-");
		
		assertTrue(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
		
		getFixture().setQualifier("2008");
		
		assertTrue(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
		

		getFixture().setQualifier("_-");
		version.setQualifier("2008");
		
		assertFalse(getFixture().lesserThan(version, true));
		assertFalse(getFixture().lesserThan(version, false));
		
		getFixture().setMajor(0);
		
		assertTrue(getFixture().lesserThan(version, true));
		assertTrue(getFixture().lesserThan(version, false));
	}

	@Test
	public void testSetVersionValue() {
		try {
			getFixture().setVersionValue("0.0.0");
			
			assertEquals(0, getFixture().getMajor());
			assertEquals(0, getFixture().getMinor());
			assertEquals(0, getFixture().getMicro());
			assertEquals("", getFixture().getQualifier());
			
			getFixture().setVersionValue("0.0.0.2008");
			
			assertEquals(0, getFixture().getMajor(), 0);
			assertEquals(0, getFixture().getMinor(), 0);
			assertEquals(0, getFixture().getMicro(), 0);
			assertEquals("2008", getFixture().getQualifier());
			
			getFixture().setVersionValue("0.0.0._304");
			
			assertEquals(0, getFixture().getMajor(), 0);
			assertEquals(0, getFixture().getMinor(), 0);
			assertEquals(0, getFixture().getMicro(), 0);
			assertEquals("_304", getFixture().getQualifier());
			
			getFixture().setVersionValue("1.0.0");
			
			assertEquals(1, getFixture().getMajor(), 1);
			assertEquals(0, getFixture().getMinor(), 0);
			assertEquals(0, getFixture().getMicro(), 0);
			assertEquals("", getFixture().getQualifier());
			
			getFixture().setVersionValue("0.0");
			
			assertEquals(0, getFixture().getMajor(), 0);
			assertEquals(0, getFixture().getMinor(), 0);
			assertEquals(0, getFixture().getMicro(), 0);
			assertEquals("", getFixture().getQualifier());

			getFixture().setVersionValue("0");
			
			assertEquals(0, getFixture().getMajor(), 0);
			assertEquals(0, getFixture().getMinor(), 0);
			assertEquals(0, getFixture().getMicro(), 0);
			assertEquals("", getFixture().getQualifier());
			
			try {
				getFixture().setVersionValue("0.0.a");
			} catch (BadVersionValueException e) {
				assertEquals(0, getFixture().getMajor());
				assertEquals(0, getFixture().getMinor());
				assertEquals(0, getFixture().getMicro());
				assertEquals("", getFixture().getQualifier());
			}
			


		} catch (BadVersionValueException e) {
			fail("must not appears.\n If it's appears so you change String into the try block");
		}
	}

	@Test
	public void testEqualsVersion() {
		Version version = ManifestFactory.eINSTANCE.createVersion();
		version.setMajor(0);
		version.setMinor(0);
		version.setMicro(0);
		version.setQualifier("");
		
		assertTrue(getFixture().equals(version));
		
		version.setMajor(1);
		version.setMinor(0);
		version.setMicro(0);
		version.setQualifier("");
		
		assertFalse(getFixture().equals(version));
		
		version.setMajor(0);
		version.setMinor(1);
		version.setMicro(0);
		version.setQualifier("");
		
		assertFalse(getFixture().equals(version));
		
		version.setMajor(0);
		version.setMinor(0);
		version.setMicro(1);
		version.setQualifier("");
		
		assertFalse(getFixture().equals(version));
		
		version.setMajor(0);
		version.setMinor(0);
		version.setMicro(0);
		version.setQualifier("_");
		
		assertFalse(getFixture().equals(version));
		
		version.setMajor(1);
		version.setMinor(2);
		version.setMicro(2);
		version.setQualifier("s_");
		
		assertFalse(getFixture().equals(version));
		
	}

	@Test
	public void testsetQualifier() {
		getFixture().setQualifier("0");
		
		assertEquals("0", getFixture().getQualifier());
		
		getFixture().setQualifier("-_");
		
		assertEquals("-_", getFixture().getQualifier());
		
		getFixture().setQualifier("12-");
		
		assertEquals("12-", getFixture().getQualifier());
		
		getFixture().setQualifier("azerty-12");
		
		assertEquals("azerty-12", getFixture().getQualifier());
		
		getFixture().setQualifier("zaerty_");
		
		assertEquals("zaerty_", getFixture().getQualifier());
		
		getFixture().setQualifier("&");
		
		assertEquals("zaerty_", getFixture().getQualifier());
		
		
	}
	
	@Test
	public void testContainsInto() {
		
		try {
			String versionRange = "0.0.0";
			assertTrue(getFixture().containsInto(versionRange));
			
			versionRange = "[0.0.0, 1.0.0)";
			assertTrue(getFixture().containsInto(versionRange));

			versionRange = "[0.0.0, 1.0.0]";
			assertTrue(getFixture().containsInto(versionRange));

			versionRange = "(0.0.0, 1.0.0)";
			assertFalse(getFixture().containsInto(versionRange));

			getFixture().setMajor(1);
			versionRange = "[0.0.0, 1.0.0)";
			assertFalse(getFixture().containsInto(versionRange));

			versionRange = "(0.0.0, 1.0.0]";
			assertTrue(getFixture().containsInto(versionRange));
			
			getFixture().setMinor(1);
			versionRange = "[0.0.0, 1.0.0)";
			assertFalse(getFixture().containsInto(versionRange));
			
			getFixture().setQualifier("2008");
			versionRange = "[0.0.0, 2.0.0)";
			assertTrue(getFixture().containsInto(versionRange));
			
		} catch (BadVersionValueException e) {
			fail("must not appears.\n If it's appears so you change String into the try block");
		}
	}

} //VersionTest
