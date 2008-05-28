/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnitTest.java,v 1.1 2008-05-28 11:33:31 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Unit;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#beDependentOf(fr.irisa.triskell.kermeta.kpm.Unit, java.lang.String) <em>Be Dependent Of</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#equals(java.lang.Object) <em>Equals</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#addMaster(fr.irisa.triskell.kermeta.kpm.Dependency) <em>Add Master</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#addDependent(fr.irisa.triskell.kermeta.kpm.Dependency) <em>Add Dependent</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#beMasterOf(fr.irisa.triskell.kermeta.kpm.Unit, java.lang.String) <em>Be Master Of</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class UnitTest extends TestCase {

	/**
	 * The fixture for this Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Unit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitTest.class);
	}

	/**
	 * Constructs a new Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Unit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Unit getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		Unit unit = KpmFactory.eINSTANCE.createUnit();
		unit.setName("unit1");
		setFixture(unit);
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

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.Unit#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#equals(java.lang.Object)
	 * @generated NOT
	 */
	public void testEquals__Object() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("unit1");
		assertTrue( fixture.equals(u) );
		assertFalse( fixture.equals("unit1") );
	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.Unit#addMaster(fr.irisa.triskell.kermeta.kpm.Dependency) <em>Add Master</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#addMaster(fr.irisa.triskell.kermeta.kpm.Dependency)
	 * @generated NOT
	 */
	public void testAddMaster__Dependency() {
		Unit from = KpmFactory.eINSTANCE.createUnit();
		from.setName("from");
		Unit to = fixture;
		
		Dependency d1 = KpmFactory.eINSTANCE.createDependency();
		d1.setType("require");
		d1.setFrom(from);
		d1.setTo(to);
		to.addMaster(d1);

		assertTrue( to.getMasters().size() == 1 );
		
		if ( to.getMasters().size() == 1 ) {
			assertTrue( to.getMasters().get(0).getFrom() == from );
			assertTrue( to.getMasters().get(0).getTo() == to );
			assertTrue( to.getMasters().get(0).getType().equals("require") );
		}
		
		Dependency d2 = KpmFactory.eINSTANCE.createDependency();
		d2.setType("require");
		d2.setFrom(from);
		d2.setTo(to);
		to.addMaster(d2);

		assertTrue( to.getMasters().size() == 1 );

	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.Unit#addDependent(fr.irisa.triskell.kermeta.kpm.Dependency) <em>Add Dependent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#addDependent(fr.irisa.triskell.kermeta.kpm.Dependency)
	 * @generated NOT
	 */
	public void testAddDependent__Dependency() {
		Unit from = KpmFactory.eINSTANCE.createUnit();
		from.setName("from");
		Unit to = fixture;
		
		Dependency d1 = KpmFactory.eINSTANCE.createDependency();
		d1.setType("require");
		d1.setFrom(from);
		d1.setTo(to);
		to.addDependent(d1);

		assertTrue( to.getDependents().size() == 1 );
		
		if ( to.getMasters().size() == 1 ) {
			assertTrue( to.getDependents().get(0).getFrom() == from );
			assertTrue( to.getDependents().get(0).getTo() == to );
			assertTrue( to.getDependents().get(0).getType().equals("require") );
		}
		
		Dependency d2 = KpmFactory.eINSTANCE.createDependency();
		d2.setType("require");
		d2.setFrom(from);
		d2.setTo(to);
		to.addDependent(d2);

		assertTrue( to.getDependents().size() == 1 );
	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.Unit#beDependentOf(fr.irisa.triskell.kermeta.kpm.Unit, java.lang.String) <em>Be Dependent Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#beDependentOf(fr.irisa.triskell.kermeta.kpm.Unit, java.lang.String)
	 * @generated NOT
	 */
	public void testBeDependentOf__Unit_String() {
		Unit master = KpmFactory.eINSTANCE.createUnit();
		master.setName("master");
		fixture.beDependentOf(master, "require");
		assertTrue( fixture.getMasters().size() == 1 );
		assertTrue( master.getDependents().size() == 1 );
	
		if ( fixture.getMasters().size() == 1 ) {
			assertTrue( fixture.getMasters().get(0).getFrom() == fixture );
			assertTrue( fixture.getMasters().get(0).getTo() == master );
		}
		
		if ( master.getDependents().size() == 1 ) {
			assertTrue( master.getDependents().get(0).getFrom() == fixture );
			assertTrue( master.getDependents().get(0).getTo() == master );
		}
	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.Unit#beMasterOf(fr.irisa.triskell.kermeta.kpm.Unit, java.lang.String) <em>Be Master Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#beMasterOf(fr.irisa.triskell.kermeta.kpm.Unit, java.lang.String)
	 * @generated NOT
	 */
	public void testBeMasterOf__Unit_String() {
		Unit dependent = KpmFactory.eINSTANCE.createUnit();
		dependent.setName("dependent");
		fixture.beMasterOf(dependent, "require");
		assertTrue( fixture.getDependents().size() == 1 );
		assertTrue( dependent.getMasters().size() == 1 );
		
		if ( fixture.getMasters().size() == 1 ) {
			assertTrue( fixture.getMasters().get(0).getFrom() == dependent );
			assertTrue( fixture.getMasters().get(0).getTo() == fixture );
		}
		
		if ( dependent.getDependents().size() == 1 ) {
			assertTrue( dependent.getDependents().get(0).getFrom() == dependent );
			assertTrue( dependent.getDependents().get(0).getTo() == fixture );
		}
	}

} //UnitTest
