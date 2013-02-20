/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvttemplate.impl;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.*;

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
public class QvttemplateFactoryImpl extends EFactoryImpl implements QvttemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QvttemplateFactory init() {
		try {
			QvttemplateFactory theQvttemplateFactory = (QvttemplateFactory)EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/QVT/1.0/qvttemplate.xml"); 
			if (theQvttemplateFactory != null) {
				return theQvttemplateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QvttemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvttemplateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP: return createCollectionTemplateExp();
			case QvttemplatePackage.OBJECT_TEMPLATE_EXP: return createObjectTemplateExp();
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM: return createPropertyTemplateItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTemplateExp createCollectionTemplateExp() {
		CollectionTemplateExpImpl collectionTemplateExp = new CollectionTemplateExpImpl();
		return collectionTemplateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplateExp createObjectTemplateExp() {
		ObjectTemplateExpImpl objectTemplateExp = new ObjectTemplateExpImpl();
		return objectTemplateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTemplateItem createPropertyTemplateItem() {
		PropertyTemplateItemImpl propertyTemplateItem = new PropertyTemplateItemImpl();
		return propertyTemplateItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvttemplatePackage getQvttemplatePackage() {
		return (QvttemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static QvttemplatePackage getPackage() {
		return QvttemplatePackage.eINSTANCE;
	}

} //QvttemplateFactoryImpl
