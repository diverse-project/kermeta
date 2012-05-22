package org.kermeta.kompren.gwelet.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.impl.RectangleEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;

import fr.inria.zvtm.glyphs.Composite;
import fr.inria.zvtm.glyphs.DPath;
import fr.inria.zvtm.glyphs.VText;

/**
 * Defines an entity that corresponds to a class of a class diagram.
 * @author Arnaud Blouin
 */
public class ClassView extends RectangleEntityView {
	/** The gap is used to add spaces add the left and the right of the class. */
	public static final float WIDTH_GAP = 2f;

	/** The gap is used to add spaces between the title and the top line, the last operation and the bottom line, etc. */
	public static final float HEIGHT_GAP = 4f;

	/** Used to add spaces around the name of the class. */
	public static final float HEIGHT_HEADER_GAP = 10f;

	/** The views of the attributes of the class. */
	protected List<AttributeView> attributes;

	/** The views of the operations of the class. */
	protected List<OperationView> operations;

	/** Defines if the attributes must be visible or not. */
	protected boolean propertiesVisible;

	/** Defines if the operations must be visible or not. */
	protected boolean operationsVisible;

	protected DPath boundPath;

	protected Composite glyphClass;

	protected VText glyphTitle;


	/**
	 * Initialises a class.
	 * @param name The name of the class.
	 * @throws IllegalArgumentException If the given name is null.
	 */
	public ClassView(final String name) {
		super(name);

		glyphClass			= new Composite();
		boundPath			= new DPath();
		glyphTitle			= new VText(name);
		operationsVisible 	= true;
		propertiesVisible	= true;
		attributes	   		= new ArrayList<AttributeView>();
		operations	   		= new ArrayList<OperationView>();

		initGlyphs();
		update();
		initAnchors();
	}


	protected void initGlyphs() {
		boundPath.jump(0, 0, true);
		boundPath.addSegment(1, 0, true);
		boundPath.addSegment(1, 1, true);
		boundPath.addSegment(0, 1, true);
		boundPath.addSegment(0, 0, true);

		glyphClass.addChild(boundPath);
		glyphClass.addChild(glyphTitle);
		glyphClass.setColor(Color.BLACK);
	}



	public Composite getGlyph() {
		return glyphClass;
	}


	@Override
	public void anchorRelation(final IRelationView relation, final IEntityView opposite, final boolean atEnd) {
		super.anchorRelation(relation, opposite, atEnd);

		if(relation instanceof RelationClassView)
			((RelationClassView)relation).reinitRoles();
	}


	/**
	 * Adds an attribute to the class.
	 * @param attrName The name of the attribute.
	 * @param attrTypeName The name of the type of the attribute.
	 * @return The created view of the attribute or null if the given parameters are null or empty.
	 */
	public AttributeView addAttribute(final String attrName, final String attrTypeName) {
		final AttributeView attr;

		if(attrName==null || attrTypeName==null || attrName.length()==0 || attrTypeName.length()==0)
			attr = null;
		else {
			attr = new AttributeView(attrName, attrTypeName, this);
			attributes.add(attr);
			glyphClass.addChild(attr.getGlyphText());
		}

		return attr;
	}


	/**
	 * Removes an attribute from the class.
	 * @param attr The attribute to remove.
	 */
	public void removeAttribute(final AttributeView attr) {
		if(attr!=null && attributes.remove(attr))
			update();
	}


	/**
	 * Adds an operation to the class.
	 * @param opName The name of the operation.
	 * @param opTypeName The name of the type of the operation.
	 * @param isAbs True: the operation is abstract.
	 * @return The created view of the operation or null if the given name is null or empty.
	 */
	public OperationView addOperation(final String opName, final String opTypeName, final boolean isAbs) {
		final OperationView op;

		if(opName==null || opName.length()==0)
			op = null;
		else {
			op = new OperationView(opName, opTypeName, isAbs, this);
			operations.add(op);
		}

		return op;
	}



	/**
	 * Removes an operation from the class.
	 * @param op The operation to remove.
	 */
	public void removeOperation(final OperationView op) {
		if(operations.remove(op))
			update();
	}



	@Override
	public Dimension getPreferredSize() {
		final Rectangle2D titleBounds 	= getTitleBounds();
		Dimension dim 					= new Dimension();
		int width;

		dim.height = (int) (titleBounds.getHeight() + HEIGHT_HEADER_GAP*2);
		dim.width  = (int) (titleBounds.getWidth() + 2*WIDTH_GAP);

		if(propertiesVisible)
			for(AttributeView attr : attributes) {
				width = (int) attr.getWidth();

				if(dim.width<width+WIDTH_GAP*2f)
					dim.width = (int) (2*WIDTH_GAP+width);

				dim.height += attr.getHeight()+HEIGHT_GAP;
			}

		if(operationsVisible)
			for(OperationView op : operations) {
				width = (int) op.getWidth();

				if(dim.width<width+WIDTH_GAP*2f)
					dim.width = (int) (2*WIDTH_GAP+width);

				dim.height += op.getHeight()+HEIGHT_GAP;
			}

		dim.width  = (int) (Math.max(dim.width, 30)*scale);
		dim.height = (int) (Math.max(dim.height, 20)*scale);

		return dim;
	}



	@Override
	public void updateFillingColor(final int opacity) {
		fillingColor = new Color(198,218,218, opacity);
	}


	/**
	 * @return The font used to display the title of the class.
	 */
	public Font getTitleFont() {
		return new Font(getFontName(), fontStyle+Font.BOLD, (int)fontSize);
	}


