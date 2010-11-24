/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(),
			org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder(),
			org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile(),
			org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI(),
			org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery(),
			org.kermeta.kp.KpPackage.eINSTANCE.getDependency(),
			org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective(),
			org.kermeta.kp.KpPackage.eINSTANCE.getOption(),
			org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression(),
			org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression(),
			org.kermeta.kp.KpPackage.eINSTANCE.getNamedElement(),
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(),
		};
	}
	
}
