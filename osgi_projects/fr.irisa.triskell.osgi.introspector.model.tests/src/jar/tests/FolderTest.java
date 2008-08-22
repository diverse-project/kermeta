package jar.tests;


import jar.Folder;
import jar.JarFactory;
import jar.SystemEntry;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FolderTest extends SystemEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FolderTest.class);
	}

	/**
	 * Constructs a new Folder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Folder getFixture() {
		return (Folder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JarFactory.eINSTANCE.createFolder());
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
	


	public void testAddEntry() {
		SystemEntry file = JarFactory.eINSTANCE.createFile();
		file.setName("file.jar");
		file.setFullPath("lib/file.jar");
		
		assertTrue(getFixture().addEntry(file));
		
		assertFalse(getFixture().addEntry(file));
		
		SystemEntry file1 = JarFactory.eINSTANCE.createFile();
		file1.setName("file1.jar");
		file1.setFullPath("lib/file1.jar");
		
		assertTrue(getFixture().addEntry(file1));
		
		assertFalse(getFixture().addEntry(file1));
		
		SystemEntry file2 = JarFactory.eINSTANCE.createFile();
		file2.setName("file.jar");
		file2.setFullPath("lib/file.jar");
		
		SystemEntry folder = JarFactory.eINSTANCE.createFolder();
		folder.setName("lib");
		folder.setFullPath("lib/");
		assertTrue(((Folder)folder).addEntry(file2));
		
		assertFalse(getFixture().addEntry(folder));
	}

	public void testGetEntry() {
		SystemEntry file = JarFactory.eINSTANCE.createFile();
		file.setName("file.jar");
		file.setFullPath("lib/file.jar");
		
		getFixture().addEntry(file);
		
		SystemEntry file1 = JarFactory.eINSTANCE.createFile();
		file1.setName("file1.jar");
		file1.setFullPath("lib1/file1.jar");
		
		getFixture().addEntry(file1);
		
		assertEquals(file, getFixture().getEntry(file.getFullPath()));
		assertNotNull(getFixture().getEntry(file1.getFullPath()));
		assertEquals(file1, getFixture().getEntry(file1.getFullPath()));
		assertNotSame(file1, getFixture().getEntry(file.getFullPath()));
		assertNull(getFixture().getEntry(""));
		assertNull(getFixture().getEntry("lib/jar/file.jar"));
	}

} //FolderTest