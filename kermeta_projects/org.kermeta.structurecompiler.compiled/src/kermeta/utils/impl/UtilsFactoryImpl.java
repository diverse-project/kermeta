/**
 * <copyright>
 * </copyright>
 *
 * $Id: UtilsFactoryImpl.java,v 1.10 2009-01-21 09:15:55 cfaucher Exp $
 */
package kermeta.utils.impl;

import kermeta.utils.Hashtable;
import kermeta.utils.Stack;
import kermeta.utils.UtilsFactory;
import kermeta.utils.UtilsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsFactoryImpl extends EFactoryImpl implements UtilsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilsFactory init() {
		try {
			UtilsFactory theUtilsFactory = (UtilsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/kermeta/1_2_0//kermeta/utils/kermeta_temp_uri");
			if (theUtilsFactory != null) {
				return theUtilsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsFactoryImpl() {
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
		case UtilsPackage.HASHTABLE:
			return createHashtable();
		case UtilsPackage.STRING_BUFFER:
			return createStringBuffer();
		case UtilsPackage.STACK:
			return createStack();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
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
		case UtilsPackage.KERMETA_PROPERTY_HASHTABLE_WRAPPED_HASHTABLE:
			return createKermetaProperty_Hashtable_wrappedHashtableFromString(
					eDataType, initialValue);
		case UtilsPackage.KERMETA_PROPERTY_STRING_BUFFER_CONTENT:
			return createKermetaProperty_StringBuffer_contentFromString(
					eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
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
		case UtilsPackage.KERMETA_PROPERTY_HASHTABLE_WRAPPED_HASHTABLE:
			return convertKermetaProperty_Hashtable_wrappedHashtableToString(
					eDataType, instanceValue);
		case UtilsPackage.KERMETA_PROPERTY_STRING_BUFFER_CONTENT:
			return convertKermetaProperty_StringBuffer_contentToString(
					eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <K, V> Hashtable<K, V> createHashtable() {
		HashtableImpl<K, V> hashtable = new HashtableImpl<K, V>();
		return hashtable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.utils.StringBuffer createStringBuffer() {
		StringBufferImpl stringBuffer = new StringBufferImpl();
		return stringBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <G> Stack<G> createStack() {
		StackImpl<G> stack = new StackImpl<G>();
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Hashtable<?, ?> createKermetaProperty_Hashtable_wrappedHashtableFromString(
			EDataType eDataType, String initialValue) {
		return (java.util.Hashtable<?, ?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKermetaProperty_Hashtable_wrappedHashtableToString(
			EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringBuffer createKermetaProperty_StringBuffer_contentFromString(
			EDataType eDataType, String initialValue) {
		return (StringBuffer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKermetaProperty_StringBuffer_contentToString(
			EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsPackage getUtilsPackage() {
		return (UtilsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilsPackage getPackage() {
		return UtilsPackage.eINSTANCE;
	}

} //UtilsFactoryImpl
