/* $Id: DummyUnit.java,v 1.2 2007-05-15 09:08:59 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : DummyUnit.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2006 08 01
 * Author : dvojtise
 */
package fr.irisa.triskell.kermeta.loader;

import java.util.Hashtable;

/** This Dummy Kermeta unit is used in case of load error in order to be able to correctly trace back the error to the user
 * 
 * @author dvojtise
 *
 */
public class DummyUnit extends KermetaUnit {

	public DummyUnit(String uri, Hashtable packages) {
		super(uri, packages);
	}

	@Override
	public void preLoad() {

	}

	@Override
	public void loadAnnotations() {

	}

	@Override
	public void loadImportedUnits() {

	}

	@Override
	public void loadTypeDefinitions() {

	}

	@Override
	public void loadStructuralFeatures() {

	}

	@Override
	public void loadOppositeProperties() {

	}

	@Override
	public void loadBodies() {

	}

	@Override
	public void postLoad() {
		// Nothing to do
		
	}

}
