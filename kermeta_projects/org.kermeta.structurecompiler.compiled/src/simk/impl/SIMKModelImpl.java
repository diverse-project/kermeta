/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: SIMKModelImpl.java,v 1.11 2009-02-10 17:51:47 cfaucher Exp $
 */
package simk.impl;

import java.util.Collection;

import kermeta.language.structure.Constraint;
import kermeta.language.structure.Operation;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simk.SIMKModel;
import simk.SMContext;
import simk.SMMethod;
import simk.SMUsage;
import simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIMK Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simk.impl.SIMKModelImpl#getSMContexts <em>SM Contexts</em>}</li>
 *   <li>{@link simk.impl.SIMKModelImpl#getSMMethods <em>SM Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SIMKModelImpl extends SMNamedElementImpl implements SIMKModel {
	/**
	 * The cached value of the '{@link #getSMContexts() <em>SM Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<SMContext> sMContexts;

	/**
	 * The cached value of the '{@link #getSMMethods() <em>SM Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<SMMethod> sMMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SIMKModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SIMK_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SMContext> getSMContexts() {
		if (sMContexts == null) {
			sMContexts = new EObjectContainmentEList.Resolving<SMContext>(
					SMContext.class, this, SimkPackage.SIMK_MODEL__SM_CONTEXTS);
		}
		return sMContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SMMethod> getSMMethods() {
		if (sMMethods == null) {
			sMMethods = new EObjectContainmentEList.Resolving<SMMethod>(
					SMMethod.class, this, SimkPackage.SIMK_MODEL__SM_METHODS);
		}
		return sMMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context) {

		simk.SMContext result = null;

		result = null;

		simk.SMContext sMContext = this
				.retrieveOrCreateContextWithClass(
						kermeta.standard.helper.StringWrapper.plus(op
								.getOwningClass().getName(), "Super"),
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.replace(
																		((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.containerSwitcher(op
																										.getOwningClass()),
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Package")))
																				.qualifiedName(),
																		context
																				.getKERMETA_SEPARATOR(),
																		context
																				.getJAVA_SEPARATOR()),
														context
																.getJAVA_SEPARATOR()),
										"helper"), simk.SMUsage
								.getByName("Super"), context);

		simk.SMMethod sm = null;
		//BIft:detect

		simk.SMMethod result_ft259 = null;

		simk.SMMethod elem_ft259 = null;

		result_ft259 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft259 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1145 = false;
			while (!idLoopCond_1145) {
				idLoopCond_1145 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft259.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft259, null));
				if (idLoopCond_1145) {
				} else {

					elem_ft259 = it_ft259.next();

					java.lang.Boolean idIfCond_1146 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp259 = elem_ft259;

					idIfCond_1146 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp259.getName(),
									kermeta.standard.helper.StringWrapper.plus(
											"super_", op.getFinalName(context)));
					//EIle:detector

					if (idIfCond_1146) {

						result_ft259 = elem_ft259;
					}

				}
			}
		}

		//CE
		sm = result_ft259;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1147 = false;
		idIfCond_1147 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1147) {

			result = sMContext;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context) {

		simk.SMContext result = null;

		result = null;

		simk.SMContext sMContext = this.retrieveOrCreateContextWithClass(
				kermeta.standard.helper.StringWrapper.plus(context
						.getCurrent_valueType().getName(), "Wrapper"),
				"kermeta.standard.helper", simk.SMUsage.getByName("Wrapper"),
				context);

		simk.SMMethod sm = null;
		//BIft:detect

		simk.SMMethod result_ft260 = null;

		simk.SMMethod elem_ft260 = null;

		result_ft260 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft260 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1148 = false;
			while (!idLoopCond_1148) {
				idLoopCond_1148 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft260.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft260, null));
				if (idLoopCond_1148) {
				} else {

					elem_ft260 = it_ft260.next();

					java.lang.Boolean idIfCond_1149 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp260 = elem_ft260;

					idIfCond_1149 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp260.getName(), op
									.getFinalName(context));
					//EIle:detector

					if (idIfCond_1149) {

						result_ft260 = elem_ft260;
					}

				}
			}
		}

		//CE
		sm = result_ft260;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1150 = false;
		idIfCond_1150 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1150) {

			result = sMContext;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext retrieveOrCreateContextForInvariant(Constraint constraint,
			KM2EcoreContext context) {

		simk.SMContext result = null;

		result = null;

		simk.SMContext sMContext = this
				.retrieveOrCreateContextWithClass(
						kermeta.standard.helper.StringWrapper
								.plus(
										((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(constraint),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ClassDefinition")))
												.getName(), "Invariant"),
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.replace(
																		((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asTypeSwitcher(
																												org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.containerSwitcher(constraint),
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.ClassDefinition")))),
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Package")))
																				.qualifiedName(),
																		context
																				.getKERMETA_SEPARATOR(),
																		context
																				.getJAVA_SEPARATOR()),
														context
																.getJAVA_SEPARATOR()),
										"helper"), simk.SMUsage
								.getByName("Invariant"), context);

		simk.SMMethod sm = null;
		//BIft:detect

		simk.SMMethod result_ft261 = null;

		simk.SMMethod elem_ft261 = null;

		result_ft261 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft261 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1151 = false;
			while (!idLoopCond_1151) {
				idLoopCond_1151 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft261.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft261, null));
				if (idLoopCond_1151) {
				} else {

					elem_ft261 = it_ft261.next();

					java.lang.Boolean idIfCond_1152 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp261 = elem_ft261;

					idIfCond_1152 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp261.getName(),
									kermeta.standard.helper.StringWrapper.plus(
											"checkInvariant_", constraint
													.getId()));
					//EIle:detector

					if (idIfCond_1152) {

						result_ft261 = elem_ft261;
					}

				}
			}
		}

		//CE
		sm = result_ft261;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1153 = false;
		idIfCond_1153 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1153) {

			result = sMContext;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context) {

		simk.SMContext result = null;

		result = null;

		simk.SMContext sMContext = this
				.retrieveOrCreateContextWithClass(
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						op
																								.getOwningClass()
																								.getName(),
																						"__"),
																		op
																				.getFinalName(context)),
														"__"), "Runner"),
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.replace(
																		((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.containerSwitcher(op
																										.getOwningClass()),
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Package")))
																				.qualifiedName(),
																		context
																				.getKERMETA_SEPARATOR(),
																		context
																				.getJAVA_SEPARATOR()),
														context
																.getJAVA_SEPARATOR()),
										"runner"), simk.SMUsage
								.getByName("Runner"), context);

		simk.SMMethod sm = null;
		//BIft:detect

		simk.SMMethod result_ft262 = null;

		simk.SMMethod elem_ft262 = null;

		result_ft262 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft262 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1154 = false;
			while (!idLoopCond_1154) {
				idLoopCond_1154 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft262.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft262, null));
				if (idLoopCond_1154) {
				} else {

					elem_ft262 = it_ft262.next();

					java.lang.Boolean idIfCond_1155 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp262 = elem_ft262;

					idIfCond_1155 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp262.getName(), "main");
					//EIle:detector

					if (idIfCond_1155) {

						result_ft262 = elem_ft262;
					}

				}
			}
		}

		//CE
		sm = result_ft262;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1156 = false;
		idIfCond_1156 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1156) {

			result = sMContext;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context) {

		simk.SMContext result = null;

		simk.SMContext sMContext = this.retrieveOrCreateContext(class_qname,
				finalPackage_qname, usage, context);

		java.lang.Boolean idIfCond_1157 = false;
		idIfCond_1157 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sMContext.getSMClass());

		if (idIfCond_1157) {

			simk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMClass()));

			sMContext.setSMClass(sMClass);

			sMClass.setName(class_qname);

			sMClass.setUsages(usage);
		}

		result = sMContext;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context) {

		simk.SMContext result = null;

		simk.SMContext sMContext = null;
		//BIft:detect

		simk.SMContext result_ft263 = null;

		simk.SMContext elem_ft263 = null;

		result_ft263 = null;

		{

			kermeta.standard.Iterator<simk.SMContext> it_ft263 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.iterator();
			java.lang.Boolean idLoopCond_1158 = false;
			while (!idLoopCond_1158) {
				idLoopCond_1158 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft263.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft263, null));
				if (idLoopCond_1158) {
				} else {

					elem_ft263 = it_ft263.next();

					java.lang.Boolean idIfCond_1159 = false;
					//BIle:detector
					simk.SMContext c_lbdExp263 = elem_ft263;

					idIfCond_1159 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.and(
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp263
																			.getFinalPackageQName(),
																	finalPackage_qname),
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp263
																			.getSMClass()
																			.getName(),
																	class_qname)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(c_lbdExp263
													.getSMClass().getUsages(),
													usage));
					//EIle:detector

					if (idIfCond_1159) {

						result_ft263 = elem_ft263;
					}

				}
			}
		}

		//CE
		sMContext = result_ft263;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1160 = false;
		idIfCond_1160 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sMContext);

		if (idIfCond_1160) {

			sMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMContext()));

			sMContext.setFinalPackageQName(finalPackage_qname);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.add(sMContext);
		}

		result = sMContext;

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
		case SimkPackage.SIMK_MODEL__SM_CONTEXTS:
			return ((InternalEList<?>) getSMContexts()).basicRemove(otherEnd,
					msgs);
		case SimkPackage.SIMK_MODEL__SM_METHODS:
			return ((InternalEList<?>) getSMMethods()).basicRemove(otherEnd,
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
		case SimkPackage.SIMK_MODEL__SM_CONTEXTS:
			return getSMContexts();
		case SimkPackage.SIMK_MODEL__SM_METHODS:
			return getSMMethods();
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
		case SimkPackage.SIMK_MODEL__SM_CONTEXTS:
			getSMContexts().clear();
			getSMContexts().addAll((Collection<? extends SMContext>) newValue);
			return;
		case SimkPackage.SIMK_MODEL__SM_METHODS:
			getSMMethods().clear();
			getSMMethods().addAll((Collection<? extends SMMethod>) newValue);
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
		case SimkPackage.SIMK_MODEL__SM_CONTEXTS:
			getSMContexts().clear();
			return;
		case SimkPackage.SIMK_MODEL__SM_METHODS:
			getSMMethods().clear();
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
		case SimkPackage.SIMK_MODEL__SM_CONTEXTS:
			return sMContexts != null && !sMContexts.isEmpty();
		case SimkPackage.SIMK_MODEL__SM_METHODS:
			return sMMethods != null && !sMMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SIMKModelImpl
