/**
 * <copyright>
 * </copyright>
 *
 * $Id: Package.java,v 1.5 2008-10-09 08:50:25 cfaucher Exp $
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
public interface Package extends Traceability<EPackage>, NamedElement,
		TypeDefinitionContainer {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EPackage ecorePackage = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Package p = this.getNestingPackage();\n\n\tjava.lang.Boolean idIfCond_174 = false;\n\tidIfCond_174 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(p, null);\n\n\tif( idIfCond_174 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(p.getEcoreModelElement().getESubpackages()).add(ecorePackage);\n}\n\n\n\tthis.setEcoreModelElement(ecorePackage);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.Package pack_ft61 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(pack_ft61.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_175 = false;\n\twhile( !idLoopCond_175 ) {\n\tidLoopCond_175 = it_ft62.isOff();\n\tif ( idLoopCond_175 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp62 = it_ft62.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag cd_lbdExp61 = o_lbdExp62;\n\n\tjava.lang.Boolean idIfCond_176 = false;\n\tidIfCond_176 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp61.getDeprecated(), \"\");\n\n\tif( idIfCond_176 ) {\n\n\tcd_lbdExp61.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack_ft61.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_177 = false;\n\twhile( !idLoopCond_177 ) {\n\tidLoopCond_177 = it_ft63.isOff();\n\tif ( idLoopCond_177 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition o_lbdExp63 = it_ft63.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition cd_lbdExp61 = o_lbdExp63;\n\n\tjava.lang.Boolean idIfCond_178 = false;\n\tidIfCond_178 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp61.getDeprecated(), \"\");\n\n\tif( idIfCond_178 ) {\n\n\tcd_lbdExp61.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack_ft61.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_179 = false;\n\twhile( !idLoopCond_179 ) {\n\tidLoopCond_179 = it_ft64.isOff();\n\tif ( idLoopCond_179 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp64 = it_ft64.next();\n\n\t//BIle:func\nkermeta.language.structure.Package cd_lbdExp61 = p_lbdExp64;\n\n\tjava.lang.Boolean idIfCond_180 = false;\n\tidIfCond_180 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp61.getDeprecated(), \"\");\n\n\tif( idIfCond_180 ) {\n\n\tcd_lbdExp61.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EPackage result = null;\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" + Package \", this.qualifiedName()), \" in progress\"));\n\n\tecore.EPackage ecorePackage = ((ecore.EPackage) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EPackage\"));\n\n\tecorePackage.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\tjava.lang.Boolean idIfCond_181 = false;\n\tidIfCond_181 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getUri())), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getUri(), \"\"));\n\n\tif( idIfCond_181 ) {\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(this.getUri(), \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(\"ecoreUri\", this.getUri()));\n}\n else {\n\n\tjava.lang.String default_uri = kermeta.standard.helper.StringWrapper.plus(\"http://www.kermeta.org/\", kermeta.standard.helper.StringWrapper.replace(this.qualifiedName(), \"::\", \"/\"));\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(default_uri, \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(\"ecoreUri\", default_uri));\n}\n\n\n\tecorePackage.setNsPrefix(\"\");\n\n\tresult = ecorePackage;\n\nreturn result;\n'"
	 * @generated
	 */
	EPackage createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_182 = false;\n\twhile( !idLoopCond_182 ) {\n\tidLoopCond_182 = it_ft65.isOff();\n\tif ( idLoopCond_182 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp65 = it_ft65.next();\n\n\tresult.add(p_lbdExp65);\n\n\tresult.addAll(p_lbdExp65.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<Package> getAllSubPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.Package pack_ft66 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(pack_ft66.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_183 = false;\n\twhile( !idLoopCond_183 ) {\n\tidLoopCond_183 = it_ft67.isOff();\n\tif ( idLoopCond_183 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp67 = it_ft67.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp66 = o_lbdExp67;\n\n\tp_lbdExp66.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack_ft66.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_184 = false;\n\twhile( !idLoopCond_184 ) {\n\tidLoopCond_184 = it_ft68.isOff();\n\tif ( idLoopCond_184 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition o_lbdExp68 = it_ft68.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition p_lbdExp66 = o_lbdExp68;\n\n\tp_lbdExp66.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack_ft66.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_185 = false;\n\twhile( !idLoopCond_185 ) {\n\tidLoopCond_185 = it_ft69.isOff();\n\tif ( idLoopCond_185 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp69 = it_ft69.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp66 = p_lbdExp69;\n\n\tp_lbdExp66.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Package
