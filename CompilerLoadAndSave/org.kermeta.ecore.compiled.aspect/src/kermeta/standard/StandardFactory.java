/**
 * <copyright>
 * </copyright>
 *
 * $Id: StandardFactory.java,v 1.1 2008-07-02 09:43:42 ftanguy Exp $
 */
package kermeta.standard;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.standard.StandardPackage
 * @generated
 */
public interface StandardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardFactory eINSTANCE = kermeta.standard.impl.StandardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unknown Java Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Java Object</em>'.
	 * @generated
	 */
	UnknownJavaObject createUnknownJavaObject();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	<G> Set<G> createSet();

	/**
	 * Returns a new object of class '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag</em>'.
	 * @generated
	 */
	<G> Bag<G> createBag();

	/**
	 * Returns a new object of class '<em>Ordered Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Set</em>'.
	 * @generated
	 */
	<G> OrderedSet<G> createOrderedSet();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	<G> Sequence<G> createSequence();

	/**
	 * Returns a new object of class '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator</em>'.
	 * @generated
	 */
	<G> Iterator<G> createIterator();

	/**
	 * Returns a new object of class '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void</em>'.
	 * @generated
	 */
	kermeta.standard.Void createVoid();

	/**
	 * Returns a new object of class '<em>Not Comparable Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Comparable Exception</em>'.
	 * @generated
	 */
	NotComparableException createNotComparableException();

	/**
	 * Returns a new object of class '<em>Kermeta Special Types Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kermeta Special Types Alias</em>'.
	 * @generated
	 */
	EObject createKermetaSpecialTypesAlias();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StandardPackage getStandardPackage();

} //StandardFactory
