/**
 * 
 */
package fr.irisa.triskell.kermeta.view;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

import fr.irisa.triskell.kermeta.popup.actions.EMFRegisterAction;


/**
 * @author cfaucher
 *
 */
public class KermetaView extends ViewPart implements IViewPart {
	
	private Label label;
	
	/**
	 * 
	 */
	public KermetaView() {
		super();
		setContentDescription("Registered packages:");
	}

	@Override
	public void createPartControl(Composite parent) {
		
		label = new Label(parent, 1);
        label.setText(displayRegisteredPackages());
        
        //Table table = new Table();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		//label.setFocus();
		label.setText(displayRegisteredPackages());
	}
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		// TODO Auto-generated method stub
		super.init(site);
	}

	@Override
	protected void setContentDescription(String description) {
		// TODO Auto-generated method stub
		super.setContentDescription(description);
	}

	@Override
	protected void setPartName(String partName) {
		// TODO Auto-generated method stub
		super.setPartName(partName);
	}

	/**
	 * 
	 */
	protected String displayRegisteredPackages() {
		//String pList = "Registered packages:\n";
		String pList = "";
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
				pList = pList + "  " + p.getName() + " [" + uri + "]\n";
			}
		}
		return pList;
	}
}
