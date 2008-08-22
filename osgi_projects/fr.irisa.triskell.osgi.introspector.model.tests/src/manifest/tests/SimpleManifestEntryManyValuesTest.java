/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleManifestEntryManyValuesTest.java,v 1.1 2008-08-22 12:39:59 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.ManifestFactory;
import manifest.SimpleManifestEntryManyValues;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Manifest Entry Many Values</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleManifestEntryManyValuesTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleManifestEntryManyValuesTest.class);
	}

	/**
	 * Constructs a new Simple Manifest Entry Many Values test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleManifestEntryManyValuesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Manifest Entry Many Values test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleManifestEntryManyValues getFixture() {
		return (SimpleManifestEntryManyValues)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createSimpleManifestEntryManyValues());
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
	public void testAddValue() {
		getFixture().addValue("test1");
		
		assertEquals(1, getFixture().getValues().size());
		
		getFixture().addValue("test1");
		
		assertEquals(1, getFixture().getValues().size());
		
		getFixture().addValue("test2");

		assertEquals(2, getFixture().getValues().size());
		getFixture().addValue("test3");

		assertEquals(3, getFixture().getValues().size());
		getFixture().addValue("test2");

		assertEquals(3, getFixture().getValues().size());
		getFixture().addValue("test1");

		assertEquals(3, getFixture().getValues().size());
		
	}

} //SimpleManifestEntryManyValuesTest
