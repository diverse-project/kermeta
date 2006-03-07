package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import org.eclipse.gef.EditDomain;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;

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
			GraphNode src, Boolean needModelUpdate) {
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void redoModel() { 
		ClassDefinition sourceClassDefinition = (ClassDefinition) Utils.getElement(source);
		ClassDefinition targetClassDefinition = (ClassDefinition) Utils.getElement(target);
		KermetaUtils.getDefault().addSuperTypeToClassDefinition(sourceClassDefinition, targetClassDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void undoModel() {
        ClassDefinition sourceClassDefinition = (ClassDefinition) Utils.getElement(source);
        ClassDefinition targetClassDefinition = (ClassDefinition) Utils.getElement(target);
        KermetaUtils.getDefault().removeSuperTypeFromClassDefinition(sourceClassDefinition, targetClassDefinition);
	}

}