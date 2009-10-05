/**
 * <copyright> </copyright>
 * 
 * $Id: Instruction.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Instruction</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.Instruction#getNext <em>Next</em>}</li>
 * <li>{@link org.openembedd.logo.csm.logoCSM.Instruction#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject
{
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.openembedd.logo.csm.logoCSM.Instruction#getPrevious <em>Previous</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Instruction)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getInstruction_Next()
	 * @see org.openembedd.logo.csm.logoCSM.Instruction#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Instruction getNext();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.Instruction#getNext <em>Next</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Instruction value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.openembedd.logo.csm.logoCSM.Instruction#getNext <em>Next</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Instruction)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getInstruction_Previous()
	 * @see org.openembedd.logo.csm.logoCSM.Instruction#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Instruction getPrevious();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.Instruction#getPrevious <em>Previous</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Instruction value);

} // Instruction
