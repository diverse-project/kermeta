/* $Id: ExtendedDeleteModelCommand.java,v 1.1 2006-04-05 18:58:52 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : ExtendedDeleteModelCommand.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 3, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import org.topcased.modeler.commands.DeleteGraphElementCommand;
import org.topcased.modeler.commands.DeleteModelCommand;
import org.topcased.modeler.commands.EMFtoGEFCommandWrapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.DiagramElement;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.diagrams.model.Diagrams;
import org.topcased.modeler.editor.MixedEditDomain;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.providers.IDeletePartnerProvider;
import org.topcased.modeler.utils.Utils;

/**
 * A special delete command.....for tags. Quite exact copy of DeleteModelCommand
 * @author zdrey
 *
 */
public class ExtendedDeleteModelCommand extends DeleteModelCommand {
	
    /**
     * The Modeler editDomain
     */
    private MixedEditDomain _editDomain;

    private Diagrams diagrams;

    private boolean deleteAllReferences;

    /**
     * This boolean stores if a "Go to root diagram" command have been added
     */
    private boolean goToRoot = false;



    /**
     * Constructor
     * 
     * @param domain
     * @param diagrams
     * @param model
     * @param deleteAllRef
     */
    public ExtendedDeleteModelCommand(MixedEditDomain domain, Diagrams diagrams, EObject model, boolean deleteAllRef)
    {
    	
    	//super("D");
        super(domain, diagrams, model, deleteAllRef);
        this._editDomain = domain;
        this.diagrams = diagrams;
        this.deleteAllReferences = deleteAllRef;
        System.err.println("Edit domain : " + domain);
        initialize(model);
    }

    /**
     * Constructor
     * 
     * @param domain
     * @param diagrams
     * @param model
     */
    public ExtendedDeleteModelCommand(MixedEditDomain domain, Diagrams diagrams, EObject model)
    {
        this(domain, diagrams, model, true);
        this._editDomain = domain;
        this.diagrams = diagrams;
        this.deleteAllReferences = true;
    }

    private void initialize(EObject model)
    {
    	System.err.println("Modele element to remove?" + model);
        if (model != null)
        {
            if (model instanceof Diagram)
            {
                Command removeDiag = createRemoveDiagramCommand((Diagram) model);
                if (removeDiag != null)
                {
                    add(removeDiag);
                }
            }
            // check if it is not the main object
            else if (model != model.eResource().getContents().get(0))
            {
                // Création de la commande de suppression de l'objet dans le
                // modèle

                // Suppression dans le modele
                // 1- Recuperation du IDeletePartnerProvider : Le
                // IDeletePartnerProvider
                // fournit les objets qui representent une connection vers ou
                // depuis
                // un objet
                // 2- Recuperation des objets connections
                // 3- Suppression des objets connections du modele (appel
                // recursif a
                // cette meme fonction)
                // 4- Suppression de l'objet
                List deletedObjects = getCompleteList(model);

                // Nettoyage :
                // 1- On nettoie d'abord en supprimant les diagrammes pour cet
                // objet et ses fils
                // 2- Le nettoyage parcourt les GraphElements et renvoie ceux
                // qui
                // sont lies à des objets EMF de la liste precedente.
                // Les GraphElements a nettoyer sont ensuite supprimes du
                // modèle.
                //
                // List deletedDiagrams = getDeleteDiagrams(deletedObjects);
                // Command removeDiags =
                // createRemoveDiagramsCommand(deletedDiagrams);
                // if (removeDiags != null)
                // {
                // add(removeDiags);
                // }

                // Suppression d'un GraphElement :
                // 1- Recuperation des connections liees a cet element
                // 3- Suppression des connections (appel recursif a cette meme
                // methode)
                // 2- Suppression du GraphElement

                List deletedGraphElements = getDeleteGraphElements(deletedObjects);
                Command removeGraphCmd = createRemoveGraphCommand(deletedGraphElements);
                if (removeGraphCmd != null)
                {
                    add(removeGraphCmd);
                }

                Command removeCmd = createRemoveCommand(deletedObjects);
                add(removeCmd);
            }
        }
    }

