/* $Id: KermetaCompiler.java,v 1.7 2008-09-02 21:57:34 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileKermetaAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.io.KermetaUnit;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class KermetaCompiler extends AbstractCompilerImpl {

	protected IFile kermetafile;

	final static public Log internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	/**
	 * Constructor for CompileKermetaAction.
	 */
	public KermetaCompiler(IFile kermetaFile) {
		super();
		this.kermetafile = kermetaFile;
	}
	
	public void generateEcore(IFile ifile) {
				
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(InterpreterOptions.MERGE, false);
		options.put(InterpreterOptions.TYPE_CHECKED, true);
		try {
			Interpreter interpreter = new Interpreter("platform:/plugin/fr.irisa.triskell.kermeta/src/java/org/kermeta/km2ecore/StructureCompiler.km", InterpreterMode.RUN, options);
			interpreter.setEntryPoint("kermeta::compiler::Main", "main_km2ecore_behaviorJava");
			String[] parameters = new String[3];
			parameters[0] = "platform:/resource" + ifile.getFullPath().toString();
			parameters[1] = "";
			parameters[2] = "platform:/resource" + ifile.getFullPath().removeFileExtension().addFileExtension("ecore").toString();
			interpreter.setParameters(parameters);
			EclipseConsole console = new EclipseConsole("KM2Ecore_with_behaviorJava");
			interpreter.setStreams(console);
			interpreter.launch();
			ifile.refreshLocal(1, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * output to the given file using default format: XMI
	 * 
	 * @param builder
	 * @param ifile
	 * @param isExecutable
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit kermetaUnit, IFile ifile) throws Exception {
						
		Set<KermetaUnit> l = new HashSet<KermetaUnit>();
		l.add(kermetaUnit);
		l.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) );
		
		String fileURI = "platform:/resource" + ifile.getFullPath().toString();
		int index = fileURI.lastIndexOf(".");
	  	fileURI = fileURI.substring(0, index) + ".km";
				
		Merger merger = new Merger();
		try {
			merger.process(l, fileURI, true, true);
			ifile.refreshLocal(1, null);
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}
}
