/**
 * <copyright>
 * </copyright>
 *
 * $Id: gymnastAdapterFactory.java,v 1.1 2007-11-21 10:22:23 ftanguy Exp $
 */
package gymnast.util;

import gymnast.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gymnast.gymnastPackage
 * @generated
 */
public class gymnastAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static gymnastPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gymnastAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = gymnastPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected gymnastSwitch<Adapter> modelSwitch =
		new gymnastSwitch<Adapter>() {
			@Override
			public Adapter caseGymnastEASTNode(GymnastEASTNode object) {
				return createGymnastEASTNodeAdapter();
			}
			@Override
			public Adapter caseCompUnit(CompUnit object) {
				return createCompUnitAdapter();
			}
			@Override
			public Adapter caseHeaderSection(HeaderSection object) {
				return createHeaderSectionAdapter();
			}
			@Override
			public Adapter caseOptionsSection(OptionsSection object) {
				return createOptionsSectionAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseAltRule(AltRule object) {
				return createAltRuleAdapter();
			}
			@Override
			public Adapter caseAltRuleDecl(AltRuleDecl object) {
				return createAltRuleDeclAdapter();
			}
			@Override
			public Adapter caseAltRuleBody(AltRuleBody object) {
				return createAltRuleBodyAdapter();
			}
			@Override
			public Adapter caseAltSeq(AltSeq object) {
				return createAltSeqAdapter();
			}
			@Override
			public Adapter caseListRule(ListRule object) {
				return createListRuleAdapter();
			}
			@Override
			public Adapter caseListRuleDecl(ListRuleDecl object) {
				return createListRuleDeclAdapter();
			}
			@Override
			public Adapter caseListRuleBody(ListRuleBody object) {
				return createListRuleBodyAdapter();
			}
			@Override
			public Adapter caseSeqRule(SeqRule object) {
				return createSeqRuleAdapter();
			}
			@Override
			public Adapter caseSeqRuleDecl(SeqRuleDecl object) {
				return createSeqRuleDeclAdapter();
			}
			@Override
			public Adapter caseTokenRule(TokenRule object) {
				return createTokenRuleAdapter();
			}
			@Override
			public Adapter caseTokenRuleDecl(TokenRuleDecl object) {
				return createTokenRuleDeclAdapter();
			}
			@Override
			public Adapter caseOptSubSeq(OptSubSeq object) {
				return createOptSubSeqAdapter();
			}
			@Override
			public Adapter caseSimpleExpr(SimpleExpr object) {
				return createSimpleExprAdapter();
			}
			@Override
			public Adapter caseAttrs(Attrs object) {
				return createAttrsAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseExpr(Expr object) {
				return createExprAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gymnast.GymnastEASTNode <em>Gymnast EAST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.GymnastEASTNode
	 * @generated
	 */
	public Adapter createGymnastEASTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.CompUnit <em>Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.CompUnit
	 * @generated
	 */
	public Adapter createCompUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.HeaderSection <em>Header Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.HeaderSection
	 * @generated
	 */
	public Adapter createHeaderSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.OptionsSection <em>Options Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.OptionsSection
	 * @generated
	 */
	public Adapter createOptionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.AltRule <em>Alt Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.AltRule
	 * @generated
	 */
	public Adapter createAltRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.AltRuleDecl <em>Alt Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.AltRuleDecl
	 * @generated
	 */
	public Adapter createAltRuleDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.AltRuleBody <em>Alt Rule Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.AltRuleBody
	 * @generated
	 */
	public Adapter createAltRuleBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.AltSeq <em>Alt Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.AltSeq
	 * @generated
	 */
	public Adapter createAltSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.ListRule <em>List Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.ListRule
	 * @generated
	 */
	public Adapter createListRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.ListRuleDecl <em>List Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.ListRuleDecl
	 * @generated
	 */
	public Adapter createListRuleDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.ListRuleBody <em>List Rule Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.ListRuleBody
	 * @generated
	 */
	public Adapter createListRuleBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.SeqRule <em>Seq Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.SeqRule
	 * @generated
	 */
	public Adapter createSeqRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.SeqRuleDecl <em>Seq Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.SeqRuleDecl
	 * @generated
	 */
	public Adapter createSeqRuleDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.TokenRule <em>Token Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.TokenRule
	 * @generated
	 */
	public Adapter createTokenRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.TokenRuleDecl <em>Token Rule Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.TokenRuleDecl
	 * @generated
	 */
	public Adapter createTokenRuleDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.OptSubSeq <em>Opt Sub Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.OptSubSeq
	 * @generated
	 */
	public Adapter createOptSubSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.SimpleExpr <em>Simple Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.SimpleExpr
	 * @generated
	 */
	public Adapter createSimpleExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.Attrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.Attrs
	 * @generated
	 */
	public Adapter createAttrsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gymnast.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gymnast.Expr
	 * @generated
	 */
	public Adapter createExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //gymnastAdapterFactory
