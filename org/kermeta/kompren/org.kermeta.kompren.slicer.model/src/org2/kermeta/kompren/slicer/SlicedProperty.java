/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org2.kermeta.kompren.slicer.SlicedProperty#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.SlicedProperty#getSrc <em>Src</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.SlicedProperty#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.SlicedProperty#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedProperty()
 * @model
 * @generated
 */
public interface SlicedProperty extends SlicedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' containment reference.
	 * @see #setOpposite(OppositeCreation)
	 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedProperty_Opposite()
	 * @model containment="true"
	 * @generated
	 */
	OppositeCreation getOpposite();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicer.SlicedProperty#getOpposite <em>Opposite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' containment reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(OppositeCreation value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' containment reference.
	 * @see #setSrc(VarDecl)
	 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedProperty_Src()
	 * @model containment="true"
	 * @generated
	 */
	VarDecl getSrc();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicer.SlicedProperty#getSrc <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' containment reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(VarDecl value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' containment reference.
	 * @see #setTgt(VarDecl)
	 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedProperty_Tgt()
	 * @model containment="true"
	 * @generated
	 */
	VarDecl getTgt();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicer.SlicedProperty#getTgt <em>Tgt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' containment reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(VarDecl value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(EStructuralFeature)
	 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedProperty_Domain()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getDomain();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicer.SlicedProperty#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EStructuralFeature value);

} // SlicedProperty
