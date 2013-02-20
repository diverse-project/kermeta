/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvttemplate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.ObjectTemplateExp#getPart <em>Part</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.ObjectTemplateExp#getReferredClass <em>Referred Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage#getObjectTemplateExp()
 * @model
 * @generated
 */
public interface ObjectTemplateExp extends TemplateExp {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvttemplate.PropertyTemplateItem}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.PropertyTemplateItem#getObjContainer <em>Obj Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage#getObjectTemplateExp_Part()
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.PropertyTemplateItem#getObjContainer
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvttemplate.PropertyTemplateItem" opposite="objContainer" containment="true" ordered="false"
	 * @generated
	 */
	EList getPart();

	/**
	 * Returns the value of the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Class</em>' reference.
	 * @see #setReferredClass(fr.tm.elibel.smartqvt.qvt.emof.Class)
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage#getObjectTemplateExp_ReferredClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	fr.tm.elibel.smartqvt.qvt.emof.Class getReferredClass();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.ObjectTemplateExp#getReferredClass <em>Referred Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Class</em>' reference.
	 * @see #getReferredClass()
	 * @generated
	 */
	void setReferredClass(fr.tm.elibel.smartqvt.qvt.emof.Class value);

} // ObjectTemplateExp
