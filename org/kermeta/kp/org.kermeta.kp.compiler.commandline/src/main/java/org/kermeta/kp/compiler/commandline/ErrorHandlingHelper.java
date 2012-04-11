package org.kermeta.kp.compiler.commandline;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.diagnostic.Constraint;
import org.kermeta.diagnostic.ConstraintDiagnostic;
import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.diagnostic.InvariantProxy;
import org.kermeta.diagnostic.ModelReference;
import org.kermeta.kp.compiler.commandline.callable.CallableLogProblem;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Tag;
import org.kermeta.utils.helpers.StringHelper;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.api.reference.FileReference;
import org.kermeta.utils.systemservices.api.reference.TextReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage;

public class ErrorHandlingHelper {
	

	public static String TRACEABILITY_TEXT_REFERENCE = "traceability_text_reference";
	
	MessagingSystem logger;
	String logMessageGroup;
	String mainProgressGroup;
	ExecutorService threadExector;
	
	public ErrorHandlingHelper(MessagingSystem logger, String logMessageGroup, String mainProgressGroup, ExecutorService threadExector){
		this.logger = logger;
		this.logMessageGroup = logMessageGroup;
		this.mainProgressGroup = mainProgressGroup;
		this.threadExector = threadExector;
	}

	
	protected void processErrors(ErrorProneResult<ModelingUnit> eprMu, URL kpFile) {
		// TODO Retrieve faulty objects text reference and logProblem

		ArrayList<Future<Boolean>> logProblemFutures = new ArrayList<Future<Boolean>>();
		
		for (ResultProblemMessage prob : eprMu.getProblems()) {
			logger.log(MessagingSystem.Kind.DevERROR, prob.getMessage(), logMessageGroup);

			// retrieve faulty object
			// KermetaModelElement kme = (Kermeprob.getCauseObject();
			logger.log(Kind.DevDEBUG ,"faultyObject is : " + prob.getCauseObject(),logMessageGroup);

			if (prob.getCauseObject() != null) {
				
				org.kermeta.utils.systemservices.api.reference.ModelReference mref = (org.kermeta.utils.systemservices.api.reference.ModelReference) prob.getCauseObject();

				if (mref.getModelRef() != null) {
					logger.log(Kind.DevDEBUG ,mref.getModelRef().toString(),logMessageGroup);

					// The object is a KermetaModelElement
					try {
						KermetaModelElement kme = (KermetaModelElement) mref.getModelRef();
	
						logger.log(Kind.DevDEBUG ,"The error involves " + kme.toString(), logMessageGroup);
						//System.err.println("The error involves " + kme.toString());
	
						markProblemForElement(kme, prob.getMessage(), false,  kpFile, logProblemFutures);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		// wait for all markers to be placed by eclipse // maybe we don't care until the end of the compilation ? (except for intermangling messages ?)
		for(Future<Boolean> future : logProblemFutures){
			try {
				future.get();
			} catch (InterruptedException e) {
				logger.error("Marking interrupted", logMessageGroup, e);
			} catch (ExecutionException e) {
				logger.error("Marking failed "+ e, logMessageGroup, e);
			}
		}
	}
	
	
	protected void processCheckingDiagnostics(DiagnosticModel diags, URL kpFile) {

		if (diags == null) {
			return;
		}
		
		// System.err.println("processing diagnostics : " +
		// diags.getDiagnostics().size());
		int nbDiagnostics = diags.getDiagnostics().size();
		logger.initProgress(mainProgressGroup+".processCheckingDiagnostics", "Transforming "+ nbDiagnostics +" diagnostic into markers...", logMessageGroup, nbDiagnostics);
		// Display check results
		if (nbDiagnostics > 0) {
			logger.log(MessagingSystem.Kind.UserINFO, "There are " + diags.getDiagnostics().size() + " failed constraints", logMessageGroup);
		}

		ArrayList<Future<Boolean>> logProblemFutures = new ArrayList<Future<Boolean>>();
		
		for (ConstraintDiagnostic diag : diags.getDiagnostics()) {

			String message = "";
			Constraint failedConstraint = diag.getFailedConstraint();
			if (failedConstraint instanceof InvariantProxy) {
				message = message + "Invariant " + ((InvariantProxy) failedConstraint).getInvariantName() + " on object " + ((ModelReference) diag.getAppliesTo()).getReferencedObject().toString();
			}
			if (diag.isIsWarning()) {
				logger.log(MessagingSystem.Kind.DevWARNING, message, logMessageGroup);
			} else {
				logger.log(MessagingSystem.Kind.DevERROR, message, logMessageGroup);
			}

			// retrieve the referenced EObject tag sourceLocation
			EObject myObject = ((ModelReference) diag.getAppliesTo()).getReferencedObject();
			KermetaModelElement kme = (KermetaModelElement) myObject;

			InvariantProxy proxy = (InvariantProxy) failedConstraint;
			String errorMsg = "Kermeta invariant " + proxy.getInvariantName() + " failed : ";
			errorMsg += StringHelper.trimDocumentation(proxy.getMessage());

			markProblemForElement(kme, errorMsg, diag.isIsWarning(),  kpFile, logProblemFutures);

		}
		// wait for all markers to be placed by eclipse // maybe we don't care until the end of the compilation ? (except for intermangling messages ?)
		for(Future<Boolean> future : logProblemFutures){
			try {
				future.get();
			} catch (InterruptedException e) {
				logger.error("Marking interrupted", logMessageGroup, e);
			} catch (ExecutionException e) {
				logger.error("Marking failed "+ e, logMessageGroup, e);
			}
		}
		logger.doneProgress(mainProgressGroup+".processCheckingDiagnostics", "Transformed "+nbDiagnostics+" diagnostic into markers", logMessageGroup);
	}

	protected void markProblemForElement( KermetaModelElement kme, 
								String errorMsg,
								boolean isWarning, 
								URL kpFile, 
								ArrayList<Future<Boolean>> logProblemFutures){
		// Check if there is a sourceLocation tag
		Boolean tagFound = false;

		for (Tag t : kme.getKOwnedTags()) {

			// System.err.println("Tag found. Name : " + t.getName() +
			// ", value : (" + t.getValue() + ")");

			logger.log(MessagingSystem.Kind.DevDEBUG, "Tag : " + t.getName(), logMessageGroup);
			if (t.getName().equals(TRACEABILITY_TEXT_REFERENCE)) {
				tagFound = true;
				logger.log(MessagingSystem.Kind.DevDEBUG, "   -> value :(" + t.getValue() + ")   ", logMessageGroup);
				TextReference ref = createTextReference(t);
				if (ref != null) {
					if (isWarning) {
						logProblemFutures.add(threadExector.submit(new CallableLogProblem(logger, MessagingSystem.Kind.UserWARNING, errorMsg, logMessageGroup, ref)));
					} else {
						logProblemFutures.add(threadExector.submit(new CallableLogProblem(logger, MessagingSystem.Kind.UserERROR, errorMsg, logMessageGroup, ref)));
					}
				}
			}
		}

		if (!tagFound) {
			// Try to retrieve the model element's container
			Tag t = searchForNearestTaggedContainingKME(kme);

			if (t == null) {
				logger.log(MessagingSystem.Kind.DevERROR, "Impossible to retrieve a container with text traceability", logMessageGroup);
				// In this case, place the error on the kp file
				FileReference ref = new FileReference(kpFile);
				if (isWarning) {
					logProblemFutures.add(threadExector.submit(new CallableLogProblem(logger, MessagingSystem.Kind.UserWARNING, errorMsg, logMessageGroup, ref)));
					//logger.logProblem(MessagingSystem.Kind.UserWARNING, errorMsg, LOG_MESSAGE_GROUP, ref);
				} else {
					logProblemFutures.add(threadExector.submit(new CallableLogProblem(logger, MessagingSystem.Kind.UserERROR, errorMsg, logMessageGroup, ref)));
				}
				
			} else {
				TextReference ref = createTextReference(t);
				if (ref != null) {
					if (isWarning) {
						logProblemFutures.add(threadExector.submit(new CallableLogProblem(logger, MessagingSystem.Kind.UserWARNING, errorMsg, logMessageGroup, ref)));
						//logger.logProblem(MessagingSystem.Kind.UserWARNING, errorMsg, LOG_MESSAGE_GROUP, ref);
					} else {
						//logger.logProblem(MessagingSystem.Kind.UserERROR, errorMsg, LOG_MESSAGE_GROUP, ref);
						logProblemFutures.add(threadExector.submit(new CallableLogProblem(logger, MessagingSystem.Kind.UserERROR, errorMsg, logMessageGroup, ref)));
					}
				}

			}

		}
	}
	
	protected Tag searchForNearestTaggedContainingKME(KermetaModelElement kme) {

		KermetaModelElement currentElement = null;
		KermetaModelElement container = (KermetaModelElement) kme.eContainer();

		while (container != null) {

			for (Tag t : container.getKOwnedTags()) {
				if (t.getName().equals(TRACEABILITY_TEXT_REFERENCE)) {
					return t;
				}
			}
			// Tag hasn't been found, keep on searching higher in the model

			currentElement = container;
			container = (KermetaModelElement) currentElement.eContainer();
		}

		return null;
	}
	
	private TextReference createTextReference(Tag tag) {

		String value = tag.getValue();

		// System.err.println(tag.getValue());

		String[] values = value.split(";");

		// logger.log(MessagingSystem.Kind.UserINFO, "Source File (" + values[0]
		// + ")", "");
		// logger.log(MessagingSystem.Kind.UserINFO, "beginOffset (" + values[1]
		// + ")", "");
		// logger.log(MessagingSystem.Kind.UserINFO, "endOffset   (" + values[2]
		// + ")", "");

		TextReference ref = null;

		try {
			ref = new TextReference(new URL(values[0]), new Integer(values[1]), new Integer(values[2]));
			// ref.setBeginLine(new Integer(values[1]));
			// ref.setBeginOffset(new Integer(values[2]));

			// new TextReference()

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref;
	}
	
	
}
