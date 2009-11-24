

/*$Id: UnitCreator.java,v 1.7 2008-11-04 12:24:32 dvojtise Exp $
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
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.preferences.KPMPreferenceHelper;

import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.string.EscapeChars;

/**
 * This class is used to perform unit creation and to store them into a KPM model.
 * Extending this class should be the only way to create units because it provides an api
 * and a default and safe implementation.
 * 
 * @author paco
 *
 */
public class UnitCreator {

	/**
	 * The KPM model used to store units and to be saved.
	 */
	protected KPM _kpm;
	
	/**
	 * The timestamp used to create units.
	 * It is created one time so that every unit created in a process has the same timestamp.
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
	 * Save KPM model.
	 */
	private void save() {
		try {
			_kpm.eResource().save(null);
		} catch (IOException e) {
			KPMPlugin.logErrorMessage("Failed to save resource " + _kpm.eResource().getURI().toFileString(), e);
		}
	}
	
	/**
	 * Create a unit timestamped and add it to the KPM model.
	 * If a save is required, save the KPM model.
	 * @param name The name of the unit to be created.
	 * @param save Flag to indicate if a save is needed.
	 * @return The created unit or an existing one.
	 */
	private Unit createUnit(String name, boolean save) {
		
		Unit unit = _kpm.getUnit(name);
		if (unit != null)
			return unit;
		unit = KpmFactory.eINSTANCE.createUnit();
		unit.setName( name );
		unit.setLastTimeModified( _date );
		_kpm.getUnits().add(unit);
		if ( save )
			save();
		return unit;
	}
		
	/**
	 * Create a unit timestamped and add it to the KPM model.
	 * A save is performed.
	 * @param name The name of the unit to be created.
	 * @return The created unit.
	 */
	public Unit createUnit(String name) {
		return createUnit(name, true);
	}
		
	
	/**
	 * Get or Create a unit for the resource, timestamp it and add it to the KPM model.
	 * Create unit only for Resource with associated rule
	 * @param resource The resource to be created as a unit.
	 * @return The created unit or an existing one
	 */
	public Unit conditionalGetOrCreateUnit(IResource resource, boolean save) {
		IFile file = null;
		Unit unit = _kpm.getUnit("platform:/resource" + resource.getFullPath().toString());
		if (unit != null)
			return unit;
		
		//Code to filter the *.java and *.class files
		if ( resource instanceof IFile ) {
			file = (IFile) resource;
			String fileName = file.getFullPath().toString();
			for(String pattern : KPMPreferenceHelper.getExcludedFilePatterns()){
				if(fileName.matches(EscapeChars.forSimpleRegex(pattern)))
					return null;
			}			
		}
				
		if ( file != null && file.getFileExtension() != null && file.getFileExtension().equals("kmt") ) {
			unit = createUnit( "platform:/resource" + resource.getFullPath().toString(), false );
			unit.getRules().add( KPMRules.UPDATE_KMT_RULE );
		}
		
		if ( save )
			save();
		return unit;
	}
	 
}


