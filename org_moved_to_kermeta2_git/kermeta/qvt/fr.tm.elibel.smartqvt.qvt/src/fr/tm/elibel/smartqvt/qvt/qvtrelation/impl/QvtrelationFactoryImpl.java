/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation.impl;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QvtrelationFactoryImpl extends EFactoryImpl implements QvtrelationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QvtrelationFactory init() {
		try {
			QvtrelationFactory theQvtrelationFactory = (QvtrelationFactory)EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/QVT/1.0/qvtrelation.xml"); 
			if (theQvtrelationFactory != null) {
				return theQvtrelationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QvtrelationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtrelationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QvtrelationPackage.DOMAIN_PATTERN: return createDomainPattern();
			case QvtrelationPackage.KEY: return createKey();
			case QvtrelationPackage.RELATION: return createRelation();
			case QvtrelationPackage.RELATION_CALL_EXP: return createRelationCallExp();
			case QvtrelationPackage.RELATION_DOMAIN: return createRelationDomain();
			case QvtrelationPackage.RELATION_DOMAIN_ASSIGNMENT: return createRelationDomainAssignment();
			case QvtrelationPackage.RELATION_IMPLEMENTATION: return createRelationImplementation();
			case QvtrelationPackage.RELATIONAL_TRANSFORMATION: return createRelationalTransformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPattern createDomainPattern() {
		DomainPatternImpl domainPattern = new DomainPatternImpl();
		return domainPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationCallExp createRelationCallExp() {
		RelationCallExpImpl relationCallExp = new RelationCallExpImpl();
		return relationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDomain createRelationDomain() {
		RelationDomainImpl relationDomain = new RelationDomainImpl();
		return relationDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDomainAssignment createRelationDomainAssignment() {
		RelationDomainAssignmentImpl relationDomainAssignment = new RelationDomainAssignmentImpl();
		return relationDomainAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationImplementation createRelationImplementation() {
		RelationImplementationImpl relationImplementation = new RelationImplementationImpl();
		return relationImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTransformation createRelationalTransformation() {
		RelationalTransformationImpl relationalTransformation = new RelationalTransformationImpl();
		return relationalTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtrelationPackage getQvtrelationPackage() {
		return (QvtrelationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static QvtrelationPackage getPackage() {
		return QvtrelationPackage.eINSTANCE;
	}

} //QvtrelationFactoryImpl
