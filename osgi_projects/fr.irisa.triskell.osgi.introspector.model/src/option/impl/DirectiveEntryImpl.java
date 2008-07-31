/**
 * <copyright>
 * </copyright>
 *
 * $Id: DirectiveEntryImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import option.DirectiveEntry;
import option.OptionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Directive Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DirectiveEntryImpl extends ParameterEntryImpl implements
		DirectiveEntry {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectiveEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.DIRECTIVE_ENTRY;
	}

} // DirectiveEntryImpl
