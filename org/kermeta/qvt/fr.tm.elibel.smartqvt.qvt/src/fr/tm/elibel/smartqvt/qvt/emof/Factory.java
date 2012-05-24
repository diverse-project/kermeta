/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.emof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Factory#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends Element {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(fr.tm.elibel.smartqvt.qvt.emof.Package)
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getFactory_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	fr.tm.elibel.smartqvt.qvt.emof.Package getPackage();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.emof.Factory#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(fr.tm.elibel.smartqvt.qvt.emof.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.String"
	 * @generated
	 */
	String convertToString(DataType dataType, fr.tm.elibel.smartqvt.qvt.emof.Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Element create(fr.tm.elibel.smartqvt.qvt.emof.Class metaClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stringDataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.String"
	 * @generated
	 */
	fr.tm.elibel.smartqvt.qvt.emof.Object createFromString(DataType dataType, String string);

} // Factory
