/**
 * <copyright>
 * </copyright>
 *
 * $Id: Enumeration.java,v 1.4 2008-10-08 14:37:43 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EEnum;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getEnumeration()
 * @model annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='Definition for Enumeration'"
 * @generated
 */
public interface Enumeration extends Traceability<EEnum>, DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getEnumeration_OwnedLiteral()
	 * @see kermeta.language.structure.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Owned items in an Enumeration'"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Implements kermeta::language::structure::Type.clone(Object)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( \"NOT IMPLEMENTED\" );\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(this.qualifiedName(), \"::\", \".\");\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EEnum ecoreEnumeration = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(ecoreEnumeration);\n\n\tthis.setEcoreModelElement(ecoreEnumeration);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft122 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_362 = false;\n\twhile( !idLoopCond_362 ) {\n\tidLoopCond_362 = it_ft122.isOff();\n\tif ( idLoopCond_362 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp122 = it_ft122.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag l_lbdExp121 = o_lbdExp122;\n\n\tl_lbdExp121.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.EnumerationLiteral> it_ft123 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.EnumerationLiteral>convertAsOrderedSet(this.getOwnedLiteral()).iterator();\n\tjava.lang.Boolean idLoopCond_363 = false;\n\twhile( !idLoopCond_363 ) {\n\tidLoopCond_363 = it_ft123.isOff();\n\tif ( idLoopCond_363 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.EnumerationLiteral l_lbdExp123 = it_ft123.next();\n\n\t//BIle:func\nkermeta.language.structure.EnumerationLiteral l_lbdExp121 = l_lbdExp123;\n\n\tl_lbdExp121.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EEnum result = null;\n\n\tecore.EEnum ecoreEnumeration = ((ecore.EEnum) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EEnum\"));\n\n\tecoreEnumeration.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\tresult = ecoreEnumeration;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnum createEcoreModelElement(KM2EcoreContext context);

} // Enumeration
