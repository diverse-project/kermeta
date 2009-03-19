/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLocalVariableReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import org.eclipse.emf.ecore.EClass;

import emf.spoon.reflect.code.CtLocalVariable;
import emf.spoon.reflect.reference.CtLocalVariableReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Local Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CtLocalVariableReferenceImpl extends CtVariableReferenceImpl implements CtLocalVariableReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtLocalVariableReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_LOCAL_VARIABLE_REFERENCE;
	}
	
	public CtLocalVariable getDeclaration(){
		return (CtLocalVariable) super.getDeclaration();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReferencePackage.CT_VARIABLE_REFERENCE__SIMPLE_NAME:
			setSimpleName((String)newValue);
			return;
		case ReferencePackage.CT_VARIABLE_REFERENCE__TYPE:
			setType((CtTypeReference)newValue);
			return;
		case ReferencePackage.CT_VARIABLE_REFERENCE__DECLARATION:
				setDeclaration((spoon.reflect.code.CtLocalVariable) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

} //CtLocalVariableReferenceImpl