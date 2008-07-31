/**
 * <copyright>
 * </copyright>
 *
 * $Id: Framework.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package framework;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link framework.Framework#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see framework.FrameworkPackage#getFramework()
 * @model
 * @generated
 */
public interface Framework extends EObject {
	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link framework.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundles</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' containment reference list.
	 * @see framework.FrameworkPackage#getFramework_Bundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bundle> getBundles();

	boolean addBundle(Bundle bundle);

} // Framework
