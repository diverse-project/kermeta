/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase;

import fr.tm.elibel.smartqvt.qvt.emof.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel#getUsedPackage <em>Used Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTypedModel()
 * @model
 * @generated
 */
public interface TypedModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTypedModel_DependsOn()
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel" ordered="false"
	 * @generated
	 */
	EList getDependsOn();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(Transformation)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTypedModel_Transformation()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getModelParameter
	 * @model opposite="modelParameter" required="true" ordered="false"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Used Package</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Package</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getTypedModel_UsedPackage()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Package" required="true" ordered="false"
	 * @generated
	 */
	EList getUsedPackage();

} // TypedModel
