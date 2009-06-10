/* Implementation of Kermeta base type EObject */

package fr.irisa.triskell.kermeta.ecore.wrapper;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.emf.Runtime2EMF;

public class EObjectWrapper {

	/**
	 * Implementation of method eClass called as :
	 * extern org::eclipse::emf::ecore::EObject.eClass(self)
	 * @return the eClass of which the EObject is an instance
	 */
	public static RuntimeObject eClass(RuntimeObject self) {

		// runtime2emf parameter is not useful for our purpose here.
		// but this is quite dirty so perhaps we should later move some helper
		// methods from runtime2emf to another "sharing" class?
		Runtime2EMF runtime2emf = new Runtime2EMF(null, null);
		EObject eObject = (EObject)runtime2emf.createEObjectFromRuntimeObject(self);
		RuntimeObject result = EcoreWrapper.setRuntimeObjectForEObject(eObject.eClass(), self.getFactory().getMemory());
		//RuntimeObject result = EcoreWrapper.findRuntimeObjectForEObject(eObject, self.getFactory().getMemory());
		return result;
		
	}
	
	/** Implementation of method eIsProxy called as :
	 * extern org::eclipse::emf::ecore::EObject.eIsProxy(self)
	 */
	public static RuntimeObject eIsProxy(RuntimeObject self) {
		 throw new NoSuchMethodError("eIsProxy wrapper : not implemented yet!");
	 }
	 
	/** Implementation of method eResource called as :
	  * extern org::eclipse::emf::ecore::EObject.eResource(self)
	  */
	public static RuntimeObject eResource(RuntimeObject self, RuntimeObject param0) {
		  throw new NoSuchMethodError("eResource wrapper : not implemented yet!");
	  }

	/** Implementation of method eContainingFeature called as :
	 * extern org::eclipse::emf::ecore::EObject.eContainingFeature(self)
	 */
	public static RuntimeObject eContainingFeature(RuntimeObject self,
			RuntimeObject param0) {
		throw new NoSuchMethodError("eContainingFeature : not implemented yet!");
	}

	/** Implementation of method eContainmentFeature called as :
	 * extern org::eclipse::emf::ecore::EObject.eContainmentFeature(self)
	 */
	public static RuntimeObject eContainmentFeature(RuntimeObject self,
			RuntimeObject param0) {
		throw new NoSuchMethodError("eContainmentFeature wrapper : not implemented yet!");
	}

	/** Implementation of method eContents called as :
	 * extern org::eclipse::emf::ecore::EObject.eContents(self)
	 */
	public static RuntimeObject eContents(RuntimeObject self,
			RuntimeObject param0) {
		throw new NoSuchMethodError("eContents wrapper : not implemented yet!");
	}

	/** Implementation of method eCrossReferences called as :
	 * extern org::eclipse::emf::ecore::EObject.eCrossReferences(self)
	 */
	public static RuntimeObject eCrossReferences(RuntimeObject self,
			RuntimeObject param0) {
		throw new NoSuchMethodError("eCrossReferences wrapper : not implemented yet!");
	}

	/** Implementation of method eGet called as :
	 * extern org::eclipse::emf::ecore::EObject.eGet(self, feature)
	 */
	public static RuntimeObject eGet(RuntimeObject self, RuntimeObject param0,
			RuntimeObject param1) {
		throw new NoSuchMethodError("eGet wrapper : not implemented yet!");
	}

	/** Implementation of method eGet2 called as :
	 * extern org::eclipse::emf::ecore::EObject.eGet2(self, feature, resolve)
	 */
	public static RuntimeObject eGet2(RuntimeObject self, RuntimeObject param0,
			RuntimeObject param1, RuntimeObject param2) {
		throw new NoSuchMethodError("eGet2 wrapper : not implemented yet!");
	}

	/** Implementation of method eSet called as :
	 * extern org::eclipse::emf::ecore::EObject.eSet(self, feature, newValue)
	 */
	public static RuntimeObject eSet(RuntimeObject self, RuntimeObject param0,
			RuntimeObject param1, RuntimeObject param2) {
		throw new NoSuchMethodError("eSet wrapper : not implemented yet!");
	}

	/** Implementation of method eIsSet called as :
	 * extern org::eclipse::emf::ecore::EObject.eIsSet(self, feature)
	 */
	public static RuntimeObject eIsSet(RuntimeObject self,
			RuntimeObject param0, RuntimeObject param1) {
		throw new NoSuchMethodError("eIsSet wrapper : not implemented yet!");	}

	/** Implementation of method eUnSet called as :
	 * extern org::eclipse::emf::ecore::EObject.eUnSet(self, feature)
	 */
	public static RuntimeObject eUnSet(RuntimeObject self,
			RuntimeObject param0, RuntimeObject param1) {
		throw new NoSuchMethodError("eIsProxy wrapper : not implemented yet!");
	}
	
	
	// COPY OF A METHOD FROM RUNTIME2EMF CLASS. --> PUT IT 

}
/* END OF FILE */
