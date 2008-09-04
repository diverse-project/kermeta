/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelper.java,v 1.1 2008-09-04 15:40:35 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.ClassDefinition\"));\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op);\n\n\tecore.EOperation eop = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EOperation result_ft165 = null;\n\n\tecore.EOperation elem_ft165 = null;\n\n\tresult_ft165 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EOperation> it_ft165 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(cd.getEcoreModelElement().getEOperations()).iterator();\n\tjava.lang.Boolean idLoopCond_767 = false;\n\twhile( !idLoopCond_767 ) {\n\tidLoopCond_767 = kermeta.standard.helper.BooleanWrapper.or(it_ft165.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft165, null));\n\tif ( idLoopCond_767 ) {\n\t} else {\n\n\telem_ft165 = it_ft165.next();\n\n\tjava.lang.Boolean idIfCond_768 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EOperation c = elem_ft165;\n\n\tjava.lang.Boolean idIfCond_769 = false;\n\tidIfCond_769 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"));\n\n\tif( idIfCond_769 ) {\n\n\tidIfCond_768 = kermeta.standard.helper.StringWrapper.equals(((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"))).getName(), op.getName());\n}\n\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_768 ) {\n\n\tresult_ft165 = elem_ft165;\n}\n\n}\n\t}\n}\n\n\n//callElement\neop = result_ft165;\n//End of the Inlining of the function type: detect\n\n\n\tresult = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(eop, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\")));\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tkermeta.language.structure.Package pack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Package\"));\n\n\tpack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(cd);\n\n\tecore.EClassifier eclassifier = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EClassifier result_ft166 = null;\n\n\tecore.EClassifier elem_ft166 = null;\n\n\tresult_ft166 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft166 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_770 = false;\n\twhile( !idLoopCond_770 ) {\n\tidLoopCond_770 = kermeta.standard.helper.BooleanWrapper.or(it_ft166.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft166, null));\n\tif ( idLoopCond_770 ) {\n\t} else {\n\n\telem_ft166 = it_ft166.next();\n\n\tjava.lang.Boolean idIfCond_771 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EClassifier c = elem_ft166;\n\n\tjava.lang.Boolean idIfCond_772 = false;\n\tidIfCond_772 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_772 ) {\n\n\tidIfCond_771 = kermeta.standard.helper.StringWrapper.equals(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getName(), cd.getName());\n}\n\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_771 ) {\n\n\tresult_ft166 = elem_ft166;\n}\n\n}\n\t}\n}\n\n\n//callElement\neclassifier = result_ft166;\n//End of the Inlining of the function type: detect\n\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(eclassifier, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EClass findEClassProxy(ClassDefinition cd);

} // EcoreModelElementHelper
