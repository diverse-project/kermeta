package domain;


import java.util.ArrayList;

import org.eclipse.emf.ecore.*;

import org.eclipse.emf.ecore.util.EcoreSwitch;

/**
 * @author Antonio de Almeida Souza Neto
 */
public class CloneEPackage  extends EcoreSwitch<EObject>{

	
	protected EPackage epackageCloned = EcoreFactory.eINSTANCE.createEPackage();
	
	protected ArrayList<EClass> listEClass = new ArrayList<EClass>();
	protected ArrayList<EClass> listEClassClones = new ArrayList<EClass>();
	
	@Override
	public EObject caseEPackage(EPackage object) {
		
		epackageCloned.setName(object.getName());
		
		for (EClassifier cl : object.getEClassifiers()){
			epackageCloned.getEClassifiers().add((EClassifier)this.doSwitch(cl));
		}
		
		return epackageCloned;
	}
	
	@Override
	public EObject caseEClass(EClass object) {
		
		int indexEClass = listEClass.indexOf(object);
		
		//it's to protect the infinite loops
		if(indexEClass >= 0){ //Object is already in the list
			return listEClassClones.get(indexEClass);
		}
		
		
		EClass eclassClone = EcoreFactory.eINSTANCE.createEClass();

		eclassClone.setName(object.getName());
		
		listEClass.add(object);
		listEClassClones.add(eclassClone);
		
		for (EStructuralFeature st : object.getEStructuralFeatures()){
			eclassClone.getEStructuralFeatures().add((EStructuralFeature)this.doSwitch(st));
		}
		for(EOperation op: object.getEAllOperations()){
			eclassClone.getEOperations().add((EOperation)this.doSwitch(op));
		}

		return eclassClone;
	}
	


	@Override
	public EObject caseEAttribute(EAttribute object) {
		EAttribute eattributeClone = EcoreFactory.eINSTANCE.createEAttribute();
		
		eattributeClone.setName(object.getName());
		
		if(object.getEType() != null){
			eattributeClone.setEType( (EClassifier) this.doSwitch(object.getEType()) );
		}
		
		return eattributeClone;
	}




	@Override
	public EObject caseEDataType(EDataType object) {
		EDataType edataTypeClone = EcoreFactory.eINSTANCE.createEDataType();
		
		edataTypeClone.setName(object.getName());
		
		return edataTypeClone;
	}

	@Override
	public EObject caseEOperation(EOperation object) {
		EOperation eoperationClone = EcoreFactory.eINSTANCE.createEOperation();
		
		eoperationClone.setName(object.getName());
		
		if(object.getEType() != null){
			eoperationClone.setEType( (EClassifier) this.doSwitch(object.getEType()) );
		}
		
		return eoperationClone;
	}

	@Override
	public EObject caseEReference(EReference object) {
		EReference ereferenceClone = EcoreFactory.eINSTANCE.createEReference();
		
		ereferenceClone.setName(object.getName());
		
		if(object.getEType() != null){
			ereferenceClone.setEType( (EClassifier) this.doSwitch(object.getEType()) );
		}
		
		return ereferenceClone;
	}










	


}
