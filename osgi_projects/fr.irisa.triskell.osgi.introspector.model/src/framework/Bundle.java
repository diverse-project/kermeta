/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bundle.java,v 1.1 2008-07-30 14:08:00 edaubert Exp $
 */
package framework;

import jar.Folder;
import manifest.MANIFEST;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link framework.Bundle#getFragments <em>Fragments</em>}</li>
 * <li>{@link framework.Bundle#getLocation <em>Location</em>}</li>
 * <li>{@link framework.Bundle#getManifest <em>Manifest</em>}</li>
 * <li>{@link framework.Bundle#getSymbolicName <em>Symbolic Name</em>}</li>
 * <li>{@link framework.Bundle#getFolder <em>Folder</em>}</li>
 * <li>{@link framework.Bundle#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 * 
 * @see framework.FrameworkPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends EObject {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link framework.Bundle}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see framework.FrameworkPackage#getBundle_Fragments()
	 * @model
	 * @generated
	 */
	EList<Bundle> getFragments();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute. The
	 * default value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see framework.FrameworkPackage#getBundle_Location()
	 * @model default="" dataType="framework.String" required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link framework.Bundle#getLocation <em>Location</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Manifest</em>' containment reference.
	 * @see #setManifest(MANIFEST)
	 * @see framework.FrameworkPackage#getBundle_Manifest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MANIFEST getManifest();

	/**
	 * Sets the value of the '{@link framework.Bundle#getManifest <em>Manifest</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Manifest</em>' containment
	 *            reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(MANIFEST value);

	/**
	 * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Symbolic Name</em>' attribute.
	 * @see #setSymbolicName(String)
	 * @see framework.FrameworkPackage#getBundle_SymbolicName()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	String getSymbolicName();

	/**
	 * Sets the value of the '{@link framework.Bundle#getSymbolicName <em>Symbolic Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Symbolic Name</em>' attribute.
	 * @see #getSymbolicName()
	 * @generated
	 */
	void setSymbolicName(String value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Folder</em>' containment reference.
	 * @see #setFolder(Folder)
	 * @see framework.FrameworkPackage#getBundle_Folder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Folder getFolder();

	/**
	 * Sets the value of the '{@link framework.Bundle#getFolder <em>Folder</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Folder</em>' containment
	 *            reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(jar.Package)
	 * @see framework.FrameworkPackage#getBundle_Package()
	 * @model containment="true" required="true"
	 * @generated
	 */
	jar.Package getPackage();

	/**
	 * Sets the value of the '{@link framework.Bundle#getPackage <em>Package</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Package</em>' containment
	 *            reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(jar.Package value);

	void addFragment(Bundle bundle);

} // Bundle
