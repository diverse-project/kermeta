/**
 * <copyright>
 * </copyright>
 *
 * $Id: MandatoryTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import org.junit.Test;

import junit.textui.TestRunner;

import option.Mandatory;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MandatoryTest extends ExportPackageDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MandatoryTest.class);
	}

	/**
	 * Constructs a new Mandatory test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MandatoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mandatory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mandatory getFixture() {
		return (Mandatory)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createMandatory());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testAddAttribut() {
		// For the moment, there are nothing to test
	}

} // MandatoryTest
