/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestPackage.java,v 1.2 2008-03-05 07:58:39 ftanguy Exp $
 */
package org.kermeta.model.interest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This metamodel describes in a simple manner the interest that objects can have for specific resources.
 * A resource can be anything (files, objects in memory) for the moment they have an id.
 * <!-- end-model-doc -->
 * @see org.kermeta.model.interest.InterestFactory
 * @model kind="package"
 * @generated
 */
public interface InterestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://interest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterestPackage eINSTANCE = org.kermeta.model.interest.impl.InterestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.model.interest.impl.InterestHostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.model.interest.impl.InterestHostImpl
	 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getInterestHost()
	 * @generated
	 */
	int INTEREST_HOST = 0;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_HOST__CONCERNS = 0;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_HOST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.model.interest.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.model.interest.impl.ConcernImpl
	 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ID = 0;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__LISTENERS = 1;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.model.interest.impl.WorriedObjectImpl <em>Worried Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.model.interest.impl.WorriedObjectImpl
	 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getWorriedObject()
	 * @generated
	 */
	int WORRIED_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORRIED_OBJECT__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Worried Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORRIED_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Id Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.interest.exception.IdNotFoundException
	 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getIdNotFoundException()
	 * @generated
	 */
	int ID_NOT_FOUND_EXCEPTION = 3;

	/**
	 * The meta object id for the '<em>Interested Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.interest.InterestedObject
	 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getInterestedObject()
	 * @generated
	 */
	int INTERESTED_OBJECT = 4;


	/**
	 * Returns the meta object for class '{@link org.kermeta.model.interest.InterestHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see org.kermeta.model.interest.InterestHost
	 * @generated
	 */
	EClass getInterestHost();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.model.interest.InterestHost#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.kermeta.model.interest.InterestHost#getConcerns()
	 * @see #getInterestHost()
	 * @generated
	 */
	EReference getInterestHost_Concerns();

	/**
	 * Returns the meta object for class '{@link org.kermeta.model.interest.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see org.kermeta.model.interest.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.model.interest.Concern#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.model.interest.Concern#getId()
	 * @see #getConcern()
	 * @generated
	 */
	EAttribute getConcern_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.model.interest.Concern#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listeners</em>'.
	 * @see org.kermeta.model.interest.Concern#getListeners()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_Listeners();

	/**
	 * Returns the meta object for class '{@link org.kermeta.model.interest.WorriedObject <em>Worried Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worried Object</em>'.
	 * @see org.kermeta.model.interest.WorriedObject
	 * @generated
	 */
	EClass getWorriedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.model.interest.WorriedObject#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.kermeta.model.interest.WorriedObject#getTarget()
	 * @see #getWorriedObject()
	 * @generated
	 */
	EAttribute getWorriedObject_Target();

	/**
	 * Returns the meta object for data type '{@link org.kermeta.interest.exception.IdNotFoundException <em>Id Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Not Found Exception</em>'.
	 * @see org.kermeta.interest.exception.IdNotFoundException
	 * @model instanceClass="org.kermeta.interest.exception.IdNotFoundException"
	 * @generated
	 */
	EDataType getIdNotFoundException();

	/**
	 * Returns the meta object for data type '{@link org.kermeta.interest.InterestedObject <em>Interested Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interested Object</em>'.
	 * @see org.kermeta.interest.InterestedObject
	 * @model instanceClass="org.kermeta.interest.InterestedObject"
	 * @generated
	 */
	EDataType getInterestedObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterestFactory getInterestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.model.interest.impl.InterestHostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.model.interest.impl.InterestHostImpl
		 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getInterestHost()
		 * @generated
		 */
		EClass INTEREST_HOST = eINSTANCE.getInterestHost();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEREST_HOST__CONCERNS = eINSTANCE.getInterestHost_Concerns();

		/**
		 * The meta object literal for the '{@link org.kermeta.model.interest.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.model.interest.impl.ConcernImpl
		 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getConcern()
		 * @generated
		 */
		EClass CONCERN = eINSTANCE.getConcern();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN__ID = eINSTANCE.getConcern_Id();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__LISTENERS = eINSTANCE.getConcern_Listeners();

		/**
		 * The meta object literal for the '{@link org.kermeta.model.interest.impl.WorriedObjectImpl <em>Worried Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.model.interest.impl.WorriedObjectImpl
		 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getWorriedObject()
		 * @generated
		 */
		EClass WORRIED_OBJECT = eINSTANCE.getWorriedObject();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORRIED_OBJECT__TARGET = eINSTANCE.getWorriedObject_Target();

		/**
		 * The meta object literal for the '<em>Id Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.interest.exception.IdNotFoundException
		 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getIdNotFoundException()
		 * @generated
		 */
		EDataType ID_NOT_FOUND_EXCEPTION = eINSTANCE.getIdNotFoundException();

		/**
		 * The meta object literal for the '<em>Interested Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.interest.InterestedObject
		 * @see org.kermeta.model.interest.impl.InterestPackageImpl#getInterestedObject()
		 * @generated
		 */
		EDataType INTERESTED_OBJECT = eINSTANCE.getInterestedObject();

	}

} //InterestPackage
