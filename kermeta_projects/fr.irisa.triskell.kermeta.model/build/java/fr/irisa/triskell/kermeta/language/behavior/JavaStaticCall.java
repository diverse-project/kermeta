/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaStaticCall.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
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
 * @model
 * @generated
 */
public interface JavaStaticCall extends Expression {
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
	 * @model type="fr.irisa.triskell.kermeta.language.behavior.Expression" containment="true"
	 * @generated
	 */
	EList getParameters();

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
