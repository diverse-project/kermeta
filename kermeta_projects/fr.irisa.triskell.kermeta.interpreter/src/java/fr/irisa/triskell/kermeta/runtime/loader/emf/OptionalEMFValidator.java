/* $Id: OptionalEMFValidator.java,v 1.4 2008-04-28 11:50:56 ftanguy Exp $
 * Project   : Kermeta 
 * File      : OptionalEMFValidator.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 1 d�c. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;

/**
 * this class is used to make sure we cannot have NoClassDefFoundError when trying to validate
 * even if the validation plugin isn't installed or deployed
 */
public class OptionalEMFValidator {
	
	public Logger internalLog;
	protected RuntimeMemory runtimeMemory;
	
	public OptionalEMFValidator(Logger logger, RuntimeMemory rMemory){
		internalLog = logger;
		runtimeMemory = rMemory;
	}
	/**
	 * use EMF validation framework, 
	 */
	public void validateWithEMF(Resource res) {
		try{
			IBatchValidator validator = (IBatchValidator)ModelValidationService.getInstance()
				.newValidator(EvaluationMode.BATCH);
			validator.setIncludeLiveConstraints(true);
	
			for(Object obj : res.getContents()){
				EObject eobj = (EObject) obj;
				try{
					IStatus status = validator.validate(eobj);
					internalLog.debug("Validating EObject with EMF validator");
					// do something if this is not valid ...
					if(!status.isOK()){
						throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ResourceSaveException",
				    			"EMF validation failed : " + status.getMessage(),
				    			runtimeMemory.getInterpreter().getBasicInterpreter(),
				    			runtimeMemory,
				    			null);
					}
				}
				catch(java.lang.ExceptionInInitializerError e){
					// didn't succeed to validate maybe we are running outside of eclipse and the service is not correctly activated
					internalLog.warn("Didn't succeed to validate EObject with EMF validator, maybe you are running outside of eclipse ...",e);
				}
				
			}
		}
		catch(NoClassDefFoundError e){
			// didn't succeed to validate maybe we are running outside of eclipse and the service is not correctly activated
			internalLog.warn("Didn't succeed to validate EObject with EMF validator, maybe you are running outside of eclipse ...",e);
		}
	}
}
