/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaFactory.java,v 1.3 2008-09-22 14:49:02 cfaucher Exp $
 */
package km2ecore.helper.kermeta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see km2ecore.helper.kermeta.KermetaPackage
 * @generated
 */
public interface KermetaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KermetaFactory eINSTANCE = km2ecore.helper.kermeta.impl.KermetaFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Constraint Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Helper</em>'.
	 * @generated
	 */
	ConstraintHelper createConstraintHelper();

	/**
	 * Returns a new object of class '<em>Generic Type Definition Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Type Definition Helper</em>'.
	 * @generated
	 */
	GenericTypeDefinitionHelper createGenericTypeDefinitionHelper();

	/**
	 * Returns a new object of class '<em>Compiler Helper Java</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compiler Helper Java</em>'.
	 * @generated
	 */
	CompilerHelperJava createCompilerHelperJava();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KermetaPackage getKermetaPackage();

} //KermetaFactory
