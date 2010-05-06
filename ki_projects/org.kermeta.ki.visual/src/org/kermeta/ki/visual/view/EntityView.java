package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;


public abstract class EntityView extends ComponentView {
	public static final float WIDTH_GAP = 2f;
	
	public static final float HEIGHT_GAP = 4f;
	
	public static final float HEIGHT_HEADER_GAP = 10f;
	
	protected MetamodelView metamodel;//FIXME may provoke memory leaks when a class is removed but not dereferenced from the metamodel.
	
	protected Point2D.Double centre;
	
	protected Color lineColor;
	
	protected Color fillingColor;
	
	protected String name;
	
	protected double scale;

	protected double fontSize;
	
	protected Font font;
	
	protected int fontStyle;
	
	protected List<AttributeView> attributes; 
	
	protected List<OperationView> operations; 
	
	
	protected static final Graphics2D		 GRAPHICS;
	protected static final FontMetrics 		 FONT_METRICS;
	protected static final FontRenderContext FONT_RENDER_CONT;
	
	static {
		BufferedImage bufferImage = new BufferedImage(2, 2, BufferedImage.TYPE_INT_RGB);
		GRAPHICS = bufferImage.createGraphics();
		GRAPHICS.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		FONT_METRICS 	 = GRAPHICS.getFontMetrics();
		FONT_RENDER_CONT = GRAPHICS.getFontRenderContext();
		
		bufferImage.flush();
		bufferImage = null;
	}
	
	
	
