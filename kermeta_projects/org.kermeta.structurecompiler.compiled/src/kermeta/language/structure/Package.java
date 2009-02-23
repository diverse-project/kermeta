/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Package.java,v 1.13 2009-02-23 15:26:48 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EPackage;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link kermeta.language.structure.Package#getGenModelBasePackage <em>Gen Model Base Package</em>}</li>
 *   <li>{@link kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link kermeta.language.structure.Package#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getPackage()
 * @model annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='Package in kermeta. Each kermeta model must have a root package. '"
 * @generated
 */
public interface Package extends NamedElement, TypeDefinitionContainer,
		Traceability<EPackage> {
	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Package</em>' container reference.
	 * @see #setNestingPackage(Package)
	 * @see kermeta.language.structure.StructurePackage#getPackage_NestingPackage()
	 * @see kermeta.language.structure.Package#getNestedPackage
	 * @model opposite="nestedPackage"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kermeta documentation='Owning Package, if any'"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' container reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Gen Model Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model Base Package</em>' attribute.
	 * @see #setGenModelBasePackage(String)
	 * @see kermeta.language.structure.StructurePackage#getPackage_GenModelBasePackage()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getGenModelBasePackage();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Package#getGenModelBasePackage <em>Gen Model Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model Base Package</em>' attribute.
	 * @see #getGenModelBasePackage()
	 * @generated
	 */
	void setGenModelBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Package}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getPackage_NestedPackage()
	 * @see kermeta.language.structure.Package#getNestingPackage
	 * @model opposite="nestingPackage" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Nested Packages contained by the Package'"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see kermeta.language.structure.StructurePackage#getPackage_Uri()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='Uri of the Package'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EPackage ecorePackage = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Package p = this.getNestingPackage();\n\n\tjava.lang.Boolean idIfCond_49 = false;\n\tidIfCond_49 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(p, null);\n\n\tif( idIfCond_49 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(p.getEcoreModelElement().getESubpackages()).add(ecorePackage);\n}\n\n\n\tthis.setEcoreModelElement(ecorePackage);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.Package pack_ft10 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft11 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(pack_ft10.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_50 = false;\n\twhile( !idLoopCond_50 ) {\n\tidLoopCond_50 = it_ft11.isOff();\n\tif ( idLoopCond_50 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp11 = it_ft11.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag cd_lbdExp10 = o_lbdExp11;\n\n\tcd_lbdExp10.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack_ft10.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_51 = false;\n\twhile( !idLoopCond_51 ) {\n\tidLoopCond_51 = it_ft12.isOff();\n\tif ( idLoopCond_51 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition o_lbdExp12 = it_ft12.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition cd_lbdExp10 = o_lbdExp12;\n\n\tcd_lbdExp10.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack_ft10.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_52 = false;\n\twhile( !idLoopCond_52 ) {\n\tidLoopCond_52 = it_ft13.isOff();\n\tif ( idLoopCond_52 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp13 = it_ft13.next();\n\n\t//BIle:func\nkermeta.language.structure.Package cd_lbdExp10 = p_lbdExp13;\n\n\tcd_lbdExp10.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EPackage result = null;\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" + Package \", this.qualifiedName()), \" in progress\"));\n\n\tecore.EPackage ecorePackage = ((ecore.EPackage) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEPackage()));\n\n\tecorePackage.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE.getIdentifierHelper())).getMangledIdentifier(this.getName(), context));\n\n\tjava.lang.Boolean idIfCond_53 = false;\n\tidIfCond_53 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getUri())), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getUri(), \"\"));\n\n\tif( idIfCond_53 ) {\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(this.getUri(), \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(\"ecoreUri\", this.getUri()));\n}\n else {\n\n\tjava.lang.String default_uri = kermeta.standard.helper.StringWrapper.plus(\"http://www.kermeta.org/\", kermeta.standard.helper.StringWrapper.replace(this.qualifiedName(), \"::\", \"/\"));\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(default_uri, \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(\"ecoreUri\", default_uri));\n}\n\n\n\tecorePackage.setNsPrefix(\"\");\n\n\tresult = ecorePackage;\n\nreturn result;\n'"
	 * @generated
	 */
	EPackage createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_54 = false;\n\twhile( !idLoopCond_54 ) {\n\tidLoopCond_54 = it_ft14.isOff();\n\tif ( idLoopCond_54 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp14 = it_ft14.next();\n\n\tresult.add(p_lbdExp14);\n\n\tresult.addAll(p_lbdExp14.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<Package> getAllSubPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.Package pack_ft15 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft16 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(pack_ft15.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_55 = false;\n\twhile( !idLoopCond_55 ) {\n\tidLoopCond_55 = it_ft16.isOff();\n\tif ( idLoopCond_55 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp16 = it_ft16.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp15 = o_lbdExp16;\n\n\tp_lbdExp15.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack_ft15.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_56 = false;\n\twhile( !idLoopCond_56 ) {\n\tidLoopCond_56 = it_ft17.isOff();\n\tif ( idLoopCond_56 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition o_lbdExp17 = it_ft17.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition p_lbdExp15 = o_lbdExp17;\n\n\tp_lbdExp15.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack_ft15.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_57 = false;\n\twhile( !idLoopCond_57 ) {\n\tidLoopCond_57 = it_ft18.isOff();\n\tif ( idLoopCond_57 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp18 = it_ft18.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp15 = p_lbdExp18;\n\n\tp_lbdExp15.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Package
