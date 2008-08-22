/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributEntryTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.AttributEntry;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Attribut Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributEntryTest extends ParameterEntryTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributEntryTest.class);
	}

	/**
	 * Constructs a new Attribut Entry test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribut Entry test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected AttributEntry getFixture() {
		return (AttributEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createAttributEntry());
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

} // AttributEntryTest
