/*$Id: KermetaUnitHost.java,v 1.3 2008-12-03 10:24:31 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kpm;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.jobs.ILock;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.interest.InterestFactory;
import org.kermeta.model.interest.InterestHost;

public class KermetaUnitHost {

	private InterestHost host = InterestFactory.eINSTANCE.createInterestHost();
	
	private static ILock lock = Job.getJobManager().newLock();
	
	private KermetaUnitHost() {}
	
	static private KermetaUnitHost instance = null;
	
	static public KermetaUnitHost getInstance() {
		if ( instance == null )
			instance = new KermetaUnitHost();
		return instance;
	}
		
	public void declareInterest(InterestedObject target, IFile file) {
		try {
	        lock.acquire();
	        // Access or modify data structure
	        if ( file != null )
				declareInterest(target, "platform:/resource" + file.getFullPath().toString());
	     } finally {
	        lock.release();
	     }
		
	}
	
	private void declareInterest(InterestedObject target, String id) {
		host.beConcernedAbout(id, target);
	}

	public void updateValue(IFile file, KermetaUnit newValue) throws IdNotFoundException {
		try {
	        lock.acquire();
	        // Access or modify data structure
	        if ( file != null )
			updateValue(newValue.getUri(), newValue);
		 } finally {
	        lock.release();
	     }
	}
	
	private void updateValue(String id, KermetaUnit newValue) throws IdNotFoundException {
		host.updateValue(id, newValue);
	}

	public void undeclareInterest(InterestedObject target, IFile file) {
		try {
	        lock.acquire();
	        if ( file != null )
			undeclareInterest(target, "platform:/resource" + file.getFullPath().toString());
		 } finally {
	        lock.release();
	     }
	}
	
	private void undeclareInterest(InterestedObject target, String id) {
		host.beUnconcernedAbout(id, target);
	}
	
}
