/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnit.java,v 1.10 2009-01-21 09:15:58 cfaucher Exp $
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
 * @model annotation="kermeta documentation='The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\nIt also reference others modeling unit.'"
 *        annotation="kermeta documentation='/**\r\n *\r\n \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_43 = false;\n\tidIfCond_43 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_43 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft14 = null;\n\n\tkermeta.language.structure.Package elem_ft14 = null;\n\n\tresult_ft14 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_44 = false;\n\twhile( !idLoopCond_44 ) {\n\tidLoopCond_44 = kermeta.standard.helper.BooleanWrapper.or(it_ft14.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft14, null));\n\tif ( idLoopCond_44 ) {\n\t} else {\n\n\telem_ft14 = it_ft14.next();\n\n\tjava.lang.Boolean idIfCond_45 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp14 = elem_ft14;\n\n\tidIfCond_45 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp14.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_45 ) {\n\n\tresult_ft14 = elem_ft14;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft14;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_46 = false;\n\tidIfCond_46 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_46 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_47 = false;\n\twhile( !idLoopCond_47 ) {\n\tidLoopCond_47 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_47 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft15 = null;\n\n\tkermeta.language.structure.Package elem_ft15 = null;\n\n\tresult_ft15 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_48 = false;\n\twhile( !idLoopCond_48 ) {\n\tidLoopCond_48 = kermeta.standard.helper.BooleanWrapper.or(it_ft15.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft15, null));\n\tif ( idLoopCond_48 ) {\n\t} else {\n\n\telem_ft15 = it_ft15.next();\n\n\tjava.lang.Boolean idIfCond_49 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp15 = elem_ft15;\n\n\tidIfCond_49 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp15.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_49 ) {\n\n\tresult_ft15 = elem_ft15;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft15;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Package retrievePackage(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * We cannot use an Alias to define this indiretion because the concept of KRuntimeError does not exist\r\n\t * in framework.ecore, thus we create in this operation a new EDataType that targets the KRuntimeError Java Impl\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EDataType exception_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));\n\n\texception_EDataType.setName(\"KRuntimeError\");\n\n\texception_EDataType.setInstanceClassName(context.getJAVA_CLASS_EXCEPTION_SWITCHER());\n\n\texception_EDataType.setSerializable(false);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(this.retrievePackage(\"kermeta::exceptions\").getEcoreModelElement().getEClassifiers()).add(exception_EDataType);\n'"
	 * @generated
	 */
	void createKRuntimeError(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_50 = false;\n\twhile( !idLoopCond_50 ) {\n\tidLoopCond_50 = it_ft17.isOff();\n\tif ( idLoopCond_50 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp17 = it_ft17.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp16 = o_lbdExp17;\n\n\tp_lbdExp16.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_51 = false;\n\twhile( !idLoopCond_51 ) {\n\tidLoopCond_51 = it_ft18.isOff();\n\tif ( idLoopCond_51 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp18 = it_ft18.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp16 = p_lbdExp18;\n\n\tp_lbdExp16.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_52 = false;\n\twhile( !idLoopCond_52 ) {\n\tidLoopCond_52 = it_ft19.isOff();\n\tif ( idLoopCond_52 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp19 = it_ft19.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp16 = p_lbdExp19;\n\n\tp_lbdExp16.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_53 = false;\n\twhile( !idLoopCond_53 ) {\n\tidLoopCond_53 = it_ft20.isOff();\n\tif ( idLoopCond_53 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp20 = it_ft20.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp16 = p_lbdExp20;\n\n\tp_lbdExp16.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_54 = false;\n\twhile( !idLoopCond_54 ) {\n\tidLoopCond_54 = it_ft21.isOff();\n\tif ( idLoopCond_54 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp21 = it_ft21.next();\n\n\tkermeta.standard.Sequence<ecore.EPackage> eps = null;\n//BIft:select\n\nkermeta.standard.Sequence<ecore.EPackage> result_ft22 = null;\n\n\tecore.EPackage elem_ft22 = null;\n\n\tresult_ft22 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_55 = false;\n\twhile( !idLoopCond_55 ) {\n\tidLoopCond_55 = it_ft22.isOff();\n\tif ( idLoopCond_55 ) {\n\t} else {\n\n\telem_ft22 = it_ft22.next();\n\n\tjava.lang.Boolean idIfCond_56 = false;\n//BIle:selector\necore.EPackage ep_lbdExp22 = elem_ft22;\n\n\tidIfCond_56 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp21.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(ep_lbdExp22.getName()));\n//EIle:selector\n\n\n\tif( idIfCond_56 ) {\n\n\tresult_ft22.add(elem_ft22);\n}\n\n}\n\t}\n}\n\n\n//CE\neps = result_ft22;\n//EIft:select\n\n\n\tjava.lang.Boolean idIfCond_57 = false;\n\tidIfCond_57 = kermeta.standard.helper.IntegerWrapper.isGreater(eps.size(), 0);\n\n\tif( idIfCond_57 ) {\n\n\tjava.lang.Boolean idIfCond_58 = false;\n\tidIfCond_58 = kermeta.standard.helper.IntegerWrapper.equals(eps.size(), 1);\n\n\tif( idIfCond_58 ) {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft23 = null;\n\n\tkermeta.language.structure.Package elem_ft23 = null;\n\n\tresult_ft23 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_59 = false;\n\twhile( !idLoopCond_59 ) {\n\tidLoopCond_59 = kermeta.standard.helper.BooleanWrapper.or(it_ft23.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft23, null));\n\tif ( idLoopCond_59 ) {\n\t} else {\n\n\telem_ft23 = it_ft23.next();\n\n\tjava.lang.Boolean idIfCond_60 = false;\n//BIle:detector\nkermeta.language.structure.Package pack_lbdExp23 = elem_ft23;\n\n\tidIfCond_60 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(pack_lbdExp23.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp21.getName()));\n//EIle:detector\n\n\n\tif( idIfCond_60 ) {\n\n\tresult_ft23 = elem_ft23;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_ft23.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp21.getName()), \"0\"));\n}\n\n\n\tp_lbdExp21.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp21.getName()), kermeta.standard.helper.IntegerWrapper.toString(eps.size())));\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp21.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_61 = false;\n\twhile( !idLoopCond_61 ) {\n\tidLoopCond_61 = it_ft24.isOff();\n\tif ( idLoopCond_61 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp24 = it_ft24.next();\n\n\tjava.lang.Boolean staticOperationMode_backup = context.getStaticOperationMode();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp24, context);\n\n\tcontext.setStaticOperationMode(staticOperationMode_backup);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 *        annotation="kermeta documentation='/**\r\n\t * Get a EClassifer contained in the given Modeling Unit by qualifiedName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_62 = false;\n\tidIfCond_62 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_62 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft25 = null;\n\n\tecore.EPackage elem_ft25 = null;\n\n\tresult_ft25 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_63 = false;\n\twhile( !idLoopCond_63 ) {\n\tidLoopCond_63 = kermeta.standard.helper.BooleanWrapper.or(it_ft25.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft25, null));\n\tif ( idLoopCond_63 ) {\n\t} else {\n\n\telem_ft25 = it_ft25.next();\n\n\tjava.lang.Boolean idIfCond_64 = false;\n//BIle:detector\necore.EPackage p_lbdExp25 = elem_ft25;\n\n\tidIfCond_64 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp25.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_64 ) {\n\n\tresult_ft25 = elem_ft25;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft25;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_65 = false;\n\tidIfCond_65 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_65 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_66 = false;\n\twhile( !idLoopCond_66 ) {\n\tidLoopCond_66 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_66 ) {\n\t} else {\n\n\t//BIft:detect\n\necore.EPackage result_ft26 = null;\n\n\tecore.EPackage elem_ft26 = null;\n\n\tresult_ft26 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_67 = false;\n\twhile( !idLoopCond_67 ) {\n\tidLoopCond_67 = kermeta.standard.helper.BooleanWrapper.or(it_ft26.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft26, null));\n\tif ( idLoopCond_67 ) {\n\t} else {\n\n\telem_ft26 = it_ft26.next();\n\n\tjava.lang.Boolean idIfCond_68 = false;\n//BIle:detector\necore.EPackage p_lbdExp26 = elem_ft26;\n\n\tidIfCond_68 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp26.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_68 ) {\n\n\tresult_ft26 = elem_ft26;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft26;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\necore.EClassifier result_ft27 = null;\n\n\tecore.EClassifier elem_ft27 = null;\n\n\tresult_ft27 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft27 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_69 = false;\n\twhile( !idLoopCond_69 ) {\n\tidLoopCond_69 = kermeta.standard.helper.BooleanWrapper.or(it_ft27.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft27, null));\n\tif ( idLoopCond_69 ) {\n\t} else {\n\n\telem_ft27 = it_ft27.next();\n\n\tjava.lang.Boolean idIfCond_70 = false;\n//BIle:detector\necore.EClassifier c_lbdExp27 = elem_ft27;\n\n\tidIfCond_70 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp27.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_70 ) {\n\n\tresult_ft27 = elem_ft27;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft27;\n//EIft:detect\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_71 = false;\n\tidIfCond_71 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\")));\n\n\tif( idIfCond_71 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).clear();\n}\n\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_72 = false;\n\tidIfCond_72 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(smContext));\n\n\tif( idIfCond_72 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n\n\tstaticMethod.setTypeParameters(\"G\");\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_73 = false;\n\tidIfCond_73 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(smReturn.getType());\n\n\tif( idIfCond_73 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft28 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_74 = false;\n\twhile( !idLoopCond_74 ) {\n\tidLoopCond_74 = it_ft28.isOff();\n\tif ( idLoopCond_74 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp28 = it_ft28.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tparam.setName(p_lbdExp28.getName());\n\n\tjava.lang.Boolean idIfCond_75 = false;\n\tidIfCond_75 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp28.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_75 ) {\n\n\tparam.setType(p_lbdExp28.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_76 = false;\n\tidIfCond_76 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(param.getType());\n\n\tif( idIfCond_76 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void compileStaticOperation(Operation op, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAnnotation()));\n\n\tecoreAnnotation.setSource(\"ModelingUnit\");\n\n\tecore.EStringToStringMapEntry requireEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEStringToStringMapEntry()));\n\n\trequireEntry.setKey(\"require\");\n\n\trequireEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(requireEntry);\n\n\tecore.EStringToStringMapEntry usingEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEStringToStringMapEntry()));\n\n\tusingEntry.setKey(\"using\");\n\n\tusingEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(usingEntry);\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft29 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_77 = false;\n\twhile( !idLoopCond_77 ) {\n\tidLoopCond_77 = it_ft29.isOff();\n\tif ( idLoopCond_77 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp29 = it_ft29.next();\n\n\tresult.add(p_lbdExp29);\n\n\tresult.addAll(p_lbdExp29.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft31 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_78 = false;\n\twhile( !idLoopCond_78 ) {\n\tidLoopCond_78 = it_ft31.isOff();\n\tif ( idLoopCond_78 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp31 = it_ft31.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp30 = o_lbdExp31;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft32 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_79 = false;\n\twhile( !idLoopCond_79 ) {\n\tidLoopCond_79 = it_ft32.isOff();\n\tif ( idLoopCond_79 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp32 = it_ft32.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp30 = p_lbdExp32;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_80 = false;\n\twhile( !idLoopCond_80 ) {\n\tidLoopCond_80 = it_ft33.isOff();\n\tif ( idLoopCond_80 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp33 = it_ft33.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp30 = p_lbdExp33;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft34 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_81 = false;\n\twhile( !idLoopCond_81 ) {\n\tidLoopCond_81 = it_ft34.isOff();\n\tif ( idLoopCond_81 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp34 = it_ft34.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp30 = p_lbdExp34;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_82 = false;\n\tidIfCond_82 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_82 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft35 = null;\n\n\tkermeta.language.structure.Package elem_ft35 = null;\n\n\tresult_ft35 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft35 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_83 = false;\n\twhile( !idLoopCond_83 ) {\n\tidLoopCond_83 = kermeta.standard.helper.BooleanWrapper.or(it_ft35.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft35, null));\n\tif ( idLoopCond_83 ) {\n\t} else {\n\n\telem_ft35 = it_ft35.next();\n\n\tjava.lang.Boolean idIfCond_84 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp35 = elem_ft35;\n\n\tidIfCond_84 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp35.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_84 ) {\n\n\tresult_ft35 = elem_ft35;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft35;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_85 = false;\n\twhile( !idLoopCond_85 ) {\n\tidLoopCond_85 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_85 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft36 = null;\n\n\tkermeta.language.structure.Package elem_ft36 = null;\n\n\tresult_ft36 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft36 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_86 = false;\n\twhile( !idLoopCond_86 ) {\n\tidLoopCond_86 = kermeta.standard.helper.BooleanWrapper.or(it_ft36.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft36, null));\n\tif ( idLoopCond_86 ) {\n\t} else {\n\n\telem_ft36 = it_ft36.next();\n\n\tjava.lang.Boolean idIfCond_87 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp36 = elem_ft36;\n\n\tidIfCond_87 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp36.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_87 ) {\n\n\tresult_ft36 = elem_ft36;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft36;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft37 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft37 = null;\n\n\tresult_ft37 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft37 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_88 = false;\n\twhile( !idLoopCond_88 ) {\n\tidLoopCond_88 = kermeta.standard.helper.BooleanWrapper.or(it_ft37.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft37, null));\n\tif ( idLoopCond_88 ) {\n\t} else {\n\n\telem_ft37 = it_ft37.next();\n\n\tjava.lang.Boolean idIfCond_89 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp37 = elem_ft37;\n\n\tidIfCond_89 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp37.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_89 ) {\n\n\tresult_ft37 = elem_ft37;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft37;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

} // ModelingUnit
