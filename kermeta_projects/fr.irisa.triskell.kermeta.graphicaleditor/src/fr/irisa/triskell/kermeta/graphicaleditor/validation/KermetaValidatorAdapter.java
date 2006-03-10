/* $Id: KermetaValidatorAdapter.java,v 1.1 2006-03-10 16:07:21 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : ExtendedKermetaValidatorAdapter.java
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

/** 
 * We extend our initial class to clearly distinguish what is validated
 * by default (i.e by the EcoreValidatorAdapter) and what is validated
 * @author zdrey
 *
 */
public class KermetaValidatorAdapter extends EcoreValidatorAdapter {

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.validation.EcoreValidatorAdapter#validate(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map context) {
		// TODO Auto-generated method stub
		return super.validate(eClass, eObject, diagnostics, context);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.validation.EcoreValidatorAdapter#validate(org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map context) {
		// TODO Auto-generated method stub
		return super.validate(eObject, diagnostics, context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EObjectValidator#validate(org.eclipse.emf.ecore.EDataType, java.lang.Object, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	public boolean validate(EDataType arg0, Object arg1, DiagnosticChain arg2, Map arg3) {
		// TODO Auto-generated method stub
		return super.validate(arg0, arg1, arg2, arg3);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EObjectValidator#validate(int, java.lang.Object, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	protected boolean validate(int arg0, Object arg1, DiagnosticChain arg2, Map arg3) {
		// TODO Auto-generated method stub
		return super.validate(arg0, arg1, arg2, arg3);
	}
	

}
