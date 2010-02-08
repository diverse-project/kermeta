/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link patternframework.ModelPattern#getPattern <em>Pattern</em>}</li>
 *   <li>{@link patternframework.ModelPattern#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link patternframework.ModelPattern#getFeatureIdentifier <em>Feature Identifier</em>}</li>
 *   <li>{@link patternframework.ModelPattern#getFalsepositivepatterns <em>Falsepositivepatterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see patternframework.PatternframeworkPackage#getModelPattern()
 * @model
 * @generated
 */
public interface ModelPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PModel)
	 * @see patternframework.PatternframeworkPackage#getModelPattern_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	PModel getPattern();

	/**
	 * Sets the value of the '{@link patternframework.ModelPattern#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PModel value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(PConstraint)
	 * @see patternframework.PatternframeworkPackage#getModelPattern_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	PConstraint getConstraints();

	/**
	 * Sets the value of the '{@link patternframework.ModelPattern#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(PConstraint value);

	/**
	 * Returns the value of the '<em><b>Feature Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Identifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Identifier</em>' attribute list.
	 * @see patternframework.PatternframeworkPackage#getModelPattern_FeatureIdentifier()
	 * @model dataType="patternframework.PLabel"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	EList<String> getFeatureIdentifier();

	/**
	 * Returns the value of the '<em><b>Falsepositivepatterns</b></em>' containment reference list.
	 * The list contents are of type {@link patternframework.PModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Falsepositivepatterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Falsepositivepatterns</em>' containment reference list.
	 * @see patternframework.PatternframeworkPackage#getModelPattern_Falsepositivepatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<PModel> getFalsepositivepatterns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roleNameDataType="patternframework.PLabel"
	 *        annotation="kermeta body='do\r\n\tvar rol : patternframework::PRole init pattern.roles.detect{r | r.name.equals(roleName)}\r\n\tresult := if rol.isVoid.~not then\r\n\t\trol.player\r\n\r\n\telse\r\n\t\tvoid\r\n\r\n\tend\r\nend'"
	 * @generated
	 */
	PObject getRole(String roleName);

} // ModelPattern
