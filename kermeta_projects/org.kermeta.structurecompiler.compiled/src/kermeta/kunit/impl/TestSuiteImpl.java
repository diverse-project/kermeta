/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TestSuiteImpl.java,v 1.11 2009-02-10 17:51:44 cfaucher Exp $
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
					.mustBeChecked("pre__33057__testCaseClassIsATestCase")) {
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

		java.lang.Boolean result_ft244 = null;

		java.lang.Boolean test_ft244 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsOrderedSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_1113 = false;
			while (!idLoopCond_1113) {
				idLoopCond_1113 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft244.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft244, false));
				if (idLoopCond_1113) {
				} else {

					java.lang.Boolean result_lambda_ft244 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp244 = it_ft244
							.next();

					result_lambda_ft244 = org.kermeta.compil.runtime.helper.language.ClassUtil
							.equalsSwitcher(sc_lbdExp244,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft244 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft244, result_lambda_ft244);
				}
			}
		}

		result_ft244 = test_ft244;
		//EIft:exists
		java.lang.Boolean idIfCond_1112 = false;
		idIfCond_1112 = kermeta.standard.helper.BooleanWrapper
				.not(result_ft244);

		if (idIfCond_1112) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft246 = null;

		kermeta.language.structure.Operation elem_ft246 = null;

		result_ft246 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft246 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_1115 = false;
			while (!idLoopCond_1115) {
				idLoopCond_1115 = it_ft246.isOff();
				if (idLoopCond_1115) {
				} else {

					elem_ft246 = it_ft246.next();

					java.lang.Boolean idIfCond_1116 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp246 = elem_ft246;

					java.lang.Boolean idIfCond_1117 = false;
					idIfCond_1117 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp246.getName()), 4);

					if (idIfCond_1117) {

						idIfCond_1116 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp246
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_1116 = false;
					}

					//EIle:selector

					if (idIfCond_1116) {

						result_ft246.add(elem_ft246);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft245 = result_ft246
					.iterator();
			java.lang.Boolean idLoopCond_1114 = false;
			while (!idLoopCond_1114) {
				idLoopCond_1114 = it_ft245.isOff();
				if (idLoopCond_1114) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp245 = it_ft245
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp245.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_1118 = false;
			while (!idLoopCond_1118) {
				idLoopCond_1118 = it_ft247.isOff();
				if (idLoopCond_1118) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp247 = it_ft247.next();

					t_lbdExp247.setLogKermeta(this.getLog());

					t_lbdExp247.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft249 = null;

		kermeta.language.structure.Operation elem_ft249 = null;

		result_ft249 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_1120 = false;
			while (!idLoopCond_1120) {
				idLoopCond_1120 = it_ft249.isOff();
				if (idLoopCond_1120) {
				} else {

					elem_ft249 = it_ft249.next();

					java.lang.Boolean idIfCond_1121 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp249 = elem_ft249;

					java.lang.Boolean idIfCond_1122 = false;
					idIfCond_1122 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp249.getName()), 4);

					if (idIfCond_1122) {

						idIfCond_1121 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp249
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_1121 = false;
					}

					//EIle:selector

					if (idIfCond_1121) {

						result_ft249.add(elem_ft249);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft248 = result_ft249
					.iterator();
			java.lang.Boolean idLoopCond_1119 = false;
			while (!idLoopCond_1119) {
				idLoopCond_1119 = it_ft248.isOff();
				if (idLoopCond_1119) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp248 = it_ft248
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp248.getName());

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
