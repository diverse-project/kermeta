/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleExpressionImpl.java,v 1.3 2008-05-28 09:26:13 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import org.eclipse.emf.ecore.EClass;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SimpleExpressionImpl extends ExpressionImpl implements SimpleExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpmPackage.Literals.SIMPLE_EXPRESSION;
	}

} //SimpleExpressionImpl