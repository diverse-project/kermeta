/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org2.kermeta.kompren.slicer.SlicedClass#getCtx <em>Ctx</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.SlicedClass#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedClass()
 * @model
 * @generated
 */
public interface SlicedClass extends SlicedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' containment reference.
	 * @see #setCtx(VarDecl)
	 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedClass_Ctx()
	 * @model containment="true"
	 * @generated
	 */
	VarDecl getCtx();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicer.SlicedClass#getCtx <em>Ctx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx</em>' containment reference.
	 * @see #getCtx()
	 * @generated
	 */
	void setCtx(VarDecl value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(EClass)
	 * @see org2.kermeta.kompren.slicer.SlicerPackage#getSlicedClass_Domain()
	 * @model required="true"
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicer.SlicedClass#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EClass value);

} // SlicedClass
