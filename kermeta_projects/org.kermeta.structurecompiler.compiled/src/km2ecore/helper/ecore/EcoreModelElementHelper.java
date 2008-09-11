/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelper.java,v 1.2 2008-09-11 12:34:55 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.ClassDefinition\"));\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op);\n\n\tecore.EOperation eop = null;\n//BIft:detect\n\necore.EOperation result_ft2 = null;\n\n\tecore.EOperation elem_ft2 = null;\n\n\tresult_ft2 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EOperation> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(cd.getEcoreModelElement().getEOperations()).iterator();\n\tjava.lang.Boolean idLoopCond_11 = false;\n\twhile( !idLoopCond_11 ) {\n\tidLoopCond_11 = kermeta.standard.helper.BooleanWrapper.or(it_ft2.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft2, null));\n\tif ( idLoopCond_11 ) {\n\t} else {\n\n\telem_ft2 = it_ft2.next();\n\n\tjava.lang.Boolean idIfCond_12 = false;\n//BIle:detector\necore.EOperation c_lbdExp2 = elem_ft2;\n\n\tjava.lang.Boolean idIfCond_13 = false;\n\tidIfCond_13 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c_lbdExp2, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"));\n\n\tif( idIfCond_13 ) {\n\n\tidIfCond_12 = kermeta.standard.helper.StringWrapper.equals(((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c_lbdExp2, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"))).getName(), op.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_12 ) {\n\n\tresult_ft2 = elem_ft2;\n}\n\n}\n\t}\n}\n\n\n//CE\neop = result_ft2;\n//EIft:detect\n\n\n\tresult = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(eop, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\")));\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tkermeta.language.structure.Package pack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Package\"));\n\n\tpack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(cd);\n\n\tecore.EClassifier eclassifier = null;\n//BIft:detect\n\necore.EClassifier result_ft3 = null;\n\n\tecore.EClassifier elem_ft3 = null;\n\n\tresult_ft3 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_14 = false;\n\twhile( !idLoopCond_14 ) {\n\tidLoopCond_14 = kermeta.standard.helper.BooleanWrapper.or(it_ft3.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft3, null));\n\tif ( idLoopCond_14 ) {\n\t} else {\n\n\telem_ft3 = it_ft3.next();\n\n\tjava.lang.Boolean idIfCond_15 = false;\n//BIle:detector\necore.EClassifier c_lbdExp3 = elem_ft3;\n\n\tjava.lang.Boolean idIfCond_16 = false;\n\tidIfCond_16 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_16 ) {\n\n\tidIfCond_15 = kermeta.standard.helper.StringWrapper.equals(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getName(), cd.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_15 ) {\n\n\tresult_ft3 = elem_ft3;\n}\n\n}\n\t}\n}\n\n\n//CE\neclassifier = result_ft3;\n//EIft:detect\n\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(eclassifier, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EClass findEClassProxy(ClassDefinition cd);

} // EcoreModelElementHelper
