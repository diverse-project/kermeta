package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.eclipse.draw2d.PositionConstants;
import org.topcased.draw2d.figures.ILabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.figures.DiagramFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;

/**
 * The figure to display a kmClassDiagram.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureDiagramFigure extends DiagramFigure {
	/**
	 * @see org.topcased.draw2d.figures.ContainerFigure#createLabel()
	 */
	protected ILabel createLabel() {
		Label header = new Label();
		header.setLabelAlignment(PositionConstants.LEFT);
		header.setIcon(StructureImageRegistry.getImage("PACKAGE"));
		header.setBorder(new PackageHeaderFigureBorder());

		return header;
	}

}
