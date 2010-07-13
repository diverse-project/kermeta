/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Composer#getContext <em>Context</em>}</li>
 *   <li>{@link kompose.Composer#getEngine <em>Engine</em>}</li>
 *   <li>{@link kompose.Composer#getMerger <em>Merger</em>}</li>
 *   <li>{@link kompose.Composer#getMatcher <em>Matcher</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getComposer()
 * @model
 * @generated
 */
public interface Composer extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see kompose.KomposePackage#getComposer_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link kompose.Composer#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' reference.
	 * @see #setEngine(Engine)
	 * @see kompose.KomposePackage#getComposer_Engine()
	 * @model required="true"
	 * @generated
	 */
	Engine getEngine();

	/**
	 * Sets the value of the '{@link kompose.Composer#getEngine <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(Engine value);

	/**
	 * Returns the value of the '<em><b>Merger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merger</em>' reference.
	 * @see #setMerger(Merger)
	 * @see kompose.KomposePackage#getComposer_Merger()
	 * @model required="true"
	 * @generated
	 */
	Merger getMerger();

	/**
	 * Sets the value of the '{@link kompose.Composer#getMerger <em>Merger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' reference.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(Merger value);

	/**
	 * Returns the value of the '<em><b>Matcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matcher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matcher</em>' reference.
	 * @see #setMatcher(Matcher)
	 * @see kompose.KomposePackage#getComposer_Matcher()
	 * @model required="true"
	 * @generated
	 */
	Matcher getMatcher();

	/**
	 * Sets the value of the '{@link kompose.Composer#getMatcher <em>Matcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matcher</em>' reference.
	 * @see #getMatcher()
	 * @generated
	 */
	void setMatcher(Matcher value);

} // Composer
