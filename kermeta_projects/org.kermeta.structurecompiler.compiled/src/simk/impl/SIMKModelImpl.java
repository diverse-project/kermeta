/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModelImpl.java,v 1.8 2008-11-07 08:53:07 cfaucher Exp $
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
						kermeta.standard.helper.StringWrapper
								.plus(
										((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(op),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ClassDefinition")))
												.getName(), "Super"),
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
																														.containerSwitcher(op),
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
								.getByName("Super"), context);

		simk.SMMethod sm = null;
		//BIft:detect

		simk.SMMethod result_ft247 = null;

		simk.SMMethod elem_ft247 = null;

		result_ft247 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1093 = false;
			while (!idLoopCond_1093) {
				idLoopCond_1093 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft247.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft247, null));
				if (idLoopCond_1093) {
				} else {

					elem_ft247 = it_ft247.next();

					java.lang.Boolean idIfCond_1094 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp247 = elem_ft247;

					idIfCond_1094 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp247.getName(),
									kermeta.standard.helper.StringWrapper.plus(
											"super_", op.getFinalName(context)));
					//EIle:detector

					if (idIfCond_1094) {

						result_ft247 = elem_ft247;
					}

				}
			}
		}

		//CE
		sm = result_ft247;
		//EIft:detect

		java.lang.Boolean idIfCond_1095 = false;
		idIfCond_1095 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1095) {

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

		simk.SMMethod result_ft248 = null;

		simk.SMMethod elem_ft248 = null;

		result_ft248 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft248 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1096 = false;
			while (!idLoopCond_1096) {
				idLoopCond_1096 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft248.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft248, null));
				if (idLoopCond_1096) {
				} else {

					elem_ft248 = it_ft248.next();

					java.lang.Boolean idIfCond_1097 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp248 = elem_ft248;

					idIfCond_1097 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp248.getName(),
									kermeta.standard.helper.StringWrapper.plus(
											"checkInvariant_", constraint
													.getId()));
					//EIle:detector

					if (idIfCond_1097) {

						result_ft248 = elem_ft248;
					}

				}
			}
		}

		//CE
		sm = result_ft248;
		//EIft:detect

		java.lang.Boolean idIfCond_1098 = false;
		idIfCond_1098 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1098) {

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

		simk.SMMethod result_ft249 = null;

		simk.SMMethod elem_ft249 = null;

		result_ft249 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1099 = false;
			while (!idLoopCond_1099) {
				idLoopCond_1099 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft249.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft249, null));
				if (idLoopCond_1099) {
				} else {

					elem_ft249 = it_ft249.next();

					java.lang.Boolean idIfCond_1100 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp249 = elem_ft249;

					idIfCond_1100 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp249.getName(), op
									.getFinalName(context));
					//EIle:detector

					if (idIfCond_1100) {

						result_ft249 = elem_ft249;
					}

				}
			}
		}

		//CE
		sm = result_ft249;
		//EIft:detect

		java.lang.Boolean idIfCond_1101 = false;
		idIfCond_1101 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1101) {

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
																						((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.asTypeSwitcher(
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.containerSwitcher(op),
																										org.kermeta.compil.runtime.ExecutionContext
																												.getInstance()
																												.getMetaClass(
																														"kermeta.language.structure.ClassDefinition")))
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
																								.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asTypeSwitcher(
																												org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.containerSwitcher(op),
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
										"runner"), simk.SMUsage
								.getByName("Runner"), context);

		simk.SMMethod sm = null;
		//BIft:detect

		simk.SMMethod result_ft250 = null;

		simk.SMMethod elem_ft250 = null;

		result_ft250 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft250 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1102 = false;
			while (!idLoopCond_1102) {
				idLoopCond_1102 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft250.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft250, null));
				if (idLoopCond_1102) {
				} else {

					elem_ft250 = it_ft250.next();

					java.lang.Boolean idIfCond_1103 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp250 = elem_ft250;

					idIfCond_1103 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp250.getName(), "main");
					//EIle:detector

					if (idIfCond_1103) {

						result_ft250 = elem_ft250;
					}

				}
			}
		}

		//CE
		sm = result_ft250;
		//EIft:detect

		java.lang.Boolean idIfCond_1104 = false;
		idIfCond_1104 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sm);

		if (idIfCond_1104) {

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

		java.lang.Boolean idIfCond_1105 = false;
		idIfCond_1105 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sMContext.getSMClass());

		if (idIfCond_1105) {

			simk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMClass"));

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

		simk.SMContext result_ft251 = null;

		simk.SMContext elem_ft251 = null;

		result_ft251 = null;

		{

			kermeta.standard.Iterator<simk.SMContext> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.iterator();
			java.lang.Boolean idLoopCond_1106 = false;
			while (!idLoopCond_1106) {
				idLoopCond_1106 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft251.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft251, null));
				if (idLoopCond_1106) {
				} else {

					elem_ft251 = it_ft251.next();

					java.lang.Boolean idIfCond_1107 = false;
					//BIle:detector
					simk.SMContext c_lbdExp251 = elem_ft251;

					idIfCond_1107 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.and(
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp251
																			.getFinalPackageQName(),
																	finalPackage_qname),
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp251
																			.getSMClass()
																			.getName(),
																	class_qname)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(c_lbdExp251
													.getSMClass().getUsages(),
													usage));
					//EIle:detector

					if (idIfCond_1107) {

						result_ft251 = elem_ft251;
					}

				}
			}
		}

		//CE
		sMContext = result_ft251;
		//EIft:detect

		java.lang.Boolean idIfCond_1108 = false;
		idIfCond_1108 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(sMContext);

		if (idIfCond_1108) {

			sMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMContext"));

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
