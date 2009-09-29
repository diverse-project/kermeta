/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getType()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Alias to kermeta::standard::Integer'"
 *        annotation="kermeta documentation='Base class definition for the <b>use</b> of a type.'"
 * @generated
 */
public interface Type extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Type Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Container</em>' container reference.
	 * @see #setTypeContainer(TypeContainer)
	 * @see kermeta.language.structure.StructurePackage#getType_TypeContainer()
	 * @see kermeta.language.structure.TypeContainer#getContainedType
	 * @model opposite="containedType" transient="false"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Owning TypeContainer, if any'"
	 * @generated
	 */
	TypeContainer getTypeContainer();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Container</em>' container reference.
	 * @see #getTypeContainer()
	 * @generated
	 */
	void setTypeContainer(TypeContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a copy of passed Object built by recursively copying attribute\n\t * properties, and referencing original reference properties values\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.language.structure.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a copy of passed Object built by recursively copying values of\n\t * all properties, no matter the property kind\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.language.structure.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n \t * Implements Type.isSuperTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.TypeUtil.hasSubType(this, object), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSuperTypeOf(Type object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Implements Type.isInstance(Object)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element, this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstance(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n \t * Implements Type.isSubTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.TypeUtil.isSuperTypeOfSwitcher(object, this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(Type object);

} // Type
