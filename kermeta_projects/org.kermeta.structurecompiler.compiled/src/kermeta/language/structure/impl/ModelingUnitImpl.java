/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnitImpl.java,v 1.3 2008-09-22 14:47:35 cfaucher Exp $
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

		kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_744 = false;
		idIfCond_744 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_744) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft155 = null;

		kermeta.language.structure.Package elem_ft155 = null;

		result_ft155 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft155 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_745 = false;
			while (!idLoopCond_745) {
				idLoopCond_745 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft155.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft155, null));
				if (idLoopCond_745) {
				} else {

					elem_ft155 = it_ft155.next();

					java.lang.Boolean idIfCond_746 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp155 = elem_ft155;

					idIfCond_746 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp155.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_746) {

						result_ft155 = elem_ft155;
					}

				}
			}
		}

		//CE
		pack = result_ft155;
		//EIft:detect

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_747 = false;
			while (!idLoopCond_747) {
				idLoopCond_747 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i, set_qname.size());
				if (idLoopCond_747) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft156 = null;

					kermeta.language.structure.Package elem_ft156 = null;

					result_ft156 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft156 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_748 = false;
						while (!idLoopCond_748) {
							idLoopCond_748 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft156.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(result_ft156,
															null));
							if (idLoopCond_748) {
							} else {

								elem_ft156 = it_ft156.next();

								java.lang.Boolean idIfCond_749 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp156 = elem_ft156;

								idIfCond_749 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp156.getName(),
												set_qname.at(i));
								//EIle:detector

								if (idIfCond_749) {

									result_ft156 = elem_ft156;
								}

							}
						}
					}

					//CE
					pack = result_ft156;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		result = pack;

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft158 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_750 = false;
			while (!idLoopCond_750) {
				idLoopCond_750 = it_ft158.isOff();
				if (idLoopCond_750) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp158 = it_ft158
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp157 = o_lbdExp158;

					p_lbdExp157.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft159 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_751 = false;
			while (!idLoopCond_751) {
				idLoopCond_751 = it_ft159.isOff();
				if (idLoopCond_751) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp159 = it_ft159
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp157 = p_lbdExp159;

					p_lbdExp157.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft160 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_752 = false;
			while (!idLoopCond_752) {
				idLoopCond_752 = it_ft160.isOff();
				if (idLoopCond_752) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp160 = it_ft160
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp157 = p_lbdExp160;

					p_lbdExp157.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft161 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_753 = false;
			while (!idLoopCond_753) {
				idLoopCond_753 = it_ft161.isOff();
				if (idLoopCond_753) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp161 = it_ft161
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp157 = p_lbdExp161;

					p_lbdExp157.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft162 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_754 = false;
			while (!idLoopCond_754) {
				idLoopCond_754 = it_ft162.isOff();
				if (idLoopCond_754) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp162 = it_ft162
							.next();

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EPackage> convertAsOrderedSet(
									this.getEcorePackages()).add(
									p_lbdExp162.getEcoreModelElement());
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

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft163 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							this.getSuperOperationsToCompileInHelper())
					.iterator();
			java.lang.Boolean idLoopCond_755 = false;
			while (!idLoopCond_755) {
				idLoopCond_755 = it_ft163.isOff();
				if (idLoopCond_755) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation op_lbdExp163 = it_ft163
							.next();

					context.setStaticOperationMode(true);

					this.compileStaticOperation(op_lbdExp163, context);

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

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEClassifierByQualifiedName(String qname) {

		ecore.EClassifier result = null;

		kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper
				.split(qname, "::");

		java.lang.Boolean idIfCond_756 = false;
		idIfCond_756 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_756) {

			set_qname.add(qname);
		}

		ecore.EPackage pack = null;
		//BIft:detect

		ecore.EPackage result_ft164 = null;

		ecore.EPackage elem_ft164 = null;

		result_ft164 = null;

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft164 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getEcorePackages()).iterator();
			java.lang.Boolean idLoopCond_757 = false;
			while (!idLoopCond_757) {
				idLoopCond_757 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft164.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft164, null));
				if (idLoopCond_757) {
				} else {

					elem_ft164 = it_ft164.next();

					java.lang.Boolean idIfCond_758 = false;
					//BIle:detector
					ecore.EPackage p_lbdExp164 = elem_ft164;

					idIfCond_758 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp164.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_758) {

						result_ft164 = elem_ft164;
					}

				}
			}
		}

		//CE
		pack = result_ft164;
		//EIft:detect

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_759 = false;
			while (!idLoopCond_759) {
				idLoopCond_759 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_759) {
				} else {

					//BIft:detect

					ecore.EPackage result_ft165 = null;

					ecore.EPackage elem_ft165 = null;

					result_ft165 = null;

					{

						kermeta.standard.Iterator<ecore.EPackage> it_ft165 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EPackage> convertAsOrderedSet(
										pack.getESubpackages()).iterator();
						java.lang.Boolean idLoopCond_760 = false;
						while (!idLoopCond_760) {
							idLoopCond_760 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft165.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(result_ft165,
															null));
							if (idLoopCond_760) {
							} else {

								elem_ft165 = it_ft165.next();

								java.lang.Boolean idIfCond_761 = false;
								//BIle:detector
								ecore.EPackage p_lbdExp165 = elem_ft165;

								idIfCond_761 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp165.getName(),
												set_qname.at(i));
								//EIle:detector

								if (idIfCond_761) {

									result_ft165 = elem_ft165;
								}

							}
						}
					}

					//CE
					pack = result_ft165;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		//BIft:detect

		ecore.EClassifier result_ft166 = null;

		ecore.EClassifier elem_ft166 = null;

		result_ft166 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft166 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEClassifiers()).iterator();
			java.lang.Boolean idLoopCond_762 = false;
			while (!idLoopCond_762) {
				idLoopCond_762 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft166.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft166, null));
				if (idLoopCond_762) {
				} else {

					elem_ft166 = it_ft166.next();

					java.lang.Boolean idIfCond_763 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp166 = elem_ft166;

					idIfCond_763 = kermeta.standard.helper.StringWrapper
							.equals(c_lbdExp166.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_763) {

						result_ft166 = elem_ft166;
					}

				}
			}
		}

		//CE
		result = result_ft166;
		//EIft:detect

		return result;

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

		java.lang.Boolean idIfCond_764 = false;
		idIfCond_764 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(smContext));

		if (idIfCond_764) {

			simk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.StaticMethod"));

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
					.<simk.StaticMethod> convertAsOrderedSet(
							context.getSimkModel().getStaticMethods()).add(
							staticMethod);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.StaticMethod> convertAsOrderedSet(
							smContext.getStaticMethods()).add(staticMethod);

			simk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMReturn"));

			smReturn.setType(op.getType().createBehaviorJava(context));

			java.lang.Boolean idIfCond_765 = false;
			idIfCond_765 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(smReturn.getType());

			if (idIfCond_765) {

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
											.qualifiedName(), "::", "."));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMParameter> convertAsOrderedSet(
							staticMethod.getSMParameters()).add(default_param);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft167 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								op.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_766 = false;
				while (!idLoopCond_766) {
					idLoopCond_766 = it_ft167.isOff();
					if (idLoopCond_766) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp167 = it_ft167
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("simk.SMParameter"));

						param.setName(p_lbdExp167.getName());

						java.lang.Boolean idIfCond_767 = false;
						idIfCond_767 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												p_lbdExp167.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_767) {

							param.setType(p_lbdExp167.getType()
									.createBehaviorJava(context));

							java.lang.Boolean idIfCond_768 = false;
							idIfCond_768 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("kermeta.language.structure.Operation"))
									.isVoidType(param.getType());

							if (idIfCond_768) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft168 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_769 = false;
			while (!idLoopCond_769) {
				idLoopCond_769 = it_ft168.isOff();
				if (idLoopCond_769) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp168 = it_ft168
							.next();

					result.add(p_lbdExp168);

					result.addAll(p_lbdExp168.getAllSubPackages());
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft170 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_770 = false;
			while (!idLoopCond_770) {
				idLoopCond_770 = it_ft170.isOff();
				if (idLoopCond_770) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp170 = it_ft170
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp169 = o_lbdExp170;

					p_lbdExp169.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft171 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Require> convertAsOrderedSet(
							this.getRequires()).iterator();
			java.lang.Boolean idLoopCond_771 = false;
			while (!idLoopCond_771) {
				idLoopCond_771 = it_ft171.isOff();
				if (idLoopCond_771) {
				} else {

					//BIle:func
					kermeta.language.structure.Require p_lbdExp171 = it_ft171
							.next();

					//BIle:func
					kermeta.language.structure.Require p_lbdExp169 = p_lbdExp171;

					p_lbdExp169.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft172 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Using> convertAsOrderedSet(
							this.getUsings()).iterator();
			java.lang.Boolean idLoopCond_772 = false;
			while (!idLoopCond_772) {
				idLoopCond_772 = it_ft172.isOff();
				if (idLoopCond_772) {
				} else {

					//BIle:func
					kermeta.language.structure.Using p_lbdExp172 = it_ft172
							.next();

					//BIle:func
					kermeta.language.structure.Using p_lbdExp169 = p_lbdExp172;

					p_lbdExp169.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft173 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_773 = false;
			while (!idLoopCond_773) {
				idLoopCond_773 = it_ft173.isOff();
				if (idLoopCond_773) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp173 = it_ft173
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp169 = p_lbdExp173;

					p_lbdExp169.applyPass2BehaviorJava(context);
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

		java.lang.Boolean idIfCond_774 = false;
		idIfCond_774 = kermeta.standard.helper.IntegerWrapper.equals(set_qname
				.size(), 0);

		if (idIfCond_774) {

			set_qname.add(qname);
		}

		kermeta.language.structure.Package pack = null;
		//BIft:detect

		kermeta.language.structure.Package result_ft174 = null;

		kermeta.language.structure.Package elem_ft174 = null;

		result_ft174 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft174 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getPackages()).iterator();
			java.lang.Boolean idLoopCond_775 = false;
			while (!idLoopCond_775) {
				idLoopCond_775 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft174.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft174, null));
				if (idLoopCond_775) {
				} else {

					elem_ft174 = it_ft174.next();

					java.lang.Boolean idIfCond_776 = false;
					//BIle:detector
					kermeta.language.structure.Package p_lbdExp174 = elem_ft174;

					idIfCond_776 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp174.getName(), set_qname.at(0));
					//EIle:detector

					if (idIfCond_776) {

						result_ft174 = elem_ft174;
					}

				}
			}
		}

		//CE
		pack = result_ft174;
		//EIft:detect

		{

			java.lang.Integer i = 1;
			java.lang.Boolean idLoopCond_777 = false;
			while (!idLoopCond_777) {
				idLoopCond_777 = kermeta.standard.helper.IntegerWrapper
						.isGreaterOrEqual(i,
								kermeta.standard.helper.IntegerWrapper.minus(
										set_qname.size(), 1));
				if (idLoopCond_777) {
				} else {

					//BIft:detect

					kermeta.language.structure.Package result_ft175 = null;

					kermeta.language.structure.Package elem_ft175 = null;

					result_ft175 = null;

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft175 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_778 = false;
						while (!idLoopCond_778) {
							idLoopCond_778 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft175.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(result_ft175,
															null));
							if (idLoopCond_778) {
							} else {

								elem_ft175 = it_ft175.next();

								java.lang.Boolean idIfCond_779 = false;
								//BIle:detector
								kermeta.language.structure.Package p_lbdExp175 = elem_ft175;

								idIfCond_779 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp175.getName(),
												set_qname.at(i));
								//EIle:detector

								if (idIfCond_779) {

									result_ft175 = elem_ft175;
								}

							}
						}
					}

					//CE
					pack = result_ft175;
					//EIft:detect

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		//BIft:detect

		kermeta.language.structure.TypeDefinition result_ft176 = null;

		kermeta.language.structure.TypeDefinition elem_ft176 = null;

		result_ft176 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft176 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_780 = false;
			while (!idLoopCond_780) {
				idLoopCond_780 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft176.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft176, null));
				if (idLoopCond_780) {
				} else {

					elem_ft176 = it_ft176.next();

					java.lang.Boolean idIfCond_781 = false;
					//BIle:detector
					kermeta.language.structure.TypeDefinition c_lbdExp176 = elem_ft176;

					idIfCond_781 = kermeta.standard.helper.StringWrapper
							.equals(c_lbdExp176.getName(), set_qname
									.at(kermeta.standard.helper.IntegerWrapper
											.minus(set_qname.size(), 1)));
					//EIle:detector

					if (idIfCond_781) {

						result_ft176 = elem_ft176;
					}

				}
			}
		}

		//CE
		result = result_ft176;
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
		case StructurePackage.MODELING_UNIT__PACKAGES:
			getPackages().clear();
			return;
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			getIncludeFilters().clear();
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
		case StructurePackage.MODELING_UNIT__PACKAGES:
			return packages != null && !packages.isEmpty();
		case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
			return includeFilters != null && !includeFilters.isEmpty();
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
