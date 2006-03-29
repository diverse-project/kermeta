/* $Id: StructureValidateAction.java,v 1.2 2006-03-29 08:51:52 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : ValidateAction.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 9, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors:
 *    Topcased <http://www.topcased.org> (see OpenParentDiagram.java :))	
 *    
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.actions;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureActionConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.validation.constraints.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;

/**
 * Action that validates the constraints using ConstraintChecker
 * @see fr.irisa.triskell.kermeta.utils.KermetaConstraintChecker
 */
public class StructureValidateAction extends WorkbenchPartAction {

	public StructureValidateAction(IWorkbenchPart part) {
		super(part);
	}

	/**
     * Always return true
     * 
     * @return <code>true</code>
     */
	protected boolean calculateEnabled() {
		return true;
		
	}
	
    /**
     * Initializes the action
     * 
     * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#init()
     */
    protected void init()
    {
        setId(StructureActionConstants.VALIDATE);
        setText(StructureActionConstants.VALIDATE_TEXT);
    }

    /**
     * @see org.eclipse.jface.action.IAction#run()
     */
    public void run()
    {
        // get the modeler
        Modeler modeler = (Modeler) getWorkbenchPart();

        // Get the current diagram
        Diagram currentDiagram = modeler.getActiveDiagram();
        // Get the root package in the current diagram.
        EObject modelObject = Utils.getElement(currentDiagram.getSemanticModel().getGraphElement());
//        System.err.println("Active model ob : " + modelObject);
        // Get the model container
//        System.err.println("Active model ob : " + modeler.getDiagrams().getModel().eResource().getURI());
        
        // Please do not remove this comment -- it is a pense-bete
        // Display a warning/error dialog
        //    ModelerPlugin.displayDialog("No parent Diagram", "There is no parent diagram", IStatus.INFO);
        checkModel();
    }
    
    /** 
     * 
     * @return The URI (from emf) of the model that the diagram is linked to 
     */
    protected URI getModelURI()
    {
    	return ((Modeler)getWorkbenchPart()).getDiagrams().getModel().eResource().getURI();
    }
    
    
    /**
     * Check the model
     *
     */
    public void checkModel()
    {
    	//new KermetaValidatorStartup().earlyStartup();
    	// Load the KermetaUnit
//      resolve uri
        //URI u = URIMapUtil.resolveURI(p_metamodel_uri, unit_uripath);
    	//EMF2Runtime.internalLog.info("UNIT URI = "+ u.toString());
    	//System.err.println("UNIT URI = "+ u.toString() + "(path : "+ unit_uripath+")");
        KMUnit kermeta_unit = (KMUnit)
        	KermetaUnitFactory.getDefaultLoader().createKermetaUnit(getModelURI().toString());
        
        Diagram currentDiagram = ((Modeler) getWorkbenchPart()).getActiveDiagram();
        EObject modelObject = Utils.getElement(currentDiagram.getSemanticModel().getGraphElement());
    	// Call the check constraint visitor on it!
        KermetaConstraintChecker constraint_checker = new KermetaConstraintChecker(kermeta_unit);
        System.err.println("Model URI : " + kermeta_unit.getUri());
        System.err.println("Package URI : " + kermeta_unit.packageLookup("root"));
        constraint_checker.accept((Package)modelObject);
        
    }
    


}
