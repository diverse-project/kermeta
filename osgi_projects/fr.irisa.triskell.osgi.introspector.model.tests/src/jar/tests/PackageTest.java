package jar.tests;



import java.util.List;

import org.junit.Test;

import jar.Class;
import jar.Package;
import jar.JarFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageTest extends BundleEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageTest.class);
	}

	/**
	 * Constructs a new Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected jar.Package getFixture() {
		return (jar.Package)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JarFactory.eINSTANCE.createPackage());
		getFixture().setFullPath("");
		getFixture().setName("");
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
	
	private Class createClass(String name, String fullPath) {
		Class clazz = JarFactory.eINSTANCE.createClass();
		clazz.setFullPath(fullPath);
		clazz.setName(name);
		
		return clazz;
	}
	
	private Package createPackage(String name, String fullPath) {
		Package _package = JarFactory.eINSTANCE.createPackage();
		_package.setFullPath(fullPath);
		_package.setName(name);
		
		return _package;
	}
	
	@Test
	public void testAddClass() {
		Class clazz = this.createClass("Test1", "Test1");
		
		assertTrue(getFixture().addClass(clazz));
		assertEquals(1, getFixture().getClasses().size());
		assertFalse(getFixture().addClass(clazz));
		
		try {
			this.setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		clazz = JarFactory.eINSTANCE.createClass();
		
		assertFalse(getFixture().addClass(clazz));
		
		clazz.setName("Test");
		clazz.setFullPath("org.Test");
		
		assertTrue(getFixture().addClass(clazz));
		assertEquals(0, getFixture().getClasses().size());
		assertEquals(1, getFixture().getSubPackages().size());
		assertFalse(getFixture().addClass(clazz));
		
		clazz = this.createClass("Test1", "org.Test1");
		
		assertTrue(getFixture().addClass(clazz));
		assertEquals(0, getFixture().getClasses().size());
		assertEquals(1, getFixture().getSubPackages().size());
		assertFalse(getFixture().addClass(clazz));
		
		clazz = this.createClass("Test", "org.Test");
		
		assertFalse(getFixture().addClass(clazz));
	}

	@Test
	public void testGetClassString() {
		Class clazz = this.createClass("Test", "org.Test");
		
		Class clazz1 = this.createClass("Test1", "org.Test1");
		
		Class clazz2 = this.createClass("Test2", "org.Test2");
		
		Package _package = JarFactory.eINSTANCE.createPackage();
		_package.setFullPath("org.triskell");
		_package.setName("triskell");
		Class clazz3 = this.createClass("Test3", "org.triskell.Test3");
		_package.addClass(clazz3);
		
		getFixture().addPackage(_package);
		
		getFixture().addClass(clazz);
		getFixture().addClass(clazz1);
		getFixture().addClass(clazz2);
		
		assertEquals(clazz, getFixture().getClass(clazz.getFullPath()));
		assertEquals(clazz, getFixture().getClass("org.Test"));
		assertNotNull(getFixture().getClass(clazz2.getFullPath()));
		assertNotSame(clazz1, getFixture().getClass(clazz2.getFullPath()));
		assertNull(getFixture().getClass("bin.org.Test"));
		
		assertNull(getFixture().getClass("bin/org/Test"));
		assertNull(getFixture().getClass("binorgTest"));
		
		assertEquals(clazz3, getFixture().getClass(clazz3.getFullPath()));
		assertEquals(clazz3, getFixture().getClass("org.triskell.Test3"));
		assertNull(getFixture().getClass("org.triskell.Test2"));
	}

	/*public void testGetSubElement() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testGetPackage() {
		Package _package = this.createPackage("test", "org.test");
		_package.setName("test");
		_package.setFullPath("org.test");
		
		Package _package1 = this.createPackage("test1", "org.test1");
		
		Package _package2 = this.createPackage("test2", "org.test2");
		
		Package _package3 = this.createPackage("test3", "org.test2.test3");
		
		_package2.addPackage(_package3);
		
		getFixture().addPackage(_package);
		getFixture().addPackage(_package1);
		getFixture().addPackage(_package2);
		
		assertEquals(_package, getFixture().getPackage(_package.getFullPath()));
		assertEquals(_package, getFixture().getPackage("org.test"));
		assertNotNull(getFixture().getPackage(_package2.getFullPath()));
		assertNotSame(_package1, getFixture().getPackage(_package2.getFullPath()));
		assertNull(getFixture().getPackage("bin.org.test"));
		
		assertNull(getFixture().getPackage("bin/org/test"));
		assertNull(getFixture().getPackage("binorgtest"));
		
		assertEquals(_package3, getFixture().getPackage(_package3.getFullPath()));
		assertEquals(_package3, getFixture().getPackage("org.test2.test3"));
	}

	@Test
	public void testGetClassWithRegex() {
		// TODO add tests for getClassWithRegex when recursive is true
		Class clazz = this.createClass("Test", "Test");
		
		Class clazz1 = this.createClass("Test1", "Test1");
		
		Class clazz2 = this.createClass("Test2", "org.Test2");
		
		Package _package = JarFactory.eINSTANCE.createPackage();
		_package.setFullPath("org.triskell");
		_package.setName("triskell");
		Class clazz3 = this.createClass("Test3", "org.triskell.Test3");
		_package.addClass(clazz3);
		
		getFixture().addPackage(_package);
		
		getFixture().addClass(clazz);
		getFixture().addClass(clazz1);
		getFixture().addClass(clazz2);
		
		List<Class> result = getFixture().getClassWithRegex(clazz.getName(), false);
		assertEquals(1, result.size());
		assertEquals(clazz, result.get(0));
		
		result = getFixture().getClassWithRegex("Test*", false);
		assertEquals(2, result.size());
		assertTrue(result.contains(clazz));
		assertTrue(result.contains(clazz1));
		
		result = getFixture().getClassWithRegex("*Test*", false);
		assertEquals(2, result.size());
		assertTrue(result.contains(clazz));
		assertTrue(result.contains(clazz1));
		
		assertNotNull(getFixture().getClassWithRegex(clazz2.getName(), false));
		assertNotSame(clazz1, getFixture().getClassWithRegex(clazz2.getName(), false));
		assertEquals(0, getFixture().getClassWithRegex("org.Test", false).size());
		
		assertEquals(0, getFixture().getClassWithRegex("bin/org/Test", false).size());
		assertEquals(0, getFixture().getClassWithRegex("binorgTest", false).size());
		
		assertEquals(clazz3, getFixture().getClass(clazz3.getFullPath()));
		assertEquals(clazz3, _package.getClassWithRegex("*", false).get(0));
	}

	@Test
	public void testAddPackage() {
		Package _package = JarFactory.eINSTANCE.createPackage();
		
		assertFalse(getFixture().addPackage(_package));
		
		_package.setName("test");
		_package.setFullPath("org.test");
		
		assertTrue(getFixture().addPackage(_package));
		assertEquals(0, getFixture().getClasses().size());
		assertEquals(1, getFixture().getSubPackages().size());
		assertTrue(getFixture().addPackage(_package));
		
		_package = JarFactory.eINSTANCE.createPackage();
		_package.setName("test1");
		_package.setFullPath("org.test1");
		
		assertTrue(getFixture().addPackage(_package));
		assertEquals(2, getFixture().getPackage("org").getSubPackages().size());
		assertTrue(getFixture().addPackage(_package));
		
		_package = JarFactory.eINSTANCE.createPackage();
		_package.setName("test");
		_package.setFullPath("org.test");
		
		assertTrue(getFixture().addPackage(_package));
		
		_package = JarFactory.eINSTANCE.createPackage();
		_package.setName("test1");
		_package.setFullPath("org.test.test1");
		
		assertTrue(getFixture().addPackage(_package));
		assertTrue(getFixture().addPackage(_package));
	}


} //PackageTest