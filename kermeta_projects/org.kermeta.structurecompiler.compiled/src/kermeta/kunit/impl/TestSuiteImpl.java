/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.10 2009-01-21 09:15:49 cfaucher Exp $
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
					.mustBeChecked("pre__28119__testCaseClassIsATestCase")) {
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

		java.lang.Boolean result_ft194 = null;

		java.lang.Boolean test_ft194 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsOrderedSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_914 = false;
			while (!idLoopCond_914) {
				idLoopCond_914 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft194.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft194, false));
				if (idLoopCond_914) {
				} else {

					java.lang.Boolean result_lambda_ft194 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp194 = it_ft194
							.next();

					result_lambda_ft194 = sc_lbdExp194
							.equals(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft194 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft194, result_lambda_ft194);
				}
			}
		}

		result_ft194 = test_ft194;
		//EIft:exists
		java.lang.Boolean idIfCond_913 = false;
		idIfCond_913 = kermeta.standard.helper.BooleanWrapper.not(result_ft194);

		if (idIfCond_913) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft196 = null;

		kermeta.language.structure.Operation elem_ft196 = null;

		result_ft196 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_916 = false;
			while (!idLoopCond_916) {
				idLoopCond_916 = it_ft196.isOff();
				if (idLoopCond_916) {
				} else {

					elem_ft196 = it_ft196.next();

					java.lang.Boolean idIfCond_917 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp196 = elem_ft196;

					java.lang.Boolean idIfCond_918 = false;
					idIfCond_918 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp196.getName()), 4);

					if (idIfCond_918) {

						idIfCond_917 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp196
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_917 = false;
					}

					//EIle:selector

					if (idIfCond_917) {

						result_ft196.add(elem_ft196);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft195 = result_ft196
					.iterator();
			java.lang.Boolean idLoopCond_915 = false;
			while (!idLoopCond_915) {
				idLoopCond_915 = it_ft195.isOff();
				if (idLoopCond_915) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp195 = it_ft195
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp195.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft197 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_919 = false;
			while (!idLoopCond_919) {
				idLoopCond_919 = it_ft197.isOff();
				if (idLoopCond_919) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp197 = it_ft197.next();

					t_lbdExp197.setLogKermeta(this.getLog());

					t_lbdExp197.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft199 = null;

		kermeta.language.structure.Operation elem_ft199 = null;

		result_ft199 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_921 = false;
			while (!idLoopCond_921) {
				idLoopCond_921 = it_ft199.isOff();
				if (idLoopCond_921) {
				} else {

					elem_ft199 = it_ft199.next();

					java.lang.Boolean idIfCond_922 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp199 = elem_ft199;

					java.lang.Boolean idIfCond_923 = false;
					idIfCond_923 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp199.getName()), 4);

					if (idIfCond_923) {

						idIfCond_922 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp199
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_922 = false;
					}

					//EIle:selector

					if (idIfCond_922) {

						result_ft199.add(elem_ft199);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft198 = result_ft199
					.iterator();
			java.lang.Boolean idLoopCond_920 = false;
			while (!idLoopCond_920) {
				idLoopCond_920 = it_ft198.isOff();
				if (idLoopCond_920) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp198 = it_ft198
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp198.getName());

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
