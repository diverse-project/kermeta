package org.kermeta.language.builder.eclipse.internal;

import java.net.MalformedURLException;

import org.eclipse.core.resources.IResource;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.builder.eclipse.internal.executionner.KermetaExecutionner;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.eclipse.ResourceHelpers;

public class KermetaParser extends KermetaExecutionner<IResource,String> {
	
	@Override
	public void execute(IResource concernedResource, String content) {
		KermetaCompiler theCompiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(), true);
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
			KermetaBuilder kermetaBuilder = KermetaBuilder.getDefault();
			kermetaBuilder.kpBuilders.get(kermetaBuilder.findKPidentifierFromKMT(concernedResource)).kpFiles.get(kermetaBuilder.generateIdentifier(concernedResource)).modelingUnit = freshModelingUnit;
			kermetaBuilder.compileFromKP(kermetaBuilder.findKPidentifierFromKMT(concernedResource));
		}
	}
}
