/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpoonFactoryImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.impl;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import emf.spoon.SpoonFactory;
import emf.spoon.SpoonPackage;
import emf.spoon.factory.CtTypeReferenceMap;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferenceFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpoonFactoryImpl extends EFactoryImpl implements SpoonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpoonFactory init() {
		try {
			SpoonFactory theSpoonFactory = (SpoonFactory)EPackage.Registry.INSTANCE.getEFactory("emf.spoon"); 
			if (theSpoonFactory != null) {
				return theSpoonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpoonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpoonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpoonPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case SpoonPackage.CONSTRUCTOR:
				return createConstructorFromString(eDataType, initialValue);
			case SpoonPackage.METHOD:
				return createMethodFromString(eDataType, initialValue);
			case SpoonPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case SpoonPackage.FIELD:
				return createFieldFromString(eDataType, initialValue);
			case SpoonPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case SpoonPackage.CLASS:
				return createClassFromString(eDataType, initialValue);
			case SpoonPackage.ANNOTATION:
				return createAnnotationFromString(eDataType, initialValue);
			case SpoonPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case SpoonPackage.BINARY_OPERATOR_KIND:
				return createBinaryOperatorKindFromString(eDataType, initialValue);
			case SpoonPackage.UNARY_OPERATOR_KIND:
				return createUnaryOperatorKindFromString(eDataType, initialValue);
			case SpoonPackage.MODIFIER_KIND:
				return createModifierKindFromString(eDataType, initialValue);
			case SpoonPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpoonPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case SpoonPackage.CONSTRUCTOR:
				return convertConstructorToString(eDataType, instanceValue);
			case SpoonPackage.METHOD:
				return convertMethodToString(eDataType, instanceValue);
			case SpoonPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case SpoonPackage.FIELD:
				return convertFieldToString(eDataType, instanceValue);
			case SpoonPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case SpoonPackage.CLASS:
				return convertClassToString(eDataType, instanceValue);
			case SpoonPackage.ANNOTATION:
				return convertAnnotationToString(eDataType, instanceValue);
			case SpoonPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case SpoonPackage.BINARY_OPERATOR_KIND:
				return convertBinaryOperatorKindToString(eDataType, instanceValue);
			case SpoonPackage.UNARY_OPERATOR_KIND:
				return convertUnaryOperatorKindToString(eDataType, instanceValue);
			case SpoonPackage.MODIFIER_KIND:
				return convertModifierKindToString(eDataType, instanceValue);
			case SpoonPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMapFromString(EDataType eDataType, String initialValue) {
		return (Map)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		try {
			Map elementValues = (Map) instanceValue;
			
			StringBuffer result = new StringBuffer();
			result.append(" number: ");
			result.append(elementValues.size());
			
			for (Object o: elementValues.entrySet())
			{
//				result.append(", ElementValues: ");
				Entry e = (Entry) o;
				result.append(", key = " + e.getKey());
				result.append(", value : " + e.getValue());
				return result.toString();
				
			}
		}catch (ClassCastException e){
			e.printStackTrace();
		}
		
		return super.convertToString(eDataType, instanceValue);
			
		
		
	}


	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType,
			String initialValue) {

		try {
			return Integer.parseInt(initialValue);
		} catch (NumberFormatException e) {
		}
		if (initialValue.equalsIgnoreCase("true"))
			return Boolean.TRUE;
		else if (initialValue.equalsIgnoreCase("false"))
			return Boolean.FALSE;
		else if (initialValue
				.startsWith("emf.spoon.reflect.reference.impl.CtTypeReferenceImpl@")) {
			CtTypeReference t = ReferenceFactory.eINSTANCE
					.createCtTypeReference();
			t
					.setSimpleName(initialValue
							.replaceFirst(
									"emf.spoon.reflect.reference.impl.CtTypeReferenceImpl@",
									""));
			CtTypeReferenceMap.eIntance.add(t);
			//this.eResource().getContents().add(t);
			return t;
		}

		else {
			return initialValue;

		}

		// return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType,
			Object instanceValue) {
		if (instanceValue instanceof CtTypeReference) {
			// System.out.println(((CtTypeReference)
			// instanceValue).getPackage()+"" + ((CtTypeReference)
			// instanceValue).getDeclaringType()+" "+((CtTypeReference)
			// instanceValue).getSimpleName());
			String name = "";
			if (((CtTypeReference) instanceValue).getDeclaringType() != null) {
				name = ((CtTypeReference) instanceValue).getDeclaringType()
						.getQualifiedName()
						+ CtType.INNERTTYPE_SEPARATOR
						+ ((CtTypeReference) instanceValue).getSimpleName();
			} else if (((CtTypeReference) instanceValue).getPackage() != null) {
				name = ((CtTypeReference) instanceValue).getPackage()
						.getSimpleName()
						+ CtPackage.PACKAGE_SEPARATOR
						+ ((CtTypeReference) instanceValue).getSimpleName();
			} else {
				name = ((CtTypeReference) instanceValue).getSimpleName();
			}
			return "emf.spoon.reflect.reference.impl.CtTypeReferenceImpl@"
					+ name;

		}
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructorFromString(EDataType eDataType, String initialValue) {
		return (Constructor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstructorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethodFromString(EDataType eDataType, String initialValue) {
		return (Method)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodToString(EDataType eDataType, Object instanceValue) {
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
	public Field createFieldFromString(EDataType eDataType, String initialValue) {
		return (Field)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFieldToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
	public Class createClassFromString(EDataType eDataType, String initialValue) {
		return (Class)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotationFromString(EDataType eDataType, String initialValue) {
		return (Annotation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationToString(EDataType eDataType, Object instanceValue) {
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
	public BinaryOperatorKind createBinaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		return (BinaryOperatorKind)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperatorKind createUnaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		return (UnaryOperatorKind)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierKind createModifierKindFromString(EDataType eDataType, String initialValue) {
		if (ModifierKind.ABSTRACT.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.ABSTRACT;
		else if (ModifierKind.FINAL.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.FINAL;
		else if (ModifierKind.NATIVE.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.NATIVE;
		else if (ModifierKind.PRIVATE.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.PRIVATE;
		else if (ModifierKind.PROTECTED.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.PROTECTED;
		else if (ModifierKind.PUBLIC.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.PUBLIC;
		else if (ModifierKind.STATIC.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.STATIC;
		else if (ModifierKind.STRICTFP.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.STRICTFP;
		else if (ModifierKind.SYNCHRONIZED.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.SYNCHRONIZED;
		else if (ModifierKind.TRANSIENT.toString().equals(initialValue))
			return (ModifierKind) ModifierKind.TRANSIENT;
		else
			return (ModifierKind) ModifierKind.VOLATILE;
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifierKindToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpoonPackage getSpoonPackage() {
		return (SpoonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SpoonPackage getPackage() {
		return SpoonPackage.eINSTANCE;
	}

} //SpoonFactoryImpl
