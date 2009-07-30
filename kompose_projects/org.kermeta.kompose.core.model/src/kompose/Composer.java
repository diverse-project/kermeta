/**
 * <copyright>
 * </copyright>
 *
 * $Id: Composer.java,v 1.4 2009-02-08 14:32:28 mclavreu Exp $
 */
package kompose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Composer#getPredirectivesPM <em>Predirectives PM</em>}</li>
 *   <li>{@link kompose.Composer#getPostdirectives <em>Postdirectives</em>}</li>
 *   <li>{@link kompose.Composer#getPrimaryModelURI <em>Primary Model URI</em>}</li>
 *   <li>{@link kompose.Composer#getAspectModelURI <em>Aspect Model URI</em>}</li>
 *   <li>{@link kompose.Composer#getComposedModelURI <em>Composed Model URI</em>}</li>
 *   <li>{@link kompose.Composer#getPredirectivesAM <em>Predirectives AM</em>}</li>
 *   <li>{@link kompose.Composer#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link kompose.Composer#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getComposer()
 * @model
 * @generated
 */
public interface Composer extends EObject {
	/**
	 * Returns the value of the '<em><b>Predirectives PM</b></em>' containment reference list.
	 * The list contents are of type {@link kompose.ElementDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predirectives PM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predirectives PM</em>' containment reference list.
	 * @see kompose.KomposePackage#getComposer_PredirectivesPM()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDirective> getPredirectivesPM();

	/**
	 * Returns the value of the '<em><b>Postdirectives</b></em>' containment reference list.
	 * The list contents are of type {@link kompose.ElementDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postdirectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postdirectives</em>' containment reference list.
	 * @see kompose.KomposePackage#getComposer_Postdirectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDirective> getPostdirectives();

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
	 * @see kompose.KomposePackage#getComposer_PrimaryModelURI()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getPrimaryModelURI();

	/**
	 * Sets the value of the '{@link kompose.Composer#getPrimaryModelURI <em>Primary Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Model URI</em>' attribute.
	 * @see #getPrimaryModelURI()
	 * @generated
	 */
	void setPrimaryModelURI(String value);

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
	 * @see kompose.KomposePackage#getComposer_AspectModelURI()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getAspectModelURI();

	/**
	 * Sets the value of the '{@link kompose.Composer#getAspectModelURI <em>Aspect Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Model URI</em>' attribute.
	 * @see #getAspectModelURI()
	 * @generated
	 */
	void setAspectModelURI(String value);

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
	 * @see kompose.KomposePackage#getComposer_ComposedModelURI()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getComposedModelURI();

	/**
	 * Sets the value of the '{@link kompose.Composer#getComposedModelURI <em>Composed Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Model URI</em>' attribute.
	 * @see #getComposedModelURI()
	 * @generated
	 */
	void setComposedModelURI(String value);

	/**
	 * Returns the value of the '<em><b>Predirectives AM</b></em>' containment reference list.
	 * The list contents are of type {@link kompose.ElementDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predirectives AM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predirectives AM</em>' containment reference list.
	 * @see kompose.KomposePackage#getComposer_PredirectivesAM()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDirective> getPredirectivesAM();

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
	 * @see kompose.KomposePackage#getComposer_MetamodelName()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getMetamodelName();

	/**
	 * Sets the value of the '{@link kompose.Composer#getMetamodelName <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Name</em>' attribute.
	 * @see #getMetamodelName()
	 * @generated
	 */
	void setMetamodelName(String value);

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
	 * @see kompose.KomposePackage#getComposer_Mode()
	 * @model
	 * @generated
	 */
	Modes getMode();

	/**
	 * Sets the value of the '{@link kompose.Composer#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kompose.Modes
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Modes value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Mergeable compose();

} // Composer
