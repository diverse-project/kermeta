/**
 * <copyright>
 * </copyright>
 *
 * $Id: Resource.java,v 1.3 2008-09-22 14:48:28 cfaucher Exp $
 */
package kermeta.persistence;

import kermeta.standard.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getResource()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * The main class that handle a loaded/saved model.\r\n * There are a few important things to note for the developer :\r\n * \r\n * - load a Resource : this loads a Collection of instances corresponding to the\r\n *   objects in the loaded model. If the Collection of instances is empty, than \r\n *\t a ResourceLoadException is raised\r\n *\r\n * - save a Resource : this saves the collection of instances in a new file. This can\r\n *   be correctly done if and only if the instances saved are conform to the metamodel\r\n *   linked to this resource (this link does not need to be explicit. It is normally retrieved\r\n *   through the EMF model -- see Java wrapping \"Resource.java\").\r\n * \r\n * - add/remove an instance to the Resource : this adds an element in the resource. It cannot\r\n *   be \"simply\" added because of the following potential errors :\r\n *\r\n *   - The object added is not conform to the metamodel -> Error\r\n *   - The object was already added in the resource -> Not a real error : we do nothing\r\n *   - The object to remove does not exist -> redirect to a collection-specific error\r\n *   - The object to remove is attached to an object in the collection -> \"dependency-violation\" exception?\r\n\r\n \052/'"
 * @generated
 */
public interface Resource extends Set<kermeta.language.structure.Object> {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.persistence.Repository#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see kermeta.persistence.PersistencePackage#getResource_Repository()
	 * @see kermeta.persistence.Repository#getResources
	 * @model opposite="resources" transient="false"
	 *        annotation="kermeta documentation='/**\r\n\t * Repository used to create the Resource\r\n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \r\n\t * one Resource of a given Repository\r\n\t \052/'"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Meta Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model URI</em>' attribute.
	 * @see #setMetaModelURI(String)
	 * @see kermeta.persistence.PersistencePackage#getResource_MetaModelURI()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Uri of the meta-model of the Resource to load\r\n\t \052/'"
	 * @generated
	 */
	String getMetaModelURI();

	/**
	 * Sets the value of the '{@link kermeta.persistence.Resource#getMetaModelURI <em>Meta Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model URI</em>' attribute.
	 * @see #getMetaModelURI()
	 * @generated
	 */
	void setMetaModelURI(String value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see kermeta.persistence.PersistencePackage#getResource_IsReadOnly()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Indicates weither this resource will be updated when saving the repository\r\n\t * This is useful if the repository contains some metamodels that should not be saved.\r\n\t *\r\n\t * Note that in the current version, it doesn\'t ensure that you have not modified its content (using the freeze)\r\n\t * If you modify the elements of such resource, other resource that depend on it will be incorrectly saved \r\n\t \052/'"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link kermeta.persistence.Resource#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see kermeta.persistence.PersistencePackage#getResource_Uri()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Uri of the Resource to load\r\n\t \052/'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link kermeta.persistence.Resource#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Save a Resource in the file specified by the current value of uri \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model new_uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Save a Resource in a file referenced by the new uri.\r\n\t * note: this doesn\'t change the URI of the resource, it is only saved in another place \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void saveWithNewURI(String new_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Search for elements referenced by one element contained by this resource that are not contained by this repository\r\n\t * ie. element that EMF would claim as \"not contained in a resource\"\r\n\t * checks only objects directly referenced by the element in this resource, ignores indirectly referenced objects\r\n\t * example of use :\r\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\r\n\t *\treport := resource.findDanglingModelElements()\r\n\t *\treport.each{ diag | stdio.writeln(diag.toString ) }\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft218 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(this.getterContents()).iterator();\n\tjava.lang.Boolean idLoopCond_946 = false;\n\twhile( !idLoopCond_946 ) {\n\tidLoopCond_946 = it_ft218.isOff();\n\tif ( idLoopCond_946 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object containedObj_lbdExp218 = it_ft218.next();\n\n\tkermeta.language.structure.ClassDefinition classDef = null;\n\n\tclassDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(containedObj_lbdExp218).getTypeDefinition();\n\n\tjava.lang.Boolean idIfCond_947 = false;\n\tidIfCond_947 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDef));\n\n\tif( idIfCond_947 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft219 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDef.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_948 = false;\n\twhile( !idLoopCond_948 ) {\n\tidLoopCond_948 = it_ft219.isOff();\n\tif ( idLoopCond_948 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp219 = it_ft219.next();\n\n\tjava.lang.Boolean idIfCond_949 = false;\n\tidIfCond_949 = kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp219.getIsDerived());\n\n\tif( idIfCond_949 ) {\n\n\tjava.lang.Boolean idIfCond_950 = false;\n\tidIfCond_950 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isGreater(prop_lbdExp219.getUpper(), 1), kermeta.standard.helper.IntegerWrapper.equals(prop_lbdExp219.getUpper(), kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\n\tif( idIfCond_950 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;\n\n\treferencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp218, prop_lbdExp219);\n\n\tjava.lang.Boolean idIfCond_951 = false;\n\tidIfCond_951 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObjs));\n\n\tif( idIfCond_951 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft220 = referencedObjs.iterator();\n\tjava.lang.Boolean idLoopCond_952 = false;\n\twhile( !idLoopCond_952 ) {\n\tidLoopCond_952 = it_ft220.isOff();\n\tif ( idLoopCond_952 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object referencedObj_lbdExp220 = it_ft220.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft221 = null;\n\n\tjava.lang.Boolean test_ft221 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft221 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_954 = false;\n\twhile( !idLoopCond_954 ) {\n\tidLoopCond_954 = kermeta.standard.helper.BooleanWrapper.or(it_ft221.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft221, false));\n\tif ( idLoopCond_954 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft221 = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp221 = it_ft221.next();\n\n\tresult_lambda_ft221 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp221.getterContents()).contains(referencedObj_lbdExp220);\n//EIle:func\n\n\ttest_ft221 = kermeta.standard.helper.BooleanWrapper.or(test_ft221, result_lambda_ft221);\n}\n\t}\n}\n\n\n\tresult_ft221 = test_ft221;\n//EIft:exists\njava.lang.Boolean idIfCond_953 = false;\n\tidIfCond_953 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft221), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp220, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp220, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp220, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_953 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj_lbdExp220);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp218);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp219);\n\n\tresult.add(diagnostic);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tkermeta.language.structure.Object referencedObj = null;\n\n\treferencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp218, prop_lbdExp219);\n\n\tjava.lang.Boolean idIfCond_955 = false;\n\tidIfCond_955 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObj));\n\n\tif( idIfCond_955 ) {\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft222 = null;\n\n\tjava.lang.Boolean test_ft222 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft222 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_957 = false;\n\twhile( !idLoopCond_957 ) {\n\tidLoopCond_957 = kermeta.standard.helper.BooleanWrapper.or(it_ft222.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft222, false));\n\tif ( idLoopCond_957 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft222 = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp222 = it_ft222.next();\n\n\tresult_lambda_ft222 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp222.getterContents()).contains(referencedObj);\n//EIle:func\n\n\ttest_ft222 = kermeta.standard.helper.BooleanWrapper.or(test_ft222, result_lambda_ft222);\n}\n\t}\n}\n\n\n\tresult_ft222 = test_ft222;\n//EIft:exists\njava.lang.Boolean idIfCond_956 = false;\n\tidIfCond_956 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft222), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_956 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp218);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp219);\n\n\tresult.add(diagnostic);\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<DanglingDiagnostic> findDanglingModelElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Loads the Resource, thus making content of the Resource browsable.\r\n\t * Raises a ResourceLoadException in case loaded Resource is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * The entities contained in the model-instance, that are provided when user loads a resource \r\n\t * instances == rootContents\r\n\t * this is a loop on Resource itself in order to get backward compatibility\r\n\t \052/'"
	 *        annotation="kermeta deprecated='user should use the resource directly since this is a collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	Resource instances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Return a normalized version of the Uri of this resource\r\n\t * in order to prevent several loading of the same file because they have diffent path that leads to them, kermeta uses normalizedURI\r\n\t * for some of its functions (eg. repository.getResource )\r\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\r\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \r\n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\r\n\t * to check how a given uri is normalized by kermeta\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.normalizeUri(uri);\n\nreturn result;\n'"
	 * @generated
	 */
	String normalizedUri();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.Resource> result = null;\n{\n\n\tresult = (kermeta.standard.Set<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.basetypes.ResourceUtil.getDependentResources(this, uri, metaModelURI, \"EMF\");\n}\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Resource> getterDependentResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Object> result = null;\n{\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Object>\"));\n\n\tres.addAll(this);\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> coll = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft217 = this.iterator();\n\tjava.lang.Boolean idLoopCond_945 = false;\n\twhile( !idLoopCond_945 ) {\n\tidLoopCond_945 = it_ft217.isOff();\n\tif ( idLoopCond_945 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object e_lbdExp217 = it_ft217.next();\n\n\tcoll = (kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.getAllContainedObjects(e);\n\n\tres.addAll(coll);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = res;\n}\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<kermeta.language.structure.Object> getterContents();

} // Resource
