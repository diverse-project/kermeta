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
			org.kermeta.kp.KpPackage.eINSTANCE.getSource(),
			org.kermeta.kp.KpPackage.eINSTANCE.getDependency(),
			org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective(),
			org.kermeta.kp.KpPackage.eINSTANCE.getOption(),
			org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression(),
			org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(),
		};
	}
	
}
