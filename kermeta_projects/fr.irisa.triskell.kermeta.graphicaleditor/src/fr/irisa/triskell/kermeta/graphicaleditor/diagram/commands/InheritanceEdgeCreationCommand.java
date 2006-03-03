package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import org.eclipse.gef.EditDomain;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;

/**
 * Inheritance edge creation command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritanceEdgeCreationCommand extends CreateTypedEdgeCommand {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphNode src) {
		this(domain, newObj, src, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphNode src, boolean needModelUpdate) {
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void redoModel() { 
		FClassDefinition sourceFClassDefinition = (FClassDefinition) Utils.getElement(source);
		FClassDefinition targetFClassDefinition = (FClassDefinition) Utils.getElement(target);
		KermetaUtils.getDefault().addFSuperTypeToFClassDefinition(sourceFClassDefinition, targetFClassDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void undoModel() {
        FClassDefinition sourceFClassDefinition = (FClassDefinition) Utils.getElement(source);
        FClassDefinition targetFClassDefinition = (FClassDefinition) Utils.getElement(target);
        KermetaUtils.getDefault().removeFSuperTypeFromFClassDefinition(sourceFClassDefinition, targetFClassDefinition);
	}

}