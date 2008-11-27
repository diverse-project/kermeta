/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFResourceImpl.java,v 1.10 2008-11-27 15:50:06 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1022 = false;
		idIfCond_1022 = this.getIsReadOnly();

		if (idIfCond_1022) {

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

		org.kermeta.compil.runtime.helper.persistence.Saver.save(this,
				getUri(), getMetaModelURI());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(kermeta.language.structure.Object instance) {

		java.lang.Boolean idIfCond_1023 = false;
		idIfCond_1023 = this.contains(instance);

		if (idIfCond_1023) {

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

		org.kermeta.compil.runtime.helper.persistence.Saver.save(this, new_uri,
				getMetaModelURI());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean saveAndValidateWithEMF() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.ResourceUtil
								.save(this, this.uri, metaModelURI, "EMF",
										this, true));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void load() {

		this.clear();

		org.kermeta.compil.runtime.helper.persistence.Loader.load(this,
				getUri(), getMetaModelURI());

		java.lang.Boolean idIfCond_1024 = false;
		idIfCond_1024 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_1024) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
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

		kermeta.standard.Sequence<kermeta.persistence.Resource> result_ft231 = null;

		kermeta.persistence.Resource elem_ft231 = null;

		result_ft231 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.persistence.Resource>"));

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft231 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getRepository().getResources()).iterator();
			java.lang.Boolean idLoopCond_1026 = false;
			while (!idLoopCond_1026) {
				idLoopCond_1026 = it_ft231.isOff();
				if (idLoopCond_1026) {
				} else {

					elem_ft231 = it_ft231.next();

					java.lang.Boolean idIfCond_1027 = false;
					//BIle:selector
					kermeta.persistence.Resource r_lbdExp231 = elem_ft231;

					idIfCond_1027 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(r_lbdExp231,
													this), r_lbdExp231
											.contains(instance));
					//EIle:selector

					if (idIfCond_1027) {

						result_ft231.add(elem_ft231);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft230 = result_ft231
					.iterator();
			java.lang.Boolean idLoopCond_1025 = false;
			while (!idLoopCond_1025) {
				idLoopCond_1025 = it_ft230.isOff();
				if (idLoopCond_1025) {
				} else {

					//BIle:func
					kermeta.persistence.Resource r_lbdExp230 = it_ft230.next();

					org.kermeta.compil.runtime.helper.io.StdIOUtil
							.getInstance()
							.writeln(
									"DVK ! another resource of the same repository was containing this element");

					r_lbdExp230.remove(instance);
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
