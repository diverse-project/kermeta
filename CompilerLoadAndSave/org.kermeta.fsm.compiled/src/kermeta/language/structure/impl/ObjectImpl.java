/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ObjectImpl.java,v 1.2 2008-07-25 12:40:06 ftanguy Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;
import kermeta.language.structure.Type;

import kermeta.persistence.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.helper.basetypes.ObjectUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements kermeta.language.structure.Object
{
  /**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
  protected EList<Tag> tag;

  /**
	 * The cached value of the '{@link #getOwnedTags() <em>Owned Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOwnedTags()
	 * @generated
	 * @ordered
	 */
  protected EList<Tag> ownedTags;

  /**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object container;

		/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final int OID_EDEFAULT = 0;

		/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected int oid = OID_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ObjectImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return StructurePackage.Literals.OBJECT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Tag> getTag()
  {
		if (tag == null) {
			tag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, StructurePackage.OBJECT__TAG, StructurePackage.TAG__OBJECT);
		}
		return tag;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Tag> getOwnedTags()
  {
		if (ownedTags == null) {
			ownedTags = new EObjectContainmentEList<Tag>(Tag.class, this, StructurePackage.OBJECT__OWNED_TAGS);
		}
		return ownedTags;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (kermeta.language.structure.Object)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.OBJECT__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetContainer() {
		return container;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(kermeta.language.structure.Object newContainer) {
		kermeta.language.structure.Object oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OBJECT__CONTAINER, oldContainer, container));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOid() {
		return oid;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(int newOid) {
		int oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OBJECT__OID, oldOid, oid));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  public boolean isSet(Property property) {
	  return ObjectUtil.isSet(this, property);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  public kermeta.language.structure.Object get(Property property) {
	  return ObjectUtil.get(this, property);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isKindOf(kermeta.language.structure.Class cl)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean equals(kermeta.language.structure.Object element)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public kermeta.language.structure.Class getMetaClass() {
	  return ExecutionContext.getInstance().getMetaClass( this.getClass().getName() );
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  public void set(Property property, kermeta.language.structure.Object element) {
	  ObjectUtil.set(this, property, element);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isFrozen()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void checkInvariants()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  public int hashcode() {
	  return ObjectUtil.hashcode(this);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isVoid()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isNotEqual(kermeta.language.structure.Object element)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void freeze()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  public int oid() {
	  return ObjectUtil.getOID(this);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  public void unset(Property property) {
	  ObjectUtil.unset(this, property);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  public kermeta.language.structure.Object container()
  {
	  return ObjectUtil.container(this);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource containingResource()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isInstanceOf(Type type)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public kermeta.language.structure.Object asType(kermeta.language.structure.Class type)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void checkAllInvariants()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case StructurePackage.OBJECT__TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTag()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case StructurePackage.OBJECT__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT__OWNED_TAGS:
				return ((InternalEList<?>)getOwnedTags()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case StructurePackage.OBJECT__TAG:
				return getTag();
			case StructurePackage.OBJECT__OWNED_TAGS:
				return getOwnedTags();
			case StructurePackage.OBJECT__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case StructurePackage.OBJECT__OID:
				return new Integer(getOid());
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case StructurePackage.OBJECT__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case StructurePackage.OBJECT__OWNED_TAGS:
				getOwnedTags().clear();
				getOwnedTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case StructurePackage.OBJECT__CONTAINER:
				setContainer((kermeta.language.structure.Object)newValue);
				return;
			case StructurePackage.OBJECT__OID:
				setOid(((Integer)newValue).intValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case StructurePackage.OBJECT__TAG:
				getTag().clear();
				return;
			case StructurePackage.OBJECT__OWNED_TAGS:
				getOwnedTags().clear();
				return;
			case StructurePackage.OBJECT__CONTAINER:
				setContainer((kermeta.language.structure.Object)null);
				return;
			case StructurePackage.OBJECT__OID:
				setOid(OID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case StructurePackage.OBJECT__TAG:
				return tag != null && !tag.isEmpty();
			case StructurePackage.OBJECT__OWNED_TAGS:
				return ownedTags != null && !ownedTags.isEmpty();
			case StructurePackage.OBJECT__CONTAINER:
				return container != null;
			case StructurePackage.OBJECT__OID:
				return oid != OID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
