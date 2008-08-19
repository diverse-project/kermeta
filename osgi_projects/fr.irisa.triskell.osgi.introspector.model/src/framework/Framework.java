/**
 * <copyright>
 * </copyright>
 *
 * $Id: Framework.java,v 1.5 2008-08-19 07:04:41 edaubert Exp $
 */
package framework;

import java.util.List;

import manifest.Version;

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

	/**
	 * This function is used to get all bundles which is defined by the
	 * symbolicName
	 * 
	 * @param symbolicName
	 *            the Bundle-SymbolicName which define a bundle
	 * @return null if there is no bundle define with the symbolicName, a list
	 *         which contains bundles else
	 */
	List<Bundle> findBundles(String symbolicName);

	Bundle findBundle(String symbolicName, Version version);

	Bundle getBundle(long id);

} // Framework
