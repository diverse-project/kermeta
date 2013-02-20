package main;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.structure.ModelingUnit;

public class CheckDangling {
	static boolean doCheck(ModelingUnit aModelingUnit) {
		boolean result = true;
		TreeIterator<EObject> allContents = aModelingUnit.eAllContents();
		while (allContents.hasNext()) {
			EList<EObject> aCrossReference = allContents.next().eCrossReferences();
			for (EObject anObject : aCrossReference) {
				if (anObject.eResource() == null) {
					System.out.println("DANGLING REFERENCE : "+ anObject.toString());
					if (result) {
						result = false;
					}
				}
			}
		}
		return result;
	}
}
