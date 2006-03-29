package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import org.eclipse.gef.EditDomain;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
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
	 * @param domain the edit domain
	 * @param newObj the graph edge of the new connection
	 * @param src the graph element of the source
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphElement src) {
		this(domain, newObj, src, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param domain the edit domain
	 * @param newObj the graph edge of the new connection
	 * @param src the graph element of the source
	 * @param needModelUpdate set it to true if the model need to be updated
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphElement src, boolean needModelUpdate) {
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void redoModel() {
		ClassDefinition sourceClassDefinition = (ClassDefinition) Utils
				.getElement(source);
		ClassDefinition targetClassDefinition = (ClassDefinition) Utils
				.getElement(target);
		KermetaUtils.getDefault().addSuperTypeToClassDefinition(
				sourceClassDefinition, targetClassDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void undoModel() {
		ClassDefinition sourceClassDefinition = (ClassDefinition) Utils
				.getElement(source);
		ClassDefinition targetClassDefinition = (ClassDefinition) Utils
				.getElement(target);
		KermetaUtils.getDefault().removeSuperTypeFromClassDefinition(
				sourceClassDefinition, targetClassDefinition);
	}
	
	public GraphElement getSource()
	{	return source; }
	public GraphElement getTarget()
	{	return target; }

}