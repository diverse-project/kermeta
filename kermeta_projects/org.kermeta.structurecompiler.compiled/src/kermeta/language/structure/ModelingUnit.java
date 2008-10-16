/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnit.java,v 1.5 2008-10-16 13:17:59 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EAnnotation;
import ecore.EClassifier;
import ecore.EPackage;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getEcorePackages <em>Ecore Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getUsings <em>Usings</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
 *        annotation="kermeta documentation='The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\nIt also reference others modeling unit.'"
 * @generated
 */
public interface ModelingUnit extends Traceability<EAnnotation> {
	/**
	 * Returns the value of the '<em><b>Ecore Packages</b></em>' reference list.
	 * The list contents are of type {@link ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Packages</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_EcorePackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getEcorePackages();

	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_Usings()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Set of \"using\" statement associated with this ModelingUnit. Ie. list of \"syntatic shortcut\"\nthat can be used within this unit.'"
	 * @generated
	 */
	EList<Using> getUsings();

	/**
	 * Returns the value of the '<em><b>Include Filters</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Filters</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_IncludeFilters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='list of filters that apply to this modeling unit.\nThis means that if the same unit was loaded without this filters, it would have loaded more content\nonly element whose qualified name begins with one of these filter will be loaded in the unit'"
	 * @generated
	 */
	EList<Filter> getIncludeFilters();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_Packages()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='root packages contained by this ModelingUnit'"
	 * @generated
	 */
	EList<kermeta.language.structure.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Super Operations To Compile In Helper</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Operations To Compile In Helper</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Operations To Compile In Helper</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_SuperOperationsToCompileInHelper()
	 * @model
	 * @generated
	 */
	EList<Operation> getSuperOperationsToCompileInHelper();

	/**
	 * Returns the value of the '<em><b>Exclude Filters</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Filters</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_ExcludeFilters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='list of filters that apply to this modeling unit.\nThis means that if the same unit was loaded without this filters, it would have loaded more content\nelement whose qualified name begins with one of these filter will NOT be loaded in the unit'"
	 * @generated
	 */
	EList<Filter> getExcludeFilters();

