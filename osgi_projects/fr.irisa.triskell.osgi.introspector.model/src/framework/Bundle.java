/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bundle.java,v 1.5 2008-08-19 07:04:41 edaubert Exp $
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
 *   <li>{@link framework.Bundle#getFragments <em>Fragments</em>}</li>
 *   <li>{@link framework.Bundle#getLocation <em>Location</em>}</li>
 *   <li>{@link framework.Bundle#getManifest <em>Manifest</em>}</li>
 *   <li>{@link framework.Bundle#getFragmentsReference <em>Fragments Reference</em>}</li>
 *   <li>{@link framework.Bundle#getId <em>Id</em>}</li>
 *   <li>{@link framework.Bundle#getFolder <em>Folder</em>}</li>
 *   <li>{@link framework.Bundle#getPackage <em>Package</em>}</li>
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
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see framework.FrameworkPackage#getBundle_Location()
	 * @model default="" dataType="framework.String" required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link framework.Bundle#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest</em>' containment reference.
	 * @see #setManifest(MANIFEST)
	 * @see framework.FrameworkPackage#getBundle_Manifest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MANIFEST getManifest();

	/**
	 * Sets the value of the '{@link framework.Bundle#getManifest <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest</em>' containment reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(MANIFEST value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference.
	 * @see #setFolder(Folder)
	 * @see framework.FrameworkPackage#getBundle_Folder()
	 * @model containment="true"
	 * @generated
	 */
	Folder getFolder();

	/**
	 * Sets the value of the '{@link framework.Bundle#getFolder <em>Folder</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' containment reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(jar.Package)
	 * @see framework.FrameworkPackage#getBundle_Package()
	 * @model containment="true"
	 * @generated
	 */
	jar.Package getPackage();

	/**
	 * Sets the value of the '{@link framework.Bundle#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(jar.Package value);

	/**
	 * Returns the value of the '<em><b>Fragments Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments Reference</em>' attribute list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments Reference</em>' attribute list.
	 * @see framework.FrameworkPackage#getBundle_FragmentsReference()
	 * @model dataType="framework.String"
	 * @generated
	 */
	EList<String> getFragmentsReference();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see framework.FrameworkPackage#getBundle_Id()
	 * @model dataType="framework.long" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link framework.Bundle#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	boolean addFragment(Bundle bundle);

	boolean addFragmentReference(String bundleReference);

} // Bundle
