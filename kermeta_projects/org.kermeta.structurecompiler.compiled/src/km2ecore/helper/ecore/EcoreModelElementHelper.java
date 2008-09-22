/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelper.java,v 1.3 2008-09-22 14:49:08 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import ecore.EClass;
import ecore.EOperation;
import ecore.EStructuralFeature;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.ecore.EcorePackage#getEcoreModelElementHelper()
 * @model
 * @generated
 */
public interface EcoreModelElementHelper extends
		kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta deprecated='unused'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.ClassDefinition\"));\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op);\n\n\tecore.EOperation eop = null;\n//BIft:detect\n\necore.EOperation result_ft236 = null;\n\n\tecore.EOperation elem_ft236 = null;\n\n\tresult_ft236 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EOperation> it_ft236 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(cd.getEcoreModelElement().getEOperations()).iterator();\n\tjava.lang.Boolean idLoopCond_1008 = false;\n\twhile( !idLoopCond_1008 ) {\n\tidLoopCond_1008 = kermeta.standard.helper.BooleanWrapper.or(it_ft236.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft236, null));\n\tif ( idLoopCond_1008 ) {\n\t} else {\n\n\telem_ft236 = it_ft236.next();\n\n\tjava.lang.Boolean idIfCond_1009 = false;\n//BIle:detector\necore.EOperation c_lbdExp236 = elem_ft236;\n\n\tjava.lang.Boolean idIfCond_1010 = false;\n\tidIfCond_1010 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c_lbdExp236, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"));\n\n\tif( idIfCond_1010 ) {\n\n\tidIfCond_1009 = kermeta.standard.helper.StringWrapper.equals(((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c_lbdExp236, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"))).getName(), op.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_1009 ) {\n\n\tresult_ft236 = elem_ft236;\n}\n\n}\n\t}\n}\n\n\n//CE\neop = result_ft236;\n//EIft:detect\n\n\n\tresult = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(eop, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation findEOperationProxy(Operation op);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecoreStructuralFeature.setName(self_.getFinalName());\n\n\tecoreStructuralFeature.setOrdered(self_.getIsOrdered());\n\n\tecoreStructuralFeature.setUnique(self_.getIsUnique());\n\n\tecoreStructuralFeature.setLowerBound(self_.getLower());\n\n\tecoreStructuralFeature.setUpperBound(self_.getUpper());\n\n\tecoreStructuralFeature.setDerived(self_.getIsDerived());\n'"
	 * @generated
	 */
	void setEStructuralFeatureProperties(Property self_,
			EStructuralFeature ecoreStructuralFeature, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta deprecated='unused'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tkermeta.language.structure.Package pack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Package\"));\n\n\tpack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(cd);\n\n\tecore.EClassifier eclassifier = null;\n//BIft:detect\n\necore.EClassifier result_ft237 = null;\n\n\tecore.EClassifier elem_ft237 = null;\n\n\tresult_ft237 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft237 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_1011 = false;\n\twhile( !idLoopCond_1011 ) {\n\tidLoopCond_1011 = kermeta.standard.helper.BooleanWrapper.or(it_ft237.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft237, null));\n\tif ( idLoopCond_1011 ) {\n\t} else {\n\n\telem_ft237 = it_ft237.next();\n\n\tjava.lang.Boolean idIfCond_1012 = false;\n//BIle:detector\necore.EClassifier c_lbdExp237 = elem_ft237;\n\n\tjava.lang.Boolean idIfCond_1013 = false;\n\tidIfCond_1013 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c_lbdExp237, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_1013 ) {\n\n\tidIfCond_1012 = kermeta.standard.helper.StringWrapper.equals(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c_lbdExp237, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getName(), cd.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_1012 ) {\n\n\tresult_ft237 = elem_ft237;\n}\n\n}\n\t}\n}\n\n\n//CE\neclassifier = result_ft237;\n//EIft:detect\n\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(eclassifier, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EClass findEClassProxy(ClassDefinition cd);

} // EcoreModelElementHelper
