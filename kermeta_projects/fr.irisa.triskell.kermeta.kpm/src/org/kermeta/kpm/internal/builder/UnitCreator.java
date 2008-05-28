

/*$Id: UnitCreator.java,v 1.1 2008-05-28 09:26:15 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	UnitCreator.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

import java.io.IOException;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;

import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class UnitCreator {

	/**
	 * 
	 */
	protected KPM _kpm;
	
	/**
	 * 
	 */
	private Date _date = new Date();
	
	/**
	 * 
	 * @param kpm
	 */
	public UnitCreator(KPM kpm) {
		_kpm = kpm;
	}

	/**
	 * 
	 */
	private void save() {
		try {
			_kpm.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param name
	 * @param save
	 * @return
	 */
	private Unit createUnit(String name, boolean save) {
		Unit unit = KpmFactory.eINSTANCE.createUnit();
		unit.setName( name );
		unit.setLastTimeModified( _date );
		_kpm.getUnits().add(unit);
		if ( save )
			save();
		return unit;
	}
		
	/**
	 * 
	 * @param name
	 * @return
	 */
	protected Unit createUnit(String name) {
		return createUnit(name, true);
	}
	
	/**
	 * 
	 * @param resource
	 * @return
	 */
	protected Unit createUnit(IResource resource) {
		Unit unit = createUnit( "platform:/resource" + resource.getFullPath().toString(), false );
		if ( resource instanceof IFile ) {
			if ( ((IFile) resource).getFileExtension().equals("kmt") )
				unit.getRules().add( KPMRules.UPDATE_KMT_RULE );
		}
		save();
		return unit;
	}
	 
}


