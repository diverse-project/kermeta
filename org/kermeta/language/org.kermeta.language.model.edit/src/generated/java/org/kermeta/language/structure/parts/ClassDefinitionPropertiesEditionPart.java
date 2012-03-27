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
public interface ClassDefinitionPropertiesEditionPart {



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
	 * Init the superType
	 * @param settings settings for the superType ReferencesTable 
	 */
	public void initSuperType(ReferencesTableSettings settings);

	/**
	 * Update the superType
	 * @param newValue the superType to update
	 * 
	 */
	public void updateSuperType();

	/**
	 * Adds the given filter to the superType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSuperType(ViewerFilter filter);

	/**
	 * Adds the given filter to the superType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSuperType(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the superType table
	 * 
	 */
	public boolean isContainedInSuperTypeTable(EObject element);


	/**
	 * @return the isAspect
	 * 
	 */
	public Boolean getIsAspect();

	/**
	 * Defines a new isAspect
	 * @param newValue the new isAspect to set
	 * 
	 */
	public void setIsAspect(Boolean newValue);




	/**
	 * Init the typeParameter
	 * @param settings settings for the typeParameter ReferencesTable 
	 */
	public void initTypeParameter(ReferencesTableSettings settings);

	/**
	 * Update the typeParameter
	 * @param newValue the typeParameter to update
	 * 
	 */
	public void updateTypeParameter();

	/**
	 * Adds the given filter to the typeParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTypeParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the typeParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTypeParameter(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the typeParameter table
	 * 
	 */
	public boolean isContainedInTypeParameterTable(EObject element);


	/**
	 * @return the isAbstract
	 * 
	 */
	public Boolean getIsAbstract();

	/**
	 * Defines a new isAbstract
	 * @param newValue the new isAbstract to set
	 * 
	 */
	public void setIsAbstract(Boolean newValue);


	/**
	 * @return the isSingleton
	 * 
	 */
	public Boolean getIsSingleton();

	/**
	 * Defines a new isSingleton
	 * @param newValue the new isSingleton to set
	 * 
	 */
	public void setIsSingleton(Boolean newValue);





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
