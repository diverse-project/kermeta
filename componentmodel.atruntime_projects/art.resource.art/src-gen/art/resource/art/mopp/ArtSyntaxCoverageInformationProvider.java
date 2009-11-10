package art.resource.art.mopp;

public class ArtSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			art.ArtPackage.eINSTANCE.getSystem(),
			art.ArtPackage.eINSTANCE.getDataType(),
			art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance(),
			art.instance.InstancePackage.eINSTANCE.getCompositeInstance(),
			art.instance.InstancePackage.eINSTANCE.getTransmissionBinding(),
			art.instance.InstancePackage.eINSTANCE.getDelegationBinding(),
			art.instance.InstancePackage.eINSTANCE.getValuedAttribute(),
			art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute(),
			art.instance.InstancePackage.eINSTANCE.getDefaultEntry(),
			art.instance.InstancePackage.eINSTANCE.getOtherEntry(),
			art.type.TypePackage.eINSTANCE.getPrimitiveType(),
			art.type.TypePackage.eINSTANCE.getCompositeType(),
			art.type.TypePackage.eINSTANCE.getOperation(),
			art.type.TypePackage.eINSTANCE.getParameter(),
			art.type.TypePackage.eINSTANCE.getFunctionalService(),
			art.type.TypePackage.eINSTANCE.getControlService(),
			art.type.TypePackage.eINSTANCE.getPort(),
			art.implem.ImplemPackage.eINSTANCE.getFractalComponent(),
			art.implem.ImplemPackage.eINSTANCE.getOSGiComponent(),
			art.implem.ImplemPackage.eINSTANCE.getOSGiPort(),
			art.group.GroupPackage.eINSTANCE.getTypeGroup(),
			art.group.GroupPackage.eINSTANCE.getInstanceGroup(),
			art.implem.ImplemPackage.eINSTANCE.getOSGiType(),
			art.type.TypePackage.eINSTANCE.getBasicAttribute(),
			art.type.TypePackage.eINSTANCE.getDictionary(),
			art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			art.ArtPackage.eINSTANCE.getSystem(),
		};
	}
	
}
