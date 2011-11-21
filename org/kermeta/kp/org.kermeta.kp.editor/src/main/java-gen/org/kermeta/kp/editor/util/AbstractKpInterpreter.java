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
	private java.util.List<org.kermeta.kp.editor.IKpInterpreterListener> listeners = new java.util.ArrayList<org.kermeta.kp.editor.IKpInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
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
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.kermeta.kp.editor.IKpInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.kermeta.kp.editor.IKpInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.kermeta.kp.editor.IKpInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
