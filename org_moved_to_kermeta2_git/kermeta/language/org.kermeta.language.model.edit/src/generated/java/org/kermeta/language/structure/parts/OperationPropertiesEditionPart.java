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
public interface OperationPropertiesEditionPart {



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
	 * @return the type
	 * 
	 */
	public EObject getType();

	/**
	 * Init the type
	 * @param settings the combo setting
	 */
	public void initType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToType(ViewerFilter filter);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToType(ViewerFilter filter);


	/**
	 * @return the isOrdered
	 * 
	 */
	public Boolean getIsOrdered();

	/**
	 * Defines a new isOrdered
	 * @param newValue the new isOrdered to set
	 * 
	 */
	public void setIsOrdered(Boolean newValue);


	/**
	 * @return the isUnique
	 * 
	 */
	public Boolean getIsUnique();

	/**
	 * Defines a new isUnique
	 * @param newValue the new isUnique to set
	 * 
	 */
	public void setIsUnique(Boolean newValue);


	/**
	 * @return the lower
	 * 
	 */
	public String getLower();

	/**
	 * Defines a new lower
	 * @param newValue the new lower to set
	 * 
	 */
	public void setLower(String newValue);


	/**
	 * @return the upper
	 * 
	 */
	public String getUpper();

	/**
	 * Defines a new upper
	 * @param newValue the new upper to set
	 * 
	 */
	public void setUpper(String newValue);


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
	 * Init the raisedException
	 * @param settings settings for the raisedException ReferencesTable 
	 */
	public void initRaisedException(ReferencesTableSettings settings);

	/**
	 * Update the raisedException
	 * @param newValue the raisedException to update
	 * 
	 */
	public void updateRaisedException();

	/**
	 * Adds the given filter to the raisedException edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRaisedException(ViewerFilter filter);

	/**
	 * Adds the given filter to the raisedException edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRaisedException(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the raisedException table
	 * 
	 */
	public boolean isContainedInRaisedExceptionTable(EObject element);


	/**
	 * @return the superOperation
	 * 
	 */
	public EObject getSuperOperation();

	/**
	 * Init the superOperation
	 * @param settings the combo setting
	 */
	public void initSuperOperation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new superOperation
	 * @param newValue the new superOperation to set
	 * 
	 */
	public void setSuperOperation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSuperOperationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the superOperation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSuperOperation(ViewerFilter filter);

	/**
	 * Adds the given filter to the superOperation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSuperOperation(ViewerFilter filter);


	/**
	 * @return the owningClass
	 * 
	 */
	public EObject getOwningClass();

	/**
	 * Init the owningClass
	 * @param settings the combo setting
	 */
	public void initOwningClass(EObjectFlatComboSettings settings);

	/**
	 * Defines a new owningClass
	 * @param newValue the new owningClass to set
	 * 
	 */
	public void setOwningClass(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOwningClassButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the owningClass edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwningClass(ViewerFilter filter);

	/**
	 * Adds the given filter to the owningClass edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwningClass(ViewerFilter filter);




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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
