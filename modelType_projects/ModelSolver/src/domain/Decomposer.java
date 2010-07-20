package domain;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.*;

import org.eclipse.emf.ecore.util.EcoreSwitch;

/**
 * @author Antonio de Almeida Souza Neto
 */
public class Decomposer  extends EcoreSwitch<List<EObject>>{

	
	List<EObject> objs = new ArrayList<EObject>();
	
	@Override
	public List<EObject> caseEPackage(EPackage object) {
		objs = new ArrayList<EObject>();
		
		objs.add(object);
		
		for (EClassifier cl : object.getEClassifiers()){
			this.doSwitch(cl);
		}
		
		return objs;
	}
	
	@Override
	public List<EObject> caseEClass(EClass object) {
		if (objs.contains(object)) {
			return objs;
		}
		
		objs.add(object);
		for (EStructuralFeature st : object.getEStructuralFeatures()){
			this.doSwitch(st);
		}
		for(EOperation op: object.getEAllOperations()){
			this.doSwitch(op);
		}
		return objs;
	}
	


	@Override
	public List<EObject> caseEAttribute(EAttribute object) {
		objs.add(object);
		if(object.getEType() != null){
			this.doSwitch(object.getEType());
		}
		
		return objs;
	}




	@Override
	public List<EObject> caseEDataType(EDataType object) {
		objs.add(object);
		return objs;
	}

	@Override
	public List<EObject> caseEOperation(EOperation object) {
		objs.add(object);
		if(object.getEType() != null){
			this.doSwitch(object.getEType());
		}
		return objs;
	}

	@Override
	public List<EObject> caseEReference(EReference object) {
		objs.add(object);
		if(object.getEType() != null){
			this.doSwitch(object.getEType());
		}
		
		return objs;
	}










	


}
