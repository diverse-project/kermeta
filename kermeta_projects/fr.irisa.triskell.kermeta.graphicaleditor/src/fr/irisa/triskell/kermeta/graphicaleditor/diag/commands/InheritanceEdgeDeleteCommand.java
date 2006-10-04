/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *    Jacques Lescot (Anyware Technologies) - initial API and implementation
 *******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.diag.commands;

import org.eclipse.gef.commands.Command;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.GraphConnector;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.common.KermetaCommonUtils;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * The command to delete an Inheritance Edge
 * 
 * Creation : 19 may 2006
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 * @author cfaucher
 * @generated NOT
 */
public class InheritanceEdgeDeleteCommand extends Command
{
    
    private static final int SOURCE_ANCHOR = 0;
    
    private static final int TARGET_ANCHOR = 1;
    
    private GraphEdge deletedEdge;
    
    private GraphNode source;
    
    private GraphNode target;
    
    private GraphElement parent;
    
    /**
     * The Constructor
     * @generated NOT
     */
    public InheritanceEdgeDeleteCommand()
    {
        super("Delete inheritance edge");
    }
    
    /**
     * Check if the command can be executed
     * 
     * @see org.eclipse.gef.commands.Command#canExecute()
     * @generated NOT
     */
    public boolean canExecute()
    {
        return true;
    }
    
    /**
     * @see org.eclipse.gef.commands.Command#redo()
     * @generated NOT
     */
    public void redo()
    {
        GraphConnector sourceConnector = (GraphConnector) source.getAnchorage().get(0);
        GraphConnector targetConnector = (GraphConnector) target.getAnchorage().get(0);
        
        if (parent != null)
        {
            // remove the connection from the parent element
            parent.getContained().remove(deletedEdge);
        }
        
        // remove the connection from its different Connectors
        sourceConnector.getGraphEdge().remove(deletedEdge);
        targetConnector.getGraphEdge().remove(deletedEdge);
        
        redoModel();
    }
    
    /**
     * Refresh the sourceModel Object attributes
     * @generated NOT
     */
    protected void redoModel()
    {
        if (Utils.getElement(source) instanceof ClassDefinition && Utils.getElement(target) instanceof ClassDefinition)
        {
        	ClassDefinition sourceClassDef = (ClassDefinition) Utils.getElement(source);
        	ClassDefinition targetClassDef = (ClassDefinition) Utils.getElement(target);
        	Type typeToRemove = KermetaCommonUtils.getReferencingTypeBetween2ClassDef(sourceClassDef, targetClassDef);
        	sourceClassDef.getSuperType().remove(typeToRemove);
        	sourceClassDef.getContainedType().remove(typeToRemove);
        }
    }
    
    /**
     * Removes the connection
     * 
     * @see org.eclipse.gef.commands.Command#execute()
     * @generated NOT
     */
    public void execute()
    {
        parent = deletedEdge.getContainer();
        redo();
    }
    
    /**
     * Restores the connection
     * 
     * @see org.eclipse.gef.commands.Command#undo()
     * @generated NOT
     */
    public void undo()
    {
        // Creates anchor if needed
        if (source.getAnchorage().isEmpty())
        {
            GraphConnector connector = DiagramInterchangeFactory.eINSTANCE.createGraphConnector();
            source.getAnchorage().add(connector);
        }
        GraphConnector srcConnector = (GraphConnector) source.getAnchorage().get(0);
        
        if (target.getAnchorage().isEmpty())
        {
            GraphConnector connector = DiagramInterchangeFactory.eINSTANCE.createGraphConnector();
            target.getAnchorage().add(connector);
        }
        GraphConnector targetConnector = (GraphConnector) target.getAnchorage().get(0);
        
        if (parent != null)
        {
            parent.getContained().add(deletedEdge);
        }
        
        srcConnector.getGraphEdge().add(deletedEdge);
        targetConnector.getGraphEdge().add(deletedEdge);
        
        undoModel();
    }
    
    /**
     * Refresh the sourceModel Object attributes
     * @generated NOT
     */
    protected void undoModel()
    {
    	if (Utils.getElement(source) instanceof ClassDefinition
				&& Utils.getElement(target) instanceof ClassDefinition) {
			ClassDefinition sourceClassDef = (ClassDefinition) Utils
					.getElement(source);
			ClassDefinition targetClassDef = (ClassDefinition) Utils
					.getElement(target);

			// "type" is the class referencing the targeted ClassDefinition
			Class type = StructureFactory.eINSTANCE.createClass();
			type.setTypeDefinition(targetClassDef);

			// Add the class under the given property
			sourceClassDef.getContainedType().add(type);
			sourceClassDef.getSuperType().add(type);
		}
    }
    
    /**
     * Set the edit part that must be deleted
     * 
     * @param model the graph object to be deleted
     * @return the delete command
     * @generated NOT
     */
    public Command setPartToBeDeleted(Object model)
    {
        if (model instanceof GraphEdge)
        {
            deletedEdge = (GraphEdge) model;
            setSource(deletedEdge);
            setTarget(deletedEdge);
            return this;
        }
        
        return null;
    }
    
    /**
     * Retrieve the source Node from the given edge
     * 
     * @param edge the GraphEdge concerned by the Command
     * @generated NOT
     */
    private void setSource(GraphEdge edge)
    {
        this.source = (GraphNode) ((GraphConnector) edge.getAnchor().get(SOURCE_ANCHOR)).eContainer();
    }
    
    /**
     * Get the sourceNode of the link
     * 
     * @return the sourceNode
     */
    public GraphNode getSource()
    {
        return source;
    }
    
    /**
     * Retrieve the target Node from the given edge
     * 
     * @param edge the GraphEdge concerned by the Command
     * @generated NOT
     */
    private void setTarget(GraphEdge edge)
    {
        if (edge.getAnchor().size() == 1)
        {
            // the target Node is the same as source Node
            this.target = (GraphNode) ((GraphConnector) edge.getAnchor().get(SOURCE_ANCHOR)).eContainer();
        }
        else
        {
            this.target = (GraphNode) ((GraphConnector) edge.getAnchor().get(TARGET_ANCHOR)).eContainer();
        }
        
    }
}
