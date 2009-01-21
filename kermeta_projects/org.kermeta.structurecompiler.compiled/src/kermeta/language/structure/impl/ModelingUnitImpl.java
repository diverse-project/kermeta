/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnitImpl.java,v 1.10 2009-01-21 09:15:51 cfaucher Exp $
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

		java.lang.Boolean idIfCond_43 = false;
		idIfCond_43 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_43) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft14 = null;

		kermeta.language.structure.Package elem_ft14 = null;

		result_ft14 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_44 = false;
			while (!idLoopCond_44) {
				idLoopCond_44 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft14.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft14, null));
				if (idLoopCond_44) {
				} else {

					elem_ft14 = it_ft14.next();

					java.lang.Boolean idIfCond_45 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp14 = elem_ft14;

					idIfCond_45 = kermeta.standard.helper.StringWrapper.equals(
							p_lbdExp14.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_45) {

						result_ft14 = elem_ft14;
					}

				}
			}
		}

		//CE
		pack = result_ft14;
		//EIft:detect

		java.lang.Boolean idIfCond_46 = false;
		idIfCond_46 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_46) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_47 = false;
				while (!idLoopCond_47) {
					idLoopCond_47 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, set_qname.size());
					if (idLoopCond_47) {
					} else {

						//BIft:detect

						kermeta.language.structure.Package result_ft15 = null;

						kermeta.language.structure.Package elem_ft15 = null;

						result_ft15 = null;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Package> convertAsOrderedSet(
											pack.getNestedPackage()).iterator();
							java.lang.Boolean idLoopCond_48 = false;
							while (!idLoopCond_48) {
								idLoopCond_48 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft15.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft15,
																null));
								if (idLoopCond_48) {
								} else {

									elem_ft15 = it_ft15.next();

									java.lang.Boolean idIfCond_49 = false;
									//BIle:detector
									kermeta.language.structure.Package p_lbdExp15 = elem_ft15;

									idIfCond_49 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp15.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_49) {

										result_ft15 = elem_ft15;
									}

								}
							}
						}

						//CE
						pack = result_ft15;
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_50 = false;
			while (!idLoopCond_50) {
				idLoopCond_50 = it_ft17.isOff();
				if (idLoopCond_50) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp17 = it_ft17.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp16 = o_lbdExp17;

					p_lbdExp16.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_51 = false;
			while (!idLoopCond_51) {
				idLoopCond_51 = it_ft18.isOff();
				if (idLoopCond_51) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp18 = it_ft18
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp16 = p_lbdExp18;

					p_lbdExp16.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_52 = false;
			while (!idLoopCond_52) {
				idLoopCond_52 = it_ft19.isOff();
				if (idLoopCond_52) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp19 = it_ft19
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp16 = p_lbdExp19;

					p_lbdExp16.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_53 = false;
			while (!idLoopCond_53) {
				idLoopCond_53 = it_ft20.isOff();
				if (idLoopCond_53) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp20 = it_ft20
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp16 = p_lbdExp20;

					p_lbdExp16.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_54 = false;
			while (!idLoopCond_54) {
				idLoopCond_54 = it_ft21.isOff();
				if (idLoopCond_54) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp21 = it_ft21
							.next();

					kermeta.standard.Sequence<ecore.EPackage> eps = null;
					//BIft:select

					kermeta.standard.Sequence<ecore.EPackage> result_ft22 = null;

					ecore.EPackage elem_ft22 = null;

					result_ft22 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<ecore.EPackage> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EPackage> convertAsOrderedSet(
										this.getEcorePackages()).iterator();
						java.lang.Boolean idLoopCond_55 = false;
						while (!idLoopCond_55) {
							idLoopCond_55 = it_ft22.isOff();
							if (idLoopCond_55) {
							} else {

								elem_ft22 = it_ft22.next();

								java.lang.Boolean idIfCond_56 = false;
								//BIle:selector
								ecore.EPackage ep_lbdExp22 = elem_ft22;

								idIfCond_56 = kermeta.standard.helper.StringWrapper
										.equals(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp21
																.getName()),
												kermeta.standard.helper.StringWrapper
														.toLowerCase(ep_lbdExp22
																.getName()));
								//EIle:selector

								if (idIfCond_56) {

									result_ft22.add(elem_ft22);
								}

							}
						}
					}

					//CE
					eps = result_ft22;
					//EIft:select

					java.lang.Boolean idIfCond_57 = false;
					idIfCond_57 = kermeta.standard.helper.IntegerWrapper
							.isGreater(eps.size(), 0);

					if (idIfCond_57) {

						java.lang.Boolean idIfCond_58 = false;
						idIfCond_58 = kermeta.standard.helper.IntegerWrapper
								.equals(eps.size(), 1);

						if (idIfCond_58) {

							//BIft:detect

							kermeta.language.structure.Package result_ft23 = null;

							kermeta.language.structure.Package elem_ft23 = null;

							result_ft23 = null;

							{

								kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Package> convertAsOrderedSet(
												this.getPackages()).iterator();
								java.lang.Boolean idLoopCond_59 = false;
								while (!idLoopCond_59) {
									idLoopCond_59 = kermeta.standard.helper.BooleanWrapper
											.or(
													it_ft23.isOff(),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isNotEqualSwitcher(
																	result_ft23,
																	null));
									if (idLoopCond_59) {
									} else {

										elem_ft23 = it_ft23.next();

										java.lang.Boolean idIfCond_60 = false;
										//BIle:detector
										kermeta.language.structure.Package pack_lbdExp23 = elem_ft23;

										idIfCond_60 = kermeta.standard.helper.StringWrapper
												.equals(
														kermeta.standard.helper.StringWrapper
																.toLowerCase(pack_lbdExp23
																		.getName()),
														kermeta.standard.helper.StringWrapper
																.toLowerCase(p_lbdExp21
																		.getName()));
										//EIle:detector

										if (idIfCond_60) {

											result_ft23 = elem_ft23;
										}

									}
								}
							}

							//EIft:detect
							result_ft23
									.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.toLowerCase(p_lbdExp21
																	.getName()),
													"0"));
						}

						p_lbdExp21
								.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp21
																.getName()),
												kermeta.standard.helper.IntegerWrapper
														.toString(eps.size())));
					}

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EPackage> convertAsOrderedSet(
									this.getEcorePackages()).add(
									p_lbdExp21.getEcoreModelElement());
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

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							this.getSuperOperationsToCompileInHelper())
					.iterator();
			java.lang.Boolean idLoopCond_61 = false;
			while (!idLoopCond_61) {
				idLoopCond_61 = it_ft24.isOff();
				if (idLoopCond_61) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation op_lbdExp24 = it_ft24
							.next();

					java.lang.Boolean staticOperationMode_backup = context
							.getStaticOperationMode();

					context.setStaticOperationMode(true);

					this.compileStaticOperation(op_lbdExp24, context);

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

		java.lang.Boolean idIfCond_62 = false;
		idIfCond_62 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_62) {

			set_qname.add(qname);
		}

		ecore.EPackage pack = null;
		//BIft:detect

		ecore.EPackage result_ft25 = null;

		ecore.EPackage elem_ft25 = null;

		result_ft25 = null;

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getEcorePackages()).iterator();
			java.lang.Boolean idLoopCond_63 = false;
			while (!idLoopCond_63) {
				idLoopCond_63 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft25.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft25, null));
				if (idLoopCond_63) {
				} else {

					elem_ft25 = it_ft25.next();

					java.lang.Boolean idIfCond_64 = false;
					//BIle:detector
					ecore.EPackage p_lbdExp25 = elem_ft25;

					idIfCond_64 = kermeta.standard.helper.StringWrapper.equals(
							p_lbdExp25.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_64) {

						result_ft25 = elem_ft25;
					}

				}
			}
		}

		//CE
		pack = result_ft25;
		//EIft:detect

		java.lang.Boolean idIfCond_65 = false;
		idIfCond_65 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(pack));

		if (idIfCond_65) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_66 = false;
				while (!idLoopCond_66) {
					idLoopCond_66 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1));
					if (idLoopCond_66) {
					} else {

						//BIft:detect

						ecore.EPackage result_ft26 = null;

						ecore.EPackage elem_ft26 = null;

						result_ft26 = null;

						{

							kermeta.standard.Iterator<ecore.EPackage> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EPackage> convertAsOrderedSet(
											pack.getESubpackages()).iterator();
							java.lang.Boolean idLoopCond_67 = false;
							while (!idLoopCond_67) {
								idLoopCond_67 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft26.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																result_ft26,
																null));
								if (idLoopCond_67) {
								} else {

									elem_ft26 = it_ft26.next();

									java.lang.Boolean idIfCond_68 = false;
									//BIle:detector
									ecore.EPackage p_lbdExp26 = elem_ft26;

									idIfCond_68 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp26.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_68) {

										result_ft26 = elem_ft26;
									}

								}
							}
						}

						//CE
						pack = result_ft26;
						//EIft:detect

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

			//BIft:detect

			ecore.EClassifier result_ft27 = null;

			ecore.EClassifier elem_ft27 = null;

			result_ft27 = null;

			{

				kermeta.standard.Iterator<ecore.EClassifier> it_ft27 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EClassifier> convertAsOrderedSet(
								pack.getEClassifiers()).iterator();
				java.lang.Boolean idLoopCond_69 = false;
				while (!idLoopCond_69) {
					idLoopCond_69 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft27.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft27,
													null));
					if (idLoopCond_69) {
					} else {

						elem_ft27 = it_ft27.next();

						java.lang.Boolean idIfCond_70 = false;
						//BIle:detector
						ecore.EClassifier c_lbdExp27 = elem_ft27;

						idIfCond_70 = kermeta.standard.helper.StringWrapper
								.equals(
										c_lbdExp27.getName(),
										set_qname
												.at(kermeta.standard.helper.IntegerWrapper
														.minus(
																set_qname
																		.size(),
																1)));
						//EIle:detector

						if (idIfCond_70) {

							result_ft27 = elem_ft27;
						}

					}
				}
			}

			//CE
			result = result_ft27;
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

		java.lang.Boolean idIfCond_71 = false;
		idIfCond_71 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getEClassifierByQualifiedName("ecore::EObject")));

		if (idIfCond_71) {

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

		java.lang.Boolean idIfCond_72 = false;
		idIfCond_72 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(smContext));

		if (idIfCond_72) {

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

			java.lang.Boolean idIfCond_73 = false;
			idIfCond_73 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
							.getOperation())).isVoidType(smReturn.getType());

			if (idIfCond_73) {

				smReturn.setType("void");
			}

			staticMethod.setSMReturn(smReturn);

			simk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));

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

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft28 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								op.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_74 = false;
				while (!idLoopCond_74) {
					idLoopCond_74 = it_ft28.isOff();
					if (idLoopCond_74) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp28 = it_ft28
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(simk.SimkPackage.eINSTANCE
										.getSMParameter()));

						param.setName(p_lbdExp28.getName());

						java.lang.Boolean idIfCond_75 = false;
						idIfCond_75 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp28.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_75) {

							param.setType(p_lbdExp28.getType()
									.createBehaviorJava(context));

							java.lang.Boolean idIfCond_76 = false;
							idIfCond_76 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
											.getOperation())).isVoidType(param
									.getType());

							if (idIfCond_76) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft29 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_77 = false;
			while (!idLoopCond_77) {
				idLoopCond_77 = it_ft29.isOff();
				if (idLoopCond_77) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp29 = it_ft29
							.next();

					result.add(p_lbdExp29);

					result.addAll(p_lbdExp29.getAllSubPackages());
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft31 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_78 = false;
			while (!idLoopCond_78) {
				idLoopCond_78 = it_ft31.isOff();
				if (idLoopCond_78) {
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
			java.lang.Boolean idLoopCond_79 = false;
			while (!idLoopCond_79) {
				idLoopCond_79 = it_ft32.isOff();
				if (idLoopCond_79) {
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
			java.lang.Boolean idLoopCond_80 = false;
			while (!idLoopCond_80) {
				idLoopCond_80 = it_ft33.isOff();
				if (idLoopCond_80) {
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
			java.lang.Boolean idLoopCond_81 = false;
			while (!idLoopCond_81) {
				idLoopCond_81 = it_ft34.isOff();
				if (idLoopCond_81) {
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
	public TypeDefinition getTypeDefinitionByQualifiedName(String qname) {

		kermeta.language.structure.TypeDefinition result = null;

		kermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_82 = false;
		idIfCond_82 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_82) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft35 = null;

		kermeta.language.structure.Package elem_ft35 = null;

		result_ft35 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft35 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_83 = false;
			while (!idLoopCond_83) {
				idLoopCond_83 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft35.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft35, null));
				if (idLoopCond_83) {
				} else {

					elem_ft35 = it_ft35.next();

					java.lang.Boolean idIfCond_84 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp35 = elem_ft35;

					idIfCond_84 = kermeta.standard.helper.StringWrapper.equals(
							p_lbdExp35.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_84) {

						result_ft35 = elem_ft35;
					}

				}
			}
		}

		//CE
		pack = result_ft35;
		//EIft:detect

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_85 = false;
			while (!idLoopCond_85) {
				idLoopCond_85 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_85) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft36 = null;

					kermeta.language.structure.Package elem_ft36 = null;

					result_ft36 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft36 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_86 = false;
						while (!idLoopCond_86) {
							idLoopCond_86 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft36.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft36, null));
							if (idLoopCond_86) {
							} else {

								elem_ft36 = it_ft36.next();

								java.lang.Boolean idIfCond_87 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp36 = elem_ft36;

								idIfCond_87 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp36.getName(), set_qname
												.at(i));
								//EIle:detector

								if (idIfCond_87) {

									result_ft36 = elem_ft36;
								}

							}
						}
					}

					//CE
					pack = result_ft36;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		//BIft:detect

		kermeta.language.structure.TypeDefinition result_ft37 = null;

		kermeta.language.structure.TypeDefinition elem_ft37 = null;

		result_ft37 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft37 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_88 = false;
			while (!idLoopCond_88) {
				idLoopCond_88 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft37.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft37, null));
				if (idLoopCond_88) {
				} else {

					elem_ft37 = it_ft37.next();

					java.lang.Boolean idIfCond_89 = false;
					//BIle:detector
					kermeta.language.structure.TypeDefinition c_lbdExp37 = elem_ft37;

					idIfCond_89 = kermeta.standard.helper.StringWrapper.equals(
							c_lbdExp37.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_89) {

						result_ft37 = elem_ft37;
					}

				}
			}
		}

		//CE
		result = result_ft37;
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
