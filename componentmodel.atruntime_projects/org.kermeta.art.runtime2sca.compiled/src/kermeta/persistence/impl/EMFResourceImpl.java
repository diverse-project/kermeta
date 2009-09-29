/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
	public void remove(kermeta.language.structure.Object instance) {

		java.lang.Boolean idIfCond_313 = false;
		idIfCond_313 = this.contains(instance);

		if (idIfCond_313) {

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
	public void save() {

		java.lang.Boolean idIfCond_314 = false;
		idIfCond_314 = this.getIsReadOnly();

		if (idIfCond_314) {

			kermeta.exceptions.ResourceSaveException e = ((kermeta.exceptions.ResourceSaveException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getResourceSaveException()));

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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.ResourceUtil
								.save(this, this.uri, metaModelURI, "EMF",
										this, true), "java.lang.Boolean");

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

		java.lang.Boolean idIfCond_315 = false;
		idIfCond_315 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_315) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
					.writeln("Resource load failed!");

			kermeta.exceptions.ResourceLoadException e = ((kermeta.exceptions.ResourceLoadException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getResourceLoadException()));

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

		kermeta.standard.Sequence<kermeta.persistence.Resource> result_ft77 = null;

		kermeta.persistence.Resource elem_ft77 = null;

		result_ft77 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getRepository().getResources()).iterator();
			java.lang.Boolean idLoopCond_317 = false;
			while (!idLoopCond_317) {
				idLoopCond_317 = it_ft77.isOff();
				if (idLoopCond_317) {
				} else {

					elem_ft77 = it_ft77.next();

					java.lang.Boolean idIfCond_318 = false;
					//BIle:selector
					kermeta.persistence.Resource r_lbdExp77 = elem_ft77;

					idIfCond_318 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(r_lbdExp77,
													this), r_lbdExp77
											.contains(instance));
					//EIle:selector

					if (idIfCond_318) {

						result_ft77.add(elem_ft77);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft76 = result_ft77
					.iterator();
			java.lang.Boolean idLoopCond_316 = false;
			while (!idLoopCond_316) {
				idLoopCond_316 = it_ft76.isOff();
				if (idLoopCond_316) {
				} else {

					//BIle:func
					kermeta.persistence.Resource r_lbdExp76 = it_ft76.next();

					org.kermeta.compil.runtime.helper.io.StdIOUtil
							.getInstance()
							.writeln(
									"DVK ! another resource of the same repository was containing this element");

					r_lbdExp76.remove(instance);
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
