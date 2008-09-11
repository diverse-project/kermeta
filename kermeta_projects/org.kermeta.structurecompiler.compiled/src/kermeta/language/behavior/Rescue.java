/**
 * <copyright>
 * </copyright>
 *
 * $Id: Rescue.java,v 1.2 2008-09-11 12:34:36 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Rescue#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.Rescue#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link kermeta.language.behavior.Rescue#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getRescue()
 * @model annotation="kermeta documentation='Refers to rescue exception block'"
 *        annotation="kermeta documentation='/** Complete \052/'"
 * @generated
 */
public interface Rescue extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getRescue_Body()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='Body of the rescue block, specified as a KerMeta expression'"
	 * @generated
	 */
	EList<Expression> getBody();

	/**
	 * Returns the value of the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Name</em>' attribute.
	 * @see #setExceptionName(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getRescue_ExceptionName()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='Name of the catched exception'"
	 * @generated
	 */
	String getExceptionName();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Rescue#getExceptionName <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Name</em>' attribute.
	 * @see #getExceptionName()
	 * @generated
	 */
	void setExceptionName(String value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' containment reference.
	 * @see #setExceptionType(TypeReference)
	 * @see kermeta.language.behavior.BehaviorPackage#getRescue_ExceptionType()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='Type of the cathed exception'"
	 * @generated
	 */
	TypeReference getExceptionType();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Rescue#getExceptionType <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' containment reference.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(TypeReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_557 = false;\n\tidIfCond_557 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getExceptionType()));\n\n\tif( idIfCond_557 ) {\n\n\tjava.lang.String str_exceptionType = this.getExceptionType().createBehaviorJava(context);\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"if( \"), context.getVARIABLE_EXCEPTION_SWITCHER()), \"_\"), context.getKRErrorStack().peek()), \".getRealException() instanceof \"), str_exceptionType), \" ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, str_exceptionType), \" \"), this.getExceptionName()), \" = (\"), str_exceptionType), \") \"), context.getVARIABLE_EXCEPTION_SWITCHER()), \"_\"), context.getKRErrorStack().peek()), \".getRealException();\\n\");\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft113 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_558 = false;\n\twhile( !idLoopCond_558 ) {\n\tidLoopCond_558 = it_ft113.isOff();\n\tif ( idLoopCond_558 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp113 = it_ft113.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag e_lbdExp112 = o_lbdExp113;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp112.createBehaviorJava(context));\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft114 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getBody()).iterator();\n\tjava.lang.Boolean idLoopCond_559 = false;\n\twhile( !idLoopCond_559 ) {\n\tidLoopCond_559 = it_ft114.isOff();\n\tif ( idLoopCond_559 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression s_lbdExp114 = it_ft114.next();\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp112 = s_lbdExp114;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp112.createBehaviorJava(context));\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"\\n}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // Rescue
