/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.util.EncodingHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.NamedElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedElementImpl extends KermetaModelElementImpl implements NamedElement {

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected NamedElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return StructurePackage.Literals.NAMED_ELEMENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.NAMED_ELEMENT__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
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
			case StructurePackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case StructurePackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public EObject eObjectForURIFragmentSegment(String uriFragmentSegment) {
        if (uriFragmentSegment.length() > 0) {
            // Is the first character a special character, i.e., something other than '@'?
            //
            char firstCharacter = uriFragmentSegment.charAt(0);
            if (firstCharacter != '@') {
                // Is it the start of a source URI of an annotation?
                //
                if (firstCharacter == '%') {
                    // Find the closing '%'
                    //
                    int index = uriFragmentSegment.lastIndexOf("%");
                    if (index != -1) {
                        // Decode all encoded characters.
                        //
                        String source = URI.decode(uriFragmentSegment.substring(1, index));

                        // Check for a count, i.e., a '.' followed by a number.
                        //
                        int count = 0;
                        ++index;
                        if (uriFragmentSegment.length() > index && uriFragmentSegment.charAt(index) == '.') {
                            try {
                                count = Integer.parseInt(uriFragmentSegment.substring(index + 1));
                            } catch (NumberFormatException exception) {
                                throw new WrappedException(exception);
                            }
                        }
                    }
                } else {
                    // Look for trailing count.
                    //
                    int index = uriFragmentSegment.lastIndexOf(".");
                    String name = index == -1 ? uriFragmentSegment : uriFragmentSegment.substring(0, index);
                    int count = 0;
                    if (index != -1) {
                        try {
                            count = Integer.parseInt(uriFragmentSegment.substring(index + 1));
                        } catch (NumberFormatException exception) {
                            // Interpret it as part of the name.
                            //
                            name = uriFragmentSegment;
                        }
                    }

                    name = URI.decode(name);

                    // Look for a matching named element.
                    //
                    for (Object object : eContents()) {
                        if (object instanceof NamedElement) {
                            NamedElement eNamedElement = (NamedElement) object;
                            if (name.equals(eNamedElement.getName()) && count-- == 0) {
                                return eNamedElement;
                            }
                        }
                    }
                }

                return null;
            }
        }

        return super.eObjectForURIFragmentSegment(uriFragmentSegment);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String eURIFragmentSegment(EStructuralFeature structuralFeature,
            EObject object) {
        if (object instanceof NamedElement) {
            NamedElement eNamedElement = (NamedElement) object;
            String name = eNamedElement.getName();
            if (name != null) {
                int count = 0;
                for (Object otherEObject : eContents()) {
                    if (otherEObject == object) {
                        break;
                    }
                    if (otherEObject instanceof NamedElement) {
                        NamedElement otherENamedElement = (NamedElement) otherEObject;
                        if (name.equals(otherENamedElement.getName())) {
                            ++count;
                        }
                    }
                }
                name = EncodingHelper.eEncodeValue(name);
                return count > 0
                        ? name + "." + count
                        : name;
            }
        }
        return super.eURIFragmentSegment(structuralFeature, object);
    }
} //NamedElementImpl