	public static RuntimeObject onAttributeAdded(RuntimeObject entityRO, RuntimeObject propertyRO, 
						RuntimeObject nameRO, RuntimeObject typeNameRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		String name		= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		String typeName	= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(typeNameRO);
		AttributeView attr = new AttributeView(name, typeName, view);
		view.attributes.add(attr);
		view.update();
		propertyRO.setUserData(attr);
		
		return entityRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject onAttributeRemoved(RuntimeObject entityRO, RuntimeObject propertyRO) {
		EntityView view 	= (EntityView) entityRO.getUserData();
		AttributeView attr 	= (AttributeView) propertyRO.getUserData();
		
		view.attributes.remove(attr);
		view.update();
		propertyRO.setUserData(null);
		
		return entityRO.getFactory().getMemory().voidINSTANCE; 
	}
		
		
	
	public static RuntimeObject onOperationAdded(RuntimeObject entityRO, RuntimeObject opRO, 
						RuntimeObject nameRO, RuntimeObject typeNameRO, RuntimeObject abstractRO) {
			EntityView view  = (EntityView) entityRO.getUserData();
			String name		 = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
			String typeName	 = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(typeNameRO);
			Boolean isAbs	 = fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(abstractRO);
			OperationView op = new OperationView(name, typeName, isAbs, view);
			
			view.operations.add(op);
			view.update();
			opRO.setUserData(op);
			
			return entityRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	
	public static RuntimeObject onOperationRemoved(RuntimeObject entityRO, RuntimeObject opRO) {
		EntityView view  = (EntityView) entityRO.getUserData();
		OperationView op = (OperationView) opRO.getUserData();
		
		view.operations.remove(op);
		view.update();
		opRO.setUserData(null);
		
		return entityRO.getFactory().getMemory().voidINSTANCE; 
	}

	
	
	public static RuntimeObject contains(RuntimeObject entityRO, RuntimeObject xRO, RuntimeObject yRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		double x = Real.getValue(xRO);
		double y = Real.getValue(yRO);
		boolean contains = view.isVisible() && view.getBordersZoomed().contains(x, y);
		
		return contains ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE; 
	}
	
	

	public static RuntimeObject unprune(RuntimeObject entityRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		
		view.visibility = Visibility.STANDARD;
		view.setScale(1.);
		view.lineColor 	   = view.getLineColor(255);
		view.fillingColor  = view.getFillingColor(255);
		
		for(AttributeView attr : view.attributes)
			attr.visibility = Visibility.STANDARD;
		
		for(OperationView op : view.operations)
			op.visibility = Visibility.STANDARD;
		
		view.update();
		
		return entityRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject update(RuntimeObject entityRO, RuntimeObject newNameRO, RuntimeObject abstractRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		String newName  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(newNameRO);
		Boolean isAbstract = fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(abstractRO);
		
		view.name = newName;
		view.fontStyle = isAbstract ? Font.ITALIC : Font.PLAIN;
		view.update();
		
		return entityRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public EntityView(String name, MetamodelView metamodel) {
		super();
		
		if(metamodel==null)
			throw new IllegalArgumentException();
		
		this.metamodel = metamodel;
		this.name = name;
		
		attributes	   = new ArrayList<AttributeView>();
		operations	   = new ArrayList<OperationView>();
		fontStyle	   = Font.PLAIN;
		path 		   = new GeneralPath();
		centre 		   = new Point2D.Double();
		lineColor 	   = getLineColor(255);
		fillingColor   = getFillingColor(255);
		setScale(1.);
		update();
	}
	
	
	
	public abstract Color getFillingColor(int opacity);
	
	
	public abstract Color getLineColor(int opacity);
	
	
	
	@Override
	public void paint(Graphics2D g) {
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
		g.setFont(font);
		g.drawString(name, (float)centre.x-textWidth/2, (float)centre.y-getPreferredSize().height/2+textHeight+(textHeaderHeight-textHeight)/2);
		
		if(metamodel.attributesVisible)
			for(AttributeView attr : attributes)
				attr.paint(g);
		
		if(metamodel.operationsVisible)
			for(OperationView op : operations)
				op.paint(g);
	}
	
	
	
	public void setScale(final double scale) {
		if(scale>0.) {
			this.scale = scale;
			fontSize   = 14.*scale;
			update();
		}
	}
	
	
	
	
	@Override
	public void update() {
		font = new Font("Arial", fontStyle, (int)fontSize);
		
		final Dimension dim    			= getPreferredSize();
		final Rectangle2D titleBounds 	= getTitleBounds();
		int textHeight  				= (int) titleBounds.getHeight();
		final int textHeaderHeight   	= (int) (textHeight + HEIGHT_HEADER_GAP);
		final float halfWidth  = (dim.width/2f);
		final float halfHeight = (dim.height/2f);
		final float cx 		   = (float) centre.x;
		final float cy 		   = (float) centre.y;
		final float xAttr 	   = cx-halfWidth + WIDTH_GAP;
		float yAttr 		   = cy-halfHeight + textHeaderHeight + HEIGHT_GAP;
		
		path.reset();
		path.moveTo(cx-halfWidth, cy-halfHeight);
		path.lineTo(cx+halfWidth, cy-halfHeight);
		path.lineTo(cx+halfWidth, cy+halfHeight);
		path.lineTo(cx-halfWidth, cy+halfHeight);
		path.closePath();
		path.moveTo(cx-halfWidth, cy-halfHeight+textHeaderHeight);
		path.lineTo(cx+halfWidth, cy-halfHeight+textHeaderHeight);
		
		if(metamodel.attributesVisible)
			for(AttributeView attr : attributes) {
				textHeight 	= (int) attr.getHeight();
				yAttr 		+= textHeight;
				attr.setPosition(xAttr, yAttr);
				yAttr += HEIGHT_GAP;
			}
		
		if(metamodel.operationsVisible) {
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
	}
	
	
	
	protected Rectangle2D getTitleBounds() {
		return new TextLayout(name, font, FONT_RENDER_CONT).getBounds();
	}
	
	
	
	protected Dimension getPreferredSize() {
		final Rectangle2D titleBounds 	= getTitleBounds();
		Dimension dim 					= new Dimension();
		int width;
		
		dim.height = (int) (titleBounds.getHeight() + HEIGHT_HEADER_GAP*2);
		dim.width  = (int) (titleBounds.getWidth() + 2*WIDTH_GAP);
		
		if(metamodel.attributesVisible)
			for(AttributeView attr : attributes) {
				width = (int) attr.getWidth();
				
				if(dim.width<(width+WIDTH_GAP*2f))
					dim.width = (int) (2*WIDTH_GAP+width);
				
				dim.height += attr.getHeight()+HEIGHT_GAP;
			}
		
		if(metamodel.operationsVisible)
			for(OperationView op : operations) {
				width = (int) op.getWidth();
				
				if(dim.width<(width+WIDTH_GAP*2f))
					dim.width = (int) (2*WIDTH_GAP+width);
				
				dim.height += op.getHeight()+HEIGHT_GAP;
			}
		
		dim.width  = (int) (Math.max(dim.width, 30)*scale);
		dim.height = (int) (Math.max(dim.height, 20)*scale);
		
		return dim;
	}

	
	
	public Rectangle2D getBordersZoomed() {
		Dimension dim   = getPreferredSize();
		Rectangle2D rec = new Rectangle2D.Double((centre.x-dim.width/2.)*metamodel.zoom, (centre.y-dim.height/2)*metamodel.zoom, 
												(dim.width)*metamodel.zoom, (dim.height)*metamodel.zoom);
		
		return rec;
	}
	

	
	public Rectangle2D getBorders() {
		Dimension dim   = getPreferredSize();
		Rectangle2D rec = new Rectangle2D.Double(centre.x-dim.width/2., centre.y-dim.height/2, dim.width, dim.height);
		
		return rec;
	}
	

	public Point2D.Double getCentre() {
		return centre;
	}



	public void setCentre(Point2D centre) {
		this.centre.setLocation(centre.getX(), centre.getY());
	}



	public Color getLineColor() {
		return lineColor;
	}



	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}



	public Color getFillingColor() {
		return fillingColor;
	}



	public void setFillingColor(Color fillingColor) {
		this.fillingColor = fillingColor;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setX(int x) {
		centre.x = x;
	}
	
	
	public void setY(int y) {
		centre.y = y;
	}

	
	public void setCentre(int x, int y) {
		setX(x);
		setY(y);
	}
	
	
	public double getX() {
		return centre.x;
	}
	
	
	public double getY() {
		return centre.y;
	}
	
	
	public double getWidth() {
		return getBorders().getWidth();
	}
	
	
	public double getHeight() {
		return getBorders().getHeight();
	}
}
