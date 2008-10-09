/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFResource.java,v 1.5 2008-10-09 08:50:25 cfaucher Exp $
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
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Resource.save()\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_932 = false;\n\tidIfCond_932 = this.getIsReadOnly();\n\n\tif( idIfCond_932 ) {\n\n\tkermeta.exceptions.ResourceSaveException e = ((kermeta.exceptions.ResourceSaveException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.ResourceSaveException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Cannot save a readonly resource. Probably this resource was indirectly loaded when loading another resource. \\n\", \"If you really intend to save this resource, you can set isReadOnly to false, but you must ensure to do so before any resource save.\\n\"), \"Note : setting isReadOnly to false on the metamodel may lead to unpredictable results\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.persistence.Saver.save(getValues(), getUri(), getMetaModelURI());\n'"
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Set<Object>.remove(Object)\r\n\t * Remove the instance from the Resource\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_933 = false;\n\tidIfCond_933 = this.contains(instance);\n\n\tif( idIfCond_933 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.unSetContainingResource(instance);\n\n\tkermeta.standard.helper.SetSuper.super_remove(this, instance);\n}\n\n'"
	 * @generated
	 */
	void remove(kermeta.language.structure.Object instance);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.clear();\n\n\torg.kermeta.compil.runtime.helper.persistence.Loader.load(getValues(), getUri(), getMetaModelURI());\n\n\tjava.lang.Boolean idIfCond_934 = false;\n\tidIfCond_934 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_934 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"Resource load failed!\");\n\n\tkermeta.exceptions.ResourceLoadException e = ((kermeta.exceptions.ResourceLoadException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.ResourceLoadException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Resource load failed, no object was created in this resource from \", this.getUri()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n'"
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Set<Object>.add(Object)\r\n\t * Add an instance to the Resource \r\n\t * Ensures that the instance is referenced by a one and only one Resource of the same Repository\r\n\t * Ensures that the instance does not appear more than once in the Resource\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.persistence.Resource> result_ft211 = null;\n\n\tkermeta.persistence.Resource elem_ft211 = null;\n\n\tresult_ft211 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.persistence.Resource>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft211 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getRepository().getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_936 = false;\n\twhile( !idLoopCond_936 ) {\n\tidLoopCond_936 = it_ft211.isOff();\n\tif ( idLoopCond_936 ) {\n\t} else {\n\n\telem_ft211 = it_ft211.next();\n\n\tjava.lang.Boolean idIfCond_937 = false;\n//BIle:selector\nkermeta.persistence.Resource r_lbdExp211 = elem_ft211;\n\n\tidIfCond_937 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(r_lbdExp211, this), r_lbdExp211.contains(instance));\n//EIle:selector\n\n\n\tif( idIfCond_937 ) {\n\n\tresult_ft211.add(elem_ft211);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft210 = result_ft211.iterator();\n\tjava.lang.Boolean idLoopCond_935 = false;\n\twhile( !idLoopCond_935 ) {\n\tidLoopCond_935 = it_ft210.isOff();\n\tif ( idLoopCond_935 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.persistence.Resource r_lbdExp210 = it_ft210.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"DVK ! another resource of the same repository was containing this element\");\n\n\tr_lbdExp210.remove(instance);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.setContainingResource(instance, this);\n\n\tkermeta.standard.helper.SetSuper.super_add(this, instance);\n'"
	 * @generated
	 */
	void add(kermeta.language.structure.Object instance);

} // EMFResource
