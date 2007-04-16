/*$Id: RegisteredPackageView.java,v 1.1 2007-04-16 12:13:01 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	RegisteredPackageView.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 01 jan. 07
* Authors : cfaucher
*/

package fr.irisa.triskell.kermeta.view;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.viewers.ListViewer;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.part.ViewPart;


public class RegisteredPackageView extends ViewPart {
	
	private ListViewer lv;
	
	/**
	 * 
	 */
	public RegisteredPackageView() {
		super();
		setContentDescription("Registered packages:");
	}

	@Override
	public void createPartControl(Composite parent) {
        
        lv = new ListViewer(parent);
        fillListViewer(lv.getList());
	}

	@Override
	public void setFocus() {
		fillListViewer(lv.getList());
	}

	/**
	 * Return the concatenation of the list of EPackages as a String
	 * This method is not used for the moment
	 */
	protected String displayRegisteredPackages() {
		String concactList = "";
		String uri = null;
		EPackage p = null;
		Object obj = null;
		
		Set kSet = Registry.INSTANCE.keySet();
		Iterator it = kSet.iterator();
		while(it.hasNext()) {
			uri = (String) it.next();
			obj = Registry.INSTANCE.get( uri );
			if(obj instanceof EPackage) {
				p = (EPackage) obj;
				concactList = concactList + "  " + p.getName() + " [" + uri + "]\n";
			}
		}
		return concactList;
	}
	
	/**
	 * Fill the ListViewer data
	 */
	protected void fillListViewer(List pList) {

		// remove the list before the update
		pList.removeAll();
		
		String uri = null;
		EPackage p = null;
		Object obj = null;
		
		Set kSet = Registry.INSTANCE.keySet();
		Iterator it = kSet.iterator();
		while(it.hasNext()) {
			uri = (String) it.next();
			obj = Registry.INSTANCE.get( uri );
			if(obj instanceof EPackage) {
				p = (EPackage) obj;
				pList.add(p.getName() + " [" + uri + "]");
			}
		}
	}
}
