/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedElement.java,v 1.3 2008-09-22 14:47:41 cfaucher Exp $
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getNamedElement()
 * @model annotation="kermeta documentation='Any element that contain a  name (example : Operation, Property) inherit this\nclass.'"
 * @generated
 */
public interface NamedElement extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kermeta.language.structure.StructurePackage#getNamedElement_Name()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 *        annotation="kermeta documentation='Name of this named element'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the qualified name of this named element. Qualified name is \r\n\t * the list of the names of the packages hierarchically ordered, delimited by\r\n\t * a \"::\", followed by the name of this named element.\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tkermeta.language.structure.NamedElement elem = this;\n\n\tresult = this.getName();\n\n\tjava.lang.Boolean idIfCond_676 = false;\n\tidIfCond_676 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.NamedElement\"));\n\n\tif( idIfCond_676 ) {\n\n\t\n\telem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem);\n\tjava.lang.Boolean idLoopCond_677 = false;\n\twhile( !idLoopCond_677 ) {\n\tidLoopCond_677 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(elem, null);\n\tif ( idLoopCond_677 ) {\n\t} else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(elem.getName(), \"::\"), result);\n\n\tjava.lang.Boolean idIfCond_678 = false;\n\tidIfCond_678 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.NamedElement\"));\n\n\tif( idIfCond_678 ) {\n\n\telem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem);\n}\n else {\n\n\telem = null;\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String qualifiedName();

} // NamedElement
