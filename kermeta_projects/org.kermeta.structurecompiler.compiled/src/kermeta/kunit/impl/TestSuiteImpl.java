/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.3 2008-09-22 14:46:09 cfaucher Exp $
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

		//BIft:exists

		java.lang.Boolean result_ft205 = null;

		java.lang.Boolean test_ft205 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft205 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsOrderedSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_911 = false;
			while (!idLoopCond_911) {
				idLoopCond_911 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft205.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(test_ft205, false));
				if (idLoopCond_911) {
				} else {

					java.lang.Boolean result_lambda_ft205 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp205 = it_ft205
							.next();

					result_lambda_ft205 = sc_lbdExp205
							.equals(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft205 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft205, result_lambda_ft205);
				}
			}
		}

		result_ft205 = test_ft205;
		//EIft:exists
		java.lang.Boolean idIfCond_910 = false;
		idIfCond_910 = kermeta.standard.helper.BooleanWrapper.not(result_ft205);

		if (idIfCond_910) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft207 = null;

		kermeta.language.structure.Operation elem_ft207 = null;

		result_ft207 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft207 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_913 = false;
			while (!idLoopCond_913) {
				idLoopCond_913 = it_ft207.isOff();
				if (idLoopCond_913) {
				} else {

					elem_ft207 = it_ft207.next();

					java.lang.Boolean idIfCond_914 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp207 = elem_ft207;

					java.lang.Boolean idIfCond_915 = false;
					idIfCond_915 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp207.getName()), 4);

					if (idIfCond_915) {

						idIfCond_914 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp207
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_914 = false;
					}

					//EIle:selector

					if (idIfCond_914) {

						result_ft207.add(elem_ft207);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft206 = result_ft207
					.iterator();
			java.lang.Boolean idLoopCond_912 = false;
			while (!idLoopCond_912) {
				idLoopCond_912 = it_ft206.isOff();
				if (idLoopCond_912) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp206 = it_ft206
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o_lbdExp206.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft208 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_916 = false;
			while (!idLoopCond_916) {
				idLoopCond_916 = it_ft208.isOff();
				if (idLoopCond_916) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp208 = it_ft208.next();

					t_lbdExp208.setLogKermeta(this.getLog());

					t_lbdExp208.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft210 = null;

		kermeta.language.structure.Operation elem_ft210 = null;

		result_ft210 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft210 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_918 = false;
			while (!idLoopCond_918) {
				idLoopCond_918 = it_ft210.isOff();
				if (idLoopCond_918) {
				} else {

					elem_ft210 = it_ft210.next();

					java.lang.Boolean idIfCond_919 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp210 = elem_ft210;

					java.lang.Boolean idIfCond_920 = false;
					idIfCond_920 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp210.getName()), 4);

					if (idIfCond_920) {

						idIfCond_919 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp210
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_919 = false;
					}

					//EIle:selector

					if (idIfCond_919) {

						result_ft210.add(elem_ft210);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft209 = result_ft210
					.iterator();
			java.lang.Boolean idLoopCond_917 = false;
			while (!idLoopCond_917) {
				idLoopCond_917 = it_ft209.isOff();
				if (idLoopCond_917) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp209 = it_ft209
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o_lbdExp209.getName());

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
