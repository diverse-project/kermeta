package art.resource.art.mopp;

public class ArtNewFileContentProvider {
	
	public art.resource.art.IArtMetaInformation getMetaInformation() {
		return new art.resource.art.mopp.ArtMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			art.ArtPackage.eINSTANCE.getSystem(),
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
		org.eclipse.emf.ecore.EObject root = new art.resource.art.util.ArtMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		art.resource.art.IArtTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			art.resource.art.mopp.ArtPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public art.resource.art.IArtTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return new art.resource.art.mopp.ArtPrinter(outputStream, new art.resource.art.mopp.ArtResource());
	}
	
}
