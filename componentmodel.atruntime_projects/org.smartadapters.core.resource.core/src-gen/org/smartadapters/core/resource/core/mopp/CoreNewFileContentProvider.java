package org.smartadapters.core.resource.core.mopp;

public class CoreNewFileContentProvider {
	
	public org.smartadapters.core.resource.core.ICoreMetaInformation getMetaInformation() {
		return new org.smartadapters.core.resource.core.mopp.CoreMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			org.smartadapters.core.CorePackage.eINSTANCE.getAdapter(),
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
		org.eclipse.emf.ecore.EObject root = new org.smartadapters.core.resource.core.util.CoreMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		org.smartadapters.core.resource.core.ICoreTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			org.smartadapters.core.resource.core.mopp.CorePlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public org.smartadapters.core.resource.core.ICoreTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return new org.smartadapters.core.resource.core.mopp.CorePrinter(outputStream, new org.smartadapters.core.resource.core.mopp.CoreResource());
	}
	
}
