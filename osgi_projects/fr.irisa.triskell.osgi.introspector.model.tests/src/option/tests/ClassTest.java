/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassTest.java,v 1.1 2008-08-22 12:40:03 edaubert Exp $
 */
package option.tests;

import jar.Class;
import jar.JarFactory;

import org.junit.Test;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import option.OptionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassTest extends TestCase {

	/**
	 * The fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected option.Class fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassTest.class);
	}

	/**
	 * Constructs a new Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(option.Class fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected option.Class getFixture() {
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
		setFixture(OptionFactory.eINSTANCE.createClass());
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
	public void testAddClass() {
		Class clazz = JarFactory.eINSTANCE.createClass();
		clazz.setFullPath("fr.irisa.triskell.Test");
		clazz.setName("Test");
		
		getFixture().addClass(clazz);
		
		assertEquals(1, getFixture().getClasses().size());
		
		getFixture().addClass(clazz);
		
		assertEquals(1, getFixture().getClasses().size());
		
		clazz = JarFactory.eINSTANCE.createClass();
		clazz.setFullPath("fr.irisa.triskell.Test1");
		clazz.setName("Test1");
		
		getFixture().addClass(clazz);
		
		assertEquals(2, getFixture().getClasses().size());
		
		clazz = JarFactory.eINSTANCE.createClass();
		clazz.setFullPath("fr.irisa.triskell.Test2");
		clazz.setName(null);
		
		getFixture().addClass(clazz);
		
		assertEquals(2, getFixture().getClasses().size());
		
		clazz = JarFactory.eINSTANCE.createClass();
		clazz.setFullPath(null);
		clazz.setName("Test3");
		
		getFixture().addClass(clazz);
		
		assertEquals(2, getFixture().getClasses().size());
		
		clazz = null;
		
		getFixture().addClass(clazz);
		
		assertEquals(2, getFixture().getClasses().size());
		
		
	}

} //ClassTest
