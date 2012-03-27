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
public interface VirtualTypePropertiesEditionPart {



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
	 * @return the supertype
	 * 
	 */
	public EObject getSupertype();

	/**
	 * Init the supertype
	 * @param settings the combo setting
	 */
	public void initSupertype(EObjectFlatComboSettings settings);

	/**
	 * Defines a new supertype
	 * @param newValue the new supertype to set
	 * 
	 */
	public void setSupertype(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSupertypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the supertype edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSupertype(ViewerFilter filter);

	/**
	 * Adds the given filter to the supertype edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSupertype(ViewerFilter filter);


	/**
	 * @return the classDefinition
	 * 
	 */
	public EObject getClassDefinition();

	/**
	 * Init the classDefinition
	 * @param settings the combo setting
	 */
	public void initClassDefinition(EObjectFlatComboSettings settings);

	/**
	 * Defines a new classDefinition
	 * @param newValue the new classDefinition to set
	 * 
	 */
	public void setClassDefinition(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setClassDefinitionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the classDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClassDefinition(ViewerFilter filter);

	/**
	 * Adds the given filter to the classDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClassDefinition(ViewerFilter filter);


	/**
	 * @return the modelType
	 * 
	 */
	public EObject getModelType();

	/**
	 * Init the modelType
	 * @param settings the combo setting
	 */
	public void initModelType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new modelType
	 * @param newValue the new modelType to set
	 * 
	 */
	public void setModelType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setModelTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the modelType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToModelType(ViewerFilter filter);

	/**
	 * Adds the given filter to the modelType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToModelType(ViewerFilter filter);





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
