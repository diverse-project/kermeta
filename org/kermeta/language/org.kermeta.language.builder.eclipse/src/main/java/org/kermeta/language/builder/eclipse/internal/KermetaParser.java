package org.kermeta.language.builder.eclipse.internal;

import java.net.MalformedURLException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.builder.eclipse.internal.executionner.KermetaExecutionner;
import org.kermeta.language.builder.eclipse.preferences.PreferenceConstants;
import org.kermeta.language.builder.eclipse.preferences.PreferenceToBuildAction;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;
import org.kermeta.utils.helpers.eclipse.ResourceHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class KermetaParser extends KermetaExecutionner<IResource,String> {
	
	@Override
	public void execute(IResource concernedResource, String content, IProgressMonitor monitor) {
		KermetaCompiler theCompiler = new KermetaCompiler(false, Activator.getDefault().getMessaggingSystem(), new LocalFileConverterForEclipse(), true);
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
		if (freshModelingUnit != null && PreferenceToBuildAction.musGenerateKM(Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_KMT_EDITOR_ONKEYSTRIKE_STRING))) {
			KermetaBuilder kermetaBuilder = KermetaBuilder.getDefault();
			if (kermetaBuilder.kpBuilders.get(kermetaBuilder.findKPidentifierFromKMT(concernedResource)) != null) {
				kermetaBuilder.kpBuilders.get(kermetaBuilder.findKPidentifierFromKMT(concernedResource)).kpFiles.get(kermetaBuilder.generateIdentifier(concernedResource)).modelingUnit = freshModelingUnit;
				if (kermetaBuilder.findKPidentifierFromKMT(concernedResource) != null) {
					kermetaBuilder.compileFromKP(kermetaBuilder.findKPidentifierFromKMT(concernedResource));
				} else {
					Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevWARNING, "not able to compile the file "+concernedResource+ ", no kp referenced", this.getClass().getCanonicalName());
				}
			} else {
					Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevWARNING, "not able to compile the file "+concernedResource+ ", no kp referenced", this.getClass().getCanonicalName());
				}
		}
	}
}
