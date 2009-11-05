/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.exceptions;

import kermeta.standard.Set;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.exceptions.ConstraintsDiagnostic#getSetConstraints <em>Set Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.exceptions.ExceptionsPackage#getConstraintsDiagnostic()
 * @model
 * @generated
 */
public interface ConstraintsDiagnostic extends
		kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Set Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Constraints</em>' containment reference.
	 * @see #setSetConstraints(Set)
	 * @see kermeta.exceptions.ExceptionsPackage#getConstraintsDiagnostic_SetConstraints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Set<ConstraintViolatedInv> getSetConstraints();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.ConstraintsDiagnostic#getSetConstraints <em>Set Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Constraints</em>' containment reference.
	 * @see #getSetConstraints()
	 * @generated
	 */
	void setSetConstraints(Set<ConstraintViolatedInv> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.getSetConstraints().add(cons);\n'"
	 * @generated
	 */
	void add(ConstraintViolatedInv cons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.exceptions.ConstraintsDiagnostic result = null;\n\n\tthis.setSetConstraints(((kermeta.standard.Set<kermeta.exceptions.ConstraintViolatedInv>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet())));\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	ConstraintsDiagnostic initialize();

} // ConstraintsDiagnostic
