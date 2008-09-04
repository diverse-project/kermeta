/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModelImpl.java,v 1.1 2008-09-04 15:40:25 cfaucher Exp $
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
		//Beginning of the Inlining of the function type: detect

		simk.StaticMethod result_ft194 = null;

		simk.StaticMethod elem_ft194 = null;

		result_ft194 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_849 = false;
			while (!idLoopCond_849) {
				idLoopCond_849 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft194.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft194, null));
				if (idLoopCond_849) {
				} else {

					elem_ft194 = it_ft194.next();

					java.lang.Boolean idIfCond_850 = false;
					//Beginning of the Inlining of the lambda expression: detector
					simk.StaticMethod o = elem_ft194;

					idIfCond_850 = kermeta.standard.helper.StringWrapper
							.equals(
									o.getName(),
									kermeta.standard.helper.StringWrapper
											.plus(
													"super_",
													((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject("km2ecore.helper.java.IdentifierHelper"))
															.getMangledIdentifier(
																	op
																			.getFinalName(),
																	context)));
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_850) {

						result_ft194 = elem_ft194;
					}

				}
			}
		}

		//callElement
		sm = result_ft194;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_851 = false;
		idIfCond_851 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_851) {

			result = sMContext;
		}

		return result;

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
		//Beginning of the Inlining of the function type: detect

		simk.StaticMethod result_ft195 = null;

		simk.StaticMethod elem_ft195 = null;

		result_ft195 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft195 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_852 = false;
			while (!idLoopCond_852) {
				idLoopCond_852 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft195.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft195, null));
				if (idLoopCond_852) {
				} else {

					elem_ft195 = it_ft195.next();

					java.lang.Boolean idIfCond_853 = false;
					//Beginning of the Inlining of the lambda expression: detector
					simk.StaticMethod o = elem_ft195;

					idIfCond_853 = kermeta.standard.helper.StringWrapper
							.equals(
									o.getName(),
									((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("km2ecore.helper.java.IdentifierHelper"))
											.getMangledIdentifier(op
													.getFinalName(), context));
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_853) {

						result_ft195 = elem_ft195;
					}

				}
			}
		}

		//callElement
		sm = result_ft195;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_854 = false;
		idIfCond_854 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_854) {

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

		java.lang.Boolean idIfCond_855 = false;
		idIfCond_855 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext);

		if (idIfCond_855) {

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
		//Beginning of the Inlining of the function type: detect

		simk.StaticMethod result_ft196 = null;

		simk.StaticMethod elem_ft196 = null;

		result_ft196 = null;

		{

			kermeta.standard.Iterator<simk.StaticMethod> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							sMContext.getStaticMethods()).iterator();
			java.lang.Boolean idLoopCond_856 = false;
			while (!idLoopCond_856) {
				idLoopCond_856 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft196.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft196, null));
				if (idLoopCond_856) {
				} else {

					elem_ft196 = it_ft196.next();

					java.lang.Boolean idIfCond_857 = false;
					//Beginning of the Inlining of the lambda expression: detector
					simk.StaticMethod o = elem_ft196;

					idIfCond_857 = kermeta.standard.helper.StringWrapper
							.equals(o.getName(), "main");
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_857) {

						result_ft196 = elem_ft196;
					}

				}
			}
		}

		//callElement
		sm = result_ft196;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_858 = false;
		idIfCond_858 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sm);

		if (idIfCond_858) {

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

		java.lang.Boolean idIfCond_859 = false;
		idIfCond_859 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext.getSMClass());

		if (idIfCond_859) {

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
		//Beginning of the Inlining of the function type: detect

		simk.SMContext result_ft197 = null;

		simk.SMContext elem_ft197 = null;

		result_ft197 = null;

		{

			kermeta.standard.Iterator<simk.SMContext> it_ft197 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMContext> convertAsOrderedSet(this.getSMContexts())
					.iterator();
			java.lang.Boolean idLoopCond_860 = false;
			while (!idLoopCond_860) {
				idLoopCond_860 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft197.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft197, null));
				if (idLoopCond_860) {
				} else {

					elem_ft197 = it_ft197.next();

					java.lang.Boolean idIfCond_861 = false;
					//Beginning of the Inlining of the lambda expression: detector
					simk.SMContext c = elem_ft197;

					idIfCond_861 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.and(
													kermeta.standard.helper.StringWrapper
															.equals(
																	c
																			.getQualifiedNameFinalPackage(),
																	finalPackage_qname),
													kermeta.standard.helper.StringWrapper
															.equals(
																	c
																			.getSMClass()
																			.getName(),
																	class_qname)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equals(c.getSMClass().getUsages(),
													usage));
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_861) {

						result_ft197 = elem_ft197;
					}

				}
			}
		}

		//callElement
		sMContext = result_ft197;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_862 = false;
		idIfCond_862 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(sMContext);

		if (idIfCond_862) {

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
