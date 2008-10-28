/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaFactoryImpl.java,v 1.6 2008-10-28 13:18:12 cfaucher Exp $
 */
package km2ecore.helper.kermeta.impl;

import km2ecore.helper.kermeta.*;

import org.eclipse.emf.ecore.EClass;
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
public class KermetaFactoryImpl extends EFactoryImpl implements KermetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KermetaFactory init() {
		try {
			KermetaFactory theKermetaFactory = (KermetaFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/km2ecore/helper/kermeta/kermeta_temp_uri");
			if (theKermetaFactory != null) {
				return theKermetaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KermetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaFactoryImpl() {
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
		case KermetaPackage.COMPILER_HELPER_JAVA:
			return createCompilerHelperJava();
		case KermetaPackage.GENERIC_TYPE_DEFINITION_HELPER:
			return createGenericTypeDefinitionHelper();
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
	public CompilerHelperJava createCompilerHelperJava() {
		CompilerHelperJavaImpl compilerHelperJava = new CompilerHelperJavaImpl();
		return compilerHelperJava;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTypeDefinitionHelper createGenericTypeDefinitionHelper() {
		GenericTypeDefinitionHelperImpl genericTypeDefinitionHelper = new GenericTypeDefinitionHelperImpl();
		return genericTypeDefinitionHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaPackage getKermetaPackage() {
		return (KermetaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KermetaPackage getPackage() {
		return KermetaPackage.eINSTANCE;
	}

} //KermetaFactoryImpl
