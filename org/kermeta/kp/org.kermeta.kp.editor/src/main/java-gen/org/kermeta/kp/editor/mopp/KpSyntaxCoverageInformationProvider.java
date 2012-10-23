/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(),
			org.kermeta.kp.KpPackage.eINSTANCE.getPackageEquivalence(),
			org.kermeta.kp.KpPackage.eINSTANCE.getImportFile(),
			org.kermeta.kp.KpPackage.eINSTANCE.getImportProjectJar(),
			org.kermeta.kp.KpPackage.eINSTANCE.getImportProjectSources(),
			org.kermeta.kp.KpPackage.eINSTANCE.getImportBytecodeJar(),
			org.kermeta.kp.KpPackage.eINSTANCE.getReusableResource(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(),
		};
	}
	
}
