/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.AspectModelElement#getPid <em>Pid</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.Art_relaxedPackage#getAspectModelElement()
 * @model abstract="true"
 * @generated
 */
public interface AspectModelElement extends EObject {

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
	 * @see art_relaxed.Art_relaxedPackage#getAspectModelElement_Pid()
	 * @model dataType="art_relaxed.String"
	 * @generated
	 */
	String getPid();

	/**
	 * Sets the value of the '{@link art_relaxed.AspectModelElement#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(String value);
} // AspectModelElement
