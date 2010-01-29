package org.kermeta.ki.task.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.kermeta.ki.task.diagram.edit.policies.AbstractItemSemanticEditPolicy;
import org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry;
import org.kermeta.ki.task.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class AbstractEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public AbstractEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AbstractItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		AbstractFigure figure = new AbstractFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public AbstractFigure getPrimaryShape() {
		return (AbstractFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AbstractNameEditPart) {
			((AbstractNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureAbstractNameFigure());
			return true;
		}
		if (childEditPart instanceof AbstractOperationEditPart) {
			((AbstractOperationEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureUnaryOpLabelAbs());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AbstractNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AbstractOperationEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(TaskVisualIDRegistry
				.getType(AbstractNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(TaskElementTypes.Enabling_4001);
		types.add(TaskElementTypes.EnablingWithInformation_4002);
		types.add(TaskElementTypes.Interleaving_4003);
		types.add(TaskElementTypes.Synchronization_4004);
		types.add(TaskElementTypes.Desactivation_4005);
		types.add(TaskElementTypes.TaskSubtasks_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof UserEditPart) {
			types.add(TaskElementTypes.Enabling_4001);
		}
		if (targetEditPart instanceof InteractionEditPart) {
			types.add(TaskElementTypes.Enabling_4001);
		}
		if (targetEditPart instanceof ApplicationEditPart) {
			types.add(TaskElementTypes.Enabling_4001);
		}
		if (targetEditPart instanceof org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart) {
			types.add(TaskElementTypes.Enabling_4001);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(TaskElementTypes.EnablingWithInformation_4002);
		}
		if (targetEditPart instanceof InteractionEditPart) {
			types.add(TaskElementTypes.EnablingWithInformation_4002);
		}
		if (targetEditPart instanceof ApplicationEditPart) {
			types.add(TaskElementTypes.EnablingWithInformation_4002);
		}
		if (targetEditPart instanceof org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart) {
			types.add(TaskElementTypes.EnablingWithInformation_4002);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(TaskElementTypes.Interleaving_4003);
		}
		if (targetEditPart instanceof InteractionEditPart) {
			types.add(TaskElementTypes.Interleaving_4003);
		}
		if (targetEditPart instanceof ApplicationEditPart) {
			types.add(TaskElementTypes.Interleaving_4003);
		}
		if (targetEditPart instanceof org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart) {
			types.add(TaskElementTypes.Interleaving_4003);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(TaskElementTypes.Synchronization_4004);
		}
		if (targetEditPart instanceof InteractionEditPart) {
			types.add(TaskElementTypes.Synchronization_4004);
		}
		if (targetEditPart instanceof ApplicationEditPart) {
			types.add(TaskElementTypes.Synchronization_4004);
		}
		if (targetEditPart instanceof org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart) {
			types.add(TaskElementTypes.Synchronization_4004);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(TaskElementTypes.Desactivation_4005);
		}
		if (targetEditPart instanceof InteractionEditPart) {
			types.add(TaskElementTypes.Desactivation_4005);
		}
		if (targetEditPart instanceof ApplicationEditPart) {
			types.add(TaskElementTypes.Desactivation_4005);
		}
		if (targetEditPart instanceof org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart) {
			types.add(TaskElementTypes.Desactivation_4005);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(TaskElementTypes.TaskSubtasks_4006);
		}
		if (targetEditPart instanceof InteractionEditPart) {
			types.add(TaskElementTypes.TaskSubtasks_4006);
		}
		if (targetEditPart instanceof ApplicationEditPart) {
			types.add(TaskElementTypes.TaskSubtasks_4006);
		}
		if (targetEditPart instanceof org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart) {
			types.add(TaskElementTypes.TaskSubtasks_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(TaskElementTypes.Enabling_4001);
		types.add(TaskElementTypes.EnablingWithInformation_4002);
		types.add(TaskElementTypes.Interleaving_4003);
		types.add(TaskElementTypes.Synchronization_4004);
		types.add(TaskElementTypes.Desactivation_4005);
		types.add(TaskElementTypes.TaskSubtasks_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Enabling_4001) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.EnablingWithInformation_4002) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Interleaving_4003) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Synchronization_4004) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.Desactivation_4005) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.User_2001);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.Interaction_2002);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.Application_2003);
		}
		if (relationshipType == TaskElementTypes.TaskSubtasks_4006) {
			types.add(TaskElementTypes.Abstract_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class AbstractFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAbstractNameFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnaryOpLabelAbs;

		/**
		 * @generated
		 */
		public AbstractFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			this.setLineWidth(0);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure recCloudUnary0 = new RectangleFigure();
			recCloudUnary0.setFill(false);
			recCloudUnary0.setOutline(false);
			recCloudUnary0.setLineWidth(0);

			this.add(recCloudUnary0);

			ToolbarLayout layoutRecCloudUnary0 = new ToolbarLayout();
			layoutRecCloudUnary0.setStretchMinorAxis(false);
			layoutRecCloudUnary0.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutRecCloudUnary0.setSpacing(5);
			layoutRecCloudUnary0.setVertical(false);

			recCloudUnary0.setLayoutManager(layoutRecCloudUnary0);

			SVGFigure cloud1 = new SVGFigure();
			cloud1
					.setURI("platform:/plugin/org.kermeta.ki.task/resources/cloud.svg");
			cloud1.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(75)));

			recCloudUnary0.add(cloud1);

			fFigureUnaryOpLabelAbs = new WrappingLabel();
			fFigureUnaryOpLabelAbs.setText(" ");

			recCloudUnary0.add(fFigureUnaryOpLabelAbs);

			fFigureAbstractNameFigure = new WrappingLabel();
			fFigureAbstractNameFigure.setText("task");

			this.add(fFigureAbstractNameFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAbstractNameFigure() {
			return fFigureAbstractNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnaryOpLabelAbs() {
			return fFigureUnaryOpLabelAbs;
		}

	}

}
