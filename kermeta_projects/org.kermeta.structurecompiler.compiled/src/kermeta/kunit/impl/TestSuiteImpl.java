/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.4 2008-10-08 14:37:23 cfaucher Exp $
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

		java.lang.Boolean result_ft217 = null;

		java.lang.Boolean test_ft217 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft217 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_979 = false;
			while (!idLoopCond_979) {
				idLoopCond_979 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft217.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(test_ft217, false));
				if (idLoopCond_979) {
				} else {

					java.lang.Boolean result_lambda_ft217 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp217 = it_ft217
							.next();

					result_lambda_ft217 = sc_lbdExp217
							.equals(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft217 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft217, result_lambda_ft217);
				}
			}
		}

		result_ft217 = test_ft217;
		//EIft:exists
		java.lang.Boolean idIfCond_978 = false;
		idIfCond_978 = kermeta.standard.helper.BooleanWrapper.not(result_ft217);

		if (idIfCond_978) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft219 = null;

		kermeta.language.structure.Operation elem_ft219 = null;

		result_ft219 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft219 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_981 = false;
			while (!idLoopCond_981) {
				idLoopCond_981 = it_ft219.isOff();
				if (idLoopCond_981) {
				} else {

					elem_ft219 = it_ft219.next();

					java.lang.Boolean idIfCond_982 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp219 = elem_ft219;

					java.lang.Boolean idIfCond_983 = false;
					idIfCond_983 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp219.getName()), 4);

					if (idIfCond_983) {

						idIfCond_982 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp219
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_982 = false;
					}

					//EIle:selector

					if (idIfCond_982) {

						result_ft219.add(elem_ft219);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft218 = result_ft219
					.iterator();
			java.lang.Boolean idLoopCond_980 = false;
			while (!idLoopCond_980) {
				idLoopCond_980 = it_ft218.isOff();
				if (idLoopCond_980) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp218 = it_ft218
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o_lbdExp218.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft220 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_984 = false;
			while (!idLoopCond_984) {
				idLoopCond_984 = it_ft220.isOff();
				if (idLoopCond_984) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp220 = it_ft220.next();

					t_lbdExp220.setLogKermeta(this.getLog());

					t_lbdExp220.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft222 = null;

		kermeta.language.structure.Operation elem_ft222 = null;

		result_ft222 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft222 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_986 = false;
			while (!idLoopCond_986) {
				idLoopCond_986 = it_ft222.isOff();
				if (idLoopCond_986) {
				} else {

					elem_ft222 = it_ft222.next();

					java.lang.Boolean idIfCond_987 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp222 = elem_ft222;

					java.lang.Boolean idIfCond_988 = false;
					idIfCond_988 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp222.getName()), 4);

					if (idIfCond_988) {

						idIfCond_987 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp222
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_987 = false;
					}

					//EIle:selector

					if (idIfCond_987) {

						result_ft222.add(elem_ft222);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft221 = result_ft222
					.iterator();
			java.lang.Boolean idLoopCond_985 = false;
			while (!idLoopCond_985) {
				idLoopCond_985 = it_ft221.isOff();
				if (idLoopCond_985) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp221 = it_ft221
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o_lbdExp221.getName());

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
