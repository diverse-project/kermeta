/**
 * <copyright>
 * </copyright>
 *
 * $Id: Resource.java,v 1.2 2008-09-11 12:35:01 cfaucher Exp $
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
 *   <li>{@link kermeta.persistence.Resource#getDependentResources <em>Dependent Resources</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getContents <em>Contents</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getResource()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\n * The main class that handle a loaded/saved model.\n * There are a few important things to note for the developer :\n * \n * - load a Resource : this loads a Collection of instances corresponding to the\n *   objects in the loaded model. If the Collection of instances is empty, than \n *\t a ResourceLoadException is raised\n *\n * - save a Resource : this saves the collection of instances in a new file. This can\n *   be correctly done if and only if the instances saved are conform to the metamodel\n *   linked to this resource (this link does not need to be explicit. It is normally retrieved\n *   through the EMF model -- see Java wrapping \"Resource.java\").\n * \n * - add/remove an instance to the Resource : this adds an element in the resource. It cannot\n *   be \"simply\" added because of the following potential errors :\n *\n *   - The object added is not conform to the metamodel -> Error\n *   - The object was already added in the resource -> Not a real error : we do nothing\n *   - The object to remove does not exist -> redirect to a collection-specific error\n *   - The object to remove is attached to an object in the collection -> \"dependency-violation\" exception?\n\n \052/'"
 * @generated
 */
