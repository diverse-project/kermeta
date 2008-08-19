/**
 * <copyright>
 * </copyright>
 *
 * $Id: Repository.java,v 1.2 2008-08-19 13:23:05 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.persistence.Resource result = null;\nreturn result;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_270 = false;\n\twhile( !idLoopCond_270 ) {\n\tidLoopCond_270 = it_ft50.isOff();;\n\tif ( idLoopCond_270 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.persistence.Resource res = it_ft50.next();\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res.getContents()).iterator();\n\tjava.lang.Boolean idLoopCond_271 = false;\n\twhile( !idLoopCond_271 ) {\n\tidLoopCond_271 = it_ft51.isOff();;\n\tif ( idLoopCond_271 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Object containedObj = it_ft51.next();\n\n\tkermeta.language.structure.ClassDefinition classDef = null;\n\n\tclassDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(containedObj).getTypeDefinition();\n\n\tjava.lang.Boolean idIfCond_272 = false;\n\tidIfCond_272 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDef));\n\n\tif( idIfCond_272 ) {\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDef.getAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_273 = false;\n\twhile( !idLoopCond_273 ) {\n\tidLoopCond_273 = it_ft52.isOff();;\n\tif ( idLoopCond_273 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Property prop = it_ft52.next();\n\n\tjava.lang.Boolean idIfCond_274 = false;\n\tidIfCond_274 = kermeta.standard.helper.BooleanWrapper.not(prop.getIsDerived());\n\n\tif( idIfCond_274 ) {\n\n\tjava.lang.Boolean idIfCond_275 = false;\n\tidIfCond_275 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isGreater(prop.getUpper(), 1), kermeta.standard.helper.IntegerWrapper.equals(prop.getUpper(), kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\n\tif( idIfCond_275 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;\n\n\treferencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj, prop);\n\n\tjava.lang.Boolean idIfCond_276 = false;\n\tidIfCond_276 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObjs));\n\n\tif( idIfCond_276 ) {\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft53 = referencedObjs.iterator();\n\tjava.lang.Boolean idLoopCond_277 = false;\n\twhile( !idLoopCond_277 ) {\n\tidLoopCond_277 = it_ft53.isOff();;\n\tif ( idLoopCond_277 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Object referencedObj = it_ft53.next();\n\n\t//Beginning of the Inlining of the function type: exists\n\njava.lang.Boolean result_ft54 = null;\n\n\tjava.lang.Boolean test_ft54 = false;\n\n\t\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_279 = false;\n\twhile( !idLoopCond_279 ) {\n\tidLoopCond_279 = kermeta.standard.helper.BooleanWrapper.or(it_ft54.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft54, false));;\n\tif ( idLoopCond_279 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//Beginning of the Inlining of the lambda expression: func\nkermeta.persistence.Resource res2 = it_ft54.next();\n\n\tresult_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2.getContents()).contains(referencedObj);\n//End of the Inlining of the lambda expression: func\n\n\ttest_ft54 = kermeta.standard.helper.BooleanWrapper.or(test_ft54, result_lambda);\n}\n\t}\n\n\tresult_ft54 = test_ft54;\n//End of the Inlining of the function type: exists\njava.lang.Boolean idIfCond_278 = false;\n\tidIfCond_278 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft54), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_278 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj);\n\n\tdiagnostic.setReferencingElement(containedObj);\n\n\tdiagnostic.setReferencingProperty(prop);\n\n\tresult.add(diagnostic);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n}\n\n}\n else {\n\n\tkermeta.language.structure.Object referencedObj = null;\n\n\treferencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj, prop);\n\n\tjava.lang.Boolean idIfCond_280 = false;\n\tidIfCond_280 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObj));\n\n\tif( idIfCond_280 ) {\n\n\t//Beginning of the Inlining of the function type: exists\n\njava.lang.Boolean result_ft55 = null;\n\n\tjava.lang.Boolean test_ft55 = false;\n\n\t\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_282 = false;\n\twhile( !idLoopCond_282 ) {\n\tidLoopCond_282 = kermeta.standard.helper.BooleanWrapper.or(it_ft55.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft55, false));;\n\tif ( idLoopCond_282 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//Beginning of the Inlining of the lambda expression: func\nkermeta.persistence.Resource res2 = it_ft55.next();\n\n\tresult_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2.getContents()).contains(referencedObj);\n//End of the Inlining of the lambda expression: func\n\n\ttest_ft55 = kermeta.standard.helper.BooleanWrapper.or(test_ft55, result_lambda);\n}\n\t}\n\n\tresult_ft55 = test_ft55;\n//End of the Inlining of the function type: exists\njava.lang.Boolean idIfCond_281 = false;\n\tidIfCond_281 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft55), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_281 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj);\n\n\tdiagnostic.setReferencingElement(containedObj);\n\n\tdiagnostic.setReferencingProperty(prop);\n\n\tresult.add(diagnostic);\n}\n\n}\n\n}\n\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<DanglingDiagnostic> findDanglingModelElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the Resource associated with the given uri if this uri is associated with\r\n\t * an already created Resource of the Repository.\r\n\t * If the Repository contains no Resource associated with the given uri, creates\r\n\t * a new Resource and loads it.\r\n\t * In order to prevent multiple load of the same file by using variant path to the same file, all URI used by this function are normalized\r\n\t * Raises a ResourceCreate exception if the given uri does not point to an existing\r\n\t * model file \r\n\t * May also raises loading exceptions if this is the first retrieval of the resource\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\torg.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.initRepository(this);\n\n\tjava.lang.String normalisedUri = this.normalizeUri(uri);\n\n\t\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_283 = false;\n\twhile( !idLoopCond_283 ) {\n\tidLoopCond_283 = it.isOff();;\n\tif ( idLoopCond_283 ) {\n\t} else {\n\n\tkermeta.persistence.Resource next = it.next();\n\n\tjava.lang.Boolean idIfCond_284 = false;\n\tidIfCond_284 = kermeta.standard.helper.StringWrapper.equals(normalisedUri, next.normalizedUri());\n\n\tif( idIfCond_284 ) {\n\n\tresult = next;\n}\n\n}\n\t}\n\n\tjava.lang.Boolean idIfCond_285 = false;\n\tidIfCond_285 = result.equals(null);\n\n\tif( idIfCond_285 ) {\n\n\tresult = this.createResource(uri, \"\");\n\n\tresult.load();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Resource getResource(String uri);

} // Repository
