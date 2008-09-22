/**
 * <copyright>
 * </copyright>
 *
 * $Id: Model.java,v 1.3 2008-09-22 14:47:40 cfaucher Exp $
 */
package kermeta.language.structure;

import kermeta.standard.Collection;
import kermeta.standard.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Model#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModel()
 * @model annotation="kermeta documentation='Is the holder of a set of model elements (Object) that are compatible with the ModelType that has \ninstantiated this Model.'"
 * @generated
 */
public interface Model extends kermeta.language.structure.Object {
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
	 * @see kermeta.language.structure.StructurePackage#getModel_Contents()
	 * @model annotation="kermeta documentation='Contents of this model...'"
	 * @generated
	 */
	EList<kermeta.language.structure.Object> getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n \t * Add the Object if it is copmpatible with the ModelDefinition. Other objects are ignored.\r\n \t * Returns the object if it has been added (One can check that some element have been ignored or not)\r\n \t * return Void if not added\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsOrderedSet(this.getContents());\n\n\tresult = org.kermeta.compil.runtime.helper.language.ModelUtil.addCompatible(this, objectToAdd);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object addCompatible(
			kermeta.language.structure.Object objectToAdd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n \t * Remove an object from the model\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.remove(contents, obj);\n'"
	 * @generated
	 */
	void remove(kermeta.language.structure.Object obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n \t * Add all the Object of the collection that are copmpatible with the ModelDefinition. Other objects are ignored.\r\n \t * Returns the list of Object that have been added (One can check that some element have been ignored or not)\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Collection<kermeta.language.structure.Object> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Object>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft132 = objectsToAdd.iterator();\n\tjava.lang.Boolean idLoopCond_672 = false;\n\twhile( !idLoopCond_672 ) {\n\tidLoopCond_672 = it_ft132.isOff();\n\tif ( idLoopCond_672 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object obj_lbdExp132 = it_ft132.next();\n\n\tkermeta.language.structure.Object addedObject = this.addCompatible(obj_lbdExp132);\n\n\tjava.lang.Boolean idIfCond_673 = false;\n\tidIfCond_673 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(addedObject));\n\n\tif( idIfCond_673 ) {\n\n\tresult.add(obj_lbdExp132);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Collection<kermeta.language.structure.Object> addAllCompatible(
			Collection<kermeta.language.structure.Object> objectsToAdd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n \t * Add an object to the model. According to the ModelType, the typechecker will statically verify if the object can be added or not\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsOrderedSet(this.getContents());\n\n\torg.kermeta.compil.runtime.helper.language.ModelUtil.add(this, obj);\n'"
	 * @generated
	 */
	void add(kermeta.language.structure.Object obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n \t * Returns a set of all the elements of the model that are instance of the given Type\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Object> result = null;\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Object> result_ft133 = null;\n\n\tkermeta.language.structure.Object elem_ft133 = null;\n\n\tresult_ft133 = ((kermeta.standard.Sequence<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Object>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft133 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Object>convertAsOrderedSet(this.getContents()).iterator();\n\tjava.lang.Boolean idLoopCond_674 = false;\n\twhile( !idLoopCond_674 ) {\n\tidLoopCond_674 = it_ft133.isOff();\n\tif ( idLoopCond_674 ) {\n\t} else {\n\n\telem_ft133 = it_ft133.next();\n\n\tjava.lang.Boolean idIfCond_675 = false;\n//BIle:selector\nkermeta.language.structure.Object o_lbdExp133 = elem_ft133;\n\n\tidIfCond_675 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(typeName, o_lbdExp133);\n//EIle:selector\n\n\n\tif( idIfCond_675 ) {\n\n\tresult_ft133.add(elem_ft133);\n}\n\n}\n\t}\n}\n\n//EIft:select\nresult = result_ft133.asSet();\n\nreturn result;\n'"
	 * @generated
	 */
	Set<kermeta.language.structure.Object> filter(Type typeName);

} // Model
