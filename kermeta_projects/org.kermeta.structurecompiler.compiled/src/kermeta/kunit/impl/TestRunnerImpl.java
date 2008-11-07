/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestRunnerImpl.java,v 1.9 2008-11-07 08:52:28 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;
import kermeta.kunit.Test;
import kermeta.kunit.TestRunner;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.TestRunnerImpl#getLog <em>Log</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestRunnerImpl extends ObjectImpl implements TestRunner {
	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected Log log;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.TEST_RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log getLog() {
		if (log != null && log.eIsProxy()) {
			InternalEObject oldLog = (InternalEObject) log;
			log = (Log) eResolveProxy(oldLog);
			if (log != oldLog) {
				InternalEObject newLog = (InternalEObject) log;
				NotificationChain msgs = oldLog.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KunitPackage.TEST_RUNNER__LOG,
						null, null);
				if (newLog.eInternalContainer() == null) {
					msgs = newLog.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- KunitPackage.TEST_RUNNER__LOG, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							KunitPackage.TEST_RUNNER__LOG, oldLog, log));
			}
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log basicGetLog() {
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLog(Log newLog, NotificationChain msgs) {
		Log oldLog = log;
		log = newLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, KunitPackage.TEST_RUNNER__LOG, oldLog,
					newLog);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLog(Log newLog) {
		if (newLog != log) {
			NotificationChain msgs = null;
			if (log != null)
				msgs = ((InternalEObject) log).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KunitPackage.TEST_RUNNER__LOG,
						null, msgs);
			if (newLog != null)
				msgs = ((InternalEObject) newLog).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KunitPackage.TEST_RUNNER__LOG,
						null, msgs);
			msgs = basicSetLog(newLog, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.TEST_RUNNER__LOG, newLog, newLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void runTest(Test test) {

		//PreConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("pre__40070242__testNotVoid")) {
				java.lang.Boolean result_pre = false;

				result_pre = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(test, null);
				if (!result_pre) {
					kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
							.createConstraintViolatedPre();
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exp);
				}
			}
		}
		this
				.setLog(((kermeta.kunit.Log) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.kunit.Log")));

		test.setLogKermeta(this.getLog());

		test.run();

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("post__40070248__logNotVoid")) {
				java.lang.Boolean result_post = false;

				result_post = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getLog(), null);
				if (!result_post) {
					kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
							.createConstraintViolatedPost();
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exp);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printTestResult() {

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						"\n---------------------------------------------  TEST RESULTS-----------------------------------------------\n");

		java.lang.Boolean idIfCond_984 = false;
		idIfCond_984 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).empty());

		if (idIfCond_984) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
					.writeln("\nFailures: ");

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.kunit.Failure> it_ft219 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).iterator();
				java.lang.Boolean idLoopCond_985 = false;
				while (!idLoopCond_985) {
					idLoopCond_985 = it_ft219.isOff();
					if (idLoopCond_985) {
					} else {

						//BIle:func
						kermeta.kunit.Failure f_lbdExp219 = it_ft219.next();

						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.getInstance().writeln(
										kermeta.standard.helper.StringWrapper
												.plus("\n   ", f_lbdExp219
														.toString()));
						//EIle:func

					}
				}
			}

			//EIft:each

		}

		java.lang.Boolean idIfCond_986 = false;
		idIfCond_986 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).empty());

		if (idIfCond_986) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
					.writeln("\nErrors: ");

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.kunit.Error> it_ft220 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).iterator();
				java.lang.Boolean idLoopCond_987 = false;
				while (!idLoopCond_987) {
					idLoopCond_987 = it_ft220.isOff();
					if (idLoopCond_987) {
					} else {

						//BIle:func
						kermeta.kunit.Error e_lbdExp220 = it_ft220.next();

						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.getInstance().writeln(
										kermeta.standard.helper.StringWrapper
												.plus("\n   ", e_lbdExp220
														.toString()));
						//EIle:func

					}
				}
			}

			//EIft:each

		}

		java.lang.Boolean idIfCond_988 = false;
		idIfCond_988 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getHarnessErrors()).empty());

		if (idIfCond_988) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
					.writeln("\nErrors from setUp or tearDown : ");

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.kunit.Error> it_ft221 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getHarnessErrors()).iterator();
				java.lang.Boolean idLoopCond_989 = false;
				while (!idLoopCond_989) {
					idLoopCond_989 = it_ft221.isOff();
					if (idLoopCond_989) {
					} else {

						//BIle:func
						kermeta.kunit.Error e_lbdExp221 = it_ft221.next();

						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.getInstance().writeln(
										kermeta.standard.helper.StringWrapper
												.plus("\n   ", e_lbdExp221
														.toString()));
						//EIle:func

					}
				}
			}

			//EIft:each

		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"\n Summary: ");

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				kermeta.standard.helper.StringWrapper.plus(
						"   Number of launched tests : ",
						kermeta.standard.helper.IntegerWrapper.toString(this
								.getLog().getRuntests())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						kermeta.standard.helper.StringWrapper
								.plus(
										"   Number of failures : ",
										kermeta.standard.helper.IntegerWrapper
												.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<kermeta.kunit.Failure> convertAsOrderedSet(
																this
																		.getLog()
																		.getFailures())
														.size())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						kermeta.standard.helper.StringWrapper
								.plus(
										"   Number of errors : ",
										kermeta.standard.helper.IntegerWrapper
												.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<kermeta.kunit.Error> convertAsOrderedSet(
																this
																		.getLog()
																		.getErrors())
														.size())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						kermeta.standard.helper.StringWrapper
								.plus(
										"   Number of errors in setUp or tearDown: ",
										kermeta.standard.helper.IntegerWrapper
												.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<kermeta.kunit.Error> convertAsOrderedSet(
																this
																		.getLog()
																		.getHarnessErrors())
														.size())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						"\n-------------------------------------------------------------------------------------------------------------------------------\n");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(kermeta.language.structure.Class testCaseClass) {

		//PreConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("pre__40070453__cIsATestCase")) {
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
		this
				.runTest(((kermeta.kunit.TestSuite) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.kunit.TestSuite"))
						.addAllTestCasesFrom(testCaseClass));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KunitPackage.TEST_RUNNER__LOG:
			return basicSetLog(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KunitPackage.TEST_RUNNER__LOG:
			if (resolve)
				return getLog();
			return basicGetLog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case KunitPackage.TEST_RUNNER__LOG:
			setLog((Log) newValue);
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
		case KunitPackage.TEST_RUNNER__LOG:
			setLog((Log) null);
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
		case KunitPackage.TEST_RUNNER__LOG:
			return log != null;
		}
		return super.eIsSet(featureID);
	}

} //TestRunnerImpl
