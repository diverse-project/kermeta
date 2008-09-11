/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModelImpl.java,v 1.2 2008-09-11 12:34:39 cfaucher Exp $
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
														"::", "\\."), ".helper"),
						simk.SMUsage.getByName("Super"), context);

		simk.StaticMethod sm = null;
		//BIft:detect

		simk.StaticMethod result_ft198 = null;

		simk.StaticMethod elem_ft198 = null;

		result_ft198 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft198 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_915 = false;
			while (!idLoopCond_915) {
				idLoopCond_915 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft198.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft198, null));
				if (idLoopCond_915) {
				} else {

					elem_ft198 = it_ft198.next();

					java.lang.Boolean idIfCond_916 = false;
					//BIle:detector
					simk.StaticMethod o_lbdExp198 = elem_ft198;

					idIfCond_916 = kermeta.standard.helper.StringWrapper
							.equals(
									o_lbdExp198.getName(),
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

					if (idIfCond_916) {

						result_ft198 = elem_ft198;
					}

				}
			}
		}

		//CE
		sm = result_ft198;
		//EIft:detect

		java.lang.Boolean idIfCond_917 = false;
		idIfCond_917 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_917) {

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

		simk.StaticMethod result_ft199 = null;

		simk.StaticMethod elem_ft199 = null;

		result_ft199 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_918 = false;
			while (!idLoopCond_918) {
				idLoopCond_918 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft199.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft199, null));
				if (idLoopCond_918) {
				} else {

					elem_ft199 = it_ft199.next();

					java.lang.Boolean idIfCond_919 = false;
					//BIle:detector
					simk.StaticMethod o_lbdExp199 = elem_ft199;

					idIfCond_919 = kermeta.standard.helper.StringWrapper
							.equals(
									o_lbdExp199.getName(),
									((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("km2ecore.helper.java.IdentifierHelper"))
											.getMangledIdentifier(op
													.getFinalName(), context));
					//EIle:detector

					if (idIfCond_919) {

						result_ft199 = elem_ft199;
					}

				}
			}
		}

		//CE
		sm = result_ft199;
		//EIft:detect

		java.lang.Boolean idIfCond_920 = false;
		idIfCond_920 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_920) {

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
														"::", "\\."), ".runner"),
						simk.SMUsage.getByName("Runner"), context);

		java.lang.Boolean idIfCond_921 = false;
		idIfCond_921 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext);

		if (idIfCond_921) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.writeln(kermeta.standard.helper.StringWrapper
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
																									"__"),
																					"Runner"),
																	" - "),
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
																	"::", "\\.")),
									".runner"));
		}

		simk.StaticMethod sm = null;
		//BIft:detect

		simk.StaticMethod result_ft200 = null;

		simk.StaticMethod elem_ft200 = null;

		result_ft200 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft200 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_922 = false;
			while (!idLoopCond_922) {
				idLoopCond_922 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft200.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft200, null));
				if (idLoopCond_922) {
				} else {

					elem_ft200 = it_ft200.next();

					java.lang.Boolean idIfCond_923 = false;
					//BIle:detector
					simk.StaticMethod o_lbdExp200 = elem_ft200;

					idIfCond_923 = kermeta.standard.helper.StringWrapper
							.equals(o_lbdExp200.getName(), "main");
					//EIle:detector

					if (idIfCond_923) {

						result_ft200 = elem_ft200;
					}

				}
			}
		}

		//CE
		sm = result_ft200;
		//EIft:detect

		java.lang.Boolean idIfCond_924 = false;
		idIfCond_924 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_924) {

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

		java.lang.Boolean idIfCond_925 = false;
		idIfCond_925 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext.getSMClass());

		if (idIfCond_925) {

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

		simk.SMContext result_ft201 = null;

		simk.SMContext elem_ft201 = null;

		result_ft201 = null;

		{

			kermeta.standard.Iterator<simk.SMContext> it_ft201 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.iterator();
			java.lang.Boolean idLoopCond_926 = false;
			while (!idLoopCond_926) {
				idLoopCond_926 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft201.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft201, null));
				if (idLoopCond_926) {
				} else {

					elem_ft201 = it_ft201.next();

					java.lang.Boolean idIfCond_927 = false;
					//BIle:detector
					simk.SMContext c_lbdExp201 = elem_ft201;

					idIfCond_927 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.and(
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp201
																			.getQualifiedNameFinalPackage(),
																	finalPackage_qname),
													kermeta.standard.helper.StringWrapper
															.equals(
																	c_lbdExp201
																			.getSMClass()
																			.getName(),
																	class_qname)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equals(c_lbdExp201.getSMClass()
													.getUsages(), usage));
					//EIle:detector

					if (idIfCond_927) {

						result_ft201 = elem_ft201;
					}

				}
			}
		}

		//CE
		sMContext = result_ft201;
		//EIft:detect

		java.lang.Boolean idIfCond_928 = false;
		idIfCond_928 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext);

		if (idIfCond_928) {

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
