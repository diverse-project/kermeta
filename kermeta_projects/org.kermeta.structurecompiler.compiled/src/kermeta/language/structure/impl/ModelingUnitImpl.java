/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnitImpl.java,v 1.9 2008-11-27 15:49:50 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EAnnotation;
import ecore.EClassifier;
import ecore.EPackage;

import java.util.Collection;

import kermeta.language.structure.Filter;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Require;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypeDefinition;
import kermeta.language.structure.Using;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getEcorePackages <em>Ecore Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingUnitImpl extends TraceabilityImpl<EAnnotation> implements
		ModelingUnit {
	/**
	 * The cached value of the '{@link #getEcorePackages() <em>Ecore Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcorePackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> ecorePackages;

	/**
	 * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsings()
	 * @generated
	 * @ordered
	 */
	protected EList<Using> usings;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.language.structure.Package> packages;

	/**
	 * The cached value of the '{@link #getIncludeFilters() <em>Include Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> includeFilters;

	/**
	 * The cached value of the '{@link #getSuperOperationsToCompileInHelper() <em>Super Operations To Compile In Helper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperOperationsToCompileInHelper()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> superOperationsToCompileInHelper;

	/**
	 * The cached value of the '{@link #getExcludeFilters() <em>Exclude Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> excludeFilters;

	/**
	 * The cached value of the '{@link #getReferencedModelingUnits() <em>Referenced Modeling Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedModelingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingUnit> referencedModelingUnits;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Require> requires;

	/**
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> entryPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getModelingUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getEcorePackages() {
		if (ecorePackages == null) {
			ecorePackages = new EObjectResolvingEList<EPackage>(EPackage.class,
					this, StructurePackage.MODELING_UNIT__ECORE_PACKAGES);
		}
		return ecorePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Using> getUsings() {
		if (usings == null) {
			usings = new EObjectContainmentEList.Resolving<Using>(Using.class,
					this, StructurePackage.MODELING_UNIT__USINGS);
		}
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList.Resolving<kermeta.language.structure.Package>(
					kermeta.language.structure.Package.class, this,
					StructurePackage.MODELING_UNIT__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getIncludeFilters() {
		if (includeFilters == null) {
			includeFilters = new EObjectContainmentEList.Resolving<Filter>(
					Filter.class, this,
					StructurePackage.MODELING_UNIT__INCLUDE_FILTERS);
		}
		return includeFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getSuperOperationsToCompileInHelper() {
		if (superOperationsToCompileInHelper == null) {
			superOperationsToCompileInHelper = new EObjectResolvingEList<Operation>(
					Operation.class,
					this,
					StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER);
		}
		return superOperationsToCompileInHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getExcludeFilters() {
		if (excludeFilters == null) {
			excludeFilters = new EObjectContainmentEList.Resolving<Filter>(
					Filter.class, this,
					StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS);
		}
		return excludeFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingUnit> getReferencedModelingUnits() {
		if (referencedModelingUnits == null) {
			referencedModelingUnits = new EObjectResolvingEList<ModelingUnit>(
					ModelingUnit.class, this,
					StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS);
		}
		return referencedModelingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Require> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList.Resolving<Require>(
					Require.class, this,
					StructurePackage.MODELING_UNIT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EObjectResolvingEList<EAnnotation>(
					EAnnotation.class, this,
					StructurePackage.MODELING_UNIT__ENTRY_POINTS);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Package retrievePackage(String qname) {

		kermeta.language.structure.Package result = null;

		result = null;

		kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_198 = false;
		idIfCond_198 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_198) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft47 = null;

		kermeta.language.structure.Package elem_ft47 = null;

		result_ft47 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_199 = false;
			while (!idLoopCond_199) {
				idLoopCond_199 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft47.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft47, null));
				if (idLoopCond_199) {
				} else {

					elem_ft47 = it_ft47.next();

					java.lang.Boolean idIfCond_200 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp47 = elem_ft47;

					idIfCond_200 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp47.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_200) {

						result_ft47 = elem_ft47;
					}

				}
			}
		}

		//CE
		pack = result_ft47;
		//EIft:detect

		java.lang.Boolean idIfCond_201 = false;
		idIfCond_201 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_201) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_202 = false;
				while (!idLoopCond_202) {
					idLoopCond_202 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, set_qname.size());
					if (idLoopCond_202) {
					} else {

						//BIft:detect

						kermeta.language.structure.Package result_ft48 = null;

						kermeta.language.structure.Package elem_ft48 = null;

						result_ft48 = null;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft48 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Package> convertAsOrderedSet(
											pack.getNestedPackage()).iterator();
							java.lang.Boolean idLoopCond_203 = false;
							while (!idLoopCond_203) {
								idLoopCond_203 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft48.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft48,
																null));
								if (idLoopCond_203) {
								} else {

									elem_ft48 = it_ft48.next();

									java.lang.Boolean idIfCond_204 = false;
									//BIle:detector
									kermeta.language.structure.Package p_lbdExp48 = elem_ft48;

									idIfCond_204 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp48.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_204) {

										result_ft48 = elem_ft48;
									}

								}
							}
						}

						//CE
						pack = result_ft48;
						//EIft:detect

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

			result = pack;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createKRuntimeError(KM2EcoreContext context) {

		ecore.EDataType exception_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EDataType"));

		exception_EDataType.setName("KRuntimeError");

		exception_EDataType.setInstanceClassName(context
				.getJAVA_CLASS_EXCEPTION_SWITCHER());

		exception_EDataType.setSerializable(false);

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EClassifier> convertAsOrderedSet(
						this.retrievePackage("kermeta::exceptions")
								.getEcoreModelElement().getEClassifiers()).add(
						exception_EDataType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EAnnotation ecoreAnnotation = this
				.createEcoreModelElement(context);

		this.setEcoreModelElement(ecoreAnnotation);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_205 = false;
			while (!idLoopCond_205) {
				idLoopCond_205 = it_ft50.isOff();
				if (idLoopCond_205) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp50 = it_ft50.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp49 = o_lbdExp50;

					p_lbdExp49.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_206 = false;
			while (!idLoopCond_206) {
				idLoopCond_206 = it_ft51.isOff();
				if (idLoopCond_206) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp51 = it_ft51
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp49 = p_lbdExp51;

					p_lbdExp49.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_207 = false;
			while (!idLoopCond_207) {
				idLoopCond_207 = it_ft52.isOff();
				if (idLoopCond_207) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp52 = it_ft52
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp49 = p_lbdExp52;

					p_lbdExp49.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_208 = false;
			while (!idLoopCond_208) {
				idLoopCond_208 = it_ft53.isOff();
				if (idLoopCond_208) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp53 = it_ft53
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp49 = p_lbdExp53;

					p_lbdExp49.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_209 = false;
			while (!idLoopCond_209) {
				idLoopCond_209 = it_ft54.isOff();
				if (idLoopCond_209) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp54 = it_ft54
							.next();

					kermeta.standard.Sequence<ecore.EPackage> eps = null;
					//BIft:select

					kermeta.standard.Sequence<ecore.EPackage> result_ft55 = null;

					ecore.EPackage elem_ft55 = null;

					result_ft55 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.standard.Sequence<ecore.EPackage>"));

					{

						kermeta.standard.Iterator<ecore.EPackage> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EPackage> convertAsOrderedSet(
										this.getEcorePackages()).iterator();
						java.lang.Boolean idLoopCond_210 = false;
						while (!idLoopCond_210) {
							idLoopCond_210 = it_ft55.isOff();
							if (idLoopCond_210) {
							} else {

								elem_ft55 = it_ft55.next();

								java.lang.Boolean idIfCond_211 = false;
								//BIle:selector
								ecore.EPackage ep_lbdExp55 = elem_ft55;

								idIfCond_211 = kermeta.standard.helper.StringWrapper
										.equals(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp54
																.getName()),
												kermeta.standard.helper.StringWrapper
														.toLowerCase(ep_lbdExp55
																.getName()));
								//EIle:selector

								if (idIfCond_211) {

									result_ft55.add(elem_ft55);
								}

							}
						}
					}

					//CE
					eps = result_ft55;
					//EIft:select

					java.lang.Boolean idIfCond_212 = false;
					idIfCond_212 = kermeta.standard.helper.IntegerWrapper
							.isGreater(eps.size(), 0);

					if (idIfCond_212) {

						java.lang.Boolean idIfCond_213 = false;
						idIfCond_213 = kermeta.standard.helper.IntegerWrapper
								.equals(eps.size(), 1);

						if (idIfCond_213) {

							//BIft:detect

							kermeta.language.structure.Package result_ft56 = null;

							kermeta.language.structure.Package elem_ft56 = null;

							result_ft56 = null;

							{

								kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Package> convertAsOrderedSet(
												this.getPackages()).iterator();
								java.lang.Boolean idLoopCond_214 = false;
								while (!idLoopCond_214) {
									idLoopCond_214 = kermeta.standard.helper.BooleanWrapper
											.or(
													it_ft56.isOff(),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isNotEqualSwitcher(
																	result_ft56,
																	null));
									if (idLoopCond_214) {
									} else {

										elem_ft56 = it_ft56.next();

										java.lang.Boolean idIfCond_215 = false;
										//BIle:detector
										kermeta.language.structure.Package pack_lbdExp56 = elem_ft56;

										idIfCond_215 = kermeta.standard.helper.StringWrapper
												.equals(
														kermeta.standard.helper.StringWrapper
																.toLowerCase(pack_lbdExp56
																		.getName()),
														kermeta.standard.helper.StringWrapper
																.toLowerCase(p_lbdExp54
																		.getName()));
										//EIle:detector

										if (idIfCond_215) {

											result_ft56 = elem_ft56;
										}

									}
								}
							}

							//EIft:detect
							result_ft56
									.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.toLowerCase(p_lbdExp54
																	.getName()),
													"0"));
						}

						p_lbdExp54
								.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp54
																.getName()),
												kermeta.standard.helper.IntegerWrapper
														.toString(eps.size())));
					}

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EPackage> convertAsOrderedSet(
									this.getEcorePackages()).add(
									p_lbdExp54.getEcoreModelElement());
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compileSuperOperation(KM2EcoreContext context) {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							this.getSuperOperationsToCompileInHelper())
					.iterator();
			java.lang.Boolean idLoopCond_216 = false;
			while (!idLoopCond_216) {
				idLoopCond_216 = it_ft57.isOff();
				if (idLoopCond_216) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation op_lbdExp57 = it_ft57
							.next();

					java.lang.Boolean staticOperationMode_backup = context
							.getStaticOperationMode();

					context.setStaticOperationMode(true);

					this.compileStaticOperation(op_lbdExp57, context);

					context.setStaticOperationMode(staticOperationMode_backup);
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void postprocess(KM2EcoreContext context) {

		this.compileSuperOperation(context);

		this.cleanEObject();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEClassifierByQualifiedName(String qname) {

		ecore.EClassifier result = null;

		result = null;

		kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_217 = false;
		idIfCond_217 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_217) {

			set_qname.add(qname);
		}

		ecore.EPackage pack = null;
		//BIft:detect

		ecore.EPackage result_ft58 = null;

		ecore.EPackage elem_ft58 = null;

		result_ft58 = null;

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getEcorePackages()).iterator();
			java.lang.Boolean idLoopCond_218 = false;
			while (!idLoopCond_218) {
				idLoopCond_218 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft58.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft58, null));
				if (idLoopCond_218) {
				} else {

					elem_ft58 = it_ft58.next();

					java.lang.Boolean idIfCond_219 = false;
					//BIle:detector
					ecore.EPackage p_lbdExp58 = elem_ft58;

					idIfCond_219 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp58.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_219) {

						result_ft58 = elem_ft58;
					}

				}
			}
		}

		//CE
		pack = result_ft58;
		//EIft:detect

		java.lang.Boolean idIfCond_220 = false;
		idIfCond_220 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_220) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_221 = false;
				while (!idLoopCond_221) {
					idLoopCond_221 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1));
					if (idLoopCond_221) {
					} else {

						//BIft:detect

						ecore.EPackage result_ft59 = null;

						ecore.EPackage elem_ft59 = null;

						result_ft59 = null;

						{

							kermeta.standard.Iterator<ecore.EPackage> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EPackage> convertAsOrderedSet(
											pack.getESubpackages()).iterator();
							java.lang.Boolean idLoopCond_222 = false;
							while (!idLoopCond_222) {
								idLoopCond_222 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft59.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft59,
																null));
								if (idLoopCond_222) {
								} else {

									elem_ft59 = it_ft59.next();

									java.lang.Boolean idIfCond_223 = false;
									//BIle:detector
									ecore.EPackage p_lbdExp59 = elem_ft59;

									idIfCond_223 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp59.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_223) {

										result_ft59 = elem_ft59;
									}

								}
							}
						}

						//CE
						pack = result_ft59;
						//EIft:detect

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

			//BIft:detect

			ecore.EClassifier result_ft60 = null;

			ecore.EClassifier elem_ft60 = null;

			result_ft60 = null;

			{

				kermeta.standard.Iterator<ecore.EClassifier> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EClassifier> convertAsOrderedSet(
								pack.getEClassifiers()).iterator();
				java.lang.Boolean idLoopCond_224 = false;
				while (!idLoopCond_224) {
					idLoopCond_224 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft60.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft60,
													null));
					if (idLoopCond_224) {
					} else {

						elem_ft60 = it_ft60.next();

						java.lang.Boolean idIfCond_225 = false;
						//BIle:detector
						ecore.EClassifier c_lbdExp60 = elem_ft60;

						idIfCond_225 = kermeta.standard.helper.StringWrapper
								.equals(
										c_lbdExp60.getName(),
										set_qname
												.at(kermeta.standard.helper.IntegerWrapper
														.minus(
																set_qname
																		.size(),
																1)));
						//EIle:detector

						if (idIfCond_225) {

							result_ft60 = elem_ft60;
						}

					}
				}
			}

			//CE
			result = result_ft60;
			//EIft:detect

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cleanEObject() {

		java.lang.Boolean idIfCond_226 = false;
		idIfCond_226 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getEClassifierByQualifiedName("ecore::EObject")));

		if (idIfCond_226) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											this
													.getEClassifierByQualifiedName("ecore::EObject"),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"ecore.EClass")))
									.getEOperations()).clear();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void preprocess(KM2EcoreContext context) {

		this.createKRuntimeError(context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compileStaticOperation(Operation op, KM2EcoreContext context) {

		simk.SMContext smContext = context.getSimkModel()
				.retrieveOrCreateContextForSuper(op, context);

		java.lang.Boolean idIfCond_227 = false;
		idIfCond_227 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(smContext));

		if (idIfCond_227) {

			simk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMMethod"));

			staticMethod.setName(kermeta.standard.helper.StringWrapper.plus(
					"super_", op.getFinalName(context)));

			staticMethod.setTypeParameters("G");

			staticMethod.setBody(op.createBehaviorJava(context));

			staticMethod.setUsages(simk.SMUsage.getByName("Super"));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							context.getSimkModel().getSMMethods()).add(
							staticMethod);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							smContext.getSMMethods()).add(staticMethod);

			simk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMReturn"));

			smReturn.setType(op.getType().createBehaviorJava(context));

			java.lang.Boolean idIfCond_228 = false;
			idIfCond_228 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(smReturn.getType());

			if (idIfCond_228) {

				smReturn.setType("void");
			}

			staticMethod.setSMReturn(smReturn);

			simk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMParameter"));

			default_param.setName("self");

			default_param
					.setType(kermeta.standard.helper.StringWrapper
							.replace(
									((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(op),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.qualifiedName(), context
											.getKERMETA_SEPARATOR(), context
											.getJAVA_SEPARATOR()));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMParameter> convertAsOrderedSet(
							staticMethod.getSMParameters()).add(default_param);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								op.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_229 = false;
				while (!idLoopCond_229) {
					idLoopCond_229 = it_ft61.isOff();
					if (idLoopCond_229) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp61 = it_ft61
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("simk.SMParameter"));

						param.setName(p_lbdExp61.getName());

						java.lang.Boolean idIfCond_230 = false;
						idIfCond_230 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp61.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_230) {

							param.setType(p_lbdExp61.getType()
									.createBehaviorJava(context));

							java.lang.Boolean idIfCond_231 = false;
							idIfCond_231 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("kermeta.language.structure.Operation"))
									.isVoidType(param.getType());

							if (idIfCond_231) {

								param.setType("void");
							}

						} else {
						}

						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<simk.SMParameter> convertAsOrderedSet(
										staticMethod.getSMParameters()).add(
										param);
						//EIle:func

					}
				}
			}

			//EIft:each

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEcoreModelElement(KM2EcoreContext context) {

		ecore.EAnnotation result = null;

		ecore.EAnnotation ecoreAnnotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EAnnotation"));

		ecoreAnnotation.setSource("ModelingUnit");

		ecore.EStringToStringMapEntry requireEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EStringToStringMapEntry"));

		requireEntry.setKey("require");

		requireEntry.setValue("");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
						ecoreAnnotation.getDetails()).add(requireEntry);

		ecore.EStringToStringMapEntry usingEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EStringToStringMapEntry"));

		usingEntry.setKey("using");

		usingEntry.setValue("");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
						ecoreAnnotation.getDetails()).add(usingEntry);

		result = ecoreAnnotation;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<kermeta.language.structure.Package> getAllPackages() {

		kermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;

		result = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<kermeta.language.structure.Package>"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_232 = false;
			while (!idLoopCond_232) {
				idLoopCond_232 = it_ft62.isOff();
				if (idLoopCond_232) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp62 = it_ft62
							.next();

					result.add(p_lbdExp62);

					result.addAll(p_lbdExp62.getAllSubPackages());
					//EIle:func

				}
			}
		}

		//EIft:each

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_233 = false;
			while (!idLoopCond_233) {
				idLoopCond_233 = it_ft64.isOff();
				if (idLoopCond_233) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp64 = it_ft64.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp63 = o_lbdExp64;

					p_lbdExp63.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_234 = false;
			while (!idLoopCond_234) {
				idLoopCond_234 = it_ft65.isOff();
				if (idLoopCond_234) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp65 = it_ft65
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp63 = p_lbdExp65;

					p_lbdExp63.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_235 = false;
			while (!idLoopCond_235) {
				idLoopCond_235 = it_ft66.isOff();
				if (idLoopCond_235) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp66 = it_ft66
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp63 = p_lbdExp66;

					p_lbdExp63.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_236 = false;
			while (!idLoopCond_236) {
				idLoopCond_236 = it_ft67.isOff();
				if (idLoopCond_236) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp67 = it_ft67
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp63 = p_lbdExp67;

					p_lbdExp63.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getTypeDefinitionByQualifiedName(String qname) {

		kermeta.language.structure.TypeDefinition result = null;

		kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_237 = false;
		idIfCond_237 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_237) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft68 = null;

		kermeta.language.structure.Package elem_ft68 = null;

		result_ft68 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_238 = false;
			while (!idLoopCond_238) {
				idLoopCond_238 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft68.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft68, null));
				if (idLoopCond_238) {
				} else {

					elem_ft68 = it_ft68.next();

					java.lang.Boolean idIfCond_239 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp68 = elem_ft68;

					idIfCond_239 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp68.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_239) {

						result_ft68 = elem_ft68;
					}

				}
			}
		}

		//CE
		pack = result_ft68;
		//EIft:detect

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_240 = false;
			while (!idLoopCond_240) {
				idLoopCond_240 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_240) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft69 = null;

					kermeta.language.structure.Package elem_ft69 = null;

					result_ft69 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_241 = false;
						while (!idLoopCond_241) {
							idLoopCond_241 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft69.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft69, null));
							if (idLoopCond_241) {
							} else {

								elem_ft69 = it_ft69.next();

								java.lang.Boolean idIfCond_242 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp69 = elem_ft69;

								idIfCond_242 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp69.getName(), set_qname
												.at(i));
								//EIle:detector

								if (idIfCond_242) {

									result_ft69 = elem_ft69;
								}

							}
						}
					}

					//CE
					pack = result_ft69;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		//BIft:detect

		kermeta.language.structure.TypeDefinition result_ft70 = null;

		kermeta.language.structure.TypeDefinition elem_ft70 = null;

		result_ft70 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_243 = false;
			while (!idLoopCond_243) {
				idLoopCond_243 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft70.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft70, null));
				if (idLoopCond_243) {
				} else {

					elem_ft70 = it_ft70.next();

					java.lang.Boolean idIfCond_244 = false;
					//BIle:detector
					kermeta.language.structure.TypeDefinition c_lbdExp70 = elem_ft70;

					idIfCond_244 = kermeta.standard.helper.StringWrapper
							.equals(c_lbdExp70.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_244) {

						result_ft70 = elem_ft70;
					}

				}
			}
		}

		//CE
		result = result_ft70;
		//EIft:detect

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
		case StructurePackage.MODELING_UNIT__USINGS:
			return ((InternalEList<?>) getUsings()).basicRemove(otherEnd, msgs);
		case StructurePackage.MODELING_UNIT__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd,
					msgs);
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			return ((InternalEList<?>) getIncludeFilters()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			return ((InternalEList<?>) getExcludeFilters()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.MODELING_UNIT__REQUIRES:
			return ((InternalEList<?>) getRequires()).basicRemove(otherEnd,
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
		case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
			return getEcorePackages();
		case StructurePackage.MODELING_UNIT__USINGS:
			return getUsings();
		case StructurePackage.MODELING_UNIT__PACKAGES:
			return getPackages();
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			return getIncludeFilters();
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			return getSuperOperationsToCompileInHelper();
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			return getExcludeFilters();
		case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
			return getReferencedModelingUnits();
		case StructurePackage.MODELING_UNIT__REQUIRES:
			return getRequires();
		case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
			return getEntryPoints();
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
		case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
			getEcorePackages().clear();
			getEcorePackages()
					.addAll((Collection<? extends EPackage>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__USINGS:
			getUsings().clear();
			getUsings().addAll((Collection<? extends Using>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__PACKAGES:
			getPackages().clear();
			getPackages()
					.addAll(
							(Collection<? extends kermeta.language.structure.Package>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			getIncludeFilters().clear();
			getIncludeFilters().addAll((Collection<? extends Filter>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			getSuperOperationsToCompileInHelper().clear();
			getSuperOperationsToCompileInHelper().addAll(
					(Collection<? extends Operation>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			getExcludeFilters().clear();
			getExcludeFilters().addAll((Collection<? extends Filter>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
			getReferencedModelingUnits().clear();
			getReferencedModelingUnits().addAll(
					(Collection<? extends ModelingUnit>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends Require>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
			getEntryPoints().clear();
			getEntryPoints().addAll(
					(Collection<? extends EAnnotation>) newValue);
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
		case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
			getEcorePackages().clear();
			return;
		case StructurePackage.MODELING_UNIT__USINGS:
			getUsings().clear();
			return;
		case StructurePackage.MODELING_UNIT__PACKAGES:
			getPackages().clear();
			return;
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			getIncludeFilters().clear();
			return;
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			getSuperOperationsToCompileInHelper().clear();
			return;
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			getExcludeFilters().clear();
			return;
		case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
			getReferencedModelingUnits().clear();
			return;
		case StructurePackage.MODELING_UNIT__REQUIRES:
			getRequires().clear();
			return;
		case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
			getEntryPoints().clear();
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
		case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
			return ecorePackages != null && !ecorePackages.isEmpty();
		case StructurePackage.MODELING_UNIT__USINGS:
			return usings != null && !usings.isEmpty();
		case StructurePackage.MODELING_UNIT__PACKAGES:
			return packages != null && !packages.isEmpty();
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			return includeFilters != null && !includeFilters.isEmpty();
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			return superOperationsToCompileInHelper != null
					&& !superOperationsToCompileInHelper.isEmpty();
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			return excludeFilters != null && !excludeFilters.isEmpty();
		case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
			return referencedModelingUnits != null
					&& !referencedModelingUnits.isEmpty();
		case StructurePackage.MODELING_UNIT__REQUIRES:
			return requires != null && !requires.isEmpty();
		case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
			return entryPoints != null && !entryPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelingUnitImpl
