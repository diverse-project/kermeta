/* $Id: KermetaValidatorAdapter.java,v 1.7 2006-06-02 09:05:20 zdrey Exp $
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

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.EMFModelValidationPlugin;
import org.eclipse.emf.validation.internal.EMFModelValidationStatusCodes;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.views.markers.internal.ProblemView;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.graphicaleditor.StructurePlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.EditorReconcilingStrategy;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/** 
 * We extend our initial class to clearly distinguish what is validated
 * by default (i.e by the EcoreValidatorAdapter) and what is validated for specific
 * Kermeta metamodel.
 *
 */
public class KermetaValidatorAdapter extends EcoreValidatorAdapter {

	protected KermetaConstraintChecker constraintChecker;
	protected KermetaUnit kermetaUnit;
	protected KermetaBatchValidator kBatchValidator;
	
	public KermetaValidatorAdapter() {
		super();
		// Get the epackage URI to create a kermeta unit
		String u = getEPackage().eResource().getURI().toString();
		//kBatchValidator = new KermetaBatchValidator()
//		System.err.println("URI : " + u + getEPackage());
	}
	
	public KermetaConstraintChecker getKermetaConstraintChecker(EObject eObject) {
		// FIXME : this is not the correct way to get the URI of the resource hosting
		// the model to check.
		String u = eObject.eResource().getURI().toString();
		if (kermetaUnit==null)
		{
			kermetaUnit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(u);
			constraintChecker = new KermetaConstraintChecker(kermetaUnit);
			System.err.println("URI :  " + u + constraintChecker);
		}
		return constraintChecker;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.validation.EcoreValidatorAdapter#validate(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map context) {
	//	boolean result = super.validate(eClass, eObject, diagnostics, context);
		
		// Content of EcoreValidatorAdapter.validate
		IStatus status = Status.OK_STATUS;
		
		if (diagnostics != null) {
			if (!hasProcessed(eObject, context)) {
				/*status = batchValidator.validate( eObject, new NullProgressMonitor());*/
				
				// Create a simple status
				Boolean result = (Boolean)getKermetaConstraintChecker(eObject).accept(eObject);
				int status_int = -1;
				List problems = getKermetaConstraintChecker(eObject).getProblems();
				// Reset the problems view
				IFile inputModelFile = KermetaPlugin.getIFileFromString(kermetaUnit.getUri());
				
				// Clear the problem view, and recreate it
				// System.err.println("-> inputModelFile : " + inputModelFile);
				EditorReconcilingStrategy.parse(eObject.eResource());
				/*
				EditorReconcilingStrategy.clearMarkers(inputModelFile);
				EditorReconcilingStrategy.createMarkers(inputModelFile, kermetaUnit);*/
				
				// Another method..
/*				for (Object problem : problems) {	
					KMUnitMessage msg = (KMUnitMessage)problem;
					status = createStatus(IStatus.ERROR, msg.getMessage(), EMFValidationContextAdapter.ERROR);
					super.appendDiagnostics(status, diagnostics);
				}*/
				// see org.eclipse.emf.validation.examples.adapter
				//new PackageConstraints().validate(this.)
				super.processed(eObject, context, status);
			}
		}
        return status.isOK();
	}
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.validation.EcoreValidatorAdapter#validate(org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map context) {
		return super.validate(eObject, diagnostics, context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EObjectValidator#validate(org.eclipse.emf.ecore.EDataType, java.lang.Object, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	public boolean validate(EDataType arg0, Object arg1, DiagnosticChain arg2, Map arg3) {
		return super.validate(arg0, arg1, arg2, arg3);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EObjectValidator#validate(int, java.lang.Object, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	@Override
	protected boolean validate(int arg0, Object arg1, DiagnosticChain arg2, Map arg3) {
		return super.validate(arg0, arg1, arg2, arg3);
	}
	
	/** Stolen AbstractValidator */
	

	/** A helper to create a fail or a success statuc*/
	private IStatus createStatus(int status) {	
		return 
			new org.eclipse.core.runtime.Status(
			//IStatus.OK,
			status,
			StructurePlugin.getId(),
			EMFModelValidationStatusCodes.NO_CONSTRAINTS_EVALUATED,
			EMFModelValidationPlugin.getPlugin().getString(
					EMFModelValidationStatusCodes.NO_CONSTRAINTS_EVALUATED_KEY),
				null);
	}
	

	/**
	 * Creates an {@link IStatus} from a list of <code>results</code>.
	 * The status will be a {@link IStatus#isMultiStatus multi-status} storing
	 * (and aggregating) a list of individual {@link IStatus}es if the
	 * <code>results</code> has more than one element.
	 * 
	 * @param results the constraint evaluation results
	 * @return a multi-status if more than one result; a plain {@link IStatus},
	 *     otherwise
	 */
	private IStatus createStatus(Collection<IStatus> results) {	
		if (results.isEmpty()) {
			return new org.eclipse.core.runtime.Status(
				IStatus.OK,
				EMFModelValidationPlugin.getPluginId(),
				EMFModelValidationStatusCodes.NO_CONSTRAINTS_EVALUATED,
				EMFModelValidationPlugin.getPlugin().getString(
						EMFModelValidationStatusCodes.NO_CONSTRAINTS_EVALUATED_KEY),
				null);
		} else if (results.size() == 1) {
			return (IStatus)results.iterator().next();
		} else {
			return new AggregateStatus(results);
		}
	}
	
	/**
	 * code : EMFModelValidationStatusCodes.SOME_CONSTRAINTS_ERROR,
	 * @param severity
	 * @param message
	 * @param code
	 * @return
	 */
	private IStatus createStatus(int severity, String message, int code) {
		return new org.eclipse.core.runtime.Status(
				severity,
				StructurePlugin.getId(),
				code,
				message,
				null);
	}

	 private static ProblemView getProblemView() {
		    return (ProblemView) StructurePlugin.getDefault().getWorkbench()
							.getActiveWorkbenchWindow().getActivePage()
							.findView(IPageLayout.ID_PROBLEM_VIEW);
		  }

	
	/**
	 * Create a list of Status
	 *
	 */
	public void createStatusFromKermetaConstraintChecker()
	{
	}
	
	/**
	 * A custom status type that aggregates multiple {@link IStatus}es and whose
	 * severity is the worst severity among them.
	 * 
	 * @author Christian W. Damus (cdamus)
	 */
	private static class AggregateStatus implements IStatus {
		private final Collection children;
		private final int severity;
		private final int code;
		private final String message;
		
		/**
		 * Initializes me as an aggregate of the specified
		 * <code>statuses</code>.  They will become my
		 * {@link #getChildren() children}.
		 * 
		 * @param statuses the statuses that I aggregate
		 */
		AggregateStatus(Collection<IStatus> statuses) {
			// aggregate the results into a multi-status

			int maxSeverity = getMaximalSeverity(statuses);
			int newCode;
			String msgKey;
			
			switch (maxSeverity) {
			case IStatus.ERROR:
				newCode = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_ERROR;
				msgKey = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_ERROR_KEY;
				break;
			case IStatus.WARNING:
				newCode = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_WARNING;
				msgKey = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_WARNING_KEY;
				break;
			case IStatus.INFO:
				newCode = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_INFO;
				msgKey = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_INFO_KEY;
				break;
			case IStatus.OK:
				newCode = EMFModelValidationStatusCodes.ALL_CONSTRAINTS_PASSED;
				msgKey = EMFModelValidationStatusCodes.ALL_CONSTRAINTS_PASSED_KEY;
				break;
			default:
				newCode = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_FAILED;
				msgKey = EMFModelValidationStatusCodes.SOME_CONSTRAINTS_FAILED_KEY;
				break;
			}
			
			this.children = statuses;
			this.severity = maxSeverity;
			this.code = newCode;
			this.message = EMFModelValidationPlugin.getPlugin().getString(msgKey);
		}
		
		// implements the interface method
		public IStatus[] getChildren() {
			return (IStatus[])children.toArray(new IStatus[children.size()]);
			
			
		}
		

		// implements the interface method
		public int getSeverity() {
			return severity;
		}

		// implements the interface method
		public int getCode() {
			return code;
		}

		// implements the interface method
		public String getMessage() {
			return message;
		}

		// implements the interface method
		public Throwable getException() {
			return null;
		}

		// implements the interface method
		public String getPlugin() {
			return EMFModelValidationPlugin.getPluginId();
		}

		// implements the interface method
		public boolean isMultiStatus() {
			return true;
		}

		// implements the interface method
		public boolean isOK() {
			return severity == IStatus.OK;
		}

		// implements the interface method
		public boolean matches(int severityMask) {
			return (getSeverity() & severityMask) != 0;
		}
	
		/**
		 * Helper method to get the maximal severity from a collection of statuses.
		 * 
		 * @param statuses a collection of {@link IStatus} objects
		 * @return the maximal severity amongst the <code>statuses</code>
		 */
		private int getMaximalSeverity(Collection statuses) {
			int result = IStatus.OK;
		
			for (Iterator iter = statuses.iterator();
					(result < IStatus.ERROR) && iter.hasNext();) {
			
				IStatus next = (IStatus)iter.next();
			
				if (next.getSeverity() > result) {
					result = next.getSeverity();
				}
			}
		
			return result;
		}
	
	}

}
