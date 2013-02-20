/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.util;

import fr.tm.elibel.smartqvt.qvt.emof.Element;
import fr.tm.elibel.smartqvt.qvt.emof.MultiplicityElement;
import fr.tm.elibel.smartqvt.qvt.emof.NamedElement;
import fr.tm.elibel.smartqvt.qvt.emof.Operation;
import fr.tm.elibel.smartqvt.qvt.emof.Parameter;
import fr.tm.elibel.smartqvt.qvt.emof.Property;
import fr.tm.elibel.smartqvt.qvt.emof.Type;
import fr.tm.elibel.smartqvt.qvt.emof.TypedElement;

import fr.tm.elibel.smartqvt.qvt.essentialocl.CallExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.FeatureCallExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeExpression;
import fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage
 * @generated
 */
public class QvtoperationalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QvtoperationalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtoperationalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QvtoperationalPackage.eINSTANCE;
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
	protected QvtoperationalSwitch modelSwitch =
		new QvtoperationalSwitch() {
			public Object caseConstructor(Constructor object) {
				return createConstructorAdapter();
			}
			public Object caseConstructorBody(ConstructorBody object) {
				return createConstructorBodyAdapter();
			}
			public Object caseContextualProperty(ContextualProperty object) {
				return createContextualPropertyAdapter();
			}
			public Object caseEntryOperation(EntryOperation object) {
				return createEntryOperationAdapter();
			}
			public Object caseHelper(Helper object) {
				return createHelperAdapter();
			}
			public Object caseImperativeCallExp(ImperativeCallExp object) {
				return createImperativeCallExpAdapter();
			}
			public Object caseImperativeOperation(ImperativeOperation object) {
				return createImperativeOperationAdapter();
			}
			public Object caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			public Object caseMappingBody(MappingBody object) {
				return createMappingBodyAdapter();
			}
			public Object caseMappingCallExp(MappingCallExp object) {
				return createMappingCallExpAdapter();
			}
			public Object caseMappingOperation(MappingOperation object) {
				return createMappingOperationAdapter();
			}
			public Object caseMappingParameter(MappingParameter object) {
				return createMappingParameterAdapter();
			}
			public Object caseModelParameter(ModelParameter object) {
				return createModelParameterAdapter();
			}
			public Object caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			public Object caseModule(Module object) {
				return createModuleAdapter();
			}
			public Object caseModuleImport(ModuleImport object) {
				return createModuleImportAdapter();
			}
			public Object caseObjectExp(ObjectExp object) {
				return createObjectExpAdapter();
			}
			public Object caseOperationBody(OperationBody object) {
				return createOperationBodyAdapter();
			}
			public Object caseOperationalTransformation(OperationalTransformation object) {
				return createOperationalTransformationAdapter();
			}
			public Object caseResolveExp(ResolveExp object) {
				return createResolveExpAdapter();
			}
			public Object caseResolveInExp(ResolveInExp object) {
				return createResolveInExpAdapter();
			}
			public Object caseVarParameter(VarParameter object) {
				return createVarParameterAdapter();
			}
			public Object caseObject(fr.tm.elibel.smartqvt.qvt.emof.Object object) {
				return createObjectAdapter();
			}
			public Object caseElement(Element object) {
				return createElementAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			public Object caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			public Object caseOperation(Operation object) {
				return createOperationAdapter();
			}
			public Object caseProperty(Property object) {
				return createPropertyAdapter();
			}
			public Object caseOclExpression(OclExpression object) {
				return createOclExpressionAdapter();
			}
			public Object caseCallExp(CallExp object) {
				return createCallExpAdapter();
			}
			public Object caseFeatureCallExp(FeatureCallExp object) {
				return createFeatureCallExpAdapter();
			}
			public Object caseOperationCallExp(OperationCallExp object) {
				return createOperationCallExpAdapter();
			}
			public Object caseType(Type object) {
				return createTypeAdapter();
			}
			public Object caseClass(fr.tm.elibel.smartqvt.qvt.emof.Class object) {
				return createClassAdapter();
			}
			public Object casePackage(fr.tm.elibel.smartqvt.qvt.emof.Package object) {
				return createPackageAdapter();
			}
			public Object caseVariable(Variable object) {
				return createVariableAdapter();
			}
			public Object caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			public Object caseImperativeExpression(ImperativeExpression object) {
				return createImperativeExpressionAdapter();
			}
			public Object caseInstantiationExp(InstantiationExp object) {
				return createInstantiationExpAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ConstructorBody <em>Constructor Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ConstructorBody
	 * @generated
	 */
	public Adapter createConstructorBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty <em>Contextual Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty
	 * @generated
	 */
	public Adapter createContextualPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.EntryOperation <em>Entry Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.EntryOperation
	 * @generated
	 */
	public Adapter createEntryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Helper
	 * @generated
	 */
	public Adapter createHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeCallExp <em>Imperative Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeCallExp
	 * @generated
	 */
	public Adapter createImperativeCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation <em>Imperative Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation
	 * @generated
	 */
	public Adapter createImperativeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody <em>Mapping Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody
	 * @generated
	 */
	public Adapter createMappingBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp <em>Mapping Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp
	 * @generated
	 */
	public Adapter createMappingCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation <em>Mapping Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation
	 * @generated
	 */
	public Adapter createMappingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter <em>Mapping Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter
	 * @generated
	 */
	public Adapter createMappingParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelParameter
	 * @generated
	 */
	public Adapter createModelParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport
	 * @generated
	 */
	public Adapter createModuleImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp <em>Object Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp
	 * @generated
	 */
	public Adapter createObjectExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody <em>Operation Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody
	 * @generated
	 */
	public Adapter createOperationBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation <em>Operational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation
	 * @generated
	 */
	public Adapter createOperationalTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp <em>Resolve Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp
	 * @generated
	 */
	public Adapter createResolveExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp <em>Resolve In Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp
	 * @generated
	 */
	public Adapter createResolveInExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter <em>Var Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter
	 * @generated
	 */
	public Adapter createVarParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression
	 * @generated
	 */
	public Adapter createOclExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.CallExp
	 * @generated
	 */
	public Adapter createCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.FeatureCallExp <em>Feature Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.FeatureCallExp
	 * @generated
	 */
	public Adapter createFeatureCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeExpression <em>Imperative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeExpression
	 * @generated
	 */
	public Adapter createImperativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp <em>Instantiation Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp
	 * @generated
	 */
	public Adapter createInstantiationExpAdapter() {
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

} //QvtoperationalAdapterFactory
