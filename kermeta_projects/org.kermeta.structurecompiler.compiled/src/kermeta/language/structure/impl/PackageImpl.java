/**
 * <copyright>
 * </copyright>
 *
 * $Id: PackageImpl.java,v 1.4 2008-10-08 14:37:28 cfaucher Exp $
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
		return StructurePackage.Literals.PACKAGE;
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

		java.lang.Boolean idIfCond_174 = false;
		idIfCond_174 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(p, null);

		if (idIfCond_174) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							p.getEcoreModelElement().getESubpackages()).add(
							ecorePackage);
		}

		this.setEcoreModelElement(ecorePackage);

		//BIft:eachOwnedElement

		kermeta.language.structure.Package pack_ft61 = this;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							pack_ft61.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_175 = false;
			while (!idLoopCond_175) {
				idLoopCond_175 = it_ft62.isOff();
				if (idLoopCond_175) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp62 = it_ft62.next();

					//BIle:func
					kermeta.language.structure.Tag cd_lbdExp61 = o_lbdExp62;

					java.lang.Boolean idIfCond_176 = false;
					idIfCond_176 = kermeta.standard.helper.StringWrapper
							.equals(cd_lbdExp61.getDeprecated(), "");

					if (idIfCond_176) {

						cd_lbdExp61.applyPass1(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack_ft61.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_177 = false;
			while (!idLoopCond_177) {
				idLoopCond_177 = it_ft63.isOff();
				if (idLoopCond_177) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeDefinition o_lbdExp63 = it_ft63
							.next();

					//BIle:func
					kermeta.language.structure.TypeDefinition cd_lbdExp61 = o_lbdExp63;

					java.lang.Boolean idIfCond_178 = false;
					idIfCond_178 = kermeta.standard.helper.StringWrapper
							.equals(cd_lbdExp61.getDeprecated(), "");

					if (idIfCond_178) {

						cd_lbdExp61.applyPass1(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							pack_ft61.getNestedPackage()).iterator();
			java.lang.Boolean idLoopCond_179 = false;
			while (!idLoopCond_179) {
				idLoopCond_179 = it_ft64.isOff();
				if (idLoopCond_179) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp64 = it_ft64
							.next();

					//BIle:func
					kermeta.language.structure.Package cd_lbdExp61 = p_lbdExp64;

					java.lang.Boolean idIfCond_180 = false;
					idIfCond_180 = kermeta.standard.helper.StringWrapper
							.equals(cd_lbdExp61.getDeprecated(), "");

					if (idIfCond_180) {

						cd_lbdExp61.applyPass1(context);
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

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								" + Package ", this.qualifiedName()),
						" in progress"));

		ecore.EPackage ecorePackage = ((ecore.EPackage) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EPackage"));

		ecorePackage
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		java.lang.Boolean idIfCond_181 = false;
		idIfCond_181 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(this.getUri())),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(this.getUri(), ""));

		if (idIfCond_181) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							this.getNestedPackage()).iterator();
			java.lang.Boolean idLoopCond_182 = false;
			while (!idLoopCond_182) {
				idLoopCond_182 = it_ft65.isOff();
				if (idLoopCond_182) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp65 = it_ft65
							.next();

					result.add(p_lbdExp65);

					result.addAll(p_lbdExp65.getAllSubPackages());
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

		kermeta.language.structure.Package pack_ft66 = this;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							pack_ft66.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_183 = false;
			while (!idLoopCond_183) {
				idLoopCond_183 = it_ft67.isOff();
				if (idLoopCond_183) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp67 = it_ft67.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp66 = o_lbdExp67;

					p_lbdExp66.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
							pack_ft66.getOwnedTypeDefinition()).iterator();
			java.lang.Boolean idLoopCond_184 = false;
			while (!idLoopCond_184) {
				idLoopCond_184 = it_ft68.isOff();
				if (idLoopCond_184) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeDefinition o_lbdExp68 = it_ft68
							.next();

					//BIle:func
					kermeta.language.structure.TypeDefinition p_lbdExp66 = o_lbdExp68;

					p_lbdExp66.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Package> convertAsOrderedSet(
							pack_ft66.getNestedPackage()).iterator();
			java.lang.Boolean idLoopCond_185 = false;
			while (!idLoopCond_185) {
				idLoopCond_185 = it_ft69.isOff();
				if (idLoopCond_185) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp69 = it_ft69
							.next();

					//BIle:func
					kermeta.language.structure.Package p_lbdExp66 = p_lbdExp69;

					p_lbdExp66.applyPass2BehaviorJava(context);
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

		java.lang.Boolean idIfCond_408 = false;
		idIfCond_408 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_408) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.container(elem);
			java.lang.Boolean idLoopCond_409 = false;
			while (!idLoopCond_409) {
				idLoopCond_409 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(elem, null);
				if (idLoopCond_409) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_410 = false;
					idIfCond_410 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.container(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_410) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(elem);
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
