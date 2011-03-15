/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eclipse.emf.ecore;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Internal;

/**
 *
 * @author barais
 */
public class EcoreFactoryWrapper implements EcoreFactory, org.eclipse.emf.ecore.InternalEObject {

    EcoreFactory wrap;

    public EcoreFactory getWrap() {
        return wrap;
    }

    public void setWrap(EcoreFactory wrap) {
        this.wrap = wrap;
    }

    public EObject createEObject() {
        return wrap.createEObject();
    }

    public EAttribute createEAttribute() {
        return wrap.createEAttribute();
    }

    public EAnnotation createEAnnotation() {
        return wrap.createEAnnotation();
    }

    public EClass createEClass() {
        return wrap.createEClass();
    }

    public EDataType createEDataType() {
        return wrap.createEDataType();
    }

    public EParameter createEParameter() {
        return wrap.createEParameter();
    }

    public EOperation createEOperation() {
        return wrap.createEOperation();
    }

    public EPackage createEPackage() {
        return wrap.createEPackage();
    }

    public EFactory createEFactory() {
        return wrap.createEFactory();
    }

    public EEnumLiteral createEEnumLiteral() {
        return wrap.createEEnumLiteral();
    }

    public EEnum createEEnum() {
        return wrap.createEEnum();
    }

    public EReference createEReference() {
        return wrap.createEReference();
    }

    public EGenericType createEGenericType() {
        return wrap.createEGenericType();
    }

    public ETypeParameter createETypeParameter() {
        return wrap.createETypeParameter();
    }

    public EcorePackage getEcorePackage() {
        return wrap.getEcorePackage();
    }

    public EPackage getEPackage() {
        return wrap.getEPackage();
    }

    public void setEPackage(EPackage ep) {
        wrap.setEPackage(ep);
    }

    public EObject create(EClass eclass) {
        return wrap.create(eclass);
    }

    public Object createFromString(EDataType edt, String string) {
        return wrap.createFromString(edt,string);
    }

    public String convertToString(EDataType edt, Object o) {
        return wrap.convertToString(edt,o);
    }

    public EList getEAnnotations() {
        return wrap.getEAnnotations();
    }

    public EAnnotation getEAnnotation(String string) {
        return wrap.getEAnnotation(string);
    }

    public EClass eClass() {
        return wrap.eClass();
    }

    public Resource eResource() {
        return wrap.eResource();
    }

    public EObject eContainer() {
        return wrap.eContainer();
    }

    public EStructuralFeature eContainingFeature() {
        return wrap.eContainingFeature();
    }

    public EReference eContainmentFeature() {
        return wrap.eContainmentFeature();
    }

    public EList eContents() {
        return wrap.eContents();
    }

    public TreeIterator eAllContents() {
        return wrap.eAllContents();
    }

    public boolean eIsProxy() {
        return wrap.eIsProxy();
    }

    public EList eCrossReferences() {
        return wrap.eCrossReferences();
    }

    public Object eGet(EStructuralFeature esf) {
        return wrap.eGet(esf);
    }

    public Object eGet(EStructuralFeature esf, boolean bln) {
        return wrap.eGet(esf,bln);
    }

    public void eSet(EStructuralFeature esf, Object o) {
         wrap.eSet(esf,o);
    }

    public boolean eIsSet(EStructuralFeature esf) {
        return wrap.eIsSet(esf);
    }

    public void eUnset(EStructuralFeature esf) {
         wrap.eUnset(esf);
    }

    public Object eInvoke(EOperation eo, EList elist) throws InvocationTargetException {
        return wrap.eInvoke(eo,elist);
    }

    public EList eAdapters() {
        return wrap.eAdapters();
    }

    public boolean eDeliver() {
        return wrap.eDeliver();
    }

    public void eSetDeliver(boolean bln) {
         wrap.eSetDeliver(bln);
    }

    public void eNotify(Notification ntfctn) {
         wrap.eNotify(ntfctn);
    }

    public boolean eNotificationRequired() {
       return ((org.eclipse.emf.ecore.InternalEObject)wrap).eNotificationRequired();
    }

    public String eURIFragmentSegment(EStructuralFeature esf, EObject eo) {
        return ((org.eclipse.emf.ecore.InternalEObject)wrap).eURIFragmentSegment(esf,  eo);
    }

    public EObject eObjectForURIFragmentSegment(String string) {
        return ((org.eclipse.emf.ecore.InternalEObject)wrap).eObjectForURIFragmentSegment(string);
    }

    public void eSetClass(EClass eclass) {
                ((org.eclipse.emf.ecore.InternalEObject)wrap).eSetClass(eclass);

    }

    public Setting eSetting(EStructuralFeature esf) {
         return ((org.eclipse.emf.ecore.InternalEObject)wrap).eSetting(esf);
    }

    public int eBaseStructuralFeatureID(int i, Class type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int eContainerFeatureID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int eDerivedStructuralFeatureID(int i, Class type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int eDerivedOperationID(int i, Class type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NotificationChain eSetResource(Internal intrnl, NotificationChain nc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NotificationChain eInverseAdd(InternalEObject ieo, int i, Class type, NotificationChain nc) {
        return ((org.eclipse.emf.ecore.InternalEObject)wrap).eInverseAdd(ieo,  i, type,  nc);
    }

    public NotificationChain eInverseRemove(InternalEObject ieo, int i, Class type, NotificationChain nc) {
       return ((org.eclipse.emf.ecore.InternalEObject)wrap).eInverseRemove(ieo,  i, type,  nc);
    }

    public NotificationChain eBasicSetContainer(InternalEObject ieo, int i, NotificationChain nc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NotificationChain eBasicRemoveFromContainer(NotificationChain nc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public URI eProxyURI() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void eSetProxyURI(URI uri) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EObject eResolveProxy(InternalEObject ieo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public InternalEObject eInternalContainer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Internal eInternalResource() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Internal eDirectResource() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public  org.eclipse.emf.ecore.InternalEObject.EStore eStore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void eSetStore( org.eclipse.emf.ecore.InternalEObject.EStore estore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object eGet(EStructuralFeature esf, boolean bln, boolean bln1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object eGet(int i, boolean bln, boolean bln1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void eSet(int i, Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void eUnset(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean eIsSet(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object eInvoke(int i, EList elist) throws InvocationTargetException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
