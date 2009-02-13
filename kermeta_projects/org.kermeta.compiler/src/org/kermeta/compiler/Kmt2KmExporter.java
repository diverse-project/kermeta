/* $Id: Kmt2KmExporter.java,v 1.1 2009-02-13 11:01:59 cfaucher Exp $
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

import org.apache.commons.logging.Log;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class Kmt2KmExporter {

	protected IFile kermetafile;

	final static public Log internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	/**
	 * Constructor for CompileKermetaAction.
	 */
	public Kmt2KmExporter(IFile kermetaFile) {
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
