/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFResource.java,v 1.2 2008-08-19 13:23:05 cfaucher Exp $
 */
package kermeta.persistence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.persistence.PersistencePackage#getEMFResource()
 * @model annotation="kermeta documentation='/**\r\n * Extension of the Resource class definition that is specific to EMF Repository.\r\n * User is not supposed to directly create it. Otherwise it will not be correctly initialized\r\n * You must To create one \r\n \052/'"
 * @generated
 */
public interface EMFResource extends Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.clear();\n\n\torg.kermeta.compil.runtime.helper.persistence.Loader.load(getValues(), getUri(), getMetaModelURI());\n'"
	 * @generated
	 */
	void loadWithoutChecking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Set<Object>.remove(Object)\r\n\t * Remove the instance from the Resource\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_264 = false;\n\tidIfCond_264 = this.contains(instance);\n\n\tif( idIfCond_264 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.unSetContainingResource(instance);\n\n\t//Call of the super operation\n((kermeta.standard.Set) this).remove(instance);\n}\n\n'"
	 * @generated
	 */
	void remove(kermeta.language.structure.Object instance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Resource.save()\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_265 = false;\n\tidIfCond_265 = this.getIsReadOnly();\n\n\tif( idIfCond_265 ) {\n\n\tkermeta.exceptions.ResourceSaveException e = ((kermeta.exceptions.ResourceSaveException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.ResourceSaveException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Cannot save a readonly resource. Probably this resource was indirectly loaded when loading another resource. \\n\", \"If you really intend to save this resource, you can set isReadOnly to false, but you must ensure to do so before any resource save.\\n\"), \"Note : setting isReadOnly to false on the metamodel may lead to unpredictable results\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.persistence.Saver.save(getValues(), getUri(), getMetaModelURI());\n'"
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model new_uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Resource.saveWithNewURI(String)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.persistence.Saver.save(getValues(), new_uri, getMetaModelURI());\n'"
	 * @generated
	 */
	void saveWithNewURI(String new_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Checks the Resource using the EMF validation function, and saves it if\r\n\t * validation succeeds\r\n\t * Applies validation to all root objects of the Resource\r\n\t * Returns true if the validation reports no error, raises exceptions otherwise\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.ResourceUtil.save(this, this.uri, metaModelURI, \"EMF\", this, true);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean saveAndValidateWithEMF();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Resource.load()\r\n\t * In case the metamodelURI was not previously set, metamodelURI is filled with\r\n\t * the nsuri of the root package of the metamodel used to load the Resource after\r\n\t * a successful load\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.clear();\n\n\torg.kermeta.compil.runtime.helper.persistence.Loader.load(getValues(), getUri(), getMetaModelURI());\n\n\tjava.lang.Boolean idIfCond_266 = false;\n\tidIfCond_266 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_266 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"Resource load failed!\");\n\n\tkermeta.exceptions.ResourceLoadException e = ((kermeta.exceptions.ResourceLoadException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.ResourceLoadException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Resource load failed, no object was created in this resource from \", this.getUri()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n'"
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Set<Object>.add(Object)\r\n\t * Add an instance to the Resource \r\n\t * Ensures that the instance is referenced by a one and only one Resource of the same Repository\r\n\t * Ensures that the instance does not appear more than once in the Resource\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<kermeta.persistence.Resource> result_ft49 = null;\n\n\tkermeta.persistence.Resource elem_ft49 = null;\n\n\tresult_ft49 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.persistence.Resource>\"));\n\n\t\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_268 = false;\n\twhile( !idLoopCond_268 ) {\n\tidLoopCond_268 = it_ft49.isOff();;\n\tif ( idLoopCond_268 ) {\n\t} else {\n\n\telem_ft49 = it_ft49.next();\n\n\tjava.lang.Boolean idIfCond_269 = false;\n//Beginning of the Inlining of the lambda expression: selector\nkermeta.persistence.Resource r = elem_ft49;\n\n\tidIfCond_269 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(r, this), r.contains(instance));\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_269 ) {\n\n\tresult_ft49.add(elem_ft49);\n}\n\n}\n\t}\n//End of the Inlining of the function type: select\n//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft48 = result_ft49.iterator();\n\tjava.lang.Boolean idLoopCond_267 = false;\n\twhile( !idLoopCond_267 ) {\n\tidLoopCond_267 = it_ft48.isOff();;\n\tif ( idLoopCond_267 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.persistence.Resource r = it_ft48.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"DVK ! another resource of the same repository was containing this element\");\n\n\tr.remove(instance);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.setContainingResource(instance, this);\n\n\t//Call of the super operation\n((kermeta.standard.Set) this).add(instance);\n'"
	 * @generated
	 */
	void add(kermeta.language.structure.Object instance);

} // EMFResource
