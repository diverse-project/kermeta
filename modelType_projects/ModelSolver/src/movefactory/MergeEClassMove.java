package movefactory;



import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;

import domain.EcoreSolution;


/**
 * @author Antonio de Almeida Souza Neto
 */
public class MergeEClassMove{

	
	private EcoreSolution ecoreSolution;
	
	private EReference leftRef;
	
	private EClass rightClass;
	
	
	
	public MergeEClassMove(EcoreSolution ecoreSolution, EReference leftRef, EClass rightClass){
		this.ecoreSolution = ecoreSolution;
		this.leftRef = leftRef;
		this.rightClass = rightClass;
	}
	
	
	public MergeEClassMove(EcoreSolution ecoreSolution) {
		this.ecoreSolution = ecoreSolution;
	}


	public void doMove() {
	
		EClass currentLeft;
		EClass currentRight;
		
		if (!isMoveDoable()) {
			return;
		}
		
		currentLeft = (EClass)leftRef.getEType();
		currentRight = rightClass;
		
		if (currentLeft == null) {
			return;
		}
       
		if(currentLeft.getName() == null){
			leftRef.setEType(rightClass);
		}else{
			if(currentLeft.getName().equals(currentRight.getName())){
				leftRef.setEType(rightClass);
			}else{
				return;
			}
		}
		
		
		mergeEClass(currentLeft, currentRight);
		
		ecoreSolution.getFacts().remove(currentLeft);
		
		System.out.println(this.toString());
	}
	
	@SuppressWarnings("unchecked")
	public ENamedElement existsObjWithName(EList list, String name ){
		
		for (ENamedElement eNamedElement : (EList<ENamedElement>)list) {
			if (eNamedElement.getName().equals(name)) {
				return eNamedElement;
			}
		}
		
		return null;
	}
	
	public void mergeEClass(EClass currentLeft, EClass currentRight){
		EReference eReferenceRight;
		EAttribute eAttributeRight;
		EOperation eOperationRight;
		
		
		for (EReference eReferenceLeft : currentLeft.getEReferences()) {
			
			
			//if exists a attribute with the same name that the reference
			eAttributeRight = (EAttribute)existsObjWithName( currentRight.getEAttributes(), eReferenceLeft.getName() );
			
			//Attribute > Reference for this consideration
			if( eAttributeRight != null ){
				//Attribute is the end of way, then we can just remove the left reference
				ecoreSolution.getFacts().remove(eReferenceLeft);
				
				return;
			}
			
			eReferenceRight = (EReference)existsObjWithName( currentRight.getEReferences(), eReferenceLeft.getName() );
			
			if( eReferenceRight != null ){
				mergeEReference(eReferenceLeft, eReferenceRight);

				ecoreSolution.getFacts().remove(eReferenceLeft);
			}else{
				currentRight.getEStructuralFeatures().add(eReferenceLeft);
			}
		}
		
		
		for (EAttribute eAttributeLeft : currentLeft.getEAttributes()) {
						
			//if exists a reference with the same name that the attribute
			eReferenceRight = (EReference)existsObjWithName( currentRight.getEReferences(), eAttributeLeft.getName() );
			
			//Attribute > Reference for this consideration
			if( eReferenceRight != null ){
				//Attribute is the end of way, then we can just remove the left reference
				currentRight.getEStructuralFeatures().add((EStructuralFeature)eAttributeLeft);
				currentRight.getEStructuralFeatures().remove((EStructuralFeature)eReferenceRight);
				
				ecoreSolution.getFacts().remove(eReferenceRight);
				
				return;
			}
			
			
			eAttributeRight = (EAttribute)existsObjWithName( currentRight.getEAttributes(), eAttributeLeft.getName() );
			
			if( eAttributeRight != null ){
				mergeEAttribute(eAttributeLeft, eAttributeRight);

				ecoreSolution.getFacts().remove(eAttributeLeft);
			}else{
				currentRight.getEStructuralFeatures().add(eAttributeLeft);
			}
		}
		
		ArrayList<EOperation> listOpAdd = new ArrayList<EOperation>();
		for (EOperation eOperationLeft : currentLeft.getEOperations()) {
						
			eOperationRight = (EOperation)existsObjWithName( currentRight.getEOperations(), eOperationLeft.getName() );
			
			if( eOperationRight != null ){
				mergeEOperation(eOperationLeft, eOperationRight);

				ecoreSolution.getFacts().remove(eOperationLeft);
			}else{
				//currentRight.getEOperations().add(eOperationLeft);
				
				//The other line is commented because a problem with the for
				//when we do add in the current right it disappear of current left
				// and cause problem in the for(current left)
				listOpAdd.add(eOperationLeft);
			}
		}

		for (EOperation eOperation : listOpAdd) {
			currentRight.getEOperations().add(eOperation);
		}
		
	}
	
