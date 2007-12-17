/*$Id: KermetaUnitChecker.java,v 1.4 2007-12-17 10:47:42 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	KermetaUnitChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 sept. 07
* Authors : paco
*/

package org.kermeta.checker;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class KermetaUnitChecker {

	final static private Logger logger = LogConfigurationHelper.getLogger("KermetaUnitChecker");
	
	static private HashMap<String, List<Object>> callers = new HashMap<String, List<Object>> ();
	
	/**
	 * 
	 * Given an uri, this method loads the Kermeta Unit, typechecks it and constraint checks it.
	 * 
	 * @param uri
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(String uri, String content, Object caller, IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException {
		if ( monitor.isCanceled() )
			return null;
		
		Date beforeLoading = new Date();
		KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit(uri, content, monitor);
		Date afterLoading = new Date();
		logger.info("Loading " + uri + " (time consuming : " + (afterLoading.getTime() - beforeLoading.getTime()) + "ms).");
		initializeCallersList( unit.getUri() );
		check(unit, caller, monitor);
		return unit;
	}
	
	/**
	 * 
	 * @param uri
	 * @param content
	 * @param caller
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(String uri, String content) throws KermetaIOFileNotFoundException, URIMalformedException {
		return check(uri, content, null, new NullProgressMonitor());
	}
	
	/**
	 * 
	 * @param uri
	 * @param caller
	 * @param monitor
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(String uri, Object caller, IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException {
		return check(uri, null, caller, monitor);
	}
	
	/**
	 * 
	 * @param uri
	 * @param caller
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(String uri) throws KermetaIOFileNotFoundException, URIMalformedException {
		return check(uri, null);
	}
	
	/**
	 * 
	 * @param file
	 * @param content
	 * @param caller
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(IFile file, String content, Object caller, IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException {
		if ( monitor.isCanceled() )
			return null;
		Date beforeLoading = new Date();
		KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit(file, content, monitor);
		Date afterLoading = new Date();
		logger.info("Loading " + file + " (time consuming : " + (afterLoading.getTime() - beforeLoading.getTime()) + "ms).");
		initializeCallersList( unit.getUri() );
		check(unit, caller, monitor);
		return unit;		
	}
	
	static public KermetaUnit basicCheck(String uri, Object caller, IProgressMonitor monitor) throws URIMalformedException {
		if ( monitor.isCanceled() )
			return null;
		Date beforeLoading = new Date();
		KermetaUnit unit = IOPlugin.getDefault().basicLoadKermetaUnit(uri, monitor);
		Date afterLoading = new Date();
		logger.info("Loading " + uri + " (time consuming : " + (afterLoading.getTime() - beforeLoading.getTime()) + "ms).");
		initializeCallersList( unit.getUri() );
		check(unit, caller, monitor);
		return unit;
	}
	
	/**
	 * 
	 * @param file
	 * @param content
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(IFile file, String content) throws KermetaIOFileNotFoundException, URIMalformedException {
		return check(file, content, null, new NullProgressMonitor() );
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(IFile file) throws KermetaIOFileNotFoundException, URIMalformedException {
		return check(file, null);
	}
	
	static private void check(KermetaUnit unit, Object caller, IProgressMonitor monitor) {
		if ( ! unit.isIsBeingTypechecked() ) {
			
			unit.setIsBeingTypechecked( true );
			
			/*
			 * 
			 * Typechecking the unit if the loading has passed.
			 * 
			 */
			if ( ! unit.isErroneous() ) {
				Date beforeTypechecking = new Date();
				KermetaTypeChecker typechecker = new KermetaTypeChecker(unit, monitor);
				typechecker.checkUnit();
				Date afterTypechDate = new Date();
				logger.info("Typechecking " + unit.getUri() + " (time consuming : " + (afterTypechDate.getTime() - beforeTypechecking.getTime()) + " ms)");
			}
			
			/*
			 * 
			 * Constraint checking the unit if the typechecking has passed.
			 * 
			 */
			if ( ! unit.isErroneous() ) {
				Date beforeConstraintchecking = new Date();
				KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(unit, monitor);
				constraintchecker.checkUnit();
				Date afterConstraintchecking = new Date();
				logger.info("Typechecking " + unit.getUri() + " (time consuming : " + (afterConstraintchecking.getTime() - beforeConstraintchecking.getTime()) + " ms)");

			}

			unit.setIsBeingTypechecked( false );
			
			/*
			 * 
			 * Wake up the threads that were waiting for the checking result.
			 * Clear the list.
			 * 
			 */
			for ( Object o : callers.get(unit.getUri()) )
				synchronized (o) {
					o.notify();	
				}
			
			callers.get(unit.getUri()).clear();
			
		} else {
			
			if ( caller != null ) {
			
				callers.get(unit.getUri()).add( caller );
			
				/*
				 * 
				 * Waiting for the end of the checking.
				 * 
				 */
				synchronized (caller) {
					while ( ! unit.isTypeChecked() ) {
						try {
							caller.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
			
		}
	}
	
	static private void initializeCallersList(String uri) {
		if ( callers.get(uri) == null )
			callers.put(uri, new ArrayList<Object>() );
	}
	
}


