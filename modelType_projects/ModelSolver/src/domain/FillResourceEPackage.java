package domain;

import org.eclipse.emf.ecore.*;

/**
 * @author Antonio de Almeida Souza Neto
 */
public class FillResourceEPackage  extends CloneEPackage{

	@Override
	public EObject caseEClass(EClass object) {
		
		EClass classcloned = (EClass)super.caseEClass(object);
		
		if(classcloned.getEPackage() != epackageCloned ){
			epackageCloned.getEClassifiers().add(classcloned);
		}
		
		return classcloned;
	}

}
