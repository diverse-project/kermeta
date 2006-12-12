/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpressionImpl.java,v 1.1 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.AbstractExpression;
import fr.irisa.triskell.kermeta.kpm.And;
import fr.irisa.triskell.kermeta.kpm.Expression;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Or;
import fr.irisa.triskell.kermeta.kpm.SuitedExpression;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.ExpressionImpl#getSubExpressions <em>Sub Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends AbstractExpressionImpl implements Expression {
	/**
	 * The cached value of the '{@link #getSubExpressions() <em>Sub Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList subExpressions = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubExpressions() {
		if (subExpressions == null) {
			subExpressions = new EObjectContainmentEList(SuitedExpression.class, this, KpmPackage.EXPRESSION__SUB_EXPRESSIONS);
		}
		return subExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.EXPRESSION__SUB_EXPRESSIONS:
				return ((InternalEList)getSubExpressions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.EXPRESSION__SUB_EXPRESSIONS:
				return getSubExpressions();
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
			case KpmPackage.EXPRESSION__SUB_EXPRESSIONS:
				getSubExpressions().clear();
				getSubExpressions().addAll((Collection)newValue);
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
			case KpmPackage.EXPRESSION__SUB_EXPRESSIONS:
				getSubExpressions().clear();
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
			case KpmPackage.EXPRESSION__SUB_EXPRESSIONS:
				return subExpressions != null && !subExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluate(Unit unit) {
	
		if ( ! getFilter().apply(unit) )
			return false;
		
		boolean result = true;
		
		Iterator <AbstractExpression> itOnExpressions = getSubExpressions().iterator();
		while ( result && itOnExpressions.hasNext() ) {			
			AbstractExpression currentExpression = itOnExpressions.next();
			
			if ( currentExpression instanceof And )
				result = result && itOnExpressions.next().evaluate(unit);
			else if ( currentExpression instanceof Or )
				result = result || itOnExpressions.next().evaluate(unit);
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDependentFrom(Unit unit) {
		
		NameFilter filter = (NameFilter) getFilter();
		
		String s = StringHelper.getName(unit.getPath(), filter.getRegexOut());
	
		IResource resource = IResourceHelper.getIResource(s);
	
		if ( ! evaluate(resource) )
			return "";
		
		return s;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluate(IResource resource) {
		if ( ! getFilter().apply(resource) )
			return false;
		
		boolean result = true;
		
		Iterator <AbstractExpression> itOnExpressions = getSubExpressions().iterator();
		while ( result && itOnExpressions.hasNext() ) {			
			AbstractExpression currentExpression = itOnExpressions.next();
			
			if ( currentExpression instanceof And )
				result = result && currentExpression.evaluate(resource);
			else if ( currentExpression instanceof Or )
				result = result || currentExpression.evaluate(resource);
		}
		return result;
	}
} //ExpressionImpl