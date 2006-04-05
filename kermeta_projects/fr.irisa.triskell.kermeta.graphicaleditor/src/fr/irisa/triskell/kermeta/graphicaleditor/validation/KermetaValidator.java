/* $Id: KermetaValidator.java,v 1.3 2006-04-05 18:58:54 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : KermetaValidator.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 10, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IValidator;

/**
 * To understand this class, user will browse appropriate documentation here :
 *      http://help.eclipse.org/help31/index.jsp?topic=/org.eclipse.gmf.doc/tutorials/msl/validationAdapterTutorial.html
 * @author zdrey
 *
 */
public class KermetaValidator implements IValidator {

	public EvaluationMode getEvaluationMode() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isReportSuccesses() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setReportSuccesses(boolean reportSuccesses) {
		// TODO Auto-generated method stub
		System.out.println("Report Successes (KermetaValidator)");
	}

	public void putClientData(String key, Object data) {
		// TODO Auto-generated method stub
		
	}

	public Object getClientData(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public IStatus validate(Object object) {
		System.out.println("Validate, in KermetaValidator class");
		// TODO Auto-generated method stub
		return null;
	}

	public IStatus validate(Collection objects) {
		System.out.println("Validate a collections, in KermetaValidator class");
		// TODO Auto-generated method stub
		return null;
	}

	

}
