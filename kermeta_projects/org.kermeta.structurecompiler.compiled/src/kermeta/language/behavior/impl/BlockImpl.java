/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockImpl.java,v 1.10 2009-01-21 09:15:57 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Block;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.Rescue;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.BlockImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.BlockImpl#getRescueBlock <em>Rescue Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends ExpressionImpl implements Block {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> statement;

	/**
	 * The cached value of the '{@link #getRescueBlock() <em>Rescue Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescueBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Rescue> rescueBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList.Resolving<Expression>(
					Expression.class, this, BehaviorPackage.BLOCK__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rescue> getRescueBlock() {
		if (rescueBlock == null) {
			rescueBlock = new EObjectContainmentEList.Resolving<Rescue>(
					Rescue.class, this, BehaviorPackage.BLOCK__RESCUE_BLOCK);
		}
		return rescueBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		kermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.utils.UtilsPackage.eINSTANCE
						.getStringBuffer()));

		java.lang.Boolean idIfCond_374 = false;
		idIfCond_374 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.containerSwitcher(this),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation"))),
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.containerSwitcher(this),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Property")))),
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.containerSwitcher(this),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Constraint")))),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_374) {

			javaCode.append("{\n");
		}

		java.lang.Boolean idIfCond_375 = false;
		idIfCond_375 = this.containsRescue();

		if (idIfCond_375) {

			javaCode.append("try {");
		}

		java.lang.Integer nbrStm = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.behavior.Expression> convertAsOrderedSet(
						this.getStatement()).size();

		java.lang.Integer i_stm = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft120 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getStatement()).iterator();
			java.lang.Boolean idLoopCond_376 = false;
			while (!idLoopCond_376) {
				idLoopCond_376 = it_ft120.isOff();
				if (idLoopCond_376) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression stm_lbdExp120 = it_ft120
							.next();

					java.lang.Boolean idIfCond_377 = false;
					idIfCond_377 = kermeta.standard.helper.IntegerWrapper
							.equals(i_stm,
									kermeta.standard.helper.IntegerWrapper
											.minus(nbrStm, 1));

					if (idIfCond_377) {

						((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										stm_lbdExp120,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Expression")))
								.setIsLastExpression(true);
					}

					javaCode = stm_lbdExp120
							.createExpression(context, javaCode);

					javaCode.append("\n");

					i_stm = kermeta.standard.helper.IntegerWrapper.plus(i_stm,
							1);
					//EIle:func

				}
			}
		}

		//EIft:each

		java.lang.Boolean idIfCond_378 = false;
		idIfCond_378 = this.containsRescue();

		if (idIfCond_378) {

			context.pushKRErrorStack();

			javaCode
					.append(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									kermeta.standard.helper.StringWrapper
																											.plus(
																													"} catch( ",
																													context
																															.getJAVA_CLASS_EXCEPTION_SWITCHER()),
																									" "),
																					context
																							.getVARIABLE_EXCEPTION_SWITCHER()),
																	"_"),
													context.getKRErrorStack()
															.peek()), " ) {\n"));

			java.lang.String caught_str = kermeta.standard.helper.StringWrapper
					.plus("caught_", context.getKRErrorStack().peek());

			javaCode.append(kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus("boolean ",
							caught_str), " = false;\n"));

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Rescue> it_ft121 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Rescue> convertAsOrderedSet(
								this.getRescueBlock()).iterator();
				java.lang.Boolean idLoopCond_379 = false;
				while (!idLoopCond_379) {
					idLoopCond_379 = it_ft121.isOff();
					if (idLoopCond_379) {
					} else {

						//BIle:func
						kermeta.language.behavior.Rescue e_lbdExp121 = it_ft121
								.next();

						javaCode
								.append(e_lbdExp121.createBehaviorJava(context));
						//EIle:func

					}
				}
			}

			//EIft:each

			javaCode
					.append(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									kermeta.standard.helper.StringWrapper
																											.plus(
																													"\nif( !",
																													caught_str),
																									" ) { throw "),
																					context
																							.getVARIABLE_EXCEPTION_SWITCHER()),
																	"_"),
													context.getKRErrorStack()
															.peek()), "; }\n"));

			javaCode.append("\n}\n");

			context.getKRErrorStack().pop();
		}

		java.lang.Boolean idIfCond_380 = false;
		idIfCond_380 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.containerSwitcher(this),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation"))),
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.containerSwitcher(this),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Property")))),
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.containerSwitcher(this),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Constraint")))),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_380) {

			javaCode.append("}");
		}

		result = javaCode.toString();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean containsRescue() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_381 = false;
		idIfCond_381 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.behavior.Rescue> convertAsOrderedSet(this
														.getRescueBlock()))),
						kermeta.standard.helper.IntegerWrapper
								.isGreater(
										org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.behavior.Rescue> convertAsOrderedSet(
														this.getRescueBlock())
												.size(), 0));

		if (idIfCond_381) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorPackage.BLOCK__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd,
					msgs);
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			return ((InternalEList<?>) getRescueBlock()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviorPackage.BLOCK__STATEMENT:
			return getStatement();
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			return getRescueBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviorPackage.BLOCK__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends Expression>) newValue);
			return;
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			getRescueBlock().clear();
			getRescueBlock().addAll((Collection<? extends Rescue>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BehaviorPackage.BLOCK__STATEMENT:
			getStatement().clear();
			return;
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			getRescueBlock().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BehaviorPackage.BLOCK__STATEMENT:
			return statement != null && !statement.isEmpty();
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			return rescueBlock != null && !rescueBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
