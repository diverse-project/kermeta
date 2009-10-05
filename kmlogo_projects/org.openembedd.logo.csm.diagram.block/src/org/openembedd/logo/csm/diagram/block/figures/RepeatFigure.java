/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.figures;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.IContainerFigure;
import org.topcased.draw2d.figures.ILabel;
import org.topcased.draw2d.figures.ILabelFigure;
import org.topcased.modeler.ModelerColorConstants;

/**
 * extends org.topcased.draw2d.figures.ContainerWithInnerLabel
 * 
 * @generated NOT
 */
public class RepeatFigure extends Figure implements IContainerFigure, ILabelFigure
{
	private ILabel	header;

	private IFigure	contentPane;

	final Border	NORMAL_BORDER		= new LineBorder(0);

	final Border	INITSTATE_BORDER	= new LineBorder(3);

	/**
	 * Constructor
	 * 
	 * @generated NOT
	 */
	public RepeatFigure()
	{
		this.setBorder(NORMAL_BORDER);
		GridLayout gridLayout = new GridLayout();
		gridLayout.verticalSpacing = 0;
		gridLayout.horizontalSpacing = 0;
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		setLayoutManager(gridLayout);

		Figure headerContainer = new Figure();
		headerContainer.setBorder(new MacroStateHeaderFigureBorder());
		headerContainer.setLayoutManager(new BorderLayout());
		headerContainer.setOpaque(true);
		headerContainer.setBackgroundColor(ModelerColorConstants.white);
		header = new EditableLabel();
		headerContainer.add(header, BorderLayout.CENTER);

		add(headerContainer, new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		contentPane = createContainer();
		add(contentPane, new GridData(GridData.FILL_BOTH));
	}

	/**
	 * Return the contentPane figure
	 * 
	 * @return the Container Figure
	 * @generated NOT
	 */
	public IFigure getContentPane()
	{
		return contentPane;
	}

	/**
	 * @return create the container
	 * @generated NOT
	 */
	protected IFigure createContainer()
	{
		Figure container = new Figure();
		container.setLayoutManager(new XYLayout());
		container.setOpaque(true);
		container.setBorder(new LineBorder(1));

		return container;
	}

	/**
	 * @param isInitState
	 *        true if the state must be drawn as the initial state
	 * @generated NOT
	 */
	public void setInitState(boolean isInitState)
	{
		if (isInitState)
			this.setBorder(INITSTATE_BORDER);
		else
			this.setBorder(NORMAL_BORDER);
	}

	/**
	 * A Border at the left, top and right of the label
	 * 
	 * @generated NOT
	 */
	class MacroStateHeaderFigureBorder extends LineBorder
	{
		private final Insets	INSETS	= new Insets(1);

		/**
		 * @see org.eclipse.draw2d.Border#getInsets(org.eclipse.draw2d.IFigure)
		 * @generated NOT
		 */
		public Insets getInsets(IFigure figure)
		{
			return INSETS;
		}

		/**
		 * Draw the 3 borders
		 * 
		 * @see org.eclipse.draw2d.Border#paint(org.eclipse.draw2d.IFigure, org.eclipse.draw2d.Graphics,
		 *      org.eclipse.draw2d.geometry.Insets)
		 * @generated NOT
		 */
		public void paint(IFigure figure, Graphics graphics, Insets insets)
		{
			tempRect.setBounds(getPaintRectangle(figure, insets));
			if (getWidth() % 2 == 1)
			{
				tempRect.width--;
			}
			tempRect.shrink(getWidth() / 2, getWidth() / 2);
			tempRect.height = tempRect.height + getWidth() / 2;
			graphics.setLineWidth(getWidth());
			if (getColor() != null)
			{
				graphics.setForegroundColor(getColor());
			}

			graphics.drawLine(tempRect.getBottomLeft(), tempRect.getTopLeft());
			graphics.drawLine(tempRect.getTopLeft(), tempRect.getTopRight());
			graphics.drawLine(tempRect.getTopRight(), tempRect.getBottomRight());
		}
	}

	/**
	 * @see org.topcased.draw2d.figures.ILabelFigure#getLabel()
	 * @generated NOT
	 */
	public ILabel getLabel()
	{
		return header;
	}

}
