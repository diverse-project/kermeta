/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractExpression.java,v 1.2 2006-12-27 12:08:51 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression#getFilter <em>Filter</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAbstractExpression()
 * @model abstract="true"
 * @generated
 */
public interface AbstractExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAbstractExpression_Filter()
	 * @model required="true"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAbstractExpression_Id()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean evaluate(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.boolean" resourceDataType="fr.irisa.triskell.kermeta.kpm.IResource"
	 * @generated
	 */
	boolean evaluate(IResource resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getDependentFrom(Unit unit);

} // AbstractExpression