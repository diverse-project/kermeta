package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoNewFileContentProvider {
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoMetaInformation getMetaInformation() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getLogoProgram(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPrinter(outputStream, new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoResource());
	}
	
}
