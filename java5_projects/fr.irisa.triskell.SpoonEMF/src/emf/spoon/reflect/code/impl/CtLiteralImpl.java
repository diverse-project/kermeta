/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLiteralImpl.java,v 1.1 2007-04-05 12:52:08 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtLiteral;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtLiteralImpl extends CtExpressionImpl implements CtLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_LITERAL;
	}

} //CtLiteralImpl