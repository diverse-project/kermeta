/**
 * <copyright>
 * </copyright>
 *
 * $Id: TerminalImpl.java,v 1.2 2006-11-23 16:06:15 dtouzet Exp $
 */
package sts.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sts.StsPackage;
import sts.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sts.impl.TerminalImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link sts.impl.TerminalImpl#isLexicalSeparator <em>Lexical Separator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends RuleImpl implements Terminal {
	/**
	 * The default value of the '{@link #getTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected String terminal = TERMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isLexicalSeparator() <em>Lexical Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLexicalSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEXICAL_SEPARATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLexicalSeparator() <em>Lexical Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLexicalSeparator()
	 * @generated
	 * @ordered
	 */
	protected boolean lexicalSeparator = LEXICAL_SEPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StsPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(String newTerminal) {
		String oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StsPackage.TERMINAL__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLexicalSeparator() {
		return lexicalSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexicalSeparator(boolean newLexicalSeparator) {
		boolean oldLexicalSeparator = lexicalSeparator;
		lexicalSeparator = newLexicalSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StsPackage.TERMINAL__LEXICAL_SEPARATOR, oldLexicalSeparator, lexicalSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StsPackage.TERMINAL__TERMINAL:
				return getTerminal();
			case StsPackage.TERMINAL__LEXICAL_SEPARATOR:
				return isLexicalSeparator() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StsPackage.TERMINAL__TERMINAL:
				setTerminal((String)newValue);
				return;
			case StsPackage.TERMINAL__LEXICAL_SEPARATOR:
				setLexicalSeparator(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case StsPackage.TERMINAL__TERMINAL:
				setTerminal(TERMINAL_EDEFAULT);
				return;
			case StsPackage.TERMINAL__LEXICAL_SEPARATOR:
				setLexicalSeparator(LEXICAL_SEPARATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StsPackage.TERMINAL__TERMINAL:
				return TERMINAL_EDEFAULT == null ? terminal != null : !TERMINAL_EDEFAULT.equals(terminal);
			case StsPackage.TERMINAL__LEXICAL_SEPARATOR:
				return lexicalSeparator != LEXICAL_SEPARATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (terminal: ");
		result.append(terminal);
		result.append(", lexicalSeparator: ");
		result.append(lexicalSeparator);
		result.append(')');
		return result.toString();
	}

} //TerminalImpl