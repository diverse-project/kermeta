/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link patternframework.PObject#getPid <em>Pid</em>}</li>
 * </ul>
 * </p>
 *
 * @see patternframework.PatternframeworkPackage#getPObject()
 * @model
 * @generated
 */
public interface PObject extends EObject {

	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #setPid(String)
	 * @see patternframework.PatternframeworkPackage#getPObject_Pid()
	 * @model dataType="patternframework.PLabel"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getPid();

	/**
	 * Sets the value of the '{@link patternframework.PObject#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(String value);
} // PObject
