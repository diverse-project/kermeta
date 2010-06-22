/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.util;

import Art2Aspect.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Art2Aspect.Art2AspectPackage
 * @generated
 */
public class Art2AspectSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Art2AspectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2AspectSwitch() {
		if (modelPackage == null) {
			modelPackage = Art2AspectPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Art2AspectPackage.ASPECT_ROOT: {
				AspectRoot aspectRoot = (AspectRoot)theEObject;
				Object result = caseAspectRoot(aspectRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.ASPECT_DEFINITION: {
				AspectDefinition aspectDefinition = (AspectDefinition)theEObject;
				Object result = caseAspectDefinition(aspectDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.POINTCUT_DEFINITION: {
				PointcutDefinition pointcutDefinition = (PointcutDefinition)theEObject;
				Object result = casePointcutDefinition(pointcutDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.BINDING_PATTERN: {
				BindingPattern bindingPattern = (BindingPattern)theEObject;
				Object result = caseBindingPattern(bindingPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN: {
				ComponentTypePattern componentTypePattern = (ComponentTypePattern)theEObject;
				Object result = caseComponentTypePattern(componentTypePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.NODE_PATTERN: {
				NodePattern nodePattern = (NodePattern)theEObject;
				Object result = caseNodePattern(nodePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.PORT_PATTERN: {
				PortPattern portPattern = (PortPattern)theEObject;
				Object result = casePortPattern(portPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.COMPONENT_PATTERN: {
				ComponentPattern componentPattern = (ComponentPattern)theEObject;
				Object result = caseComponentPattern(componentPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.PORT_TYPE_PATTERN: {
				PortTypePattern portTypePattern = (PortTypePattern)theEObject;
				Object result = casePortTypePattern(portTypePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.PORT_TYPE_REF_PATTERN: {
				PortTypeRefPattern portTypeRefPattern = (PortTypeRefPattern)theEObject;
				Object result = casePortTypeRefPattern(portTypeRefPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT: {
				PatternNamedElement patternNamedElement = (PatternNamedElement)theEObject;
				Object result = casePatternNamedElement(patternNamedElement);
				if (result == null) result = caseComponentPattern(patternNamedElement);
				if (result == null) result = casePortTypeRefPattern(patternNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAspectRoot(AspectRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAspectDefinition(AspectDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointcut Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointcut Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePointcutDefinition(PointcutDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBindingPattern(BindingPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentTypePattern(ComponentTypePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodePattern(NodePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortPattern(PortPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentPattern(ComponentPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortTypePattern(PortTypePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type Ref Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type Ref Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortTypeRefPattern(PortTypeRefPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePatternNamedElement(PatternNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //Art2AspectSwitch
