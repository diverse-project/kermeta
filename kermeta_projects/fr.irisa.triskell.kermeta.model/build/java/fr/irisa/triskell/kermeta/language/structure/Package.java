/**
 * <copyright>
 * </copyright>
 *
 * $Id: Package.java,v 1.6 2008-02-14 07:13:01 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Package#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getPackage()
 * @model annotation="GenModel documentation='/**\n * Package in kermeta. Each kermeta model must have a root package. \n \052/'"
 * @generated
 */
public interface Package extends NamedElement, TypeDefinitionContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Package}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getPackage_NestedPackage()
	 * @see fr.irisa.triskell.kermeta.language.structure.Package#getNestingPackage
	 * @model opposite="nestingPackage" containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * Nested Packages contained by the Package\n \052/'"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Package</em>' container reference.
	 * @see #setNestingPackage(Package)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getPackage_NestingPackage()
	 * @see fr.irisa.triskell.kermeta.language.structure.Package#getNestedPackage
	 * @model opposite="nestedPackage"
	 *        annotation="GenModel documentation='/**\n * Owning Package, if any\n \052/'"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' container reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getPackage_Uri()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * Uri of the Package\n \052/'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // Package