/* $Id: EcoreValidatorAdapter.java,v 1.1 2006-03-10 16:07:21 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : KermetaValidatorAdapter.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 10, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 * Documentation:
 *    http://help.eclipse.org/help31/index.jsp?topic=/org.eclipse.gmf.doc/tutorials/msl/validationAdapterTutorial.html
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

/**
 * This class is called through the extension point (in plugin.xml) org.eclipse.ui.startup,
 * by the associated class KermetaValidatorStartup; It checks the common ecore metamodel constraints,
 * plus our customized constraints (@see fr.irisa.triskell.kermeta.graphicaleditor.utils), whic
 * 
 * To understand this class, user will find appropriate documentation here :
 *      http://help.eclipse.org/help31/index.jsp?topic=/org.eclipse.gmf.doc/tutorials/msl/validationAdapterTutorial.html
 * @author zdrey
 *
 */
public class EcoreValidatorAdapter 
    extends EObjectValidator {

	/** Batch-validation is user-triggered (Eclipse doc) */
    private final IBatchValidator batchValidator;
    
    public EcoreValidatorAdapter() {
        super();
        System.err.println("Kermeta Validator Adapter : la tata de ma tata");
        batchValidator =
            (IBatchValidator) ModelValidationService.getInstance().newValidator(
                EvaluationMode.BATCH);
        batchValidator.setIncludeLiveConstraints(true);
        batchValidator.setReportSuccesses(false);
    }

    public boolean validate(EObject eObject, DiagnosticChain diagnostics,
            Map context) {
        return validate(eObject.eClass(), eObject, diagnostics, context);
    }
    
    public boolean validate(EClass eClass, EObject eObject,
            DiagnosticChain diagnostics, Map context) {
        super.validate(eClass, eObject, diagnostics, context);
        
        IStatus status = Status.OK_STATUS;
        
        if (diagnostics != null) {
            if (!hasProcessed(eObject, context)) {
                status = batchValidator.validate(
                    eObject,
                    new NullProgressMonitor());
                
                processed(eObject, context, status);
                System.err.println("J'ajout un diagnos ting");
                appendDiagnostics(status, diagnostics);
            }
        }
        
        return status.isOK();
    }
    
    private void processed(EObject eObject, Map context, IStatus status) {
        if (context != null) {
            context.put(eObject, status);
        }
    }
    
    private boolean hasProcessed(EObject eObject, Map context) {
        boolean result = false;
        
        if (context != null) {
            while (eObject != null) {
                if (context.containsKey(eObject)) {
                    result = true;
                    eObject = null;
                } else {
                    eObject = eObject.eContainer();
                }
            }
        }
        
        return result;
    }
    
    private void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
        if (status.isMultiStatus()) {
            IStatus[] children = status.getChildren();
            
            for (int i = 0; i < children.length; i++) {
                appendDiagnostics(children[i], diagnostics);
            }
        } else if (status instanceof IConstraintStatus) {
            diagnostics.add(new BasicDiagnostic(
                status.getSeverity(),
                status.getPlugin(),
                status.getCode(),
                status.getMessage(),
                ((IConstraintStatus) status).getResultLocus().toArray()));
        }
    }
}
