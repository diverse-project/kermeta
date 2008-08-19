/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionSwitch.java,v 1.4 2008-08-19 07:04:46 edaubert Exp $
 */
package option.util;

import java.util.List;

import option.ActivationPolicyDirective;
import option.AttributEntry;
import option.DirectiveEntry;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.ExportPackageDirective;
import option.Extension;
import option.FragmentAttachment;
import option.FragmentHostDirective;
import option.ImportPackageDirective;
import option.IncludeClasses;
import option.IncludePackages;
import option.Language;
import option.Mandatory;
import option.NativeCodeDirective;
import option.OptionPackage;
import option.OsName;
import option.OsVersion;
import option.ParameterEntry;
import option.Processor;
import option.RequireBundleDirective;
import option.Resolution;
import option.SelectionFilter;
import option.Singleton;
import option.SymbolicNameDirective;
import option.Uses;
import option.Visibility;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see option.OptionPackage
 * @generated
 */
public class OptionSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static OptionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OptionSwitch() {
		if (modelPackage == null) {
			modelPackage = OptionPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OptionPackage.PARAMETER_ENTRY: {
				ParameterEntry parameterEntry = (ParameterEntry)theEObject;
				T result = caseParameterEntry(parameterEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.DIRECTIVE_ENTRY: {
				DirectiveEntry directiveEntry = (DirectiveEntry)theEObject;
				T result = caseDirectiveEntry(directiveEntry);
				if (result == null) result = caseParameterEntry(directiveEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.ATTRIBUT_ENTRY: {
				AttributEntry attributEntry = (AttributEntry)theEObject;
				T result = caseAttributEntry(attributEntry);
				if (result == null) result = caseParameterEntry(attributEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.OS_NAME: {
				OsName osName = (OsName)theEObject;
				T result = caseOsName(osName);
				if (result == null) result = caseNativeCodeDirective(osName);
				if (result == null) result = caseDirectiveEntry(osName);
				if (result == null) result = caseParameterEntry(osName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.NATIVE_CODE_DIRECTIVE: {
				NativeCodeDirective nativeCodeDirective = (NativeCodeDirective)theEObject;
				T result = caseNativeCodeDirective(nativeCodeDirective);
				if (result == null) result = caseDirectiveEntry(nativeCodeDirective);
				if (result == null) result = caseParameterEntry(nativeCodeDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.OS_VERSION: {
				OsVersion osVersion = (OsVersion)theEObject;
				T result = caseOsVersion(osVersion);
				if (result == null) result = caseNativeCodeDirective(osVersion);
				if (result == null) result = caseDirectiveEntry(osVersion);
				if (result == null) result = caseParameterEntry(osVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.EXCLUDE_PACKAGES: {
				ExcludePackages excludePackages = (ExcludePackages)theEObject;
				T result = caseExcludePackages(excludePackages);
				if (result == null) result = caseActivationPolicyDirective(excludePackages);
				if (result == null) result = caseDirectiveEntry(excludePackages);
				if (result == null) result = caseParameterEntry(excludePackages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseNativeCodeDirective(processor);
				if (result == null) result = caseDirectiveEntry(processor);
				if (result == null) result = caseParameterEntry(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.INCLUDE_PACKAGES: {
				IncludePackages includePackages = (IncludePackages)theEObject;
				T result = caseIncludePackages(includePackages);
				if (result == null) result = caseActivationPolicyDirective(includePackages);
				if (result == null) result = caseDirectiveEntry(includePackages);
				if (result == null) result = caseParameterEntry(includePackages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.USES: {
				Uses uses = (Uses)theEObject;
				T result = caseUses(uses);
				if (result == null) result = caseExportPackageDirective(uses);
				if (result == null) result = caseDirectiveEntry(uses);
				if (result == null) result = caseParameterEntry(uses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseFragmentHostDirective(extension);
				if (result == null) result = caseDirectiveEntry(extension);
				if (result == null) result = caseParameterEntry(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.MANDATORY: {
				Mandatory mandatory = (Mandatory)theEObject;
				T result = caseMandatory(mandatory);
				if (result == null) result = caseExportPackageDirective(mandatory);
				if (result == null) result = caseDirectiveEntry(mandatory);
				if (result == null) result = caseParameterEntry(mandatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = caseNativeCodeDirective(language);
				if (result == null) result = caseDirectiveEntry(language);
				if (result == null) result = caseParameterEntry(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.VISIBILITY: {
				Visibility visibility = (Visibility)theEObject;
				T result = caseVisibility(visibility);
				if (result == null) result = caseRequireBundleDirective(visibility);
				if (result == null) result = caseDirectiveEntry(visibility);
				if (result == null) result = caseParameterEntry(visibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.SINGLETON: {
				Singleton singleton = (Singleton)theEObject;
				T result = caseSingleton(singleton);
				if (result == null) result = caseSymbolicNameDirective(singleton);
				if (result == null) result = caseDirectiveEntry(singleton);
				if (result == null) result = caseParameterEntry(singleton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.RESOLUTION: {
				Resolution resolution = (Resolution)theEObject;
				T result = caseResolution(resolution);
				if (result == null) result = caseImportPackageDirective(resolution);
				if (result == null) result = caseRequireBundleDirective(resolution);
				if (result == null) result = caseDirectiveEntry(resolution);
				if (result == null) result = caseParameterEntry(resolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.FRAGMENT_ATTACHMENT: {
				FragmentAttachment fragmentAttachment = (FragmentAttachment)theEObject;
				T result = caseFragmentAttachment(fragmentAttachment);
				if (result == null) result = caseSymbolicNameDirective(fragmentAttachment);
				if (result == null) result = caseDirectiveEntry(fragmentAttachment);
				if (result == null) result = caseParameterEntry(fragmentAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.SELECTION_FILTER: {
				SelectionFilter selectionFilter = (SelectionFilter)theEObject;
				T result = caseSelectionFilter(selectionFilter);
				if (result == null) result = caseNativeCodeDirective(selectionFilter);
				if (result == null) result = caseDirectiveEntry(selectionFilter);
				if (result == null) result = caseParameterEntry(selectionFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.REQUIRE_BUNDLE_DIRECTIVE: {
				RequireBundleDirective requireBundleDirective = (RequireBundleDirective)theEObject;
				T result = caseRequireBundleDirective(requireBundleDirective);
				if (result == null) result = caseDirectiveEntry(requireBundleDirective);
				if (result == null) result = caseParameterEntry(requireBundleDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.FRAGMENT_HOST_DIRECTIVE: {
				FragmentHostDirective fragmentHostDirective = (FragmentHostDirective)theEObject;
				T result = caseFragmentHostDirective(fragmentHostDirective);
				if (result == null) result = caseDirectiveEntry(fragmentHostDirective);
				if (result == null) result = caseParameterEntry(fragmentHostDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.SYMBOLIC_NAME_DIRECTIVE: {
				SymbolicNameDirective symbolicNameDirective = (SymbolicNameDirective)theEObject;
				T result = caseSymbolicNameDirective(symbolicNameDirective);
				if (result == null) result = caseDirectiveEntry(symbolicNameDirective);
				if (result == null) result = caseParameterEntry(symbolicNameDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.EXPORT_PACKAGE_DIRECTIVE: {
				ExportPackageDirective exportPackageDirective = (ExportPackageDirective)theEObject;
				T result = caseExportPackageDirective(exportPackageDirective);
				if (result == null) result = caseDirectiveEntry(exportPackageDirective);
				if (result == null) result = caseParameterEntry(exportPackageDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.IMPORT_PACKAGE_DIRECTIVE: {
				ImportPackageDirective importPackageDirective = (ImportPackageDirective)theEObject;
				T result = caseImportPackageDirective(importPackageDirective);
				if (result == null) result = caseRequireBundleDirective(importPackageDirective);
				if (result == null) result = caseDirectiveEntry(importPackageDirective);
				if (result == null) result = caseParameterEntry(importPackageDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.ACTIVATION_POLICY_DIRECTIVE: {
				ActivationPolicyDirective activationPolicyDirective = (ActivationPolicyDirective)theEObject;
				T result = caseActivationPolicyDirective(activationPolicyDirective);
				if (result == null) result = caseDirectiveEntry(activationPolicyDirective);
				if (result == null) result = caseParameterEntry(activationPolicyDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.INCLUDE_CLASSES: {
				IncludeClasses includeClasses = (IncludeClasses)theEObject;
				T result = caseIncludeClasses(includeClasses);
				if (result == null) result = caseExportPackageDirective(includeClasses);
				if (result == null) result = caseDirectiveEntry(includeClasses);
				if (result == null) result = caseParameterEntry(includeClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.EXCLUDE_CLASSES: {
				ExcludeClasses excludeClasses = (ExcludeClasses)theEObject;
				T result = caseExcludeClasses(excludeClasses);
				if (result == null) result = caseExportPackageDirective(excludeClasses);
				if (result == null) result = caseDirectiveEntry(excludeClasses);
				if (result == null) result = caseParameterEntry(excludeClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.CLASS: {
				option.Class class_ = (option.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptionPackage.PACKAGE: {
				option.Package package_ = (option.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterEntry(ParameterEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directive Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directive Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectiveEntry(DirectiveEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribut Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribut Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributEntry(AttributEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Name</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsName(OsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Code Directive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Code Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeCodeDirective(NativeCodeDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Version</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsVersion(OsVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude Packages</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude Packages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludePackages(ExcludePackages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Packages</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Packages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludePackages(IncludePackages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUses(Uses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatory(Mandatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibility(Visibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleton(Singleton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolution(Resolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Attachment</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentAttachment(FragmentAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Filter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionFilter(SelectionFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require Bundle Directive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require Bundle Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequireBundleDirective(RequireBundleDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Host Directive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Host Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentHostDirective(FragmentHostDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Name Directive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Name Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicNameDirective(SymbolicNameDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Package Directive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Package Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportPackageDirective(ExportPackageDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Package Directive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Package Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportPackageDirective(ImportPackageDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Policy Directive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Policy Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationPolicyDirective(ActivationPolicyDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Classes</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeClasses(IncludeClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude Classes</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeClasses(ExcludeClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(option.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(option.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // OptionSwitch
