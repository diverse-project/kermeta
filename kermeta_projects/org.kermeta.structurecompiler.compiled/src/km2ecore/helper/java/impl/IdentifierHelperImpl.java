/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: IdentifierHelperImpl.java,v 1.12 2009-02-23 15:26:50 cfaucher Exp $
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

		java.lang.Boolean idIfCond_11 = false;
		idIfCond_11 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(id);

		if (idIfCond_11) {

			result = id;
		}

		java.lang.Boolean idIfCond_12 = false;
		idIfCond_12 = context.getJavaKeyWordList().isKeyword(id);

		if (idIfCond_12) {

			result = kermeta.standard.helper.StringWrapper.plus("_", id);
		} else {

			result = id;
		}

		return result;

	}

} //IdentifierHelperImpl
