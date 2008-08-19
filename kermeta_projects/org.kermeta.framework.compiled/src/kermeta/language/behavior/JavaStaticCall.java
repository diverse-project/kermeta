/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaStaticCall.java,v 1.2 2008-08-19 13:22:59 cfaucher Exp $
 */
package kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Static Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.JavaStaticCall#getJmethod <em>Jmethod</em>}</li>
 *   <li>{@link kermeta.language.behavior.JavaStaticCall#getParameters <em>Parameters</em>}</li>
 *   <li>{@link kermeta.language.behavior.JavaStaticCall#getJclass <em>Jclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall()
 * @model annotation="kermeta documentation='This class represent a call to an extern Java operation. \nThis Java operation must be static and have at least one RuntimeO'"
 * @generated
 */
public interface JavaStaticCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Jmethod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jmethod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jmethod</em>' attribute.
	 * @see #setJmethod(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Jmethod()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='Name of the Java method to be launched in the identified Java class'"
	 * @generated
	 */
	String getJmethod();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.JavaStaticCall#getJmethod <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jmethod</em>' attribute.
	 * @see #getJmethod()
	 * @generated
	 */
	void setJmethod(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Parameters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Parameters of the Java static call provided as KerMeta expressions'"
	 * @generated
	 */
	EList<Expression> getParameters();

	/**
	 * Returns the value of the '<em><b>Jclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jclass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jclass</em>' attribute.
	 * @see #setJclass(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Jclass()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='Qualified name of the targeted Java class'"
	 * @generated
	 */
	String getJclass();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.JavaStaticCall#getJclass <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jclass</em>' attribute.
	 * @see #getJclass()
	 * @generated
	 */
	void setJclass(String value);

} // JavaStaticCall
