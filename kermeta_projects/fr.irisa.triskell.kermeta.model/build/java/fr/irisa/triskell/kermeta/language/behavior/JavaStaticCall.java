/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaStaticCall.java,v 1.6 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Static Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall#getJclass <em>Jclass</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall#getJmethod <em>Jmethod</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getJavaStaticCall()
 * @model annotation="GenModel documentation='/**\n * This class represent a call to an extern Java operation. \n * This Java operation must be static and have at least one RuntimeO\n \052/'"
 * @generated
 */
public interface JavaStaticCall extends Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Parameters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * Parameters of the Java static call provided as KerMeta expressions\n \052/'"
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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Jclass()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * Qualified name of the targeted Java class\n \052/'"
	 * @generated
	 */
	String getJclass();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall#getJclass <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jclass</em>' attribute.
	 * @see #getJclass()
	 * @generated
	 */
	void setJclass(String value);

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Jmethod()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * Name of the Java method to be launched in the identified Java class\n \052/'"
	 * @generated
	 */
	String getJmethod();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall#getJmethod <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jmethod</em>' attribute.
	 * @see #getJmethod()
	 * @generated
	 */
	void setJmethod(String value);

} // JavaStaticCall