/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.8 2008-11-07 08:52:29 cfaucher Exp $
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
					.mustBeChecked("pre__40069721__testCaseClassIsATestCase")) {
				java.lang.Boolean result_pre = false;

				result_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Class> convertAsSet(
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

		java.lang.Boolean result_ft211 = null;

		java.lang.Boolean test_ft211 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft211 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_970 = false;
			while (!idLoopCond_970) {
				idLoopCond_970 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft211.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft211, false));
				if (idLoopCond_970) {
				} else {

					java.lang.Boolean result_lambda_ft211 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp211 = it_ft211
							.next();

					result_lambda_ft211 = sc_lbdExp211
							.equals(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft211 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft211, result_lambda_ft211);
				}
			}
		}

		result_ft211 = test_ft211;
		//EIft:exists
		java.lang.Boolean idIfCond_969 = false;
		idIfCond_969 = kermeta.standard.helper.BooleanWrapper.not(result_ft211);

		if (idIfCond_969) {

			kermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.kunit.InvalidParameterException"));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(
					"Cannot build a suite from class: ", testCaseClass
							.getterName()));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft213 = null;

		kermeta.language.structure.Operation elem_ft213 = null;

		result_ft213 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft213 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_972 = false;
			while (!idLoopCond_972) {
				idLoopCond_972 = it_ft213.isOff();
				if (idLoopCond_972) {
				} else {

					elem_ft213 = it_ft213.next();

					java.lang.Boolean idIfCond_973 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp213 = elem_ft213;

					java.lang.Boolean idIfCond_974 = false;
					idIfCond_974 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp213.getName()), 4);

					if (idIfCond_974) {

						idIfCond_973 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp213
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_973 = false;
					}

					//EIle:selector

					if (idIfCond_973) {

						result_ft213.add(elem_ft213);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft212 = result_ft213
					.iterator();
			java.lang.Boolean idLoopCond_971 = false;
			while (!idLoopCond_971) {
				idLoopCond_971 = it_ft212.isOff();
				if (idLoopCond_971) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp212 = it_ft212
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.ExecutionContext
							.getInstance()
							.<kermeta.kunit.TestCase> asTypeOrVoid(
									testCaseClass._new());

					testCase.setTestMethodName(o_lbdExp212.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft214 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_975 = false;
			while (!idLoopCond_975) {
				idLoopCond_975 = it_ft214.isOff();
				if (idLoopCond_975) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp214 = it_ft214.next();

					t_lbdExp214.setLogKermeta(this.getLog());

					t_lbdExp214.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft216 = null;

		kermeta.language.structure.Operation elem_ft216 = null;

		result_ft216 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft216 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_977 = false;
			while (!idLoopCond_977) {
				idLoopCond_977 = it_ft216.isOff();
				if (idLoopCond_977) {
				} else {

					elem_ft216 = it_ft216.next();

					java.lang.Boolean idIfCond_978 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp216 = elem_ft216;

					java.lang.Boolean idIfCond_979 = false;
					idIfCond_979 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp216.getName()), 4);

					if (idIfCond_979) {

						idIfCond_978 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp216
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_978 = false;
					}

					//EIle:selector

					if (idIfCond_978) {

						result_ft216.add(elem_ft216);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft215 = result_ft216
					.iterator();
			java.lang.Boolean idLoopCond_976 = false;
			while (!idLoopCond_976) {
				idLoopCond_976 = it_ft215.isOff();
				if (idLoopCond_976) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp215 = it_ft215
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.ExecutionContext
							.getInstance()
							.<kermeta.kunit.TestCase> asTypeOrVoid(
									testCaseClass._new());

					testCase.setTestMethodName(o_lbdExp215.getName());

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
