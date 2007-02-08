/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmFactoryImpl.java,v 1.4 2007-02-08 15:37:03 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.*;

import fr.irisa.triskell.kermeta.kpm.workspace.KermetaUnitInterest;

import java.util.ArrayList;

import java.util.Date;

import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

import org.eclipse.core.resources.IResource;

import org.eclipse.core.runtime.IProgressMonitor;

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
public class KpmFactoryImpl extends EFactoryImpl implements KpmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KpmFactory init() {
		try {
			KpmFactory theKpmFactory = (KpmFactory)EPackage.Registry.INSTANCE.getEFactory("plugin:/resource/fr.irisa.triskell.kermeta.kpm/model/Kpm.ecore"); 
			if (theKpmFactory != null) {
				return theKpmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KpmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KpmPackage.ABSTRACT_FILE: return createAbstractFile();
			case KpmPackage.ABSTRACT_DIRECTORY: return createAbstractDirectory();
			case KpmPackage.ABSTRACT_PROJECT: return createAbstractProject();
			case KpmPackage.NAME_FILTER: return createNameFilter();
			case KpmPackage.DEPENDENCY: return createDependency();
			case KpmPackage.DEPENDENCY_TYPE: return createDependencyType();
			case KpmPackage.DEPENDENCY_EVENT: return createDependencyEvent();
			case KpmPackage.EXIST_FILTER: return createExistFilter();
			case KpmPackage.TYPE_FILTER: return createTypeFilter();
			case KpmPackage.FILE: return createFile();
			case KpmPackage.DIRECTORY: return createDirectory();
			case KpmPackage.PROJECT: return createProject();
			case KpmPackage.KPM: return createKPM();
			case KpmPackage.ACTION: return createAction();
			case KpmPackage.AND: return createAnd();
			case KpmPackage.OR: return createOr();
			case KpmPackage.EXPRESSION: return createExpression();
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
			case KpmPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case KpmPackage.ARRAY_LIST:
				return createArrayListFromString(eDataType, initialValue);
			case KpmPackage.BOOLEAN:
				return createbooleanFromString(eDataType, initialValue);
			case KpmPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case KpmPackage.IFOLDER:
				return createIFolderFromString(eDataType, initialValue);
			case KpmPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case KpmPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case KpmPackage.IRESOURCE:
				return createIResourceFromString(eDataType, initialValue);
			case KpmPackage.KERMETA_UNIT_INTEREST:
				return createKermetaUnitInterestFromString(eDataType, initialValue);
			case KpmPackage.HASHTABLE:
				return createHashtableFromString(eDataType, initialValue);
			case KpmPackage.IPROGRESS_MONITOR:
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case KpmPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case KpmPackage.ARRAY_LIST:
				return convertArrayListToString(eDataType, instanceValue);
			case KpmPackage.BOOLEAN:
				return convertbooleanToString(eDataType, instanceValue);
			case KpmPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case KpmPackage.IFOLDER:
				return convertIFolderToString(eDataType, instanceValue);
			case KpmPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case KpmPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case KpmPackage.IRESOURCE:
				return convertIResourceToString(eDataType, instanceValue);
			case KpmPackage.KERMETA_UNIT_INTEREST:
				return convertKermetaUnitInterestToString(eDataType, instanceValue);
			case KpmPackage.HASHTABLE:
				return convertHashtableToString(eDataType, instanceValue);
			case KpmPackage.IPROGRESS_MONITOR:
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
	public AbstractFile createAbstractFile() {
		AbstractFileImpl abstractFile = new AbstractFileImpl();
		return abstractFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDirectory createAbstractDirectory() {
		AbstractDirectoryImpl abstractDirectory = new AbstractDirectoryImpl();
		return abstractDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProject createAbstractProject() {
		AbstractProjectImpl abstractProject = new AbstractProjectImpl();
		return abstractProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameFilter createNameFilter() {
		NameFilterImpl nameFilter = new NameFilterImpl();
		return nameFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType createDependencyType() {
		DependencyTypeImpl dependencyType = new DependencyTypeImpl();
		return dependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyEvent createDependencyEvent() {
		DependencyEventImpl dependencyEvent = new DependencyEventImpl();
		return dependencyEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistFilter createExistFilter() {
		ExistFilterImpl existFilter = new ExistFilterImpl();
		return existFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFilter createTypeFilter() {
		TypeFilterImpl typeFilter = new TypeFilterImpl();
		return typeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory createDirectory() {
		DirectoryImpl directory = new DirectoryImpl();
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPM createKPM() {
		KPMImpl kpm = new KPMImpl();
		return kpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
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
	public ArrayList createArrayListFromString(EDataType eDataType, String initialValue) {
		return (ArrayList)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createbooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile createIFileFromString(EDataType eDataType, String initialValue) {
		return (IFile)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFolder createIFolderFromString(EDataType eDataType, String initialValue) {
		return (IFolder)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource createIResourceFromString(EDataType eDataType, String initialValue) {
		return (IResource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIResourceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnitInterest createKermetaUnitInterestFromString(EDataType eDataType, String initialValue) {
		return (KermetaUnitInterest)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKermetaUnitInterestToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable createHashtableFromString(EDataType eDataType, String initialValue) {
		return (Hashtable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashtableToString(EDataType eDataType, Object instanceValue) {
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
	public KpmPackage getKpmPackage() {
		return (KpmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static KpmPackage getPackage() {
		return KpmPackage.eINSTANCE;
	}

} //KpmFactoryImpl
