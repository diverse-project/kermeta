/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.2 2008-08-19 13:23:02 cfaucher Exp $
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

		//Beginning of the Inlining of the function type: exists

		java.lang.Boolean result_ft1 = null;

		java.lang.Boolean test_ft1 = false;

		kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft1 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Class> convertAsSet(
						testCaseClass.getSuperClass()).iterator();
		java.lang.Boolean idLoopCond_33 = false;
		while (!idLoopCond_33) {
			idLoopCond_33 = kermeta.standard.helper.BooleanWrapper.or(it_ft1
					.isOff(),
					org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(test_ft1, false));
			;
			if (idLoopCond_33) {
			} else {

				java.lang.Boolean result_lambda = null;
				//Beginning of the Inlining of the lambda expression: func
				kermeta.language.structure.Class sc = it_ft1.next();

				result_lambda = sc
						.equals(org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.kunit.TestCase"));
				//End of the Inlining of the lambda expression: func

				test_ft1 = kermeta.standard.helper.BooleanWrapper.or(test_ft1,
						result_lambda);
			}
		}

		result_ft1 = test_ft1;
		//End of the Inlining of the function type: exists
		java.lang.Boolean idIfCond_32 = false;
		idIfCond_32 = kermeta.standard.helper.BooleanWrapper.not(result_ft1);

		if (idIfCond_32) {

			kermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.kunit.InvalidParameterException"));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(
					"Cannot build a suite from class: ", testCaseClass
							.getName()));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		//Beginning of the Inlining of the function type: select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft3 = null;

		kermeta.language.structure.Operation elem_ft3 = null;

		result_ft3 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Operation> convertAsSet(
						testCaseClass.getOwnedOperation()).iterator();
		java.lang.Boolean idLoopCond_35 = false;
		while (!idLoopCond_35) {
			idLoopCond_35 = it_ft3.isOff();
			;
			if (idLoopCond_35) {
			} else {

				elem_ft3 = it_ft3.next();

				java.lang.Boolean idIfCond_36 = false;
				//Beginning of the Inlining of the lambda expression: selector
				kermeta.language.structure.Operation o = elem_ft3;

				java.lang.Boolean idIfCond_37 = false;
				idIfCond_37 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(kermeta.standard.helper.StringWrapper
								.size(o.getName()), 4);

				if (idIfCond_37) {

					idIfCond_36 = kermeta.standard.helper.StringWrapper.equals(
							kermeta.standard.helper.StringWrapper.substring(o
									.getName(), 0, 4), "test");
				} else {

					idIfCond_36 = false;
				}

				//End of the Inlining of the lambda expression: selector

				if (idIfCond_36) {

					result_ft3.add(elem_ft3);
				}

			}
		}
		//End of the Inlining of the function type: select
		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft2 = result_ft3
				.iterator();
		java.lang.Boolean idLoopCond_34 = false;
		while (!idLoopCond_34) {
			idLoopCond_34 = it_ft2.isOff();
			;
			if (idLoopCond_34) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				kermeta.language.structure.Operation o = it_ft2.next();

				kermeta.kunit.TestCase testCase = null;

				testCase = (kermeta.kunit.TestCase) testCaseClass._new();

				testCase.setTestMethodName(o.getName());

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Test> convertAsOrderedSet(
								this.getTests()).add(testCase);
				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {

		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<kermeta.kunit.Test> it_ft4 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
				.iterator();
		java.lang.Boolean idLoopCond_38 = false;
		while (!idLoopCond_38) {
			idLoopCond_38 = it_ft4.isOff();
			;
			if (idLoopCond_38) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				kermeta.kunit.Test t = it_ft4.next();

				t.setLogKermeta(this.getLog());

				t.run();
				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect) {

		//Beginning of the Inlining of the function type: select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft6 = null;

		kermeta.language.structure.Operation elem_ft6 = null;

		result_ft6 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Operation> convertAsOrderedSet(
						anAspect.getOwnedOperation()).iterator();
		java.lang.Boolean idLoopCond_40 = false;
		while (!idLoopCond_40) {
			idLoopCond_40 = it_ft6.isOff();
			;
			if (idLoopCond_40) {
			} else {

				elem_ft6 = it_ft6.next();

				java.lang.Boolean idIfCond_41 = false;
				//Beginning of the Inlining of the lambda expression: selector
				kermeta.language.structure.Operation o = elem_ft6;

				java.lang.Boolean idIfCond_42 = false;
				idIfCond_42 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(kermeta.standard.helper.StringWrapper
								.size(o.getName()), 4);

				if (idIfCond_42) {

					idIfCond_41 = kermeta.standard.helper.StringWrapper.equals(
							kermeta.standard.helper.StringWrapper.substring(o
									.getName(), 0, 4), "test");
				} else {

					idIfCond_41 = false;
				}

				//End of the Inlining of the lambda expression: selector

				if (idIfCond_41) {

					result_ft6.add(elem_ft6);
				}

			}
		}
		//End of the Inlining of the function type: select
		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft5 = result_ft6
				.iterator();
		java.lang.Boolean idLoopCond_39 = false;
		while (!idLoopCond_39) {
			idLoopCond_39 = it_ft5.isOff();
			;
			if (idLoopCond_39) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				kermeta.language.structure.Operation o = it_ft5.next();

				kermeta.kunit.TestCase testCase = null;

				testCase = (kermeta.kunit.TestCase) testCaseClass._new();

				testCase.setTestMethodName(o.getName());

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Test> convertAsOrderedSet(
								this.getTests()).add(testCase);
				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

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
