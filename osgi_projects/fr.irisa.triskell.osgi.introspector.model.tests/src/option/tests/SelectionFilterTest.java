/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectionFilterTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.SelectionFilter;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Selection Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionFilterTest extends NativeCodeDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectionFilterTest.class);
	}

	/**
	 * Constructs a new Selection Filter test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SelectionFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Selection Filter test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected SelectionFilter getFixture() {
		return (SelectionFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createSelectionFilter());
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

} // SelectionFilterTest
