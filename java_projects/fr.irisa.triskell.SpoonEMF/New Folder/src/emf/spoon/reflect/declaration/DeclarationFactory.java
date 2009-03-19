/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationFactory.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.declaration.DeclarationPackage
 * @generated
 */
public interface DeclarationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationFactory eINSTANCE = emf.spoon.reflect.declaration.impl.DeclarationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ct Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Annotation</em>'.
	 * @generated
	 */
	CtAnnotation createCtAnnotation();

	/**
	 * Returns a new object of class '<em>Ct Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Annotation Type</em>'.
	 * @generated
	 */
	CtAnnotationType createCtAnnotationType();

	/**
	 * Returns a new object of class '<em>Ct Anonymous Executable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Anonymous Executable</em>'.
	 * @generated
	 */
	CtAnonymousExecutable createCtAnonymousExecutable();

	/**
	 * Returns a new object of class '<em>Ct Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Class</em>'.
	 * @generated
	 */
	CtClass createCtClass();

	/**
	 * Returns a new object of class '<em>Ct Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Constructor</em>'.
	 * @generated
	 */
	CtConstructor createCtConstructor();

	/**
	 * Returns a new object of class '<em>Ct Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Element</em>'.
	 * @generated
	 */
	CtElement createCtElement();

	/**
	 * Returns a new object of class '<em>Ct Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Enum</em>'.
	 * @generated
	 */
	CtEnum createCtEnum();

	/**
	 * Returns a new object of class '<em>Ct Executable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Executable</em>'.
	 * @generated
	 */
	CtExecutable createCtExecutable();

	/**
	 * Returns a new object of class '<em>Ct Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Field</em>'.
	 * @generated
	 */
	CtField createCtField();

	/**
	 * Returns a new object of class '<em>Ct Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Generic Element</em>'.
	 * @generated
	 */
	CtGenericElement createCtGenericElement();

	/**
	 * Returns a new object of class '<em>Ct Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Interface</em>'.
	 * @generated
	 */
	CtInterface createCtInterface();

	/**
	 * Returns a new object of class '<em>Ct Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Method</em>'.
	 * @generated
	 */
	CtMethod createCtMethod();

	/**
	 * Returns a new object of class '<em>Ct Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Modifiable</em>'.
	 * @generated
	 */
	CtModifiable createCtModifiable();

	/**
	 * Returns a new object of class '<em>Ct Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Named Element</em>'.
	 * @generated
	 */
	CtNamedElement createCtNamedElement();

	/**
	 * Returns a new object of class '<em>Ct Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Package</em>'.
	 * @generated
	 */
	CtPackage createCtPackage();

	/**
	 * Returns a new object of class '<em>Ct Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Parameter</em>'.
	 * @generated
	 */
	CtParameter createCtParameter();

	/**
	 * Returns a new object of class '<em>Ct Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Simple Type</em>'.
	 * @generated
	 */
	CtSimpleType createCtSimpleType();

	/**
	 * Returns a new object of class '<em>Ct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Type</em>'.
	 * @generated
	 */
	CtType createCtType();

	/**
	 * Returns a new object of class '<em>Ct Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Type Parameter</em>'.
	 * @generated
	 */
	CtTypeParameter createCtTypeParameter();

	/**
	 * Returns a new object of class '<em>Ct Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Typed Element</em>'.
	 * @generated
	 */
	CtTypedElement createCtTypedElement();

	/**
	 * Returns a new object of class '<em>Ct Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Variable</em>'.
	 * @generated
	 */
	CtVariable createCtVariable();

	/**
	 * Returns a new object of class '<em>Source Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Position</em>'.
	 * @generated
	 */
	SourcePosition createSourcePosition();

	/**
	 * Returns a new object of class '<em>Ct Annotation Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Annotation Element Value</em>'.
	 * @generated
	 */
	CtAnnotationElementValue createCtAnnotationElementValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeclarationPackage getDeclarationPackage();

} //DeclarationFactory
