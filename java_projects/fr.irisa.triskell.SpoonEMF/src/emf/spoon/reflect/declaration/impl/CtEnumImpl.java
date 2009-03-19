/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtEnumImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import org.eclipse.emf.ecore.EClass;

import emf.spoon.reflect.declaration.CtEnum;
import emf.spoon.reflect.declaration.DeclarationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract  class CtEnumImpl extends CtTypeImpl implements CtEnum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_ENUM;
	}

} //CtEnumImpl