/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.2 2008-09-11 12:34:39 cfaucher Exp $
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

		java.lang.Boolean result_ft158 = null;

		java.lang.Boolean test_ft158 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft158 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsOrderedSet(
							testCaseClass.getSuperClass()).iterator();
			java.lang.Boolean idLoopCond_824 = false;
			while (!idLoopCond_824) {
				idLoopCond_824 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft158.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(test_ft158, false));
				if (idLoopCond_824) {
				} else {

					java.lang.Boolean result_lambda = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp158 = it_ft158
							.next();

					result_lambda = sc_lbdExp158
							.equals(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft158 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft158, result_lambda);
				}
			}
		}

		result_ft158 = test_ft158;
		//EIft:exists
		java.lang.Boolean idIfCond_823 = false;
		idIfCond_823 = kermeta.standard.helper.BooleanWrapper.not(result_ft158);

		if (idIfCond_823) {

			kermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.kunit.InvalidParameterException"));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(
					"Cannot build a suite from class: ", testCaseClass
							.getName()));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft160 = null;

		kermeta.language.structure.Operation elem_ft160 = null;

		result_ft160 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft160 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							testCaseClass.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_826 = false;
			while (!idLoopCond_826) {
				idLoopCond_826 = it_ft160.isOff();
				if (idLoopCond_826) {
				} else {

					elem_ft160 = it_ft160.next();

					java.lang.Boolean idIfCond_827 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp160 = elem_ft160;

					java.lang.Boolean idIfCond_828 = false;
					idIfCond_828 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp160.getName()), 4);

					if (idIfCond_828) {

						idIfCond_827 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp160
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_827 = false;
					}

					//EIle:selector

					if (idIfCond_827) {

						result_ft160.add(elem_ft160);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft159 = result_ft160
					.iterator();
			java.lang.Boolean idLoopCond_825 = false;
			while (!idLoopCond_825) {
				idLoopCond_825 = it_ft159.isOff();
				if (idLoopCond_825) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp159 = it_ft159
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o_lbdExp159.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft161 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_829 = false;
			while (!idLoopCond_829) {
				idLoopCond_829 = it_ft161.isOff();
				if (idLoopCond_829) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp161 = it_ft161.next();

					t_lbdExp161.setLogKermeta(this.getLog());

					t_lbdExp161.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft163 = null;

		kermeta.language.structure.Operation elem_ft163 = null;

		result_ft163 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft163 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_831 = false;
			while (!idLoopCond_831) {
				idLoopCond_831 = it_ft163.isOff();
				if (idLoopCond_831) {
				} else {

					elem_ft163 = it_ft163.next();

					java.lang.Boolean idIfCond_832 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp163 = elem_ft163;

					java.lang.Boolean idIfCond_833 = false;
					idIfCond_833 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp163.getName()), 4);

					if (idIfCond_833) {

						idIfCond_832 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp163
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_832 = false;
					}

					//EIle:selector

					if (idIfCond_832) {

						result_ft163.add(elem_ft163);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft162 = result_ft163
					.iterator();
			java.lang.Boolean idLoopCond_830 = false;
			while (!idLoopCond_830) {
				idLoopCond_830 = it_ft162.isOff();
				if (idLoopCond_830) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp162 = it_ft162
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o_lbdExp162.getName());

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
