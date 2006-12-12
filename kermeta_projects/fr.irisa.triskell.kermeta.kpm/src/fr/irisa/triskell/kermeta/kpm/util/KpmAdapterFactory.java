/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmAdapterFactory.java,v 1.2 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.util;

import fr.irisa.triskell.kermeta.kpm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage
 * @generated
 */
public class KpmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KpmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KpmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KpmSwitch modelSwitch =
		new KpmSwitch() {
			public Object caseAbstractFile(AbstractFile object) {
				return createAbstractFileAdapter();
			}
			public Object caseAbstractDirectory(AbstractDirectory object) {
				return createAbstractDirectoryAdapter();
			}
			public Object caseAbstractProject(AbstractProject object) {
				return createAbstractProjectAdapter();
			}
			public Object caseFilter(Filter object) {
				return createFilterAdapter();
			}
			public Object caseNameFilter(NameFilter object) {
				return createNameFilterAdapter();
			}
			public Object caseAbstractUnit(AbstractUnit object) {
				return createAbstractUnitAdapter();
			}
			public Object caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			public Object caseDependencyType(DependencyType object) {
				return createDependencyTypeAdapter();
			}
			public Object caseDependencyEvent(DependencyEvent object) {
				return createDependencyEventAdapter();
			}
			public Object caseExistFilter(ExistFilter object) {
				return createExistFilterAdapter();
			}
			public Object caseTypeFilter(TypeFilter object) {
				return createTypeFilterAdapter();
			}
			public Object caseFile(File object) {
				return createFileAdapter();
			}
			public Object caseDirectory(Directory object) {
				return createDirectoryAdapter();
			}
			public Object caseProject(Project object) {
				return createProjectAdapter();
			}
			public Object caseUnit(Unit object) {
				return createUnitAdapter();
			}
			public Object caseKPM(KPM object) {
				return createKPMAdapter();
			}
			public Object caseAction(Action object) {
				return createActionAdapter();
			}
			public Object caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			public Object caseAnd(And object) {
				return createAndAdapter();
			}
			public Object caseOr(Or object) {
				return createOrAdapter();
			}
			public Object caseAbstractExpression(AbstractExpression object) {
				return createAbstractExpressionAdapter();
			}
			public Object caseSuitedExpression(SuitedExpression object) {
				return createSuitedExpressionAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.AbstractFile <em>Abstract File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractFile
	 * @generated
	 */
	public Adapter createAbstractFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.AbstractDirectory <em>Abstract Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractDirectory
	 * @generated
	 */
	public Adapter createAbstractDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.AbstractProject <em>Abstract Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractProject
	 * @generated
	 */
	public Adapter createAbstractProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.NameFilter <em>Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.NameFilter
	 * @generated
	 */
	public Adapter createNameFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.AbstractUnit <em>Abstract Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractUnit
	 * @generated
	 */
	public Adapter createAbstractUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyType
	 * @generated
	 */
	public Adapter createDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.DependencyEvent <em>Dependency Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyEvent
	 * @generated
	 */
	public Adapter createDependencyEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.ExistFilter <em>Exist Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.ExistFilter
	 * @generated
	 */
	public Adapter createExistFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter <em>Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.TypeFilter
	 * @generated
	 */
	public Adapter createTypeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.KPM <em>KPM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM
	 * @generated
	 */
	public Adapter createKPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression <em>Abstract Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractExpression
	 * @generated
	 */
	public Adapter createAbstractExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.SuitedExpression <em>Suited Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.SuitedExpression
	 * @generated
	 */
	public Adapter createSuitedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KpmAdapterFactory
