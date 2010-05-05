package org.kermeta.kmlogo.logoasm.ui;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoResourceFactory;

import fr.irisa.triskell.eclipse.console.IOConsole;

public class ConvertToLogoK {
	public static void run(String file_uri, IOConsole console) {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"logo", new LogoResourceFactory());

		ResourceSet resourceSet = new ResourceSetImpl();

		Resource logoasmRsc = resourceSet.getResource(URI
				.createFileURI(file_uri), true);

		String newUri = logoasmRsc.getURI().trimFileExtension()
				.appendFileExtension("logo").toFileString();

		try {
			// a trick to avoid hang/crash when the file doesn't already exist on file system
			// create/save an empty file before
			Resource logoRsc = resourceSet.createResource(URI
					.createFileURI(newUri));
			logoRsc.save(null);
			// end trick

			logoRsc = resourceSet.getResource(URI.createFileURI(newUri), true);
			logoRsc.getContents().addAll(logoasmRsc.getContents());
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(logoRsc);
			logoRsc.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
