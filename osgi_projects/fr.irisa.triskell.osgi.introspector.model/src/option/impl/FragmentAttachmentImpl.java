/**
 * <copyright>
 * </copyright>
 *
 * $Id: FragmentAttachmentImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import option.FragmentAttachment;
import option.FragmentAttachmentEnum;
import option.OptionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fragment Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.FragmentAttachmentImpl#getFragmentAttachment <em>Fragment Attachment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentAttachmentImpl extends SymbolicNameDirectiveImpl implements
		FragmentAttachment {
	/**
	 * The default value of the '{@link #getFragmentAttachment() <em>Fragment Attachment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFragmentAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final FragmentAttachmentEnum FRAGMENT_ATTACHMENT_EDEFAULT = FragmentAttachmentEnum.ALWAYS;

	/**
	 * The cached value of the '{@link #getFragmentAttachment() <em>Fragment Attachment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFragmentAttachment()
	 * @generated
	 * @ordered
	 */
	protected FragmentAttachmentEnum fragmentAttachment = FRAGMENT_ATTACHMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected FragmentAttachmentImpl() {
		super();
		this.setToken(Constants.FRAGMENT_ATTACHMENT_DIRECTIVE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.FRAGMENT_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentAttachmentEnum getFragmentAttachment() {
		return fragmentAttachment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragmentAttachment(
			FragmentAttachmentEnum newFragmentAttachment) {
		FragmentAttachmentEnum oldFragmentAttachment = fragmentAttachment;
		fragmentAttachment = newFragmentAttachment == null ? FRAGMENT_ATTACHMENT_EDEFAULT : newFragmentAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionPackage.FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT, oldFragmentAttachment, fragmentAttachment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionPackage.FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT:
				return getFragmentAttachment();
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
			case OptionPackage.FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT:
				setFragmentAttachment((FragmentAttachmentEnum)newValue);
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
			case OptionPackage.FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT:
				setFragmentAttachment(FRAGMENT_ATTACHMENT_EDEFAULT);
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
			case OptionPackage.FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT:
				return fragmentAttachment != FRAGMENT_ATTACHMENT_EDEFAULT;
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
		result.append(" (fragmentAttachment: ");
		result.append(fragmentAttachment);
		result.append(')');
		return result.toString();
	}

} // FragmentAttachmentImpl
