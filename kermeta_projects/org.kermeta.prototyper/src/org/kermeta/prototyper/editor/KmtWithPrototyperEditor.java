/**
 * <copyright>
 * </copyright>
 *
 * $Id: KmtWithPrototyperEditor.java,v 1.1 2008-04-04 09:37:59 cfaucher Exp $
 */
package org.kermeta.prototyper.editor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.kermeta.prototyper.editor.properties.sections.advanced.PrototyperPropertySheetPage;

import fr.irisa.triskell.kermeta.texteditor.editors.KMTEditor;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KmtWithPrototyperEditor extends KMTEditor implements IEditingDomainProvider, ISelectionProvider, ITabbedPropertySheetPageContributor {

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

	/*********************************************************************************************************/
	/*********************************************************************************************************/
	/*********************************************************************************************************/
	/*********************************************************************************************************/
	/*********************************************************************************************************/
	
	protected AdapterFactoryEditingDomain editingDomain;
		
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	
	protected ISelection editorSelection = getEditorSelection();
	
	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
	
	public ISelection getSelection() {
		return editorSelection;
	}
	
	public ISelection getEditorSelection() {
		if(getFile()!=null)
			return new StructuredSelection(getFile());
		
		return StructuredSelection.EMPTY;
	}

	public void setSelection(ISelection selection) {
		editorSelection = selection;

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
	}

}
