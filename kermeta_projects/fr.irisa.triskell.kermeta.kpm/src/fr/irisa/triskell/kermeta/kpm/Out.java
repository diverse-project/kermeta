/**
 * <copyright>
 * </copyright>
 *
 * $Id: Out.java,v 1.1 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Out#getAction <em>Action</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Out#getDependency <em>Dependency</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Out#isIndependant <em>Independant</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut()
 * @model
 * @generated
 */
public interface Out extends AbstractEntity {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Out#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getOuts <em>Outs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' container reference.
	 * @see #setDependency(Dependency)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut_Dependency()
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getOuts
	 * @model opposite="outs"
	 * @generated
	 */
	Dependency getDependency();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Out#getDependency <em>Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' container reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Independant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independant</em>' attribute.
	 * @see #setIndependant(boolean)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getOut_Independant()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndependant();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Out#isIndependant <em>Independant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Independant</em>' attribute.
	 * @see #isIndependant()
	 * @generated
	 */
	void setIndependant(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="fr.irisa.triskell.kermeta.kpm.IProgressMonitor"
	 * @generated
	 */
	void process(Unit unit, IProgressMonitor monitor, Map args);

} // Out