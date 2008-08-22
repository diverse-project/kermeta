/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncludePackagesTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import org.junit.Test;

import junit.textui.TestRunner;

import option.IncludePackages;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Include Packages</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncludePackagesTest extends ActivationPolicyDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IncludePackagesTest.class);
	}

	/**
	 * Constructs a new Include Packages test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IncludePackagesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Include Packages test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected IncludePackages getFixture() {
		return (IncludePackages)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createIncludePackages());
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
	public void testAddIncludePackage() {
		option.Package include = OptionFactory.eINSTANCE.createPackage();
		include.setReference("fr.irisa.triskell");
		getFixture().addIncludePackage(include);
		
		assertEquals(1, getFixture().getPackages().size());
		
		include = OptionFactory.eINSTANCE.createPackage();
		include.setReference("fr.irisa.triskell.test");
		getFixture().addIncludePackage(include);
		
		assertEquals(2, getFixture().getPackages().size());
		
		include = OptionFactory.eINSTANCE.createPackage();
		include.setReference("");
		getFixture().addIncludePackage(include);
		
		assertEquals(3, getFixture().getPackages().size());
		
		include = OptionFactory.eINSTANCE.createPackage();
		include.setReference(null);
		getFixture().addIncludePackage(include);
		
		assertEquals(3, getFixture().getPackages().size());
		
		include = null;
		getFixture().addIncludePackage(include);
		
		assertEquals(3, getFixture().getPackages().size());
	}

} // IncludePackagesTest
