/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrototyperEditor.java,v 1.1 2008-04-04 09:37:59 cfaucher Exp $
 */
package org.kermeta.prototyper.editor;

import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.kermeta.prototyper.editor.properties.sections.advanced.PrototyperPropertySheetPage;

import fr.irisa.triskell.kermeta.presentation.KmEditor;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrototyperEditor extends EcoreEditor implements ITabbedPropertySheetPageContributor {

    private TabbedPropertySheetPage propertySheetPage;
    
	public String getContributorId() {
		return "org.kermeta.prototyper.editor.properties.contributorID";
	}

	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
            return getPropertySheetPage();
        }
		return super.getAdapter(key);
	}
	
	public IPropertySheetPage getPropertySheetPage() {

        if (propertySheetPage == null || propertySheetPage.getControl() == null){

        	propertySheetPage = new PrototyperPropertySheetPage(this);
        }

        return propertySheetPage;
    }
}
