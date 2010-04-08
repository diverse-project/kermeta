/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoFactoryImpl.java,v 1.14 2008-06-12 07:18:49 ftanguy Exp $
 */
package org.kermeta.io.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.kermeta.io.*;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.IoFactory;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.PackageEntry;
import org.kermeta.io.ParseErrorMessage;
import org.kermeta.io.ParsingError;
import org.kermeta.io.TypeDefinitionCache;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.io.WarningMessage;
import org.kermeta.io.plugin.IOPlugin;

import antlr.ANTLRException;
import fr.irisa.triskell.traceability.helper.Tracer;
import java.lang.ref.WeakReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoFactoryImpl extends EFactoryImpl implements IoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IoFactory init() {
		try {
			IoFactory theIoFactory = (IoFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/io"); 
			if (theIoFactory != null) {
				return theIoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoFactoryImpl() {
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
			case IoPackage.KERMETA_UNIT: return createKermetaUnit();
			case IoPackage.PACKAGE_ENTRY: return createPackageEntry();
			case IoPackage.ERROR_MESSAGE: return createErrorMessage();
			case IoPackage.WARNING_MESSAGE: return createWarningMessage();
			case IoPackage.PARSE_ERROR_MESSAGE: return createParseErrorMessage();
			case IoPackage.PARSING_ERROR: return createParsingError();
			case IoPackage.TYPE_DEFINITION_CACHE: return createTypeDefinitionCache();
			case IoPackage.TYPE_DEFINITION_CACHE_ENTRY: return createTypeDefinitionCacheEntry();
			case IoPackage.KERMETA_UNIT_REQUIRE: return createKermetaUnitRequire();
			case IoPackage.TYPE_DEFINITION_CONTEXT: return createTypeDefinitionContext();
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
			case IoPackage.SET:
				return createSetFromString(eDataType, initialValue);
			case IoPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case IoPackage.TRACER:
				return createTracerFromString(eDataType, initialValue);
			case IoPackage.AST_NODE:
				return createASTNodeFromString(eDataType, initialValue);
			case IoPackage.ANTLR_EXCEPTION:
				return createANTLRExceptionFromString(eDataType, initialValue);
			case IoPackage.IO_PLUGIN:
				return createIOPluginFromString(eDataType, initialValue);
			case IoPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
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
			case IoPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			case IoPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case IoPackage.TRACER:
				return convertTracerToString(eDataType, instanceValue);
			case IoPackage.AST_NODE:
				return convertASTNodeToString(eDataType, instanceValue);
			case IoPackage.ANTLR_EXCEPTION:
				return convertANTLRExceptionToString(eDataType, instanceValue);
			case IoPackage.IO_PLUGIN:
				return convertIOPluginToString(eDataType, instanceValue);
			case IoPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnit createKermetaUnit() {
		KermetaUnitImpl kermetaUnit = new KermetaUnitImpl();
		return kermetaUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageEntry createPackageEntry() {
		PackageEntryImpl packageEntry = new PackageEntryImpl();
		return packageEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessage createErrorMessage() {
		ErrorMessageImpl errorMessage = new ErrorMessageImpl();
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningMessage createWarningMessage() {
		WarningMessageImpl warningMessage = new WarningMessageImpl();
		return warningMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseErrorMessage createParseErrorMessage() {
		ParseErrorMessageImpl parseErrorMessage = new ParseErrorMessageImpl();
		return parseErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingError createParsingError() {
		ParsingErrorImpl parsingError = new ParsingErrorImpl();
		return parsingError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionCache createTypeDefinitionCache() {
		TypeDefinitionCacheImpl typeDefinitionCache = new TypeDefinitionCacheImpl();
		return typeDefinitionCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionCacheEntry createTypeDefinitionCacheEntry() {
		TypeDefinitionCacheEntryImpl typeDefinitionCacheEntry = new TypeDefinitionCacheEntryImpl();
		return typeDefinitionCacheEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnitRequire createKermetaUnitRequire() {
		KermetaUnitRequireImpl kermetaUnitRequire = new KermetaUnitRequireImpl();
		return kermetaUnitRequire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionContext createTypeDefinitionContext() {
		TypeDefinitionContextImpl typeDefinitionContext = new TypeDefinitionContextImpl();
		return typeDefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSetFromString(EDataType eDataType, String initialValue) {
		return (Set)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createListFromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tracer createTracerFromString(EDataType eDataType, String initialValue) {
		return (Tracer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTracerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode createASTNodeFromString(EDataType eDataType, String initialValue) {
		return (ASTNode)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASTNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANTLRException createANTLRExceptionFromString(EDataType eDataType, String initialValue) {
		return (ANTLRException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertANTLRExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOPlugin createIOPluginFromString(EDataType eDataType, String initialValue) {
		return (IOPlugin)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOPluginToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoPackage getIoPackage() {
		return (IoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IoPackage getPackage() {
		return IoPackage.eINSTANCE;
	}

} //IoFactoryImpl
