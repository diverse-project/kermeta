/**
 * <copyright>
 * </copyright>
 *
 * $Id: Resource.java,v 1.10 2009-01-21 09:16:04 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft206 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(this.getterContents()).iterator();\n\tjava.lang.Boolean idLoopCond_935 = false;\n\twhile( !idLoopCond_935 ) {\n\tidLoopCond_935 = it_ft206.isOff();\n\tif ( idLoopCond_935 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object containedObj_lbdExp206 = it_ft206.next();\n\n\tkermeta.language.structure.ClassDefinition classDef = null;\n\n\tclassDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(containedObj_lbdExp206).getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tjava.lang.Boolean idIfCond_936 = false;\n\tidIfCond_936 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(classDef));\n\n\tif( idIfCond_936 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft207 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(classDef.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_937 = false;\n\twhile( !idLoopCond_937 ) {\n\tidLoopCond_937 = it_ft207.isOff();\n\tif ( idLoopCond_937 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp207 = it_ft207.next();\n\n\tjava.lang.Boolean idIfCond_938 = false;\n\tidIfCond_938 = kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp207.getIsDerived());\n\n\tif( idIfCond_938 ) {\n\n\tjava.lang.Boolean idIfCond_939 = false;\n\tidIfCond_939 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isGreater(prop_lbdExp207.getUpper(), 1), kermeta.standard.helper.IntegerWrapper.equals(prop_lbdExp207.getUpper(), kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\n\tif( idIfCond_939 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;\n\n\treferencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(containedObj_lbdExp206, prop_lbdExp207), \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\tjava.lang.Boolean idIfCond_940 = false;\n\tidIfCond_940 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(referencedObjs));\n\n\tif( idIfCond_940 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft208 = referencedObjs.iterator();\n\tjava.lang.Boolean idLoopCond_941 = false;\n\twhile( !idLoopCond_941 ) {\n\tidLoopCond_941 = it_ft208.isOff();\n\tif ( idLoopCond_941 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object referencedObj_lbdExp208 = it_ft208.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft209 = null;\n\n\tjava.lang.Boolean test_ft209 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft209 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_943 = false;\n\twhile( !idLoopCond_943 ) {\n\tidLoopCond_943 = kermeta.standard.helper.BooleanWrapper.or(it_ft209.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft209, false));\n\tif ( idLoopCond_943 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft209 = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp209 = it_ft209.next();\n\n\tresult_lambda_ft209 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp209.getterContents()).contains(referencedObj_lbdExp208);\n//EIle:func\n\n\ttest_ft209 = kermeta.standard.helper.BooleanWrapper.or(test_ft209, result_lambda_ft209);\n}\n\t}\n}\n\n\n\tresult_ft209 = test_ft209;\n//EIft:exists\njava.lang.Boolean idIfCond_942 = false;\n\tidIfCond_942 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft209), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(referencedObj_lbdExp208, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(referencedObj_lbdExp208, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(referencedObj_lbdExp208, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_942 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.persistence.PersistencePackage.eINSTANCE.getDanglingDiagnostic()));\n\n\tdiagnostic.setDanglingElement(referencedObj_lbdExp208);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp206);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp207);\n\n\tresult.add(diagnostic);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tkermeta.language.structure.Object referencedObj = null;\n\n\treferencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(containedObj_lbdExp206, prop_lbdExp207);\n\n\tjava.lang.Boolean idIfCond_944 = false;\n\tidIfCond_944 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(referencedObj));\n\n\tif( idIfCond_944 ) {\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft210 = null;\n\n\tjava.lang.Boolean test_ft210 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft210 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_946 = false;\n\twhile( !idLoopCond_946 ) {\n\tidLoopCond_946 = kermeta.standard.helper.BooleanWrapper.or(it_ft210.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft210, false));\n\tif ( idLoopCond_946 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft210 = null;\n//BIle:func\nkermeta.persistence.Resource res2_lbdExp210 = it_ft210.next();\n\n\tresult_lambda_ft210 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsSet(res2_lbdExp210.getterContents()).contains(referencedObj);\n//EIle:func\n\n\ttest_ft210 = kermeta.standard.helper.BooleanWrapper.or(test_ft210, result_lambda_ft210);\n}\n\t}\n}\n\n\n\tresult_ft210 = test_ft210;\n//EIft:exists\njava.lang.Boolean idIfCond_945 = false;\n\tidIfCond_945 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft210), kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.String\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Integer\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(referencedObj, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"java.lang.Boolean\")))));\n\n\tif( idIfCond_945 ) {\n\n\tkermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.persistence.PersistencePackage.eINSTANCE.getDanglingDiagnostic()));\n\n\tdiagnostic.setDanglingElement(referencedObj);\n\n\tdiagnostic.setReferencingElement(containedObj_lbdExp206);\n\n\tdiagnostic.setReferencingProperty(prop_lbdExp207);\n\n\tresult.add(diagnostic);\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.normalizeUri(uri), \"java.lang.String\");\n\nreturn result;\n'"
	 * @generated
	 */
	String normalizedUri();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.persistence.Resource> result = null;\n\n\tresult = (kermeta.standard.Set<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.ResourceUtil.getDependentResources(this, uri, metaModelURI, \"EMF\"), \"kermeta.standard.Set<kermeta.persistence.Resource>\");\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Resource> getterDependentResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tres.addAll(this);\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> coll = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft205 = this.iterator();\n\tjava.lang.Boolean idLoopCond_934 = false;\n\twhile( !idLoopCond_934 ) {\n\tidLoopCond_934 = it_ft205.isOff();\n\tif ( idLoopCond_934 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object e_lbdExp205 = it_ft205.next();\n\n\tcoll = (kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getAllContainedObjects(e_lbdExp205), \"kermeta.standard.Set<kermeta.language.structure.Object>\");\n\n\tres.addAll(coll);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = res;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<kermeta.language.structure.Object> getterContents();

} // Resource
