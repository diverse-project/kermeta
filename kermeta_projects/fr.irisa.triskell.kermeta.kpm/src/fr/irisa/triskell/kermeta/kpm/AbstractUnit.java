/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractUnit.java,v 1.1 2006-12-12 16:06:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.AbstractUnit#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAbstractUnit()
 * @model abstract="true"
 * @generated
 */
public interface AbstractUnit extends EObject {
	
	static public String value = "";
	
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAbstractUnit_TypeName()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.AbstractUnit#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // AbstractUnit