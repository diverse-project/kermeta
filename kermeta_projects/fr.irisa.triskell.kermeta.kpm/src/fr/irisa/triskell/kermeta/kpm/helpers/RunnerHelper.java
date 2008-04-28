

/*$Id: RunnerHelper.java,v 1.3 2008-04-28 11:49:59 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.runner
* File : 	Runnerhelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.helpers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.loader.LoadingOptions;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;

public class RunnerHelper {

	static public KermetaUnit getKermetaUnitToExecute(String filePath) throws NotRegisteredURIException, URIMalformedException, IOException {
		return org.kermeta.interpreter.helper.RunnerHelper.getKermetaUnitToExecute(filePath, "platform:/resource/unknown.km");
	}
	
	static public KermetaUnit getKermetaUnitToExecute(Set<KermetaUnit> kermetaUnitsToMerge, IFile sourceFile) throws URIMalformedException, NotRegisteredURIException, IOException {
		return org.kermeta.interpreter.helper.RunnerHelper.getKermetaUnitToExecute(kermetaUnitsToMerge, sourceFile);
	}

	static public KermetaUnit getKermetaUnitToExecute(KermetaUnit source, String binDirectory) throws URIMalformedException, NotRegisteredURIException, IOException {
		return org.kermeta.interpreter.helper.RunnerHelper.getKermetaUnitToExecute(source, binDirectory);
	}
	
	static public KermetaUnit getKermetaUnitToExecute(Set<KermetaUnit> kermetaUnitsToMerge, String binDirectory) throws URIMalformedException, NotRegisteredURIException, IOException {
		return org.kermeta.interpreter.helper.RunnerHelper.getKermetaUnitToExecute(kermetaUnitsToMerge, binDirectory);
	}
	
	static public KermetaUnit getKermetaUnitToExecute(String binDirectory, Set<KermetaUnit> kermetaUnitsToMerge, IFile sourceFile, KermetaProject project) throws IOException, CoreException, URIMalformedException, NotRegisteredURIException {
		/*
		 * 
		 * Getting the path of the file to execute.
		 * 
		 */
		String fileToExecute = binDirectory + "/" + Merger.getDefaultPath(kermetaUnitsToMerge, false);
		/*
		 * 
		 * getting the real resource.
		 * 
		 */
		IFile executableFile = ResourceHelper.getIFile(fileToExecute, false);
		boolean recompile = true;
		Unit unit = null;
		if ( project != null ) {
			for ( KermetaUnit kermetaUnit : kermetaUnitsToMerge ) {
				IFile file = ResourceHelper.getIFile(kermetaUnit.getUri());
				/*
				 * 
				 * The file can come from plugins, therefore getIFile returns null.
				 * 
				 */
				if ( file != null ) {
					Unit currentUnit = project.getKpm().findUnit( file.getFullPath().toString() );
					if ( unit == null )
						unit = currentUnit;
					else if ( currentUnit.getLastTimeModified().getTime() > unit.getLastTimeModified().getTime() )
						unit = currentUnit;
				}
			}
			recompile = ! (executableFile.exists() && executableFile.getLocalTimeStamp() == unit.getLastTimeModified().getTime());
		}
		/*
   		 * 
   		 * If the source file has changed, then recompile the file to execute.
   		 * Otherwise we can keep the actual file to execute because no compilation is needed.
   		 * We save here a lot of time.
   		 * 
   		 */
   		if ( recompile ) {
   			Merger merger = new Merger();
   			fileToExecute = merger.process(kermetaUnitsToMerge, binDirectory, null, true, false);
   			if ( unit != null )
   				executableFile.setLocalTimeStamp( unit.getLastTimeModified().getTime() );
		}
   		/*
   		 * 
   		 * Loading and typechecking if file to execute.
   		 * 
   		 */
   		Map<Object, Object> options = new HashMap<Object, Object>();
   		options.put(LoadingOptions.INCLUDE_FRAMEWORK, false);
   		return KermetaUnitChecker.check( fileToExecute, options, new NullProgressMonitor() );
	}
	
}


