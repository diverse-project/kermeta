/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanguageFactory.java,v 1.5 2008-10-16 13:18:08 cfaucher Exp $
 */
package kermeta.language;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.language.LanguagePackage
 * @generated
 */
public interface LanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguageFactory eINSTANCE = kermeta.language.impl.LanguageFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Reflective Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflective Collection</em>'.
	 * @generated
	 */
	<G> ReflectiveCollection<G> createReflectiveCollection();

	/**
	 * Returns a new object of class '<em>Reflective Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflective Sequence</em>'.
	 * @generated
	 */
	<G> ReflectiveSequence<G> createReflectiveSequence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LanguagePackage getLanguagePackage();

} //LanguageFactory
