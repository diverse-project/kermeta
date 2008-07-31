/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcessorImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import option.OptionPackage;
import option.Processor;
import option.ProcessorEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.ProcessorImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends NativeCodeDirectiveImpl implements Processor {
	/**
	 * The default value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessorEnum PROCESSOR_EDEFAULT = ProcessorEnum.P6_8K;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected ProcessorEnum processor = PROCESSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ProcessorImpl() {
		super();
		this.setToken(Constants.BUNDLE_NATIVECODE_PROCESSOR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorEnum getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(ProcessorEnum newProcessor) {
		ProcessorEnum oldProcessor = processor;
		processor = newProcessor == null ? PROCESSOR_EDEFAULT : newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionPackage.PROCESSOR__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionPackage.PROCESSOR__PROCESSOR:
				return getProcessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptionPackage.PROCESSOR__PROCESSOR:
				setProcessor((ProcessorEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OptionPackage.PROCESSOR__PROCESSOR:
				setProcessor(PROCESSOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OptionPackage.PROCESSOR__PROCESSOR:
				return processor != PROCESSOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (processor: ");
		result.append(processor);
		result.append(')');
		return result.toString();
	}

} // ProcessorImpl
