/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtPackage.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.reference.CtPackageReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtPackage#getPACKAGE_SEPARATOR <em>PACKAGE SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtPackage#getTOP_LEVEL_PACKAGE_NAME <em>TOP LEVEL PACKAGE NAME</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtPackage#getPackages <em>Packages</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtPackage#getTypes <em>Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtPackage#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtPackage#getDeclaringPackage <em>Declaring Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtPackage()
 * @model
 * @generated
 */
public interface CtPackage extends CtNamedElement, spoon.reflect.declaration.CtPackage {
	/**
	 * Returns the value of the '<em><b>PACKAGE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PACKAGE SEPARATOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PACKAGE SEPARATOR</em>' attribute.
	 * @see #setPACKAGE_SEPARATOR(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtPackage_PACKAGE_SEPARATOR()
	 * @model dataType="emf.spoon.String"
	 *        annotation="SpoonGenerics type='java.lang.String'"
	 * @generated
	 */
	String getPACKAGE_SEPARATOR();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtPackage#getPACKAGE_SEPARATOR <em>PACKAGE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PACKAGE SEPARATOR</em>' attribute.
	 * @see #getPACKAGE_SEPARATOR()
	 * @generated
	 */
	void setPACKAGE_SEPARATOR(String value);

	/**
	 * Returns the value of the '<em><b>TOP LEVEL PACKAGE NAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOP LEVEL PACKAGE NAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOP LEVEL PACKAGE NAME</em>' attribute.
	 * @see #setTOP_LEVEL_PACKAGE_NAME(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtPackage_TOP_LEVEL_PACKAGE_NAME()
	 * @model dataType="emf.spoon.String"
	 *        annotation="SpoonGenerics type='java.lang.String'"
	 * @generated
	 */
	String getTOP_LEVEL_PACKAGE_NAME();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtPackage#getTOP_LEVEL_PACKAGE_NAME <em>TOP LEVEL PACKAGE NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOP LEVEL PACKAGE NAME</em>' attribute.
	 * @see #getTOP_LEVEL_PACKAGE_NAME()
	 * @generated
	 */
	void setTOP_LEVEL_PACKAGE_NAME(String value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtPackage}.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtPackage#getDeclaringPackage <em>Declaring Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtPackage_Packages()
	 * @see emf.spoon.reflect.declaration.CtPackage#getDeclaringPackage
	 * @model type="emf.spoon.reflect.declaration.CtPackage" opposite="DeclaringPackage"
	 * @generated
	 */
	EmfSet getPackages();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtSimpleType}.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtSimpleType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtPackage_Types()
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getPackage
	 * @model type="emf.spoon.reflect.declaration.CtSimpleType" opposite="Package"
	 * @generated
	 */
	EmfSet getTypes();

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtPackage_QualifiedName()
	 * @model dataType="emf.spoon.String" changeable="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Declaring Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Package</em>' reference.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtPackage_DeclaringPackage()
	 * @see emf.spoon.reflect.declaration.CtPackage#getPackages
	 * @model opposite="Packages" changeable="false"
	 * @generated
	 */
	CtPackage getDeclaringPackage();
	
    /*
     * (non-Javadoc)
     * 
     * @see spoon.reflect.declaration.CtNamedElement#getReference()
     */
    CtPackageReference getReference();

} // CtPackage