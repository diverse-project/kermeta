/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnit.java,v 1.3 2008-09-22 14:47:41 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.ModelingUnit#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model annotation="kermeta documentation='The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\nIt also reference others modeling unit.'"
 *        annotation="kermeta documentation='/**\n *\n \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_744 = false;\n\tidIfCond_744 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_744 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft155 = null;\n\n\tkermeta.language.structure.Package elem_ft155 = null;\n\n\tresult_ft155 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft155 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_745 = false;\n\twhile( !idLoopCond_745 ) {\n\tidLoopCond_745 = kermeta.standard.helper.BooleanWrapper.or(it_ft155.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft155, null));\n\tif ( idLoopCond_745 ) {\n\t} else {\n\n\telem_ft155 = it_ft155.next();\n\n\tjava.lang.Boolean idIfCond_746 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp155 = elem_ft155;\n\n\tidIfCond_746 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp155.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_746 ) {\n\n\tresult_ft155 = elem_ft155;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft155;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_747 = false;\n\twhile( !idLoopCond_747 ) {\n\tidLoopCond_747 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_747 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft156 = null;\n\n\tkermeta.language.structure.Package elem_ft156 = null;\n\n\tresult_ft156 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft156 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_748 = false;\n\twhile( !idLoopCond_748 ) {\n\tidLoopCond_748 = kermeta.standard.helper.BooleanWrapper.or(it_ft156.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft156, null));\n\tif ( idLoopCond_748 ) {\n\t} else {\n\n\telem_ft156 = it_ft156.next();\n\n\tjava.lang.Boolean idIfCond_749 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp156 = elem_ft156;\n\n\tidIfCond_749 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp156.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_749 ) {\n\n\tresult_ft156 = elem_ft156;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft156;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft158 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_750 = false;\n\twhile( !idLoopCond_750 ) {\n\tidLoopCond_750 = it_ft158.isOff();\n\tif ( idLoopCond_750 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp158 = it_ft158.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp157 = o_lbdExp158;\n\n\tp_lbdExp157.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft159 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_751 = false;\n\twhile( !idLoopCond_751 ) {\n\tidLoopCond_751 = it_ft159.isOff();\n\tif ( idLoopCond_751 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp159 = it_ft159.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp157 = p_lbdExp159;\n\n\tp_lbdExp157.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft160 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_752 = false;\n\twhile( !idLoopCond_752 ) {\n\tidLoopCond_752 = it_ft160.isOff();\n\tif ( idLoopCond_752 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp160 = it_ft160.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp157 = p_lbdExp160;\n\n\tp_lbdExp157.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft161 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_753 = false;\n\twhile( !idLoopCond_753 ) {\n\tidLoopCond_753 = it_ft161.isOff();\n\tif ( idLoopCond_753 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp161 = it_ft161.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp157 = p_lbdExp161;\n\n\tp_lbdExp157.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft162 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_754 = false;\n\twhile( !idLoopCond_754 ) {\n\tidLoopCond_754 = it_ft162.isOff();\n\tif ( idLoopCond_754 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp162 = it_ft162.next();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp162.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft163 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_755 = false;\n\twhile( !idLoopCond_755 ) {\n\tidLoopCond_755 = it_ft163.isOff();\n\tif ( idLoopCond_755 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp163 = it_ft163.next();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp163, context);\n\n\tcontext.setStaticOperationMode(false);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void compileSuperOperation(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.compileSuperOperation(context);\n'"
	 * @generated
	 */
	void postprocess(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get a EClassifer contained in the given Modeling Unit by qualifiedName\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_756 = false;\n\tidIfCond_756 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_756 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft164 = null;\n\n\tecore.EPackage elem_ft164 = null;\n\n\tresult_ft164 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft164 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_757 = false;\n\twhile( !idLoopCond_757 ) {\n\tidLoopCond_757 = kermeta.standard.helper.BooleanWrapper.or(it_ft164.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft164, null));\n\tif ( idLoopCond_757 ) {\n\t} else {\n\n\telem_ft164 = it_ft164.next();\n\n\tjava.lang.Boolean idIfCond_758 = false;\n//BIle:detector\necore.EPackage p_lbdExp164 = elem_ft164;\n\n\tidIfCond_758 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp164.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_758 ) {\n\n\tresult_ft164 = elem_ft164;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft164;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_759 = false;\n\twhile( !idLoopCond_759 ) {\n\tidLoopCond_759 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_759 ) {\n\t} else {\n\n\t//BIft:detect\n\necore.EPackage result_ft165 = null;\n\n\tecore.EPackage elem_ft165 = null;\n\n\tresult_ft165 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft165 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_760 = false;\n\twhile( !idLoopCond_760 ) {\n\tidLoopCond_760 = kermeta.standard.helper.BooleanWrapper.or(it_ft165.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft165, null));\n\tif ( idLoopCond_760 ) {\n\t} else {\n\n\telem_ft165 = it_ft165.next();\n\n\tjava.lang.Boolean idIfCond_761 = false;\n//BIle:detector\necore.EPackage p_lbdExp165 = elem_ft165;\n\n\tidIfCond_761 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp165.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_761 ) {\n\n\tresult_ft165 = elem_ft165;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft165;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\necore.EClassifier result_ft166 = null;\n\n\tecore.EClassifier elem_ft166 = null;\n\n\tresult_ft166 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft166 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_762 = false;\n\twhile( !idLoopCond_762 ) {\n\tidLoopCond_762 = kermeta.standard.helper.BooleanWrapper.or(it_ft166.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft166, null));\n\tif ( idLoopCond_762 ) {\n\t} else {\n\n\telem_ft166 = it_ft166.next();\n\n\tjava.lang.Boolean idIfCond_763 = false;\n//BIle:detector\necore.EClassifier c_lbdExp166 = elem_ft166;\n\n\tidIfCond_763 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp166.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_763 ) {\n\n\tresult_ft166 = elem_ft166;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft166;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_764 = false;\n\tidIfCond_764 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(smContext));\n\n\tif( idIfCond_764 ) {\n\n\tsimk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.StaticMethod\"));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(context.getSimkModel().getStaticMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(smContext.getStaticMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMReturn\"));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_765 = false;\n\tidIfCond_765 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(smReturn.getType());\n\n\tif( idIfCond_765 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), \"::\", \".\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft167 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_766 = false;\n\twhile( !idLoopCond_766 ) {\n\tidLoopCond_766 = it_ft167.isOff();\n\tif ( idLoopCond_766 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp167 = it_ft167.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tparam.setName(p_lbdExp167.getName());\n\n\tjava.lang.Boolean idIfCond_767 = false;\n\tidIfCond_767 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p_lbdExp167.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_767 ) {\n\n\tparam.setType(p_lbdExp167.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_768 = false;\n\tidIfCond_768 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(param.getType());\n\n\tif( idIfCond_768 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft168 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_769 = false;\n\twhile( !idLoopCond_769 ) {\n\tidLoopCond_769 = it_ft168.isOff();\n\tif ( idLoopCond_769 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp168 = it_ft168.next();\n\n\tresult.add(p_lbdExp168);\n\n\tresult.addAll(p_lbdExp168.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft170 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_770 = false;\n\twhile( !idLoopCond_770 ) {\n\tidLoopCond_770 = it_ft170.isOff();\n\tif ( idLoopCond_770 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp170 = it_ft170.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp169 = o_lbdExp170;\n\n\tp_lbdExp169.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft171 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_771 = false;\n\twhile( !idLoopCond_771 ) {\n\tidLoopCond_771 = it_ft171.isOff();\n\tif ( idLoopCond_771 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp171 = it_ft171.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp169 = p_lbdExp171;\n\n\tp_lbdExp169.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft172 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_772 = false;\n\twhile( !idLoopCond_772 ) {\n\tidLoopCond_772 = it_ft172.isOff();\n\tif ( idLoopCond_772 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp172 = it_ft172.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp169 = p_lbdExp172;\n\n\tp_lbdExp169.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft173 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_773 = false;\n\twhile( !idLoopCond_773 ) {\n\tidLoopCond_773 = it_ft173.isOff();\n\tif ( idLoopCond_773 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp173 = it_ft173.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp169 = p_lbdExp173;\n\n\tp_lbdExp169.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_774 = false;\n\tidIfCond_774 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_774 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft174 = null;\n\n\tkermeta.language.structure.Package elem_ft174 = null;\n\n\tresult_ft174 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft174 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_775 = false;\n\twhile( !idLoopCond_775 ) {\n\tidLoopCond_775 = kermeta.standard.helper.BooleanWrapper.or(it_ft174.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft174, null));\n\tif ( idLoopCond_775 ) {\n\t} else {\n\n\telem_ft174 = it_ft174.next();\n\n\tjava.lang.Boolean idIfCond_776 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp174 = elem_ft174;\n\n\tidIfCond_776 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp174.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_776 ) {\n\n\tresult_ft174 = elem_ft174;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft174;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_777 = false;\n\twhile( !idLoopCond_777 ) {\n\tidLoopCond_777 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_777 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft175 = null;\n\n\tkermeta.language.structure.Package elem_ft175 = null;\n\n\tresult_ft175 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft175 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_778 = false;\n\twhile( !idLoopCond_778 ) {\n\tidLoopCond_778 = kermeta.standard.helper.BooleanWrapper.or(it_ft175.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft175, null));\n\tif ( idLoopCond_778 ) {\n\t} else {\n\n\telem_ft175 = it_ft175.next();\n\n\tjava.lang.Boolean idIfCond_779 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp175 = elem_ft175;\n\n\tidIfCond_779 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp175.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_779 ) {\n\n\tresult_ft175 = elem_ft175;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft175;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft176 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft176 = null;\n\n\tresult_ft176 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft176 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_780 = false;\n\twhile( !idLoopCond_780 ) {\n\tidLoopCond_780 = kermeta.standard.helper.BooleanWrapper.or(it_ft176.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft176, null));\n\tif ( idLoopCond_780 ) {\n\t} else {\n\n\telem_ft176 = it_ft176.next();\n\n\tjava.lang.Boolean idIfCond_781 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp176 = elem_ft176;\n\n\tidIfCond_781 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp176.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_781 ) {\n\n\tresult_ft176 = elem_ft176;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft176;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

} // ModelingUnit
