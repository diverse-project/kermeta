/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TestSuiteImpl.java,v 1.12 2009-02-23 15:26:38 cfaucher Exp $
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
					.mustBeChecked("pre__30663__testCaseClassIsATestCase")) {
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

		java.lang.Boolean result_ft203 = null;

		java.lang.Boolean test_ft203 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft203 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_966 = false;
			while (!idLoopCond_966) {
				idLoopCond_966 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft203.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft203, false));
				if (idLoopCond_966) {
				} else {

					java.lang.Boolean result_lambda_ft203 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp203 = it_ft203
							.next();

					result_lambda_ft203 = org.kermeta.compil.runtime.helper.language.ClassUtil
							.equalsSwitcher(sc_lbdExp203,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft203 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft203, result_lambda_ft203);
				}
			}
		}

		result_ft203 = test_ft203;
		//EIft:exists
		java.lang.Boolean idIfCond_965 = false;
		idIfCond_965 = kermeta.standard.helper.BooleanWrapper.not(result_ft203);

		if (idIfCond_965) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft205 = null;

		kermeta.language.structure.Operation elem_ft205 = null;

		result_ft205 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft205 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_968 = false;
			while (!idLoopCond_968) {
				idLoopCond_968 = it_ft205.isOff();
				if (idLoopCond_968) {
				} else {

					elem_ft205 = it_ft205.next();

					java.lang.Boolean idIfCond_969 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp205 = elem_ft205;

					java.lang.Boolean idIfCond_970 = false;
					idIfCond_970 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp205.getName()), 4);

					if (idIfCond_970) {

						idIfCond_969 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp205
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_969 = false;
					}

					//EIle:selector

					if (idIfCond_969) {

						result_ft205.add(elem_ft205);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft204 = result_ft205
					.iterator();
			java.lang.Boolean idLoopCond_967 = false;
			while (!idLoopCond_967) {
				idLoopCond_967 = it_ft204.isOff();
				if (idLoopCond_967) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp204 = it_ft204
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp204.getName());

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

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft206 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_971 = false;
			while (!idLoopCond_971) {
				idLoopCond_971 = it_ft206.isOff();
				if (idLoopCond_971) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp206 = it_ft206.next();

					t_lbdExp206.setLogEMF_renameAs(this.getLog());

					t_lbdExp206.run();
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft208 = null;

		kermeta.language.structure.Operation elem_ft208 = null;

		result_ft208 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft208 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_973 = false;
			while (!idLoopCond_973) {
				idLoopCond_973 = it_ft208.isOff();
				if (idLoopCond_973) {
				} else {

					elem_ft208 = it_ft208.next();

					java.lang.Boolean idIfCond_974 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp208 = elem_ft208;

					java.lang.Boolean idIfCond_975 = false;
					idIfCond_975 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp208.getName()), 4);

					if (idIfCond_975) {

						idIfCond_974 = kermeta.standard.helper.StringWrapper
								.equals(
										kermeta.standard.helper.StringWrapper
												.substring(o_lbdExp208
														.getName(), 0, 4),
										"test");
					} else {

						idIfCond_974 = false;
					}

					//EIle:selector

					if (idIfCond_974) {

						result_ft208.add(elem_ft208);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft207 = result_ft208
					.iterator();
			java.lang.Boolean idLoopCond_972 = false;
			while (!idLoopCond_972) {
				idLoopCond_972 = it_ft207.isOff();
				if (idLoopCond_972) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp207 = it_ft207
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp207.getName());

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