public interface Resource extends Set<kermeta.language.structure.Object> {
	/**
	 * Returns the value of the '<em><b>Dependent Resources</b></em>' reference list.
	 * The list contents are of type {@link kermeta.persistence.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Resources</em>' reference list.
	 * @see kermeta.persistence.PersistencePackage#getResource_DependentResources()
	 * @model derived="true" ordered="false"
	 *        annotation="kermeta isReadOnly='true'"
	 *        annotation="kermeta documentation='/**\t\n\t * Returns the set of Resources the current Resource, which must have been loaded,\n\t * depends on, an empty set if current Resource has no dependency\n\t \052/'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = (kermeta.standard.Set<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.basetypes.ResourceUtil.getDependentResources(this, uri, metaModelURI, \"EMF\");\n}'"
	 * @generated
	 */
	EList<Resource> getDependentResources();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see kermeta.persistence.PersistencePackage#getResource_Contents()
	 * @model derived="true" ordered="false"
	 *        annotation="kermeta isReadOnly='true'"
	 *        annotation="kermeta documentation='/** \n\t * Returns the set of all Objects directly or indirectly contained by the Resource,\n\t * or an empty set if the Resource is empty\n\t * implementation note: since this derived property  build a set, it guarantees the unicity, as a drawback,\n\t *  calling this property on large resources will be really slow due to this verification. some user may prefer\n\t * to reimplement it using a bag.\n\t \052/'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Object>\"));\n\n\tres.addAll(this);\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> coll = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft115 = this.iterator();\n\tjava.lang.Boolean idLoopCond_570 = false;\n\twhile( !idLoopCond_570 ) {\n\tidLoopCond_570 = it_ft115.isOff();\n\tif ( idLoopCond_570 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object e_lbdExp115 = it_ft115.next();\n\n\tcoll = (kermeta.standard.Set<kermeta.language.structure.Object>) fr.irisa.triskell.kermeta.runtime.language.Object.getAllContainedObjects(e_lbdExp115);\n\n\tres.addAll(coll);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = res;\n}'"
	 * @generated
	 */
	EList<kermeta.language.structure.Object> getContents();

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
	 *        annotation="kermeta documentation='/**\n\t * Repository used to create the Resource\n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \n\t * one Resource of a given Repository\n\t \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * Indicates weither this resource will be updated when saving the repository\n\t * This is useful if the repository contains some metamodels that should not be saved.\n\t *\n\t * Note that in the current version, it doesn\'t ensure that you have not modified its content (using the freeze)\n\t * If you modify the elements of such resource, other resource that depend on it will be incorrectly saved \n\t \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * Uri of the meta-model of the Resource to load\n\t \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * Uri of the Resource to load\n\t \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * Save a Resource in the file specified by the current value of uri \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model new_uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Save a Resource in a file referenced by the new uri.\n\t * note: this doesn\'t change the URI of the resource, it is only saved in another place \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void saveWithNewURI(String new_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Search for elements referenced by one element contained by this resource that are not contained by this repository\n\t * ie. element that EMF would claim as \"not contained in a resource\"\n\t * checks only objects directly referenced by the element in this resource, ignores indirectly referenced objects\n\t * example of use :\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\n\t *\treport := resource.findDanglingModelElements()\n\t *\treport.each{ diag | stdio.writeln(diag.toString ) }\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(this.getContents()).iterator();\n\tjava.lang.Boolean idLoopCond_571 = false;\n\twhile( !idLoopCond_571 ) {\n\tidLoopCond_571 = it_ft116.isOff();\n\tif ( idLoopCond_571 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object containedObj_lbdExp116 = it_ft116.next();\n\n\tkermeta.language.structure.ClassDefinition classDef = null;\n\n\tclassDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(containedObj_lbdExp116).getTypeDefinition();\n\n\tjava.lang.Boolean idIfCond_572 = false;\n\tidIfCond_572 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDef));\n\n\tif( idIfCond_572 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft117 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDef.getAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_573 = false;\n\twhile( !idLoopCond_573 ) {\n\tidLoopCond_573 = it_ft117.isOff();\n\tif ( idLoopCond_573 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp117 = it_ft117.next();\n\n\tjava.lang.Boolean idIfCond_574 = false;\n\tidIfCond_574 = kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp117.getIsDerived());\n\n\tif( idIfCond_574 ) {\n\n\tjava.lang.Boolean idIfCond_575 = false;\n\tidIfCond_575 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isGreater(prop_lbdExp117.getUpper(), 1), kermeta.standard.helper.IntegerWrapper.equals(prop_lbdExp117.getUpper(), kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\n\tif( idIfCond_575 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;\n\n\treferencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp116, prop_lbdExp117);\n\n\tjava.lang.Boolean idIfCond_576 = false;\n\tidIfCond_576 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObjs));\n\n\tif( idIfCond_576 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft118 = referencedObjs.iterator();\n\tjava.lang.Boolean idLoopCond_577 = false;\n\twhile( !idLoopCond_577 ) {\n\tidLoopCond_577 = it_ft118.isOff();\n\tif ( idLoopCond_577 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object referencedObj_lbdExp118 = it_ft118.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft119 = null;\n\n\tjava.lang.Boolean test_ft119 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft119 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_579 = false;\n\twhile( !idLoopCond_579 ) {\n\tidLoopCond_579 = kermeta.standard.helper.BooleanWrapper.or(it_ft119.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft119, false));\n\tif ( idLoopCond_579 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp119 = it_ft119.next();\n\n\tresult_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp119.getContents()).contains(referencedObj_lbdExp118);\n//EIle:func\n\n\ttest_ft119 = kermeta.standard.helper.BooleanWrapper.or(test_ft119, result_lambda);\n}\n\t}\n}\n\n\n\tresult_ft119 = test_ft119;\n//EIft:exists\njava.lang.Boolean idIfCond_578 = false;\n\tidIfCond_578 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft119), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp118, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp118, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj_lbdExp118, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_578 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj_lbdExp118);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp116);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp117);\n\n\tresult.add(diagnostic);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tkermeta.language.structure.Object referencedObj = null;\n\n\treferencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(containedObj_lbdExp116, prop_lbdExp117);\n\n\tjava.lang.Boolean idIfCond_580 = false;\n\tidIfCond_580 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(referencedObj));\n\n\tif( idIfCond_580 ) {\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft120 = null;\n\n\tjava.lang.Boolean test_ft120 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft120 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_582 = false;\n\twhile( !idLoopCond_582 ) {\n\tidLoopCond_582 = kermeta.standard.helper.BooleanWrapper.or(it_ft120.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft120, false));\n\tif ( idLoopCond_582 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp120 = it_ft120.next();\n\n\tresult_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp120.getContents()).contains(referencedObj);\n//EIle:func\n\n\ttest_ft120 = kermeta.standard.helper.BooleanWrapper.or(test_ft120, result_lambda);\n}\n\t}\n}\n\n\n\tresult_ft120 = test_ft120;\n//EIft:exists\njava.lang.Boolean idIfCond_581 = false;\n\tidIfCond_581 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft120), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_581 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.persistence.DanglingDiagnostic\"));\n\n\tdiagnostic.setDanglingElement(referencedObj);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp116);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp117);\n\n\tresult.add(diagnostic);\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<DanglingDiagnostic> findDanglingModelElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Loads the Resource, thus making content of the Resource browsable.\n\t * Raises a ResourceLoadException in case loaded Resource is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * The entities contained in the model-instance, that are provided when user loads a resource \n\t * instances == rootContents\n\t * this is a loop on Resource itself in order to get backward compatibility\n\t \052/'"
	 *        annotation="kermeta deprecated='user should use the resource directly since this is a collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	Resource instances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Return a normalized version of the Uri of this resource\n\t * in order to prevent several loading of the same file because they have diffent path that leads to them, kermeta uses normalizedURI\n\t * for some of its functions (eg. repository.getResource )\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\n\t * to check how a given uri is normalized by kermeta\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.normalizeUri(uri);\n\nreturn result;\n'"
	 * @generated
	 */
	String normalizedUri();

} // Resource
