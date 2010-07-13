/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;

import directives.CompositionDirective;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Context#getMode <em>Mode</em>}</li>
 *   <li>{@link kompose.Context#getComposedModelURI <em>Composed Model URI</em>}</li>
 *   <li>{@link kompose.Context#getAspectModelURI <em>Aspect Model URI</em>}</li>
 *   <li>{@link kompose.Context#getPrimaryModelURI <em>Primary Model URI</em>}</li>
 *   <li>{@link kompose.Context#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link kompose.Context#getPredirectivesPM <em>Predirectives PM</em>}</li>
 *   <li>{@link kompose.Context#getPredirectivesAM <em>Predirectives AM</em>}</li>
 *   <li>{@link kompose.Context#getPostdirectives <em>Postdirectives</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link kompose.Modes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see kompose.Modes
	 * @see #setMode(Modes)
	 * @see kompose.KomposePackage#getContext_Mode()
	 * @model required="true"
	 * @generated
	 */
	Modes getMode();

	/**
	 * Sets the value of the '{@link kompose.Context#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kompose.Modes
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Modes value);

	/**
	 * Returns the value of the '<em><b>Composed Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Model URI</em>' attribute.
	 * @see #setComposedModelURI(String)
	 * @see kompose.KomposePackage#getContext_ComposedModelURI()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getComposedModelURI();

	/**
	 * Sets the value of the '{@link kompose.Context#getComposedModelURI <em>Composed Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Model URI</em>' attribute.
	 * @see #getComposedModelURI()
	 * @generated
	 */
	void setComposedModelURI(String value);

	/**
	 * Returns the value of the '<em><b>Aspect Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Model URI</em>' attribute.
	 * @see #setAspectModelURI(String)
	 * @see kompose.KomposePackage#getContext_AspectModelURI()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getAspectModelURI();

	/**
	 * Sets the value of the '{@link kompose.Context#getAspectModelURI <em>Aspect Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Model URI</em>' attribute.
	 * @see #getAspectModelURI()
	 * @generated
	 */
	void setAspectModelURI(String value);

	/**
	 * Returns the value of the '<em><b>Primary Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Model URI</em>' attribute.
	 * @see #setPrimaryModelURI(String)
	 * @see kompose.KomposePackage#getContext_PrimaryModelURI()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getPrimaryModelURI();

	/**
	 * Sets the value of the '{@link kompose.Context#getPrimaryModelURI <em>Primary Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Model URI</em>' attribute.
	 * @see #getPrimaryModelURI()
	 * @generated
	 */
	void setPrimaryModelURI(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Name</em>' attribute.
	 * @see #setMetamodelName(String)
	 * @see kompose.KomposePackage#getContext_MetamodelName()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getMetamodelName();

	/**
	 * Sets the value of the '{@link kompose.Context#getMetamodelName <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Name</em>' attribute.
	 * @see #getMetamodelName()
	 * @generated
	 */
	void setMetamodelName(String value);

	/**
	 * Returns the value of the '<em><b>Postdirectives</b></em>' containment reference list.
	 * The list contents are of type {@link directives.CompositionDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postdirectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postdirectives</em>' containment reference list.
	 * @see kompose.KomposePackage#getContext_Postdirectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionDirective> getPostdirectives();

	/**
	 * Returns the value of the '<em><b>Predirectives PM</b></em>' containment reference list.
	 * The list contents are of type {@link directives.CompositionDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predirectives PM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predirectives PM</em>' containment reference list.
	 * @see kompose.KomposePackage#getContext_PredirectivesPM()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionDirective> getPredirectivesPM();

	/**
	 * Returns the value of the '<em><b>Predirectives AM</b></em>' containment reference list.
	 * The list contents are of type {@link directives.CompositionDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predirectives AM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predirectives AM</em>' containment reference list.
	 * @see kompose.KomposePackage#getContext_PredirectivesAM()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionDirective> getPredirectivesAM();

} // Context
