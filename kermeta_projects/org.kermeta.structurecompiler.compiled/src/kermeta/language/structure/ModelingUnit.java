/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnit.java,v 1.9 2008-11-27 15:50:02 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getIncludeFilters <em>Include Filters</em>}</li>
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_198 = false;\n\tidIfCond_198 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_198 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft47 = null;\n\n\tkermeta.language.structure.Package elem_ft47 = null;\n\n\tresult_ft47 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_199 = false;\n\twhile( !idLoopCond_199 ) {\n\tidLoopCond_199 = kermeta.standard.helper.BooleanWrapper.or(it_ft47.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft47, null));\n\tif ( idLoopCond_199 ) {\n\t} else {\n\n\telem_ft47 = it_ft47.next();\n\n\tjava.lang.Boolean idIfCond_200 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp47 = elem_ft47;\n\n\tidIfCond_200 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp47.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_200 ) {\n\n\tresult_ft47 = elem_ft47;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft47;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_201 = false;\n\tidIfCond_201 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_201 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_202 = false;\n\twhile( !idLoopCond_202 ) {\n\tidLoopCond_202 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_202 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft48 = null;\n\n\tkermeta.language.structure.Package elem_ft48 = null;\n\n\tresult_ft48 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft48 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_203 = false;\n\twhile( !idLoopCond_203 ) {\n\tidLoopCond_203 = kermeta.standard.helper.BooleanWrapper.or(it_ft48.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft48, null));\n\tif ( idLoopCond_203 ) {\n\t} else {\n\n\telem_ft48 = it_ft48.next();\n\n\tjava.lang.Boolean idIfCond_204 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp48 = elem_ft48;\n\n\tidIfCond_204 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp48.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_204 ) {\n\n\tresult_ft48 = elem_ft48;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft48;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n}\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_205 = false;\n\twhile( !idLoopCond_205 ) {\n\tidLoopCond_205 = it_ft50.isOff();\n\tif ( idLoopCond_205 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp50 = it_ft50.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp49 = o_lbdExp50;\n\n\tp_lbdExp49.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_206 = false;\n\twhile( !idLoopCond_206 ) {\n\tidLoopCond_206 = it_ft51.isOff();\n\tif ( idLoopCond_206 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp51 = it_ft51.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp49 = p_lbdExp51;\n\n\tp_lbdExp49.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_207 = false;\n\twhile( !idLoopCond_207 ) {\n\tidLoopCond_207 = it_ft52.isOff();\n\tif ( idLoopCond_207 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp52 = it_ft52.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp49 = p_lbdExp52;\n\n\tp_lbdExp49.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_208 = false;\n\twhile( !idLoopCond_208 ) {\n\tidLoopCond_208 = it_ft53.isOff();\n\tif ( idLoopCond_208 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp53 = it_ft53.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp49 = p_lbdExp53;\n\n\tp_lbdExp49.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_209 = false;\n\twhile( !idLoopCond_209 ) {\n\tidLoopCond_209 = it_ft54.isOff();\n\tif ( idLoopCond_209 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp54 = it_ft54.next();\n\n\tkermeta.standard.Sequence<ecore.EPackage> eps = null;\n//BIft:select\n\nkermeta.standard.Sequence<ecore.EPackage> result_ft55 = null;\n\n\tecore.EPackage elem_ft55 = null;\n\n\tresult_ft55 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EPackage>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_210 = false;\n\twhile( !idLoopCond_210 ) {\n\tidLoopCond_210 = it_ft55.isOff();\n\tif ( idLoopCond_210 ) {\n\t} else {\n\n\telem_ft55 = it_ft55.next();\n\n\tjava.lang.Boolean idIfCond_211 = false;\n//BIle:selector\necore.EPackage ep_lbdExp55 = elem_ft55;\n\n\tidIfCond_211 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp54.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(ep_lbdExp55.getName()));\n//EIle:selector\n\n\n\tif( idIfCond_211 ) {\n\n\tresult_ft55.add(elem_ft55);\n}\n\n}\n\t}\n}\n\n\n//CE\neps = result_ft55;\n//EIft:select\n\n\n\tjava.lang.Boolean idIfCond_212 = false;\n\tidIfCond_212 = kermeta.standard.helper.IntegerWrapper.isGreater(eps.size(), 0);\n\n\tif( idIfCond_212 ) {\n\n\tjava.lang.Boolean idIfCond_213 = false;\n\tidIfCond_213 = kermeta.standard.helper.IntegerWrapper.equals(eps.size(), 1);\n\n\tif( idIfCond_213 ) {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft56 = null;\n\n\tkermeta.language.structure.Package elem_ft56 = null;\n\n\tresult_ft56 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_214 = false;\n\twhile( !idLoopCond_214 ) {\n\tidLoopCond_214 = kermeta.standard.helper.BooleanWrapper.or(it_ft56.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft56, null));\n\tif ( idLoopCond_214 ) {\n\t} else {\n\n\telem_ft56 = it_ft56.next();\n\n\tjava.lang.Boolean idIfCond_215 = false;\n//BIle:detector\nkermeta.language.structure.Package pack_lbdExp56 = elem_ft56;\n\n\tidIfCond_215 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(pack_lbdExp56.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp54.getName()));\n//EIle:detector\n\n\n\tif( idIfCond_215 ) {\n\n\tresult_ft56 = elem_ft56;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_ft56.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp54.getName()), \"0\"));\n}\n\n\n\tp_lbdExp54.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp54.getName()), kermeta.standard.helper.IntegerWrapper.toString(eps.size())));\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp54.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_216 = false;\n\twhile( !idLoopCond_216 ) {\n\tidLoopCond_216 = it_ft57.isOff();\n\tif ( idLoopCond_216 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp57 = it_ft57.next();\n\n\tjava.lang.Boolean staticOperationMode_backup = context.getStaticOperationMode();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp57, context);\n\n\tcontext.setStaticOperationMode(staticOperationMode_backup);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tresult = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_217 = false;\n\tidIfCond_217 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_217 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft58 = null;\n\n\tecore.EPackage elem_ft58 = null;\n\n\tresult_ft58 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_218 = false;\n\twhile( !idLoopCond_218 ) {\n\tidLoopCond_218 = kermeta.standard.helper.BooleanWrapper.or(it_ft58.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft58, null));\n\tif ( idLoopCond_218 ) {\n\t} else {\n\n\telem_ft58 = it_ft58.next();\n\n\tjava.lang.Boolean idIfCond_219 = false;\n//BIle:detector\necore.EPackage p_lbdExp58 = elem_ft58;\n\n\tidIfCond_219 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp58.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_219 ) {\n\n\tresult_ft58 = elem_ft58;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft58;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_220 = false;\n\tidIfCond_220 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_220 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_221 = false;\n\twhile( !idLoopCond_221 ) {\n\tidLoopCond_221 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_221 ) {\n\t} else {\n\n\t//BIft:detect\n\necore.EPackage result_ft59 = null;\n\n\tecore.EPackage elem_ft59 = null;\n\n\tresult_ft59 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_222 = false;\n\twhile( !idLoopCond_222 ) {\n\tidLoopCond_222 = kermeta.standard.helper.BooleanWrapper.or(it_ft59.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft59, null));\n\tif ( idLoopCond_222 ) {\n\t} else {\n\n\telem_ft59 = it_ft59.next();\n\n\tjava.lang.Boolean idIfCond_223 = false;\n//BIle:detector\necore.EPackage p_lbdExp59 = elem_ft59;\n\n\tidIfCond_223 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp59.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_223 ) {\n\n\tresult_ft59 = elem_ft59;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft59;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\necore.EClassifier result_ft60 = null;\n\n\tecore.EClassifier elem_ft60 = null;\n\n\tresult_ft60 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_224 = false;\n\twhile( !idLoopCond_224 ) {\n\tidLoopCond_224 = kermeta.standard.helper.BooleanWrapper.or(it_ft60.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft60, null));\n\tif ( idLoopCond_224 ) {\n\t} else {\n\n\telem_ft60 = it_ft60.next();\n\n\tjava.lang.Boolean idIfCond_225 = false;\n//BIle:detector\necore.EClassifier c_lbdExp60 = elem_ft60;\n\n\tidIfCond_225 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp60.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_225 ) {\n\n\tresult_ft60 = elem_ft60;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft60;\n//EIft:detect\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_226 = false;\n\tidIfCond_226 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\")));\n\n\tif( idIfCond_226 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).clear();\n}\n\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_227 = false;\n\tidIfCond_227 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(smContext));\n\n\tif( idIfCond_227 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMMethod\"));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n\n\tstaticMethod.setTypeParameters(\"G\");\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMReturn\"));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_228 = false;\n\tidIfCond_228 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(smReturn.getType());\n\n\tif( idIfCond_228 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_229 = false;\n\twhile( !idLoopCond_229 ) {\n\tidLoopCond_229 = it_ft61.isOff();\n\tif ( idLoopCond_229 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp61 = it_ft61.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tparam.setName(p_lbdExp61.getName());\n\n\tjava.lang.Boolean idIfCond_230 = false;\n\tidIfCond_230 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp61.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_230 ) {\n\n\tparam.setType(p_lbdExp61.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_231 = false;\n\tidIfCond_231 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(param.getType());\n\n\tif( idIfCond_231 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_232 = false;\n\twhile( !idLoopCond_232 ) {\n\tidLoopCond_232 = it_ft62.isOff();\n\tif ( idLoopCond_232 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp62 = it_ft62.next();\n\n\tresult.add(p_lbdExp62);\n\n\tresult.addAll(p_lbdExp62.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_233 = false;\n\twhile( !idLoopCond_233 ) {\n\tidLoopCond_233 = it_ft64.isOff();\n\tif ( idLoopCond_233 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp64 = it_ft64.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp63 = o_lbdExp64;\n\n\tp_lbdExp63.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_234 = false;\n\twhile( !idLoopCond_234 ) {\n\tidLoopCond_234 = it_ft65.isOff();\n\tif ( idLoopCond_234 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp65 = it_ft65.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp63 = p_lbdExp65;\n\n\tp_lbdExp63.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_235 = false;\n\twhile( !idLoopCond_235 ) {\n\tidLoopCond_235 = it_ft66.isOff();\n\tif ( idLoopCond_235 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp66 = it_ft66.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp63 = p_lbdExp66;\n\n\tp_lbdExp63.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_236 = false;\n\twhile( !idLoopCond_236 ) {\n\tidLoopCond_236 = it_ft67.isOff();\n\tif ( idLoopCond_236 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp67 = it_ft67.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp63 = p_lbdExp67;\n\n\tp_lbdExp63.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_237 = false;\n\tidIfCond_237 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_237 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft68 = null;\n\n\tkermeta.language.structure.Package elem_ft68 = null;\n\n\tresult_ft68 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_238 = false;\n\twhile( !idLoopCond_238 ) {\n\tidLoopCond_238 = kermeta.standard.helper.BooleanWrapper.or(it_ft68.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft68, null));\n\tif ( idLoopCond_238 ) {\n\t} else {\n\n\telem_ft68 = it_ft68.next();\n\n\tjava.lang.Boolean idIfCond_239 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp68 = elem_ft68;\n\n\tidIfCond_239 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp68.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_239 ) {\n\n\tresult_ft68 = elem_ft68;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft68;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_240 = false;\n\twhile( !idLoopCond_240 ) {\n\tidLoopCond_240 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_240 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft69 = null;\n\n\tkermeta.language.structure.Package elem_ft69 = null;\n\n\tresult_ft69 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_241 = false;\n\twhile( !idLoopCond_241 ) {\n\tidLoopCond_241 = kermeta.standard.helper.BooleanWrapper.or(it_ft69.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft69, null));\n\tif ( idLoopCond_241 ) {\n\t} else {\n\n\telem_ft69 = it_ft69.next();\n\n\tjava.lang.Boolean idIfCond_242 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp69 = elem_ft69;\n\n\tidIfCond_242 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp69.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_242 ) {\n\n\tresult_ft69 = elem_ft69;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft69;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft70 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft70 = null;\n\n\tresult_ft70 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_243 = false;\n\twhile( !idLoopCond_243 ) {\n\tidLoopCond_243 = kermeta.standard.helper.BooleanWrapper.or(it_ft70.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft70, null));\n\tif ( idLoopCond_243 ) {\n\t} else {\n\n\telem_ft70 = it_ft70.next();\n\n\tjava.lang.Boolean idIfCond_244 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp70 = elem_ft70;\n\n\tidIfCond_244 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp70.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_244 ) {\n\n\tresult_ft70 = elem_ft70;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft70;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

} // ModelingUnit
