

/*$Id: NameFilterHelperTest.java,v 1.1 2008-05-28 11:33:28 ftanguy Exp $
* Project : org.kermeta.kpm.test
* File : 	NameFilterHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 mai 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.tests;

import org.kermeta.kpm.NameFilterHelper;

import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import junit.framework.TestCase;

public class NameFilterHelperTest extends TestCase {

	public void testMatching1() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("platform:/resource/oneProject/oneFolder/oneFile.kmt");
		
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("*.kmt");
		
		assertTrue( filter.matches(u) );
	}

	public void testMatching2() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("platform:/resource/oneProject/oneFolder/oneFile.ecore");
		
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("*.ecore");
		
		assertTrue( filter.matches(u) );
	}
	
	public void testMatching3() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("platform:/resource/oneProject/oneFolder/oneFile.npk");
		
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("*.npk");
		
		assertTrue( filter.matches(u) );
	}
	
	public void testMatching4() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("platform:/resource/oneProject/oneFolder/oneFile.ecore");
		
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("platform:/resource/oneProject/oneFolder/*.ecore");
		
		assertTrue( filter.matches(u) );
	}
	
	public void testMatching5() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("platform:/resource/oneProject/oneFolder/oneFile.ecore");
		
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("platform:/resource/oneProject/*.ecore");
		
		assertTrue( filter.matches(u) );
	}
	
	public void testNameFilterHelper1() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("platform:/resource/oneProject/oneFolder/oneFile.ecore");
		
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("*.kmt");
		
		assertEquals("platform:/resource/oneProject/oneFolder/oneFile.kmt", NameFilterHelper.getOutputString(u, filter));
	}

	public void testNameFilterHelper2() {
		Unit u = KpmFactory.eINSTANCE.createUnit();
		u.setName("platform:/resource/oneProject/oneFolder/oneFile.ecore");
		
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex("platform:/resource/oneProject/*.kmt");
		
		assertEquals("platform:/resource/oneProject/oneFile.kmt", NameFilterHelper.getOutputString(u, filter));
	}

	
}


