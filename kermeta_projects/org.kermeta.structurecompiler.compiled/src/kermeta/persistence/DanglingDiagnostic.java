/**
 * <copyright>
 * </copyright>
 *
 * $Id: DanglingDiagnostic.java,v 1.4 2008-10-08 14:37:53 cfaucher Exp $
 */
package kermeta.persistence;

import kermeta.language.structure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dangling Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.persistence.DanglingDiagnostic#getReferencingElement <em>Referencing Element</em>}</li>
 *   <li>{@link kermeta.persistence.DanglingDiagnostic#getDanglingElement <em>Dangling Element</em>}</li>
 *   <li>{@link kermeta.persistence.DanglingDiagnostic#getReferencingProperty <em>Referencing Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getDanglingDiagnostic()
 * @model annotation="kermeta documentation='/**\r\n * class used to gather the information required to make a user friendly report about a dangling element\r\n * (see. findDanglingModelElements())\r\n \052/'"
 * @generated
 */
public interface DanglingDiagnostic extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Referencing Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Element</em>' reference.
	 * @see #setReferencingElement(kermeta.language.structure.Object)
	 * @see kermeta.persistence.PersistencePackage#getDanglingDiagnostic_ReferencingElement()
	 * @model annotation="kermeta documentation='/**\r\n\t * Element that has a reference to the dangling element  \r\n\t \052/'"
	 * @generated
	 */
	kermeta.language.structure.Object getReferencingElement();

	/**
	 * Sets the value of the '{@link kermeta.persistence.DanglingDiagnostic#getReferencingElement <em>Referencing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencing Element</em>' reference.
	 * @see #getReferencingElement()
	 * @generated
	 */
	void setReferencingElement(kermeta.language.structure.Object value);

	/**
	 * Returns the value of the '<em><b>Dangling Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dangling Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dangling Element</em>' reference.
	 * @see #setDanglingElement(kermeta.language.structure.Object)
	 * @see kermeta.persistence.PersistencePackage#getDanglingDiagnostic_DanglingElement()
	 * @model annotation="kermeta documentation='/**\r\n\t * Element that is not contained by a resource in the repository  \r\n\t \052/'"
	 * @generated
	 */
	kermeta.language.structure.Object getDanglingElement();

	/**
	 * Sets the value of the '{@link kermeta.persistence.DanglingDiagnostic#getDanglingElement <em>Dangling Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dangling Element</em>' reference.
	 * @see #getDanglingElement()
	 * @generated
	 */
	void setDanglingElement(kermeta.language.structure.Object value);

	/**
	 * Returns the value of the '<em><b>Referencing Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Property</em>' reference.
	 * @see #setReferencingProperty(Property)
	 * @see kermeta.persistence.PersistencePackage#getDanglingDiagnostic_ReferencingProperty()
	 * @model annotation="kermeta documentation='/**\r\n\t * Property used to reference the dangling element  \r\n\t \052/'"
	 * @generated
	 */
	Property getReferencingProperty();

	/**
	 * Sets the value of the '{@link kermeta.persistence.DanglingDiagnostic#getReferencingProperty <em>Referencing Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencing Property</em>' reference.
	 * @see #getReferencingProperty()
	 * @generated
	 */
	void setReferencingProperty(Property value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * user friendly message build with those informations\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this.getDanglingElement()), \" referenced by \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this.getReferencingElement())), \".\"), this.getReferencingProperty().getName()), \" is dangling\");\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // DanglingDiagnostic
