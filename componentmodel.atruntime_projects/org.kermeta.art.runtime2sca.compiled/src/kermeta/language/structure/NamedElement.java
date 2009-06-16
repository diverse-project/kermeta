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
 * @model abstract="true"
 *        annotation="kermeta documentation='Any element that contain a  name (example : Operation, Property) inherit this\nclass.'"
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
	 *        annotation="kermeta documentation='/**\n\t * Returns the qualified name of this named element. Qualified name is \n\t * the list of the names of the packages hierarchically ordered, delimited by\n\t * a \"::\", followed by the name of this named element.\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tkermeta.language.structure.NamedElement elem = this;\n\n\tresult = this.getName();\n\n\tjava.lang.Boolean idIfCond_246 = false;\n\tidIfCond_246 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(elem), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.NamedElement\"));\n\n\tif( idIfCond_246 ) {\n\n\t\n\telem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(elem), \"kermeta.language.structure.NamedElement\");\n\tjava.lang.Boolean idLoopCond_247 = false;\n\twhile( !idLoopCond_247 ) {\n\tidLoopCond_247 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(elem, null);\n\tif ( idLoopCond_247 ) {\n\t} else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(elem.getName(), \"::\"), result);\n\n\tjava.lang.Boolean idIfCond_248 = false;\n\tidIfCond_248 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(elem), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.NamedElement\"));\n\n\tif( idIfCond_248 ) {\n\n\telem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(elem), \"kermeta.language.structure.NamedElement\");\n}\n else {\n\n\telem = null;\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String qualifiedName();

} // NamedElement
