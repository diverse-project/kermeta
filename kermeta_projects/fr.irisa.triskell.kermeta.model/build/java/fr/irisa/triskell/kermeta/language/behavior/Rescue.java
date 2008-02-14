/**
 * <copyright>
 * </copyright>
 *
 * $Id: Rescue.java,v 1.6 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Rescue#getBody <em>Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Rescue#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Rescue#getExceptionName <em>Exception Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getRescue()
 * @model annotation="GenModel documentation='/**\n * Refers to rescue exception block\n \052/'"
 * @generated
 */
public interface Rescue extends fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getRescue_Body()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="GenModel documentation='/**\n * Body of the rescue block, specified as a KerMeta expression\n \052/'"
	 * @generated
	 */
	EList<Expression> getBody();

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getRescue_ExceptionType()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="GenModel documentation='/**\n * Type of the cathed exception\n \052/'"
	 * @generated
	 */
	TypeReference getExceptionType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Rescue#getExceptionType <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' containment reference.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(TypeReference value);

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getRescue_ExceptionName()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * Name of the catched exception\n \052/'"
	 * @generated
	 */
	String getExceptionName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Rescue#getExceptionName <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Name</em>' attribute.
	 * @see #getExceptionName()
	 * @generated
	 */
	void setExceptionName(String value);

} // Rescue