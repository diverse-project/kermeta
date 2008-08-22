/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleNativeCodeTest.java,v 1.1 2008-08-22 12:39:59 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.BundleNativeCode;
import manifest.ManifestFactory;
import manifest.NativeCode;
import option.NativeCodeDirective;
import option.OptionFactory;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Native Code</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleNativeCodeTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleNativeCodeTest.class);
	}

	/**
	 * Constructs a new Bundle Native Code test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleNativeCodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Native Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleNativeCode getFixture() {
		return (BundleNativeCode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleNativeCode());
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
	public void testAddNativeCode() {
		NativeCode nativeCode = ManifestFactory.eINSTANCE.createNativeCode();
		nativeCode.setReference("lib/comm.dll");		
		getFixture().addNativeCode(nativeCode);
		
		assertEquals(1, getFixture().getNativeCodes().size());
		
		nativeCode = ManifestFactory.eINSTANCE.createNativeCode();
		nativeCode.setReference("lib/comm_linux.dll");
		getFixture().addNativeCode(nativeCode);

		assertEquals(2, getFixture().getNativeCodes().size());
		
		getFixture().addNativeCode(nativeCode);

		assertEquals(2, getFixture().getNativeCodes().size());

		getFixture().addNativeCode(null);

		assertEquals(2, getFixture().getNativeCodes().size());

		nativeCode = ManifestFactory.eINSTANCE.createNativeCode();
		nativeCode.setReference(null);
		getFixture().addNativeCode(nativeCode);

		assertEquals(2, getFixture().getNativeCodes().size());
		
	}
	
	@Test
	public void testAddDirective() {
		NativeCodeDirective directive = OptionFactory.eINSTANCE.createOsName();
		getFixture().addDirective(directive);
		
		assertEquals(1, getFixture().getDirectives().size());
		assertEquals(directive, getFixture().getDirectives().get(0));
		
		NativeCodeDirective directive1 = OptionFactory.eINSTANCE.createLanguage();
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
		
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
		
		NativeCodeDirective directive2 = OptionFactory.eINSTANCE.createOsVersion();
		getFixture().addDirective(directive2);
		
		assertEquals(3, getFixture().getDirectives().size());
		NativeCodeDirective directive3 = OptionFactory.eINSTANCE.createProcessor();
		getFixture().addDirective(directive3);
		
		assertEquals(4, getFixture().getDirectives().size());
		NativeCodeDirective directive4 = OptionFactory.eINSTANCE.createSelectionFilter();
		getFixture().addDirective(directive4);
		
		assertEquals(5, getFixture().getDirectives().size());
		
		getFixture().addDirective(null);
		
		assertEquals(5, getFixture().getDirectives().size());
		
		directive4.setToken(null);
		getFixture().addDirective(directive4);
		
		assertEquals(5, getFixture().getDirectives().size());
	}

} //BundleNativeCodeTest
