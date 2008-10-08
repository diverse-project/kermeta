/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnitImpl.java,v 1.4 2008-10-08 14:37:29 cfaucher Exp $
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
		return StructurePackage.Literals.MODELING_UNIT;
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

		java.lang.Boolean idIfCond_127 = false;
		idIfCond_127 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_127) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft37 = null;

		kermeta.language.structure.Package elem_ft37 = null;

		result_ft37 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft37 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_128 = false;
			while (!idLoopCond_128) {
				idLoopCond_128 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft37.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft37, null));
				if (idLoopCond_128) {
				} else {

					elem_ft37 = it_ft37.next();

					java.lang.Boolean idIfCond_129 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp37 = elem_ft37;

					idIfCond_129 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp37.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_129) {

						result_ft37 = elem_ft37;
					}

				}
			}
		}

		//CE
		pack = result_ft37;
		//EIft:detect

		java.lang.Boolean idIfCond_130 = false;
		idIfCond_130 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(pack));

		if (idIfCond_130) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_131 = false;
				while (!idLoopCond_131) {
					idLoopCond_131 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, set_qname.size());
					if (idLoopCond_131) {
					} else {

						//BIft:detect

						kermeta.language.structure.Package result_ft38 = null;

						kermeta.language.structure.Package elem_ft38 = null;

						result_ft38 = null;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Package> convertAsOrderedSet(
											pack.getNestedPackage()).iterator();
							java.lang.Boolean idLoopCond_132 = false;
							while (!idLoopCond_132) {
								idLoopCond_132 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft38.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																result_ft38,
																null));
								if (idLoopCond_132) {
								} else {

									elem_ft38 = it_ft38.next();

									java.lang.Boolean idIfCond_133 = false;
									//BIle:detector
									kermeta.language.structure.Package p_lbdExp38 = elem_ft38;

									idIfCond_133 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp38.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_133) {

										result_ft38 = elem_ft38;
									}

								}
							}
						}

						//CE
						pack = result_ft38;
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_134 = false;
			while (!idLoopCond_134) {
				idLoopCond_134 = it_ft40.isOff();
				if (idLoopCond_134) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp40 = it_ft40.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp39 = o_lbdExp40;

					p_lbdExp39.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_135 = false;
			while (!idLoopCond_135) {
				idLoopCond_135 = it_ft41.isOff();
				if (idLoopCond_135) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp41 = it_ft41
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp39 = p_lbdExp41;

					p_lbdExp39.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_136 = false;
			while (!idLoopCond_136) {
				idLoopCond_136 = it_ft42.isOff();
				if (idLoopCond_136) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp42 = it_ft42
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp39 = p_lbdExp42;

					p_lbdExp39.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_137 = false;
			while (!idLoopCond_137) {
				idLoopCond_137 = it_ft43.isOff();
				if (idLoopCond_137) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp43 = it_ft43
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp39 = p_lbdExp43;

					p_lbdExp39.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_138 = false;
			while (!idLoopCond_138) {
				idLoopCond_138 = it_ft44.isOff();
				if (idLoopCond_138) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp44 = it_ft44
							.next();

					kermeta.standard.Sequence<ecore.EPackage> eps = null;
					//BIft:select

					kermeta.standard.Sequence<ecore.EPackage> result_ft45 = null;

					ecore.EPackage elem_ft45 = null;

					result_ft45 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.standard.Sequence<ecore.EPackage>"));

					{

						kermeta.standard.Iterator<ecore.EPackage> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EPackage> convertAsOrderedSet(
										this.getEcorePackages()).iterator();
						java.lang.Boolean idLoopCond_139 = false;
						while (!idLoopCond_139) {
							idLoopCond_139 = it_ft45.isOff();
							if (idLoopCond_139) {
							} else {

								elem_ft45 = it_ft45.next();

								java.lang.Boolean idIfCond_140 = false;
								//BIle:selector
								ecore.EPackage ep_lbdExp45 = elem_ft45;

								idIfCond_140 = kermeta.standard.helper.StringWrapper
										.equals(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp44
																.getName()),
												kermeta.standard.helper.StringWrapper
														.toLowerCase(ep_lbdExp45
																.getName()));
								//EIle:selector

								if (idIfCond_140) {

									result_ft45.add(elem_ft45);
								}

							}
						}
					}

					//CE
					eps = result_ft45;
					//EIft:select

					java.lang.Boolean idIfCond_141 = false;
					idIfCond_141 = kermeta.standard.helper.IntegerWrapper
							.isGreater(eps.size(), 0);

					if (idIfCond_141) {

						java.lang.Boolean idIfCond_142 = false;
						idIfCond_142 = kermeta.standard.helper.IntegerWrapper
								.equals(eps.size(), 1);

						if (idIfCond_142) {

							//BIft:detect

							kermeta.language.structure.Package result_ft46 = null;

							kermeta.language.structure.Package elem_ft46 = null;

							result_ft46 = null;

							{

								kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Package> convertAsOrderedSet(
												this.getPackages()).iterator();
								java.lang.Boolean idLoopCond_143 = false;
								while (!idLoopCond_143) {
									idLoopCond_143 = kermeta.standard.helper.BooleanWrapper
											.or(
													it_ft46.isOff(),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isNotEqual(
																	result_ft46,
																	null));
									if (idLoopCond_143) {
									} else {

										elem_ft46 = it_ft46.next();

										java.lang.Boolean idIfCond_144 = false;
										//BIle:detector
										kermeta.language.structure.Package pack_lbdExp46 = elem_ft46;

										idIfCond_144 = kermeta.standard.helper.StringWrapper
												.equals(
														kermeta.standard.helper.StringWrapper
																.toLowerCase(pack_lbdExp46
																		.getName()),
														kermeta.standard.helper.StringWrapper
																.toLowerCase(p_lbdExp44
																		.getName()));
										//EIle:detector

										if (idIfCond_144) {

											result_ft46 = elem_ft46;
										}

									}
								}
							}

							//EIft:detect
							result_ft46
									.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.toLowerCase(p_lbdExp44
																	.getName()),
													"0"));
						}

						p_lbdExp44
								.setGenModelBasePackage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.toLowerCase(p_lbdExp44
																.getName()),
												kermeta.standard.helper.IntegerWrapper
														.toString(eps.size())));
					}

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EPackage> convertAsOrderedSet(
									this.getEcorePackages()).add(
									p_lbdExp44.getEcoreModelElement());
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

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							this.getSuperOperationsToCompileInHelper())
					.iterator();
			java.lang.Boolean idLoopCond_145 = false;
			while (!idLoopCond_145) {
				idLoopCond_145 = it_ft47.isOff();
				if (idLoopCond_145) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation op_lbdExp47 = it_ft47
							.next();

					context.setStaticOperationMode(true);

					this.compileStaticOperation(op_lbdExp47, context);

					context.setStaticOperationMode(false);
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

		java.lang.Boolean idIfCond_146 = false;
		idIfCond_146 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_146) {

			set_qname.add(qname);
		}

		ecore.EPackage pack = null;
		//BIft:detect

		ecore.EPackage result_ft48 = null;

		ecore.EPackage elem_ft48 = null;

		result_ft48 = null;

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft48 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getEcorePackages()).iterator();
			java.lang.Boolean idLoopCond_147 = false;
			while (!idLoopCond_147) {
				idLoopCond_147 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft48.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft48, null));
				if (idLoopCond_147) {
				} else {

					elem_ft48 = it_ft48.next();

					java.lang.Boolean idIfCond_148 = false;
					//BIle:detector
					ecore.EPackage p_lbdExp48 = elem_ft48;

					idIfCond_148 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp48.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_148) {

						result_ft48 = elem_ft48;
					}

				}
			}
		}

		//CE
		pack = result_ft48;
		//EIft:detect

		java.lang.Boolean idIfCond_149 = false;
		idIfCond_149 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(pack));

		if (idIfCond_149) {

			{

				java.lang.Integer i = 1;
				java.lang.Boolean idLoopCond_150 = false;
				while (!idLoopCond_150) {
					idLoopCond_150 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1));
					if (idLoopCond_150) {
					} else {

						//BIft:detect

						ecore.EPackage result_ft49 = null;

						ecore.EPackage elem_ft49 = null;

						result_ft49 = null;

						{

							kermeta.standard.Iterator<ecore.EPackage> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EPackage> convertAsOrderedSet(
											pack.getESubpackages()).iterator();
							java.lang.Boolean idLoopCond_151 = false;
							while (!idLoopCond_151) {
								idLoopCond_151 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft49.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																result_ft49,
																null));
								if (idLoopCond_151) {
								} else {

									elem_ft49 = it_ft49.next();

									java.lang.Boolean idIfCond_152 = false;
									//BIle:detector
									ecore.EPackage p_lbdExp49 = elem_ft49;

									idIfCond_152 = kermeta.standard.helper.StringWrapper
											.equals(p_lbdExp49.getName(),
													set_qname.at(i));
									//EIle:detector

									if (idIfCond_152) {

										result_ft49 = elem_ft49;
									}

								}
							}
						}

						//CE
						pack = result_ft49;
						//EIft:detect

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

			//BIft:detect

			ecore.EClassifier result_ft50 = null;

			ecore.EClassifier elem_ft50 = null;

			result_ft50 = null;

			{

				kermeta.standard.Iterator<ecore.EClassifier> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EClassifier> convertAsOrderedSet(
								pack.getEClassifiers()).iterator();
				java.lang.Boolean idLoopCond_153 = false;
				while (!idLoopCond_153) {
					idLoopCond_153 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft50.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft50, null));
					if (idLoopCond_153) {
					} else {

						elem_ft50 = it_ft50.next();

						java.lang.Boolean idIfCond_154 = false;
						//BIle:detector
						ecore.EClassifier c_lbdExp50 = elem_ft50;

						idIfCond_154 = kermeta.standard.helper.StringWrapper
								.equals(
										c_lbdExp50.getName(),
										set_qname
												.at(kermeta.standard.helper.IntegerWrapper
														.minus(
																set_qname
																		.size(),
																1)));
						//EIle:detector

						if (idIfCond_154) {

							result_ft50 = elem_ft50;
						}

					}
				}
			}

			//CE
			result = result_ft50;
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

		java.lang.Boolean idIfCond_155 = false;
		idIfCond_155 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getEClassifierByQualifiedName("ecore::EObject")));

		if (idIfCond_155) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
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

		java.lang.Boolean idIfCond_156 = false;
		idIfCond_156 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(smContext));

		if (idIfCond_156) {

			simk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMMethod"));

			staticMethod
					.setName(kermeta.standard.helper.StringWrapper
							.plus(
									"super_",
									((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("km2ecore.helper.java.IdentifierHelper"))
											.getMangledIdentifier(op
													.getFinalName(), context)));

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

			java.lang.Boolean idIfCond_157 = false;
			idIfCond_157 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(smReturn.getType());

			if (idIfCond_157) {

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
											.asType(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.container(op),
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

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								op.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_158 = false;
				while (!idLoopCond_158) {
					idLoopCond_158 = it_ft51.isOff();
					if (idLoopCond_158) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp51 = it_ft51
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("simk.SMParameter"));

						param.setName(p_lbdExp51.getName());

						java.lang.Boolean idIfCond_159 = false;
						idIfCond_159 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												p_lbdExp51.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_159) {

							param.setType(p_lbdExp51.getType()
									.createBehaviorJava(context));

							java.lang.Boolean idIfCond_160 = false;
							idIfCond_160 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("kermeta.language.structure.Operation"))
									.isVoidType(param.getType());

							if (idIfCond_160) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_161 = false;
			while (!idLoopCond_161) {
				idLoopCond_161 = it_ft52.isOff();
				if (idLoopCond_161) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp52 = it_ft52
							.next();

					result.add(p_lbdExp52);

					result.addAll(p_lbdExp52.getAllSubPackages());
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_162 = false;
			while (!idLoopCond_162) {
				idLoopCond_162 = it_ft54.isOff();
				if (idLoopCond_162) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp54 = it_ft54.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp53 = o_lbdExp54;

					p_lbdExp53.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_163 = false;
			while (!idLoopCond_163) {
				idLoopCond_163 = it_ft55.isOff();
				if (idLoopCond_163) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp55 = it_ft55
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp53 = p_lbdExp55;

					p_lbdExp53.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_164 = false;
			while (!idLoopCond_164) {
				idLoopCond_164 = it_ft56.isOff();
				if (idLoopCond_164) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp56 = it_ft56
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp53 = p_lbdExp56;

					p_lbdExp53.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_165 = false;
			while (!idLoopCond_165) {
				idLoopCond_165 = it_ft57.isOff();
				if (idLoopCond_165) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp57 = it_ft57
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp53 = p_lbdExp57;

					p_lbdExp53.applyPass2BehaviorJava(context);
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

		java.lang.Boolean idIfCond_166 = false;
		idIfCond_166 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_166) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft58 = null;

		kermeta.language.structure.Package elem_ft58 = null;

		result_ft58 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_167 = false;
			while (!idLoopCond_167) {
				idLoopCond_167 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft58.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft58, null));
				if (idLoopCond_167) {
				} else {

					elem_ft58 = it_ft58.next();

					java.lang.Boolean idIfCond_168 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp58 = elem_ft58;

					idIfCond_168 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp58.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_168) {

						result_ft58 = elem_ft58;
					}

				}
			}
		}

		//CE
		pack = result_ft58;
		//EIft:detect

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_169 = false;
			while (!idLoopCond_169) {
				idLoopCond_169 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_169) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft59 = null;

					kermeta.language.structure.Package elem_ft59 = null;

					result_ft59 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_170 = false;
						while (!idLoopCond_170) {
							idLoopCond_170 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft59.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(result_ft59,
															null));
							if (idLoopCond_170) {
							} else {

								elem_ft59 = it_ft59.next();

								java.lang.Boolean idIfCond_171 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp59 = elem_ft59;

								idIfCond_171 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp59.getName(), set_qname
												.at(i));
								//EIle:detector

								if (idIfCond_171) {

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

		kermeta.language.structure.TypeDefinition result_ft60 = null;

		kermeta.language.structure.TypeDefinition elem_ft60 = null;

		result_ft60 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_172 = false;
			while (!idLoopCond_172) {
				idLoopCond_172 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft60.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft60, null));
				if (idLoopCond_172) {
				} else {

					elem_ft60 = it_ft60.next();

					java.lang.Boolean idIfCond_173 = false;
					//BIle:detector
					kermeta.language.structure.TypeDefinition c_lbdExp60 = elem_ft60;

					idIfCond_173 = kermeta.standard.helper.StringWrapper
							.equals(c_lbdExp60.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_173) {

						result_ft60 = elem_ft60;
					}

				}
			}
		}

		//CE
		result = result_ft60;
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
