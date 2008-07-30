/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportPackageDirectiveImpl.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option.impl;

import option.ExportPackageDirective;
import option.OptionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Export Package Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public abstract class ExportPackageDirectiveImpl extends DirectiveEntryImpl
		implements ExportPackageDirective {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExportPackageDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.EXPORT_PACKAGE_DIRECTIVE;
	}

} // ExportPackageDirectiveImpl
