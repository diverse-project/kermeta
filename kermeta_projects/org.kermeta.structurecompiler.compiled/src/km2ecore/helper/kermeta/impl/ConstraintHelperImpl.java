/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintHelperImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
 */
package km2ecore.helper.kermeta.impl;

import kermeta.language.structure.Constraint;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.helper.kermeta.ConstraintHelper;
import km2ecore.helper.kermeta.KermetaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstraintHelperImpl extends ObjectImpl implements
		ConstraintHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KermetaPackage.Literals.CONSTRAINT_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isPre(Constraint c) {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.container(c),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Operation")));

		java.lang.Boolean idIfCond_787 = false;
		idIfCond_787 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(op, null);

		if (idIfCond_787) {

			result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							op.getPre()).contains(c);
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isPost(Constraint c) {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.container(c),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Operation")));

		java.lang.Boolean idIfCond_788 = false;
		idIfCond_788 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(op, null);

		if (idIfCond_788) {

			result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							op.getPost()).contains(c);
		}

		return result;

	}

} //ConstraintHelperImpl
