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
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * FProperty edge creation command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 * CreateTypedEdgeCommand
 */
public class FPropertyEdgeCreationCommand extends CreateTypedEdgeCommand //CreateGraphEdgeCommand
{

	// TODO : CreateTypedEdgeCommand
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPropertyEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphNode src) {
		this(domain, newObj, src, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPropertyEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphNode src, boolean needModelUpdate) {
		//super(domain, newObj, src, Utils.getDiagram(src), null, needModelUpdate);
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void redoModel() {

		FClassDefinition sourceFClass = (FClassDefinition) Utils
				.getElement(source);
		FClassDefinition targetFClass = (FClassDefinition) Utils
				.getElement(target);
		FProperty fProperty = (FProperty) Utils.getElement(edge);

		fProperty.setFType(KermetaUtils.getDefault()
				.createFTypeForFTypeDefinition(targetFClass));
		fProperty.getFContainedType().clear();
        
        // Fix the type containments once the FOperation element is complete -> not optimal
		KermetaUtils.getDefault().getTypeFixer().accept(fProperty);		

		sourceFClass.getFOwnedAttributes().add(fProperty);

		initName();

	}

	/**
	 * This method is generated initially, but contains only a call to super type
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void undoModel() {
		FClassDefinition sourceFClass = (FClassDefinition) Utils
				.getElement(source);
		FProperty fProperty = (FProperty) Utils.getElement(edge);
		sourceFClass.getFOwnedAttributes().remove(fProperty);
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