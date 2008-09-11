/**
 * <copyright>
 * </copyright>
 *
 * $Id: Repository.java,v 1.2 2008-09-11 12:35:01 cfaucher Exp $
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
 *        annotation="kermeta documentation='/**\n * Abstract resource container, that contains a list of available loaded resources, \n * and methods to create or get a resource given an URI.\n * A repository cannot contain 2 resources which points to the same file (ie. that have the same normalizedURI)\n \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * Resources created by this Repository \n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \n\t * one Resource of a given Repository\n\t \052/'"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.JavaString" mm_uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Creates a new Resource with given uri, and an optional mm_uri\n\t * mm_uri is required when creating a new model from scratch.\n\t * Raises a ResourceCreate exception in case the Repository already\n\t * contains a Resource with the given uri\n\t * If uri does not points to an existing model file (in the case of\n\t * a model creation), calls to load() operation will fail as long as\n\t * the model has not been saved once\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.persistence.Resource result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Resource createResource(String uri, String mm_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Return a normalized version of the Uri \n\t * in order to prevent several loading of the same file because they have different path that leads to them, kermeta uses normalizedURI\n\t * for some of its functions (eg. repository.getResource )\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\n\t * to check how a given uri is normalized by kermeta \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.normalizeUri(uri);\n\nreturn result;\n'"
	 * @generated
	 */
	String normalizeUri(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Search for elements referenced by one element contained by this repository  that are not contained by this repository\n\t * ie. element that EMF would claim as \"not contained in a resource\"\n\t * example of use :\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\n     *\treport := repository.findDanglingModelElements()\n     *\treport.each{ diag | stdio.writeln(diag.toString ) }\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft123 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_589 = false;\n\twhile( !idLoopCond_589 ) {\n\tidLoopCond_589 = it_ft123.isOff();\n\tif ( idLoopCond_589 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.persistence.Resource res_lbdExp123 = it_ft123.next();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft124 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res_lbdExp123.getContents()).iterator();\n\tjava.lang.Boolean idLoopCond_590 = false;\n\twhile( !idLoopCond_590 ) {\n\tidLoopCond_590 = it_ft124.isOff();\n\tif ( idLoopCond_590 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object containedObj_lbdExp124 = it_ft124.next();\n\n\tkermeta.language.structure.ClassDefinition classDef = null;\n\n\tclassDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(containedObj_lbdExp124).getTypeDefinition();\n\n\tjava.lang.Boolean idIfCond_591 = false;\n\tidIfCond_591 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDef));\n\n\tif( idIfCond_591 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft125 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDef.getAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_592 = false;\n\twhile( !idLoopCond_592 ) {\n\tidLoopCond_592 = it_ft125.isOff();\n\tif ( idLoopCond_592 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp125 = it_ft125.next();\n\n\tjava.lang.Boolean idIfCond_593 = false;\n\tidIfCond_593 = kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp125.getIsDerived());\n\n\tif( idIfCond_593 ) {\n\n\tjava.lang.Boolean idIfCond_594 = false;\n\tidIfCond_594 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isGreater(prop_lbdExp125.getUpper(), 1), kermeta.standard.helper.IntegerWrapper.equals(prop_lbdExp125.getUpper(), kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\n\tif( idIfCond_594 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;\n\n\treferencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp124, prop_lbdExp125);\n\n\tjava.lang.Boolean idIfCond_595 = false;\n\tidIfCond_595 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObjs));\n\n\tif( idIfCond_595 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft126 = referencedObjs.iterator();\n\tjava.lang.Boolean idLoopCond_596 = false;\n\twhile( !idLoopCond_596 ) {\n\tidLoopCond_596 = it_ft126.isOff();\n\tif ( idLoopCond_596 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object referencedObj_lbdExp126 = it_ft126.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft127 = null;\n\n\tjava.lang.Boolean test_ft127 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_598 = false;\n\twhile( !idLoopCond_598 ) {\n\tidLoopCond_598 = kermeta.standard.helper.BooleanWrapper.or(it_ft127.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft127, false));\n\tif ( idLoopCond_598 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp127 = it_ft127.next();\n\n\tresult_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp127.getContents()).contains(referencedObj_lbdExp126);\n//EIle:func\n\n\ttest_ft127 = kermeta.standard.helper.BooleanWrapper.or(test_ft127, result_lambda);\n}\n\t}\n}\n\n\n\tresult_ft127 = test_ft127;\n//EIft:exists\njava.lang.Boolean idIfCond_597 = false;\n\tidIfCond_597 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft127), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp126, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp126, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp126, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_597 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj_lbdExp126);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp124);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp125);\n\n\tresult.add(diagnostic);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tkermeta.language.structure.Object referencedObj = null;\n\n\treferencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp124, prop_lbdExp125);\n\n\tjava.lang.Boolean idIfCond_599 = false;\n\tidIfCond_599 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObj));\n\n\tif( idIfCond_599 ) {\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft128 = null;\n\n\tjava.lang.Boolean test_ft128 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft128 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_601 = false;\n\twhile( !idLoopCond_601 ) {\n\tidLoopCond_601 = kermeta.standard.helper.BooleanWrapper.or(it_ft128.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft128, false));\n\tif ( idLoopCond_601 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp128 = it_ft128.next();\n\n\tresult_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp128.getContents()).contains(referencedObj);\n//EIle:func\n\n\ttest_ft128 = kermeta.standard.helper.BooleanWrapper.or(test_ft128, result_lambda);\n}\n\t}\n}\n\n\n\tresult_ft128 = test_ft128;\n//EIft:exists\njava.lang.Boolean idIfCond_600 = false;\n\tidIfCond_600 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft128), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_600 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp124);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp125);\n\n\tresult.add(diagnostic);\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<DanglingDiagnostic> findDanglingModelElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Returns the Resource associated with the given uri if this uri is associated with\n\t * an already created Resource of the Repository.\n\t * If the Repository contains no Resource associated with the given uri, creates\n\t * a new Resource and loads it.\n\t * In order to prevent multiple load of the same file by using variant path to the same file, all URI used by this function are normalized\n\t * Raises a ResourceCreate exception if the given uri does not point to an existing\n\t * model file \n\t * May also raises loading exceptions if this is the first retrieval of the resource\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\torg.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.initRepository(this);\n\n\tjava.lang.String normalisedUri = this.normalizeUri(uri);\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_602 = false;\n\twhile( !idLoopCond_602 ) {\n\tidLoopCond_602 = it.isOff();\n\tif ( idLoopCond_602 ) {\n\t} else {\n\n\tkermeta.persistence.Resource next = it.next();\n\n\tjava.lang.Boolean idIfCond_603 = false;\n\tidIfCond_603 = kermeta.standard.helper.StringWrapper.equals(normalisedUri, next.normalizedUri());\n\n\tif( idIfCond_603 ) {\n\n\tresult = next;\n}\n\n}\n\t}\n}\n\n\n\tjava.lang.Boolean idIfCond_604 = false;\n\tidIfCond_604 = result == null;\n\n\tif( idIfCond_604 ) {\n\n\tresult = this.createResource(uri, \"\");\n\n\tresult.load();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Resource getResource(String uri);

} // Repository
