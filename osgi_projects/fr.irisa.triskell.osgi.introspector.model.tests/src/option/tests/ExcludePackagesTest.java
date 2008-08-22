/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludePackagesTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import org.junit.Test;

import junit.textui.TestRunner;

import option.ExcludePackages;
import option.OptionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Exclude Packages</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcludePackagesTest extends ActivationPolicyDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExcludePackagesTest.class);
	}

	/**
	 * Constructs a new Exclude Packages test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExcludePackagesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exclude Packages test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected ExcludePackages getFixture() {
		return (ExcludePackages)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createExcludePackages());
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
	public void testAddExcludePackage() {
		option.Package exclude = OptionFactory.eINSTANCE.createPackage();
		exclude.setReference("fr.irisa.triskell");
		getFixture().addExcludePackage(exclude);
		
		assertEquals(1, getFixture().getPackages().size());
		
		exclude = OptionFactory.eINSTANCE.createPackage();
		exclude.setReference("fr.irisa.triskell.test");
		getFixture().addExcludePackage(exclude);
		
		assertEquals(2, getFixture().getPackages().size());
		
		exclude = OptionFactory.eINSTANCE.createPackage();
		exclude.setReference("");
		getFixture().addExcludePackage(exclude);
		
		assertEquals(3, getFixture().getPackages().size());
		
		exclude = OptionFactory.eINSTANCE.createPackage();
		exclude.setReference(null);
		getFixture().addExcludePackage(exclude);
		
		assertEquals(3, getFixture().getPackages().size());
		
		exclude = null;
		getFixture().addExcludePackage(exclude);
		
		assertEquals(3, getFixture().getPackages().size());
	}

} // ExcludePackagesTest
