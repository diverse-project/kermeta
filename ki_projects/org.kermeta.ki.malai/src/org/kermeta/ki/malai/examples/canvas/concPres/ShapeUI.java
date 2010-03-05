package org.kermeta.ki.malai.examples.canvas.concPres;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.ki.malai.picking.Pickable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;

public abstract class ShapeUI implements Pickable {

	protected double thickness;
	
	protected Color colourBord;
	
	protected Color colourFill;
	
	protected double rotationAngle;
	
	protected List<Point2D.Double> points;
	
	protected boolean filled;
	
	
	
	public static RuntimeObject onPointAdded(RuntimeObject shapeRO, RuntimeObject xRO, RuntimeObject yRO, RuntimeObject positionRO) {
		int position = Integer.getValue(positionRO);
		double x	 = Real.getValue(xRO);
		double y	 = Real.getValue(yRO);
		ShapeUI sh	 = (ShapeUI) shapeRO.getUserData();
		sh.addPoint(x, y, position);
		
		return shapeRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject contains(RuntimeObject shapeRO, RuntimeObject xRO, RuntimeObject yRO) {
		double x	 = Real.getValue(xRO);
		double y	 = Real.getValue(yRO);
		ShapeUI sh	 = (ShapeUI) shapeRO.getUserData();
		boolean contains = sh.isIn(x, y);
		
		return contains ? shapeRO.getFactory().getMemory().trueINSTANCE : shapeRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	
	public ShapeUI() {
		super();
		
		points			= new ArrayList<Point2D.Double>();
		thickness 		= 6;
		colourBord 		= new Color(0, 0, 0);
		colourFill 		= new Color(255,255,255);
		rotationAngle 	= 0.;
		filled 			= true;
	}
	
	
	public boolean contains(Point point) {
		return isIn(point.x, point.y);
	}
	
	
	
	public void paint(Graphics2D g) {
		GeneralPath path = new GeneralPath();
		path.moveTo((float)points.get(0).getX(), (float)points.get(0).getY());
		
		for(int i=1, j=points.size(); i<j; i++)
			path.lineTo((float)points.get(i).getX(), (float)points.get(i).getY());
		
		if(points.size()>1)
			path.lineTo((float)points.get(0).getX(), (float)points.get(0).getY());
		
		if(filled) {
    		g.setColor(colourFill);
    		g.fill(path);
		}
		
		g.setColor(colourBord);
		g.setStroke(new BasicStroke((float) thickness));
		g.draw(path);
	}
	
	
	public boolean isIn(double x, double y) {
		if(points.size()==0) return false;
		
		GeneralPath path = new GeneralPath();
		path.moveTo((float)points.get(0).getX(), (float)points.get(0).getY());
		
		for(int i=1, j=points.size(); i<j; i++)
			path.lineTo((float)points.get(i).getX(), (float)points.get(i).getY());
		
		return path.contains(x, y);
	}
	
	
	public void translate(double tx, double ty) {
		for(Point2D pt : points)
			pt.setLocation(pt.getX()+tx, pt.getY()+ty);
	}
	
	
	public double getWidth() {
		double width = getMaxX() - getMinX();
		
		return Double.isNaN(width) ? 0. : width;
	}
	
	
	public double getHeight() {
		double height = getMaxY() - getMinY();
		
		return Double.isNaN(height) ? 0. : height;
	}
	
	
	public double getMinX() {
		double minX = Double.MAX_VALUE;
		
		for(Point2D pt : points)
			if(pt.getX()<minX)
				minX = pt.getX();
		
		return minX;
	}
	
	
	public double getMinY() {
		double minY = Double.MAX_VALUE;
		
		for(Point2D pt : points)
			if(pt.getY()<minY)
				minY = pt.getY();
		
		return minY;
	}
	
	
	public double getMaxX() {
		double maxX = Double.MIN_VALUE;
		
		for(Point2D pt : points)
			if(pt.getX()>maxX)
				maxX = pt.getX();
		
		return maxX;
	}
	
	
	public double getMaxY() {
		double maxY = Double.MIN_VALUE;
		
		for(Point2D pt : points)
			if(pt.getY()>maxY)
				maxY = pt.getY();
		
		return maxY;
	}
	
	
	public void setRight(final double x) {
		Point2D.Double tl   = getTopLeftPoint();
		double tlx = tl.getX();
		
		if(x==tlx)
			return;
		
		Point2D.Double br  		= getBottomRightPoint();
		double brx 		= br.getX();
		Point2D.Double pt;
		Point2D.Double pt2 		= new Point2D.Double();
		double percent 	= (x-tlx)/(brx-tlx);
		double ptx;
		
		for(int i=0, size=points.size(); i<size; i++) {
			pt  = points.get(i);
			ptx = pt.getX();
			
			if(ptx!=tlx) {
				if(ptx==brx)
					pt2.x = x;
				else
					pt2.x = tlx+(ptx-tlx)*percent;
				
				pt2.y = pt.getY();
				points.get(i).setLocation(pt2);
			}
		}
	}
	
	
	public Point2D.Double getTopLeftPoint() {
		return new Point2D.Double(getMinX(), getMinY());
	}
	
	
	public Point2D.Double getBottomRightPoint() {
		return new Point2D.Double(getMaxX(), getMaxY());
	}
	
	
	public void setLeft(final double x) {//TODO to remove
		Point2D.Double br   = getBottomRightPoint();
		double brx = br.getX();
		
		if(x==brx)
			return ;
		
		Point2D.Double tl 		= getTopLeftPoint();
		Point2D.Double pt;
		Point2D.Double pt2 		= new Point2D.Double();
		double percent 	= (brx-x)/(brx-tl.getX());
		double ptx;
		
		for(int i=0, size=points.size(); i<size; i++) {
			pt  = points.get(i);
			ptx = pt.getX();
			
			if(ptx!=brx) {
				if(ptx==tl.getX())
					pt2.x=x;
				else
					pt2.x=br.getX()+(ptx-brx)*percent;
				
				pt2.y=pt.getY();
				points.get(i).setLocation(pt2);
			}
		}
	}
	
	
	public void setBottom(final double y) {
		Point2D.Double tl   = getTopLeftPoint();
		double tly = tl.getY();
		
		if(y==tly)
			return;
		
		Point2D.Double br 		= getBottomRightPoint();
		Point2D.Double pt;
		Point2D.Double pt2 		= new Point2D.Double();
		double percent 	= (y-tly)/(br.getY()-tly);
		double pty;
		
		for(int i=0, size=points.size(); i<size; i++) {// We rescale each point
			pt  = points.get(i);
			pty = pt.getY();
			
			if(pty!=tly) {
				if(pty==br.getY())
					pt2.y=y;
				else
					pt2.y=tly+(pty-tly)*percent;
				
				pt2.x=pt.getX();
				points.get(i).setLocation(pt2);
			}
		}
	}

	
	
	public void setTop(final double y) {
		Point2D.Double br   = getBottomRightPoint();
		double bry = br.getY();
		
		if(y==bry)
			return;
		
		Point2D.Double tl  	= getTopLeftPoint();
		double tly 			= tl.getY(); 
		Point2D.Double pt;
		Point2D.Double pt2 	= new Point2D.Double();
		double percent 		= (bry-y)/(bry-tly);
		double pty;
		
		for(int i=0, size=points.size(); i<size; i++) {
			pt  = points.get(i);
			pty = pt.getY();
			
			if(pty!=bry) {
				if(pty==tly)
					pt2.y = y;
				else
					pt2.y = bry+(pty-bry)*percent;
				
				pt2.x = pt.getX();
				points.get(i).setLocation(pt2);
			}
		}
	}
	
	
	public void addPoint(Point2D.Double pt) {
		if(pt==null) return ;
		
		points.add(pt);
	}
	
	
	public void addPoint(double x, double y, int position) {
		if((position==-1 || position>=points.size()) || (position>=0 && position<points.size())) {
			Point2D.Double pt = new Point2D.Double(x, y);
			
			if(position==-1 || position>=points.size())
				points.add(pt);
			else
				points.add(position, pt);
		}
	}
	
	
	public List<Point2D.Double> getPoints() {
		return points;
	}


	public void setThickness(double thickness) {
		this.thickness = thickness;
	}


	public void setColourBord(Color colourBord) {
		this.colourBord = colourBord;
	}


	public void setColourFill(Color colourFill) {
		this.colourFill = colourFill;
	}


	public void setRotationAngle(double rotationAngle) {
		this.rotationAngle = rotationAngle;
	}


	public double getThickness() {
		return thickness;
	}


	public Color getColourBord() {
		return colourBord;
	}


	public Color getColourFill() {
		return colourFill;
	}


	public double getRotationAngle() {
		return rotationAngle;
	}


	public boolean intersects(RectangleUI rect) {
		if(rect==null || points.size()==0) return false;
		
		Rectangle2D rect2D = new Rectangle2D.Double(rect.getMinX(), rect.getMinY(), rect.getWidth(), rect.getHeight());
		GeneralPath path = new GeneralPath();
		path.moveTo((float)points.get(0).getX(), (float)points.get(0).getY());
		
		for(int i=1, j=points.size(); i<j; i++)
			path.lineTo((float)points.get(i).getX(), (float)points.get(i).getY());
		
		return path.intersects(rect2D) || rect2D.contains(path.getBounds2D());
	}
	
	
	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}
}
