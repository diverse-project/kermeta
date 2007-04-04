/**
 * <copyright>
 * </copyright>
 *
 * $Id: ANDExpressionImpl.java,v 1.1 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.ANDExpression;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AND Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ANDExpressionImpl extends NestedExpressionImpl implements ANDExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.AND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluateIn(Unit unit, boolean value) {
		return value && getExpression().evaluateIn(unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluateOut(Unit unit, boolean value) {
		return value && getExpression().evaluateOut(unit);
	}

} //ANDExpressionImpl