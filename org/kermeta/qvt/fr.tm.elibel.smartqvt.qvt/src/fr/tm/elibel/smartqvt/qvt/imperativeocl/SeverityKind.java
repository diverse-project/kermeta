/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Severity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getSeverityKind()
 * @model
 * @generated
 */
public final class SeverityKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_LITERAL
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR = 0;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Warning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARNING_LITERAL
	 * @model name="warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING = 1;

	/**
	 * The '<em><b>Fatal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fatal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FATAL_LITERAL
	 * @model name="fatal"
	 * @generated
	 * @ordered
	 */
	public static final int FATAL = 2;

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @generated
	 * @ordered
	 */
	public static final SeverityKind ERROR_LITERAL = new SeverityKind(ERROR, "error", "error");

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @generated
	 * @ordered
	 */
	public static final SeverityKind WARNING_LITERAL = new SeverityKind(WARNING, "warning", "warning");

	/**
	 * The '<em><b>Fatal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FATAL
	 * @generated
	 * @ordered
	 */
	public static final SeverityKind FATAL_LITERAL = new SeverityKind(FATAL, "fatal", "fatal");

	/**
	 * An array of all the '<em><b>Severity Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SeverityKind[] VALUES_ARRAY =
		new SeverityKind[] {
			ERROR_LITERAL,
			WARNING_LITERAL,
			FATAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Severity Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Severity Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeverityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeverityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeverityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeverityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeverityKind get(int value) {
		switch (value) {
			case ERROR: return ERROR_LITERAL;
			case WARNING: return WARNING_LITERAL;
			case FATAL: return FATAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SeverityKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SeverityKind
