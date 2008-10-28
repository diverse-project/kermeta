/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumerationLiteral.java,v 1.6 2008-10-28 13:18:19 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EEnumLiteral;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getEnumerationLiteral()
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
 *        annotation="kermeta documentation='Item definition for enumeration'"
 * @generated
 */
public interface EnumerationLiteral extends NamedElement,
		Traceability<EEnumLiteral> {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see kermeta.language.structure.StructurePackage#getEnumerationLiteral_Enumeration()
	 * @see kermeta.language.structure.Enumeration#getOwnedLiteral
	 * @model opposite="ownedLiteral"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kermeta documentation='Owning Enumeration'"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EEnumLiteral ecoreEnumLiteral = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Enumeration e = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEnumeration(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\")));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EEnumLiteral>convertAsOrderedSet(e.getEcoreModelElement().getELiterals()).add(ecoreEnumLiteral);\n\n\tthis.setEcoreModelElement(ecoreEnumLiteral);\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EEnumLiteral result = null;\n\n\tecore.EEnumLiteral ecoreEnumerationLiteral = ((ecore.EEnumLiteral) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EEnumLiteral\"));\n\n\tecoreEnumerationLiteral.setName(this.getName());\n\n\tecoreEnumerationLiteral.setLiteral(this.getName());\n\n\tecoreEnumerationLiteral.setValue(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EEnumLiteral>convertAsOrderedSet(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEnumeration(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getEcoreModelElement().getELiterals()).size());\n\n\tresult = ecoreEnumerationLiteral;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral createEcoreModelElement(KM2EcoreContext context);

} // EnumerationLiteral
