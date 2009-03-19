/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtPackageReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import emf.spoon.reflect.declaration.CtPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Package Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtPackageReference()
 * @model
 * @generated
 */
public interface CtPackageReference extends CtReference, spoon.reflect.reference.CtPackageReference {
	CtPackage getDeclaration();

} // CtPackageReference