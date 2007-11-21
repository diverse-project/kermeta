/**
 * <copyright>
 * </copyright>
 *
 * $Id: gymnastSwitch.java,v 1.1 2007-11-21 10:22:23 ftanguy Exp $
 */
package gymnast.util;

import gymnast.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gymnast.gymnastPackage
 * @generated
 */
public class gymnastSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static gymnastPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gymnastSwitch() {
		if (modelPackage == null) {
			modelPackage = gymnastPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case gymnastPackage.GYMNAST_EAST_NODE: {
				GymnastEASTNode gymnastEASTNode = (GymnastEASTNode)theEObject;
				T result = caseGymnastEASTNode(gymnastEASTNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.COMP_UNIT: {
				CompUnit compUnit = (CompUnit)theEObject;
				T result = caseCompUnit(compUnit);
				if (result == null) result = caseGymnastEASTNode(compUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.HEADER_SECTION: {
				HeaderSection headerSection = (HeaderSection)theEObject;
				T result = caseHeaderSection(headerSection);
				if (result == null) result = caseGymnastEASTNode(headerSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.OPTIONS_SECTION: {
				OptionsSection optionsSection = (OptionsSection)theEObject;
				T result = caseOptionsSection(optionsSection);
				if (result == null) result = caseGymnastEASTNode(optionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = caseGymnastEASTNode(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.ALT_RULE: {
				AltRule altRule = (AltRule)theEObject;
				T result = caseAltRule(altRule);
				if (result == null) result = caseRule(altRule);
				if (result == null) result = caseGymnastEASTNode(altRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.ALT_RULE_DECL: {
				AltRuleDecl altRuleDecl = (AltRuleDecl)theEObject;
				T result = caseAltRuleDecl(altRuleDecl);
				if (result == null) result = caseGymnastEASTNode(altRuleDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.ALT_RULE_BODY: {
				AltRuleBody altRuleBody = (AltRuleBody)theEObject;
				T result = caseAltRuleBody(altRuleBody);
				if (result == null) result = caseGymnastEASTNode(altRuleBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.ALT_SEQ: {
				AltSeq altSeq = (AltSeq)theEObject;
				T result = caseAltSeq(altSeq);
				if (result == null) result = caseGymnastEASTNode(altSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.LIST_RULE: {
				ListRule listRule = (ListRule)theEObject;
				T result = caseListRule(listRule);
				if (result == null) result = caseRule(listRule);
				if (result == null) result = caseGymnastEASTNode(listRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.LIST_RULE_DECL: {
				ListRuleDecl listRuleDecl = (ListRuleDecl)theEObject;
				T result = caseListRuleDecl(listRuleDecl);
				if (result == null) result = caseGymnastEASTNode(listRuleDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.LIST_RULE_BODY: {
				ListRuleBody listRuleBody = (ListRuleBody)theEObject;
				T result = caseListRuleBody(listRuleBody);
				if (result == null) result = caseGymnastEASTNode(listRuleBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.SEQ_RULE: {
				SeqRule seqRule = (SeqRule)theEObject;
				T result = caseSeqRule(seqRule);
				if (result == null) result = caseRule(seqRule);
				if (result == null) result = caseGymnastEASTNode(seqRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.SEQ_RULE_DECL: {
				SeqRuleDecl seqRuleDecl = (SeqRuleDecl)theEObject;
				T result = caseSeqRuleDecl(seqRuleDecl);
				if (result == null) result = caseGymnastEASTNode(seqRuleDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.TOKEN_RULE: {
				TokenRule tokenRule = (TokenRule)theEObject;
				T result = caseTokenRule(tokenRule);
				if (result == null) result = caseRule(tokenRule);
				if (result == null) result = caseGymnastEASTNode(tokenRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.TOKEN_RULE_DECL: {
				TokenRuleDecl tokenRuleDecl = (TokenRuleDecl)theEObject;
				T result = caseTokenRuleDecl(tokenRuleDecl);
				if (result == null) result = caseGymnastEASTNode(tokenRuleDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.OPT_SUB_SEQ: {
				OptSubSeq optSubSeq = (OptSubSeq)theEObject;
				T result = caseOptSubSeq(optSubSeq);
				if (result == null) result = caseExpr(optSubSeq);
				if (result == null) result = caseGymnastEASTNode(optSubSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.SIMPLE_EXPR: {
				SimpleExpr simpleExpr = (SimpleExpr)theEObject;
				T result = caseSimpleExpr(simpleExpr);
				if (result == null) result = caseExpr(simpleExpr);
				if (result == null) result = caseGymnastEASTNode(simpleExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.ATTRS: {
				Attrs attrs = (Attrs)theEObject;
				T result = caseAttrs(attrs);
				if (result == null) result = caseGymnastEASTNode(attrs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseGymnastEASTNode(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case gymnastPackage.EXPR: {
				Expr expr = (Expr)theEObject;
				T result = caseExpr(expr);
				if (result == null) result = caseGymnastEASTNode(expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gymnast EAST Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gymnast EAST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGymnastEASTNode(GymnastEASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Comp Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Comp Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompUnit(CompUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Header Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Header Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderSection(HeaderSection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Options Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Options Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionsSection(OptionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Alt Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Alt Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltRule(AltRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Alt Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Alt Rule Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltRuleDecl(AltRuleDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Alt Rule Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Alt Rule Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltRuleBody(AltRuleBody object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Alt Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Alt Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltSeq(AltSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>List Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>List Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRule(ListRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>List Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>List Rule Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRuleDecl(ListRuleDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>List Rule Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>List Rule Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRuleBody(ListRuleBody object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Seq Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Seq Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqRule(SeqRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Seq Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Seq Rule Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqRuleDecl(SeqRuleDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Token Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Token Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenRule(TokenRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Token Rule Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Token Rule Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenRuleDecl(TokenRuleDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Opt Sub Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Opt Sub Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptSubSeq(OptSubSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Simple Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Simple Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleExpr(SimpleExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Attrs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Attrs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttrs(Attrs object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpr(Expr object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //gymnastSwitch
