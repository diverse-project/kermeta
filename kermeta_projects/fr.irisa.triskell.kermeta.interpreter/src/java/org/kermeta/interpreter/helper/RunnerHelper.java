

/*$Id: RunnerHelper.java,v 1.2 2008-02-14 07:13:57 uid21732 Exp $
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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class RunnerHelper {

	static public KermetaUnit getKermetaUnitToExecute(String filePath) throws NotRegisteredURIException, URIMalformedException, IOException {
	    KermetaUnit source = KermetaUnitChecker.check(filePath);
	    LinkedHashSet<KermetaUnit> kermetaUnitsToMerge = new LinkedHashSet<KermetaUnit> ();
   		kermetaUnitsToMerge.add(source);
   		kermetaUnitsToMerge.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(source) );
		Merger merger = new Merger();
		merger.processInMemory(kermetaUnitsToMerge, "platform:/resource/unknown.km");	
		return KermetaUnitChecker.check("platform:/resource/unknown.km"); 
	}
	
	static public KermetaUnit getKermetaUnitToExecute(Set<KermetaUnit> kermetaUnitsToMerge, IFile sourceFile) throws URIMalformedException, NotRegisteredURIException, IOException {
	   	IProject project = sourceFile.getProject();   	
    	String binDirectory = "platform:/resource" + project.getFullPath().toString() + "/.bin";
		Merger merger = new Merger();
		String fileToExecute = merger.process(kermetaUnitsToMerge, binDirectory, null);
		/*
   		 * 
   		 * Loading and typechecking if file to execute.
   		 * 
   		 */
   		return KermetaUnitChecker.check( fileToExecute );   
	}

	static public KermetaUnit getKermetaUnitToExecute(KermetaUnit source, String binDirectory) throws URIMalformedException, NotRegisteredURIException, IOException {
	    LinkedHashSet<KermetaUnit> kermetaUnitsToMerge = new LinkedHashSet<KermetaUnit> ();
   		kermetaUnitsToMerge.add(source);
   		kermetaUnitsToMerge.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(source) );
   		return getKermetaUnitToExecute(kermetaUnitsToMerge, binDirectory);
	}
	
	static public KermetaUnit getKermetaUnitToExecute(Set<KermetaUnit> kermetaUnitsToMerge, String binDirectory) throws URIMalformedException, NotRegisteredURIException, IOException {
		Merger merger = new Merger();
		String fileToExecute = merger.process(kermetaUnitsToMerge, binDirectory, null);
		/*
   		 * 
   		 * Loading and typechecking if file to execute.
   		 * 
   		 */
   		return KermetaUnitChecker.check( fileToExecute, new NullProgressMonitor() );   
	}
		
}


