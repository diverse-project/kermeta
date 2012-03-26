package org.kermeta.kp.compiler.commandline;

import java.net.MalformedURLException;
import java.util.List;

import org.kermeta.kp.KermetaProject;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.FileReference;

public class KpChecker {

	KermetaCompiler compiler;
	
	
	public KpChecker(KermetaCompiler compiler) {
		super();
		this.compiler = compiler;
	}


	/*
	 * Must be run with the checker Factory 
	 */
	public void checkDefaultMain(String kpFileURL, KermetaProject kp, ModelingUnit resolvedMU) throws MalformedURLException{
		if(kp.getDefaultMainClass()== null) return;
		if (resolvedMU instanceof org.kermeta.language.language.resolver.org.kermeta.language.structure.RichModelingUnit){
			org.kermeta.language.language.resolver.org.kermeta.language.structure.RichModelingUnit mua 
				= (org.kermeta.language.language.resolver.org.kermeta.language.structure.RichModelingUnit) resolvedMU;
			TypeDefinition td = mua.getTypeDefinitionByQualifiedName(kp.getDefaultMainClass());
			if(td == null){
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Default main Class not found", compiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
				compiler.errorMessage = "Invalid kp file. Default main class not found";
				compiler.hasFailed = true;
			}
			else{
				if(td instanceof org.kermeta.language.structure.ClassDefinition){
					org.kermeta.language.structure.ClassDefinition cd = (org.kermeta.language.structure.ClassDefinition)td;
					if(cd instanceof org.kermeta.language.language.resolver.org.kermeta.language.structure.RichClassDefinition){
						org.kermeta.language.language.resolver.org.kermeta.language.structure.RichClassDefinition cda 
							=(org.kermeta.language.language.resolver.org.kermeta.language.structure.RichClassDefinition)cd;
						List<Object> lo = cda.getOperation(kp.getDefaultMainOperation());
						if(lo.size() > 1){
							compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "More than one operation may correspond to the default main operation", compiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
							compiler.errorMessage = "Invalid kp file. More than one operation may correspond to the default main operation";
							compiler.hasFailed = true;
						}
						else{
							if(lo.size() == 0){
								compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Default main operation not found", compiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
								compiler.errorMessage = "Invalid kp file. Default main operation not found";
								compiler.hasFailed = true;
							}
							else{
								
									org.kermeta.language.structure.Operation op = (org.kermeta.language.structure.Operation)lo.get(0);
									for(org.kermeta.language.structure.Parameter param :  op.getOwnedParameter()){
										org.kermeta.language.structure.Type t = param.getType();
										if(t instanceof org.kermeta.language.structure.Class){
											org.kermeta.language.structure.Class c = (org.kermeta.language.structure.Class)t;
											if (!c.getTypeDefinition().getName().equals("String")){
												compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Default main operation not usable due to invalid parameter type", compiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
												compiler.errorMessage = "Invalid kp file. Default main operation not usable due to invalid parameter type";
												compiler.hasFailed = true;
											}
										}
										else{
											compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Default main operation not usable due to invalid parameter type", compiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
											compiler.errorMessage = "Invalid kp file. Default main operation not usable due to invalid parameter type";
											compiler.hasFailed = true;
										}
									}
								}
							}
						}
					}
				
				else{
					compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Default main Class isn't a ClassDefinition", compiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpFileURL)));
					compiler.errorMessage = "Invalid kp file. Default main Class  isn't a ClassDefinition";
					compiler.hasFailed = true;
				}
			}
			//org.kermeta.language.language.resolver.org.kermeta.language.structure.TypeDefinitionAspect
			
		}
		else{
			compiler.logger.log(MessagingSystem.Kind.DevWARNING,"cannot check defaultMain because "+resolvedMU.toString() + " is not instance of  org.kermeta.language.language.checker.org.kermeta.language.structure.RichModelingUnit", compiler.LOG_MESSAGE_GROUP);
		}
		
	}
}
