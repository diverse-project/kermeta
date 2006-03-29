/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : ExtendedGraphElementCreationFactory.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 28, 2006
 * Authors       : zdrey
 */
/* $Id$
 * Project   : Kermeta (First iteration)
 * File      : ExtendedGraphElementCreationFactory.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 28, 2006
 * Authors       : zdrey
 */

package fr.irisa.triskell.kermeta.graphicaleditor.extensions;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;

import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

/**
 * @author zdrey
 * @see org.topcased.modeler.editor.GraphElementCreationFactory
 */
public class ExtendedGraphElementCreationFactory extends
		GraphElementCreationFactory {

	// These attributes are needed because they are set private >:( in the 
	// GraphElementCreationFactory which does not have accessors.
	protected EClass eClass;
	/** The name of the feature on which we want to apply a filter */
	protected String featureName;
	/** The value of the feature -- it must be of the type of the feature..*/
	// Can be : an EClassifier, or a String/Boolean/Enumeration value for primitive types!
	protected Object featureFilter;
	
	
	/**
	 * @param creation
	 * @param eClass
	 */
	public ExtendedGraphElementCreationFactory(ICreationUtils creation,
			EClass eClass) {
		super(creation, eClass);
		this.eClass = eClass;
	}

	/**
	 * @param creation
	 * @param type
	 * @param isNode
	 */
	public ExtendedGraphElementCreationFactory(ICreationUtils creation,
			String type, Boolean isNode) {
		super(creation, type, isNode);
	}

	/**
	 * We overrided this method because we need to set default values in the model objects that were created instead of 
	 * having totally empty ones.
	 * Only specialized for Property yet
	 * @see org.topcased.modeler.editor.GraphElementCreationFactory#getNewModelObject()
	 */
	public EObject getNewModelObject() {
		EObject result = super.getNewModelObject();
		//result.
		// We would like to express initializations like :
		// "((Property)%object%).setType(%stringrepresentingaprimitivetype%)
		// FIXME : dirty temporary test.
		((Property)result).setType(StructureFactory.eINSTANCE.createPrimitiveType());
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topcased.modeler.editor.GraphElementCreationFactory#getNewObject()
	 */
	@Override
	public Object getNewObject() {
		return super.getNewObject();
	}

	/* (non-Javadoc)
	 * @see org.topcased.modeler.editor.GraphElementCreationFactory#getObjectType()
	 */
	@Override
	public Object getObjectType() {
		return super.getObjectType();
	}

	/*
	 * 
	 *  An attempt for constraint setting on a model element
	 * 
	 */

	/**
	 * @param featuretypename : the name of the type of the feature on <code>eClass</code>
	 * that we want to be a filter for the graph element to create.
	 * @param filter : the filtering value of the type of the model element 
	 * <code>object</code>for which the graph element will be created.
	 * The model element associated to its graph element will so have a default value,
	 * corresponding to the filter.
	 */
	public void setConstraint(String feature_name, EObject filter)
	{	
		featureName = feature_name;
		featureFilter = filter;
	}

	/**
	 * Resolve the constraint given a feature type (by its name) and a value (for the moment,
	 * the user has the responsibility to give a value corresponding to the type 
	 * of the feature.
	 */
	protected void resolveConstraint(EObject eobject) {
		// Find the EStructuralFeature corresponding to this featureName on object
		EStructuralFeature feature = findEStructuralFeatureByName(featureName, eobject);
		// It must never be null in fact
		if (feature != null)
		{
			if (EClass.class.isInstance(feature.getEType()))
			{
				System.err.println("-> : "+feature.getEType() + "-> " + featureFilter);
				assert(feature.getEType().isInstance(featureFilter));
				// create the empty value associated with this filter
				EObject default_value = StructureFactory.eINSTANCE.create((EClass)featureFilter); 
				eobject.eSet(feature, default_value);
			}
/*			else // EDataType?
			{
				System.err.println("Coucou, j suis un filtre sur datatype");
				
				EObject default_value = StructureFactory.eINSTANCE.createFromString(
				(EDataType)feature.getEType(), featureFilter);
				eobject.eSet(feautre, default_value);
			}*/
		}
		
		// Set the value of the filter to the object
		// Type (e.g fType) -> an EClass isntance
		// FBoolean (e.g : isComposed) -> true/false
		// FStringLiteral -> a string....
	}
	
	protected EStructuralFeature findEStructuralFeatureByName(String name, EObject eobj)
	{
		EStructuralFeature result = null;
		EList features = eClass.getEAllStructuralFeatures(); 
	    // For each feature, get the value and and check if its resource is in the list
	    Iterator it = features.iterator();
	    while (it.hasNext() && result == null)
	    {
	        EStructuralFeature feature = (EStructuralFeature)it.next();
	        if (feature.getName().equals(name))
	        	result = feature;
	    }
	    return result;
	}
	
	public EClass getEClass() { return eClass; }
	 

}
