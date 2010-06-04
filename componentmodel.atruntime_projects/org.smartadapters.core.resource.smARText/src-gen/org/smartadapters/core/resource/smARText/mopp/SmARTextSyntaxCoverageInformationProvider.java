/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.smartadapters.core.CorePackage.eINSTANCE.getAdapter(),
			org.smartadapters.core.CorePackage.eINSTANCE.getAspect(),
			org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem(),
			org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance(),
			org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance(),
			org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance(),
			org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding(),
			pattern.art.ArtPackage.eINSTANCE.getSystem(),
			pattern.art.ArtPackage.eINSTANCE.getDataType(),
			pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance(),
			pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance(),
			pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding(),
			pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding(),
			pattern.art.instance.InstancePackage.eINSTANCE.getValuedAttribute(),
			pattern.art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute(),
			pattern.art.instance.InstancePackage.eINSTANCE.getDefaultEntry(),
			pattern.art.instance.InstancePackage.eINSTANCE.getOtherEntry(),
			pattern.art.type.TypePackage.eINSTANCE.getPrimitiveType(),
			pattern.art.type.TypePackage.eINSTANCE.getCompositeType(),
			pattern.art.type.TypePackage.eINSTANCE.getOperation(),
			pattern.art.type.TypePackage.eINSTANCE.getParameter(),
			pattern.art.type.TypePackage.eINSTANCE.getFunctionalService(),
			pattern.art.type.TypePackage.eINSTANCE.getControlService(),
			pattern.art.type.TypePackage.eINSTANCE.getPort(),
			pattern.art.implem.ImplemPackage.eINSTANCE.getFractalComponent(),
			pattern.art.implem.ImplemPackage.eINSTANCE.getOSGiComponent(),
			pattern.art.implem.ImplemPackage.eINSTANCE.getOSGiType(),
			pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute(),
			pattern.art.type.TypePackage.eINSTANCE.getDictionary(),
			pattern.art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue(),
			pattern.art.type.TypePackage.eINSTANCE.getPortId(),
			pattern.art.type.TypePackage.eINSTANCE.getPortCollection(),
			patternframework.PatternframeworkPackage.eINSTANCE.getModelPattern(),
			patternframework.PatternframeworkPackage.eINSTANCE.getPModel(),
			patternframework.PatternframeworkPackage.eINSTANCE.getPConstraint(),
			patternframework.PatternframeworkPackage.eINSTANCE.getPRole(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.smartadapters.core.CorePackage.eINSTANCE.getAdapter(),
		};
	}
	
}
