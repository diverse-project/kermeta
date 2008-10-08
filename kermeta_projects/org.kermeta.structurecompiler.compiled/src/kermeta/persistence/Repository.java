/**
 * <copyright>
 * </copyright>
 *
 * $Id: Repository.java,v 1.4 2008-10-08 14:37:53 cfaucher Exp $
 */
package kermeta.persistence;

import kermeta.standard.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.persistence.Repository#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getRepository()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * Abstract resource container, that contains a list of available loaded resources, \r\n * and methods to create or get a resource given an URI.\r\n * A repository cannot contain 2 resources which points to the same file (ie. that have the same normalizedURI)\r\n \052/'"
 * @generated
 */
public interface Repository extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.persistence.Resource}.
	 * It is bidirectional and its opposite is '{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see kermeta.persistence.PersistencePackage#getRepository_Resources()
	 * @see kermeta.persistence.Resource#getRepository
	 * @model opposite="repository" containment="true" resolveProxies="true" ordered="false"
	 *        annotation="kermeta documentation='/**\r\n\t * Resources created by this Repository \r\n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \r\n\t * one Resource of a given Repository\r\n\t \052/'"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.JavaString" mm_uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Creates a new Resource with given uri, and an optional mm_uri\r\n\t * mm_uri is required when creating a new model from scratch.\r\n\t * Raises a ResourceCreate exception in case the Repository already\r\n\t * contains a Resource with the given uri\r\n\t * If uri does not points to an existing model file (in the case of\r\n\t * a model creation), calls to load() operation will fail as long as\r\n\t * the model has not been saved once\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.persistence.Resource result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Resource createResource(String uri, String mm_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Return a normalized version of the Uri \r\n\t * in order to prevent several loading of the same file because they have different path that leads to them, kermeta uses normalizedURI\r\n\t * for some of its functions (eg. repository.getResource )\r\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\r\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \r\n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\r\n\t * to check how a given uri is normalized by kermeta \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.normalizeUri(uri);\n\nreturn result;\n'"
	 * @generated
	 */
	String normalizeUri(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Search for elements referenced by one element contained by this repository  that are not contained by this repository\r\n\t * ie. element that EMF would claim as \"not contained in a resource\"\r\n\t * example of use :\r\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\r\n     *\treport := repository.findDanglingModelElements()\r\n     *\treport.each{ diag | stdio.writeln(diag.toString ) }\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>\"));\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> fullResContents = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft212 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_938 = false;\n\twhile( !idLoopCond_938 ) {\n\tidLoopCond_938 = it_ft212.isOff();\n\tif ( idLoopCond_938 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.persistence.Resource res_lbdExp212 = it_ft212.next();\n\n\tjava.lang.Boolean idIfCond_939 = false;\n\tidIfCond_939 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(fullResContents);\n\n\tif( idIfCond_939 ) {\n\n\tfullResContents = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res_lbdExp212.getterContents());\n}\n else {\n\n\tfullResContents.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res_lbdExp212.getterContents()));\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft213 = fullResContents.iterator();\n\tjava.lang.Boolean idLoopCond_940 = false;\n\twhile( !idLoopCond_940 ) {\n\tidLoopCond_940 = it_ft213.isOff();\n\tif ( idLoopCond_940 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object containedObj_lbdExp213 = it_ft213.next();\n\n\tkermeta.language.structure.ClassDefinition classDef = null;\n\n\tclassDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(containedObj_lbdExp213).getTypeDefinition();\n\n\tjava.lang.Boolean idIfCond_941 = false;\n\tidIfCond_941 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDef));\n\n\tif( idIfCond_941 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft214 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDef.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_942 = false;\n\twhile( !idLoopCond_942 ) {\n\tidLoopCond_942 = it_ft214.isOff();\n\tif ( idLoopCond_942 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp214 = it_ft214.next();\n\n\tjava.lang.Boolean idIfCond_943 = false;\n\tidIfCond_943 = kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp214.getIsDerived());\n\n\tif( idIfCond_943 ) {\n\n\tjava.lang.Boolean idIfCond_944 = false;\n\tidIfCond_944 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isGreater(prop_lbdExp214.getUpper(), 1), kermeta.standard.helper.IntegerWrapper.equals(prop_lbdExp214.getUpper(), kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\n\tif( idIfCond_944 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;\n\n\treferencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp213, prop_lbdExp214);\n\n\tjava.lang.Boolean idIfCond_945 = false;\n\tidIfCond_945 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObjs));\n\n\tif( idIfCond_945 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft215 = referencedObjs.iterator();\n\tjava.lang.Boolean idLoopCond_946 = false;\n\twhile( !idLoopCond_946 ) {\n\tidLoopCond_946 = it_ft215.isOff();\n\tif ( idLoopCond_946 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object referencedObj_lbdExp215 = it_ft215.next();\n\n\tjava.lang.Boolean idIfCond_947 = false;\n\tidIfCond_947 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(fullResContents.contains(referencedObj_lbdExp215)), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp215, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp215, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp215, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_947 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj_lbdExp215);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp213);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp214);\n\n\tresult.add(diagnostic);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tkermeta.language.structure.Object referencedObj = null;\n\n\treferencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp213, prop_lbdExp214);\n\n\tjava.lang.Boolean idIfCond_948 = false;\n\tidIfCond_948 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObj));\n\n\tif( idIfCond_948 ) {\n\n\tjava.lang.Boolean idIfCond_949 = false;\n\tidIfCond_949 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(fullResContents.contains(referencedObj)), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_949 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp213);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp214);\n\n\tresult.add(diagnostic);\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<DanglingDiagnostic> findDanglingModelElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the Resource associated with the given uri if this uri is associated with\r\n\t * an already created Resource of the Repository.\r\n\t * If the Repository contains no Resource associated with the given uri, creates\r\n\t * a new Resource and loads it.\r\n\t * In order to prevent multiple load of the same file by using variant path to the same file, all URI used by this function are normalized\r\n\t * Raises a ResourceCreate exception if the given uri does not point to an existing\r\n\t * model file \r\n\t * May also raises loading exceptions if this is the first retrieval of the resource\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\torg.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.initRepository(this);\n\n\tjava.lang.String normalisedUri = this.normalizeUri(uri);\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_950 = false;\n\twhile( !idLoopCond_950 ) {\n\tidLoopCond_950 = it.isOff();\n\tif ( idLoopCond_950 ) {\n\t} else {\n\n\tkermeta.persistence.Resource next = it.next();\n\n\tjava.lang.Boolean idIfCond_951 = false;\n\tidIfCond_951 = kermeta.standard.helper.StringWrapper.equals(normalisedUri, next.normalizedUri());\n\n\tif( idIfCond_951 ) {\n\n\tresult = next;\n}\n\n}\n\t}\n}\n\n\n\tjava.lang.Boolean idIfCond_952 = false;\n\tidIfCond_952 = result == null;\n\n\tif( idIfCond_952 ) {\n\n\tresult = this.createResource(uri, \"\");\n\n\tresult.load();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Resource getResource(String uri);

} // Repository
