/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionTests.java,v 1.1 2008-08-22 12:40:02 edaubert Exp $
 */
package option.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>option</b></em>'
 * package. <!-- end-user-doc -->
 * @generated
 */
public class OptionTests extends TestSuite {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public static Test suite() {
		TestSuite suite = new OptionTests("option Tests");
		//suite.addTest(new TestSuite(ActivationPolicyDirectiveTest.class));
		//suite.addTest(new TestSuite(AttributEntryTest.class));
		suite.addTest(new TestSuite(ClassTest.class));
		//suite.addTest(new TestSuite(DirectiveEntryTest.class));
		suite.addTest(new TestSuite(ExcludeClassesTest.class));
		suite.addTest(new TestSuite(ExcludePackagesTest.class));
		//suite.addTest(new TestSuite(ExportPackageDirectiveTest.class));
		//suite.addTest(new TestSuite(ExtensionTest.class));
		//suite.addTest(new TestSuite(FragmentAttachmentTest.class));
		//suite.addTest(new TestSuite(FragmentHostDirectiveTest.class));
		//suite.addTest(new TestSuite(ImportPackageDirectiveTest.class));
		suite.addTest(new TestSuite(IncludeClassesTest.class));
		suite.addTest(new TestSuite(IncludePackagesTest.class));
		//suite.addTest(new TestSuite(LanguageTest.class));
		suite.addTest(new TestSuite(MandatoryTest.class));
		//suite.addTest(new TestSuite(NativeCodeDirectiveTest.class));
		//suite.addTest(new TestSuite(OsNameTest.class));
		//suite.addTest(new TestSuite(OsVersionTest.class));
		//suite.addTest(new TestSuite(PackageTest.class));
		//suite.addTest(new TestSuite(ParameterEntryTest.class));
		//suite.addTest(new TestSuite(ProcessorTest.class));
		//suite.addTest(new TestSuite(RequireBundleDirectiveTest.class));
		//suite.addTest(new TestSuite(ResolutionTest.class));
		//suite.addTest(new TestSuite(SelectionFilterTest.class));
		//suite.addTest(new TestSuite(SingletonTest.class));
		//suite.addTest(new TestSuite(SymbolicNameDirectiveTest.class));
		suite.addTest(new TestSuite(UsesTest.class));
		//suite.addTest(new TestSuite(VisibilityTest.class));
		return suite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OptionTests(String name) {
		super(name);
	}

} // OptionTests
