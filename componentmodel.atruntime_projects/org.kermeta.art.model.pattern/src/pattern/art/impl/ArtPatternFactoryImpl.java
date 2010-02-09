/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pattern.art.ArtPatternFactory;
import pattern.art.ArtPatternPackage;
import pattern.art.CardinalityElement;
import pattern.art.DataType;
import pattern.art.ModelElement;
import pattern.art.NamedElement;
import pattern.art.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtPatternFactoryImpl extends EFactoryImpl implements ArtPatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtPatternFactory init() {
		try {
			ArtPatternFactory theArtPatternFactory = (ArtPatternFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/pattern/art"); 
			if (theArtPatternFactory != null) {
				return theArtPatternFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArtPatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtPatternFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArtPatternPackage.NAMED_ELEMENT: return createNamedElement();
			case ArtPatternPackage.MODEL_ELEMENT: return createModelElement();
			case ArtPatternPackage.SYSTEM: return createSystem();
			case ArtPatternPackage.DATA_TYPE: return createDataType();
			case ArtPatternPackage.TYPED_ELEMENT: return createTypedElement();
			case ArtPatternPackage.CARDINALITY_ELEMENT: return createCardinalityElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArtPatternPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case ArtPatternPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case ArtPatternPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArtPatternPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case ArtPatternPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case ArtPatternPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pattern.art.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityElement createCardinalityElement() {
		CardinalityElementImpl cardinalityElement = new CardinalityElementImpl();
		return cardinalityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtPatternPackage getArtPatternPackage() {
		return (ArtPatternPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArtPatternPackage getPackage() {
		return ArtPatternPackage.eINSTANCE;
	}

} //ArtPatternFactoryImpl