	public void mergeEReference(EReference currentLeft, EReference currentRight){
		EClass eClassRight;
		EClass eClassLeft;
		
		
		eClassLeft = currentLeft.getEReferenceType();
		
		eClassRight = currentRight.getEReferenceType();
		
		if (eClassLeft == null) {
			return;
		}
		
		if (eClassRight == null) {
			currentRight.setEType(eClassLeft);
			return;
		}
		
		if(eClassRight.getName() == null){
			if(eClassLeft.getName() == null){
				mergeEClass(eClassLeft, eClassRight);

				ecoreSolution.getFacts().remove(eClassLeft);
			}else{
				eClassRight.setName(eClassLeft.getName());
				
				mergeEClass(eClassLeft, eClassRight);

				ecoreSolution.getFacts().remove(eClassLeft);
			}
			
			return;
		}
		
		//If the name of class is null it have to be solved by the pair (Reference, Class) in doMove
		/*if(eClassRight.getName() == null || eClassLeft.getName() == null){
			return;
		}*/
		
		
		if( eClassRight.getName().equals(eClassLeft.getName()) ){
			mergeEClass(eClassLeft, eClassRight);

			ecoreSolution.getFacts().remove(eClassLeft);
		}else{
			//references from and to different classes with the same name. abort
			return;
		}

		
	}
	
	public void mergeEAttribute(EAttribute currentLeft, EAttribute currentRight){
		EDataType eDataTypeRight;
		EDataType eDataTypeLeft;
		
		
		eDataTypeLeft = currentLeft.getEAttributeType();
		
		eDataTypeRight = currentRight.getEAttributeType();
		
		if (eDataTypeLeft == null) {
			return;
		}
		
		if (eDataTypeRight == null) {
			currentRight.setEType(eDataTypeLeft);
			return;
		}
		
		if( eDataTypeRight.getName().equals(eDataTypeLeft.getName()) ){
			ecoreSolution.getFacts().remove(eDataTypeLeft);
		}else{
			//Float > Other numeric
			if(eDataTypeRight.getName().equals("EFloat") || eDataTypeLeft.getName().equals("EFloat") ){
				eDataTypeRight.setName("EFloat");
				ecoreSolution.getFacts().remove(eDataTypeLeft);
			}
			return;
		}

		
	}
	
	public void mergeEOperation(EOperation currentLeft, EOperation currentRight){
		EClassifier eClassifierRight;
		EClassifier eClassifierLeft;
		
		
		eClassifierLeft = currentLeft.getEType();
		
		eClassifierRight = currentRight.getEType();
		
		if (eClassifierLeft == null) {
			return;
		}
		
		if (eClassifierRight == null) {
			currentRight.setEType(eClassifierLeft);
			return;
		}
		
		if(eClassifierRight.getClass() == EClass.class &&
				eClassifierLeft.getClass() == EClass.class){
			
			if( eClassifierRight.getName().equals(eClassifierLeft.getName()) ){
				
				mergeEClass((EClass)eClassifierLeft, (EClass)eClassifierRight);

				ecoreSolution.getFacts().remove(eClassifierLeft);
			}else{
				//references from and to different classes with the same name. abort
				return;
			}
			
		}else{
			if(eClassifierRight.getClass() == EDataType.class &&
				eClassifierLeft.getClass() == EDataType.class){
				
					if(eClassifierRight.getName().equals("EFloat") || eClassifierLeft.getName().equals("EFloat") ){
						eClassifierRight.setName("EFloat");
						ecoreSolution.getFacts().remove(eClassifierLeft);
					}else{
						ecoreSolution.getFacts().remove(eClassifierLeft);
					}
			}else{
				if(eClassifierRight.getClass() == EDataType.class){
					ecoreSolution.getFacts().remove(eClassifierLeft);
				}else if (eClassifierLeft.getClass() == EDataType.class){
					currentRight.setEType(eClassifierLeft);
					ecoreSolution.getFacts().remove(eClassifierRight);
				}
			}
		}

		
	}

	public boolean isMoveDoable() {
		if( leftRef.getEType() == rightClass){
			return false;
		}
		if (!ecoreSolution.getFacts().contains(leftRef) 
				|| !ecoreSolution.getFacts().contains(rightClass) ) {
			return false;
		}
		return true;
	}

	public String toString() {
		return "Merge the EReference '" + ((EReference)leftRef).getName() + "' and EClass '" + ((EClass)rightClass).getName() + "'";
	}
	
	

}
