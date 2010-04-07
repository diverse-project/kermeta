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
	private static double lastx = 100;
	private static double lasty = 100;
	
	protected Point2D.Double centre;
	
	protected Color lineColor;
	
	protected Color fillingColor;
	
	protected String name;
	
	protected List<PropertyView> propertiesView;
	
	protected double scale;

	protected double fontSize;
	
	protected Font font;
	
	protected int fontStyle;
	
	
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
	

	
	public static RuntimeObject contains(RuntimeObject entityRO, RuntimeObject xRO, RuntimeObject yRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		double x = Real.getValue(xRO);
		double y = Real.getValue(yRO);
		boolean contains = view.isVisible() && view.getBorders().contains(x, y);
		
		return contains ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE; 
	}
	
	

	public static RuntimeObject unprune(RuntimeObject entityRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		
		view.visibility = Visibility.STANDARD;
		view.setScale(1.);
		view.lineColor 	   = view.getLineColor(255);
		view.fillingColor  = view.getFillingColor(255);
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
	
	
	
	public EntityView(String name) {
		super();
		this.name = name;
		
		fontStyle	   = Font.PLAIN;
		propertiesView = new ArrayList<PropertyView>();
		path 		   = new GeneralPath();
		centre 		   = new Point2D.Double(lastx, lasty);
		lineColor 	   = getLineColor(255);
		fillingColor   = getFillingColor(255);
		setScale(1.);
		update();
		
		if(lastx>400) {
			lastx = 100.;
			lasty += 180.;
		}
		
		lastx += 200;
	}
	
	
	
	public abstract Color getFillingColor(int opacity);
	
	
	public abstract Color getLineColor(int opacity);
	
	
	
	@Override
	public void paint(Graphics2D g) {
		if(!isVisible())
			return ;
		
		final TextLayout tl  		= new TextLayout(name, font, FONT_RENDER_CONT);
		final int textWidth  		= (int) tl.getBounds().getWidth();
		final int textHeight  		= (int) tl.getBounds().getHeight();
		final int textHeaderHeight 	= getTextHeaderHeight();

		g.setColor(fillingColor);
		g.fill(path);
		g.setColor(lineColor);
		g.draw(path);
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString(name, (int)centre.x-textWidth/2, (int)centre.y-getPreferredSize().height/2+textHeight+(textHeaderHeight-textHeight)/2);
	}
	
	
	
	public void setScale(final double scale) {
		if(scale>0.) {
			this.scale = scale;
			fontSize   = 14.*scale;
			update();
		}
	}
	
	
	protected int getTextHeaderHeight() {
		return FONT_METRICS.getHeight() + 10;
	}
	
	
	@Override
	public void update() {
		final Dimension dim    = getPreferredSize();
		final int textHeight   = getTextHeaderHeight();
		final float halfWidth  = (dim.width/2f);
		final float halfHeight = (dim.height/2f);
		final float cx 		   = (float) centre.x;
		final float cy 		   = (float) centre.y;
		
		font = new Font("Times New Roman", fontStyle, (int)fontSize);
		path.reset();
		path.moveTo(cx-halfWidth, cy-halfHeight);
		path.lineTo(cx+halfWidth, cy-halfHeight);
		path.lineTo(cx+halfWidth, cy+halfHeight);
		path.lineTo(cx-halfWidth, cy+halfHeight);
		path.closePath();
		path.moveTo(cx-halfWidth, cy-halfHeight+textHeight);
		path.lineTo(cx+halfWidth, cy-halfHeight+textHeight);
	}
	
	
	protected Dimension getPreferredSize() {
		Dimension dim = new Dimension();
		
		dim.height = (int) (70 * scale);
		dim.width  = (int) (100 * scale);
		
		return dim;
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
