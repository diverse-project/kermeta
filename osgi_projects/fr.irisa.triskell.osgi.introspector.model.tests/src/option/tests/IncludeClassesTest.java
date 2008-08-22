/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncludeClassesTest.java,v 1.1 2008-08-22 12:40:02 edaubert Exp $
 */
package option.tests;

import org.junit.Test;

import junit.textui.TestRunner;

import option.IncludeClasses;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Include Classes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncludeClassesTest extends ExportPackageDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IncludeClassesTest.class);
	}

	/**
	 * Constructs a new Include Classes test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IncludeClassesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Include Classes test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected IncludeClasses getFixture() {
		return (IncludeClasses)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createIncludeClasses());
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
	public void testAddInclude() {
		option.Class include = OptionFactory.eINSTANCE.createClass();
		include.setReference("Test*");
		getFixture().addInclude(include);
		
		assertEquals(1, getFixture().getClasses().size());
		
		include = OptionFactory.eINSTANCE.createClass();
		include.setReference("Test1");
		getFixture().addInclude(include);
		
		assertEquals(2, getFixture().getClasses().size());
		
		include = OptionFactory.eINSTANCE.createClass();
		include.setReference("*");
		getFixture().addInclude(include);
		
		assertEquals(3, getFixture().getClasses().size());
		
		include = OptionFactory.eINSTANCE.createClass();
		include.setReference(null);
		getFixture().addInclude(include);
		
		assertEquals(3, getFixture().getClasses().size());
		
		include = null;
		getFixture().addInclude(include);
		
		assertEquals(3, getFixture().getClasses().size());
	}

} // IncludeClassesTest
