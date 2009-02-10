/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Object.java,v 1.11 2009-02-10 17:51:52 cfaucher Exp $
 */
package kermeta.language.structure;

import kermeta.persistence.Resource;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import traceability.File;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Object#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getFile <em>File</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getFileName <em>File Name</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOid <em>Oid</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getInternalContainingResource <em>Internal Containing Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getObject()
 * @model annotation="kermeta documentation='/**\r\n *\r\n * TraceSource aspect keeps track of source information like the file name \r\n * and the line number where objects are declared. This is used for Java generation.\r\n * At runtime this information can be used for debug purpose or stack printing. \r\n *\r\n \052/'"
 *        annotation="kermeta documentation='Object definition: all entities of Kermeta metamodel explicitly inherit from Object'"
 *        annotation="kermeta EMF_needProperty='name=oid javaClass=java.lang.Integer'"
 *        annotation="kermeta EMF_needProperty='name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource'"
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Tag}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Tag#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getObject_Tag()
	 * @see kermeta.language.structure.Tag#getObject
	 * @model opposite="object"
	 *        annotation="kermeta documentation='An Object can be tagged by a Tag. \nThey are typically used to put comments/documentation on the object'"
	 * @generated
	 */
	EList<Tag> getTag();

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see kermeta.language.structure.StructurePackage#getObject_File()
	 * @model annotation="kermeta documentation='/** The calculated kmt file \052/'"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see kermeta.language.structure.StructurePackage#getObject_FileName()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** The kmt file that declares the object. \052/'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(Integer)
	 * @see kermeta.language.structure.StructurePackage#getObject_LineNumber()
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/** The line number where the object is declared in the source file. \052/'"
	 * @generated
	 */
	Integer getLineNumber();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Owned Tags</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tags</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getObject_OwnedTags()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='An object can contains a Tag.  \nBe careful, owning a tag doesn\'t means that the tag applies to the Object\nTo know which Tags apply to the object use the \"tag\" reference'"
	 * @generated
	 */
	EList<Tag> getOwnedTags();

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(Integer)
	 * @see kermeta.language.structure.StructurePackage#getObject_Oid()
	 * @model dataType="kermeta.language.structure.KermetaProperty_Object_oid"
	 * @generated
	 */
	Integer getOid();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(Integer value);

	/**
	 * Returns the value of the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Containing Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Containing Resource</em>' reference.
	 * @see #setInternalContainingResource(Resource)
	 * @see kermeta.language.structure.StructurePackage#getObject_InternalContainingResource()
	 * @model
	 * @generated
	 */
	Resource getInternalContainingResource();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getInternalContainingResource <em>Internal Containing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Containing Resource</em>' reference.
	 * @see #getInternalContainingResource()
	 * @generated
	 */
	void setInternalContainingResource(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** Super method \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" str_tagDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_583 = false;\n\tidIfCond_583 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getUniqueTagValue(str_tag), \"\");\n\n\tif( idIfCond_583 ) {\n\n\tjava.lang.Boolean idIfCond_584 = false;\n\tidIfCond_584 = kermeta.standard.helper.StringWrapper.equals(this.getUniqueTagValue(str_tag), \"true\");\n\n\tif( idIfCond_584 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean interpretBooleanTag(String str_tag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = null;\n\n\tkermeta.language.structure.Object obj = this;\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_585 = false;\n\twhile( !idLoopCond_585 ) {\n\tidLoopCond_585 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.equals(i, 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(obj, stop_type));\n\tif ( idLoopCond_585 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_586 = false;\n\tidIfCond_586 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_586 ) {\n\n\tjava.lang.Boolean idIfCond_587 = false;\n\tidIfCond_587 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), type);\n\n\tif( idIfCond_587 ) {\n\n\ti = 1;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n else {\n\n\tobj = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n\n}\n else {\n\n\ti = 1;\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object getContainerAsTypeIn(Type type, Type stop_type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this), cl);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isKindOf(kermeta.language.structure.Class cl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the Class object that is the metaclass of current Object\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tresult = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass( this ), \"kermeta.language.structure.Class\");\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getMetaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_588 = false;\n\tidIfCond_588 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element, property.getType());\n\n\tif( idIfCond_588 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, element);\n}\n else {\n\n\tkermeta.language.structure.EnumerationLiteral v = null;\n\n\tv = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.language.structure.EnumerationLiteral\");\n\n\tjava.lang.Boolean idIfCond_589 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft120 = null;\n\n\tjava.lang.Boolean idIfCond_590 = false;\n\tidIfCond_590 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(v, null);\n\n\tif( idIfCond_590 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object e_lbdExp120 = null;\n\n\tresult_ft120 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(property.getType(), v.getEnumeration());\n//EIle:right\n\n}\n else {\n\n\tresult_ft120 = false;\n}\n\n\n//CEC\nidIfCond_589 = result_ft120;\n//EIft:andThen\n\n\n\tif( idIfCond_589 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, v);\n}\n else {\n\n\tkermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIncompatibleTypeError()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"IncompatibleTypeError : Cannot set property \", property.getName()), \" of object \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)), \" to \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(element)), \".\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void set(Property property, Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft122 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_591 = false;\n\twhile( !idLoopCond_591 ) {\n\tidLoopCond_591 = it_ft122.isOff();\n\tif ( idLoopCond_591 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp122 = it_ft122.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp121 = o_lbdExp122;\n\n\tjava.lang.Boolean idIfCond_592 = false;\n\tidIfCond_592 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp121.getDeprecated(), \"\");\n\n\tif( idIfCond_592 ) {\n\n\tp_lbdExp121.applyPass2(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the EDataType_instanceClassName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"ecore.EDataType_instanceClassName\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getEMFEDataTypeInstanceClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model propertyNameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Property result = null;\n\n\tkermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n\n\t//BIft:detect\n\nkermeta.language.structure.Property result_ft123 = null;\n\n\tkermeta.language.structure.Property elem_ft123 = null;\n\n\tresult_ft123 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft123 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDefinition.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_593 = false;\n\twhile( !idLoopCond_593 ) {\n\tidLoopCond_593 = kermeta.standard.helper.BooleanWrapper.or(it_ft123.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft123, null));\n\tif ( idLoopCond_593 ) {\n\t} else {\n\n\telem_ft123 = it_ft123.next();\n\n\tjava.lang.Boolean idIfCond_594 = false;\n//BIle:detector\nkermeta.language.structure.Property p_lbdExp123 = elem_ft123;\n\n\tidIfCond_594 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(p_lbdExp123, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))).getName(), propertyName);\n//EIle:detector\n\n\n\tif( idIfCond_594 ) {\n\n\tresult_ft123 = elem_ft123;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(result_ft123, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\")));\n\nreturn result;\n'"
	 * @generated
	 */
	Property getPropertyValue(String propertyName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Runs checking of invariants defined for the metaclass of the Object\r\n\t * Also check the multiplicity of attributes (except derived and transient attributes)\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_595 = false;\n\tidIfCond_595 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd));\n\n\tif( idIfCond_595 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft124 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_596 = false;\n\twhile( !idLoopCond_596 ) {\n\tidLoopCond_596 = it_ft124.isOff();\n\tif ( idLoopCond_596 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp124 = it_ft124.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft125 = null;\n\n\tjava.lang.Boolean test_ft125 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft125 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(p_lbdExp124.getTag()).iterator();\n\tjava.lang.Boolean idLoopCond_598 = false;\n\twhile( !idLoopCond_598 ) {\n\tidLoopCond_598 = kermeta.standard.helper.BooleanWrapper.or(it_ft125.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft125, false));\n\tif ( idLoopCond_598 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft125 = null;\n//BIle:func\nkermeta.language.structure.Tag t_lbdExp125 = it_ft125.next();\n\n\tresult_lambda_ft125 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp125.getName(), \"ecore.isTransient\");\n//EIle:func\n\n\ttest_ft125 = kermeta.standard.helper.BooleanWrapper.or(test_ft125, result_lambda_ft125);\n}\n\t}\n}\n\n\n\tresult_ft125 = test_ft125;\n//EIft:exists\njava.lang.Boolean idIfCond_597 = false;\n\tidIfCond_597 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft125), kermeta.standard.helper.BooleanWrapper.not(p_lbdExp124.getIsDerived()));\n\n\tif( idIfCond_597 ) {\n\n\tkermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, p_lbdExp124);\n\n\tjava.lang.Boolean idIfCond_599 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft126 = null;\n\n\tjava.lang.Boolean idIfCond_600 = false;\n\tidIfCond_600 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_600 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object f_lbdExp126 = null;\n\n\tresult_ft126 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n//EIle:right\n\n}\n else {\n\n\tresult_ft126 = false;\n}\n\n\n//CEC\nidIfCond_599 = result_ft126;\n//EIft:andThen\n\n\n\tif( idIfCond_599 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tjava.lang.Boolean idIfCond_601 = false;\n\tidIfCond_601 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(p_lbdExp124.getUpper(), org.kermeta.compil.runtime.helper.language.ObjectUtil.convertAsObject(kermeta.standard.helper.IntegerWrapper.uminus(1))), kermeta.standard.helper.IntegerWrapper.isGreater(c.size(), p_lbdExp124.getUpper()));\n\n\tif( idIfCond_601 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp124.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_602 = false;\n\tidIfCond_602 = kermeta.standard.helper.IntegerWrapper.isLower(c.size(), p_lbdExp124.getLower());\n\n\tif( idIfCond_602 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp124.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_603 = false;\n\tidIfCond_603 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.equals(p_lbdExp124.getLower(), 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_603 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp124.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariants(this);\n'"
	 * @generated
	 */
	void checkInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the instanceClassName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"EMF_instanceClassName\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getEMFInstanceClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Object is Void\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the unique Oid of the Object\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getOID(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer oid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="kermeta.standard.OrderedSet<kermeta.standard.JavaString>" keyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the values for the tags having as key: <key : String>\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<java.lang.String> result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> value_list = ((kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_604 = false;\n\twhile( !idLoopCond_604 ) {\n\tidLoopCond_604 = it_ft127.isOff();\n\tif ( idLoopCond_604 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag t_lbdExp127 = it_ft127.next();\n\n\tjava.lang.Boolean idIfCond_605 = false;\n\tidIfCond_605 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(t_lbdExp127.getName()));\n\n\tif( idIfCond_605 ) {\n\n\tjava.lang.Boolean idIfCond_606 = false;\n\tidIfCond_606 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp127.getName(), key);\n\n\tif( idIfCond_606 ) {\n\n\tvalue_list.add(t_lbdExp127.getValue());\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = value_list;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<String> getTagValues(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the current Object conforms to given Type\r\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, type.getClass().getName()), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstanceOf(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the compiledJavaExtern call for replacing the current one\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"compiledJavaExtern\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getCompiledJavaExtern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\r\n\t * and its supertypes\r\n\t * Ignores derived attributes. \r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_607 = false;\n\tidIfCond_607 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this, null);\n\n\tif( idIfCond_607 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariantsSwitcher(this);\n\n\tkermeta.language.structure.ClassDefinition cd = null;\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft128 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_608 = false;\n\twhile( !idLoopCond_608 ) {\n\tidLoopCond_608 = it_ft128.isOff();\n\tif ( idLoopCond_608 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp128 = it_ft128.next();\n\n\tjava.lang.Boolean idIfCond_609 = false;\n\tidIfCond_609 = kermeta.standard.helper.BooleanWrapper.and(prop_lbdExp128.getIsComposite(), kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp128.getIsDerived()));\n\n\tif( idIfCond_609 ) {\n\n\tjava.lang.Boolean idIfCond_610 = false;\n\tidIfCond_610 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp128)));\n\n\tif( idIfCond_610 ) {\n\n\tjava.lang.Boolean idIfCond_611 = false;\n//BIft:exists\n\njava.lang.Boolean result_ft129 = null;\n\n\tjava.lang.Boolean test_ft129 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft129 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp128)).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_612 = false;\n\twhile( !idLoopCond_612 ) {\n\tidLoopCond_612 = kermeta.standard.helper.BooleanWrapper.or(it_ft129.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft129, false));\n\tif ( idLoopCond_612 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft129 = null;\n//BIle:func\nkermeta.language.structure.Type t_lbdExp129 = it_ft129.next();\n\n\tjava.lang.Boolean idIfCond_613 = false;\n\tidIfCond_613 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp129, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_613 ) {\n\n\tresult_lambda_ft129 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp129, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), \"kermeta::standard::Collection\");\n}\n else {\n\n\tresult_lambda_ft129 = false;\n}\n\n//EIle:func\n\n\ttest_ft129 = kermeta.standard.helper.BooleanWrapper.or(test_ft129, result_lambda_ft129);\n}\n\t}\n}\n\n\n\tresult_ft129 = test_ft129;\n\n//CEC\nidIfCond_611 = result_ft129;\n//EIft:exists\n\n\n\tif( idIfCond_611 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;\n\n\tsubObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp128), \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft130 = subObjInstances.iterator();\n\tjava.lang.Boolean idLoopCond_614 = false;\n\twhile( !idLoopCond_614 ) {\n\tidLoopCond_614 = it_ft130.isOff();\n\tif ( idLoopCond_614 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object aSubObjInstances_lbdExp130 = it_ft130.next();\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp130);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp128));\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void checkAllInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the Wrapprings of ValueType\'s SelfExpression for tackle the  eplacing the current one\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"WrapperValueTypeSelfExpression\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getWrapperValueTypeSelfExpression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft132 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_615 = false;\n\twhile( !idLoopCond_615 ) {\n\tidLoopCond_615 = it_ft132.isOff();\n\tif ( idLoopCond_615 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp132 = it_ft132.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp131 = o_lbdExp132;\n\n\tp_lbdExp131.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="kermeta.standard.OrderedSet<kermeta.standard.JavaString>"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the EMF_needProperty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<java.lang.String> result = null;\n\n\tresult = this.getTagValues(\"EMF_needProperty\");\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<String> getEMFNeedProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the deprecated tag\r\n\t * Specific method for detecting the deprecated model elements\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"deprecated\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getDeprecated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeAssigned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * True if the <code>~property</code> of the object has been set\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isSet(this, property), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSet(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Returns the instances of the given property for this Object.\r\n\t *\r\n\t * Example : \r\n\t * <pre>\r\n\t * class A { reference attr : String }\r\n\t * </pre>\r\n\t * Using A :\r\n\t * <pre>\r\n\t * operation getAProp() is do\r\n\t *    var a : A\r\n\t *    var s : String\r\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\r\n\t *    s ?= a.get(the_attr)\r\n\t * end\r\n\t * </pre>\r\n\t * The user has to cast\r\n\t * the result of this method according to the type and the upper multiplicity\r\n\t * of this property. If upper multiplicity > 1, than the effective type of the \r\n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \r\n\t * the name of the given Property (i.e the type of the property instance).\r\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, property);\n\nreturn result;\n'"
	 * @generated
	 */
	Object get(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the Wrapprings of ValueType\'s ReturnType for tackle the  eplacing the current one\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"WrapperValueTypeReturnType\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getWrapperValueTypeReturnType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void applyPass2BehaviorKmt(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * semantic equality,\r\n\t * if you wish to test for object identity you need to use the method oid\r\n\t * ex: x.oid == y.oid\r\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \r\n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \r\n\t * reference values x and y, this method returns true if and only if x and y refer to the same \r\n\t * object (x.oid == y.oid has the value true). \r\n\t *\r\n\t * note1: the operator == is mapped to this \r\n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, element), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the isTransient\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.interpretBooleanTag(\"ecore.isTransient\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean getEMFIsTransient();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Object is currently in a\r\n\t * frozen state\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isFrozen(this), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFrozen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * code used in hashtable in order to identify an object in the hashtable keys\r\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\r\n\t * for more information about hashcode\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.hashcode(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer hashcode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_616 = false;\n\tidIfCond_616 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_616 ) {\n\n\tjava.lang.Boolean idIfCond_617 = false;\n\tidIfCond_617 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).isCallFeatureAsStaticOperation();\n\n\tif( idIfCond_617 ) {\n\n\tjava.lang.Boolean idIfCond_618 = false;\n\tidIfCond_618 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getStaticOperation().isFunctionType();\n\n\tif( idIfCond_618 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean callsFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.language.structure.Package topPack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(topPack));\n\tjava.lang.Boolean idLoopCond_619 = false;\n\twhile( !idLoopCond_619 ) {\n\tidLoopCond_619 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(topPack);\n\tif ( idLoopCond_619 ) {\n\t} else {\n\n\tresult = topPack;\n\n\ttopPack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(topPack.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")), \"kermeta.language.structure.Package\");\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Package getRootPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" keyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the values for the tags having as key: <key : String>\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tkermeta.standard.OrderedSet<java.lang.String> value_list = this.getTagValues(key);\n\n\tjava.lang.Boolean idIfCond_620 = false;\n\tidIfCond_620 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(value_list)), kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(value_list.size(), 1));\n\n\tif( idIfCond_620 ) {\n\n\tresult = value_list.first();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getUniqueTagValue(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the the final Java Class Qualified Name\r\n\t * Used for the POJO creation\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"finalJavaClassQN\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getFinalJavaClassQN();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = null;\n\n\tkermeta.language.structure.Object obj = this;\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_621 = false;\n\twhile( !idLoopCond_621 ) {\n\tidLoopCond_621 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);\n\tif ( idLoopCond_621 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_622 = false;\n\tidIfCond_622 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_622 ) {\n\n\tjava.lang.Boolean idIfCond_623 = false;\n\tidIfCond_623 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), type);\n\n\tif( idIfCond_623 ) {\n\n\ti = 1;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n else {\n\n\tobj = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n\n}\n else {\n\n\ti = 1;\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object getContainerAsType(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the EDataType_isSerializable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.interpretBooleanTag(\"ecore.EDataType_isSerializable\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean getEMFEDataTypeIsSerializable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * See kermeta::language::structure::Object.equals(Object)\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this, element));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNotEqual(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Freeze the Object\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);\n'"
	 * @generated
	 */
	void freeze();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Remove the element set as the <code>~property</code> of the object.\r\n\t * The <code>isSet(~property)</code> method will then return False\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this, property);\n'"
	 * @generated
	 */
	void unset(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the Object that contains current Object, void if the Object has\r\n\t * no container\r\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Object container();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the Resource currently containing (directly or indirectly) the Object \r\n\t * or void if the object belongs to no Resource\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\tresult = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getContainingResource(this), \"kermeta.persistence.Resource\");\n\nreturn result;\n'"
	 * @generated
	 */
	Resource containingResource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\r\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta WrapperValueTypeSelfExpression='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_624 = false;\n\tidIfCond_624 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, type);\n\n\tif( idIfCond_624 ) {\n\n\tresult = this;\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getTypeCastError())) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object asType(kermeta.language.structure.Class type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n \t * Implements Object.toString()\r\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\r\n \t * the object type, and oid the unique ID of the object\r\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"[\", org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition().qualifiedName()), \":\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(this))), \"]\");\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // Object
