/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModelImpl.java,v 1.4 2008-10-08 14:37:33 cfaucher Exp $
 */
package simk.impl;

import java.util.Collection;

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
												.asType(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.container(op),
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
																				.asType(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.container(op),
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

		simk.SMMethod result_ft239 = null;

		simk.SMMethod elem_ft239 = null;

		result_ft239 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft239 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1051 = false;
			while (!idLoopCond_1051) {
				idLoopCond_1051 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft239.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft239, null));
				if (idLoopCond_1051) {
				} else {

					elem_ft239 = it_ft239.next();

					java.lang.Boolean idIfCond_1052 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp239 = elem_ft239;

					idIfCond_1052 = kermeta.standard.helper.StringWrapper
							.equals(
									o_lbdExp239.getName(),
									kermeta.standard.helper.StringWrapper
											.plus(
													"super_",
													((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject("km2ecore.helper.java.IdentifierHelper"))
															.getMangledIdentifier(
																	op
																			.getFinalName(),
																	context)));
					//EIle:detector

					if (idIfCond_1052) {

						result_ft239 = elem_ft239;
					}

				}
			}
		}

		//CE
		sm = result_ft239;
		//EIft:detect

		java.lang.Boolean idIfCond_1053 = false;
		idIfCond_1053 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_1053) {

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

		simk.SMMethod result_ft240 = null;

		simk.SMMethod elem_ft240 = null;

		result_ft240 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft240 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1054 = false;
			while (!idLoopCond_1054) {
				idLoopCond_1054 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft240.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft240, null));
				if (idLoopCond_1054) {
				} else {

					elem_ft240 = it_ft240.next();

					java.lang.Boolean idIfCond_1055 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp240 = elem_ft240;

					idIfCond_1055 = kermeta.standard.helper.StringWrapper
							.equals(
									o_lbdExp240.getName(),
									((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("km2ecore.helper.java.IdentifierHelper"))
											.getMangledIdentifier(op
													.getFinalName(), context));
					//EIle:detector

					if (idIfCond_1055) {

						result_ft240 = elem_ft240;
					}

				}
			}
		}

		//CE
		sm = result_ft240;
		//EIft:detect

		java.lang.Boolean idIfCond_1056 = false;
		idIfCond_1056 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_1056) {

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
																								.asType(
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.container(op),
																										org.kermeta.compil.runtime.ExecutionContext
																												.getInstance()
																												.getMetaClass(
																														"kermeta.language.structure.ClassDefinition")))
																								.getName(),
																						"__"),
																		((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
																				.newObject("km2ecore.helper.java.IdentifierHelper"))
																				.getMangledIdentifier(
																						op
																								.getFinalName(),
																						context)),
														"__"), "Runner"),
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.replace(
																		((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.container(op),
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

		simk.SMMethod result_ft241 = null;

		simk.SMMethod elem_ft241 = null;

		result_ft241 = null;

		{

			kermeta.standard.Iterator<simk.SMMethod> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).iterator();
			java.lang.Boolean idLoopCond_1057 = false;
			while (!idLoopCond_1057) {
				idLoopCond_1057 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft241.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft241, null));
				if (idLoopCond_1057) {
				} else {

					elem_ft241 = it_ft241.next();

					java.lang.Boolean idIfCond_1058 = false;
					//BIle:detector
					simk.SMMethod o_lbdExp241 = elem_ft241;

					idIfCond_1058 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp241.getName(), "main");
					//EIle:detector

					if (idIfCond_1058) {

						result_ft241 = elem_ft241;
					}

				}
			}
		}

		//CE
		sm = result_ft241;
		//EIft:detect

		java.lang.Boolean idIfCond_1059 = false;
		idIfCond_1059 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_1059) {

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

		java.lang.Boolean idIfCond_1060 = false;
		idIfCond_1060 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext.getSMClass());

		if (idIfCond_1060) {

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

		simk.SMContext result_ft242 = null;

		simk.SMContext elem_ft242 = null;

		result_ft242 = null;

		{

			kermeta.standard.Iterator<simk.SMContext> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.iterator();
			java.lang.Boolean idLoopCond_1061 = false;
			while (!idLoopCond_1061) {
				idLoopCond_1061 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft242.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft242, null));
				if (idLoopCond_1061) {
				} else {

					elem_ft242 = it_ft242.next();

					java.lang.Boolean idIfCond_1062 = false;
					//BIle:detector
					simk.SMContext c_lbdExp242 = elem_ft242;

					idIfCond_1062 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.and(
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp242
																			.getFinalPackageQName(),
																	finalPackage_qname),
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp242
																			.getSMClass()
																			.getName(),
																	class_qname)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equals(c_lbdExp242.getSMClass()
													.getUsages(), usage));
					//EIle:detector

					if (idIfCond_1062) {

						result_ft242 = elem_ft242;
					}

				}
			}
		}

		//CE
		sMContext = result_ft242;
		//EIft:detect

		java.lang.Boolean idIfCond_1063 = false;
		idIfCond_1063 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext);

		if (idIfCond_1063) {

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
