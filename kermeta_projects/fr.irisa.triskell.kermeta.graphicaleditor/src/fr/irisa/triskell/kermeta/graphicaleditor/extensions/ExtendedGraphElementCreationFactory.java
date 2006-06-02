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

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
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
	 * Only specialized for Property yet FIXME : dirty!
	 * @see org.topcased.modeler.editor.GraphElementCreationFactory#getNewModelObject()
	 */
	public EObject getNewModelObject() {
		EObject result = super.getNewModelObject();
		((Property)result).setType(StructureFactory.eINSTANCE.createVoidType());
		((Property)result).setUpper(1);
		return result;
	}
	
	public EClass getEClass() { return eClass; }
	 

}
