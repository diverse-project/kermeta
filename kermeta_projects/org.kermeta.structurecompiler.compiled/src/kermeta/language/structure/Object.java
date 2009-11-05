/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

import kermeta.exceptions.ConstraintsDiagnostic;

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
 *   <li>{@link kermeta.language.structure.Object#getFile <em>File</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getFileName <em>File Name</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOid <em>Oid</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getInternalContainingResource <em>Internal Containing Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getObject()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Object definition: all entities of Kermeta metamodel explicitly inherit from Object'"
 *        annotation="kermeta EMF_needProperty='name=oid javaClass=java.lang.Integer'"
 *        annotation="kermeta EMF_needProperty='name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource'"
 *        annotation="kermeta documentation='/**\r\n *\r\n * TraceSource aspect keeps track of source information like the file name \r\n * and the line number where objects are declared. This is used for Java generation.\r\n * At runtime this information can be used for debug purpose or stack printing. \r\n *\r\n \052/'"
 * @generated
 */
public interface Object extends EObject {
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
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='An Object can be tagged by a Tag. \nThey are typically used to put comments/documentation on the object'"
	 * @generated
	 */
	EList<Tag> getTag();

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
	 *        annotation="kermeta ecore='true'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = null;\n\n\tkermeta.language.structure.Object obj = this;\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_341 = false;\n\twhile( !idLoopCond_341 ) {\n\tidLoopCond_341 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.equals(i, 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(obj, stop_type));\n\tif ( idLoopCond_341 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_342 = false;\n\tidIfCond_342 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_342 ) {\n\n\tjava.lang.Boolean idIfCond_343 = false;\n\tidIfCond_343 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), type);\n\n\tif( idIfCond_343 ) {\n\n\ti = 1;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n else {\n\n\tobj = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n\n}\n else {\n\n\ti = 1;\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object getContainerAsTypeIn(Type type, Type stop_type);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_344 = false;\n\twhile( !idLoopCond_344 ) {\n\tidLoopCond_344 = it_ft53.isOff();\n\tif ( idLoopCond_344 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp53 = it_ft53.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp52 = o_lbdExp53;\n\n\tjava.lang.Boolean idIfCond_345 = false;\n\tidIfCond_345 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp52.getDeprecated(), \"\");\n\n\tif( idIfCond_345 ) {\n\n\tp_lbdExp52.applyPass2(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the instanceClassName\r\n\t * \r\n\t * This is used to convert ValueTypes in EDataType and so fill the instanceClassName attribute\r\n\t *\r\n\t * The value of the tag must be a Java Class Qualified Name, eg: java.lang.String\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"EMF_instanceClassName\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getEMFInstanceClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="kermeta.standard.OrderedSet<kermeta.standard.JavaString>" keyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the values for the tags having as key: <key : String>\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<java.lang.String> result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> value_list = ((kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_346 = false;\n\twhile( !idLoopCond_346 ) {\n\tidLoopCond_346 = it_ft54.isOff();\n\tif ( idLoopCond_346 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag t_lbdExp54 = it_ft54.next();\n\n\tjava.lang.Boolean idIfCond_347 = false;\n\tidIfCond_347 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(t_lbdExp54.getName()));\n\n\tif( idIfCond_347 ) {\n\n\tjava.lang.Boolean idIfCond_348 = false;\n\tidIfCond_348 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp54.getName(), key);\n\n\tif( idIfCond_348 ) {\n\n\tvalue_list.add(t_lbdExp54.getValue());\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = value_list;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<String> getTagValues(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\n\t * and its supertypes\n\t * Ignores derived attributes. \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_349 = false;\n\tidIfCond_349 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this, null);\n\n\tif( idIfCond_349 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariantsSwitcher(this);\n\n\tkermeta.language.structure.ClassDefinition cd = null;\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_350 = false;\n\twhile( !idLoopCond_350 ) {\n\tidLoopCond_350 = it_ft55.isOff();\n\tif ( idLoopCond_350 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp55 = it_ft55.next();\n\n\tjava.lang.Boolean idIfCond_351 = false;\n\tidIfCond_351 = kermeta.standard.helper.BooleanWrapper.and(prop_lbdExp55.getIsComposite(), kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp55.getIsDerived()));\n\n\tif( idIfCond_351 ) {\n\n\tjava.lang.Boolean idIfCond_352 = false;\n\tidIfCond_352 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp55)));\n\n\tif( idIfCond_352 ) {\n\n\tjava.lang.Boolean idIfCond_353 = false;\n//BIft:exists\n\njava.lang.Boolean result_ft56 = null;\n\n\tjava.lang.Boolean test_ft56 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft56 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp55)).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_354 = false;\n\twhile( !idLoopCond_354 ) {\n\tidLoopCond_354 = kermeta.standard.helper.BooleanWrapper.or(it_ft56.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft56, false));\n\tif ( idLoopCond_354 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft56 = null;\n//BIle:func\nkermeta.language.structure.Type t_lbdExp56 = it_ft56.next();\n\n\tjava.lang.Boolean idIfCond_355 = false;\n\tidIfCond_355 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp56, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_355 ) {\n\n\tresult_lambda_ft56 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp56, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), \"kermeta::standard::Collection\");\n}\n else {\n\n\tresult_lambda_ft56 = false;\n}\n\n//EIle:func\n\n\ttest_ft56 = kermeta.standard.helper.BooleanWrapper.or(test_ft56, result_lambda_ft56);\n}\n\t}\n}\n\n\n\tresult_ft56 = test_ft56;\n\n//CEC\nidIfCond_353 = result_ft56;\n//EIft:exists\n\n\n\tif( idIfCond_353 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;\n\n\tsubObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp55), \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft57 = subObjInstances.iterator();\n\tjava.lang.Boolean idLoopCond_356 = false;\n\twhile( !idLoopCond_356 ) {\n\tidLoopCond_356 = it_ft57.isOff();\n\tif ( idLoopCond_356 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object aSubObjInstances_lbdExp57 = it_ft57.next();\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp57);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp55));\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void checkAllInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the Wrapprings of ValueType\'s SelfExpression for tackle the  eplacing the current one\r\n\t * \r\n\t * For ValueType Wrapper methods, if needed that is able to precise the type of self expression\r\n\t * the self expression is added by default in the Wrapper method signature\r\n\t *\r\n\t * Value is like this: java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object\r\n\t * A binding must be defined for each ValueType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"WrapperValueTypeSelfExpression\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getWrapperValueTypeSelfExpression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_357 = false;\n\twhile( !idLoopCond_357 ) {\n\tidLoopCond_357 = it_ft59.isOff();\n\tif ( idLoopCond_357 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp59 = it_ft59.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp58 = o_lbdExp59;\n\n\tp_lbdExp58.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="kermeta.standard.OrderedSet<kermeta.standard.JavaString>"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the EMF_needProperty\r\n\t *\r\n\t * Better solution than creating aspects because end-user should not have knowledge of that through reflexivity\r\n\t * Properties are then created in the Ecore file only\r\n\t *\r\n\t * This tag is complex, i.e.: with 2 values: name and javaClass/classDefinitionQN\r\n\t * - javaClass is used when the expected type is a Java CLass\r\n\t * - classDefinitionQN is used when the expected type is a ClassDefinition\r\n\t *\r\n\t * Example with javaClass: the Collection class definition needs a new reference for representing a Java Native collection\r\n\t * the tag is like: @EMF_needProperty \"name=values javaClass=org.eclipse.emf.common.util.EList\"\r\n\t * \r\n\t * Example with classDefinitionQN: the Object class definition needs at runtime a reference for storing the internalContainingResource\r\n\t * the tag is like: @EMF_needProperty \"name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource\"\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<java.lang.String> result = null;\n\n\tresult = this.getTagValues(\"EMF_needProperty\");\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<String> getEMFNeedProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the deprecated tag\r\n\t * Specific method for detecting the deprecated model elements\r\n\t * \r\n\t * Not really used in the rest of the impl.\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"deprecated\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getDeprecated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * True if the <code>~property</code> of the object has been set\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isSet(this, property), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSet(Property property);

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
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the Wrapprings of ValueType\'s ReturnType for tackle the  eplacing the current one\r\n\t * \r\n\t * For ValueType Wrapper methods, if needed that is able to precise the return type\r\n\t *\r\n\t * Value is like this: java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object\r\n\t * A binding must be defined for each ValueType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"WrapperValueTypeReturnType\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getWrapperValueTypeReturnType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Returns the instances of the given property for this Object.\n\t *\n\t * Example : \n\t * <pre>\n\t * class A { reference attr : String }\n\t * </pre>\n\t * Using A :\n\t * <pre>\n\t * operation getAProp() is do\n\t *    var a : A\n\t *    var s : String\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\n\t *    s ?= a.get(the_attr)\n\t * end\n\t * </pre>\n\t * The user has to cast\n\t * the result of this method according to the type and the upper multiplicity\n\t * of this property. If upper multiplicity > 1, than the effective type of the \n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \n\t * the name of the given Property (i.e the type of the property instance).\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, property);\n\nreturn result;\n'"
	 * @generated
	 */
	Object get(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * semantic equality,\n\t * if you wish to test for object identity you need to use the method oid\n\t * ex: x.oid == y.oid\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \n\t * reference values x and y, this method returns true if and only if x and y refer to the same \n\t * object (x.oid == y.oid has the value true). \n\t *\n\t * note1: the operator == is mapped to this \n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, element), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the isTransient\r\n\t *\r\n\t * Value is true or false\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.interpretBooleanTag(\"ecore.isTransient\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean getEMFIsTransient();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\n\t * Checks all the invariants for this object and return a complete diagnostic.\n\t * This also includes the structural constraints associated to the properties.\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.exceptions.ConstraintsDiagnostic result = null;\n\n\tkermeta.exceptions.ConstraintsDiagnostic contraintes = ((kermeta.exceptions.ConstraintsDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintsDiagnostic())).initialize();\n\n\tkermeta.language.structure.ClassDefinition cd = null;\n\n\tcd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_358 = false;\n\tidIfCond_358 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd));\n\n\tif( idIfCond_358 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_359 = false;\n\twhile( !idLoopCond_359 ) {\n\tidLoopCond_359 = it_ft60.isOff();\n\tif ( idLoopCond_359 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp60 = it_ft60.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft61 = null;\n\n\tjava.lang.Boolean test_ft61 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(prop_lbdExp60.getTag()).iterator();\n\tjava.lang.Boolean idLoopCond_361 = false;\n\twhile( !idLoopCond_361 ) {\n\tidLoopCond_361 = kermeta.standard.helper.BooleanWrapper.or(it_ft61.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft61, false));\n\tif ( idLoopCond_361 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft61 = null;\n//BIle:func\nkermeta.language.structure.Tag t_lbdExp61 = it_ft61.next();\n\n\tresult_lambda_ft61 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp61.getName(), \"ecore.isTransient\");\n//EIle:func\n\n\ttest_ft61 = kermeta.standard.helper.BooleanWrapper.or(test_ft61, result_lambda_ft61);\n}\n\t}\n}\n\n\n\tresult_ft61 = test_ft61;\n//EIft:exists\njava.lang.Boolean idIfCond_360 = false;\n\tidIfCond_360 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft61), kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp60.getIsDerived()));\n\n\tif( idIfCond_360 ) {\n\n\tkermeta.language.structure.PropertyConstraint constraint = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getPropertyConstraint()));\n\n\tconstraint.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(cd.getName(), \"_\"), prop_lbdExp60.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop_lbdExp60.getType())));\n\n\tconstraint.setProperty(prop_lbdExp60);\n\n\t{\ntry {\n\tthis.checkInvariant(constraint);\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_1 ) {\nboolean caught_1 = false;\nif( ex_switcher_1.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv ) {\ncaught_1 = true;\nkermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_1.getRealException();\ncontraintes.add(e);\n}\nif( !caught_1 ) { throw ex_switcher_1; }\n\n}\n}\n\n\tjava.lang.Boolean idIfCond_362 = false;\n\tidIfCond_362 = prop_lbdExp60.getIsComposite();\n\n\tif( idIfCond_362 ) {\n\n\tjava.lang.Boolean idIfCond_363 = false;\n\tidIfCond_363 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp60)));\n\n\tif( idIfCond_363 ) {\n\n\tjava.lang.Boolean idIfCond_364 = false;\n//BIft:exists\n\njava.lang.Boolean result_ft62 = null;\n\n\tjava.lang.Boolean test_ft62 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft62 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp60)).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_365 = false;\n\twhile( !idLoopCond_365 ) {\n\tidLoopCond_365 = kermeta.standard.helper.BooleanWrapper.or(it_ft62.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft62, false));\n\tif ( idLoopCond_365 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft62 = null;\n//BIle:func\nkermeta.language.structure.Type t_lbdExp62 = it_ft62.next();\n\n\tjava.lang.Boolean idIfCond_366 = false;\n\tidIfCond_366 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp62, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_366 ) {\n\n\tresult_lambda_ft62 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp62, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), \"kermeta::standard::Collection\");\n}\n else {\n\n\tresult_lambda_ft62 = false;\n}\n\n//EIle:func\n\n\ttest_ft62 = kermeta.standard.helper.BooleanWrapper.or(test_ft62, result_lambda_ft62);\n}\n\t}\n}\n\n\n\tresult_ft62 = test_ft62;\n\n//CEC\nidIfCond_364 = result_ft62;\n//EIft:exists\n\n\n\tif( idIfCond_364 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;\n\n\tsubObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp60), \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft63 = subObjInstances.iterator();\n\tjava.lang.Boolean idLoopCond_367 = false;\n\twhile( !idLoopCond_367 ) {\n\tidLoopCond_367 = it_ft63.isOff();\n\tif ( idLoopCond_367 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object aSubObjInstances_lbdExp63 = it_ft63.next();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft64 = aSubObjInstances_lbdExp63.getViolatedConstraints().getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_368 = false;\n\twhile( !idLoopCond_368 ) {\n\tidLoopCond_368 = it_ft64.isOff();\n\tif ( idLoopCond_368 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.exceptions.ConstraintViolatedInv v_lbdExp64 = it_ft64.next();\n\n\tcontraintes.add(v_lbdExp64);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft65 = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp60).getViolatedConstraints().getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_369 = false;\n\twhile( !idLoopCond_369 ) {\n\tidLoopCond_369 = it_ft65.isOff();\n\tif ( idLoopCond_369 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.exceptions.ConstraintViolatedInv v_lbdExp65 = it_ft65.next();\n\n\tcontraintes.add(v_lbdExp65);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_370 = false;\n\twhile( !idLoopCond_370 ) {\n\tidLoopCond_370 = it_ft66.isOff();\n\tif ( idLoopCond_370 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint invariant_lbdExp66 = it_ft66.next();\ntry {\n\tthis.checkInvariant(invariant_lbdExp66);\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_2 ) {\nboolean caught_2 = false;\nif( ex_switcher_2.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv ) {\ncaught_2 = true;\nkermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_2.getRealException();\ncontraintes.add(e);\n}\nif( !caught_2 ) { throw ex_switcher_2; }\n\n}\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = contraintes;\n\nreturn result;\n'"
	 * @generated
	 */
	ConstraintsDiagnostic getViolatedConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the EDataType_isSerializable\r\n\t *\r\n\t * Value is true or false\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.interpretBooleanTag(\"ecore.EDataType_isSerializable\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean getEMFEDataTypeIsSerializable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns the Object that contains current Object, void if the Object has\n\t * no container\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Object container();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Remove the element set as the <code>~property</code> of the object.\n\t * The <code>isSet(~property)</code> method will then return False\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this, property);\n'"
	 * @generated
	 */
	void unset(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns the Resource currently containing (directly or indirectly) the Object \n\t * or void if the object belongs to no Resource\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\tresult = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getContainingResource(this), \"kermeta.persistence.Resource\");\n\nreturn result;\n'"
	 * @generated
	 */
	Resource containingResource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n \t * Implements Object.toString()\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\n \t * the object type, and oid the unique ID of the object\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"[\", org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition().qualifiedName()), \":\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(this))), \"]\");\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Checks a constraint invariant defined for the metaclass of the Object\n\t * You can use PropertyConstraint for checking structural constraints associated to a property\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_371 = false;\n\tidIfCond_371 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(invariant, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PropertyConstraint\"));\n\n\tif( idIfCond_371 ) {\n\n\tkermeta.language.structure.Property prop = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(invariant, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PropertyConstraint\"))).getProperty();\n\n\tkermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop);\n\n\tjava.lang.Boolean idIfCond_372 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft67 = null;\n\n\tjava.lang.Boolean idIfCond_373 = false;\n\tidIfCond_373 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_373 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object f_lbdExp67 = null;\n\n\tresult_ft67 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n//EIle:right\n\n}\n else {\n\n\tresult_ft67 = false;\n}\n\n\n//CEC\nidIfCond_372 = result_ft67;\n//EIft:andThen\n\n\n\tif( idIfCond_372 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> coll = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tjava.lang.Boolean idIfCond_374 = false;\n\tidIfCond_374 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(prop.getUpper(), org.kermeta.compil.runtime.helper.language.ObjectUtil.convertAsObject(kermeta.standard.helper.IntegerWrapper.uminus(1))), kermeta.standard.helper.IntegerWrapper.isGreater(coll.size(), prop.getUpper()));\n\n\tif( idIfCond_374 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(this);\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Invariant upper bound of \", cd.getName()), \"_\"), prop.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop.getType())), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\te.setFailedConstraint(invariant);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_375 = false;\n\tidIfCond_375 = kermeta.standard.helper.IntegerWrapper.isLower(coll.size(), prop.getLower());\n\n\tif( idIfCond_375 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(this);\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Invariant lower bound of \", cd.getName()), \"_\"), prop.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop.getType())), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\te.setFailedConstraint(invariant);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_376 = false;\n\tidIfCond_376 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.equals(prop.getLower(), 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_376 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(this);\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Invariant lower bound of \", cd.getName()), \"_\"), prop.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop.getType())), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\te.setFailedConstraint(invariant);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n}\n else {\n\n\t{\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariant(this, invariant);\n}\n}\n\n'"
	 * @generated
	 */
	void checkInvariant(Constraint invariant);

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
	 *        annotation="kermeta documentation='/**\r\n\t * Interpret boolean tags, thus retruns true or false the given tag has got a value like: \"true\" or \"false\"\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_377 = false;\n\tidIfCond_377 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getUniqueTagValue(str_tag), \"\");\n\n\tif( idIfCond_377 ) {\n\n\tjava.lang.Boolean idIfCond_378 = false;\n\tidIfCond_378 = kermeta.standard.helper.StringWrapper.equals(this.getUniqueTagValue(str_tag), \"true\");\n\n\tif( idIfCond_378 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean interpretBooleanTag(String str_tag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this), cl);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isKindOf(kermeta.language.structure.Class cl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns the Class object that is the metaclass of current Object\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tresult = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass( this ), \"kermeta.language.structure.Class\");\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getMetaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_379 = false;\n\tidIfCond_379 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element, property.getType());\n\n\tif( idIfCond_379 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, element);\n}\n else {\n\n\tkermeta.language.structure.EnumerationLiteral v = null;\n\n\tv = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.language.structure.EnumerationLiteral\");\n\n\tjava.lang.Boolean idIfCond_380 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft68 = null;\n\n\tjava.lang.Boolean idIfCond_381 = false;\n\tidIfCond_381 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(v, null);\n\n\tif( idIfCond_381 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object e_lbdExp68 = null;\n\n\tresult_ft68 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(property.getType(), v.getEnumeration());\n//EIle:right\n\n}\n else {\n\n\tresult_ft68 = false;\n}\n\n\n//CEC\nidIfCond_380 = result_ft68;\n//EIft:andThen\n\n\n\tif( idIfCond_380 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, v);\n}\n else {\n\n\tkermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIncompatibleTypeError()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"IncompatibleTypeError : Cannot set property \", property.getName()), \" of object \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)), \" to \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(element)), \".\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void set(Property property, Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the EDataType_instanceClassName\r\n\t * \r\n\t * This used to declare if the element is an EDataType in the Ecore model side\r\n\t *\r\n\t * The value of the tag must be a Java Class Qualified Name, eg: java.lang.String\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"ecore.EDataType_instanceClassName\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getEMFEDataTypeInstanceClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model propertyNameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Property result = null;\n\n\tkermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n\n\t//BIft:detect\n\nkermeta.language.structure.Property result_ft69 = null;\n\n\tkermeta.language.structure.Property elem_ft69 = null;\n\n\tresult_ft69 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDefinition.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_382 = false;\n\twhile( !idLoopCond_382 ) {\n\tidLoopCond_382 = kermeta.standard.helper.BooleanWrapper.or(it_ft69.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft69, null));\n\tif ( idLoopCond_382 ) {\n\t} else {\n\n\telem_ft69 = it_ft69.next();\n\n\tjava.lang.Boolean idIfCond_383 = false;\n//BIle:detector\nkermeta.language.structure.Property p_lbdExp69 = elem_ft69;\n\n\tidIfCond_383 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(p_lbdExp69, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))).getName(), propertyName);\n//EIle:detector\n\n\n\tif( idIfCond_383 ) {\n\n\tresult_ft69 = elem_ft69;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(result_ft69, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\")));\n\nreturn result;\n'"
	 * @generated
	 */
	Property getPropertyValue(String propertyName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Runs checking of invariants defined for the metaclass of the Object\n\t * Also check the multiplicity of attributes (except derived and transient attributes)\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_384 = false;\n\tidIfCond_384 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd));\n\n\tif( idIfCond_384 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_385 = false;\n\twhile( !idLoopCond_385 ) {\n\tidLoopCond_385 = it_ft70.isOff();\n\tif ( idLoopCond_385 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp70 = it_ft70.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft71 = null;\n\n\tjava.lang.Boolean test_ft71 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(p_lbdExp70.getTag()).iterator();\n\tjava.lang.Boolean idLoopCond_387 = false;\n\twhile( !idLoopCond_387 ) {\n\tidLoopCond_387 = kermeta.standard.helper.BooleanWrapper.or(it_ft71.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft71, false));\n\tif ( idLoopCond_387 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft71 = null;\n//BIle:func\nkermeta.language.structure.Tag t_lbdExp71 = it_ft71.next();\n\n\tresult_lambda_ft71 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp71.getName(), \"ecore.isTransient\");\n//EIle:func\n\n\ttest_ft71 = kermeta.standard.helper.BooleanWrapper.or(test_ft71, result_lambda_ft71);\n}\n\t}\n}\n\n\n\tresult_ft71 = test_ft71;\n//EIft:exists\njava.lang.Boolean idIfCond_386 = false;\n\tidIfCond_386 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft71), kermeta.standard.helper.BooleanWrapper.not(p_lbdExp70.getIsDerived()));\n\n\tif( idIfCond_386 ) {\n\n\tkermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, p_lbdExp70);\n\n\tjava.lang.Boolean idIfCond_388 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft72 = null;\n\n\tjava.lang.Boolean idIfCond_389 = false;\n\tidIfCond_389 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_389 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object f_lbdExp72 = null;\n\n\tresult_ft72 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n//EIle:right\n\n}\n else {\n\n\tresult_ft72 = false;\n}\n\n\n//CEC\nidIfCond_388 = result_ft72;\n//EIft:andThen\n\n\n\tif( idIfCond_388 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tjava.lang.Boolean idIfCond_390 = false;\n\tidIfCond_390 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(p_lbdExp70.getUpper(), org.kermeta.compil.runtime.helper.language.ObjectUtil.convertAsObject(kermeta.standard.helper.IntegerWrapper.uminus(1))), kermeta.standard.helper.IntegerWrapper.isGreater(c.size(), p_lbdExp70.getUpper()));\n\n\tif( idIfCond_390 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp70.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_391 = false;\n\tidIfCond_391 = kermeta.standard.helper.IntegerWrapper.isLower(c.size(), p_lbdExp70.getLower());\n\n\tif( idIfCond_391 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp70.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_392 = false;\n\tidIfCond_392 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.equals(p_lbdExp70.getLower(), 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_392 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp70.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariants(this);\n'"
	 * @generated
	 */
	void checkInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the defaultConstructor\r\n\t * \r\n\t * For Value Types the default constructor are not in general TheType() like for Integer: Integer(0),\r\n\t * thus we cannot have at priori a predefined way for generating these constructors\r\n\t *\r\n\t * The value of the tag must be a Java Class Qualified Name, eg: java.lang.String\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"EMF_defaultConstructor\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getEMFDefaultConstructor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Object is Void\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns the unique Oid of the Object\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getOID(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer oid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the current Object conforms to given Type\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, type.getClass().getName()), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstanceOf(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the compiledJavaExtern call for replacing the current one\r\n\t * \r\n\t * Represents the static call in compiled mode\r\n\t *\r\n\t * The value of the tag must be like a Java Static Call, eg: org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this, element)\r\n\t * without the \";\" at the end, \";\" is added automatically\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"compiledJavaExtern\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getCompiledJavaExtern();

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
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Object is currently in a\n\t * frozen state\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isFrozen(this), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFrozen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * code used in hashtable in order to identify an object in the hashtable keys\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\n\t * for more information about hashcode\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.hashcode(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer hashcode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_393 = false;\n\tidIfCond_393 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_393 ) {\n\n\tjava.lang.Boolean idIfCond_394 = false;\n\tidIfCond_394 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).isCallFeatureAsStaticOperation();\n\n\tif( idIfCond_394 ) {\n\n\tjava.lang.Boolean idIfCond_395 = false;\n\tidIfCond_395 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getStaticOperation().isFunctionType();\n\n\tif( idIfCond_395 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean callsFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.language.structure.Package topPack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(topPack));\n\tjava.lang.Boolean idLoopCond_396 = false;\n\twhile( !idLoopCond_396 ) {\n\tidLoopCond_396 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(topPack);\n\tif ( idLoopCond_396 ) {\n\t} else {\n\n\tresult = topPack;\n\n\ttopPack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(topPack.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")), \"kermeta.language.structure.Package\");\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Package getRootPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" keyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the values for the tags having as key: <key : String>\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tkermeta.standard.OrderedSet<java.lang.String> value_list = this.getTagValues(key);\n\n\tjava.lang.Boolean idIfCond_397 = false;\n\tidIfCond_397 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(value_list)), kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(value_list.size(), 1));\n\n\tif( idIfCond_397 ) {\n\n\tresult = value_list.first();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getUniqueTagValue(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the the final Java Class Qualified Name\r\n\t *\r\n\t * Used for the POJO creation\r\n\t * \r\n\t * Value is like this: a Java Class Qualified Name\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"finalJavaClassQN\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getFinalJavaClassQN();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = null;\n\n\tkermeta.language.structure.Object obj = this;\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_398 = false;\n\twhile( !idLoopCond_398 ) {\n\tidLoopCond_398 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);\n\tif ( idLoopCond_398 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_399 = false;\n\tidIfCond_399 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_399 ) {\n\n\tjava.lang.Boolean idIfCond_400 = false;\n\tidIfCond_400 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), type);\n\n\tif( idIfCond_400 ) {\n\n\ti = 1;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n else {\n\n\tobj = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj);\n}\n\n}\n else {\n\n\ti = 1;\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object getContainerAsType(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * See kermeta::language::structure::Object.equals(Object)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this, element));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNotEqual(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Freeze the Object\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);\n'"
	 * @generated
	 */
	void freeze();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the EDataType_eTypeParameters\r\n\t * \r\n\t * This used to store the ETypeParameters in the Ecore model side\r\n\t * \r\n\t * The value of the tag must be ETypeParameters separated by \" , \"\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"ecore.EDataType_eTypeParameters\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getEMFEDataTypeETypeParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta WrapperValueTypeSelfExpression='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_401 = false;\n\tidIfCond_401 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, type);\n\n\tif( idIfCond_401 ) {\n\n\tresult = this;\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getTypeCastError())) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object asType(kermeta.language.structure.Class type);

} // Object
