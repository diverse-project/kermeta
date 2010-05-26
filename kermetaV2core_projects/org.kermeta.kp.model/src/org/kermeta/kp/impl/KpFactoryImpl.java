/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.kp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KpFactoryImpl extends EFactoryImpl implements KpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KpFactory init() {
		try {
			KpFactory theKpFactory = (KpFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kp/1.0.0"); 
			if (theKpFactory != null) {
				return theKpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KpPackage.KERMETA_PROJECT: return createKermetaProject();
			case KpPackage.DEPENDENCY: return createDependency();
			case KpPackage.NAMED_ELEMENT: return createNamedElement();
			case KpPackage.SOURCE_FOLDER: return createSourceFolder();
			case KpPackage.SOURCE_FILE: return createSourceFile();
			case KpPackage.SOURCE_NSURI: return createSourceNSURI();
			case KpPackage.SOURCE_QUERY: return createSourceQuery();
			case KpPackage.WEAVE_DIRECTIVE: return createWeaveDirective();
			case KpPackage.OPTION: return createOption();
			case KpPackage.EXPRESSION: return createExpression();
			case KpPackage.STRING_EXPRESSION: return createStringExpression();
			case KpPackage.ECLASS0: return createEClass0();
			case KpPackage.MIX_EXPRESSION: return createMixExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaProject createKermetaProject() {
		KermetaProjectImpl kermetaProject = new KermetaProjectImpl();
		return kermetaProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFolder createSourceFolder() {
		SourceFolderImpl sourceFolder = new SourceFolderImpl();
		return sourceFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNSURI createSourceNSURI() {
		SourceNSURIImpl sourceNSURI = new SourceNSURIImpl();
		return sourceNSURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceQuery createSourceQuery() {
		SourceQueryImpl sourceQuery = new SourceQueryImpl();
		return sourceQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaveDirective createWeaveDirective() {
		WeaveDirectiveImpl weaveDirective = new WeaveDirectiveImpl();
		return weaveDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass0 createEClass0() {
		EClass0Impl eClass0 = new EClass0Impl();
		return eClass0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixExpression createMixExpression() {
		MixExpressionImpl mixExpression = new MixExpressionImpl();
		return mixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpPackage getKpPackage() {
		return (KpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KpPackage getPackage() {
		return KpPackage.eINSTANCE;
	}

} //KpFactoryImpl
