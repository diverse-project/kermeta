/* $Id: KMUnitMessageManager.java,v 1.7 2006-03-03 15:22:19 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
//import fr.irisa.triskell.kermeta.language.structure.FObject;



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
	
	// Variables used to ensure to not fall in an infinite loop 
	// in case of cycle in the require statements
	protected boolean isCallinGetWarnings=false;
	protected boolean isCallinGetErrors=false;
	
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
	public void addError(String message, fr.irisa.triskell.kermeta.language.structure.Object node)
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
	public void addWarning(String message, fr.irisa.triskell.kermeta.language.structure.Object node)
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
		unitHasError = errors.size() > 0 ;
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
	    //	  we may have a cycle in the require statements ...
	    if(isCallinGetErrors) return result;
	    isCallinGetErrors = true;
	    // do the job
	    result.addAll(errors);
	    for (int i=0; i<unit.importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)unit.importedUnits.get(i);
	        if (iu.messages.hasError()) {
	        	ArrayList indirectErrors = iu.messages.getErrors();
	        	if(indirectErrors.size() > 0)
	        	{	
	        		String indirectMsg = ((KMUnitMessage)indirectErrors.get(0)).getMessage();	        	
	        		result.add(new KMUnitError("Error in imported unit " + iu.getUri() +" (" +
	            		indirectMsg +")", 
	            		(KermetaASTNode) unit.traceImportedUnits.get(iu)));
	        	}
	        }
	    }
	    isCallinGetErrors=false;
		return result;
	}

	/**
	 * @return Returns the warnings from this unit. If there is an warning in imported unit, 
	 * 	only report the name of the unit that contain the warning
	 */
	public ArrayList getWarnings() {
	    ArrayList result = new ArrayList();
	    // we may have a cycle in the require statements ...
	    if(isCallinGetWarnings) return result;
	    isCallinGetWarnings = true;
	    // do the job
	    result.addAll(warnings);
	    for (int i=0; i<unit.importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)unit.importedUnits.get(i);
	        if (iu.messages.getWarnings().size() != 0) {
	        	ArrayList indirectWarnings = iu.messages.getWarnings();
	        	if(indirectWarnings.size() > 0)
	        	{	
	        		String indirectMsg = ((KMUnitMessage)indirectWarnings.get(0)).getMessage();
	        		result.add(new KMUnitWarning("Warning in imported unit " + iu.getUri() +" (" +
	            		indirectMsg +")", 
	            		(KermetaASTNode) unit.traceImportedUnits.get(iu)));
	        	}
	        }
	    }
	    isCallinGetWarnings = false;
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
