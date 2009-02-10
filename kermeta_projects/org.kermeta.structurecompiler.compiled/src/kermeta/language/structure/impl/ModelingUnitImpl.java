/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ModelingUnitImpl.java,v 1.11 2009-02-10 17:51:45 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
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
	 * The cached value of the '{@link #getIncludeFilters() <em>Include Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> includeFilters;

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
	 * The cached value of the '{@link #getExcludeFilters() <em>Exclude Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> excludeFilters;

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

		kermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_534 = false;
		idIfCond_534 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_534) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft96 = null;

		kermeta.language.structure.Package elem_ft96 = null;

		result_ft96 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_535 = false;
			while (!idLoopCond_535) {
				idLoopCond_535 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft96.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft96, null));
				if (idLoopCond_535) {
				} else {

					elem_ft96 = it_ft96.next();

					java.lang.Boolean idIfCond_536 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp96 = elem_ft96;

					idIfCond_536 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp96.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_536) {

						result_ft96 = elem_ft96;
					}

				}
			}
		}

		//CE
		pack = result_ft96;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_537 = false;
		idIfCond_537 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_537) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_538 = false;
				while (!idLoopCond_538) {
					idLoopCond_538 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, set_qname.size());
					if (idLoopCond_538) {
					} else {

						//BIft:detect

						kermeta.language.structure.Package result_ft97 = null;

						kermeta.language.structure.Package elem_ft97 = null;

						result_ft97 = null;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Package> convertAsOrderedSet(
											pack.getNestedPackage()).iterator();
							java.lang.Boolean idLoopCond_539 = false;
							while (!idLoopCond_539) {
								idLoopCond_539 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft97.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft97,
																null));
								if (idLoopCond_539) {
								} else {

									elem_ft97 = it_ft97.next();

									java.lang.Boolean idIfCond_540 = false;
									//BIle:detector
									kermeta.language.structure.Package p_lbdExp97 = elem_ft97;

									idIfCond_540 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp97.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_540) {

										result_ft97 = elem_ft97;
									}

								}
							}
						}

						//CE
						pack = result_ft97;
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
				.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_541 = false;
			while (!idLoopCond_541) {
				idLoopCond_541 = it_ft99.isOff();
				if (idLoopCond_541) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp99 = it_ft99.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp98 = o_lbdExp99;

					p_lbdExp98.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_542 = false;
			while (!idLoopCond_542) {
				idLoopCond_542 = it_ft100.isOff();
				if (idLoopCond_542) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp100 = it_ft100
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp98 = p_lbdExp100;

					p_lbdExp98.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_543 = false;
			while (!idLoopCond_543) {
				idLoopCond_543 = it_ft101.isOff();
				if (idLoopCond_543) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp101 = it_ft101
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp98 = p_lbdExp101;

					p_lbdExp98.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft102 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_544 = false;
			while (!idLoopCond_544) {
				idLoopCond_544 = it_ft102.isOff();
				if (idLoopCond_544) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp102 = it_ft102
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp98 = p_lbdExp102;

					p_lbdExp98.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_545 = false;
			while (!idLoopCond_545) {
				idLoopCond_545 = it_ft103.isOff();
				if (idLoopCond_545) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp103 = it_ft103
							.next();

					kermeta.standard.Sequence<ecore.EPackage> eps = null;
					//BIft:select

					kermeta.standard.Sequence<ecore.EPackage> result_ft104 = null;

					ecore.EPackage elem_ft104 = null;

					result_ft104 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<ecore.EPackage> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EPackage> convertAsOrderedSet(
										this.getEcorePackages()).iterator();
						java.lang.Boolean idLoopCond_546 = false;
						while (!idLoopCond_546) {
							idLoopCond_546 = it_ft104.isOff();
							if (idLoopCond_546) {
							} else {

								elem_ft104 = it_ft104.next();

								java.lang.Boolean idIfCond_547 = false;
								//BIle:selector
								ecore.EPackage ep_lbdExp104 = elem_ft104;

								idIfCond_547 = kermeta.standard.helper.StringWrapper
										.equals(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp103
																.getName()),
												kermeta.standard.helper.StringWrapper
														.toLowerCase(ep_lbdExp104
																.getName()));
								//EIle:selector

								if (idIfCond_547) {

									result_ft104.add(elem_ft104);
								}

							}
						}
					}

					//CE
					eps = result_ft104;
					//EIft:select
					;

					java.lang.Boolean idIfCond_548 = false;
					idIfCond_548 = kermeta.standard.helper.IntegerWrapper
							.isGreater(eps.size(), 0);

					if (idIfCond_548) {

						java.lang.Boolean idIfCond_549 = false;
						idIfCond_549 = kermeta.standard.helper.IntegerWrapper
								.equals(eps.size(), 1);

						if (idIfCond_549) {

							//BIft:detect

							kermeta.language.structure.Package result_ft105 = null;

							kermeta.language.structure.Package elem_ft105 = null;

							result_ft105 = null;

							{

								kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Package> convertAsOrderedSet(
												this.getPackages()).iterator();
								java.lang.Boolean idLoopCond_550 = false;
								while (!idLoopCond_550) {
									idLoopCond_550 = kermeta.standard.helper.BooleanWrapper
											.or(
													it_ft105.isOff(),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isNotEqualSwitcher(
																	result_ft105,
																	null));
									if (idLoopCond_550) {
									} else {

										elem_ft105 = it_ft105.next();

										java.lang.Boolean idIfCond_551 = false;
										//BIle:detector
										kermeta.language.structure.Package pack_lbdExp105 = elem_ft105;

										idIfCond_551 = kermeta.standard.helper.StringWrapper
												.equals(
														kermeta.standard.helper.StringWrapper
																.toLowerCase(pack_lbdExp105
																		.getName()),
														kermeta.standard.helper.StringWrapper
																.toLowerCase(p_lbdExp103
																		.getName()));
										//EIle:detector

										if (idIfCond_551) {

											result_ft105 = elem_ft105;
										}

									}
								}
							}

							//EIft:detect
							result_ft105
									.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.toLowerCase(p_lbdExp103
																	.getName()),
													"0"));
						}

						p_lbdExp103
								.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp103
																.getName()),
												kermeta.standard.helper.IntegerWrapper
														.toString(eps.size())));
					}

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EPackage> convertAsOrderedSet(
									this.getEcorePackages()).add(
									p_lbdExp103.getEcoreModelElement());
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

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft106 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							this.getSuperOperationsToCompileInHelper())
					.iterator();
			java.lang.Boolean idLoopCond_552 = false;
			while (!idLoopCond_552) {
				idLoopCond_552 = it_ft106.isOff();
				if (idLoopCond_552) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation op_lbdExp106 = it_ft106
							.next();

					java.lang.Boolean staticOperationMode_backup = context
							.getStaticOperationMode();

					context.setStaticOperationMode(true);

					this.compileStaticOperation(op_lbdExp106, context);

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

		kermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_553 = false;
		idIfCond_553 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_553) {

			set_qname.add(qname);
		}

		ecore.EPackage pack = null;
		//BIft:detect

		ecore.EPackage result_ft107 = null;

		ecore.EPackage elem_ft107 = null;

		result_ft107 = null;

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft107 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getEcorePackages()).iterator();
			java.lang.Boolean idLoopCond_554 = false;
			while (!idLoopCond_554) {
				idLoopCond_554 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft107.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft107, null));
				if (idLoopCond_554) {
				} else {

					elem_ft107 = it_ft107.next();

					java.lang.Boolean idIfCond_555 = false;
					//BIle:detector
					ecore.EPackage p_lbdExp107 = elem_ft107;

					idIfCond_555 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp107.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_555) {

						result_ft107 = elem_ft107;
					}

				}
			}
		}

		//CE
		pack = result_ft107;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_556 = false;
		idIfCond_556 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_556) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_557 = false;
				while (!idLoopCond_557) {
					idLoopCond_557 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1));
					if (idLoopCond_557) {
					} else {

						//BIft:detect

						ecore.EPackage result_ft108 = null;

						ecore.EPackage elem_ft108 = null;

						result_ft108 = null;

						{

							kermeta.standard.Iterator<ecore.EPackage> it_ft108 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EPackage> convertAsOrderedSet(
											pack.getESubpackages()).iterator();
							java.lang.Boolean idLoopCond_558 = false;
							while (!idLoopCond_558) {
								idLoopCond_558 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft108.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft108,
																null));
								if (idLoopCond_558) {
								} else {

									elem_ft108 = it_ft108.next();

									java.lang.Boolean idIfCond_559 = false;
									//BIle:detector
									ecore.EPackage p_lbdExp108 = elem_ft108;

									idIfCond_559 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp108.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_559) {

										result_ft108 = elem_ft108;
									}

								}
							}
						}

						//CE
						pack = result_ft108;
						//EIft:detect

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

			//BIft:detect

			ecore.EClassifier result_ft109 = null;

			ecore.EClassifier elem_ft109 = null;

			result_ft109 = null;

			{

				kermeta.standard.Iterator<ecore.EClassifier> it_ft109 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EClassifier> convertAsOrderedSet(
								pack.getEClassifiers()).iterator();
				java.lang.Boolean idLoopCond_560 = false;
				while (!idLoopCond_560) {
					idLoopCond_560 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft109.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft109,
													null));
					if (idLoopCond_560) {
					} else {

						elem_ft109 = it_ft109.next();

						java.lang.Boolean idIfCond_561 = false;
						//BIle:detector
						ecore.EClassifier c_lbdExp109 = elem_ft109;

						idIfCond_561 = kermeta.standard.helper.StringWrapper
								.equals(
										c_lbdExp109.getName(),
										set_qname
												.at(kermeta.standard.helper.IntegerWrapper
														.minus(
																set_qname
																		.size(),
																1)));
						//EIle:detector

						if (idIfCond_561) {

							result_ft109 = elem_ft109;
						}

					}
				}
			}

			//CE
			result = result_ft109;
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

		java.lang.Boolean idIfCond_562 = false;
		idIfCond_562 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getEClassifierByQualifiedName("ecore::EObject")));

		if (idIfCond_562) {

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

		java.lang.Boolean idIfCond_563 = false;
		idIfCond_563 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(smContext));

		if (idIfCond_563) {

			simk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));

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
					.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));

			smReturn.setType(op.getType().createBehaviorJava(context));

			java.lang.Boolean idIfCond_564 = false;
			idIfCond_564 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
							.getOperation())).isVoidType(smReturn.getType());

			if (idIfCond_564) {

				smReturn.setType("void");
			}

			staticMethod.setSMReturn(smReturn);

			simk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));

			default_param.setName("self");

			default_param.setType(kermeta.standard.helper.StringWrapper
					.replace(op.getOwningClass().qualifiedName(), context
							.getKERMETA_SEPARATOR(), context
							.getJAVA_SEPARATOR()));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMParameter> convertAsOrderedSet(
							staticMethod.getSMParameters()).add(default_param);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft110 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								op.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_565 = false;
				while (!idLoopCond_565) {
					idLoopCond_565 = it_ft110.isOff();
					if (idLoopCond_565) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp110 = it_ft110
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(simk.SimkPackage.eINSTANCE
										.getSMParameter()));

						param.setName(p_lbdExp110.getName());

						java.lang.Boolean idIfCond_566 = false;
						idIfCond_566 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp110.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_566) {

							param.setType(p_lbdExp110.getType()
									.createBehaviorJava(context));

							java.lang.Boolean idIfCond_567 = false;
							idIfCond_567 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
											.getOperation())).isVoidType(param
									.getType());

							if (idIfCond_567) {

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
				.newObject(ecore.EcorePackage.eINSTANCE.getEAnnotation()));

		ecoreAnnotation.setSource("ModelingUnit");

		ecore.EStringToStringMapEntry requireEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry()));

		requireEntry.setKey("require");

		requireEntry.setValue("");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
						ecoreAnnotation.getDetails()).add(requireEntry);

		ecore.EStringToStringMapEntry usingEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_568 = false;
			while (!idLoopCond_568) {
				idLoopCond_568 = it_ft111.isOff();
				if (idLoopCond_568) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp111 = it_ft111
							.next();

					result.add(p_lbdExp111);

					result.addAll(p_lbdExp111.getAllSubPackages());
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft113 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_569 = false;
			while (!idLoopCond_569) {
				idLoopCond_569 = it_ft113.isOff();
				if (idLoopCond_569) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp113 = it_ft113
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp112 = o_lbdExp113;

					p_lbdExp112.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft114 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_570 = false;
			while (!idLoopCond_570) {
				idLoopCond_570 = it_ft114.isOff();
				if (idLoopCond_570) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp114 = it_ft114
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp112 = p_lbdExp114;

					p_lbdExp112.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft115 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_571 = false;
			while (!idLoopCond_571) {
				idLoopCond_571 = it_ft115.isOff();
				if (idLoopCond_571) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp115 = it_ft115
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp112 = p_lbdExp115;

					p_lbdExp112.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_572 = false;
			while (!idLoopCond_572) {
				idLoopCond_572 = it_ft116.isOff();
				if (idLoopCond_572) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp116 = it_ft116
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp112 = p_lbdExp116;

					p_lbdExp112.applyPass2BehaviorJava(context);
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

		kermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_573 = false;
		idIfCond_573 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_573) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft117 = null;

		kermeta.language.structure.Package elem_ft117 = null;

		result_ft117 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft117 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_574 = false;
			while (!idLoopCond_574) {
				idLoopCond_574 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft117.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft117, null));
				if (idLoopCond_574) {
				} else {

					elem_ft117 = it_ft117.next();

					java.lang.Boolean idIfCond_575 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp117 = elem_ft117;

					idIfCond_575 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp117.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_575) {

						result_ft117 = elem_ft117;
					}

				}
			}
		}

		//CE
		pack = result_ft117;
		//EIft:detect
		;

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_576 = false;
			while (!idLoopCond_576) {
				idLoopCond_576 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_576) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft118 = null;

					kermeta.language.structure.Package elem_ft118 = null;

					result_ft118 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft118 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_577 = false;
						while (!idLoopCond_577) {
							idLoopCond_577 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft118.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft118, null));
							if (idLoopCond_577) {
							} else {

								elem_ft118 = it_ft118.next();

								java.lang.Boolean idIfCond_578 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp118 = elem_ft118;

								idIfCond_578 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp118.getName(),
												set_qname.at(i));
								//EIle:detector

								if (idIfCond_578) {

									result_ft118 = elem_ft118;
								}

							}
						}
					}

					//CE
					pack = result_ft118;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		//BIft:detect

		kermeta.language.structure.TypeDefinition result_ft119 = null;

		kermeta.language.structure.TypeDefinition elem_ft119 = null;

		result_ft119 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft119 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_579 = false;
			while (!idLoopCond_579) {
				idLoopCond_579 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft119.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft119, null));
				if (idLoopCond_579) {
				} else {

					elem_ft119 = it_ft119.next();

					java.lang.Boolean idIfCond_580 = false;
					//BIle:detector
					kermeta.language.structure.TypeDefinition c_lbdExp119 = elem_ft119;

					idIfCond_580 = kermeta.standard.helper.StringWrapper
							.equals(c_lbdExp119.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_580) {

						result_ft119 = elem_ft119;
					}

				}
			}
		}

		//CE
		result = result_ft119;
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
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			return ((InternalEList<?>) getIncludeFilters()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.MODELING_UNIT__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd,
					msgs);
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
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			return getIncludeFilters();
		case StructurePackage.MODELING_UNIT__PACKAGES:
			return getPackages();
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			return getExcludeFilters();
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			return getSuperOperationsToCompileInHelper();
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
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			getIncludeFilters().clear();
			getIncludeFilters().addAll((Collection<? extends Filter>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__PACKAGES:
			getPackages().clear();
			getPackages()
					.addAll(
							(Collection<? extends kermeta.language.structure.Package>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			getExcludeFilters().clear();
			getExcludeFilters().addAll((Collection<? extends Filter>) newValue);
			return;
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			getSuperOperationsToCompileInHelper().clear();
			getSuperOperationsToCompileInHelper().addAll(
					(Collection<? extends Operation>) newValue);
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
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			getIncludeFilters().clear();
			return;
		case StructurePackage.MODELING_UNIT__PACKAGES:
			getPackages().clear();
			return;
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			getExcludeFilters().clear();
			return;
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			getSuperOperationsToCompileInHelper().clear();
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
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			return includeFilters != null && !includeFilters.isEmpty();
		case StructurePackage.MODELING_UNIT__PACKAGES:
			return packages != null && !packages.isEmpty();
		case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
			return excludeFilters != null && !excludeFilters.isEmpty();
		case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
			return superOperationsToCompileInHelper != null
					&& !superOperationsToCompileInHelper.isEmpty();
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
