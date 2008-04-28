/*$Id: KermetaUnitChecker.java,v 1.3 2008-04-28 11:50:48 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	KermetaUnitChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 sept. 07
* Authors : paco
*/

package org.kermeta.io.checker;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.typechecker.CallableFeaturesCache;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.typechecker.TypeDefinitionContextCache;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class KermetaUnitChecker {

	final static private Logger logger = LogConfigurationHelper.getLogger("LoaderPlugin");
	
	/**
	 * 
	 * Given an uri, this method loads the Kermeta Unit, typechecks it and constraint checks it.
	 * 
	 * @param uri
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(String uri, String content, IProgressMonitor monitor) throws URIMalformedException, NotRegisteredURIException {
		return check(uri, null, content, monitor);
	}

	static public KermetaUnit check(String uri, Map<Object, Object> options, IProgressMonitor monitor) throws URIMalformedException, NotRegisteredURIException {
		return check(uri, options, null, monitor);
	}
	
	static public KermetaUnit check(String uri, Map<Object, Object> options, String content, IProgressMonitor monitor) throws URIMalformedException, NotRegisteredURIException {
		if ( monitor.isCanceled() )
			return null;
		Date beforeLoading = new Date();
		if ( options == null )
			options = new HashMap<Object, Object>();
		options.put(LoadingOptions.CONTENT, content);
		options.put( LoadingOptions.ECORE_QuickFixEnabled, true );
		KermetaUnit unit = LoaderPlugin.getDefault().load(uri, options);
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
	 */
	static public KermetaUnit check(String uri, String content) throws NotRegisteredURIException, URIMalformedException {
		return check(uri, content, new NullProgressMonitor());
	}
	
	static public KermetaUnit check(String uri, IProgressMonitor monitor) throws NotRegisteredURIException, URIMalformedException {
		return check(uri, new HashMap<Object, Object>(), monitor);
	}
	
	static public KermetaUnit check(String uri) throws NotRegisteredURIException, URIMalformedException {
		return check(uri, new HashMap<Object, Object>(), new NullProgressMonitor());
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
	static public KermetaUnit check(IFile file, String content, IProgressMonitor monitor) throws NotRegisteredURIException, URIMalformedException {
		if ( monitor.isCanceled() )
			return null;
		String uri = "platform:/resource" + file.getFullPath().toString();
		return check(uri, content, monitor);
	}
		
	/**
	 * 
	 * @param file
	 * @param content
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(IFile file, String content) throws NotRegisteredURIException, URIMalformedException {
		return check(file, content, new NullProgressMonitor() );
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	static public KermetaUnit check(IFile file) throws NotRegisteredURIException, URIMalformedException {
		if ( file == null )
			return null;
		return check(file, null);
	}
	
	static private void check(KermetaUnit unit, IProgressMonitor monitor) {
		if ( ! unit.isIsBeingTypechecked() ) {
			
			unit.setIsBeingTypechecked( true );
			CallableFeaturesCache.destroyInstance();
			TypeDefinitionContextCache.destroyInstance();
			
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
			
			CallableFeaturesCache.destroyInstance();
			TypeDefinitionContextCache.destroyInstance();

			unit.setIsBeingTypechecked( false );
		}
			
	}
	
}


