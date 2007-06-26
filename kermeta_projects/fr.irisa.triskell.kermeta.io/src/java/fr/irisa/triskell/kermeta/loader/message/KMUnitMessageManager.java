/* $Id: KMUnitMessageManager.java,v 1.6 2007-06-26 15:34:04 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.loader.message;

import java.util.ArrayList;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FObject;



/**
 * Manages KMUnit messages and provide useful functions for them
 * Typically messages are warning or errors.
 */
public class KMUnitMessageManager {
	
	/**
	 * The list of errors 
	 */
	protected ArrayList <KMUnitMessage> errors = new ArrayList <KMUnitMessage> ();
	
	/**
	 * The list of warning. typically messages that don't stop the execution 
	 */
	protected ArrayList<KMUnitMessage> warnings = new ArrayList<KMUnitMessage>();
	
	
	protected KermetaUnit unit;
	
	// Variables used to ensure to not fall in an infinite loop 
	// in case of cycle in the require statements
	protected boolean isCallinGetWarnings=false;
	protected boolean isCallinGetErrors=false;
	protected boolean isCallinNbErrors=false;
	
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
	public ArrayList <KMUnitMessage> getErrors() {
	    ArrayList <KMUnitMessage> result = new ArrayList <KMUnitMessage> ();
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
	        		result.add(new KMUnitError("Error importing unit " + iu.getUri() +" (" +
	            		indirectMsg +")", 
	            		(KermetaASTNode) unit.traceImportedUnits.get(iu)));
	        	}
	        }
	    }
	    isCallinGetErrors=false;
		return result;
	}

	/**
	 * calculate in a relatively efficient way how many errors there are
	 * this is more efficient on large amount of error  than calling getErrors().size()
	 * @return numbers of errors as if calling getErrors().size()
	 */
	public int nbErrors(){
		//return getErrors().size();
		
		int result = 0;
		if(isCallinNbErrors) return 0;
	    isCallinNbErrors = true;
	    // do the job
	    result = errors.size();
	    for (int i=0; i<unit.importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)unit.importedUnits.get(i);
	        if (iu.messages.hasError()) {
	        	int indirectErrors = iu.messages.nbErrors();
	        	if(indirectErrors > 0)
	        	{		        			        	
	        		result += 1;
	        	}
	        }
	    }
	    isCallinNbErrors=false;
		return result;
		
	}
	/**
	 * @return Returns the warnings from this unit. If there is an warning in imported unit, 
	 * 	only report the name of the unit that contain the warning
	 */
	public ArrayList<KMUnitMessage> getWarnings() {
	    ArrayList<KMUnitMessage> result = new ArrayList<KMUnitMessage>();
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
	public ArrayList<KMUnitMessage> getMessages() {
	    ArrayList<KMUnitMessage> result = new ArrayList<KMUnitMessage>();
	    result.addAll(getWarnings());
	    result.addAll(getErrors());
		return result;
	}
	
	/**
	 * @return Returns the error from this unit and imported units. 
	 * Ensures that an error is reported only once.
	 */
	public ArrayList<KMUnitMessage> getAllErrors() {
	    ArrayList<KMUnitMessage> result = new ArrayList<KMUnitMessage>();
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
	public ArrayList<KMUnitMessage> getAllWarnings() {
	    ArrayList<KMUnitMessage> result = new ArrayList<KMUnitMessage>();
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
	public ArrayList<KMUnitMessage> getAllMessages() {
	    ArrayList<KMUnitMessage> result = new ArrayList<KMUnitMessage>();
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
		while(it.hasNext()) {
			KMUnitMessage kmumessage = (KMUnitMessage)it.next();
			result += kmumessage.getMessage() + "\n";
			result += "  ->   " + getMessageOrigin(kmumessage) + "\n";
		}
		return result;
	}
	
	/**
	 * Return all the messages as a string
	 * (including messages from imported unit)
	 * @return String
	 */
	public String getAllMessagesAsString() {
		return getMessagesListAsString(getAllMessages());
	}
	/**
	 * Return all the error messages as a string
	 * (including messages from imported unit)
	 * @return String
	 */
	public String getAllErrorMessagesAsString() {
		return getMessagesListAsString(getAllErrors());
	}
	/**
	 * Return all the error messages as a string
	 * (including messages from imported unit)
	 * @return String
	 */
	public String getAllWarningMessagesAsString() {
		return getMessagesListAsString(getAllWarnings());
	}
	
	protected String getMessageOrigin(KMUnitMessage kmumessage){
		String result =null; 
		if(kmumessage.getNode() != null){
			String traceOrigin = KermetaUnitTraceHelper.getLocationAsString(kmumessage.getNode(), unit);
			if(traceOrigin != null)
				result =  KermetaUnitTraceHelper.getLocationAsString(kmumessage.getNode(), unit) ;
		}
		if(result == null) // last chance
		{
			// retreive the unit that hold this message
			boolean found = false;
			ArrayList iulist = unit.getAllImportedUnits();
		    for (int i=0; i<iulist.size(); i++) {	        
		        KermetaUnit iu = (KermetaUnit)iulist.get(i);
		        if(iu.messages.getMessages().contains(kmumessage))
		        {
		        	result =iu.getUri() ;
		        	found = true;
		        	break;
		        }
		    }
		    if(!found) result = unit.getUri() ;
		    	
		}
		return result;
	}
	
	/**
	 * return the list of messages as a string
	 * @param messages
	 * @return
	 */
	public String getMessagesListAsString(ArrayList<KMUnitMessage> messages){	
		String result = "";
		KMUnitMessage kmumessage;
		Iterator it = messages.iterator();
		while(it.hasNext()) { 
			kmumessage = (KMUnitMessage)it.next();
			result += kmumessage.getMessage() + "\n";
			result += "  ->   " + getMessageOrigin(kmumessage) + "\n";			
		}
		return result;
	}
	
    /**
     * Retrieve the parsing errors.
     */
    public ArrayList <KMUnitParseError> getParsingErrors() {
    	ArrayList <KMUnitParseError> errorsList = new ArrayList <KMUnitParseError> ();
    	for ( KMUnitMessage message : errors ) {
    		if ( message instanceof KMUnitParseError )
    			errors.add( (KMUnitParseError) message);
    	}
    	return errorsList;
    }
    
    public void deleteParsingErrors() {
    	ArrayList <KMUnitMessage> parsingErrors = new ArrayList <KMUnitMessage> ();
    	for ( KMUnitMessage message : errors ) {
    		if ( message instanceof KMUnitParseError )
    			parsingErrors.add(message);
    	}
    	for ( KMUnitMessage message : parsingErrors )
    		errors.remove(message);
    }
}
