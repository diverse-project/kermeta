/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteImpl.java,v 1.1 2008-09-04 15:40:25 cfaucher Exp $
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

		java.lang.Boolean result_ft152 = null;

		java.lang.Boolean test_ft152 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft152 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsOrderedSet(
							testCaseClass.getSuperClass()).iterator();
			java.lang.Boolean idLoopCond_730 = false;
			while (!idLoopCond_730) {
				idLoopCond_730 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft152.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(test_ft152, false));
				if (idLoopCond_730) {
				} else {

					java.lang.Boolean result_lambda = null;
					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Class sc = it_ft152.next();

					result_lambda = sc
							.equals(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.kunit.TestCase"));
					//End of the Inlining of the lambda expression: func

					test_ft152 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft152, result_lambda);
				}
			}
		}

		result_ft152 = test_ft152;
		//End of the Inlining of the function type: exists
		java.lang.Boolean idIfCond_729 = false;
		idIfCond_729 = kermeta.standard.helper.BooleanWrapper.not(result_ft152);

		if (idIfCond_729) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft154 = null;

		kermeta.language.structure.Operation elem_ft154 = null;

		result_ft154 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft154 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							testCaseClass.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_732 = false;
			while (!idLoopCond_732) {
				idLoopCond_732 = it_ft154.isOff();
				if (idLoopCond_732) {
				} else {

					elem_ft154 = it_ft154.next();

					java.lang.Boolean idIfCond_733 = false;
					//Beginning of the Inlining of the lambda expression: selector
					kermeta.language.structure.Operation o = elem_ft154;

					java.lang.Boolean idIfCond_734 = false;
					idIfCond_734 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o.getName()), 4);

					if (idIfCond_734) {

						idIfCond_733 = kermeta.standard.helper.StringWrapper
								.equals(kermeta.standard.helper.StringWrapper
										.substring(o.getName(), 0, 4), "test");
					} else {

						idIfCond_733 = false;
					}

					//End of the Inlining of the lambda expression: selector

					if (idIfCond_733) {

						result_ft154.add(elem_ft154);
					}

				}
			}
		}

		//End of the Inlining of the function type: select
		//Beginning of the Inlining of the function type: each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft153 = result_ft154
					.iterator();
			java.lang.Boolean idLoopCond_731 = false;
			while (!idLoopCond_731) {
				idLoopCond_731 = it_ft153.isOff();
				if (idLoopCond_731) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Operation o = it_ft153.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o.getName());

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.kunit.Test> convertAsOrderedSet(
									this.getTests()).add(testCase);
					//End of the Inlining of the lambda expression: func

				}
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

		{

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft155 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_735 = false;
			while (!idLoopCond_735) {
				idLoopCond_735 = it_ft155.isOff();
				if (idLoopCond_735) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.kunit.Test t = it_ft155.next();

					t.setLogKermeta(this.getLog());

					t.run();
					//End of the Inlining of the lambda expression: func

				}
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

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft157 = null;

		kermeta.language.structure.Operation elem_ft157 = null;

		result_ft157 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Operation>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft157 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_737 = false;
			while (!idLoopCond_737) {
				idLoopCond_737 = it_ft157.isOff();
				if (idLoopCond_737) {
				} else {

					elem_ft157 = it_ft157.next();

					java.lang.Boolean idIfCond_738 = false;
					//Beginning of the Inlining of the lambda expression: selector
					kermeta.language.structure.Operation o = elem_ft157;

					java.lang.Boolean idIfCond_739 = false;
					idIfCond_739 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o.getName()), 4);

					if (idIfCond_739) {

						idIfCond_738 = kermeta.standard.helper.StringWrapper
								.equals(kermeta.standard.helper.StringWrapper
										.substring(o.getName(), 0, 4), "test");
					} else {

						idIfCond_738 = false;
					}

					//End of the Inlining of the lambda expression: selector

					if (idIfCond_738) {

						result_ft157.add(elem_ft157);
					}

				}
			}
		}

		//End of the Inlining of the function type: select
		//Beginning of the Inlining of the function type: each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft156 = result_ft157
					.iterator();
			java.lang.Boolean idLoopCond_736 = false;
			while (!idLoopCond_736) {
				idLoopCond_736 = it_ft156.isOff();
				if (idLoopCond_736) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Operation o = it_ft156.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) testCaseClass._new();

					testCase.setTestMethodName(o.getName());

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.kunit.Test> convertAsOrderedSet(
									this.getTests()).add(testCase);
					//End of the Inlining of the lambda expression: func

				}
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
