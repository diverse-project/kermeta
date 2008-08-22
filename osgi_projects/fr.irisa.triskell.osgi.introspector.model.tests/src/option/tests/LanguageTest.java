/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanguageTest.java,v 1.1 2008-08-22 12:40:03 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.Language;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageTest extends NativeCodeDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LanguageTest.class);
	}

	/**
	 * Constructs a new Language test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LanguageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Language test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Language getFixture() {
		return (Language)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createLanguage());
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

} // LanguageTest
