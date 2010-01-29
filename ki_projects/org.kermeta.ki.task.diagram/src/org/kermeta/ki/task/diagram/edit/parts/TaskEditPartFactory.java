package org.kermeta.ki.task.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TaskVisualIDRegistry.getVisualID(view)) {

			case TaskModelEditPart.VISUAL_ID:
				return new TaskModelEditPart(view);

			case UserEditPart.VISUAL_ID:
				return new UserEditPart(view);

			case UserNameEditPart.VISUAL_ID:
				return new UserNameEditPart(view);

			case UserOperationEditPart.VISUAL_ID:
				return new UserOperationEditPart(view);

			case InteractionEditPart.VISUAL_ID:
				return new InteractionEditPart(view);

			case InteractionNameEditPart.VISUAL_ID:
				return new InteractionNameEditPart(view);

			case InteractionOperationEditPart.VISUAL_ID:
				return new InteractionOperationEditPart(view);

			case ApplicationEditPart.VISUAL_ID:
				return new ApplicationEditPart(view);

			case ApplicationNameEditPart.VISUAL_ID:
				return new ApplicationNameEditPart(view);

			case ApplicationOperationEditPart.VISUAL_ID:
				return new ApplicationOperationEditPart(view);

			case AbstractEditPart.VISUAL_ID:
				return new AbstractEditPart(view);

			case AbstractNameEditPart.VISUAL_ID:
				return new AbstractNameEditPart(view);

			case AbstractOperationEditPart.VISUAL_ID:
				return new AbstractOperationEditPart(view);

			case EnablingEditPart.VISUAL_ID:
				return new EnablingEditPart(view);

			case EnablingFigureLabelDescEditPart.VISUAL_ID:
				return new EnablingFigureLabelDescEditPart(view);

			case EnablingWithInformationEditPart.VISUAL_ID:
				return new EnablingWithInformationEditPart(view);

			case EnablingInfoFigureLabelDescEditPart.VISUAL_ID:
				return new EnablingInfoFigureLabelDescEditPart(view);

			case Interleaving2EditPart.VISUAL_ID:
				return new Interleaving2EditPart(view);

			case InterleavingFigureLabelDescEditPart.VISUAL_ID:
				return new InterleavingFigureLabelDescEditPart(view);

			case InterleavingEditPart.VISUAL_ID:
				return new InterleavingEditPart(view);

			case SynchroFigureLabelDescEditPart.VISUAL_ID:
				return new SynchroFigureLabelDescEditPart(view);

			case DesactivationEditPart.VISUAL_ID:
				return new DesactivationEditPart(view);

			case DesactivFigureLabelDescEditPart.VISUAL_ID:
				return new DesactivFigureLabelDescEditPart(view);

			case TaskSubtasksEditPart.VISUAL_ID:
				return new TaskSubtasksEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
