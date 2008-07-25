

/*$Id: LoadKM.java,v 1.1 2008-07-25 12:40:12 ftanguy Exp $
* Project : org.kermeta.framework.compiled.runtime
* File : 	Test.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : paco
*/

package org.kermeta.framework.compiled.test;

import java.io.File;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Object;
import kermeta.language.structure.Property;
import kermeta.persistence.PersistenceFactory;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import org.kermeta.compil.runtime.helper.persistence.PersistenceMapping;

public class LoadKM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "/home/paco/kpm-workbench/org.kermeta.fsm.compiled/models/";
		PersistenceMapping.initialize( new File(path) );

		Repository repository = PersistenceFactory.eINSTANCE.createEMFRepository();
		Resource resource = repository.createResource(path + "sample1.fsm", "http://www.kermeta.org/fsm");
		resource.load();

		Object o = resource.getValues().get(0);
		ClassDefinition cd = (ClassDefinition) o.getMetaClass().getTypeDefinition();
		for ( Property p : cd.getOwnedAttribute() ) {
			System.out.println( p.getName() );
			o.get(p);
		}
		
	}
	
}


