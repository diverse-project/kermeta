/**
 * <copyright>
 * </copyright>
 *
 * $Id: ORExpressionImpl.java,v 1.3 2008-05-28 09:26:14 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.ORExpression;
import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OR Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ORExpressionImpl extends NestedExpressionImpl implements ORExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpmPackage.Literals.OR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluateIn(Unit unit) {
		boolean leftValue = getLeft().evaluateIn(unit);
		if ( ! leftValue )
			return getRight().evaluateIn(unit);
		return leftValue;
	}

} //ORExpressionImpl