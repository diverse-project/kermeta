

/*$Id: RunnerHelper.java,v 1.4 2008-10-17 11:52:07 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.runner
* File : 	Runnerhelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package org.kermeta.interpreter.helper;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.ContextNotInitializedOnAFrameworkError;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class RunnerHelper {

	static public KermetaUnit getKermetaUnitToExecute(String filePath, String mergedUnitUri) throws NotRegisteredURIException, URIMalformedException, IOException, ContextNotInitializedOnAFrameworkError {

		// TODO in the end the interpreter must use its own store to make sure that
		// the edition won't interfere with the execution
		KermetaUnit source =  IOPlugin.getDefault().getEditionKermetaUnitStore().get(filePath);
	    new KermetaTypeChecker(source).checkUnit();
		new KermetaConstraintChecker(source).checkUnit();
   		if (KermetaUnitHelper.hasIndirectError(source) || KermetaUnitHelper.hasError(source)){
   			throw new KermetaInterpreterError("Cannot run invalid kermeta program. First error is : "+ KermetaUnitHelper.getAllErrors(source).get(0).getValue());
   		}
	    LinkedHashSet<KermetaUnit> kermetaUnitsToMerge = new LinkedHashSet<KermetaUnit> ();
   		kermetaUnitsToMerge.add(source);
   		kermetaUnitsToMerge.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(source) );
		Merger merger = new Merger();
		KermetaUnit mergedUnit = merger.processInMemory(kermetaUnitsToMerge, mergedUnitUri );
		IOPlugin.getDefault().getKermetaUnit( mergedUnitUri ).getMessages().addAll( source.getMessages() );
		// typecheck the resulting merge
		new KermetaTypeChecker(mergedUnit).checkUnit();
		new KermetaConstraintChecker(mergedUnit).checkUnit();
		return mergedUnit; 
	}
	
	static public KermetaUnit getKermetaUnitToExecute(Set<KermetaUnit> kermetaUnitsToMerge, IFile sourceFile) throws URIMalformedException, NotRegisteredURIException, IOException, ContextNotInitializedOnAFrameworkError {
	   	IProject project = sourceFile.getProject();   	
    	String binDirectory = "platform:/resource" + project.getFullPath().toString() + "/.bin";
		Merger merger = new Merger();
		String fileToExecute = merger.process(kermetaUnitsToMerge, binDirectory, null, true, false);
		/*
   		 * Loading and typechecking if file to execute.
   		 */
		// TODO in the end the interpreter must use its own store to make sure that
		// the edition won't interfere with the execution
		KermetaUnit mergedUnit =  IOPlugin.getDefault().getEditionKermetaUnitStore().get(fileToExecute);
		// typecheck the resulting merge
		new KermetaTypeChecker(mergedUnit).checkUnit();
		new KermetaConstraintChecker(mergedUnit).checkUnit();
   		return mergedUnit;   
	}

	static public KermetaUnit getKermetaUnitToExecute(KermetaUnit source, String binDirectory) throws URIMalformedException, NotRegisteredURIException, IOException, ContextNotInitializedOnAFrameworkError {
	    LinkedHashSet<KermetaUnit> kermetaUnitsToMerge = new LinkedHashSet<KermetaUnit> ();
   		kermetaUnitsToMerge.add(source);
   		kermetaUnitsToMerge.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(source) );
   		return getKermetaUnitToExecute(kermetaUnitsToMerge, binDirectory);
	}
	
	static public KermetaUnit getKermetaUnitToExecute(Set<KermetaUnit> kermetaUnitsToMerge, String binDirectory) throws URIMalformedException, NotRegisteredURIException, IOException, ContextNotInitializedOnAFrameworkError {
		Merger merger = new Merger();
		String fileToExecute = merger.process(kermetaUnitsToMerge, binDirectory, null, true, false);
		/*
   		 * 
   		 * Loading and typechecking if file to execute.
   		 * 
   		 */
		// TODO in the end the interpreter must use its own store to make sure that
		// the edition won't interfere with the execution
		KermetaUnit mergedUnit =  IOPlugin.getDefault().getEditionKermetaUnitStore().get(fileToExecute);
		// typecheck the resulting merge
		new KermetaTypeChecker(mergedUnit).checkUnit();
		new KermetaConstraintChecker(mergedUnit).checkUnit();
   		return mergedUnit;   
	}
		
}