    /**
     * Create the remove command for a diagram
     * 
     * @param diagram the diagram to remove
     * @return the command or <code>null</code> if action cannot be performed
     */
    protected Command createRemoveDiagramCommand(Diagram diagram)
    {
        Command removeCmd = null;
        // check if it is not the main diagram
        if (diagram != ((Diagram) diagrams.getDiagrams().get(0)))
        {
            List deletedObjects = new ArrayList();
            deletedObjects.add(diagram);
            removeCmd = createRemoveCommand(deletedObjects);
        }

        return removeCmd;
    }

    /**
     * Create the CompoundCommand that remove model objects
     * 
     * @param deletedObjects the list that contain the model objects to remove
     * @return the CompoundCommand
     */
    protected Command createRemoveCommand(List deletedObjects)
    {
        CompoundCommand removeCmd = null;
        if (deletedObjects != null && !deletedObjects.isEmpty())
        {
            removeCmd = new CompoundCommand();
            Iterator it = deletedObjects.iterator();
            while (it.hasNext())
            {
                Object obj = it.next();

                // The list may contains wrapped objects
                if (obj instanceof IWrapperItemProvider || obj instanceof FeatureMap.Entry || obj instanceof EObject)
                {
                    goToRootDiagram(obj, removeCmd);

                    List objList = new ArrayList();

                    // Get the AdapterFactoryEditingDomain
                    AdapterFactoryEditingDomain domain = _editDomain.getEMFEditingDomain();
                    // The object must be wrapped if necessary
                    Object wrappedObj = domain.getWrapper(obj);
                    objList.add(wrappedObj);
                    org.eclipse.emf.common.command.Command cmd = RemoveCommand.create(_editDomain.getEMFEditingDomain(),
                            objList);
                    Command gefCommand = new EMFtoGEFCommandWrapper(cmd);

                    // FIX the bug Topcased #277
                    // the Model object must be deleted first, and only after the references are deleted
                    removeCmd.add(gefCommand);
                    
                    // FIX the bug EMF 61639 : see
                    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=61639
                    if (deleteAllReferences)
                    {
                        Map usages = EcoreUtil.UsageCrossReferencer.findAll(objList, domain.getResourceSet());
                        for (Iterator i = usages.entrySet().iterator(); i.hasNext();)
                        {
                            Map.Entry entry = (Map.Entry) i.next();
                            EObject eObject = (EObject) entry.getKey();
                            Collection settings = (Collection) entry.getValue();
                            for (Iterator j = settings.iterator(); j.hasNext();)
                            {
                                EStructuralFeature.Setting setting = (EStructuralFeature.Setting) j.next();
                                EObject referencingEObject = setting.getEObject();
                                EStructuralFeature eStructuralFeature = setting.getEStructuralFeature();
                                if (eStructuralFeature.isChangeable())
                                {
                                    if (eStructuralFeature.isMany())
                                    {
                                        org.eclipse.emf.common.command.Command refCmd = RemoveCommand.create(domain,
                                                referencingEObject, eStructuralFeature, eObject);
                                        removeCmd.add(new EMFtoGEFCommandWrapper(refCmd));
                                    }
                                    else
                                    {
                                        org.eclipse.emf.common.command.Command refCmd = SetCommand.create(domain,
                                                referencingEObject, eStructuralFeature, null);
                                        removeCmd.add(new EMFtoGEFCommandWrapper(refCmd));
                                    }
                                }
                            }
                        }
                    }

                    
                }
            }
        }

        return removeCmd;
    }

    /**
     * Add a "Go to Root diagram" command if needed
     * 
     * @param deletedObj the deleted objecct
     * @param removeCmd the list of commands
     */
    private void goToRootDiagram(Object deletedObj, CompoundCommand removeCmd)
    {
        if (deletedObj != null && !this.goToRoot)
        {
            // Return to root diagram if needed
            EObject unwrapObject = (EObject) AdapterFactoryEditingDomain.unwrap(deletedObj);
            // Check if the active diagram is not a child of the deleted
            // sub-tree
            final Modeler modeler = (Modeler) this._editDomain.getEditorPart();
            EObject diagObject = Utils.getElement(modeler.getActiveDiagram());
            if (diagObject.equals(unwrapObject) || EcoreUtil.isAncestor(unwrapObject, diagObject) || deletedObj.equals(modeler.getActiveDiagram()))
            {
                // If it is, return to the root diagram
                removeCmd.add(new Command()
                {
                    public void execute()
                    {
                        modeler.setActiveDiagram((Diagram) modeler.getDiagrams().getDiagrams().get(0));
                    }
                });
            }
            
            goToRoot = true;
        }
    }

