

/*$Id: KermetaUnitHelper.java,v 1.11 2008-02-06 09:38:24 dvojtise Exp $
* Project : io
* File : 	KermetaUnitHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.Message;
import org.kermeta.io.WarningMessage;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class KermetaUnitHelper {

	/**
	 * returns a list of the KermetaUnit required units(directly or indirectly from this unit) doesn't contains 
	 * the unit even if it is indirectly required
	 * @param value
	 * @return
	 */
	static public List <KermetaUnit> getAllImportedKermetaUnits(KermetaUnit value) {
		List <KermetaUnit> units = new ArrayList <KermetaUnit> ();
		if ( value != null )
			getAllImportedKermetaUnits(value, units);
		units.remove(value);  // if contains the value, remove it
		return units;
	}

	/**
	 * completes the list of KermetaUnit required units(directly or indirectly from this unit)
	 * it may contains itself if it is indirectly required
	 * @param value
	 * @param units
	 */
	static private void getAllImportedKermetaUnits(KermetaUnit value, List <KermetaUnit> units) {
		Iterator <KermetaUnit> iterator = value.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			if ( ! units.contains(current) ) {
				units.add( current );
				getAllImportedKermetaUnits(current, units);
			}
		}
	}

	static public List <ErrorMessage> getErrors(KermetaUnit kermetaUnit) {
		List <ErrorMessage> list = new ArrayList <ErrorMessage> ();
		for ( Message message : (List <Message>) kermetaUnit.getMessages() ) {
			if ( message instanceof ErrorMessage )
				list.add( (ErrorMessage) message );
		}
		return list;
	}
	
	/*static public List <ErrorMessage> getAllErrors(KermetaUnit kermetaUnit) {
		List <ErrorMessage> list = new ArrayList <ErrorMessage> ();
		for ( Message message : (List <Message>) kermetaUnit.getMessages() ) {
			if ( message instanceof ErrorMessage )
				list.add( (ErrorMessage) message );
		}
		return list;
	} */
	
	static public String getErrorsAsString(KermetaUnit kermetaUnit) {
		String result = "";
		
		for ( Message message : (List <Message>) kermetaUnit.getMessages() ) {
			
			if ( message instanceof ErrorMessage )
				result += message.getValue() + "\n";
			
		}
		
		return result;
	}
	
	
	static public List <ErrorMessage> getAllErrors(KermetaUnit kermetaUnit) {
		List<ErrorMessage> errors = new ArrayList<ErrorMessage> ();
		List<KermetaUnit> kermetaUnitsProcessed = new ArrayList<KermetaUnit> ();
		getAllErrors(kermetaUnit, errors, kermetaUnitsProcessed);
		return errors;
	}
	
	static private void getAllErrors(KermetaUnit kermetaUnit, List<ErrorMessage> errors, List<KermetaUnit> kermetaUnitsProcessed) {
		if ( kermetaUnitsProcessed.contains(kermetaUnit) )
			return;
		kermetaUnitsProcessed.add( kermetaUnit );
		errors.addAll( getErrors(kermetaUnit) );
		for ( KermetaUnit importedUnit : (List<KermetaUnit>) kermetaUnit.getImportedKermetaUnits() )
			getAllErrors(importedUnit, errors, kermetaUnitsProcessed);
	}
	
	static public String getAllErrorsAsString(KermetaUnit kermetaUnit) {
		List<String> errors = new ArrayList<String> ();
		List<KermetaUnit> kermetaUnitsProcessed = new ArrayList<KermetaUnit> ();
		getAllErrorsAsString(kermetaUnit, errors, kermetaUnitsProcessed);
		String result = "";
		for (String s : errors)
			result += s + "\n";
		return result;
	}
	
	static private void getAllErrorsAsString(KermetaUnit kermetaUnit, List<String> errors, List<KermetaUnit> kermetaUnitsProcessed) {
		if ( kermetaUnitsProcessed.contains(kermetaUnit) )
			return;
		kermetaUnitsProcessed.add( kermetaUnit );
		for ( ErrorMessage error : getErrors(kermetaUnit) )
			errors.add( "In " + kermetaUnit.getUri() + " : " + error.getValue() );
		for ( KermetaUnit importedUnit : (List<KermetaUnit>) kermetaUnit.getImportedKermetaUnits() )
			getAllErrorsAsString(importedUnit, errors, kermetaUnitsProcessed);
	}
	
	static public List <WarningMessage> getWarnings(KermetaUnit kermetaUnit) {
		List <WarningMessage> list = new ArrayList <WarningMessage> ();
		for ( Message message : (List <Message>) kermetaUnit.getMessages() ) {
			if ( message instanceof WarningMessage )
				list.add( (WarningMessage) message );
		}
		return list;
	}
	
	static public String getWarningsAsString(KermetaUnit kermetaUnit) {
		String result = "";
		
		for ( Message message : (List <Message>) kermetaUnit.getMessages() ) {
			
			if ( message instanceof WarningMessage )
				result += "Error : " + message.getValue() + "\n";
			
		}
		
		return result;
	}
	
	static public List <WarningMessage> getAllWarnings(KermetaUnit kermetaUnit) {
		List<WarningMessage> warnings = new ArrayList<WarningMessage> ();
		List<KermetaUnit> kermetaUnitsProcessed = new ArrayList<KermetaUnit> ();
		getAllWarnings(kermetaUnit, warnings, kermetaUnitsProcessed);
		return warnings;
	}
	
	static private void getAllWarnings(KermetaUnit kermetaUnit, List<WarningMessage> warnings, List<KermetaUnit> kermetaUnitsProcessed) {
		if ( kermetaUnitsProcessed.contains(kermetaUnit) )
			return;
		kermetaUnitsProcessed.add( kermetaUnit );
		warnings.addAll( getWarnings(kermetaUnit) );
		for ( KermetaUnit importedUnit : (List<KermetaUnit>) kermetaUnit.getImportedKermetaUnits() )
			getAllWarnings(importedUnit, warnings, kermetaUnitsProcessed);
	}
	
	
	static public String getAllWarningsAsString(KermetaUnit kermetaUnit) {
		String result = "";
		for ( WarningMessage message : KermetaUnitHelper.getAllWarnings(kermetaUnit) )
			result += message.getValue() + "\n";
		
		return result;
	}
	
	static public String getAllMessagesAsString(KermetaUnit kermetaUnit) {
		String result = "";
		
		for ( Message message : (List <Message>) kermetaUnit.getMessages() ) {
			result += "Warning : " + message.getValue() + "\n";
		}
		
		return result;
	}
	
	static public boolean isErrored(KermetaUnit kermetaUnit) {
		return ! getErrors(kermetaUnit).isEmpty();
	}
	
	static public boolean isIndirectlyErrored(KermetaUnit kermetaUnit) {
		return ! getAllErrors(kermetaUnit).isEmpty();
	}
	
	static public boolean isWarned(KermetaUnit kermetaUnit) {
		return ! getWarnings(kermetaUnit).isEmpty();
	}
	
	static public Set <TypeDefinition> getTypeDefinitions(KermetaUnit kermetaUnit) {
		Set <TypeDefinition> result = new HashSet <TypeDefinition> ();
		for ( Package p : (List<Package>) kermetaUnit.getPackages() ) {
			result.addAll( p.getOwnedTypeDefinition() );
		}
		return result;
	}
	
	static public Set <TypeDefinition> getInternalTypeDefinitions(KermetaUnit kermetaUnit) {
		Set <TypeDefinition> result = new HashSet <TypeDefinition> ();
		for ( Package p : (List<Package>) kermetaUnit.getInternalPackages() ) {
			result.addAll( p.getOwnedTypeDefinition() );
		}
		return result;
	}
	
	public static EList<TypeDefinition> getAspects(KermetaUnit kermetaUnit, TypeDefinition typeDefinition) {
		EList<TypeDefinition> result = new UniqueEList<TypeDefinition> ();
		if ( kermetaUnit != null ) {
			List<KermetaUnit> processedUnits = new ArrayList<KermetaUnit> ();
			getAspects(kermetaUnit, typeDefinition, processedUnits, result);
		}
		return result;
	}
	
	private static void getAspects(KermetaUnit kermetaUnit, TypeDefinition typeDefinition, List<KermetaUnit> processedUnits, List<TypeDefinition> result) {
		
		if ( processedUnits.contains(kermetaUnit) )
			return;
		processedUnits.add( kermetaUnit );
		Set<TypeDefinition> typeDefinitions = getTypeDefinitions(kermetaUnit);
		for ( TypeDefinition t : typeDefinitions ) {
			if ( (t != typeDefinition) && (t.getBaseAspects().contains(typeDefinition)) )
				result.add(t);
			else if ( typeDefinition.getBaseAspects().contains(t) ) {
				KermetaUnit u = KermetaUnitHelper.getKermetaUnitFromObject(t);
				EList<TypeDefinition> l = u.getAspects().get(t);
				if ( l == null )
					l = new UniqueEList<TypeDefinition> ();
				l.add(typeDefinition);
				u.getAspects().put(t, l);
			}
				
		}
			
		//for ( KermetaUnit importedUnit : kermetaUnit.getImporters() )
		//	getAspects(importedUnit, typeDefinition, processedUnits, result);
	}
	

	
	static public KermetaUnit getKermetaUnitFromObject(EObject o) {
		EList<KermetaUnit> s = IOPlugin.getDefault().getKermetaUnits();
		ModelingUnit cu = getModelingUnit(o);
		for ( KermetaUnit unit : s ) {
			if ( unit.getModelingUnit() == cu )
				return unit;
		}
		return null;
	}
	
	static private ModelingUnit getModelingUnit(EObject o) {		
		if ( o instanceof ModelingUnit )
			return (ModelingUnit) o;
		else if ( o.eContainer() != null )
			return getModelingUnit( o.eContainer() );
		else return null;
	}
	
}


