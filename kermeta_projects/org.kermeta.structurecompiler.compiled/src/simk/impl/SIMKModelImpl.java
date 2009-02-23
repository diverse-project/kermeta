/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: SIMKModelImpl.java,v 1.12 2009-02-23 15:26:43 cfaucher Exp $
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
	public void save(KM2EcoreContext context) {

		context.setSimkOutput(kermeta.standard.helper.StringWrapper
				.replaceExtension(context.getKmInput(), "simk"));

		kermeta.persistence.Resource simkResource = context
				.getOutputRepository().createResource(context.getSimkOutput(),
						"http://www.kermeta.org/simk");

		simkResource.add(this);

		simkResource.save();

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

		simk.SMMethod result_ft254 = null;

		simk.SMMethod elem_ft254 = null;

		result_ft254 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1129 = false;
			while (!idLoopCond_1129) {
				idLoopCond_1129 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft254.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft254, null));
				if (idLoopCond_1129) {
				} else {

					elem_ft254 = it_ft254.next();

					java.lang.Boolean idIfCond_1130 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp254 = elem_ft254;

					idIfCond_1130 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp254.getName(),
									kermeta.standard.helper.StringWrapper.plus(
											"super_", op.getFinalName(context)));
					//EIle:detector

					if (idIfCond_1130) {

						result_ft254 = elem_ft254;
					}

				}
			}
		}

		//CE
		sm = result_ft254;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1131 = false;
		idIfCond_1131 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1131) {

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

		simk.SMMethod result_ft255 = null;

		simk.SMMethod elem_ft255 = null;

		result_ft255 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft255 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1132 = false;
			while (!idLoopCond_1132) {
				idLoopCond_1132 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft255.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft255, null));
				if (idLoopCond_1132) {
				} else {

					elem_ft255 = it_ft255.next();

					java.lang.Boolean idIfCond_1133 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp255 = elem_ft255;

					idIfCond_1133 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp255.getName(),
									kermeta.standard.helper.StringWrapper.plus(
											"checkInvariant_", constraint
													.getId()));
					//EIle:detector

					if (idIfCond_1133) {

						result_ft255 = elem_ft255;
					}

				}
			}
		}

		//CE
		sm = result_ft255;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1134 = false;
		idIfCond_1134 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1134) {

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

		simk.SMMethod result_ft256 = null;

		simk.SMMethod elem_ft256 = null;

		result_ft256 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft256 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1135 = false;
			while (!idLoopCond_1135) {
				idLoopCond_1135 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft256.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft256, null));
				if (idLoopCond_1135) {
				} else {

					elem_ft256 = it_ft256.next();

					java.lang.Boolean idIfCond_1136 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp256 = elem_ft256;

					idIfCond_1136 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp256.getName(), op
									.getFinalName(context));
					//EIle:detector

					if (idIfCond_1136) {

						result_ft256 = elem_ft256;
					}

				}
			}
		}

		//CE
		sm = result_ft256;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1137 = false;
		idIfCond_1137 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1137) {

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

		simk.SMMethod result_ft257 = null;

		simk.SMMethod elem_ft257 = null;

		result_ft257 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft257 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1138 = false;
			while (!idLoopCond_1138) {
				idLoopCond_1138 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft257.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft257, null));
				if (idLoopCond_1138) {
				} else {

					elem_ft257 = it_ft257.next();

					java.lang.Boolean idIfCond_1139 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp257 = elem_ft257;

					idIfCond_1139 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp257.getName(), "main");
					//EIle:detector

					if (idIfCond_1139) {

						result_ft257 = elem_ft257;
					}

				}
			}
		}

		//CE
		sm = result_ft257;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1140 = false;
		idIfCond_1140 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1140) {

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

		java.lang.Boolean idIfCond_1141 = false;
		idIfCond_1141 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sMContext.getSMClass());

		if (idIfCond_1141) {

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

		simk.SMContext result_ft258 = null;

		simk.SMContext elem_ft258 = null;

		result_ft258 = null;

		{

			kermeta.standard.Iterator<simk.SMContext> it_ft258 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.iterator();
			java.lang.Boolean idLoopCond_1142 = false;
			while (!idLoopCond_1142) {
				idLoopCond_1142 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft258.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft258, null));
				if (idLoopCond_1142) {
				} else {

					elem_ft258 = it_ft258.next();

					java.lang.Boolean idIfCond_1143 = false;
					//BIle:detector
					simk.SMContext c_lbdExp258 = elem_ft258;

					idIfCond_1143 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.and(
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp258
																			.getFinalPackageQName(),
																	finalPackage_qname),
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp258
																			.getSMClass()
																			.getName(),
																	class_qname)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(c_lbdExp258
													.getSMClass().getUsages(),
													usage));
					//EIle:detector

					if (idIfCond_1143) {

						result_ft258 = elem_ft258;
					}

				}
			}
		}

		//CE
		sMContext = result_ft258;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1144 = false;
		idIfCond_1144 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sMContext);

		if (idIfCond_1144) {

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
