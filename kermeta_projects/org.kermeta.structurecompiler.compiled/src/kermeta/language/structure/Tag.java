/**
 * <copyright>
 * </copyright>
 *
 * $Id: Tag.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EAnnotation;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Tag#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.Tag#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.structure.Tag#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTag()
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
 *        annotation="kermeta documentation='Tag is intended to be used to add documentation on a  model element,\nor add some textual information that cannot be expressed with any\nmodel element definition.'"
 * @generated
 */
public interface Tag extends Traceability<EAnnotation> {
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
	 * @see kermeta.language.structure.StructurePackage#getTag_Name()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='Name of the Tag'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see kermeta.language.structure.StructurePackage#getTag_Value()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='String value of the Tag'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Object}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Object#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getTag_Object()
	 * @see kermeta.language.structure.Object#getTag
	 * @model opposite="tag" required="true"
	 *        annotation="kermeta documentation='Objects to which the Tag is attached to'"
	 * @generated
	 */
	EList<kermeta.language.structure.Object> getObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Object c = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\n\tjava.lang.Boolean idIfCond_215 = false;\n\tidIfCond_215 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"));\n\n\tif( idIfCond_215 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"))).getEntryPoints()).add(ecoreAnnotation);\n}\n else {\n\n\tkermeta.language.structure.Property p = c.getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_216 = false;\n\tidIfCond_216 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(p));\n\n\tif( idIfCond_216 ) {\n\n\tecore.EModelElement ecoreModelElement_retrieved = ((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(c, p), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\")));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreModelElement_retrieved.getEAnnotations()).add(ecoreAnnotation);\n}\n\n}\n\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).getKermetaEAnnotation(this);\n\n\tjava.lang.Boolean idIfCond_217 = false;\n\tidIfCond_217 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getName());\n\n\tif( idIfCond_217 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).addEntry(ecoreAnnotation, kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"documentation\").getName()), this.getValue());\n}\n else {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).addEntry(ecoreAnnotation, this.getName(), this.getValue());\n}\n\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

} // Tag
