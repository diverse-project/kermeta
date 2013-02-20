/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getExtends <em>Extends</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getModelParameter <em>Model Parameter</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends fr.tm.elibel.smartqvt.qvt.emof.Class, fr.tm.elibel.smartqvt.qvt.emof.Package {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Transformation)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTransformation_Extends()
	 * @model ordered="false"
	 * @generated
	 */
	Transformation getExtends();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Transformation value);

	/**
	 * Returns the value of the '<em><b>Model Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Parameter</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTransformation_ModelParameter()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel#getTransformation
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel" opposite="transformation" containment="true" ordered="false"
	 * @generated
	 */
	EList getModelParameter();

	/**
	 * Returns the value of the '<em><b>Owned Tag</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tag</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTransformation_OwnedTag()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Tag" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedTag();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTransformation_Rule()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getTransformation
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtbase.Rule" opposite="transformation" containment="true" ordered="false"
	 * @generated
	 */
	EList getRule();

} // Transformation
