/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFResourceImpl.java,v 1.2 2008-08-19 13:23:01 cfaucher Exp $
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
	public void loadWithoutChecking() {

		this.clear();

		org.kermeta.compil.runtime.helper.persistence.Loader.load(getValues(),
				getUri(), getMetaModelURI());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(kermeta.language.structure.Object instance) {

		java.lang.Boolean idIfCond_264 = false;
		idIfCond_264 = this.contains(instance);

		if (idIfCond_264) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.unSetContainingResource(instance);

			//Call of the super operation
			((kermeta.standard.Set) this).remove(instance);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {

		java.lang.Boolean idIfCond_265 = false;
		idIfCond_265 = this.getIsReadOnly();

		if (idIfCond_265) {

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

		java.lang.Boolean idIfCond_266 = false;
		idIfCond_266 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_266) {

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

		//Beginning of the Inlining of the function type: select

		kermeta.standard.Sequence<kermeta.persistence.Resource> result_ft49 = null;

		kermeta.persistence.Resource elem_ft49 = null;

		result_ft49 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.persistence.Resource>"));

		kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.persistence.Resource> convertAsSet(
						this.getRepository().getResources()).iterator();
		java.lang.Boolean idLoopCond_268 = false;
		while (!idLoopCond_268) {
			idLoopCond_268 = it_ft49.isOff();
			;
			if (idLoopCond_268) {
			} else {

				elem_ft49 = it_ft49.next();

				java.lang.Boolean idIfCond_269 = false;
				//Beginning of the Inlining of the lambda expression: selector
				kermeta.persistence.Resource r = elem_ft49;

				idIfCond_269 = kermeta.standard.helper.BooleanWrapper.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(r, this), r.contains(instance));
				//End of the Inlining of the lambda expression: selector

				if (idIfCond_269) {

					result_ft49.add(elem_ft49);
				}

			}
		}
		//End of the Inlining of the function type: select
		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft48 = result_ft49
				.iterator();
		java.lang.Boolean idLoopCond_267 = false;
		while (!idLoopCond_267) {
			idLoopCond_267 = it_ft48.isOff();
			;
			if (idLoopCond_267) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				kermeta.persistence.Resource r = it_ft48.next();

				org.kermeta.compil.runtime.helper.io.StdIOUtil
						.writeln("DVK ! another resource of the same repository was containing this element");

				r.remove(instance);
				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.setContainingResource(instance, this);

		//Call of the super operation
		((kermeta.standard.Set) this).add(instance);

	}

} //EMFResourceImpl