	/**
	 * @return The rectangle that bounds the displayed title of the class.
	 */
	protected Rectangle2D getTitleBounds() {
		return new TextLayout(name, getTitleFont(), FONT_RENDER_CONT).getBounds();
	}


	@Override
	public void paint(final Graphics2D g) {
		if(!isVisible())
			return ;

		final Rectangle2D titleBounds = getTitleBounds();
		final int textWidth  		= (int) titleBounds.getWidth();
		final int textHeight  		= (int) titleBounds.getHeight();
		final int textHeaderHeight 	= (int) (textHeight + HEIGHT_HEADER_GAP);

		g.setColor(fillingColor);
		g.fill(path);
		g.setColor(lineColor);
		g.draw(path);
		g.setColor(Color.BLACK);
		g.setFont(getTitleFont());
		g.drawString(name, (float)centre.x-textWidth/2, (float)centre.y-getPreferredSize().height/2+textHeight+(textHeaderHeight-textHeight)/2);
		g.setFont(getFont());

		if(propertiesVisible)
			for(AttributeView attr : attributes)
				attr.paint(g);

		if(operationsVisible)
			for(OperationView op : operations)
				op.paint(g);

//		for(IAnchor anchor : anchors)
//			anchor.paint(g);
	}


	@Override
	public void translate(final double tx, final double ty) {
		super.translate(tx, ty);

		for(final OperationView op : operations)
			op.position.setLocation(op.position.getX()+tx, op.position.getY()+ty);

		for(final AttributeView attr : attributes)
			attr.position.setLocation(attr.position.getX()+tx, attr.position.getY()+ty);

		boundPath.move(tx, ty);
	}



	@Override
	public void update() {
		final Rectangle2D oldBorders	= path.getBounds2D();
		final Dimension dim    			= getPreferredSize();
		final Rectangle2D titleBounds 	= getTitleBounds();
		int textHeight  				= (int) titleBounds.getHeight();
		final int textHeaderHeight   	= (int) (textHeight + HEIGHT_HEADER_GAP);
		final float halfWidth  = dim.width/2f;
		final float halfHeight = dim.height/2f;
		final float cx 		   = (float) centre.x;
		final float cy 		   = (float) centre.y;
		final float xAttr 	   = cx-halfWidth + WIDTH_GAP;
		float yAttr 		   = cy-halfHeight + textHeaderHeight + HEIGHT_GAP;

//		updateBoundPath(path, dim.width, dim.height, cx, cy);
		updateBoundPath(boundPath, dim.width, dim.height, cx, cy);
		path.moveTo(cx-halfWidth, cy-halfHeight+textHeaderHeight);
		path.lineTo(cx+halfWidth, cy-halfHeight+textHeaderHeight);

		glyphTitle.move(-titleBounds.getWidth()/2., 0);
		glyphTitle.setFont(getTitleFont());

		if(propertiesVisible)
			for(AttributeView attr : attributes) {
				textHeight 	= (int) attr.getHeight();
				yAttr 		+= textHeight;
				attr.setPosition(xAttr, yAttr);
				yAttr += HEIGHT_GAP;
			}

		if(operationsVisible) {
			if(!operations.isEmpty() && visibility==Visibility.STANDARD) {
				path.moveTo(cx-halfWidth, yAttr);
				path.lineTo(cx+halfWidth, yAttr);
			}

			for(OperationView op : operations) {
				textHeight 	= (int) op.getHeight();
				yAttr 		+= textHeight;
				op.setPosition(xAttr, yAttr);
				yAttr += HEIGHT_GAP;
			}
		}

		updateAnchorsPosition(oldBorders);
	}



	private static void updateBoundPath(final DPath path, final double width, final double height, final double cx, final double cy) {
		final double halfWidth  = width/2.;
		final double halfHeight = height/2.;

		path.edit(new Point2D.Double[]{new Point2D.Double(cx-halfWidth, cy-halfHeight), new Point2D.Double(cx+halfWidth, cy-halfHeight),
				new Point2D.Double(cx+halfWidth, cy+halfHeight), new Point2D.Double(cx-halfWidth, cy+halfHeight),
				new Point2D.Double(cx-halfWidth, cy-halfHeight)}, true);
	}



	@Override
	public void updateLineColor(final int opacity) {
		lineColor = new Color(0, 0, 0, opacity);
	}



	@Override
	public void onUnpruning() {
		for(final AttributeView attr : attributes)
			attr.setVisibility(Visibility.STANDARD);

		for(final OperationView op : operations)
			op.setVisibility(Visibility.STANDARD);

		super.onUnpruning();
	}


	/**
	 * @return True: the attributes are displayed.
	 */
	public boolean isPropertiesVisible() {
		return propertiesVisible;
	}


	/**
	 * Sets if the attributes must be displayed.
	 * @param propertiesVisible True: the attributes are displayed.
	 */
	public void setPropertiesVisible(final boolean propertiesVisible) {
		this.propertiesVisible = propertiesVisible;
	}



	/**
	 * @return True: the operations are displayed.
	 */
	public boolean isOperationsVisible() {
		return operationsVisible;
	}


	/**
	 * Sets if the operations must be displayed.
	 * @param operationsVisible True: the operations are displayed.
	 */
	public void setOperationsVisible(final boolean operationsVisible) {
		this.operationsVisible = operationsVisible;
	}


	public void setIsAbstract(final boolean isAbstract) {
		fontStyle = isAbstract ? Font.ITALIC : Font.PLAIN;
	}


	@Override
	public GeneralPath getBoundPath() {
//		return boundPath;
		return null;//FIXME
	}
}
