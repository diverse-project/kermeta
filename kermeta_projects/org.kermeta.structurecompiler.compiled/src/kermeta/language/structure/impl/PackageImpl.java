/**
 * <copyright>
 * </copyright>
 *
 * $Id: PackageImpl.java,v 1.9 2008-11-07 08:52:49 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EPackage;

import java.util.Collection;

import kermeta.language.structure.NamedElement;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypeDefinition;
import kermeta.language.structure.TypeDefinitionContainer;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PackageImpl#getOwnedTypeDefinition <em>Owned Type Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PackageImpl#getGenModelBasePackage <em>Gen Model Base Package</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PackageImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends TraceabilityImpl<EPackage> implements
		kermeta.language.structure.Package {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedTypeDefinition() <em>Owned Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> ownedTypeDefinition;

	/**
	 * The default value of the '{@link #getGenModelBasePackage() <em>Gen Model Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModelBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_MODEL_BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenModelBasePackage() <em>Gen Model Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModelBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String genModelBasePackage = GEN_MODEL_BASE_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.language.structure.Package> nestedPackage;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getOwnedTypeDefinition() {
		if (ownedTypeDefinition == null) {
			ownedTypeDefinition = new EObjectContainmentEList.Resolving<TypeDefinition>(
					TypeDefinition.class, this,
					StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION);
		}
		return ownedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Package getNestingPackage() {
		if (eContainerFeatureID != StructurePackage.PACKAGE__NESTING_PACKAGE)
			return null;
		return (kermeta.language.structure.Package) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Package basicGetNestingPackage() {
		if (eContainerFeatureID != StructurePackage.PACKAGE__NESTING_PACKAGE)
			return null;
		return (kermeta.language.structure.Package) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingPackage(
			kermeta.language.structure.Package newNestingPackage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newNestingPackage,
				StructurePackage.PACKAGE__NESTING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(
			kermeta.language.structure.Package newNestingPackage) {
		if (newNestingPackage != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.PACKAGE__NESTING_PACKAGE && newNestingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newNestingPackage))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNestingPackage != null)
				msgs = ((InternalEObject) newNestingPackage).eInverseAdd(this,
						StructurePackage.PACKAGE__NESTED_PACKAGE,
						kermeta.language.structure.Package.class, msgs);
			msgs = basicSetNestingPackage(newNestingPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PACKAGE__NESTING_PACKAGE,
					newNestingPackage, newNestingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenModelBasePackage() {
		return genModelBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModelBasePackage(String newGenModelBasePackage) {
		String oldGenModelBasePackage = genModelBasePackage;
		genModelBasePackage = newGenModelBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PACKAGE__GEN_MODEL_BASE_PACKAGE,
					oldGenModelBasePackage, genModelBasePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentWithInverseEList.Resolving<kermeta.language.structure.Package>(
					kermeta.language.structure.Package.class, this,
					StructurePackage.PACKAGE__NESTED_PACKAGE,
					StructurePackage.PACKAGE__NESTING_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PACKAGE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EPackage ecorePackage = this.createEcoreModelElement(context);

		kermeta.language.structure.Package p = this.getNestingPackage();

		java.lang.Boolean idIfCond_100 = false;
		idIfCond_100 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(p, null);

		if (idIfCond_100) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							p.getEcoreModelElement().getESubpackages()).add(
							ecorePackage);
		}

		this.setEcoreModelElement(ecorePackage);

		//BIft:eachOwnedElement

		kermeta.language.structure.Package pack_ft37 = this;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							pack_ft37.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_101 = false;
			while (!idLoopCond_101) {
				idLoopCond_101 = it_ft38.isOff();
				if (idLoopCond_101) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp38 = it_ft38.next();

					//BIle:func
					kermeta.language.structure.Tag cd_lbdExp37 = o_lbdExp38;

					java.lang.Boolean idIfCond_102 = false;
					idIfCond_102 = kermeta.standard.helper.StringWrapper
							.equals(cd_lbdExp37.getDeprecated(), "");

					if (idIfCond_102) {

						cd_lbdExp37.applyPass1(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack_ft37.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_103 = false;
			while (!idLoopCond_103) {
				idLoopCond_103 = it_ft39.isOff();
				if (idLoopCond_103) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeDefinition o_lbdExp39 = it_ft39
							.next();

					//BIle:func
					kermeta.language.structure.TypeDefinition cd_lbdExp37 = o_lbdExp39;

					java.lang.Boolean idIfCond_104 = false;
					idIfCond_104 = kermeta.standard.helper.StringWrapper
							.equals(cd_lbdExp37.getDeprecated(), "");

					if (idIfCond_104) {

						cd_lbdExp37.applyPass1(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							pack_ft37.getNestedPackage()).iterator();
			java.lang.Boolean idLoopCond_105 = false;
			while (!idLoopCond_105) {
				idLoopCond_105 = it_ft40.isOff();
				if (idLoopCond_105) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp40 = it_ft40
							.next();

					//BIle:func
					kermeta.language.structure.Package cd_lbdExp37 = p_lbdExp40;

					java.lang.Boolean idIfCond_106 = false;
					idIfCond_106 = kermeta.standard.helper.StringWrapper
							.equals(cd_lbdExp37.getDeprecated(), "");

					if (idIfCond_106) {

						cd_lbdExp37.applyPass1(context);
					}

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
	public EPackage createEcoreModelElement(KM2EcoreContext context) {

		ecore.EPackage result = null;

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								" + Package ", this.qualifiedName()),
						" in progress"));

		ecore.EPackage ecorePackage = ((ecore.EPackage) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EPackage"));

		ecorePackage
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		java.lang.Boolean idIfCond_107 = false;
		idIfCond_107 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this.getUri())),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(this.getUri(), ""));

		if (idIfCond_107) {

			ecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(
					this.getUri(), "/kermeta_temp_uri"));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							ecorePackage.getEAnnotations())
					.add(
							((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
									.createKermetaEAnnotation("ecoreUri", this
											.getUri()));
		} else {

			java.lang.String default_uri = kermeta.standard.helper.StringWrapper
					.plus("http://www.kermeta.org/",
							kermeta.standard.helper.StringWrapper.replace(this
									.qualifiedName(), "::", "/"));

			ecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(
					default_uri, "/kermeta_temp_uri"));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							ecorePackage.getEAnnotations())
					.add(
							((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
									.createKermetaEAnnotation("ecoreUri",
											default_uri));
		}

		ecorePackage.setNsPrefix("");

		result = ecorePackage;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<kermeta.language.structure.Package> getAllSubPackages() {

		kermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;

		result = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<kermeta.language.structure.Package>"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getNestedPackage()).iterator();
			java.lang.Boolean idLoopCond_108 = false;
			while (!idLoopCond_108) {
				idLoopCond_108 = it_ft41.isOff();
				if (idLoopCond_108) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp41 = it_ft41
							.next();

					result.add(p_lbdExp41);

					result.addAll(p_lbdExp41.getAllSubPackages());
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

		kermeta.language.structure.Package pack_ft42 = this;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							pack_ft42.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_109 = false;
			while (!idLoopCond_109) {
				idLoopCond_109 = it_ft43.isOff();
				if (idLoopCond_109) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp43 = it_ft43.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp42 = o_lbdExp43;

					p_lbdExp42.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack_ft42.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_110 = false;
			while (!idLoopCond_110) {
				idLoopCond_110 = it_ft44.isOff();
				if (idLoopCond_110) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeDefinition o_lbdExp44 = it_ft44
							.next();

					//BIle:func
					kermeta.language.structure.TypeDefinition p_lbdExp42 = o_lbdExp44;

					p_lbdExp42.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							pack_ft42.getNestedPackage()).iterator();
			java.lang.Boolean idLoopCond_111 = false;
			while (!idLoopCond_111) {
				idLoopCond_111 = it_ft45.isOff();
				if (idLoopCond_111) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp45 = it_ft45
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp42 = p_lbdExp45;

					p_lbdExp42.applyPass2BehaviorJava(context);
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
	public String getGenModelQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(this
						.getRootPackage().getGenModelBasePackage(), "::"), this
						.qualifiedName());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.qualifiedName(), "::", ".");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenModelJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.getGenModelQualifiedName(), "::", ".");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualifiedName() {

		java.lang.String result = null;

		kermeta.language.structure.NamedElement elem = this;

		result = this.getName();

		java.lang.Boolean idIfCond_402 = false;
		idIfCond_402 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_402) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.structure.NamedElement> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(elem));
			java.lang.Boolean idLoopCond_403 = false;
			while (!idLoopCond_403) {
				idLoopCond_403 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(elem, null);
				if (idLoopCond_403) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_404 = false;
					idIfCond_404 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_404) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.NamedElement> asTypeOrVoid(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(elem));
					} else {

						elem = null;
					}

				}
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.PACKAGE__NESTING_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNestingPackage(
					(kermeta.language.structure.Package) otherEnd, msgs);
		case StructurePackage.PACKAGE__NESTED_PACKAGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNestedPackage())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
			return ((InternalEList<?>) getOwnedTypeDefinition()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.PACKAGE__NESTING_PACKAGE:
			return basicSetNestingPackage(null, msgs);
		case StructurePackage.PACKAGE__NESTED_PACKAGE:
			return ((InternalEList<?>) getNestedPackage()).basicRemove(
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case StructurePackage.PACKAGE__NESTING_PACKAGE:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.PACKAGE__NESTED_PACKAGE,
					kermeta.language.structure.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.PACKAGE__NAME:
			return getName();
		case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
			return getOwnedTypeDefinition();
		case StructurePackage.PACKAGE__NESTING_PACKAGE:
			if (resolve)
				return getNestingPackage();
			return basicGetNestingPackage();
		case StructurePackage.PACKAGE__GEN_MODEL_BASE_PACKAGE:
			return getGenModelBasePackage();
		case StructurePackage.PACKAGE__NESTED_PACKAGE:
			return getNestedPackage();
		case StructurePackage.PACKAGE__URI:
			return getUri();
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
		case StructurePackage.PACKAGE__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
			getOwnedTypeDefinition().clear();
			getOwnedTypeDefinition().addAll(
					(Collection<? extends TypeDefinition>) newValue);
			return;
		case StructurePackage.PACKAGE__NESTING_PACKAGE:
			setNestingPackage((kermeta.language.structure.Package) newValue);
			return;
		case StructurePackage.PACKAGE__GEN_MODEL_BASE_PACKAGE:
			setGenModelBasePackage((String) newValue);
			return;
		case StructurePackage.PACKAGE__NESTED_PACKAGE:
			getNestedPackage().clear();
			getNestedPackage()
					.addAll(
							(Collection<? extends kermeta.language.structure.Package>) newValue);
			return;
		case StructurePackage.PACKAGE__URI:
			setUri((String) newValue);
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
		case StructurePackage.PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
			getOwnedTypeDefinition().clear();
			return;
		case StructurePackage.PACKAGE__NESTING_PACKAGE:
			setNestingPackage((kermeta.language.structure.Package) null);
			return;
		case StructurePackage.PACKAGE__GEN_MODEL_BASE_PACKAGE:
			setGenModelBasePackage(GEN_MODEL_BASE_PACKAGE_EDEFAULT);
			return;
		case StructurePackage.PACKAGE__NESTED_PACKAGE:
			getNestedPackage().clear();
			return;
		case StructurePackage.PACKAGE__URI:
			setUri(URI_EDEFAULT);
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
		case StructurePackage.PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
			return ownedTypeDefinition != null
					&& !ownedTypeDefinition.isEmpty();
		case StructurePackage.PACKAGE__NESTING_PACKAGE:
			return basicGetNestingPackage() != null;
		case StructurePackage.PACKAGE__GEN_MODEL_BASE_PACKAGE:
			return GEN_MODEL_BASE_PACKAGE_EDEFAULT == null ? genModelBasePackage != null
					: !GEN_MODEL_BASE_PACKAGE_EDEFAULT
							.equals(genModelBasePackage);
		case StructurePackage.PACKAGE__NESTED_PACKAGE:
			return nestedPackage != null && !nestedPackage.isEmpty();
		case StructurePackage.PACKAGE__URI:
			return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT
					.equals(uri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PACKAGE__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinitionContainer.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				return StructurePackage.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return StructurePackage.PACKAGE__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinitionContainer.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION:
				return StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", genModelBasePackage: ");
		result.append(genModelBasePackage);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
