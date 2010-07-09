/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.PatternNamedElement#getNamePattern <em>Name Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getPatternNamedElement()
 * @model
 * @generated
 */
public interface PatternNamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Pattern</em>' attribute.
	 * @see #setNamePattern(String)
	 * @see Art2Aspect.Art2AspectPackage#getPatternNamedElement_NamePattern()
	 * @model
	 * @generated
	 */
	String getNamePattern();

	/**
	 * Sets the value of the '{@link Art2Aspect.PatternNamedElement#getNamePattern <em>Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Pattern</em>' attribute.
	 * @see #getNamePattern()
	 * @generated
	 */
	void setNamePattern(String value);

} // PatternNamedElement
