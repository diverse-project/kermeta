/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFResourceImpl.java,v 1.5 2008-10-09 08:50:25 cfaucher Exp $
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

		java.lang.Boolean idIfCond_932 = false;
		idIfCond_932 = this.getIsReadOnly();

		if (idIfCond_932) {

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

		java.lang.Boolean idIfCond_933 = false;
		idIfCond_933 = this.contains(instance);

		if (idIfCond_933) {

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

		java.lang.Boolean idIfCond_934 = false;
		idIfCond_934 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_934) {

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

		kermeta.standard.Sequence<kermeta.persistence.Resource> result_ft211 = null;

		kermeta.persistence.Resource elem_ft211 = null;

		result_ft211 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.persistence.Resource>"));

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft211 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getRepository().getResources()).iterator();
			java.lang.Boolean idLoopCond_936 = false;
			while (!idLoopCond_936) {
				idLoopCond_936 = it_ft211.isOff();
				if (idLoopCond_936) {
				} else {

					elem_ft211 = it_ft211.next();

					java.lang.Boolean idIfCond_937 = false;
					//BIle:selector
					kermeta.persistence.Resource r_lbdExp211 = elem_ft211;

					idIfCond_937 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(r_lbdExp211, this),
									r_lbdExp211.contains(instance));
					//EIle:selector

					if (idIfCond_937) {

						result_ft211.add(elem_ft211);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft210 = result_ft211
					.iterator();
			java.lang.Boolean idLoopCond_935 = false;
			while (!idLoopCond_935) {
				idLoopCond_935 = it_ft210.isOff();
				if (idLoopCond_935) {
				} else {

					//BIle:func
					kermeta.persistence.Resource r_lbdExp210 = it_ft210.next();

					org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
							.writeln("DVK ! another resource of the same repository was containing this element");

					r_lbdExp210.remove(instance);
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
