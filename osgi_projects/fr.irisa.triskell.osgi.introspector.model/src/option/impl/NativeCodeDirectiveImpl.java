/**
 * <copyright>
 * </copyright>
 *
 * $Id: NativeCodeDirectiveImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import option.NativeCodeDirective;
import option.OptionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Native Code Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class NativeCodeDirectiveImpl extends DirectiveEntryImpl
		implements NativeCodeDirective {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NativeCodeDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.NATIVE_CODE_DIRECTIVE;
	}

} // NativeCodeDirectiveImpl
