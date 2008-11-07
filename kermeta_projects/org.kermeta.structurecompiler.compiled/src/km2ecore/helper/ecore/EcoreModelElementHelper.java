/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelper.java,v 1.8 2008-11-07 08:53:59 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.ClassDefinition\"));\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op));\n\n\tecore.EOperation eop = null;\n//BIft:detect\n\necore.EOperation result_ft6 = null;\n\n\tecore.EOperation elem_ft6 = null;\n\n\tresult_ft6 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EOperation> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(cd.getEcoreModelElement().getEOperations()).iterator();\n\tjava.lang.Boolean idLoopCond_24 = false;\n\twhile( !idLoopCond_24 ) {\n\tidLoopCond_24 = kermeta.standard.helper.BooleanWrapper.or(it_ft6.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft6, null));\n\tif ( idLoopCond_24 ) {\n\t} else {\n\n\telem_ft6 = it_ft6.next();\n\n\tjava.lang.Boolean idIfCond_25 = false;\n//BIle:detector\necore.EOperation c_lbdExp6 = elem_ft6;\n\n\tjava.lang.Boolean idIfCond_26 = false;\n\tidIfCond_26 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp6, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"));\n\n\tif( idIfCond_26 ) {\n\n\tidIfCond_25 = kermeta.standard.helper.StringWrapper.equals(((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp6, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"))).getName(), op.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_25 ) {\n\n\tresult_ft6 = elem_ft6;\n}\n\n}\n\t}\n}\n\n\n//CE\neop = result_ft6;\n//EIft:detect\n\n\n\tresult = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(eop, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation findEOperationProxy(Operation op);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecoreStructuralFeature.setName(self_.getFinalName(context));\n\n\tecoreStructuralFeature.setOrdered(self_.getIsOrdered());\n\n\tecoreStructuralFeature.setUnique(self_.getIsUnique());\n\n\tecoreStructuralFeature.setLowerBound(self_.getLower());\n\n\tecoreStructuralFeature.setUpperBound(self_.getUpper());\n\n\tecoreStructuralFeature.setChangeable(kermeta.standard.helper.BooleanWrapper.not(self_.getIsReadOnly()));\n\n\tecoreStructuralFeature.setDefaultValueLiteral(self_.get_default());\n\n\tecoreStructuralFeature.setDerived(self_.getIsDerived());\n'"
	 * @generated
	 */
	void setEStructuralFeatureProperties(Property self_,
			EStructuralFeature ecoreStructuralFeature, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta deprecated='unused'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tkermeta.language.structure.Package pack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Package\"));\n\n\tpack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.Package>asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(cd));\n\n\tecore.EClassifier eclassifier = null;\n//BIft:detect\n\necore.EClassifier result_ft7 = null;\n\n\tecore.EClassifier elem_ft7 = null;\n\n\tresult_ft7 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft7 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_27 = false;\n\twhile( !idLoopCond_27 ) {\n\tidLoopCond_27 = kermeta.standard.helper.BooleanWrapper.or(it_ft7.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft7, null));\n\tif ( idLoopCond_27 ) {\n\t} else {\n\n\telem_ft7 = it_ft7.next();\n\n\tjava.lang.Boolean idIfCond_28 = false;\n//BIle:detector\necore.EClassifier c_lbdExp7 = elem_ft7;\n\n\tjava.lang.Boolean idIfCond_29 = false;\n\tidIfCond_29 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_29 ) {\n\n\tidIfCond_28 = kermeta.standard.helper.StringWrapper.equals(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getName(), cd.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_28 ) {\n\n\tresult_ft7 = elem_ft7;\n}\n\n}\n\t}\n}\n\n\n//CE\neclassifier = result_ft7;\n//EIft:detect\n\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(eclassifier, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EClass findEClassProxy(ClassDefinition cd);

} // EcoreModelElementHelper
