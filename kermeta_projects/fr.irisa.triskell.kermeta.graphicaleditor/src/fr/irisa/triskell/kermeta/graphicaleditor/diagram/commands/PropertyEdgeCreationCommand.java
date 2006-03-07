package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditDomain;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * Property edge creation command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 * CreateTypedEdgeCommand
 */
public class PropertyEdgeCreationCommand extends CreateTypedEdgeCommand //CreateGraphEdgeCommand
{

	// TODO : CreateTypedEdgeCommand
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphNode src) {
		this(domain, newObj, src, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphNode src, Boolean needModelUpdate) {
		//super(domain, newObj, src, Utils.getDiagram(src), null, needModelUpdate);
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void redoModel() {

		ClassDefinition sourceFClass = (ClassDefinition) Utils
				.getElement(source);
		ClassDefinition targetFClass = (ClassDefinition) Utils
				.getElement(target);
		Property fProperty = (Property) Utils.getElement(edge);

		fProperty.setType(KermetaUtils.getDefault()
				.createTypeForTypeDefinition(targetFClass));
		fProperty.getContainedType().clear();

		// Fix the type containments once the Operation element is complete -> not optimal
		KermetaUtils.getDefault().getTypeFixer().accept(fProperty);

		sourceFClass.getOwnedAttribute().add(fProperty);

		initName();

	}

	/**
	 * This method is generated initially, but contains only a call to super type
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void undoModel() {
		ClassDefinition sourceFClass = (ClassDefinition) Utils
				.getElement(source);
		Property fProperty = (Property) Utils.getElement(edge);
		sourceFClass.getOwnedAttribute().remove(fProperty);
	}

	/* -------------------------------------------------------------------------
	 * 
	 * 
	 *  The above code was not generated and is an adapted copy of
	 *  topcased ecore editor.
	 * 
	 * 
	 * 
	 * -------------------------------------------------------------------------
	 */

}