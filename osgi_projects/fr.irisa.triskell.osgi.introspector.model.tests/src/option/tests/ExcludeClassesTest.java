/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludeClassesTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import org.junit.Test;

import junit.textui.TestRunner;

import option.ExcludeClasses;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Exclude Classes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcludeClassesTest extends ExportPackageDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExcludeClassesTest.class);
	}

	/**
	 * Constructs a new Exclude Classes test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExcludeClassesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exclude Classes test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected ExcludeClasses getFixture() {
		return (ExcludeClasses)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createExcludeClasses());
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
	public void testAddExclude() {
		option.Class exclude = OptionFactory.eINSTANCE.createClass();
		exclude.setReference("Test*");
		getFixture().addExclude(exclude);
		
		assertEquals(1, getFixture().getClasses().size());
		
		exclude = OptionFactory.eINSTANCE.createClass();
		exclude.setReference("Test1");
		getFixture().addExclude(exclude);
		
		assertEquals(2, getFixture().getClasses().size());
		
		exclude = OptionFactory.eINSTANCE.createClass();
		exclude.setReference("*");
		getFixture().addExclude(exclude);
		
		assertEquals(3, getFixture().getClasses().size());
		
		exclude = OptionFactory.eINSTANCE.createClass();
		exclude.setReference(null);
		getFixture().addExclude(exclude);
		
		assertEquals(3, getFixture().getClasses().size());
		
		exclude = null;
		getFixture().addExclude(exclude);
		
		assertEquals(3, getFixture().getClasses().size());
	}

} // ExcludeClassesTest
