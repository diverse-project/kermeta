/**
 * <copyright>
 * </copyright>
 *
 * $Id: FragmentAttachmentTest.java,v 1.1 2008-08-22 12:40:03 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.FragmentAttachment;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Fragment Attachment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FragmentAttachmentTest extends SymbolicNameDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FragmentAttachmentTest.class);
	}

	/**
	 * Constructs a new Fragment Attachment test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FragmentAttachmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fragment Attachment test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected FragmentAttachment getFixture() {
		return (FragmentAttachment)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createFragmentAttachment());
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

} // FragmentAttachmentTest
