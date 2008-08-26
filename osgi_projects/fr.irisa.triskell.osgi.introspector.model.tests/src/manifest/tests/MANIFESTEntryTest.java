/**
 * <copyright>
 * </copyright>
 *
 * $Id: MANIFESTEntryTest.java,v 1.2 2008-08-26 16:52:00 edaubert Exp $
 */
package manifest.tests;

import junit.framework.TestCase;
import manifest.MANIFESTEntry;
import option.AttributEntry;
import option.OptionFactory;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MANIFEST Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class MANIFESTEntryTest extends TestCase {

	/**
	 * The fixture for this MANIFEST Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MANIFESTEntry fixture = null;

	/**
	 * Constructs a new MANIFEST Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MANIFESTEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MANIFEST Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MANIFESTEntry fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MANIFEST Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MANIFESTEntry getFixture() {
		return fixture;
	}

	@Test
	public void testAddOption() {
		AttributEntry option = OptionFactory.eINSTANCE.createAttributEntry();
		option.setToken("test1");
		getFixture().addOption(option);
		
		assertEquals(1, getFixture().getOptions().size());
		
		getFixture().addOption(option);
		
		assertEquals(1, getFixture().getOptions().size());
		
		option = OptionFactory.eINSTANCE.createAttributEntry();
		option.setToken("test2");

		getFixture().addOption(option);
		
		assertEquals(2, getFixture().getOptions().size());

		option = OptionFactory.eINSTANCE.createAttributEntry();
		option.setToken(null);

		getFixture().addOption(option);
		
		assertEquals(2, getFixture().getOptions().size());
		


		option = null;

		getFixture().addOption(option);
		
		assertEquals(2, getFixture().getOptions().size());
		
	}

} //MANIFESTEntryTest
