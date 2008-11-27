/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.9 2008-11-27 15:49:48 cfaucher Exp $
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
					.mustBeChecked("pre__13634005__testCaseClassIsATestCase")) {
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

		java.lang.Boolean result_ft169 = null;

		java.lang.Boolean test_ft169 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft169 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsOrderedSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_757 = false;
			while (!idLoopCond_757) {
				idLoopCond_757 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft169.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft169, false));
				if (idLoopCond_757) {
				} else {

					java.lang.Boolean result_lambda_ft169 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp169 = it_ft169
							.next();

					result_lambda_ft169 = sc_lbdExp169
							.equals(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft169 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft169, result_lambda_ft169);
				}
			}
		}

		result_ft169 = test_ft169;
		//EIft:exists
		java.lang.Boolean idIfCond_756 = false;
		idIfCond_756 = kermeta.standard.helper.BooleanWrapper.not(result_ft169);

		if (idIfCond_756) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft171 = null;

		kermeta.language.structure.Operation elem_ft171 = null;

		result_ft171 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft171 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_759 = false;
			while (!idLoopCond_759) {
				idLoopCond_759 = it_ft171.isOff();
				if (idLoopCond_759) {
				} else {

					elem_ft171 = it_ft171.next();

					java.lang.Boolean idIfCond_760 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp171 = elem_ft171;

					java.lang.Boolean idIfCond_761 = false;
					idIfCond_761 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp171.getName()), 4);

					if (idIfCond_761) {

						idIfCond_760 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp171
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_760 = false;
					}

					//EIle:selector

					if (idIfCond_760) {

						result_ft171.add(elem_ft171);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft170 = result_ft171
					.iterator();
			java.lang.Boolean idLoopCond_758 = false;
			while (!idLoopCond_758) {
				idLoopCond_758 = it_ft170.isOff();
				if (idLoopCond_758) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp170 = it_ft170
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.ExecutionContext
							.getInstance()
							.<kermeta.kunit.TestCase> asTypeOrVoid(
									testCaseClass._new());

					testCase.setTestMethodName(o_lbdExp170.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft172 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_762 = false;
			while (!idLoopCond_762) {
				idLoopCond_762 = it_ft172.isOff();
				if (idLoopCond_762) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp172 = it_ft172.next();

					t_lbdExp172.setLogKermeta(this.getLog());

					t_lbdExp172.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft174 = null;

		kermeta.language.structure.Operation elem_ft174 = null;

		result_ft174 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft174 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_764 = false;
			while (!idLoopCond_764) {
				idLoopCond_764 = it_ft174.isOff();
				if (idLoopCond_764) {
				} else {

					elem_ft174 = it_ft174.next();

					java.lang.Boolean idIfCond_765 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp174 = elem_ft174;

					java.lang.Boolean idIfCond_766 = false;
					idIfCond_766 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp174.getName()), 4);

					if (idIfCond_766) {

						idIfCond_765 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp174
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_765 = false;
					}

					//EIle:selector

					if (idIfCond_765) {

						result_ft174.add(elem_ft174);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft173 = result_ft174
					.iterator();
			java.lang.Boolean idLoopCond_763 = false;
			while (!idLoopCond_763) {
				idLoopCond_763 = it_ft173.isOff();
				if (idLoopCond_763) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp173 = it_ft173
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.ExecutionContext
							.getInstance()
							.<kermeta.kunit.TestCase> asTypeOrVoid(
									testCaseClass._new());

					testCase.setTestMethodName(o_lbdExp173.getName());

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
