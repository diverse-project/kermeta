/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnitImpl.java,v 1.8 2008-11-07 08:52:55 cfaucher Exp $
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

		kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_49 = false;
		idIfCond_49 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_49) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft11 = null;

		kermeta.language.structure.Package elem_ft11 = null;

		result_ft11 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft11 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_50 = false;
			while (!idLoopCond_50) {
				idLoopCond_50 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft11.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft11, null));
				if (idLoopCond_50) {
				} else {

					elem_ft11 = it_ft11.next();

					java.lang.Boolean idIfCond_51 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp11 = elem_ft11;

					idIfCond_51 = kermeta.standard.helper.StringWrapper.equals(
							p_lbdExp11.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_51) {

						result_ft11 = elem_ft11;
					}

				}
			}
		}

		//CE
		pack = result_ft11;
		//EIft:detect

		java.lang.Boolean idIfCond_52 = false;
		idIfCond_52 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_52) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_53 = false;
				while (!idLoopCond_53) {
					idLoopCond_53 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, set_qname.size());
					if (idLoopCond_53) {
					} else {

						//BIft:detect

						kermeta.language.structure.Package result_ft12 = null;

						kermeta.language.structure.Package elem_ft12 = null;

						result_ft12 = null;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Package> convertAsOrderedSet(
											pack.getNestedPackage()).iterator();
							java.lang.Boolean idLoopCond_54 = false;
							while (!idLoopCond_54) {
								idLoopCond_54 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft12.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft12,
																null));
								if (idLoopCond_54) {
								} else {

									elem_ft12 = it_ft12.next();

									java.lang.Boolean idIfCond_55 = false;
									//BIle:detector
									kermeta.language.structure.Package p_lbdExp12 = elem_ft12;

									idIfCond_55 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp12.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_55) {

										result_ft12 = elem_ft12;
									}

								}
							}
						}

						//CE
						pack = result_ft12;
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_56 = false;
			while (!idLoopCond_56) {
				idLoopCond_56 = it_ft14.isOff();
				if (idLoopCond_56) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp14 = it_ft14.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp13 = o_lbdExp14;

					p_lbdExp13.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_57 = false;
			while (!idLoopCond_57) {
				idLoopCond_57 = it_ft15.isOff();
				if (idLoopCond_57) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp15 = it_ft15
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp13 = p_lbdExp15;

					p_lbdExp13.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft16 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_58 = false;
			while (!idLoopCond_58) {
				idLoopCond_58 = it_ft16.isOff();
				if (idLoopCond_58) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp16 = it_ft16
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp13 = p_lbdExp16;

					p_lbdExp13.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_59 = false;
			while (!idLoopCond_59) {
				idLoopCond_59 = it_ft17.isOff();
				if (idLoopCond_59) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp17 = it_ft17
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp13 = p_lbdExp17;

					p_lbdExp13.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_60 = false;
			while (!idLoopCond_60) {
				idLoopCond_60 = it_ft18.isOff();
				if (idLoopCond_60) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp18 = it_ft18
							.next();

					kermeta.standard.Sequence<ecore.EPackage> eps = null;
					//BIft:select

					kermeta.standard.Sequence<ecore.EPackage> result_ft19 = null;

					ecore.EPackage elem_ft19 = null;

					result_ft19 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.standard.Sequence<ecore.EPackage>"));

					{

						kermeta.standard.Iterator<ecore.EPackage> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EPackage> convertAsOrderedSet(
										this.getEcorePackages()).iterator();
						java.lang.Boolean idLoopCond_61 = false;
						while (!idLoopCond_61) {
							idLoopCond_61 = it_ft19.isOff();
							if (idLoopCond_61) {
							} else {

								elem_ft19 = it_ft19.next();

								java.lang.Boolean idIfCond_62 = false;
								//BIle:selector
								ecore.EPackage ep_lbdExp19 = elem_ft19;

								idIfCond_62 = kermeta.standard.helper.StringWrapper
										.equals(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp18
																.getName()),
												kermeta.standard.helper.StringWrapper
														.toLowerCase(ep_lbdExp19
																.getName()));
								//EIle:selector

								if (idIfCond_62) {

									result_ft19.add(elem_ft19);
								}

							}
						}
					}

					//CE
					eps = result_ft19;
					//EIft:select

					java.lang.Boolean idIfCond_63 = false;
					idIfCond_63 = kermeta.standard.helper.IntegerWrapper
							.isGreater(eps.size(), 0);

					if (idIfCond_63) {

						java.lang.Boolean idIfCond_64 = false;
						idIfCond_64 = kermeta.standard.helper.IntegerWrapper
								.equals(eps.size(), 1);

						if (idIfCond_64) {

							//BIft:detect

							kermeta.language.structure.Package result_ft20 = null;

							kermeta.language.structure.Package elem_ft20 = null;

							result_ft20 = null;

							{

								kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Package> convertAsOrderedSet(
												this.getPackages()).iterator();
								java.lang.Boolean idLoopCond_65 = false;
								while (!idLoopCond_65) {
									idLoopCond_65 = kermeta.standard.helper.BooleanWrapper
											.or(
													it_ft20.isOff(),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isNotEqualSwitcher(
																	result_ft20,
																	null));
									if (idLoopCond_65) {
									} else {

										elem_ft20 = it_ft20.next();

										java.lang.Boolean idIfCond_66 = false;
										//BIle:detector
										kermeta.language.structure.Package pack_lbdExp20 = elem_ft20;

										idIfCond_66 = kermeta.standard.helper.StringWrapper
												.equals(
														kermeta.standard.helper.StringWrapper
																.toLowerCase(pack_lbdExp20
																		.getName()),
														kermeta.standard.helper.StringWrapper
																.toLowerCase(p_lbdExp18
																		.getName()));
										//EIle:detector

										if (idIfCond_66) {

											result_ft20 = elem_ft20;
										}

									}
								}
							}

							//EIft:detect
							result_ft20
									.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.toLowerCase(p_lbdExp18
																	.getName()),
													"0"));
						}

						p_lbdExp18
								.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp18
																.getName()),
												kermeta.standard.helper.IntegerWrapper
														.toString(eps.size())));
					}

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EPackage> convertAsOrderedSet(
									this.getEcorePackages()).add(
									p_lbdExp18.getEcoreModelElement());
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

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							this.getSuperOperationsToCompileInHelper())
					.iterator();
			java.lang.Boolean idLoopCond_67 = false;
			while (!idLoopCond_67) {
				idLoopCond_67 = it_ft21.isOff();
				if (idLoopCond_67) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation op_lbdExp21 = it_ft21
							.next();

					java.lang.Boolean staticOperationMode_backup = context
							.getStaticOperationMode();

					context.setStaticOperationMode(true);

					this.compileStaticOperation(op_lbdExp21, context);

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

		java.lang.Boolean idIfCond_68 = false;
		idIfCond_68 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_68) {

			set_qname.add(qname);
		}

		ecore.EPackage pack = null;
		//BIft:detect

		ecore.EPackage result_ft22 = null;

		ecore.EPackage elem_ft22 = null;

		result_ft22 = null;

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getEcorePackages()).iterator();
			java.lang.Boolean idLoopCond_69 = false;
			while (!idLoopCond_69) {
				idLoopCond_69 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft22.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft22, null));
				if (idLoopCond_69) {
				} else {

					elem_ft22 = it_ft22.next();

					java.lang.Boolean idIfCond_70 = false;
					//BIle:detector
					ecore.EPackage p_lbdExp22 = elem_ft22;

					idIfCond_70 = kermeta.standard.helper.StringWrapper.equals(
							p_lbdExp22.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_70) {

						result_ft22 = elem_ft22;
					}

				}
			}
		}

		//CE
		pack = result_ft22;
		//EIft:detect

		java.lang.Boolean idIfCond_71 = false;
		idIfCond_71 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_71) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_72 = false;
				while (!idLoopCond_72) {
					idLoopCond_72 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1));
					if (idLoopCond_72) {
					} else {

						//BIft:detect

						ecore.EPackage result_ft23 = null;

						ecore.EPackage elem_ft23 = null;

						result_ft23 = null;

						{

							kermeta.standard.Iterator<ecore.EPackage> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EPackage> convertAsOrderedSet(
											pack.getESubpackages()).iterator();
							java.lang.Boolean idLoopCond_73 = false;
							while (!idLoopCond_73) {
								idLoopCond_73 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft23.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft23,
																null));
								if (idLoopCond_73) {
								} else {

									elem_ft23 = it_ft23.next();

									java.lang.Boolean idIfCond_74 = false;
									//BIle:detector
									ecore.EPackage p_lbdExp23 = elem_ft23;

									idIfCond_74 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp23.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_74) {

										result_ft23 = elem_ft23;
									}

								}
							}
						}

						//CE
						pack = result_ft23;
						//EIft:detect

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

			//BIft:detect

			ecore.EClassifier result_ft24 = null;

			ecore.EClassifier elem_ft24 = null;

			result_ft24 = null;

			{

				kermeta.standard.Iterator<ecore.EClassifier> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EClassifier> convertAsOrderedSet(
								pack.getEClassifiers()).iterator();
				java.lang.Boolean idLoopCond_75 = false;
				while (!idLoopCond_75) {
					idLoopCond_75 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft24.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft24,
													null));
					if (idLoopCond_75) {
					} else {

						elem_ft24 = it_ft24.next();

						java.lang.Boolean idIfCond_76 = false;
						//BIle:detector
						ecore.EClassifier c_lbdExp24 = elem_ft24;

						idIfCond_76 = kermeta.standard.helper.StringWrapper
								.equals(
										c_lbdExp24.getName(),
										set_qname
												.at(kermeta.standard.helper.IntegerWrapper
														.minus(
																set_qname
																		.size(),
																1)));
						//EIle:detector

						if (idIfCond_76) {

							result_ft24 = elem_ft24;
						}

					}
				}
			}

			//CE
			result = result_ft24;
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

		java.lang.Boolean idIfCond_77 = false;
		idIfCond_77 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getEClassifierByQualifiedName("ecore::EObject")));

		if (idIfCond_77) {

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

		java.lang.Boolean idIfCond_78 = false;
		idIfCond_78 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(smContext));

		if (idIfCond_78) {

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

			java.lang.Boolean idIfCond_79 = false;
			idIfCond_79 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(smReturn.getType());

			if (idIfCond_79) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								op.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_80 = false;
				while (!idLoopCond_80) {
					idLoopCond_80 = it_ft25.isOff();
					if (idLoopCond_80) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp25 = it_ft25
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("simk.SMParameter"));

						param.setName(p_lbdExp25.getName());

						java.lang.Boolean idIfCond_81 = false;
						idIfCond_81 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp25.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_81) {

							param.setType(p_lbdExp25.getType()
									.createBehaviorJava(context));

							java.lang.Boolean idIfCond_82 = false;
							idIfCond_82 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("kermeta.language.structure.Operation"))
									.isVoidType(param.getType());

							if (idIfCond_82) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_83 = false;
			while (!idLoopCond_83) {
				idLoopCond_83 = it_ft26.isOff();
				if (idLoopCond_83) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp26 = it_ft26
							.next();

					result.add(p_lbdExp26);

					result.addAll(p_lbdExp26.getAllSubPackages());
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
	public TypeDefinition getTypeDefinitionByQualifiedName(String qname) {

		kermeta.language.structure.TypeDefinition result = null;

		kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_84 = false;
		idIfCond_84 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_84) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft27 = null;

		kermeta.language.structure.Package elem_ft27 = null;

		result_ft27 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft27 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_85 = false;
			while (!idLoopCond_85) {
				idLoopCond_85 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft27.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft27, null));
				if (idLoopCond_85) {
				} else {

					elem_ft27 = it_ft27.next();

					java.lang.Boolean idIfCond_86 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp27 = elem_ft27;

					idIfCond_86 = kermeta.standard.helper.StringWrapper.equals(
							p_lbdExp27.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_86) {

						result_ft27 = elem_ft27;
					}

				}
			}
		}

		//CE
		pack = result_ft27;
		//EIft:detect

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_87 = false;
			while (!idLoopCond_87) {
				idLoopCond_87 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_87) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft28 = null;

					kermeta.language.structure.Package elem_ft28 = null;

					result_ft28 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft28 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_88 = false;
						while (!idLoopCond_88) {
							idLoopCond_88 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft28.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft28, null));
							if (idLoopCond_88) {
							} else {

								elem_ft28 = it_ft28.next();

								java.lang.Boolean idIfCond_89 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp28 = elem_ft28;

								idIfCond_89 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp28.getName(), set_qname
												.at(i));
								//EIle:detector

								if (idIfCond_89) {

									result_ft28 = elem_ft28;
								}

							}
						}
					}

					//CE
					pack = result_ft28;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		//BIft:detect

		kermeta.language.structure.TypeDefinition result_ft29 = null;

		kermeta.language.structure.TypeDefinition elem_ft29 = null;

		result_ft29 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft29 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_90 = false;
			while (!idLoopCond_90) {
				idLoopCond_90 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft29.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft29, null));
				if (idLoopCond_90) {
				} else {

					elem_ft29 = it_ft29.next();

					java.lang.Boolean idIfCond_91 = false;
					//BIle:detector
					kermeta.language.structure.TypeDefinition c_lbdExp29 = elem_ft29;

					idIfCond_91 = kermeta.standard.helper.StringWrapper.equals(
							c_lbdExp29.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_91) {

						result_ft29 = elem_ft29;
					}

				}
			}
		}

		//CE
		result = result_ft29;
		//EIft:detect

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft31 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_92 = false;
			while (!idLoopCond_92) {
				idLoopCond_92 = it_ft31.isOff();
				if (idLoopCond_92) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp31 = it_ft31.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp30 = o_lbdExp31;

					p_lbdExp30.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft32 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_93 = false;
			while (!idLoopCond_93) {
				idLoopCond_93 = it_ft32.isOff();
				if (idLoopCond_93) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp32 = it_ft32
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp30 = p_lbdExp32;

					p_lbdExp30.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_94 = false;
			while (!idLoopCond_94) {
				idLoopCond_94 = it_ft33.isOff();
				if (idLoopCond_94) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp33 = it_ft33
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp30 = p_lbdExp33;

					p_lbdExp30.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft34 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_95 = false;
			while (!idLoopCond_95) {
				idLoopCond_95 = it_ft34.isOff();
				if (idLoopCond_95) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp34 = it_ft34
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp30 = p_lbdExp34;

					p_lbdExp30.applyPass2BehaviorJava(context);
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
