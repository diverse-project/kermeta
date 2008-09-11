/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFResourceImpl.java,v 1.2 2008-09-11 12:34:57 cfaucher Exp $
 */
package kermeta.persistence.impl;

import kermeta.persistence.EMFResource;
import kermeta.persistence.PersistencePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMFResourceImpl extends ResourceImpl implements EMFResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.EMF_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {

		java.lang.Boolean idIfCond_583 = false;
		idIfCond_583 = this.getIsReadOnly();

		if (idIfCond_583) {

			kermeta.exceptions.ResourceSaveException e = ((kermeta.exceptions.ResourceSaveException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.ResourceSaveException"));

			e
					.setMessage(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													"Cannot save a readonly resource. Probably this resource was indirectly loaded when loading another resource. \n",
													"If you really intend to save this resource, you can set isReadOnly to false, but you must ensure to do so before any resource save.\n"),
									"Note : setting isReadOnly to false on the metamodel may lead to unpredictable results"));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		org.kermeta.compil.runtime.helper.persistence.Saver.save(getValues(),
				getUri(), getMetaModelURI());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(kermeta.language.structure.Object instance) {

		java.lang.Boolean idIfCond_584 = false;
		idIfCond_584 = this.contains(instance);

		if (idIfCond_584) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.unSetContainingResource(instance);

			kermeta.standard.helper.SetSuper.super_remove(this, instance);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveWithNewURI(String new_uri) {

		org.kermeta.compil.runtime.helper.persistence.Saver.save(getValues(),
				new_uri, getMetaModelURI());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean saveAndValidateWithEMF() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.ResourceUtil
				.save(this, this.uri, metaModelURI, "EMF", this, true);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void load() {

		this.clear();

		org.kermeta.compil.runtime.helper.persistence.Loader.load(getValues(),
				getUri(), getMetaModelURI());

		java.lang.Boolean idIfCond_585 = false;
		idIfCond_585 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_585) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.writeln("Resource load failed!");

			kermeta.exceptions.ResourceLoadException e = ((kermeta.exceptions.ResourceLoadException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.ResourceLoadException"));

			e
					.setMessage(kermeta.standard.helper.StringWrapper
							.plus(
									"Resource load failed, no object was created in this resource from ",
									this.getUri()));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(kermeta.language.structure.Object instance) {

		//BIft:select

		kermeta.standard.Sequence<kermeta.persistence.Resource> result_ft122 = null;

		kermeta.persistence.Resource elem_ft122 = null;

		result_ft122 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.persistence.Resource>"));

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft122 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getRepository().getResources()).iterator();
			java.lang.Boolean idLoopCond_587 = false;
			while (!idLoopCond_587) {
				idLoopCond_587 = it_ft122.isOff();
				if (idLoopCond_587) {
				} else {

					elem_ft122 = it_ft122.next();

					java.lang.Boolean idIfCond_588 = false;
					//BIle:selector
					kermeta.persistence.Resource r_lbdExp122 = elem_ft122;

					idIfCond_588 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(r_lbdExp122, this),
									r_lbdExp122.contains(instance));
					//EIle:selector

					if (idIfCond_588) {

						result_ft122.add(elem_ft122);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft121 = result_ft122
					.iterator();
			java.lang.Boolean idLoopCond_586 = false;
			while (!idLoopCond_586) {
				idLoopCond_586 = it_ft121.isOff();
				if (idLoopCond_586) {
				} else {

					//BIle:func
					kermeta.persistence.Resource r_lbdExp121 = it_ft121.next();

					org.kermeta.compil.runtime.helper.io.StdIOUtil
							.writeln("DVK ! another resource of the same repository was containing this element");

					r_lbdExp121.remove(instance);
					//EIle:func

				}
			}
		}

		//EIft:each

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.setContainingResource(instance, this);

		kermeta.standard.helper.SetSuper.super_add(this, instance);

	}

} //EMFResourceImpl