	/**
	 * Returns the value of the '<em><b>Referenced Modeling Units</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.ModelingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Modeling Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Modeling Units</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_ReferencedModelingUnits()
	 * @model annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EList<ModelingUnit> getReferencedModelingUnits();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Require}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_Requires()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Set of \"require\" statements associated with this ModelingUnit. Ie. list of the other\nfiles required to run this unit'"
	 * @generated
	 */
	EList<Require> getRequires();

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' reference list.
	 * The list contents are of type {@link ecore.EAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_EntryPoints()
	 * @model
	 * @generated
	 */
	EList<EAnnotation> getEntryPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_321 = false;\n\tidIfCond_321 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_321 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft88 = null;\n\n\tkermeta.language.structure.Package elem_ft88 = null;\n\n\tresult_ft88 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_322 = false;\n\twhile( !idLoopCond_322 ) {\n\tidLoopCond_322 = kermeta.standard.helper.BooleanWrapper.or(it_ft88.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft88, null));\n\tif ( idLoopCond_322 ) {\n\t} else {\n\n\telem_ft88 = it_ft88.next();\n\n\tjava.lang.Boolean idIfCond_323 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp88 = elem_ft88;\n\n\tidIfCond_323 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp88.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_323 ) {\n\n\tresult_ft88 = elem_ft88;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft88;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_324 = false;\n\tidIfCond_324 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(pack));\n\n\tif( idIfCond_324 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_325 = false;\n\twhile( !idLoopCond_325 ) {\n\tidLoopCond_325 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_325 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft89 = null;\n\n\tkermeta.language.structure.Package elem_ft89 = null;\n\n\tresult_ft89 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_326 = false;\n\twhile( !idLoopCond_326 ) {\n\tidLoopCond_326 = kermeta.standard.helper.BooleanWrapper.or(it_ft89.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft89, null));\n\tif ( idLoopCond_326 ) {\n\t} else {\n\n\telem_ft89 = it_ft89.next();\n\n\tjava.lang.Boolean idIfCond_327 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp89 = elem_ft89;\n\n\tidIfCond_327 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp89.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_327 ) {\n\n\tresult_ft89 = elem_ft89;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft89;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Package retrievePackage(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * We cannot use an Alias to define this indiretion because the concept of KRuntimeError does not exist\n\t * in framework.ecore, thus we create in this operation a new EDataType that targets the KRuntimeError Java Impl\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EDataType exception_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\texception_EDataType.setName(\"KRuntimeError\");\n\n\texception_EDataType.setInstanceClassName(context.getJAVA_CLASS_EXCEPTION_SWITCHER());\n\n\texception_EDataType.setSerializable(false);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(this.retrievePackage(\"kermeta::exceptions\").getEcoreModelElement().getEClassifiers()).add(exception_EDataType);\n'"
	 * @generated
	 */
	void createKRuntimeError(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_328 = false;\n\twhile( !idLoopCond_328 ) {\n\tidLoopCond_328 = it_ft91.isOff();\n\tif ( idLoopCond_328 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp91 = it_ft91.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp90 = o_lbdExp91;\n\n\tp_lbdExp90.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_329 = false;\n\twhile( !idLoopCond_329 ) {\n\tidLoopCond_329 = it_ft92.isOff();\n\tif ( idLoopCond_329 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp92 = it_ft92.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp90 = p_lbdExp92;\n\n\tp_lbdExp90.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_330 = false;\n\twhile( !idLoopCond_330 ) {\n\tidLoopCond_330 = it_ft93.isOff();\n\tif ( idLoopCond_330 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp93 = it_ft93.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp90 = p_lbdExp93;\n\n\tp_lbdExp90.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_331 = false;\n\twhile( !idLoopCond_331 ) {\n\tidLoopCond_331 = it_ft94.isOff();\n\tif ( idLoopCond_331 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp94 = it_ft94.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp90 = p_lbdExp94;\n\n\tp_lbdExp90.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_332 = false;\n\twhile( !idLoopCond_332 ) {\n\tidLoopCond_332 = it_ft95.isOff();\n\tif ( idLoopCond_332 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp95 = it_ft95.next();\n\n\tkermeta.standard.Sequence<ecore.EPackage> eps = null;\n//BIft:select\n\nkermeta.standard.Sequence<ecore.EPackage> result_ft96 = null;\n\n\tecore.EPackage elem_ft96 = null;\n\n\tresult_ft96 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EPackage>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_333 = false;\n\twhile( !idLoopCond_333 ) {\n\tidLoopCond_333 = it_ft96.isOff();\n\tif ( idLoopCond_333 ) {\n\t} else {\n\n\telem_ft96 = it_ft96.next();\n\n\tjava.lang.Boolean idIfCond_334 = false;\n//BIle:selector\necore.EPackage ep_lbdExp96 = elem_ft96;\n\n\tidIfCond_334 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp95.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(ep_lbdExp96.getName()));\n//EIle:selector\n\n\n\tif( idIfCond_334 ) {\n\n\tresult_ft96.add(elem_ft96);\n}\n\n}\n\t}\n}\n\n\n//CE\neps = result_ft96;\n//EIft:select\n\n\n\tjava.lang.Boolean idIfCond_335 = false;\n\tidIfCond_335 = kermeta.standard.helper.IntegerWrapper.isGreater(eps.size(), 0);\n\n\tif( idIfCond_335 ) {\n\n\tjava.lang.Boolean idIfCond_336 = false;\n\tidIfCond_336 = kermeta.standard.helper.IntegerWrapper.equals(eps.size(), 1);\n\n\tif( idIfCond_336 ) {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft97 = null;\n\n\tkermeta.language.structure.Package elem_ft97 = null;\n\n\tresult_ft97 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_337 = false;\n\twhile( !idLoopCond_337 ) {\n\tidLoopCond_337 = kermeta.standard.helper.BooleanWrapper.or(it_ft97.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft97, null));\n\tif ( idLoopCond_337 ) {\n\t} else {\n\n\telem_ft97 = it_ft97.next();\n\n\tjava.lang.Boolean idIfCond_338 = false;\n//BIle:detector\nkermeta.language.structure.Package pack_lbdExp97 = elem_ft97;\n\n\tidIfCond_338 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(pack_lbdExp97.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp95.getName()));\n//EIle:detector\n\n\n\tif( idIfCond_338 ) {\n\n\tresult_ft97 = elem_ft97;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_ft97.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp95.getName()), \"0\"));\n}\n\n\n\tp_lbdExp95.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp95.getName()), kermeta.standard.helper.IntegerWrapper.toString(eps.size())));\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp95.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft98 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_339 = false;\n\twhile( !idLoopCond_339 ) {\n\tidLoopCond_339 = it_ft98.isOff();\n\tif ( idLoopCond_339 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp98 = it_ft98.next();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp98, context);\n\n\tcontext.setStaticOperationMode(false);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void compileSuperOperation(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.compileSuperOperation(context);\n\n\tthis.cleanEObject();\n'"
	 * @generated
	 */
	void postprocess(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get a EClassifer contained in the given Modeling Unit by qualifiedName\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tresult = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_340 = false;\n\tidIfCond_340 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_340 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft99 = null;\n\n\tecore.EPackage elem_ft99 = null;\n\n\tresult_ft99 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_341 = false;\n\twhile( !idLoopCond_341 ) {\n\tidLoopCond_341 = kermeta.standard.helper.BooleanWrapper.or(it_ft99.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft99, null));\n\tif ( idLoopCond_341 ) {\n\t} else {\n\n\telem_ft99 = it_ft99.next();\n\n\tjava.lang.Boolean idIfCond_342 = false;\n//BIle:detector\necore.EPackage p_lbdExp99 = elem_ft99;\n\n\tidIfCond_342 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp99.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_342 ) {\n\n\tresult_ft99 = elem_ft99;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft99;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_343 = false;\n\tidIfCond_343 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(pack));\n\n\tif( idIfCond_343 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_344 = false;\n\twhile( !idLoopCond_344 ) {\n\tidLoopCond_344 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_344 ) {\n\t} else {\n\n\t//BIft:detect\n\necore.EPackage result_ft100 = null;\n\n\tecore.EPackage elem_ft100 = null;\n\n\tresult_ft100 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_345 = false;\n\twhile( !idLoopCond_345 ) {\n\tidLoopCond_345 = kermeta.standard.helper.BooleanWrapper.or(it_ft100.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft100, null));\n\tif ( idLoopCond_345 ) {\n\t} else {\n\n\telem_ft100 = it_ft100.next();\n\n\tjava.lang.Boolean idIfCond_346 = false;\n//BIle:detector\necore.EPackage p_lbdExp100 = elem_ft100;\n\n\tidIfCond_346 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp100.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_346 ) {\n\n\tresult_ft100 = elem_ft100;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft100;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\necore.EClassifier result_ft101 = null;\n\n\tecore.EClassifier elem_ft101 = null;\n\n\tresult_ft101 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_347 = false;\n\twhile( !idLoopCond_347 ) {\n\tidLoopCond_347 = kermeta.standard.helper.BooleanWrapper.or(it_ft101.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft101, null));\n\tif ( idLoopCond_347 ) {\n\t} else {\n\n\telem_ft101 = it_ft101.next();\n\n\tjava.lang.Boolean idIfCond_348 = false;\n//BIle:detector\necore.EClassifier c_lbdExp101 = elem_ft101;\n\n\tidIfCond_348 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp101.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_348 ) {\n\n\tresult_ft101 = elem_ft101;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft101;\n//EIft:detect\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_349 = false;\n\tidIfCond_349 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getEClassifierByQualifiedName(\"ecore::EObject\")));\n\n\tif( idIfCond_349 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getEClassifierByQualifiedName(\"ecore::EObject\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).clear();\n}\n\n'"
	 * @generated
	 */
	void cleanEObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.createKRuntimeError(context);\n'"
	 * @generated
	 */
	void preprocess(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_350 = false;\n\tidIfCond_350 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(smContext));\n\n\tif( idIfCond_350 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMMethod\"));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMReturn\"));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_351 = false;\n\tidIfCond_351 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(smReturn.getType());\n\n\tif( idIfCond_351 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft102 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_352 = false;\n\twhile( !idLoopCond_352 ) {\n\tidLoopCond_352 = it_ft102.isOff();\n\tif ( idLoopCond_352 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp102 = it_ft102.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tparam.setName(p_lbdExp102.getName());\n\n\tjava.lang.Boolean idIfCond_353 = false;\n\tidIfCond_353 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p_lbdExp102.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_353 ) {\n\n\tparam.setType(p_lbdExp102.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_354 = false;\n\tidIfCond_354 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(param.getType());\n\n\tif( idIfCond_354 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void compileStaticOperation(Operation op, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAnnotation\"));\n\n\tecoreAnnotation.setSource(\"ModelingUnit\");\n\n\tecore.EStringToStringMapEntry requireEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EStringToStringMapEntry\"));\n\n\trequireEntry.setKey(\"require\");\n\n\trequireEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(requireEntry);\n\n\tecore.EStringToStringMapEntry usingEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EStringToStringMapEntry\"));\n\n\tusingEntry.setKey(\"using\");\n\n\tusingEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(usingEntry);\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_355 = false;\n\twhile( !idLoopCond_355 ) {\n\tidLoopCond_355 = it_ft103.isOff();\n\tif ( idLoopCond_355 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp103 = it_ft103.next();\n\n\tresult.add(p_lbdExp103);\n\n\tresult.addAll(p_lbdExp103.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_356 = false;\n\twhile( !idLoopCond_356 ) {\n\tidLoopCond_356 = it_ft105.isOff();\n\tif ( idLoopCond_356 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp105 = it_ft105.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp104 = o_lbdExp105;\n\n\tp_lbdExp104.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft106 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_357 = false;\n\twhile( !idLoopCond_357 ) {\n\tidLoopCond_357 = it_ft106.isOff();\n\tif ( idLoopCond_357 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp106 = it_ft106.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp104 = p_lbdExp106;\n\n\tp_lbdExp104.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft107 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_358 = false;\n\twhile( !idLoopCond_358 ) {\n\tidLoopCond_358 = it_ft107.isOff();\n\tif ( idLoopCond_358 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp107 = it_ft107.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp104 = p_lbdExp107;\n\n\tp_lbdExp104.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft108 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_359 = false;\n\twhile( !idLoopCond_359 ) {\n\tidLoopCond_359 = it_ft108.isOff();\n\tif ( idLoopCond_359 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp108 = it_ft108.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp104 = p_lbdExp108;\n\n\tp_lbdExp104.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_360 = false;\n\tidIfCond_360 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_360 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft109 = null;\n\n\tkermeta.language.structure.Package elem_ft109 = null;\n\n\tresult_ft109 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft109 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_361 = false;\n\twhile( !idLoopCond_361 ) {\n\tidLoopCond_361 = kermeta.standard.helper.BooleanWrapper.or(it_ft109.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft109, null));\n\tif ( idLoopCond_361 ) {\n\t} else {\n\n\telem_ft109 = it_ft109.next();\n\n\tjava.lang.Boolean idIfCond_362 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp109 = elem_ft109;\n\n\tidIfCond_362 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp109.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_362 ) {\n\n\tresult_ft109 = elem_ft109;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft109;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_363 = false;\n\twhile( !idLoopCond_363 ) {\n\tidLoopCond_363 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_363 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft110 = null;\n\n\tkermeta.language.structure.Package elem_ft110 = null;\n\n\tresult_ft110 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft110 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_364 = false;\n\twhile( !idLoopCond_364 ) {\n\tidLoopCond_364 = kermeta.standard.helper.BooleanWrapper.or(it_ft110.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft110, null));\n\tif ( idLoopCond_364 ) {\n\t} else {\n\n\telem_ft110 = it_ft110.next();\n\n\tjava.lang.Boolean idIfCond_365 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp110 = elem_ft110;\n\n\tidIfCond_365 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp110.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_365 ) {\n\n\tresult_ft110 = elem_ft110;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft110;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft111 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft111 = null;\n\n\tresult_ft111 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_366 = false;\n\twhile( !idLoopCond_366 ) {\n\tidLoopCond_366 = kermeta.standard.helper.BooleanWrapper.or(it_ft111.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft111, null));\n\tif ( idLoopCond_366 ) {\n\t} else {\n\n\telem_ft111 = it_ft111.next();\n\n\tjava.lang.Boolean idIfCond_367 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp111 = elem_ft111;\n\n\tidIfCond_367 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp111.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_367 ) {\n\n\tresult_ft111 = elem_ft111;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft111;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

} // ModelingUnit
