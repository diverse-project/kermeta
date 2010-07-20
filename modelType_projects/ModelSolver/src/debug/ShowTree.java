package debug;


import org.eclipse.emf.ecore.*;

import org.eclipse.emf.ecore.util.EcoreSwitch;

/**
 * @author Antonio de Almeida Souza Neto
 */
public class ShowTree  extends EcoreSwitch<EObject>{

	
	protected int levelTree = 0;
	
	
	
	@Override
	public EObject caseEPackage(EPackage object) {

		for (int i = 0; i < levelTree; i++) {
			System.out.print("   ");
		}
		System.out.println(object.getName());
		levelTree ++;
		
		for (EClassifier cl : object.getEClassifiers()){
			this.doSwitch(cl);
		}
		
		levelTree --;
		
		return null;
	}
	
	@Override
	public EObject caseEClass(EClass object) {
		for (int i = 0; i < levelTree; i++) {
			System.out.print("   ");
		}
		System.out.println(object.getName());
		levelTree ++;
		
		for (EStructuralFeature st : object.getEStructuralFeatures()){
			this.doSwitch(st);
		}
		for(EOperation op: object.getEAllOperations()){
			this.doSwitch(op);
		}
		
		levelTree --;
		
		return null;
	}
	


	@Override
	public EObject caseEAttribute(EAttribute object) {
		for (int i = 0; i < levelTree; i++) {
			System.out.print("   ");
		}
		System.out.println(object.getName());
		levelTree ++;
		
		if(object.getEType() != null){
			this.doSwitch(object.getEType());
		}
		
		levelTree --;
		
		return null;
	}




	@Override
	public EObject caseEDataType(EDataType object) {
		for (int i = 0; i < levelTree; i++) {
			System.out.print("   ");
		}
		System.out.println(object.getName());
		
		return null;
	}

	@Override
	public EObject caseEOperation(EOperation object) {
		for (int i = 0; i < levelTree; i++) {
			System.out.print("   ");
		}
		System.out.println(object.getName());
		levelTree ++;
		
		if(object.getEType() != null){
			this.doSwitch(object.getEType());
		}
		
		levelTree --;
		
		return null;
	}

	@Override
	public EObject caseEReference(EReference object) {
		for (int i = 0; i < levelTree; i++) {
			System.out.print("   ");
		}
		System.out.println(object.getName());
		levelTree ++;
		
		if(object.getEType() != null){
			this.doSwitch(object.getEType());
		}
		
		levelTree --;
		
		return null;
	}




}
