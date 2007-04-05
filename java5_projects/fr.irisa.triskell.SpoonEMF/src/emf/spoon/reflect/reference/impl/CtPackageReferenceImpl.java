/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtPackageReferenceImpl.java,v 1.1 2007-04-05 12:52:09 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.ReferencePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Package Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CtPackageReferenceImpl extends CtReferenceImpl implements CtPackageReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtPackageReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_PACKAGE_REFERENCE;
	}

	public CtPackage getDeclaration(){
		return (CtPackage) super.getDeclaration();
		
	}

} //CtPackageReferenceImpl