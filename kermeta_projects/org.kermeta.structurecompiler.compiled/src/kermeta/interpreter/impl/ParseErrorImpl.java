/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParseErrorImpl.java,v 1.6 2008-10-28 13:18:17 cfaucher Exp $
 */
package kermeta.interpreter.impl;

import kermeta.interpreter.InterpreterPackage;
import kermeta.interpreter.ParseError;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parse Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParseErrorImpl extends KermetaErrorImpl implements ParseError {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParseErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterpreterPackage.Literals.PARSE_ERROR;
	}

} //ParseErrorImpl
