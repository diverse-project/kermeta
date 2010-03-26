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

import org.kermeta.ki.visual.Force;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;


public abstract class EntityView extends ComponentView {
	public static final double ELECTRIC_CONSTANT = 9000000.; 
	public static final double CHARGE 			 = 0.5;
	
	private static double lastx = 100;
	private static double lasty = 100;
	
	protected Point2D.Double centre;
	
	protected Color lineColor;
	
	protected Color fillingColor;
	
	protected String name;
	
	protected List<PropertyView> propertiesView;
	
	
	protected static final Graphics2D		 GRAPHICS;
	protected static final FontMetrics 		 FONT_METRICS;
	protected static final FontRenderContext FONT_RENDER_CONT;
	protected static final Font 			 FONT = new Font("Times New Roman", Font.PLAIN, 12);
	
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

	
	
	public static RuntimeObject isVisible(RuntimeObject entityRO) {
		Object obj = entityRO.getUserData();
		boolean ok;
		
		if(obj!=null && obj instanceof EntityView) {
			ok = ((EntityView)obj).visible;
		}
		else ok = false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject setVisible(RuntimeObject entityRO, RuntimeObject visibleRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		boolean visible = Boolean.getValue(visibleRO);
		
		view.visible = visible;
		view.update();
		
		return entityRO.getFactory().getMemory().voidINSTANCE;
	}

	
	public static RuntimeObject name2name(RuntimeObject entityRO, RuntimeObject newNameRO) {
		EntityView view = (EntityView) entityRO.getUserData();
		String newName  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(newNameRO);
		
		view.name = newName;
		view.update();
		
		return entityRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public EntityView(String name) {
		this.name = name;
		
		propertiesView = new ArrayList<PropertyView>();
		path 		   = new GeneralPath();
		centre 		   = new Point2D.Double(lastx, lasty);
		lineColor 	   = Color.BLACK;
		fillingColor   = Color.WHITE;
		update();
		
		if(lastx>400) {
			lastx = 100.;
			lasty += 180.;
		}
		
		lastx += 200;
	}
	
	
	
	@Override
	public void paint(Graphics2D g) {
		if(!visible)
			return ;
		
		final TextLayout tl  = new TextLayout(name, FONT, FONT_RENDER_CONT);
		final int textWidth  = (int) tl.getBounds().getWidth();
		final int textHeight  = (int) tl.getBounds().getHeight();
		final int textHeaderHeight = getTextHeaderHeight();
		
		g.setColor(fillingColor);
		g.fill(path);
		g.setColor(lineColor);
		g.draw(path);
		g.setColor(Color.BLACK);
		g.drawString(name, (int)centre.x-textWidth/2, (int)centre.y-getPreferredSize().height/2+textHeight+(textHeaderHeight-textHeight)/2);
		
	}
	
	
	protected int getTextHeaderHeight() {
		return FONT_METRICS.getHeight() + 10;
	}
	
	
	@Override
	public void update() {
		final Dimension dim  = getPreferredSize();
		final int textHeight = getTextHeaderHeight();
		
		path.reset();
		path.moveTo((float)centre.x-dim.width/2f, (float)centre.y-dim.height/2f);
		path.lineTo((float)centre.x+dim.width/2f, (float)centre.y-dim.height/2f);
		path.lineTo((float)centre.x+dim.width/2f, (float)centre.y+dim.height/2f);
		path.lineTo((float)centre.x-dim.width/2f, (float)centre.y+dim.height/2f);
		path.closePath();
		path.moveTo((float)centre.x-dim.width/2f, (float)centre.y-dim.height/2f+textHeight);
		path.lineTo((float)centre.x+dim.width/2f, (float)centre.y-dim.height/2f+textHeight);
	}
	
	
	protected Dimension getPreferredSize() {
		Dimension dim = new Dimension();
		
		dim.height = 70;
		dim.width  = 100;
		
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



	public void setCentre(Point2D.Double centre) {
		this.centre = centre;
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
	
	
	
	public Force forceArc(final LinkView arc) { 	
		double norm 		= LinkView.STRAIGHTNESS*(arc.getLength() - LinkView.LENGTH_INIT);
		EntityView entity 	= arc.entitySrc;
		
		if(entity == this) 
			entity = arc.entityTar;

		final double fX = norm * (entity.getX() - getX()) / Math.max(arc.getLength(), 1);
		final double fY = norm * (entity.getX() - getY()) / Math.max(arc.getLength(), 1);

		return new Force(fX/10., fY/10.);
	}
	
	
	
	public Force influenceEntity(final EntityView entity) { 	
		double fX, fY, norm;
		final double x = getX();
		final double y = getY();
		final double x2 = entity.getX();
		final double y2 = entity.getY();
		final double d = Math.sqrt( (x - x2) * (x - x2) + (y - y2) * (y - y2)) ;

		norm = ELECTRIC_CONSTANT*CHARGE*CHARGE/(d*d);
		fY   = -norm * (y2 - y) / d;
		fX   = -norm * (x2 - x) / d;

		return new Force(fX, fY);
	}
}
