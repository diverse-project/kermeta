/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmSwitch.java,v 1.2 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.util;

import fr.irisa.triskell.kermeta.kpm.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage
 * @generated
 */
public class KpmSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KpmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpmSwitch() {
		if (modelPackage == null) {
			modelPackage = KpmPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KpmPackage.ABSTRACT_FILE: {
				AbstractFile abstractFile = (AbstractFile)theEObject;
				Object result = caseAbstractFile(abstractFile);
				if (result == null) result = caseAbstractUnit(abstractFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.ABSTRACT_DIRECTORY: {
				AbstractDirectory abstractDirectory = (AbstractDirectory)theEObject;
				Object result = caseAbstractDirectory(abstractDirectory);
				if (result == null) result = caseAbstractUnit(abstractDirectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.ABSTRACT_PROJECT: {
				AbstractProject abstractProject = (AbstractProject)theEObject;
				Object result = caseAbstractProject(abstractProject);
				if (result == null) result = caseAbstractUnit(abstractProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				Object result = caseFilter(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.NAME_FILTER: {
				NameFilter nameFilter = (NameFilter)theEObject;
				Object result = caseNameFilter(nameFilter);
				if (result == null) result = caseFilter(nameFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.ABSTRACT_UNIT: {
				AbstractUnit abstractUnit = (AbstractUnit)theEObject;
				Object result = caseAbstractUnit(abstractUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				Object result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.DEPENDENCY_TYPE: {
				DependencyType dependencyType = (DependencyType)theEObject;
				Object result = caseDependencyType(dependencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.DEPENDENCY_EVENT: {
				DependencyEvent dependencyEvent = (DependencyEvent)theEObject;
				Object result = caseDependencyEvent(dependencyEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.EXIST_FILTER: {
				ExistFilter existFilter = (ExistFilter)theEObject;
				Object result = caseExistFilter(existFilter);
				if (result == null) result = caseFilter(existFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.TYPE_FILTER: {
				TypeFilter typeFilter = (TypeFilter)theEObject;
				Object result = caseTypeFilter(typeFilter);
				if (result == null) result = caseFilter(typeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.FILE: {
				File file = (File)theEObject;
				Object result = caseFile(file);
				if (result == null) result = caseUnit(file);
				if (result == null) result = caseAbstractFile(file);
				if (result == null) result = caseAbstractUnit(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.DIRECTORY: {
				Directory directory = (Directory)theEObject;
				Object result = caseDirectory(directory);
				if (result == null) result = caseUnit(directory);
				if (result == null) result = caseAbstractDirectory(directory);
				if (result == null) result = caseAbstractUnit(directory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.PROJECT: {
				Project project = (Project)theEObject;
				Object result = caseProject(project);
				if (result == null) result = caseUnit(project);
				if (result == null) result = caseAbstractProject(project);
				if (result == null) result = caseAbstractUnit(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				Object result = caseUnit(unit);
				if (result == null) result = caseAbstractUnit(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.KPM: {
				KPM kpm = (KPM)theEObject;
				Object result = caseKPM(kpm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.ACTION: {
				Action action = (Action)theEObject;
				Object result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = caseAbstractExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.AND: {
				And and = (And)theEObject;
				Object result = caseAnd(and);
				if (result == null) result = caseAbstractExpression(and);
				if (result == null) result = caseSuitedExpression(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.OR: {
				Or or = (Or)theEObject;
				Object result = caseOr(or);
				if (result == null) result = caseAbstractExpression(or);
				if (result == null) result = caseSuitedExpression(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.ABSTRACT_EXPRESSION: {
				AbstractExpression abstractExpression = (AbstractExpression)theEObject;
				Object result = caseAbstractExpression(abstractExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.SUITED_EXPRESSION: {
				SuitedExpression suitedExpression = (SuitedExpression)theEObject;
				Object result = caseSuitedExpression(suitedExpression);
				if (result == null) result = caseAbstractExpression(suitedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractFile(AbstractFile object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractDirectory(AbstractDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractProject(AbstractProject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Name Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Name Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameFilter(NameFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractUnit(AbstractUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependencyType(DependencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependencyEvent(DependencyEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Exist Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Exist Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExistFilter(ExistFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeFilter(TypeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDirectory(Directory object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>KPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>KPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseKPM(KPM object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractExpression(AbstractExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Suited Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Suited Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSuitedExpression(SuitedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //KpmSwitch
