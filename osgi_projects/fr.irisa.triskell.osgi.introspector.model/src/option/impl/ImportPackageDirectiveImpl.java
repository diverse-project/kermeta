/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportPackageDirectiveImpl.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option.impl;

import option.ImportPackageDirective;
import option.OptionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Import Package Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public abstract class ImportPackageDirectiveImpl extends
		RequireBundleDirectiveImpl implements ImportPackageDirective {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ImportPackageDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.IMPORT_PACKAGE_DIRECTIVE;
	}

} // ImportPackageDirectiveImpl
