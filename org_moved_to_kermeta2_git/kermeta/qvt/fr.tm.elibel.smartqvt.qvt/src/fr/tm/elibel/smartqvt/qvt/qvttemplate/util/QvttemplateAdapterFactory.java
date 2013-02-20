/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvttemplate.util;

import fr.tm.elibel.smartqvt.qvt.emof.Element;
import fr.tm.elibel.smartqvt.qvt.emof.NamedElement;
import fr.tm.elibel.smartqvt.qvt.emof.TypedElement;

import fr.tm.elibel.smartqvt.qvt.essentialocl.LiteralExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage
 * @generated
 */
public class QvttemplateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QvttemplatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvttemplateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QvttemplatePackage.eINSTANCE;
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
	protected QvttemplateSwitch modelSwitch =
		new QvttemplateSwitch() {
			public Object caseCollectionTemplateExp(CollectionTemplateExp object) {
				return createCollectionTemplateExpAdapter();
			}
			public Object caseObjectTemplateExp(ObjectTemplateExp object) {
				return createObjectTemplateExpAdapter();
			}
			public Object casePropertyTemplateItem(PropertyTemplateItem object) {
				return createPropertyTemplateItemAdapter();
			}
			public Object caseTemplateExp(TemplateExp object) {
				return createTemplateExpAdapter();
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
			public Object caseOclExpression(OclExpression object) {
				return createOclExpressionAdapter();
			}
			public Object caseLiteralExp(LiteralExp object) {
				return createLiteralExpAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp <em>Collection Template Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp
	 * @generated
	 */
	public Adapter createCollectionTemplateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.ObjectTemplateExp <em>Object Template Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.ObjectTemplateExp
	 * @generated
	 */
	public Adapter createObjectTemplateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.PropertyTemplateItem <em>Property Template Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.PropertyTemplateItem
	 * @generated
	 */
	public Adapter createPropertyTemplateItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.TemplateExp <em>Template Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.TemplateExp
	 * @generated
	 */
	public Adapter createTemplateExpAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.LiteralExp
	 * @generated
	 */
	public Adapter createLiteralExpAdapter() {
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

} //QvttemplateAdapterFactory
