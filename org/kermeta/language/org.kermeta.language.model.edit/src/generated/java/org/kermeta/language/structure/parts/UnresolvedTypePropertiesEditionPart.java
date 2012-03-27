/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public interface UnresolvedTypePropertiesEditionPart {



	/**
	 * Init the kTag
	 * @param settings settings for the kTag ReferencesTable 
	 */
	public void initKTag(ReferencesTableSettings settings);

	/**
	 * Update the kTag
	 * @param newValue the kTag to update
	 * 
	 */
	public void updateKTag();

	/**
	 * Adds the given filter to the kTag edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter);

	/**
	 * Adds the given filter to the kTag edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the kTag table
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element);


	/**
	 * @return the kType
	 * 
	 */
	public EObject getKType();

	/**
	 * Init the kType
	 * @param settings the combo setting
	 */
	public void initKType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new kType
	 * @param newValue the new kType to set
	 * 
	 */
	public void setKType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the kType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter);

	/**
	 * Adds the given filter to the kType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter);


	/**
	 * @return the typeContainer
	 * 
	 */
	public EObject getTypeContainer();

	/**
	 * Init the typeContainer
	 * @param settings the combo setting
	 */
	public void initTypeContainer(EObjectFlatComboSettings settings);

	/**
	 * Defines a new typeContainer
	 * @param newValue the new typeContainer to set
	 * 
	 */
	public void setTypeContainer(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTypeContainerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the typeContainer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTypeContainer(ViewerFilter filter);

	/**
	 * Adds the given filter to the typeContainer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTypeContainer(ViewerFilter filter);




	/**
	 * Init the generics
	 * @param settings settings for the generics ReferencesTable 
	 */
	public void initGenerics(ReferencesTableSettings settings);

	/**
	 * Update the generics
	 * @param newValue the generics to update
	 * 
	 */
	public void updateGenerics();

	/**
	 * Adds the given filter to the generics edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGenerics(ViewerFilter filter);

	/**
	 * Adds the given filter to the generics edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGenerics(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the generics table
	 * 
	 */
	public boolean isContainedInGenericsTable(EObject element);


	/**
	 * @return the typeIdentifier
	 * 
	 */
	public String getTypeIdentifier();

	/**
	 * Defines a new typeIdentifier
	 * @param newValue the new typeIdentifier to set
	 * 
	 */
	public void setTypeIdentifier(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
