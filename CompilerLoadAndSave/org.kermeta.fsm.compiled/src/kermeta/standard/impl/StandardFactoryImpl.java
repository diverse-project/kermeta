/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: StandardFactoryImpl.java,v 1.2 2008-07-25 12:40:04 ftanguy Exp $
 */
package kermeta.standard.impl;

import kermeta.standard.Bag;
import kermeta.standard.Iterator;
import kermeta.standard.NotComparableException;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardFactory;
import kermeta.standard.StandardPackage;
import kermeta.standard.UnknownJavaObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class StandardFactoryImpl extends EFactoryImpl implements StandardFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static StandardFactory init()
  {
		try {
			StandardFactory theStandardFactory = (StandardFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kermeta/standard/kermeta_temp_uri"); 
			if (theStandardFactory != null) {
				return theStandardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StandardFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StandardFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case StandardPackage.SET: return createSet();
			case StandardPackage.BAG: return createBag();
			case StandardPackage.ORDERED_SET: return createOrderedSet();
			case StandardPackage.SEQUENCE: return createSequence();
			case StandardPackage.ITERATOR: return createIterator();
			case StandardPackage.VOID: return createVoid();
			case StandardPackage.NOT_COMPARABLE_EXCEPTION: return createNotComparableException();
			case StandardPackage.UNKNOWN_JAVA_OBJECT: return createUnknownJavaObject();
			case StandardPackage.KERMETA_SPECIAL_TYPES_ALIAS: return (EObject)createKermetaSpecialTypesAlias();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case StandardPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case StandardPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case StandardPackage.REAL:
				return createRealFromString(eDataType, initialValue);
			case StandardPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case StandardPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case StandardPackage.UNLIMITED_NATURAL:
				return createUnlimitedNaturalFromString(eDataType, initialValue);
			case StandardPackage.JAVA_ITERATOR:
				return createJavaIteratorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case StandardPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case StandardPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case StandardPackage.REAL:
				return convertRealToString(eDataType, instanceValue);
			case StandardPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case StandardPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case StandardPackage.UNLIMITED_NATURAL:
				return convertUnlimitedNaturalToString(eDataType, instanceValue);
			case StandardPackage.JAVA_ITERATOR:
				return convertJavaIteratorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public <G> Set<G> createSet()
  {
		SetImpl<G> set = new SetImpl<G>();
		return set;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public <G> Bag<G> createBag()
  {
		BagImpl<G> bag = new BagImpl<G>();
		return bag;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public <G> OrderedSet<G> createOrderedSet()
  {
		OrderedSetImpl<G> orderedSet = new OrderedSetImpl<G>();
		return orderedSet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public <G> Sequence<G> createSequence()
  {
		SequenceImpl<G> sequence = new SequenceImpl<G>();
		return sequence;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public <G> Iterator<G> createIterator()
  {
		IteratorImpl<G> iterator = new IteratorImpl<G>();
		return iterator;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public kermeta.standard.Void createVoid()
  {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotComparableException createNotComparableException()
  {
		NotComparableExceptionImpl notComparableException = new NotComparableExceptionImpl();
		return notComparableException;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UnknownJavaObject createUnknownJavaObject()
  {
		UnknownJavaObjectImpl unknownJavaObject = new UnknownJavaObjectImpl();
		return unknownJavaObject;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject createKermetaSpecialTypesAlias()
  {
		KermetaSpecialTypesAliasImpl kermetaSpecialTypesAlias = new KermetaSpecialTypesAliasImpl();
		return kermetaSpecialTypesAlias;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Integer createIntegerFromString(EDataType eDataType, String initialValue)
  {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertIntegerToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Double createRealFromString(EDataType eDataType, String initialValue)
  {
		return (Double)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertRealToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Character createCharacterFromString(EDataType eDataType, String initialValue)
  {
		return (Character)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertCharacterToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String createStringFromString(EDataType eDataType, String initialValue)
  {
		return (String)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertStringToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object createUnlimitedNaturalFromString(EDataType eDataType, String initialValue)
  {
		return super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertUnlimitedNaturalToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Iterator<?> createJavaIteratorFromString(EDataType eDataType, String initialValue) {
		return (java.util.Iterator<?>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIteratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StandardPackage getStandardPackage()
  {
		return (StandardPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static StandardPackage getPackage()
  {
		return StandardPackage.eINSTANCE;
	}

} //StandardFactoryImpl