    /**
     * Create the CompoundCommand that remove the GraphElement objects
     * 
     * @param deletedGraphElts the list that contain the graphElements to remove
     * @return the CompoundCommand
     */
    protected Command createRemoveGraphCommand(List deletedGraphElts)
    {
        CompoundCommand removeCmd = null;
        if (deletedGraphElts != null && !deletedGraphElts.isEmpty())
        {
            removeCmd = new CompoundCommand();

            Iterator itElts = deletedGraphElts.iterator();
            while (itElts.hasNext())
            {
                GraphElement elt = (GraphElement) itElts.next();

                if (elt instanceof Diagram)
                {
                    Command removeDiag = createRemoveDiagramCommand((Diagram) elt);
                    if (removeDiag != null)
                    {
                        removeCmd.add(removeDiag);
                    }
                }
                else
                {
                    DeleteGraphElementCommand deleteCmd = new DeleteGraphElementCommand(elt, true);
                    if (deleteCmd != null)
                    {
                        removeCmd.add(deleteCmd);
                    }
                }
            }
        }

        return removeCmd;
    }

    private List getDeleteGraphElements(List deletedObjects)
    {
        List elementList = new ArrayList();

        // Parcours de chaque diagramme
        Iterator it = diagrams.getDiagrams().iterator();
        while (it.hasNext())
        {
            Diagram diag = (Diagram) it.next();

            checkElement(diag, deletedObjects, elementList);
        }

        return elementList;
    }

    private void checkElement(GraphElement elt, List deletedObjects, List deletedGraphElt)
    {
        EObject model = Utils.getElement(elt);
        // On verifie que l'objet du modele fait partie de la liste des objets
        // effaces
        if (model != null && isDelete(model, deletedObjects))
        {
            // Le GraphElement doit etre supprime
            if (!deletedGraphElt.contains(elt))
            {
                deletedGraphElt.add(elt);
            }
        }
        else
        {
            // On regarde les fils qui doivent etre supprimes
            Iterator itChildren = elt.getContained().iterator();
            while (itChildren.hasNext())
            {
                DiagramElement child = (DiagramElement) itChildren.next();
                if (child instanceof GraphElement)
                {
                    checkElement((GraphElement) child, deletedObjects, deletedGraphElt);
                }
            }
        }
    }

    private boolean isDelete(EObject model, List deletedObjects)
    {
        if (deletedObjects.contains(model) || EcoreUtil.isAncestor(deletedObjects, model))
        {
            return true;
        }

        return false;
    }

    /**
     * This method iterates on the selection and complete with EObjects that
     * must be deleted from each object of the selection.
     * 
     * @param selection the initial selection
     * @return the new list of objects to delete
     */
    private List getCompleteList(EObject selection)
    {
        List completeList = new ArrayList();
        addObject(selection, completeList);

        return completeList;
    }

    private void addObject(Object selection, List listToAppend)
    {
        if (selection instanceof EObject && !listToAppend.contains(selection))
        {
            for (Iterator iter = ((EObject) selection).eContents().iterator(); iter.hasNext();)
            {
                addObject(iter.next(), listToAppend);
            }

            listToAppend.add(selection);

            // Deals with dependent objects
            AdapterFactory adapterFactory = _editDomain.getAdapterFactory();
            if (adapterFactory != null)
            {
                // Get the provider from the adapterFactory
                IDeletePartnerProvider deleteProvider = (IDeletePartnerProvider) (adapterFactory).adapt(selection,
                        IDeletePartnerProvider.class);

                // Add dependencies
                List dependencies = null;
                if (deleteProvider != null)
                {
                    dependencies = deleteProvider.getDeletePartners(selection);
                    if (dependencies != null)
                    {
                        Iterator it = dependencies.iterator();
                        while (it.hasNext())
                        {
                            Object obj = it.next();
                            addObject(obj, listToAppend);
                        }
                    }
                }
            }
        }
    }

}
