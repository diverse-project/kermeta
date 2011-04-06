/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.util;

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
public class AbstractKpInterpreter<ResultType, ContextType> {
	
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
		if (object instanceof org.kermeta.kp.KermetaProjectRef) {
			result = interprete_org_kermeta_kp_KermetaProjectRef((org.kermeta.kp.KermetaProjectRef) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.MixExpression) {
			result = interprete_org_kermeta_kp_MixExpression((org.kermeta.kp.MixExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.StringExpression) {
			result = interprete_org_kermeta_kp_StringExpression((org.kermeta.kp.StringExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.Expression) {
			result = interprete_org_kermeta_kp_Expression((org.kermeta.kp.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.Option) {
			result = interprete_org_kermeta_kp_Option((org.kermeta.kp.Option) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.WeaveDirective) {
			result = interprete_org_kermeta_kp_WeaveDirective((org.kermeta.kp.WeaveDirective) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.SourceQuery) {
			result = interprete_org_kermeta_kp_SourceQuery((org.kermeta.kp.SourceQuery) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.SourceNSURI) {
			result = interprete_org_kermeta_kp_SourceNSURI((org.kermeta.kp.SourceNSURI) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.ImportedSource) {
			result = interprete_org_kermeta_kp_ImportedSource((org.kermeta.kp.ImportedSource) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.SourceFile) {
			result = interprete_org_kermeta_kp_SourceFile((org.kermeta.kp.SourceFile) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.SourceFolder) {
			result = interprete_org_kermeta_kp_SourceFolder((org.kermeta.kp.SourceFolder) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.Source) {
			result = interprete_org_kermeta_kp_Source((org.kermeta.kp.Source) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.Dependency) {
			result = interprete_org_kermeta_kp_Dependency((org.kermeta.kp.Dependency) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.KermetaProject) {
			result = interprete_org_kermeta_kp_KermetaProject((org.kermeta.kp.KermetaProject) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kp.NamedElement) {
			result = interprete_org_kermeta_kp_NamedElement((org.kermeta.kp.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_kermeta_kp_KermetaProject(org.kermeta.kp.KermetaProject object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_Dependency(org.kermeta.kp.Dependency object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_NamedElement(org.kermeta.kp.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_Source(org.kermeta.kp.Source object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_SourceFolder(org.kermeta.kp.SourceFolder object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_SourceFile(org.kermeta.kp.SourceFile object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_SourceNSURI(org.kermeta.kp.SourceNSURI object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_SourceQuery(org.kermeta.kp.SourceQuery object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_ImportedSource(org.kermeta.kp.ImportedSource object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_WeaveDirective(org.kermeta.kp.WeaveDirective object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_Option(org.kermeta.kp.Option object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_Expression(org.kermeta.kp.Expression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_StringExpression(org.kermeta.kp.StringExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_MixExpression(org.kermeta.kp.MixExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kp_KermetaProjectRef(org.kermeta.kp.KermetaProjectRef object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
