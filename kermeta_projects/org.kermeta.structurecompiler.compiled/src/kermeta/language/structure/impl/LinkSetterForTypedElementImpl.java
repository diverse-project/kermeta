/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import ecore.ETypedElement;

import kermeta.language.structure.LinkSetterForTypedElement;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypedElement;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Setter For Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.LinkSetterForTypedElementImpl#getForceVoidTypeLink <em>Force Void Type Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkSetterForTypedElementImpl extends ObjectImpl implements
		LinkSetterForTypedElement {
	/**
	 * The default value of the '{@link #getForceVoidTypeLink() <em>Force Void Type Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceVoidTypeLink()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FORCE_VOID_TYPE_LINK_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getForceVoidTypeLink() <em>Force Void Type Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceVoidTypeLink()
	 * @generated
	 * @ordered
	 */
	protected Boolean forceVoidTypeLink = FORCE_VOID_TYPE_LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkSetterForTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getLinkSetterForTypedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForceVoidTypeLink() {
		return forceVoidTypeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceVoidTypeLink(Boolean newForceVoidTypeLink) {
		Boolean oldForceVoidTypeLink = forceVoidTypeLink;
		forceVoidTypeLink = newForceVoidTypeLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					StructurePackage.LINK_SETTER_FOR_TYPED_ELEMENT__FORCE_VOID_TYPE_LINK,
					oldForceVoidTypeLink, forceVoidTypeLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean mustForceVoidTypeLink() {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_674 = false;
		idIfCond_674 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getForceVoidTypeLink()));

		if (idIfCond_674) {

			result = this.getForceVoidTypeLink();
		} else {

			result = false;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(TypedElement element, ETypedElement ecoreModelElement,
			KM2EcoreContext context) {

		java.lang.Boolean idIfCond_675 = false;
		idIfCond_675 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(ecoreModelElement)),
						kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.BooleanWrapper
												.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
																.getOperation()))
														.isVoidType(element
																.getType()
																.getTypeQName())),
										this.mustForceVoidTypeLink()));

		if (idIfCond_675) {

			java.lang.Boolean idIfCond_676 = false;
			idIfCond_676 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(element.getType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_676) {

				kermeta.language.structure.Class c = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Class")));

				kermeta.language.structure.ClassDefinition classDefinition = c
						.getClassDefinitionAsTyped();

				ecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(ecore.EcorePackage.eINSTANCE
								.getEGenericType()));

				java.lang.Boolean idIfCond_677 = false;
				idIfCond_677 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(classDefinition.getEcoreDataType());

				if (idIfCond_677) {

					genericType.setEClassifier(classDefinition
							.getEcoreModelElement());
				} else {

					genericType.setEClassifier(classDefinition
							.getEcoreDataType());
				}

				ecoreModelElement.setEGenericType(genericType);

				c.setEcoreModelElement(genericType);

				c.setLinks(context);
			} else {

				java.lang.Boolean idIfCond_678 = false;
				idIfCond_678 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_678) {

					kermeta.language.structure.ClassDefinition cd = element
							.getType().getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					java.lang.Boolean idIfCond_679 = false;
					idIfCond_679 = element.getType().isEDataType();

					if (idIfCond_679) {

						ecore.EGenericType newEGT = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(ecore.EcorePackage.eINSTANCE
										.getEGenericType()));

						newEGT
								.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												element.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.PrimitiveType")))
										.getEcoreModelElement());

						ecoreModelElement.setEGenericType(newEGT);

						//BIft:each

						{

							kermeta.standard.Iterator<ecore.ETypeParameter> it_ft154 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.ETypeParameter> convertAsOrderedSet(
											((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															element.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement()
													.getETypeParameters())
									.iterator();
							java.lang.Boolean idLoopCond_680 = false;
							while (!idLoopCond_680) {
								idLoopCond_680 = it_ft154.isOff();
								if (idLoopCond_680) {
								} else {

									//BIle:func
									ecore.ETypeParameter etp_lbdExp154 = it_ft154
											.next();

									java.lang.Boolean idIfCond_681 = false;
									idIfCond_681 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(ecoreModelElement
															.getEGenericType()));

									if (idIfCond_681) {

										org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.EGenericType> convertAsOrderedSet(
														newEGT
																.getETypeArguments())
												.add(
														((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
																.newObject(ecore.EcorePackage.eINSTANCE
																		.getEGenericType())));
									}

									//EIle:func

								}
							}
						}

						//EIft:each

					} else {

						java.lang.Boolean idIfCond_682 = false;
						idIfCond_682 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(cd.getEcoreDataType());

						if (idIfCond_682) {

							ecoreModelElement.setEType(cd
									.getEcoreModelElement());
						} else {

							ecoreModelElement.setEType(cd.getEcoreDataType());
						}

					}

				} else {

					java.lang.Boolean idIfCond_683 = false;
					idIfCond_683 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									element.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_683) {

						ecoreModelElement
								.setEType(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												element.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Enumeration")))
										.getEcoreModelElement());
					} else {

						java.lang.Boolean idIfCond_684 = false;
						idIfCond_684 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										element.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_684) {

							ecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(ecore.EcorePackage.eINSTANCE
											.getEGenericType()));

							genericType
									.setETypeParameter(((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													element.getType(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ObjectTypeVariable")))
											.getEcoreModelElement());

							ecoreModelElement.setEGenericType(genericType);
						}

					}

				}

			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.LINK_SETTER_FOR_TYPED_ELEMENT__FORCE_VOID_TYPE_LINK:
			return getForceVoidTypeLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StructurePackage.LINK_SETTER_FOR_TYPED_ELEMENT__FORCE_VOID_TYPE_LINK:
			setForceVoidTypeLink((Boolean) newValue);
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
		case StructurePackage.LINK_SETTER_FOR_TYPED_ELEMENT__FORCE_VOID_TYPE_LINK:
			setForceVoidTypeLink(FORCE_VOID_TYPE_LINK_EDEFAULT);
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
		case StructurePackage.LINK_SETTER_FOR_TYPED_ELEMENT__FORCE_VOID_TYPE_LINK:
			return FORCE_VOID_TYPE_LINK_EDEFAULT == null ? forceVoidTypeLink != null
					: !FORCE_VOID_TYPE_LINK_EDEFAULT.equals(forceVoidTypeLink);
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
		result.append(" (forceVoidTypeLink: ");
		result.append(forceVoidTypeLink);
		result.append(')');
		return result.toString();
	}

} //LinkSetterForTypedElementImpl
