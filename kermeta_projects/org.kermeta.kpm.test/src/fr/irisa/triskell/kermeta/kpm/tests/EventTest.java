/**
 * <copyright>
 * </copyright>
 *
 * $Id: EventTest.java,v 1.1 2008-05-28 11:33:28 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Event#equals(java.lang.String) <em>Equals</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Event#equals(fr.irisa.triskell.kermeta.kpm.Event) <em>Equals</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EventTest extends TestCase {

	/**
	 * The fixture for this Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Event fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventTest.class);
	}

	/**
	 * Constructs a new Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Event fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Event getFixture() {
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
		Event e = KpmFactory.eINSTANCE.createEvent();
		e.setName("event1");
		setFixture(e);
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
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.Event#equals(java.lang.String) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.Event#equals(java.lang.String)
	 * @generated NOT
	 */
	public void testEquals__String() {
		assertTrue( fixture.equals("event1") );
		assertFalse( fixture.equals("event2") );
	}

	/**
	 * Tests the '{@link fr.irisa.triskell.kermeta.kpm.Event#equals(fr.irisa.triskell.kermeta.kpm.Event) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.Event#equals(fr.irisa.triskell.kermeta.kpm.Event)
	 * @generated NOT
	 */
	public void testEquals__Event() {
		Event e1 = KpmFactory.eINSTANCE.createEvent();
		e1.setName("event1");
		assertTrue( fixture.equals(e1) );

		Event e2 = KpmFactory.eINSTANCE.createEvent();
		e2.setName("event2");
		assertFalse( fixture.equals(e2) );
	}

} //EventTest
