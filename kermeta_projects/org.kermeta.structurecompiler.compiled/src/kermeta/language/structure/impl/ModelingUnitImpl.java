/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ModelingUnitImpl.java,v 1.12 2009-02-23 15:26:40 cfaucher Exp $
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

		kermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_100 = false;
		idIfCond_100 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_100) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft32 = null;

		kermeta.language.structure.Package elem_ft32 = null;

		result_ft32 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft32 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_101 = false;
			while (!idLoopCond_101) {
				idLoopCond_101 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft32.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft32, null));
				if (idLoopCond_101) {
				} else {

					elem_ft32 = it_ft32.next();

					java.lang.Boolean idIfCond_102 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp32 = elem_ft32;

					idIfCond_102 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp32.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_102) {

						result_ft32 = elem_ft32;
					}

				}
			}
		}

		//CE
		pack = result_ft32;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_103 = false;
		idIfCond_103 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_103) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_104 = false;
				while (!idLoopCond_104) {
					idLoopCond_104 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, set_qname.size());
					if (idLoopCond_104) {
					} else {

						//BIft:detect

						kermeta.language.structure.Package result_ft33 = null;

						kermeta.language.structure.Package elem_ft33 = null;

						result_ft33 = null;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Package> convertAsOrderedSet(
											pack.getNestedPackage()).iterator();
							java.lang.Boolean idLoopCond_105 = false;
							while (!idLoopCond_105) {
								idLoopCond_105 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft33.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft33,
																null));
								if (idLoopCond_105) {
								} else {

									elem_ft33 = it_ft33.next();

									java.lang.Boolean idIfCond_106 = false;
									//BIle:detector
									kermeta.language.structure.Package p_lbdExp33 = elem_ft33;

									idIfCond_106 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp33.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_106) {

										result_ft33 = elem_ft33;
									}

								}
							}
						}

						//CE
						pack = result_ft33;
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft35 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_107 = false;
			while (!idLoopCond_107) {
				idLoopCond_107 = it_ft35.isOff();
				if (idLoopCond_107) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp35 = it_ft35.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp34 = o_lbdExp35;

					p_lbdExp34.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft36 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_108 = false;
			while (!idLoopCond_108) {
				idLoopCond_108 = it_ft36.isOff();
				if (idLoopCond_108) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp36 = it_ft36
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp34 = p_lbdExp36;

					p_lbdExp34.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft37 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_109 = false;
			while (!idLoopCond_109) {
				idLoopCond_109 = it_ft37.isOff();
				if (idLoopCond_109) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp37 = it_ft37
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp34 = p_lbdExp37;

					p_lbdExp34.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_110 = false;
			while (!idLoopCond_110) {
				idLoopCond_110 = it_ft38.isOff();
				if (idLoopCond_110) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp38 = it_ft38
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp34 = p_lbdExp38;

					p_lbdExp34.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_111 = false;
			while (!idLoopCond_111) {
				idLoopCond_111 = it_ft39.isOff();
				if (idLoopCond_111) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp39 = it_ft39
							.next();

					kermeta.standard.Sequence<ecore.EPackage> eps = null;
					//BIft:select

					kermeta.standard.Sequence<ecore.EPackage> result_ft40 = null;

					ecore.EPackage elem_ft40 = null;

					result_ft40 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<ecore.EPackage> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EPackage> convertAsOrderedSet(
										this.getEcorePackages()).iterator();
						java.lang.Boolean idLoopCond_112 = false;
						while (!idLoopCond_112) {
							idLoopCond_112 = it_ft40.isOff();
							if (idLoopCond_112) {
							} else {

								elem_ft40 = it_ft40.next();

								java.lang.Boolean idIfCond_113 = false;
								//BIle:selector
								ecore.EPackage ep_lbdExp40 = elem_ft40;

								idIfCond_113 = kermeta.standard.helper.StringWrapper
										.equals(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp39
																.getName()),
												kermeta.standard.helper.StringWrapper
														.toLowerCase(ep_lbdExp40
																.getName()));
								//EIle:selector

								if (idIfCond_113) {

									result_ft40.add(elem_ft40);
								}

							}
						}
					}

					//CE
					eps = result_ft40;
					//EIft:select
					;

					java.lang.Boolean idIfCond_114 = false;
					idIfCond_114 = kermeta.standard.helper.IntegerWrapper
							.isGreater(eps.size(), 0);

					if (idIfCond_114) {

						java.lang.Boolean idIfCond_115 = false;
						idIfCond_115 = kermeta.standard.helper.IntegerWrapper
								.equals(eps.size(), 1);

						if (idIfCond_115) {

							//BIft:detect

							kermeta.language.structure.Package result_ft41 = null;

							kermeta.language.structure.Package elem_ft41 = null;

							result_ft41 = null;

							{

								kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Package> convertAsOrderedSet(
												this.getPackages()).iterator();
								java.lang.Boolean idLoopCond_116 = false;
								while (!idLoopCond_116) {
									idLoopCond_116 = kermeta.standard.helper.BooleanWrapper
											.or(
													it_ft41.isOff(),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isNotEqualSwitcher(
																	result_ft41,
																	null));
									if (idLoopCond_116) {
									} else {

										elem_ft41 = it_ft41.next();

										java.lang.Boolean idIfCond_117 = false;
										//BIle:detector
										kermeta.language.structure.Package pack_lbdExp41 = elem_ft41;

										idIfCond_117 = kermeta.standard.helper.StringWrapper
												.equals(
														kermeta.standard.helper.StringWrapper
																.toLowerCase(pack_lbdExp41
																		.getName()),
														kermeta.standard.helper.StringWrapper
																.toLowerCase(p_lbdExp39
																		.getName()));
										//EIle:detector

										if (idIfCond_117) {

											result_ft41 = elem_ft41;
										}

									}
								}
							}

							//EIft:detect
							result_ft41
									.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.toLowerCase(p_lbdExp39
																	.getName()),
													"0"));
						}

						p_lbdExp39
								.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp39
																.getName()),
												kermeta.standard.helper.IntegerWrapper
														.toString(eps.size())));
					}

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EPackage> convertAsOrderedSet(
									this.getEcorePackages()).add(
									p_lbdExp39.getEcoreModelElement());
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

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							this.getSuperOperationsToCompileInHelper())
					.iterator();
			java.lang.Boolean idLoopCond_118 = false;
			while (!idLoopCond_118) {
				idLoopCond_118 = it_ft42.isOff();
				if (idLoopCond_118) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation op_lbdExp42 = it_ft42
							.next();

					java.lang.Boolean staticOperationMode_backup = context
							.getStaticOperationMode();

					context.setStaticOperationMode(true);

					this.compileStaticOperation(op_lbdExp42, context);

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

		java.lang.Boolean idIfCond_119 = false;
		idIfCond_119 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_119) {

			set_qname.add(qname);
		}

		ecore.EPackage pack = null;
		//BIft:detect

		ecore.EPackage result_ft43 = null;

		ecore.EPackage elem_ft43 = null;

		result_ft43 = null;

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getEcorePackages()).iterator();
			java.lang.Boolean idLoopCond_120 = false;
			while (!idLoopCond_120) {
				idLoopCond_120 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft43.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft43, null));
				if (idLoopCond_120) {
				} else {

					elem_ft43 = it_ft43.next();

					java.lang.Boolean idIfCond_121 = false;
					//BIle:detector
					ecore.EPackage p_lbdExp43 = elem_ft43;

					idIfCond_121 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp43.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_121) {

						result_ft43 = elem_ft43;
					}

				}
			}
		}

		//CE
		pack = result_ft43;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_122 = false;
		idIfCond_122 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_122) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_123 = false;
				while (!idLoopCond_123) {
					idLoopCond_123 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1));
					if (idLoopCond_123) {
					} else {

						//BIft:detect

						ecore.EPackage result_ft44 = null;

						ecore.EPackage elem_ft44 = null;

						result_ft44 = null;

						{

							kermeta.standard.Iterator<ecore.EPackage> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EPackage> convertAsOrderedSet(
											pack.getESubpackages()).iterator();
							java.lang.Boolean idLoopCond_124 = false;
							while (!idLoopCond_124) {
								idLoopCond_124 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft44.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft44,
																null));
								if (idLoopCond_124) {
								} else {

									elem_ft44 = it_ft44.next();

									java.lang.Boolean idIfCond_125 = false;
									//BIle:detector
									ecore.EPackage p_lbdExp44 = elem_ft44;

									idIfCond_125 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp44.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_125) {

										result_ft44 = elem_ft44;
									}

								}
							}
						}

						//CE
						pack = result_ft44;
						//EIft:detect

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

			//BIft:detect

			ecore.EClassifier result_ft45 = null;

			ecore.EClassifier elem_ft45 = null;

			result_ft45 = null;

			{

				kermeta.standard.Iterator<ecore.EClassifier> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EClassifier> convertAsOrderedSet(
								pack.getEClassifiers()).iterator();
				java.lang.Boolean idLoopCond_126 = false;
				while (!idLoopCond_126) {
					idLoopCond_126 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft45.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft45,
													null));
					if (idLoopCond_126) {
					} else {

						elem_ft45 = it_ft45.next();

						java.lang.Boolean idIfCond_127 = false;
						//BIle:detector
						ecore.EClassifier c_lbdExp45 = elem_ft45;

						idIfCond_127 = kermeta.standard.helper.StringWrapper
								.equals(
										c_lbdExp45.getName(),
										set_qname
												.at(kermeta.standard.helper.IntegerWrapper
														.minus(
																set_qname
																		.size(),
																1)));
						//EIle:detector

						if (idIfCond_127) {

							result_ft45 = elem_ft45;
						}

					}
				}
			}

			//CE
			result = result_ft45;
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

		java.lang.Boolean idIfCond_82 = false;
		idIfCond_82 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEClassifierByQualifiedName("ecore::EObject")));

		if( idIfCond_82 ) {

		//BIft:each

		
	{

		kermeta.standard.Iterator<ecore.EOperation> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEClassifierByQualifiedName("ecore::EObject"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("ecore.EClass"))).getEOperations()).iterator();
		java.lang.Boolean idLoopCond_83 = false;
		while( !idLoopCond_83 ) {
		idLoopCond_83 = it_ft26.isOff();
		if ( idLoopCond_83 ) {
		} else {

		//BIle:func
	ecore.EOperation op_lbdExp26 = it_ft26.next();

		java.lang.Boolean idIfCond_84 = false;
		idIfCond_84 = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).isFromAnEcoreMetamodel(op_lbdExp26);

		if( idIfCond_84 ) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEClassifierByQualifiedName("ecore::EObject"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("ecore.EClass"))).getEOperations()).remove(op_lbdExp26);
	}

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

		java.lang.Boolean idIfCond_129 = false;
		idIfCond_129 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(smContext));

		if (idIfCond_129) {

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

			java.lang.Boolean idIfCond_130 = false;
			idIfCond_130 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
							.getOperation())).isVoidType(smReturn.getType());

			if (idIfCond_130) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								op.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_131 = false;
				while (!idLoopCond_131) {
					idLoopCond_131 = it_ft46.isOff();
					if (idLoopCond_131) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp46 = it_ft46
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(simk.SimkPackage.eINSTANCE
										.getSMParameter()));

						param.setName(p_lbdExp46.getName());

						java.lang.Boolean idIfCond_132 = false;
						idIfCond_132 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp46.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_132) {

							param.setType(p_lbdExp46.getType()
									.createBehaviorJava(context));

							java.lang.Boolean idIfCond_133 = false;
							idIfCond_133 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
											.getOperation())).isVoidType(param
									.getType());

							if (idIfCond_133) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_134 = false;
			while (!idLoopCond_134) {
				idLoopCond_134 = it_ft47.isOff();
				if (idLoopCond_134) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp47 = it_ft47
							.next();

					result.add(p_lbdExp47);

					result.addAll(p_lbdExp47.getAllSubPackages());
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_135 = false;
			while (!idLoopCond_135) {
				idLoopCond_135 = it_ft49.isOff();
				if (idLoopCond_135) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp49 = it_ft49.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp48 = o_lbdExp49;

					p_lbdExp48.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_136 = false;
			while (!idLoopCond_136) {
				idLoopCond_136 = it_ft50.isOff();
				if (idLoopCond_136) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp50 = it_ft50
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp48 = p_lbdExp50;

					p_lbdExp48.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_137 = false;
			while (!idLoopCond_137) {
				idLoopCond_137 = it_ft51.isOff();
				if (idLoopCond_137) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp51 = it_ft51
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp48 = p_lbdExp51;

					p_lbdExp48.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_138 = false;
			while (!idLoopCond_138) {
				idLoopCond_138 = it_ft52.isOff();
				if (idLoopCond_138) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp52 = it_ft52
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp48 = p_lbdExp52;

					p_lbdExp48.applyPass2BehaviorJava(context);
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

		java.lang.Boolean idIfCond_139 = false;
		idIfCond_139 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_139) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft53 = null;

		kermeta.language.structure.Package elem_ft53 = null;

		result_ft53 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_140 = false;
			while (!idLoopCond_140) {
				idLoopCond_140 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft53.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft53, null));
				if (idLoopCond_140) {
				} else {

					elem_ft53 = it_ft53.next();

					java.lang.Boolean idIfCond_141 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp53 = elem_ft53;

					idIfCond_141 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp53.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_141) {

						result_ft53 = elem_ft53;
					}

				}
			}
		}

		//CE
		pack = result_ft53;
		//EIft:detect
		;

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_142 = false;
			while (!idLoopCond_142) {
				idLoopCond_142 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_142) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft54 = null;

					kermeta.language.structure.Package elem_ft54 = null;

					result_ft54 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_143 = false;
						while (!idLoopCond_143) {
							idLoopCond_143 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft54.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft54, null));
							if (idLoopCond_143) {
							} else {

								elem_ft54 = it_ft54.next();

								java.lang.Boolean idIfCond_144 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp54 = elem_ft54;

								idIfCond_144 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp54.getName(), set_qname
												.at(i));
								//EIle:detector

								if (idIfCond_144) {

									result_ft54 = elem_ft54;
								}

							}
						}
					}

					//CE
					pack = result_ft54;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		//BIft:detect

		kermeta.language.structure.TypeDefinition result_ft55 = null;

		kermeta.language.structure.TypeDefinition elem_ft55 = null;

		result_ft55 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_145 = false;
			while (!idLoopCond_145) {
				idLoopCond_145 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft55.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft55, null));
				if (idLoopCond_145) {
				} else {

					elem_ft55 = it_ft55.next();

					java.lang.Boolean idIfCond_146 = false;
					//BIle:detector
					kermeta.language.structure.TypeDefinition c_lbdExp55 = elem_ft55;

					idIfCond_146 = kermeta.standard.helper.StringWrapper
							.equals(c_lbdExp55.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_146) {

						result_ft55 = elem_ft55;
					}

				}
			}
		}

		//CE
		result = result_ft55;
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
