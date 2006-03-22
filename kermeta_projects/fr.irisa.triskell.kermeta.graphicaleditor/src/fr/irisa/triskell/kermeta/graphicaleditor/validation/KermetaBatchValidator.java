/* $Id: KermetaBatchValidator.java,v 1.1 2006-03-22 16:24:59 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : KermetaBatchValidator.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 15, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.EMFModelValidationDebugOptions;
import org.eclipse.emf.validation.internal.service.AbstractValidationContext;
import org.eclipse.emf.validation.internal.service.BatchValidator;
import org.eclipse.emf.validation.internal.service.ClientContextManager;
import org.eclipse.emf.validation.internal.service.GetBatchConstraintsOperation;
import org.eclipse.emf.validation.internal.service.IProviderOperationExecutor;
/*import org.eclipse.emf.validation.internal.service.TraversalStrategyManager;
import org.eclipse.emf.validation.internal.service.BatchValidator.DefaultRecursiveTraversalStrategy;*/
import org.eclipse.emf.validation.internal.util.Trace;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.ITraversalStrategy;

public class KermetaBatchValidator extends BatchValidator {

	private boolean includeLiveConstraints = false;
	private IProgressMonitor progressMonitor = null;
	
	/**
	 * Initializes me with the operation <code>executor</code> that I use to
	 * execute provider operations.
	 * 
	 * @param executor used by me to execute operations (must not be
	 *      <code>null</code>)
	 */
	public KermetaBatchValidator(IProviderOperationExecutor executor) {
		super(executor);
	}

	/* (non-Javadoc)
	 * Implements the inherited method.
	 */
	public boolean isIncludeLiveConstraints() {
		return includeLiveConstraints;
	}

	/* (non-Javadoc)
	 * Implements the inherited method.
	 */
	public void setIncludeLiveConstraints(boolean includeLiveConstraints) {
		this.includeLiveConstraints = includeLiveConstraints;
	}

	

	/* (non-Javadoc)
	 * Implements the inherited method.
	 */
	public IStatus validate(EObject eObject, IProgressMonitor monitor) {
		IStatus result;
		
		progressMonitor = monitor;
		
		result = validate(eObject);
		
		return result;
	}

	/* (non-Javadoc)
	 * Implements the inherited method.
	 */
	public IStatus validate(Collection objects, IProgressMonitor monitor) {
		IStatus result;
		
		progressMonitor = monitor;
		
		result = validate(objects);
		
		return result;
	}

	/* (non-Javadoc)
	 * Implements the inherited method.
	 */
	protected Collection doValidate(Collection objects, Set clientContexts) {
		List result = new java.util.ArrayList(64);  // anticipate large scale
		
		GetBatchConstraintsOperation operation =
			new GetBatchConstraintsOperation(!isIncludeLiveConstraints());
		//AbstractValidationContext ctx = operation.getContext();
		//ctx.setReportSuccesses(isReportSuccesses());
		
		//validate(getTraversalStrategy(), result, ctx, objects, operation, clientContexts);
		
		return result;
	}
	
	/**
	 * Helper method for validation of any number of objects, using the
	 * specified <code>traversal</code> strategy.
	 * 
	 * @param traversal the traversal strategy to employ
	 * @param evaluationResults the evaluation results that are being
	 *     accumulated recursively
	 * @param ctx context for evaluation
	 * @param clientContexts 
	 * @param eObjects a collection of {@link EObject}s to validate
	 * @param the operation to reuse for getting constraints
	 * @param (output) the set of client contexts to be updated with all of the
	 *         encountered contexts while performing validation.
	 */
	private void validate(
			ITraversalStrategy traversal,
			List evaluationResults,
			AbstractValidationContext ctx,
			Collection objects,
			GetBatchConstraintsOperation operation, 
			Set clientContexts) {
		
		IProgressMonitor monitor = progressMonitor;
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		
		traversal.startTraversal(objects, monitor);
		boolean firstElement = true;
		
		try {
			while (traversal.hasNext()) {
				if (monitor.isCanceled()) {
					break;
				}
		
				boolean recomputeClients = firstElement
					|| traversal.isClientContextChanged();
				
				final EObject next = traversal.next();

				if (recomputeClients) {
					Collection contexts = ClientContextManager.getInstance()
							.getClientContextsFor(next);
					//ctx.setClientContexts(contexts);
					clientContexts.addAll(contexts);
				}
				
				traversal.elementValidated(
					next,
					validate(
						ctx,
						next,
						operation,
						evaluationResults));
				
				firstElement = false;
			}
		} catch (OperationCanceledException e) {
			// a constraint has requested cancellation of the validation
			//    operation.  Honour that request and propagate the exception
			monitor.setCanceled(true);
			throw e;
		} finally {
			if (!monitor.isCanceled()) {
				monitor.done();
			}

			progressMonitor = null;
		}
	}

	/**
	 * Helper method for validation of a single object.
	 * 
	 * @param ctx the context within which to validate the <code>eObject</code>
	 * @param eObject the EMF object to validate
	 * @param the operation to reuse for getting constraints
	 * @param results list of {@link IStatus} results of constraint evaluations
	 * 
	 * @return a summary status of the <code>eObject</code>'s validation
	 */
	private IStatus validate(
			AbstractValidationContext ctx,
			EObject eObject,
			GetBatchConstraintsOperation operation,
			List results) {
		if (Trace.shouldTraceEntering(EMFModelValidationDebugOptions.PROVIDERS)) {
			Trace.entering(getClass(), "validate", //$NON-NLS-1$
					new Object[] {eObject});
		}

		//operation.setTarget(eObject);
		
		execute(operation);
		
		IStatus result = evaluateConstraints(ctx, results);

		if (Trace.shouldTraceExiting(EMFModelValidationDebugOptions.PROVIDERS)) {
			Trace.exiting(
				getClass(),
				"validate", //$NON-NLS-1$
				result);
		}
		
		return result;
	}

}
