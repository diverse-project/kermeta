/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.kunit.impl;

import java.util.Collection;

import kermeta.kunit.KunitPackage;
import kermeta.kunit.Test;
import kermeta.kunit.TestSuite;

import kermeta.language.structure.ClassDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.TestSuiteImpl#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteImpl extends TestImpl implements TestSuite {
	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.TEST_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList<Test>(Test.class, this,
					KunitPackage.TEST_SUITE__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite addAllTestCasesFrom(
			kermeta.language.structure.Class testCaseClass) {

		kermeta.kunit.TestSuite result = null;

		//PreConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("pre__3362103__testCaseClassIsATestCase")) {
				java.lang.Boolean result_pre = false;

				result_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Class> convertAsOrderedSet(
								testCaseClass.getterSuperClass()).contains(
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance().getMetaClass(
												"kermeta.kunit.TestCase"));
				if (!result_pre) {
					kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
							.createConstraintViolatedPre();
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exp);
				}
			}
		}
		//BIft:exists

		java.lang.Boolean result_ft83 = null;

		java.lang.Boolean test_ft83 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsOrderedSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_360 = false;
			while (!idLoopCond_360) {
				idLoopCond_360 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft83.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft83, false));
				if (idLoopCond_360) {
				} else {

					java.lang.Boolean result_lambda_ft83 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp83 = it_ft83
							.next();

					result_lambda_ft83 = org.kermeta.compil.runtime.helper.language.ClassUtil
							.equalsSwitcher(sc_lbdExp83,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft83 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft83, result_lambda_ft83);
				}
			}
		}

		result_ft83 = test_ft83;
		//EIft:exists
		java.lang.Boolean idIfCond_359 = false;
		idIfCond_359 = kermeta.standard.helper.BooleanWrapper.not(result_ft83);

		if (idIfCond_359) {

			kermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.kunit.KunitPackage.eINSTANCE
							.getInvalidParameterException()));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(
					"Cannot build a suite from class: ", testCaseClass
							.getterName()));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft85 = null;

		kermeta.language.structure.Operation elem_ft85 = null;

		result_ft85 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_362 = false;
			while (!idLoopCond_362) {
				idLoopCond_362 = it_ft85.isOff();
				if (idLoopCond_362) {
				} else {

					elem_ft85 = it_ft85.next();

					java.lang.Boolean idIfCond_363 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp85 = elem_ft85;

					java.lang.Boolean idIfCond_364 = false;
					idIfCond_364 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp85.getName()), 4);

					if (idIfCond_364) {

						idIfCond_363 = kermeta.standard.helper.StringWrapper
								.equals(kermeta.standard.helper.StringWrapper
										.substring(o_lbdExp85.getName(), 0, 4),
										"test");
					} else {

						idIfCond_363 = false;
					}

					//EIle:selector

					if (idIfCond_363) {

						result_ft85.add(elem_ft85);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft84 = result_ft85
					.iterator();
			java.lang.Boolean idLoopCond_361 = false;
			while (!idLoopCond_361) {
				idLoopCond_361 = it_ft84.isOff();
				if (idLoopCond_361) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp84 = it_ft84
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp84.getName());

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.kunit.Test> convertAsOrderedSet(
									this.getTests()).add(testCase);
					//EIle:func

				}
			}
		}

		//EIft:each

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_365 = false;
			while (!idLoopCond_365) {
				idLoopCond_365 = it_ft86.isOff();
				if (idLoopCond_365) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp86 = it_ft86.next();

					t_lbdExp86.setLogEMF_renameAs(this.getLog());

					t_lbdExp86.run();
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect) {

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft88 = null;

		kermeta.language.structure.Operation elem_ft88 = null;

		result_ft88 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_367 = false;
			while (!idLoopCond_367) {
				idLoopCond_367 = it_ft88.isOff();
				if (idLoopCond_367) {
				} else {

					elem_ft88 = it_ft88.next();

					java.lang.Boolean idIfCond_368 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp88 = elem_ft88;

					java.lang.Boolean idIfCond_369 = false;
					idIfCond_369 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp88.getName()), 4);

					if (idIfCond_369) {

						idIfCond_368 = kermeta.standard.helper.StringWrapper
								.equals(kermeta.standard.helper.StringWrapper
										.substring(o_lbdExp88.getName(), 0, 4),
										"test");
					} else {

						idIfCond_368 = false;
					}

					//EIle:selector

					if (idIfCond_368) {

						result_ft88.add(elem_ft88);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft87 = result_ft88
					.iterator();
			java.lang.Boolean idLoopCond_366 = false;
			while (!idLoopCond_366) {
				idLoopCond_366 = it_ft87.isOff();
				if (idLoopCond_366) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp87 = it_ft87
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp87.getName());

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.kunit.Test> convertAsOrderedSet(
									this.getTests()).add(testCase);
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KunitPackage.TEST_SUITE__TESTS:
			return getTests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case KunitPackage.TEST_SUITE__TESTS:
			getTests().clear();
			getTests().addAll((Collection<? extends Test>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case KunitPackage.TEST_SUITE__TESTS:
			getTests().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case KunitPackage.TEST_SUITE__TESTS:
			return tests != null && !tests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestSuiteImpl
