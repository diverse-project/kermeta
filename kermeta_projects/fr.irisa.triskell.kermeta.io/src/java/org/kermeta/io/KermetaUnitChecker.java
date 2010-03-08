/*$Id: KermetaUnitChecker.java,v 1.5 2008-05-28 13:39:06 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	KermetaUnitChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 sept. 07
* Authors : paco
*/

package org.kermeta.io;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.log4j.util.LogConfigurationHelper;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.typechecker.ContextNotInitializedOnAFrameworkError;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class KermetaUnitChecker {

	final static private Log logger = LogConfigurationHelper.getLogger("LoaderPlugin");
	
	/**
	 * 
	 * Given an uri, this method loads the Kermeta Unit, typechecks it and constraint checks it.
	 * 
	 * @param uri
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 * @throws ContextNotInitializedOnAFrameworkError 
	 */
	/*static public KermetaUnit check(String uri, String content, KermetaUnitStore store, IProgressMonitor monitor) throws URIMalformedException, NotRegisteredURIException, ContextNotInitializedOnAFrameworkError {
		return check(uri, null, content, store, monitor);
	}*/

	/*static public KermetaUnit check(String uri, Map<String, Object> options, KermetaUnitStore store, IProgressMonitor monitor) throws URIMalformedException, NotRegisteredURIException, ContextNotInitializedOnAFrameworkError {
		return check(uri, options, null, store, monitor);
	}*/
	
	static public KermetaUnit check(String uri, /*Map<String, Object> options, String content,*/ KermetaUnitStore store, IProgressMonitor monitor) throws URIMalformedException, NotRegisteredURIException, ContextNotInitializedOnAFrameworkError {
		if ( monitor.isCanceled() )
			return null;
		Date beforeLoading = new Date();
		/*if ( options == null )
			options = new HashMap<String, Object>();
		options.put(LoadingOptions.CONTENT, content);
		options.put( LoadingOptions.ECORE_QuickFixEnabled, true );*/
		//LoaderPlugin.getDefault().unload(uri, LoaderPlugin.getDefault().getNewLoadersContext());
		KermetaUnit unit = store.get(uri);
		Date afterLoading = new Date();
		logger.info("Loading " + uri + " (time consuming : " + (afterLoading.getTime() - beforeLoading.getTime()) + "ms).");
		check(unit, monitor);
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
	 * @throws ContextNotInitializedOnAFrameworkError 
	 */
/*	static public KermetaUnit check(String uri, String content, KermetaUnitStore store) throws NotRegisteredURIException, URIMalformedException, ContextNotInitializedOnAFrameworkError {
		return check(uri, content, store, new NullProgressMonitor());
	}*/
	
/*	static public KermetaUnit check(String uri, KermetaUnitStore store, IProgressMonitor monitor) throws NotRegisteredURIException, URIMalformedException, ContextNotInitializedOnAFrameworkError {
		return check(uri, new HashMap<String, Object>(), store, monitor);
	}*/
	
	static public KermetaUnit check(String uri, KermetaUnitStore store) throws NotRegisteredURIException, URIMalformedException, ContextNotInitializedOnAFrameworkError {
		return check(uri, /*new HashMap<String, Object>(),*/ store, new NullProgressMonitor());
	}
		
	/**
	 * 
	 * @param file
	 * @param content
	 * @param caller
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 * @throws ContextNotInitializedOnAFrameworkError 
	 */
	static public KermetaUnit check(IFile file, /*String content,*/ KermetaUnitStore store, IProgressMonitor monitor) throws NotRegisteredURIException, URIMalformedException, ContextNotInitializedOnAFrameworkError {
		if ( monitor.isCanceled() )
			return null;
		String uri = "platform:/resource" + file.getFullPath().toString();
		return check(uri, /*content,*/ store, monitor);
	}
		
	/**
	 * 
	 * @param file
	 * @param content
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 * @throws ContextNotInitializedOnAFrameworkError 
	 */
	/*static public KermetaUnit check(IFile file, String content, KermetaUnitStore store) throws NotRegisteredURIException, URIMalformedException, ContextNotInitializedOnAFrameworkError {
		return check(file, content, store, new NullProgressMonitor() );
	}*/
	
	/**
	 * 
	 * @param file
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 * @throws ContextNotInitializedOnAFrameworkError 
	 */
	static public KermetaUnit check(IFile file, KermetaUnitStore store) throws NotRegisteredURIException, URIMalformedException, ContextNotInitializedOnAFrameworkError {
		if ( file == null )
			return null;
		return check(file, null);
	}
	
	static private void check(KermetaUnit unit, IProgressMonitor monitor) throws ContextNotInitializedOnAFrameworkError {
		if ( ! unit.isIsBeingTypechecked() ) {
			
			unit.setIsBeingTypechecked( true );
			
			/*
			 * 
			 * Typechecking the unit if the loading has passed.
			 * 
			 */
			if ( ! unit.isErroneous() ) {
				Date beforeTypechecking = new Date();
				KermetaTypeChecker typechecker = new KermetaTypeChecker(unit);
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
				KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(unit);
				constraintchecker.checkUnit();
				Date afterConstraintchecking = new Date();
				logger.info("Constraintchecking " + unit.getUri() + " (time consuming : " + (afterConstraintchecking.getTime() - beforeConstraintchecking.getTime()) + " ms)");

			}
			

			unit.setIsBeingTypechecked( false );
		}
			
	}
	
}


