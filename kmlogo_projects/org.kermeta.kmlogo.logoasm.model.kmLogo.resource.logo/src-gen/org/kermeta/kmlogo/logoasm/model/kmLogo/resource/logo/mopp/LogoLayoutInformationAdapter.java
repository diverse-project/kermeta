/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoLayoutInformationAdapter implements org.eclipse.emf.common.notify.Adapter {
	
	private org.eclipse.emf.common.notify.Notifier target;
	private java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation>();
	
	public org.eclipse.emf.common.notify.Notifier getTarget() {
		return target;
	}
	
	public boolean isAdapterForType(Object type) {
		return false;
	}
	
	public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
	}
	
	public void setTarget(org.eclipse.emf.common.notify.Notifier newTarget) {
		this.target = newTarget;
	}
	
	public java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> getLayoutInformations() {
		return layoutInformations;
	}
	
	public void addLayoutInformation(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation) {
		layoutInformations.add(layoutInformation);
	}
	
	public void replaceProxy(org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation : layoutInformations) {
			layoutInformation.replaceProxy(proxy, target);
		}
	}
	
}
