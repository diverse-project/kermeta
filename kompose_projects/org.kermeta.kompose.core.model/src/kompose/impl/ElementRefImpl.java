/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementRefImpl.java,v 1.2 2009-01-22 20:26:52 mclavreu Exp $
 */
package kompose.impl;

import kompose.ElementRef;
import kompose.KomposePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ElementRefImpl extends EObjectImpl implements ElementRef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KomposePackage.Literals.ELEMENT_REF;
	}

} //ElementRefImpl
