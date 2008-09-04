/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeVariableImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.ETypeParameter;

import kermeta.language.structure.ObjectTypeVariable;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ObjectTypeVariableImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTypeVariableImpl extends TypeVariableImpl implements
		ObjectTypeVariable {
	/**
	 * The cached value of the '{@link #getEcoreModelElement() <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreModelElement()
	 * @generated
	 * @ordered
	 */
	protected ETypeParameter ecoreModelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OBJECT_TYPE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (ETypeParameter) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT,
							oldEcoreModelElement, ecoreModelElement));
			}
		}
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(ETypeParameter newEcoreModelElement) {
		ETypeParameter oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = this.getName();

		java.lang.Boolean idIfCond_206 = false;
		idIfCond_206 = context.getFtSuffixActivation();

		if (idIfCond_206) {

			kermeta.language.structure.Type type_from_map = context
					.getFtMapTypeStack().peek().getValue(this);

			java.lang.Boolean idIfCond_207 = false;
			idIfCond_207 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(type_from_map));

			if (idIfCond_207) {

				org.kermeta.compil.runtime.helper.io.StdIOUtil
						.writeln(kermeta.standard.helper.StringWrapper
								.plus(
										"++++++++++======== ",
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.toString(this)));

				context.setFtSuffixActivation(false);

				result = type_from_map.createBehaviorJava(context);

				context.setFtSuffixActivation(true);
			} else {

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);

				kermeta.language.structure.Object obj = null;
				//Beginning of the Inlining of the function type: detect

				kermeta.language.structure.TypeVariable result_ft73 = null;

				kermeta.language.structure.TypeVariable elem_ft73 = null;

				result_ft73 = null;

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft73 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.container(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_208 = false;
					while (!idLoopCond_208) {
						idLoopCond_208 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft73.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqual(result_ft73, null));
						if (idLoopCond_208) {
						} else {

							elem_ft73 = it_ft73.next();

							java.lang.Boolean idIfCond_209 = false;
							//Beginning of the Inlining of the lambda expression: detector
							kermeta.language.structure.TypeVariable otv = elem_ft73;

							java.lang.Boolean idIfCond_210 = false;
							idIfCond_210 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											otv,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ObjectTypeVariable"));

							if (idIfCond_210) {

								i = kermeta.standard.helper.IntegerWrapper
										.plus(i, 1);

								idIfCond_209 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.equals(this, otv);
							}

							//End of the Inlining of the lambda expression: detector

							if (idIfCond_209) {

								result_ft73 = elem_ft73;
							}

						}
					}
				}

				//callElement
				obj = result_ft73;
				//End of the Inlining of the function type: detect

				java.lang.Boolean idIfCond_211 = false;
				idIfCond_211 = kermeta.standard.helper.BooleanWrapper
						.and(
								kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoid(obj)),
								kermeta.standard.helper.IntegerWrapper
										.isGreaterOrEqual(i, 0));

				if (idIfCond_211) {

					java.lang.Boolean idIfCond_212 = false;
					idIfCond_212 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(context.getFtProductTypeStack().peek()
									.getTypeByIndex(i), this);

					if (idIfCond_212) {

						result = context.getFtProductTypeStack().peek()
								.getTypeByIndex(i).createBehaviorJava(context);
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
	public void applyPass1(KM2EcoreContext context) {

		ecore.ETypeParameter ecoreTypeParameter = this
				.createEcoreModelElement(context);

		kermeta.language.structure.Object container = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		java.lang.Boolean idIfCond_213 = false;
		idIfCond_213 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						container,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_213) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.ETypeParameter> convertAsOrderedSet(
							((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											container,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ClassDefinition")))
									.getEcoreModelElement()
									.getETypeParameters()).add(
							ecoreTypeParameter);
		} else {

			java.lang.Boolean idIfCond_214 = false;
			idIfCond_214 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							container,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Operation"));

			if (idIfCond_214) {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.ETypeParameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												container,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")))
										.getEcoreModelElement()
										.getETypeParameters()).add(
								ecoreTypeParameter);
			}

		}

		this.setEcoreModelElement(ecoreTypeParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter createEcoreModelElement(KM2EcoreContext context) {

		ecore.ETypeParameter result = null;

		ecore.ETypeParameter ecoreTypeParameter = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.ETypeParameter"));

		ecoreTypeParameter
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		result = ecoreTypeParameter;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter getEcoreModelElementTrace() {

		X result = null;

		result = this.getEcoreModelElement();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			if (resolve)
				return getEcoreModelElement();
			return basicGetEcoreModelElement();
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((ETypeParameter) newValue);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((ETypeParameter) null);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			return ecoreModelElement != null;
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
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
				return StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT;
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
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
			case StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT:
				return StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ObjectTypeVariableImpl
