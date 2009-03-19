/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationSwitch.java,v 1.1 2007/02/14 20:38:05 barais Exp $
 */
package emf.spoon.reflect.declaration.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import emf.spoon.reflect.declaration.CtAnnotation;
import emf.spoon.reflect.declaration.CtAnnotationType;
import emf.spoon.reflect.declaration.CtAnonymousExecutable;
import emf.spoon.reflect.declaration.CtClass;
import emf.spoon.reflect.declaration.CtConstructor;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtEnum;
import emf.spoon.reflect.declaration.CtExecutable;
import emf.spoon.reflect.declaration.CtField;
import emf.spoon.reflect.declaration.CtGenericElement;
import emf.spoon.reflect.declaration.CtInterface;
import emf.spoon.reflect.declaration.CtMethod;
import emf.spoon.reflect.declaration.CtModifiable;
import emf.spoon.reflect.declaration.CtNamedElement;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.CtParameter;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.declaration.CtType;
import emf.spoon.reflect.declaration.CtTypeParameter;
import emf.spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.declaration.CtVariable;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;

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
 * @see emf.spoon.reflect.declaration.DeclarationPackage
 * @generated
 */
public class DeclarationSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationSwitch() {
		if (modelPackage == null) {
			modelPackage = DeclarationPackage.eINSTANCE;
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
			case DeclarationPackage.CT_ANNOTATION: {
				CtAnnotation ctAnnotation = (CtAnnotation)theEObject;
				Object result = caseCtAnnotation(ctAnnotation);
				if (result == null) result = caseCtElement(ctAnnotation);
				if (result == null) result = caseFacade_CtAnnotation(ctAnnotation);
				if (result == null) result = caseFacade_CtElement(ctAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_ANNOTATION_TYPE: {
				CtAnnotationType ctAnnotationType = (CtAnnotationType)theEObject;
				Object result = caseCtAnnotationType(ctAnnotationType);
				if (result == null) result = caseCtSimpleType(ctAnnotationType);
				if (result == null) result = caseFacade_CtAnnotationType(ctAnnotationType);
				if (result == null) result = caseCtNamedElement(ctAnnotationType);
				if (result == null) result = caseFacade_CtSimpleType(ctAnnotationType);
				if (result == null) result = caseCtElement(ctAnnotationType);
				if (result == null) result = caseCtModifiable(ctAnnotationType);
				if (result == null) result = caseFacade_CtNamedElement(ctAnnotationType);
				if (result == null) result = caseFacade_CtElement(ctAnnotationType);
				if (result == null) result = caseFacade_CtModifiable(ctAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE: {
				CtAnonymousExecutable ctAnonymousExecutable = (CtAnonymousExecutable)theEObject;
				Object result = caseCtAnonymousExecutable(ctAnonymousExecutable);
				if (result == null) result = caseCtElement(ctAnonymousExecutable);
				if (result == null) result = caseCtModifiable(ctAnonymousExecutable);
				if (result == null) result = caseFacade_CtAnonymousExecutable(ctAnonymousExecutable);
				if (result == null) result = caseFacade_CtElement(ctAnonymousExecutable);
				if (result == null) result = caseFacade_CtModifiable(ctAnonymousExecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_CLASS: {
				CtClass ctClass = (CtClass)theEObject;
				Object result = caseCtClass(ctClass);
				if (result == null) result = caseCtType(ctClass);
				if (result == null) result = caseFacade_CtClass(ctClass);
				if (result == null) result = caseCtGenericElement(ctClass);
				if (result == null) result = caseCtSimpleType(ctClass);
				if (result == null) result = caseFacade_CtType(ctClass);
				if (result == null) result = caseCtElement(ctClass);
				if (result == null) result = caseFacade_CtGenericElement(ctClass);
				if (result == null) result = caseCtNamedElement(ctClass);
				if (result == null) result = caseFacade_CtSimpleType(ctClass);
				if (result == null) result = caseFacade_CtElement(ctClass);
				if (result == null) result = caseCtModifiable(ctClass);
				if (result == null) result = caseFacade_CtNamedElement(ctClass);
				if (result == null) result = caseFacade_CtModifiable(ctClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_CONSTRUCTOR: {
				CtConstructor ctConstructor = (CtConstructor)theEObject;
				Object result = caseCtConstructor(ctConstructor);
				if (result == null) result = caseCtExecutable(ctConstructor);
				if (result == null) result = caseFacade_CtConstructor(ctConstructor);
				if (result == null) result = caseCtGenericElement(ctConstructor);
				if (result == null) result = caseCtNamedElement(ctConstructor);
				if (result == null) result = caseFacade_CtExecutable(ctConstructor);
				if (result == null) result = caseCtElement(ctConstructor);
				if (result == null) result = caseFacade_CtGenericElement(ctConstructor);
				if (result == null) result = caseCtModifiable(ctConstructor);
				if (result == null) result = caseFacade_CtNamedElement(ctConstructor);
				if (result == null) result = caseFacade_CtElement(ctConstructor);
				if (result == null) result = caseFacade_CtModifiable(ctConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_ELEMENT: {
				CtElement ctElement = (CtElement)theEObject;
				Object result = caseCtElement(ctElement);
				if (result == null) result = caseFacade_CtElement(ctElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_ENUM: {
				CtEnum ctEnum = (CtEnum)theEObject;
				Object result = caseCtEnum(ctEnum);
				if (result == null) result = caseCtType(ctEnum);
				if (result == null) result = caseFacade_CtEnum(ctEnum);
				if (result == null) result = caseCtGenericElement(ctEnum);
				if (result == null) result = caseCtSimpleType(ctEnum);
				if (result == null) result = caseFacade_CtType(ctEnum);
				if (result == null) result = caseCtElement(ctEnum);
				if (result == null) result = caseFacade_CtGenericElement(ctEnum);
				if (result == null) result = caseCtNamedElement(ctEnum);
				if (result == null) result = caseFacade_CtSimpleType(ctEnum);
				if (result == null) result = caseFacade_CtElement(ctEnum);
				if (result == null) result = caseCtModifiable(ctEnum);
				if (result == null) result = caseFacade_CtNamedElement(ctEnum);
				if (result == null) result = caseFacade_CtModifiable(ctEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_EXECUTABLE: {
				CtExecutable ctExecutable = (CtExecutable)theEObject;
				Object result = caseCtExecutable(ctExecutable);
				if (result == null) result = caseCtGenericElement(ctExecutable);
				if (result == null) result = caseCtNamedElement(ctExecutable);
				if (result == null) result = caseFacade_CtExecutable(ctExecutable);
				if (result == null) result = caseCtElement(ctExecutable);
				if (result == null) result = caseFacade_CtGenericElement(ctExecutable);
				if (result == null) result = caseCtModifiable(ctExecutable);
				if (result == null) result = caseFacade_CtNamedElement(ctExecutable);
				if (result == null) result = caseFacade_CtElement(ctExecutable);
				if (result == null) result = caseFacade_CtModifiable(ctExecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_FIELD: {
				CtField ctField = (CtField)theEObject;
				Object result = caseCtField(ctField);
				if (result == null) result = caseCtNamedElement(ctField);
				if (result == null) result = caseCtVariable(ctField);
				if (result == null) result = caseFacade_CtField(ctField);
				if (result == null) result = caseCtElement(ctField);
				if (result == null) result = caseCtModifiable(ctField);
				if (result == null) result = caseFacade_CtNamedElement(ctField);
				if (result == null) result = caseCtTypedElement(ctField);
				if (result == null) result = caseFacade_CtVariable(ctField);
				if (result == null) result = caseFacade_CtElement(ctField);
				if (result == null) result = caseFacade_CtModifiable(ctField);
				if (result == null) result = caseFacade_CtTypedElement(ctField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_GENERIC_ELEMENT: {
				CtGenericElement ctGenericElement = (CtGenericElement)theEObject;
				Object result = caseCtGenericElement(ctGenericElement);
				if (result == null) result = caseCtElement(ctGenericElement);
				if (result == null) result = caseFacade_CtGenericElement(ctGenericElement);
				if (result == null) result = caseFacade_CtElement(ctGenericElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_INTERFACE: {
				CtInterface ctInterface = (CtInterface)theEObject;
				Object result = caseCtInterface(ctInterface);
				if (result == null) result = caseCtType(ctInterface);
				if (result == null) result = caseFacade_CtInterface(ctInterface);
				if (result == null) result = caseCtGenericElement(ctInterface);
				if (result == null) result = caseCtSimpleType(ctInterface);
				if (result == null) result = caseFacade_CtType(ctInterface);
				if (result == null) result = caseCtElement(ctInterface);
				if (result == null) result = caseFacade_CtGenericElement(ctInterface);
				if (result == null) result = caseCtNamedElement(ctInterface);
				if (result == null) result = caseFacade_CtSimpleType(ctInterface);
				if (result == null) result = caseFacade_CtElement(ctInterface);
				if (result == null) result = caseCtModifiable(ctInterface);
				if (result == null) result = caseFacade_CtNamedElement(ctInterface);
				if (result == null) result = caseFacade_CtModifiable(ctInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_METHOD: {
				CtMethod ctMethod = (CtMethod)theEObject;
				Object result = caseCtMethod(ctMethod);
				if (result == null) result = caseCtExecutable(ctMethod);
				if (result == null) result = caseCtTypedElement(ctMethod);
				if (result == null) result = caseFacade_CtMethod(ctMethod);
				if (result == null) result = caseCtGenericElement(ctMethod);
				if (result == null) result = caseCtNamedElement(ctMethod);
				if (result == null) result = caseFacade_CtExecutable(ctMethod);
				if (result == null) result = caseFacade_CtTypedElement(ctMethod);
				if (result == null) result = caseCtElement(ctMethod);
				if (result == null) result = caseFacade_CtGenericElement(ctMethod);
				if (result == null) result = caseCtModifiable(ctMethod);
				if (result == null) result = caseFacade_CtNamedElement(ctMethod);
				if (result == null) result = caseFacade_CtElement(ctMethod);
				if (result == null) result = caseFacade_CtModifiable(ctMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_MODIFIABLE: {
				CtModifiable ctModifiable = (CtModifiable)theEObject;
				Object result = caseCtModifiable(ctModifiable);
				if (result == null) result = caseFacade_CtModifiable(ctModifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_NAMED_ELEMENT: {
				CtNamedElement ctNamedElement = (CtNamedElement)theEObject;
				Object result = caseCtNamedElement(ctNamedElement);
				if (result == null) result = caseCtElement(ctNamedElement);
				if (result == null) result = caseCtModifiable(ctNamedElement);
				if (result == null) result = caseFacade_CtNamedElement(ctNamedElement);
				if (result == null) result = caseFacade_CtElement(ctNamedElement);
				if (result == null) result = caseFacade_CtModifiable(ctNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_PACKAGE: {
				CtPackage ctPackage = (CtPackage)theEObject;
				Object result = caseCtPackage(ctPackage);
				if (result == null) result = caseCtNamedElement(ctPackage);
				if (result == null) result = caseFacade_CtPackage(ctPackage);
				if (result == null) result = caseCtElement(ctPackage);
				if (result == null) result = caseCtModifiable(ctPackage);
				if (result == null) result = caseFacade_CtNamedElement(ctPackage);
				if (result == null) result = caseFacade_CtElement(ctPackage);
				if (result == null) result = caseFacade_CtModifiable(ctPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_PARAMETER: {
				CtParameter ctParameter = (CtParameter)theEObject;
				Object result = caseCtParameter(ctParameter);
				if (result == null) result = caseCtNamedElement(ctParameter);
				if (result == null) result = caseCtVariable(ctParameter);
				if (result == null) result = caseFacade_CtParameter(ctParameter);
				if (result == null) result = caseCtElement(ctParameter);
				if (result == null) result = caseCtModifiable(ctParameter);
				if (result == null) result = caseFacade_CtNamedElement(ctParameter);
				if (result == null) result = caseCtTypedElement(ctParameter);
				if (result == null) result = caseFacade_CtVariable(ctParameter);
				if (result == null) result = caseFacade_CtElement(ctParameter);
				if (result == null) result = caseFacade_CtModifiable(ctParameter);
				if (result == null) result = caseFacade_CtTypedElement(ctParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_SIMPLE_TYPE: {
				CtSimpleType ctSimpleType = (CtSimpleType)theEObject;
				Object result = caseCtSimpleType(ctSimpleType);
				if (result == null) result = caseCtNamedElement(ctSimpleType);
				if (result == null) result = caseFacade_CtSimpleType(ctSimpleType);
				if (result == null) result = caseCtElement(ctSimpleType);
				if (result == null) result = caseCtModifiable(ctSimpleType);
				if (result == null) result = caseFacade_CtNamedElement(ctSimpleType);
				if (result == null) result = caseFacade_CtElement(ctSimpleType);
				if (result == null) result = caseFacade_CtModifiable(ctSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_TYPE: {
				CtType ctType = (CtType)theEObject;
				Object result = caseCtType(ctType);
				if (result == null) result = caseCtGenericElement(ctType);
				if (result == null) result = caseCtSimpleType(ctType);
				if (result == null) result = caseFacade_CtType(ctType);
				if (result == null) result = caseCtElement(ctType);
				if (result == null) result = caseFacade_CtGenericElement(ctType);
				if (result == null) result = caseCtNamedElement(ctType);
				if (result == null) result = caseFacade_CtSimpleType(ctType);
				if (result == null) result = caseFacade_CtElement(ctType);
				if (result == null) result = caseCtModifiable(ctType);
				if (result == null) result = caseFacade_CtNamedElement(ctType);
				if (result == null) result = caseFacade_CtModifiable(ctType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_TYPE_PARAMETER: {
				CtTypeParameter ctTypeParameter = (CtTypeParameter)theEObject;
				Object result = caseCtTypeParameter(ctTypeParameter);
				if (result == null) result = caseCtElement(ctTypeParameter);
				if (result == null) result = caseFacade_CtTypeParameter(ctTypeParameter);
				if (result == null) result = caseFacade_CtElement(ctTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_TYPED_ELEMENT: {
				CtTypedElement ctTypedElement = (CtTypedElement)theEObject;
				Object result = caseCtTypedElement(ctTypedElement);
				if (result == null) result = caseFacade_CtTypedElement(ctTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CT_VARIABLE: {
				CtVariable ctVariable = (CtVariable)theEObject;
				Object result = caseCtVariable(ctVariable);
				if (result == null) result = caseCtNamedElement(ctVariable);
				if (result == null) result = caseCtTypedElement(ctVariable);
				if (result == null) result = caseFacade_CtVariable(ctVariable);
				if (result == null) result = caseCtElement(ctVariable);
				if (result == null) result = caseCtModifiable(ctVariable);
				if (result == null) result = caseFacade_CtNamedElement(ctVariable);
				if (result == null) result = caseFacade_CtTypedElement(ctVariable);
				if (result == null) result = caseFacade_CtElement(ctVariable);
				if (result == null) result = caseFacade_CtModifiable(ctVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.SOURCE_POSITION: {
				SourcePosition sourcePosition = (SourcePosition)theEObject;
				Object result = caseSourcePosition(sourcePosition);
				if (result == null) result = caseFacade_SourcePosition(sourcePosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtAnnotation(CtAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtAnnotationType(CtAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Anonymous Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Anonymous Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtAnonymousExecutable(CtAnonymousExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtClass(CtClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtConstructor(CtConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtElement(CtElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtEnum(CtEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtExecutable(CtExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtField(CtField object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtGenericElement(CtGenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtInterface(CtInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtMethod(CtMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtModifiable(CtModifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtNamedElement(CtNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtPackage(CtPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtParameter(CtParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtSimpleType(CtSimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtType(CtType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtTypeParameter(CtTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtTypedElement(CtTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtVariable(CtVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Source Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Source Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSourcePosition(SourcePosition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtElement(spoon.reflect.declaration.CtElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtAnnotation(spoon.reflect.declaration.CtAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtModifiable(spoon.reflect.declaration.CtModifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtNamedElement(spoon.reflect.declaration.CtNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtSimpleType(spoon.reflect.declaration.CtSimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtAnnotationType(spoon.reflect.declaration.CtAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Anonymous Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Anonymous Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtAnonymousExecutable(spoon.reflect.declaration.CtAnonymousExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtGenericElement(spoon.reflect.declaration.CtGenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtType(spoon.reflect.declaration.CtType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtClass(spoon.reflect.declaration.CtClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtExecutable(spoon.reflect.declaration.CtExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtConstructor(spoon.reflect.declaration.CtConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtEnum(spoon.reflect.declaration.CtEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtTypedElement(spoon.reflect.declaration.CtTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtVariable(spoon.reflect.declaration.CtVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtField(spoon.reflect.declaration.CtField object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtInterface(spoon.reflect.declaration.CtInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtMethod(spoon.reflect.declaration.CtMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtPackage(spoon.reflect.declaration.CtPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtParameter(spoon.reflect.declaration.CtParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtTypeParameter(spoon.reflect.declaration.CtTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Source Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Source Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_SourcePosition(spoon.reflect.cu.SourcePosition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //DeclarationSwitch
