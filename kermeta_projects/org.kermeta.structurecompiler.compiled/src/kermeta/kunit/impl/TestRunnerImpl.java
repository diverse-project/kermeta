/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestRunnerImpl.java,v 1.1 2008-09-04 15:40:24 cfaucher Exp $
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

		this
				.setLog(((kermeta.kunit.Log) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.kunit.Log")));

		test.setLogKermeta(this.getLog());

		test.run();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printTestResult() {

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln("\n---------------------------------------------  TEST RESULTS-----------------------------------------------\n");

		java.lang.Boolean idIfCond_744 = false;
		idIfCond_744 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).empty());

		if (idIfCond_744) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.writeln("\nFailures: ");

			//Beginning of the Inlining of the function type: each

			{

				kermeta.standard.Iterator<kermeta.kunit.Failure> it_ft160 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).iterator();
				java.lang.Boolean idLoopCond_745 = false;
				while (!idLoopCond_745) {
					idLoopCond_745 = it_ft160.isOff();
					if (idLoopCond_745) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						kermeta.kunit.Failure f = it_ft160.next();

						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.writeln(kermeta.standard.helper.StringWrapper
										.plus("\n   ", f.toString()));
						//End of the Inlining of the lambda expression: func

					}
				}
			}

			//End of the Inlining of the function type: each

		}

		java.lang.Boolean idIfCond_746 = false;
		idIfCond_746 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).empty());

		if (idIfCond_746) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.writeln("\nErrors: ");

			//Beginning of the Inlining of the function type: each

			{

				kermeta.standard.Iterator<kermeta.kunit.Error> it_ft161 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).iterator();
				java.lang.Boolean idLoopCond_747 = false;
				while (!idLoopCond_747) {
					idLoopCond_747 = it_ft161.isOff();
					if (idLoopCond_747) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						kermeta.kunit.Error e = it_ft161.next();

						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.writeln(kermeta.standard.helper.StringWrapper
										.plus("\n   ", e.toString()));
						//End of the Inlining of the lambda expression: func

					}
				}
			}

			//End of the Inlining of the function type: each

		}

		java.lang.Boolean idIfCond_748 = false;
		idIfCond_748 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getHarnessErrors()).empty());

		if (idIfCond_748) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.writeln("\nErrors from setUp or tearDown : ");

			//Beginning of the Inlining of the function type: each

			{

				kermeta.standard.Iterator<kermeta.kunit.Error> it_ft162 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getHarnessErrors()).iterator();
				java.lang.Boolean idLoopCond_749 = false;
				while (!idLoopCond_749) {
					idLoopCond_749 = it_ft162.isOff();
					if (idLoopCond_749) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						kermeta.kunit.Error e = it_ft162.next();

						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.writeln(kermeta.standard.helper.StringWrapper
										.plus("\n   ", e.toString()));
						//End of the Inlining of the lambda expression: func

					}
				}
			}

			//End of the Inlining of the function type: each

		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("\n Summary: ");

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(kermeta.standard.helper.StringWrapper.plus(
						"   Number of launched tests : ",
						kermeta.standard.helper.IntegerWrapper.toString(this
								.getLog().getRuntests())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(kermeta.standard.helper.StringWrapper
						.plus(
								"   Number of failures : ",
								kermeta.standard.helper.IntegerWrapper
										.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.kunit.Failure> convertAsOrderedSet(
														this.getLog()
																.getFailures())
												.size())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(kermeta.standard.helper.StringWrapper
						.plus(
								"   Number of errors : ",
								kermeta.standard.helper.IntegerWrapper
										.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.kunit.Error> convertAsOrderedSet(
														this.getLog()
																.getErrors())
												.size())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(kermeta.standard.helper.StringWrapper
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
				.writeln("\n-------------------------------------------------------------------------------------------------------------------------------\n");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(kermeta.language.structure.Class testCaseClass) {

		this
				.runTest(((kermeta.kunit.TestSuite) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.kunit.TestSuite"))
						.addAllTestCasesFrom(org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("testCaseClass")));

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
