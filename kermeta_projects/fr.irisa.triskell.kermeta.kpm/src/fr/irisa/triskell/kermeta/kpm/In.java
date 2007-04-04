/**
 * <copyright>
 * </copyright>
 *
 * $Id: In.java,v 1.1 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.In#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getIn()
 * @model
 * @generated
 */
public interface In extends AbstractEntity {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' container reference.
	 * @see #setDependency(Dependency)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getIn_Dependency()
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Dependency getDependency();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.In#getDependency <em>Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' container reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Dependency value);

} // In