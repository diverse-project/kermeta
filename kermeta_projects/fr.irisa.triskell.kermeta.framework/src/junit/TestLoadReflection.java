import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.basetypes.Iterator;
import junit.framework.TestCase;
import junit.textui.TestRunner;
/*
 * Created on 22 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TestLoadReflection extends TestCase {

	
	public void testLoadReflection() {
		KermetaUnit abstract_unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("src/kmt/Standard.kmt");
		abstract_unit.load();
		java.util.Iterator it = abstract_unit.packageLookup("kermeta").getFNestedPackage().iterator();
		
		while (it.hasNext()) System.out.println(it.next());
		
		assertTrue(abstract_unit.packageLookup("kermeta").getFNestedPackage().size() == 3);
	}
	
	


}
