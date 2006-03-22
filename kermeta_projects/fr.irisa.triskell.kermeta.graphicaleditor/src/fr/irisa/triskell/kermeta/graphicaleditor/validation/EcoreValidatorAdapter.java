/* $Id: EcoreValidatorAdapter.java,v 1.2 2006-03-22 16:24:59 zdrey Exp $
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
        //ValidationDelegateClientSelector.running = true;
        System.err.println("Kermeta Validator Adapter");
        batchValidator =
            (IBatchValidator) ModelValidationService.getInstance().newValidator(
                EvaluationMode.BATCH);
        batchValidator.setIncludeLiveConstraints(true);
        batchValidator.setReportSuccesses(false);
        
        //ValidationDelegateClientSelector.running = false;
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
                
                System.err.println("J'ajoute un diagnostic : " + status + "- " + eObject.eClass().getEPackage().getNsURI() );
                System.err.println("Diag: " + diagnostics.toString());
               /* if (eObject instanceof Package)
                {}//	QueryFactory.eINSTANCE.createQuery("Package.name!=''", eObject.eClass() );
                else
                	System.err.println("Crub");*/
                for (Object c : context.keySet())
                {
                	System.err.println(c);	
                }
                
                appendDiagnostics(status, diagnostics);
                System.out.println("Voilu");
            }
        }
        
        return status.isOK();
    }
    
    /**
     * "post-processing method" that adds the processed <code>{ eObject :  statuc }</code> 
     * in the context dictionary
     */
    protected void processed(EObject eObject, Map context, IStatus status) {
        if (context != null) {
            context.put(eObject, status);
        }
    }
    
    /**
     * If the given <code>eObject</code> was already processed, so, it means
     * that it is stored in the context dictionary, then return true. Otherwise, 
     * return false.
     * @param eObject
     * @param context
     * @return
     */
    protected boolean hasProcessed(EObject eObject, Map context) {
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
    
    /**
     * Create a new diagnostic from the given <code>status</code> and append it in the
     * list of <code>diagnostics</code>
     */
    protected void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
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
