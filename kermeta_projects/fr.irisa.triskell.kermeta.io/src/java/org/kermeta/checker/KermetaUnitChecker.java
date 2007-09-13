

/*$Id: KermetaUnitChecker.java,v 1.1 2007-09-13 09:04:51 ftanguy Exp $
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
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class KermetaUnitChecker {

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
		KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit(uri, content, monitor);
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
		KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit(file, content, monitor);
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
			if ( ! unit.isErrored() ) {
				KermetaTypeChecker typechecker = new KermetaTypeChecker(unit, monitor);
				typechecker.checkUnit();
			}
			
			/*
			 * 
			 * Constraint checking the unit if the typechecking has passed.
			 * 
			 */
			if ( ! unit.isErrored() ) {
				KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(unit, monitor);
				constraintchecker.checkUnit();
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


