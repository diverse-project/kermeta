/* $Id: KermetaValidator.java,v 1.2 2006-03-22 16:24:59 zdrey Exp $
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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

/**
 * To understand this class, user will browse appropriate documentation here :
 *      http://help.eclipse.org/help31/index.jsp?topic=/org.eclipse.gmf.doc/tutorials/msl/validationAdapterTutorial.html
 * @author zdrey
 *
 */
public class KermetaValidator implements EValidator {

	public boolean validate(EObject arg0, DiagnosticChain arg1, Map arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validate(EClass arg0, EObject arg1, DiagnosticChain arg2,
			Map arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validate(EDataType arg0, Object arg1, DiagnosticChain arg2,
			Map arg3) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
