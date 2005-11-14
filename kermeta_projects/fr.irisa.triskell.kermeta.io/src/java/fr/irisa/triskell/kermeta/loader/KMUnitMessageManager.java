/* $Id: KMUnitMessageManager.java,v 1.3 2005-11-14 16:28:42 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KMUnitMessageManager.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 14 sept. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *         
 */
package fr.irisa.triskell.kermeta.loader;

import java.util.ArrayList;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FObject;



/**
 * Manages KMUnit messages and provide useful functions for them
 * Typically messages are warning or errors.
 */
public class KMUnitMessageManager {
	
	/**
	 * The list of errors 
	 */
	protected ArrayList errors = new ArrayList();
	
	/**
	 * The list of warning. typically messages that don't stop the execution 
	 */
	protected ArrayList warnings = new ArrayList();
	
	
	protected KermetaUnit unit;
	
	/**
	 * Constructor
	 *
	 */
	public KMUnitMessageManager(KermetaUnit theUnit)
	{
		unit = theUnit;
	}
	
	
	/**
	 * add an error or warning message in the manager
	 * @param msg
	 */
	public void addMessage(KMUnitMessage msg)
	{
		if (msg instanceof KMUnitError)
		{
			errors.add(msg);
			unitHasError = true;
		}
		else
		{
			warnings.add(msg);
		}
	}
	
	/**
	 * shortcut for <code>addMessage(new KMUnitError(message, node))</code>
	 * more complex error type should use the standard way
	 * @param message
	 * @param node
	 */
	public void addError(String message, FObject node)
	{
		errors.add(new KMUnitError(message, node));
		unitHasError = true;
	}
	/**
	 * shortcut for <code>addMessage(new KMUnitWarning(message, node))</code>
	 * more complex error type should use the standard way
	 * @param message
	 * @param node
	 */
	public void addWarning(String message, FObject node)
	{
		warnings.add(new KMUnitWarning(message, node));
	}
	
	/**
	 * tells if there is an error in this unit
	 */
	public boolean unitHasError = false;
	
	/**
	 * check if there is an error in this unit or in one of its imported units
	 * @return boolean
	 */
	public boolean hasError()
	{
		if (unitHasError) return true;
	    ArrayList iulist = unit.getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        if (iu.messages.unitHasError) 
	        	return true;
	    }
		return false;		
	}
	
	/**
	 * @return Returns the error from this unit. If there is an error in imported unit, 
	 * 	only report the name of the unit that contain the error and the message of the first error
	 */
	public ArrayList getErrors() {
	    ArrayList result = new ArrayList();
	    result.addAll(errors);
	    for (int i=0; i<unit.importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)unit.importedUnits.get(i);
	        if (iu.messages.hasError()) {
	        	String indirectMsg = ((KMUnitMessage)iu.messages.getErrors().get(0)).getMessage();
	            result.add(new KMUnitError("Error in imported unit " + iu.getUri() +" (" +
	            		indirectMsg +")", null));
	        }
	    }
		return result;
	}

	/**
	 * @return Returns the warnings from this unit. If there is an warning in imported unit, 
	 * 	only report the name of the unit that contain the warning
	 */
	public ArrayList getWarnings() {
	    ArrayList result = new ArrayList();
	    result.addAll(warnings);
	    for (int i=0; i<unit.importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)unit.importedUnits.get(i);
	        if (iu.messages.getWarnings().size() != 0) {
	        	String indirectMsg = ((KMUnitMessage)iu.messages.getWarnings().get(0)).getMessage();
	            result.add(new KMUnitWarning("Warning in imported unit " + iu.getUri() +" (" +
	            		indirectMsg +")", null));
	        }
	    }
		return result;
	}
	
	/**
	 * @return Returns the warnings and messages from this unit. If there is a warning or error in 
	 * an imported unit, only report the name of the unit that contain the warning/error
	 */
	public ArrayList getMessages() {
	    ArrayList result = new ArrayList();
	    result.addAll(getWarnings());
	    result.addAll(getErrors());
		return result;
	}
	
	/**
	 * @return Returns the error from this unit and imported units. 
	 * Ensures that an error is reported only once.
	 */
	public ArrayList getAllErrors() {
	    ArrayList result = new ArrayList();
	    result.addAll(errors);
	    ArrayList iulist = unit.getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        result.addAll(iu.messages.errors);
	    }
		return result;
	}
	
	/**
	 * @return Returns the warnings from this unit and imported units. 
	 * Ensures that a warning is reported only once.
	 */
	public ArrayList getAllWarnings() {
	    ArrayList result = new ArrayList();
	    result.addAll(warnings);
	    ArrayList iulist = unit.getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        result.addAll(iu.messages.warnings);
	    }
		return result;
	}
	/**
	 * @return Returns the warnings and errors from this unit and imported units. 
	 * Ensures that a warning or error is reported only once.
	 */
	public ArrayList getAllMessages() {
	    ArrayList result = new ArrayList();
	    result.addAll(getAllWarnings());
	    result.addAll(getAllErrors());
		return result;
	}
	
	/**
	 * Return all the error messages as a string
	 * (if there are messages in imported unit, they are summarized as one message )
	 * @return String
	 */
	public String getMessagesAsString() {
		String result = "";
		Iterator it = getMessages().iterator();
		while(it.hasNext()) result += ((KMUnitMessage)it.next()).getMessage() + "\n";
		return result;
	}
	
	/**
	 * Return all the error messages as a string
	 * (including messages from imported unit)
	 * @return String
	 */
	public String getAllMessagesAsString() {
		String result = "";
		KMUnitMessage kmumessage;
		Iterator it = getAllMessages().iterator();
		while(it.hasNext()) { 
			kmumessage = (KMUnitMessage)it.next();
			result += kmumessage.getMessage() + "\n";
			if(kmumessage.getNode() != null)
				result += "->   " + KermetaUnitTraceHelper.getLocationAsString(kmumessage.getNode(), unit) + "\n";
			else
			{
				// retreive the unit that hold this message
				boolean found = false;
				ArrayList iulist = unit.getAllImportedUnits();
			    for (int i=0; i<iulist.size(); i++) {	        
			        KermetaUnit iu = (KermetaUnit)iulist.get(i);
			        if(iu.messages.getMessages().contains(kmumessage))
			        {
			        	result += "->   " +iu.uri + "\n";
			        	found = true;
			        	break;
			        }
			    }
			    if(!found) result += "->   " +unit.uri + "\n";
			    	
			}
		}
		return result;
	}
}
