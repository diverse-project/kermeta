/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdentifierHelperImpl.java,v 1.10 2009-01-21 09:16:01 cfaucher Exp $
 */
package km2ecore.helper.java.impl;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.KM2EcoreContext;

import km2ecore.helper.java.IdentifierHelper;
import km2ecore.helper.java.JavaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IdentifierHelperImpl extends ObjectImpl implements
		IdentifierHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.IDENTIFIER_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMangledIdentifier(String id, KM2EcoreContext context) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1116 = false;
		idIfCond_1116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(id);

		if (idIfCond_1116) {

			result = id;
		}

		java.lang.Boolean idIfCond_1117 = false;
		idIfCond_1117 = context.getJavaKeyWordList().isKeyword(id);

		if (idIfCond_1117) {

			result = kermeta.standard.helper.StringWrapper.plus("_", id);
		} else {

			result = id;
		}

		return result;

	}

} //IdentifierHelperImpl
