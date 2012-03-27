/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
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
public interface ConstraintPropertiesEditionPart {



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
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the stereotype
	 * 
	 */
	public Enumerator getStereotype();

	/**
	 * Init the stereotype
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initStereotype(Object input, Enumerator current);

	/**
	 * Defines a new stereotype
	 * @param newValue the new stereotype to set
	 * 
	 */
	public void setStereotype(Enumerator newValue);


	/**
	 * @return the language
	 * 
	 */
	public Enumerator getLanguage();

	/**
	 * Init the language
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initLanguage(Object input, Enumerator current);

	/**
	 * Defines a new language
	 * @param newValue the new language to set
	 * 
	 */
	public void setLanguage(Enumerator newValue);


	/**
	 * @return the invOwner
	 * 
	 */
	public EObject getInvOwner();

	/**
	 * Init the invOwner
	 * @param settings the combo setting
	 */
	public void initInvOwner(EObjectFlatComboSettings settings);

	/**
	 * Defines a new invOwner
	 * @param newValue the new invOwner to set
	 * 
	 */
	public void setInvOwner(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInvOwnerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the invOwner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInvOwner(ViewerFilter filter);

	/**
	 * Adds the given filter to the invOwner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInvOwner(ViewerFilter filter);


	/**
	 * @return the preOwner
	 * 
	 */
	public EObject getPreOwner();

	/**
	 * Init the preOwner
	 * @param settings the combo setting
	 */
	public void initPreOwner(EObjectFlatComboSettings settings);

	/**
	 * Defines a new preOwner
	 * @param newValue the new preOwner to set
	 * 
	 */
	public void setPreOwner(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPreOwnerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the preOwner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPreOwner(ViewerFilter filter);

	/**
	 * Adds the given filter to the preOwner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPreOwner(ViewerFilter filter);


	/**
	 * @return the postOwner
	 * 
	 */
	public EObject getPostOwner();

	/**
	 * Init the postOwner
	 * @param settings the combo setting
	 */
	public void initPostOwner(EObjectFlatComboSettings settings);

	/**
	 * Defines a new postOwner
	 * @param newValue the new postOwner to set
	 * 
	 */
	public void setPostOwner(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPostOwnerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the postOwner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPostOwner(ViewerFilter filter);

	/**
	 * Adds the given filter to the postOwner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPostOwner(ViewerFilter filter);





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
