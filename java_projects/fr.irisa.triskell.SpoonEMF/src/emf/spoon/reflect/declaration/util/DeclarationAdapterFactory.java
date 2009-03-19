/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationAdapterFactory.java,v 1.1 2007/02/14 20:38:05 barais Exp $
 */
package emf.spoon.reflect.declaration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.declaration.DeclarationPackage
 * @generated
 */
public class DeclarationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeclarationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationSwitch modelSwitch =
		new DeclarationSwitch() {
			public Object caseCtAnnotation(CtAnnotation object) {
				return createCtAnnotationAdapter();
			}
			public Object caseCtAnnotationType(CtAnnotationType object) {
				return createCtAnnotationTypeAdapter();
			}
			public Object caseCtAnonymousExecutable(CtAnonymousExecutable object) {
				return createCtAnonymousExecutableAdapter();
			}
			public Object caseCtClass(CtClass object) {
				return createCtClassAdapter();
			}
			public Object caseCtConstructor(CtConstructor object) {
				return createCtConstructorAdapter();
			}
			public Object caseCtElement(CtElement object) {
				return createCtElementAdapter();
			}
			public Object caseCtEnum(CtEnum object) {
				return createCtEnumAdapter();
			}
			public Object caseCtExecutable(CtExecutable object) {
				return createCtExecutableAdapter();
			}
			public Object caseCtField(CtField object) {
				return createCtFieldAdapter();
			}
			public Object caseCtGenericElement(CtGenericElement object) {
				return createCtGenericElementAdapter();
			}
			public Object caseCtInterface(CtInterface object) {
				return createCtInterfaceAdapter();
			}
			public Object caseCtMethod(CtMethod object) {
				return createCtMethodAdapter();
			}
			public Object caseCtModifiable(CtModifiable object) {
				return createCtModifiableAdapter();
			}
			public Object caseCtNamedElement(CtNamedElement object) {
				return createCtNamedElementAdapter();
			}
			public Object caseCtPackage(CtPackage object) {
				return createCtPackageAdapter();
			}
			public Object caseCtParameter(CtParameter object) {
				return createCtParameterAdapter();
			}
			public Object caseCtSimpleType(CtSimpleType object) {
				return createCtSimpleTypeAdapter();
			}
			public Object caseCtType(CtType object) {
				return createCtTypeAdapter();
			}
			public Object caseCtTypeParameter(CtTypeParameter object) {
				return createCtTypeParameterAdapter();
			}
			public Object caseCtTypedElement(CtTypedElement object) {
				return createCtTypedElementAdapter();
			}
			public Object caseCtVariable(CtVariable object) {
				return createCtVariableAdapter();
			}
			public Object caseSourcePosition(SourcePosition object) {
				return createSourcePositionAdapter();
			}
			public Object caseFacade_CtElement(spoon.reflect.declaration.CtElement object) {
				return createFacade_CtElementAdapter();
			}
			public Object caseFacade_CtAnnotation(spoon.reflect.declaration.CtAnnotation object) {
				return createFacade_CtAnnotationAdapter();
			}
			public Object caseFacade_CtModifiable(spoon.reflect.declaration.CtModifiable object) {
				return createFacade_CtModifiableAdapter();
			}
			public Object caseFacade_CtNamedElement(spoon.reflect.declaration.CtNamedElement object) {
				return createFacade_CtNamedElementAdapter();
			}
			public Object caseFacade_CtSimpleType(spoon.reflect.declaration.CtSimpleType object) {
				return createFacade_CtSimpleTypeAdapter();
			}
			public Object caseFacade_CtAnnotationType(spoon.reflect.declaration.CtAnnotationType object) {
				return createFacade_CtAnnotationTypeAdapter();
			}
			public Object caseFacade_CtAnonymousExecutable(spoon.reflect.declaration.CtAnonymousExecutable object) {
				return createFacade_CtAnonymousExecutableAdapter();
			}
			public Object caseFacade_CtGenericElement(spoon.reflect.declaration.CtGenericElement object) {
				return createFacade_CtGenericElementAdapter();
			}
			public Object caseFacade_CtType(spoon.reflect.declaration.CtType object) {
				return createFacade_CtTypeAdapter();
			}
			public Object caseFacade_CtClass(spoon.reflect.declaration.CtClass object) {
				return createFacade_CtClassAdapter();
			}
			public Object caseFacade_CtExecutable(spoon.reflect.declaration.CtExecutable object) {
				return createFacade_CtExecutableAdapter();
			}
			public Object caseFacade_CtConstructor(spoon.reflect.declaration.CtConstructor object) {
				return createFacade_CtConstructorAdapter();
			}
			public Object caseFacade_CtEnum(spoon.reflect.declaration.CtEnum object) {
				return createFacade_CtEnumAdapter();
			}
			public Object caseFacade_CtTypedElement(spoon.reflect.declaration.CtTypedElement object) {
				return createFacade_CtTypedElementAdapter();
			}
			public Object caseFacade_CtVariable(spoon.reflect.declaration.CtVariable object) {
				return createFacade_CtVariableAdapter();
			}
			public Object caseFacade_CtField(spoon.reflect.declaration.CtField object) {
				return createFacade_CtFieldAdapter();
			}
			public Object caseFacade_CtInterface(spoon.reflect.declaration.CtInterface object) {
				return createFacade_CtInterfaceAdapter();
			}
			public Object caseFacade_CtMethod(spoon.reflect.declaration.CtMethod object) {
				return createFacade_CtMethodAdapter();
			}
			public Object caseFacade_CtPackage(spoon.reflect.declaration.CtPackage object) {
				return createFacade_CtPackageAdapter();
			}
			public Object caseFacade_CtParameter(spoon.reflect.declaration.CtParameter object) {
				return createFacade_CtParameterAdapter();
			}
			public Object caseFacade_CtTypeParameter(spoon.reflect.declaration.CtTypeParameter object) {
				return createFacade_CtTypeParameterAdapter();
			}
			public Object caseFacade_SourcePosition(spoon.reflect.cu.SourcePosition object) {
				return createFacade_SourcePositionAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtAnnotation <em>Ct Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtAnnotation
	 * @generated
	 */
	public Adapter createCtAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtAnnotationType <em>Ct Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtAnnotationType
	 * @generated
	 */
	public Adapter createCtAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtAnonymousExecutable <em>Ct Anonymous Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtAnonymousExecutable
	 * @generated
	 */
	public Adapter createCtAnonymousExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtClass
	 * @generated
	 */
	public Adapter createCtClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtConstructor <em>Ct Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtConstructor
	 * @generated
	 */
	public Adapter createCtConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtElement <em>Ct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtElement
	 * @generated
	 */
	public Adapter createCtElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtEnum <em>Ct Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtEnum
	 * @generated
	 */
	public Adapter createCtEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtExecutable <em>Ct Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtExecutable
	 * @generated
	 */
	public Adapter createCtExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtField <em>Ct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtField
	 * @generated
	 */
	public Adapter createCtFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtGenericElement <em>Ct Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtGenericElement
	 * @generated
	 */
	public Adapter createCtGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtInterface <em>Ct Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtInterface
	 * @generated
	 */
	public Adapter createCtInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtMethod <em>Ct Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtMethod
	 * @generated
	 */
	public Adapter createCtMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtModifiable
	 * @generated
	 */
	public Adapter createCtModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtNamedElement
	 * @generated
	 */
	public Adapter createCtNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtPackage <em>Ct Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtPackage
	 * @generated
	 */
	public Adapter createCtPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtParameter <em>Ct Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtParameter
	 * @generated
	 */
	public Adapter createCtParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtSimpleType <em>Ct Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtSimpleType
	 * @generated
	 */
	public Adapter createCtSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtType <em>Ct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtType
	 * @generated
	 */
	public Adapter createCtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtTypeParameter <em>Ct Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtTypeParameter
	 * @generated
	 */
	public Adapter createCtTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtTypedElement
	 * @generated
	 */
	public Adapter createCtTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtVariable
	 * @generated
	 */
	public Adapter createCtVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.SourcePosition <em>Source Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.SourcePosition
	 * @generated
	 */
	public Adapter createSourcePositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtElement <em>Ct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtElement
	 * @generated
	 */
	public Adapter createFacade_CtElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtAnnotation <em>Ct Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtAnnotation
	 * @generated
	 */
	public Adapter createFacade_CtAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtModifiable
	 * @generated
	 */
	public Adapter createFacade_CtModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtNamedElement
	 * @generated
	 */
	public Adapter createFacade_CtNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtSimpleType <em>Ct Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtSimpleType
	 * @generated
	 */
	public Adapter createFacade_CtSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtAnnotationType <em>Ct Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtAnnotationType
	 * @generated
	 */
	public Adapter createFacade_CtAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtAnonymousExecutable <em>Ct Anonymous Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtAnonymousExecutable
	 * @generated
	 */
	public Adapter createFacade_CtAnonymousExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtGenericElement <em>Ct Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtGenericElement
	 * @generated
	 */
	public Adapter createFacade_CtGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtType <em>Ct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtType
	 * @generated
	 */
	public Adapter createFacade_CtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtClass
	 * @generated
	 */
	public Adapter createFacade_CtClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtExecutable <em>Ct Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtExecutable
	 * @generated
	 */
	public Adapter createFacade_CtExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtConstructor <em>Ct Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtConstructor
	 * @generated
	 */
	public Adapter createFacade_CtConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtEnum <em>Ct Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtEnum
	 * @generated
	 */
	public Adapter createFacade_CtEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtTypedElement
	 * @generated
	 */
	public Adapter createFacade_CtTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtVariable
	 * @generated
	 */
	public Adapter createFacade_CtVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtField <em>Ct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtField
	 * @generated
	 */
	public Adapter createFacade_CtFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtInterface <em>Ct Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtInterface
	 * @generated
	 */
	public Adapter createFacade_CtInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtMethod <em>Ct Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtMethod
	 * @generated
	 */
	public Adapter createFacade_CtMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtPackage <em>Ct Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtPackage
	 * @generated
	 */
	public Adapter createFacade_CtPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtParameter <em>Ct Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtParameter
	 * @generated
	 */
	public Adapter createFacade_CtParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtTypeParameter <em>Ct Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtTypeParameter
	 * @generated
	 */
	public Adapter createFacade_CtTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.SourcePosition <em>Source Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.SourcePosition
	 * @generated
	 */
	public Adapter createFacade_SourcePositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DeclarationAdapterFactory
