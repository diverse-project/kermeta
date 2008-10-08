/**
 * <copyright>
 * </copyright>
 *
 * $Id: TagImpl.java,v 1.4 2008-10-08 14:37:29 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EAnnotation;

import java.util.Collection;

import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.TagImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.TagImpl#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.TagImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagImpl extends TraceabilityImpl<EAnnotation> implements Tag {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.language.structure.Object> object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.TAG;
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
					StructurePackage.TAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.TAG__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Object> getObject() {
		if (object == null) {
			object = new EObjectWithInverseResolvingEList.ManyInverse<kermeta.language.structure.Object>(
					kermeta.language.structure.Object.class, this,
					StructurePackage.TAG__OBJECT, StructurePackage.OBJECT__TAG);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EAnnotation ecoreAnnotation = this
				.createEcoreModelElement(context);

		kermeta.language.structure.Object c = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		java.lang.Boolean idIfCond_405 = false;
		idIfCond_405 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(c, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.ModelingUnit"));

		if (idIfCond_405) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											c,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ModelingUnit")))
									.getEntryPoints()).add(ecoreAnnotation);
		} else {

			kermeta.language.structure.Property p = c
					.getPropertyValue("ecoreModelElement");

			java.lang.Boolean idIfCond_406 = false;
			idIfCond_406 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(p));

			if (idIfCond_406) {

				ecore.EModelElement ecoreModelElement_retrieved = ((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(c, p),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance().getMetaClass(
												"ecore.EModelElement")));

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EAnnotation> convertAsOrderedSet(
								ecoreModelElement_retrieved.getEAnnotations())
						.add(ecoreAnnotation);
			}

		}

		this.setEcoreModelElement(ecoreAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEcoreModelElement(KM2EcoreContext context) {

		ecore.EAnnotation result = null;

		ecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
				.getKermetaEAnnotation(this);

		java.lang.Boolean idIfCond_407 = false;
		idIfCond_407 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(this.getName());

		if (idIfCond_407) {

			((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
					.addEntry(
							ecoreAnnotation,
							kermeta.standard.helper.StringWrapper
									.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
											.getByName("documentation")
											.getName()), this.getValue());
		} else {

			((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
					.addEntry(ecoreAnnotation, this.getName(), this.getValue());
		}

		result = ecoreAnnotation;

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
		case StructurePackage.TAG__OBJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getObject())
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
		case StructurePackage.TAG__OBJECT:
			return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
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
		case StructurePackage.TAG__NAME:
			return getName();
		case StructurePackage.TAG__VALUE:
			return getValue();
		case StructurePackage.TAG__OBJECT:
			return getObject();
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
		case StructurePackage.TAG__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.TAG__VALUE:
			setValue((String) newValue);
			return;
		case StructurePackage.TAG__OBJECT:
			getObject().clear();
			getObject()
					.addAll(
							(Collection<? extends kermeta.language.structure.Object>) newValue);
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
		case StructurePackage.TAG__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.TAG__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case StructurePackage.TAG__OBJECT:
			getObject().clear();
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
		case StructurePackage.TAG__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.TAG__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT
					.equals(value);
		case StructurePackage.TAG__OBJECT:
			return object != null && !object.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TagImpl
