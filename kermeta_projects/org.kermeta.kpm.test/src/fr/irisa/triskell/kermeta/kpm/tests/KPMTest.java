/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMTest.java,v 1.1 2008-05-28 11:33:31 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>KPM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getEvent(java.lang.String) <em>Get Event</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#removeUnit(java.lang.String) <em>Remove Unit</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getUnit(java.lang.String) <em>Get Unit</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getRule(java.lang.String) <em>Get Rule</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class KPMTest extends TestCase {

	/**
	 * The fixture for this KPM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPM fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KPMTest.class);
	}

	/**
	 * Constructs a new KPM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPMTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this KPM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KPM fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this KPM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPM getFixture() {
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
		KPM kpm = KpmFactory.eINSTANCE.createKPM();
		
		Unit u1 = KpmFactory.eINSTANCE.createUnit();
		u1.setName( "unit1" );
		kpm.getUnits().add(u1);

		Unit u2 = KpmFactory.eINSTANCE.createUnit();
		u2.setName( "unit2" );
		kpm.getUnits().add(u2);
		
		Unit u3 = KpmFactory.eINSTANCE.createUnit();
		u3.setName( "unit3" );
		kpm.getUnits().add(u3);
		
		Unit u4 = KpmFactory.eINSTANCE.createUnit();
		u4.setName( "unit4" );
		kpm.getUnits().add(u4);
		
		u3.beDependentOf(u4, "require");
		u2.beDependentOf(u4, "require");
		u1.beDependentOf(u2, "require");
		u1.beDependentOf(u3, "require");
		
		Event e = KpmFactory.eINSTANCE.createEvent();
		e.setName("update");
		kpm.getEvents().add(e);
		
		Rule r = KpmFactory.eINSTANCE.createRule();
		r.setName("rule1");
		
		kpm.getRules().add(r);
		
		setFixture(kpm);
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
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.KPM#getEvent(java.lang.String) <em>Get Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getEvent(java.lang.String)
	 * @generated NOT
	 */
	public void testGetEvent__String() {
		assertNotNull( fixture.getEvent("update") );
		assertNull( fixture.getEvent("open") );
	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.KPM#removeUnit(java.lang.String) <em>Remove Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#removeUnit(java.lang.String)
	 * @generated NOT
	 */
	public void testRemoveUnit__String() {
		assertTrue( fixture.getUnits().size() == 4 );
		assertTrue( fixture.getUnit("unit1").getUsedBy().size() == 2 );
		assertTrue( fixture.getUnit("unit4").getUsedUsages().size() == 2 );
		fixture.removeUnit("unit2");
		assertTrue( fixture.getUnits().size() == 3 );
		assertTrue( fixture.getUnit("unit1").getUsedBy().size() == 1 );
		assertTrue( fixture.getUnit("unit4").getUsedUsages().size() == 1 );
	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.KPM#getUnit(java.lang.String) <em>Get Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getUnit(java.lang.String)
	 * @generated NOT
	 */
	public void testGetUnit__String() {
		assertTrue( fixture.getUnit("unit1") != null );
		assertTrue( fixture.getUnit("unit10") == null );
	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.KPM#getRule(java.lang.String) <em>Get Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getRule(java.lang.String)
	 * @generated NOT
	 */
	public void testGetRule__String() {
		assertNotNull( fixture.getRule("rule1") );
		assertNull( fixture.getRule("rule2") );
	}

} //KPMTest
