/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextNewFileContentProvider {
	
	public smartadapters4ART.resource.smARText.ISmARTextMetaInformation getMetaInformation() {
		return new smartadapters4ART.resource.smARText.mopp.SmARTextMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			smartadapters4ART.Smartadapters4ARTPackage.eINSTANCE.getAspect(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new smartadapters4ART.resource.smARText.util.SmARTextMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		smartadapters4ART.resource.smARText.ISmARTextTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			smartadapters4ART.resource.smARText.mopp.SmARTextPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new smartadapters4ART.resource.smARText.mopp.SmARTextResource());
	}
	
}
