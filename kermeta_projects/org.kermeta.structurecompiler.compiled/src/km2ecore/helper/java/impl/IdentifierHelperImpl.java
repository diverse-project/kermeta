/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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

		java.lang.Boolean idIfCond_1188 = false;
		idIfCond_1188 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(id);

		if (idIfCond_1188) {

			result = id;
		}

		java.lang.Boolean idIfCond_1189 = false;
		idIfCond_1189 = context.getJavaKeyWordList().isKeyword(id);

		if (idIfCond_1189) {

			result = kermeta.standard.helper.StringWrapper.plus("_", id);
		} else {

			result = id;
		}

		return result;

	}

} //IdentifierHelperImpl
