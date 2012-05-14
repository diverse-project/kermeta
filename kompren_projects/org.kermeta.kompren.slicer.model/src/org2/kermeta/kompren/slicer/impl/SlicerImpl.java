/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org2.kermeta.kompren.slicer.Constraint;
import org2.kermeta.kompren.slicer.Radius;
import org2.kermeta.kompren.slicer.SlicedClass;
import org2.kermeta.kompren.slicer.SlicedElement;
import org2.kermeta.kompren.slicer.SlicedProperty;
import org2.kermeta.kompren.slicer.Slicer;
import org2.kermeta.kompren.slicer.SlicerPackage;
import org2.kermeta.kompren.slicer.util.EcoreUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slicer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getUriMetamodel <em>Uri Metamodel</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#isStrict <em>Strict</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getOnStart <em>On Start</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getOnEnd <em>On End</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getSlicedElements <em>Sliced Elements</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.SlicerImpl#getInputClasses <em>Input Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicerImpl extends EObjectImpl implements Slicer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriMetamodel() <em>Uri Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriMetamodel()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_METAMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriMetamodel() <em>Uri Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriMetamodel()
	 * @generated
	 * @ordered
	 */
	protected String uriMetamodel = URI_METAMODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected boolean strict = STRICT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelper() <em>Helper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper()
	 * @generated
	 * @ordered
	 */
	protected static final String HELPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelper() <em>Helper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper()
	 * @generated
	 * @ordered
	 */
	protected String helper = HELPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnStart() <em>On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnStart()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnStart() <em>On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnStart()
	 * @generated
	 * @ordered
	 */
	protected String onStart = ON_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnEnd() <em>On End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnEnd() <em>On End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEnd()
	 * @generated
	 * @ordered
	 */
	protected String onEnd = ON_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected Radius radius;

	/**
	 * The cached value of the '{@link #getSlicedElements() <em>Sliced Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlicedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SlicedElement> slicedElements;

	/**
	 * The cached value of the '{@link #getInputClasses() <em>Input Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> inputClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlicerPackage.Literals.SLICER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriMetamodel() {
		return uriMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriMetamodel(String newUriMetamodel) {
		String oldUriMetamodel = uriMetamodel;
		uriMetamodel = newUriMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__URI_METAMODEL, oldUriMetamodel, uriMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStrict() {
		return strict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrict(boolean newStrict) {
		boolean oldStrict = strict;
		strict = newStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__STRICT, oldStrict, strict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHelper() {
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelper(String newHelper) {
		String oldHelper = helper;
		helper = newHelper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__HELPER, oldHelper, helper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnStart() {
		return onStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnStart(String newOnStart) {
		String oldOnStart = onStart;
		onStart = newOnStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__ON_START, oldOnStart, onStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnEnd() {
		return onEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnEnd(String newOnEnd) {
		String oldOnEnd = onEnd;
		onEnd = newOnEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__ON_END, oldOnEnd, onEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, SlicerPackage.SLICER__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Radius getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadius(Radius newRadius, NotificationChain msgs) {
		Radius oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__RADIUS, oldRadius, newRadius);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(Radius newRadius) {
		if (newRadius != radius) {
			NotificationChain msgs = null;
			if (radius != null)
				msgs = ((InternalEObject)radius).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlicerPackage.SLICER__RADIUS, null, msgs);
			if (newRadius != null)
				msgs = ((InternalEObject)newRadius).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlicerPackage.SLICER__RADIUS, null, msgs);
			msgs = basicSetRadius(newRadius, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicerPackage.SLICER__RADIUS, newRadius, newRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SlicedElement> getSlicedElements() {
		if (slicedElements == null) {
			slicedElements = new EObjectContainmentEList<SlicedElement>(SlicedElement.class, this, SlicerPackage.SLICER__SLICED_ELEMENTS);
		}
		return slicedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getInputClasses() {
		if (inputClasses == null) {
			inputClasses = new EObjectResolvingEList<EClass>(EClass.class, this, SlicerPackage.SLICER__INPUT_CLASSES);
		}
		return inputClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlicerPackage.SLICER__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case SlicerPackage.SLICER__RADIUS:
				return basicSetRadius(null, msgs);
			case SlicerPackage.SLICER__SLICED_ELEMENTS:
				return ((InternalEList<?>)getSlicedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlicerPackage.SLICER__NAME:
				return getName();
			case SlicerPackage.SLICER__URI_METAMODEL:
				return getUriMetamodel();
			case SlicerPackage.SLICER__ACTIVE:
				return isActive();
			case SlicerPackage.SLICER__STRICT:
				return isStrict();
			case SlicerPackage.SLICER__HELPER:
				return getHelper();
			case SlicerPackage.SLICER__ON_START:
				return getOnStart();
			case SlicerPackage.SLICER__ON_END:
				return getOnEnd();
			case SlicerPackage.SLICER__CONSTRAINTS:
				return getConstraints();
			case SlicerPackage.SLICER__RADIUS:
				return getRadius();
			case SlicerPackage.SLICER__SLICED_ELEMENTS:
				return getSlicedElements();
			case SlicerPackage.SLICER__INPUT_CLASSES:
				return getInputClasses();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlicerPackage.SLICER__NAME:
				setName((String)newValue);
				return;
			case SlicerPackage.SLICER__URI_METAMODEL:
				setUriMetamodel((String)newValue);
				return;
			case SlicerPackage.SLICER__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case SlicerPackage.SLICER__STRICT:
				setStrict((Boolean)newValue);
				return;
			case SlicerPackage.SLICER__HELPER:
				setHelper((String)newValue);
				return;
			case SlicerPackage.SLICER__ON_START:
				setOnStart((String)newValue);
				return;
			case SlicerPackage.SLICER__ON_END:
				setOnEnd((String)newValue);
				return;
			case SlicerPackage.SLICER__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case SlicerPackage.SLICER__RADIUS:
				setRadius((Radius)newValue);
				return;
			case SlicerPackage.SLICER__SLICED_ELEMENTS:
				getSlicedElements().clear();
				getSlicedElements().addAll((Collection<? extends SlicedElement>)newValue);
				return;
			case SlicerPackage.SLICER__INPUT_CLASSES:
				getInputClasses().clear();
				getInputClasses().addAll((Collection<? extends EClass>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SlicerPackage.SLICER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SlicerPackage.SLICER__URI_METAMODEL:
				setUriMetamodel(URI_METAMODEL_EDEFAULT);
				return;
			case SlicerPackage.SLICER__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case SlicerPackage.SLICER__STRICT:
				setStrict(STRICT_EDEFAULT);
				return;
			case SlicerPackage.SLICER__HELPER:
				setHelper(HELPER_EDEFAULT);
				return;
			case SlicerPackage.SLICER__ON_START:
				setOnStart(ON_START_EDEFAULT);
				return;
			case SlicerPackage.SLICER__ON_END:
				setOnEnd(ON_END_EDEFAULT);
				return;
			case SlicerPackage.SLICER__CONSTRAINTS:
				getConstraints().clear();
				return;
			case SlicerPackage.SLICER__RADIUS:
				setRadius((Radius)null);
				return;
			case SlicerPackage.SLICER__SLICED_ELEMENTS:
				getSlicedElements().clear();
				return;
			case SlicerPackage.SLICER__INPUT_CLASSES:
				getInputClasses().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SlicerPackage.SLICER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SlicerPackage.SLICER__URI_METAMODEL:
				return URI_METAMODEL_EDEFAULT == null ? uriMetamodel != null : !URI_METAMODEL_EDEFAULT.equals(uriMetamodel);
			case SlicerPackage.SLICER__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case SlicerPackage.SLICER__STRICT:
				return strict != STRICT_EDEFAULT;
			case SlicerPackage.SLICER__HELPER:
				return HELPER_EDEFAULT == null ? helper != null : !HELPER_EDEFAULT.equals(helper);
			case SlicerPackage.SLICER__ON_START:
				return ON_START_EDEFAULT == null ? onStart != null : !ON_START_EDEFAULT.equals(onStart);
			case SlicerPackage.SLICER__ON_END:
				return ON_END_EDEFAULT == null ? onEnd != null : !ON_END_EDEFAULT.equals(onEnd);
			case SlicerPackage.SLICER__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case SlicerPackage.SLICER__RADIUS:
				return radius != null;
			case SlicerPackage.SLICER__SLICED_ELEMENTS:
				return slicedElements != null && !slicedElements.isEmpty();
			case SlicerPackage.SLICER__INPUT_CLASSES:
				return inputClasses != null && !inputClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}


	@Override
	public String toString() {
		if(eIsProxy()) return super.toString();

		final StringBuilder result = new StringBuilder("slicer");

		if(strict) result.append(" strict");
		if(active) result.append(" active");
		result.append(' ').append(name).append('{').append('\n');
		result.append("\tdomain: \"").append(uriMetamodel).append("\"\n");

		if(inputClasses!=null && !inputClasses.isEmpty()) {
			result.append("\tinput: ").append(EcoreUtils.INSTANCE.getQualifiedName(inputClasses.get(0), "."));

			for(int i=1, size=inputClasses.size(); i<size; i++)
				result.append(", ").append(EcoreUtils.INSTANCE.getQualifiedName(inputClasses.get(i), "."));

			result.append('\n');
		}

		if(radius!=null)
			result.append('\t').append(radius).append('\n');

		if(constraints!=null)
			for(final Constraint ct : constraints)
				result.append('\t').append(ct).append('\n');

		if(slicedElements!=null)
			for(final SlicedElement se : slicedElements)
				if(se instanceof SlicedClass)
					result.append('\t').append(se).append('\n');

		if(slicedElements!=null)
			for(final SlicedElement se : slicedElements)
				if(se instanceof SlicedProperty)
					result.append('\t').append(se).append('\n');

		if(onStart!=null && onStart.length()>0)
			result.append("\tonStart [[").append(onStart).append("]]\n");

		if(onEnd!=null && onEnd.length()>0)
			result.append("\tonEnd [[").append(onEnd).append("]]\n");

		if(helper!=null && helper.length()>0)
			result.append("\thelper [[").append(helper).append("]]\n");

		result.append("}\n");

		return result.toString();
	}

} //SlicerImpl
