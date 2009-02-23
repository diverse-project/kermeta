/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Rescue.java,v 1.12 2009-02-23 15:26:37 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_688 = false;\n\tidIfCond_688 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getExceptionType()));\n\n\tif( idIfCond_688 ) {\n\n\tjava.lang.String str_exceptionType = this.getExceptionType().createBehaviorJava(context);\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"if( \"), context.getVARIABLE_EXCEPTION_SWITCHER()), \"_\"), context.getKRErrorStack().peek()), \".getRealException() instanceof \"), str_exceptionType), \" ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"caught_\"), context.getKRErrorStack().peek()), \" = true;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, str_exceptionType), \" \"), this.getExceptionName()), \" = (\"), str_exceptionType), \") \"), context.getVARIABLE_EXCEPTION_SWITCHER()), \"_\"), context.getKRErrorStack().peek()), \".getRealException();\\n\");\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft153 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_689 = false;\n\twhile( !idLoopCond_689 ) {\n\tidLoopCond_689 = it_ft153.isOff();\n\tif ( idLoopCond_689 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp153 = it_ft153.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag e_lbdExp152 = o_lbdExp153;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp152.createBehaviorJava(context));\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft154 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getBody()).iterator();\n\tjava.lang.Boolean idLoopCond_690 = false;\n\twhile( !idLoopCond_690 ) {\n\tidLoopCond_690 = it_ft154.isOff();\n\tif ( idLoopCond_690 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression s_lbdExp154 = it_ft154.next();\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp152 = s_lbdExp154;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp152.createBehaviorJava(context));\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"\\n}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // Rescue
