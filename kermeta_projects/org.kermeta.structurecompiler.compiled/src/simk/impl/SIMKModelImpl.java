/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModelImpl.java,v 1.3 2008-09-22 14:48:57 cfaucher Exp $
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
import simk.SMUsage;
import simk.SimkPackage;
import simk.StaticMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIMK Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simk.impl.SIMKModelImpl#getSMContexts <em>SM Contexts</em>}</li>
 *   <li>{@link simk.impl.SIMKModelImpl#getStaticMethods <em>Static Methods</em>}</li>
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
	 * The cached value of the '{@link #getStaticMethods() <em>Static Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticMethod> staticMethods;

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
	public EList<StaticMethod> getStaticMethods() {
		if (staticMethods == null) {
			staticMethods = new EObjectContainmentEList.Resolving<StaticMethod>(
					StaticMethod.class, this,
					SimkPackage.SIMK_MODEL__STATIC_METHODS);
		}
		return staticMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextId() {
		java.lang.Integer result = null;

		return result;

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
														"::", "."), ".helper"),
						simk.SMUsage.getByName("Super"), context);

		simk.StaticMethod sm = null;
		//BIft:detect

		simk.StaticMethod result_ft244 = null;

		simk.StaticMethod elem_ft244 = null;

		result_ft244 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_1039 = false;
			while (!idLoopCond_1039) {
				idLoopCond_1039 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft244.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft244, null));
				if (idLoopCond_1039) {
				} else {

					elem_ft244 = it_ft244.next();

					java.lang.Boolean idIfCond_1040 = false;
					//BIle:detector
					simk.StaticMethod o_lbdExp244 = elem_ft244;

					idIfCond_1040 = kermeta.standard.helper.StringWrapper
							.equals(
									o_lbdExp244.getName(),
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

					if (idIfCond_1040) {

						result_ft244 = elem_ft244;
					}

				}
			}
		}

		//CE
		sm = result_ft244;
		//EIft:detect

		java.lang.Boolean idIfCond_1041 = false;
		idIfCond_1041 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_1041) {

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

		simk.StaticMethod sm = null;
		//BIft:detect

		simk.StaticMethod result_ft245 = null;

		simk.StaticMethod elem_ft245 = null;

		result_ft245 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft245 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_1042 = false;
			while (!idLoopCond_1042) {
				idLoopCond_1042 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft245.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft245, null));
				if (idLoopCond_1042) {
				} else {

					elem_ft245 = it_ft245.next();

					java.lang.Boolean idIfCond_1043 = false;
					//BIle:detector
					simk.StaticMethod o_lbdExp245 = elem_ft245;

					idIfCond_1043 = kermeta.standard.helper.StringWrapper
							.equals(
									o_lbdExp245.getName(),
									((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("km2ecore.helper.java.IdentifierHelper"))
											.getMangledIdentifier(op
													.getFinalName(), context));
					//EIle:detector

					if (idIfCond_1043) {

						result_ft245 = elem_ft245;
					}

				}
			}
		}

		//CE
		sm = result_ft245;
		//EIft:detect

		java.lang.Boolean idIfCond_1044 = false;
		idIfCond_1044 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_1044) {

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
														"::", "."), ".runner"),
						simk.SMUsage.getByName("Runner"), context);

		simk.StaticMethod sm = null;
		//BIft:detect

		simk.StaticMethod result_ft246 = null;

		simk.StaticMethod elem_ft246 = null;

		result_ft246 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft246 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_1045 = false;
			while (!idLoopCond_1045) {
				idLoopCond_1045 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft246.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft246, null));
				if (idLoopCond_1045) {
				} else {

					elem_ft246 = it_ft246.next();

					java.lang.Boolean idIfCond_1046 = false;
					//BIle:detector
					simk.StaticMethod o_lbdExp246 = elem_ft246;

					idIfCond_1046 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp246.getName(), "main");
					//EIle:detector

					if (idIfCond_1046) {

						result_ft246 = elem_ft246;
					}

				}
			}
		}

		//CE
		sm = result_ft246;
		//EIft:detect

		java.lang.Boolean idIfCond_1047 = false;
		idIfCond_1047 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_1047) {

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

		java.lang.Boolean idIfCond_1048 = false;
		idIfCond_1048 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext.getSMClass());

		if (idIfCond_1048) {

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

		simk.SMContext result_ft247 = null;

		simk.SMContext elem_ft247 = null;

		result_ft247 = null;

		{

			kermeta.standard.Iterator<simk.SMContext> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.iterator();
			java.lang.Boolean idLoopCond_1049 = false;
			while (!idLoopCond_1049) {
				idLoopCond_1049 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft247.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft247, null));
				if (idLoopCond_1049) {
				} else {

					elem_ft247 = it_ft247.next();

					java.lang.Boolean idIfCond_1050 = false;
					//BIle:detector
					simk.SMContext c_lbdExp247 = elem_ft247;

					idIfCond_1050 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.and(
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp247
																			.getQualifiedNameFinalPackage(),
																	finalPackage_qname),
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp247
																			.getSMClass()
																			.getName(),
																	class_qname)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equals(c_lbdExp247.getSMClass()
													.getUsages(), usage));
					//EIle:detector

					if (idIfCond_1050) {

						result_ft247 = elem_ft247;
					}

				}
			}
		}

		//CE
		sMContext = result_ft247;
		//EIft:detect

		java.lang.Boolean idIfCond_1051 = false;
		idIfCond_1051 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext);

		if (idIfCond_1051) {

			sMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMContext"));

			sMContext.setQualifiedNameFinalPackage(finalPackage_qname);

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
		case SimkPackage.SIMK_MODEL__STATIC_METHODS:
			return ((InternalEList<?>) getStaticMethods()).basicRemove(
					otherEnd, msgs);
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
		case SimkPackage.SIMK_MODEL__STATIC_METHODS:
			return getStaticMethods();
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
		case SimkPackage.SIMK_MODEL__STATIC_METHODS:
			getStaticMethods().clear();
			getStaticMethods().addAll(
					(Collection<? extends StaticMethod>) newValue);
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
		case SimkPackage.SIMK_MODEL__STATIC_METHODS:
			getStaticMethods().clear();
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
		case SimkPackage.SIMK_MODEL__STATIC_METHODS:
			return staticMethods != null && !staticMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SIMKModelImpl
