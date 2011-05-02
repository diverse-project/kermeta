package org.kermeta.language.builder.eclipse.internal;

import java.net.MalformedURLException;

import org.eclipse.core.resources.IResource;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.builder.eclipse.internal.executionner.KermetaExecutionner;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.eclipse.ResourceHelpers;

public class KermetaParser extends KermetaExecutionner<String> {

	boolean inModification;
	
	public KermetaParser(boolean inModification) {
		this.inModification = inModification;
	}
	
	@Override
	public void execute(IResource concernedResource, String content) {
		KermetaCompiler theCompiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem());
		ModelingUnit freshModelingUnit = null;
		if (content.equals("")) {
			try {
				freshModelingUnit = theCompiler.parse(ResourceHelpers.IResourceToURL(concernedResource));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else {
			try {
				freshModelingUnit = theCompiler.parse(ResourceHelpers.IResourceToURL(concernedResource),content);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
					
		if (freshModelingUnit != null) {
			saveParsingResult(freshModelingUnit, concernedResource.getFullPath().toOSString(),inModification);
		}
	}
	
	public void saveParsingResult(ModelingUnit result, String identifier, boolean inModification) {
		ResourceIdentifier theCurrentResourceIdentifier = ((KermetaBuilder)KermetaBuilder.getDefault()).getResourceIdentifier(identifier);
		
		if (theCurrentResourceIdentifier==null) {
			theCurrentResourceIdentifier = new ResourceIdentifier(identifier, inModification);
		}
		((KermetaBuilder)KermetaBuilder.getDefault()).currentModelingUnits.put(theCurrentResourceIdentifier, result);
	}
}
