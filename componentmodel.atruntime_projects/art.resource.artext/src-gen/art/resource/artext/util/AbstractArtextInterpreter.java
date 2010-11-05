/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractArtextInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof art.CardinalityElement) {
			result = interprete_art_CardinalityElement((art.CardinalityElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art.TypedElement) {
			result = interprete_art_TypedElement((art.TypedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art.DataType) {
			result = interprete_art_DataType((art.DataType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art.System) {
			result = interprete_art_System((art.System) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art.ModelElement) {
			result = interprete_art_ModelElement((art.ModelElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art.NamedElement) {
			result = interprete_art_NamedElement((art.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_art_NamedElement(art.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_ModelElement(art.ModelElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_System(art.System object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_DataType(art.DataType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_TypedElement(art.TypedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_CardinalityElement(art.CardinalityElement object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
