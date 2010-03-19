/* $Id: Kmt2KmExporter4Compiler.java,v 1.2 2009-02-19 13:17:57 cfaucher Exp $
 * Project   : org.kermeta.compiler
 * File      : Kmt2KmExporter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : Cyril Faucher <cfaucher@irisa.fr>
 */

package org.kermeta.compiler;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.merger.Merger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class Kmt2KmExporter4Compiler {

	protected IFile kermetafile;

	final static public Logger internalLog = LoggerFactory.getLogger("KermetaCompiler");

	/**
	 * Constructor for CompileKermetaAction.
	 */
	public Kmt2KmExporter4Compiler(IFile kermetaFile) {
		super();
		this.kermetafile = kermetaFile;
	}
	
	/**
	 * Export the kmt file to a km file that is merged and typechecked
	 * @param kermetaUnit
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit kermetaUnit, IFile ifile) throws Exception {
		
		
		/////////// Add the framework directives to the given ModelingUnit for compiling
		KermetaUnit framework_directives_ku = IOPlugin.getDefault().getEditionKermetaUnitStore().get("platform:/plugin/org.kermeta.framework.compiler.directives/src/kermeta/framework_directives_for_compiler.kmt", null);
		
		kermetaUnit.addRequire(framework_directives_ku.getUri(), framework_directives_ku);
		
		kermetaUnit.getImportedKermetaUnits().add(framework_directives_ku);
		
		kermetaUnit.importKermetaUnit(framework_directives_ku, true, true);
		///////////
		
		Set<KermetaUnit> l = new HashSet<KermetaUnit>();
		l.add(kermetaUnit);
		l.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) );
		
		// Create the merged and typechecked Km
		String fileURI = "platform:/resource" + ifile.getFullPath().removeFileExtension().addFileExtension("km").toString();
				
		Merger merger = new Merger();
		try {
			merger.process(l, fileURI, true, true);
			ifile.refreshLocal(1, null);
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}	
	
	}
}
