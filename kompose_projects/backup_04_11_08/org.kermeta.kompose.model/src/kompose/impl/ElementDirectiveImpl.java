/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementDirectiveImpl.java,v 1.1.1.1 2008-11-04 08:27:29 mclavreu Exp $
 */
package kompose.impl;

import kompose.ElementDirective;
import kompose.KomposePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ElementDirectiveImpl extends CompositionDirectiveImpl implements ElementDirective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KomposePackage.Literals.ELEMENT_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //ElementDirectiveImpl
