package org.kermeta.ki.malai.examples.canvas.concPres;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.picking.Pickable;
import org.kermeta.ki.malai.picking.Picker;

import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;



public class CanvasUI extends JPanel implements Picker, Pickable {

	private static final long serialVersionUID = 1L;

	protected ArrayList<ShapeUI> shapesUI;
	
	protected EventManagerWrapper eventManager;
	
	
	
	
	public static RuntimeObject onShapeAdded(RuntimeObject canvasRO, RuntimeObject shapeRO, RuntimeObject positionRO) {
		CanvasUI canvasUI = (CanvasUI) canvasRO.getUserData();
		int position 	  = Integer.getValue(positionRO);
		String className  = NamedElementHelper.getQualifiedName(
							((fr.irisa.triskell.kermeta.language.structure.Class)shapeRO.getMetaclass().getKCoreObject()).getTypeDefinition());
		ShapeUI shape	  = ShapeUIFactory.getShapeUIInstance(className);
		
		canvasUI.addShape(position, shape);
		shapeRO.setUserData(shape);
		canvasUI.repaint();
		
		return canvasRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	

	public CanvasUI(EventManagerWrapper emw) {
		super();
		
		eventManager = emw;
		shapesUI  = new ArrayList<ShapeUI>();
		setPreferredSize(new Dimension(900, 500));
		setFocusable(true);
		
		eventManager.attachTo(this);
	}


	public EventManagerWrapper getEventManager() {
		return eventManager;
	}
	
	
	public ShapeUI getViewAt(Point2D point) {
		if(point==null)
			return null;

		ShapeUI v;
		
		for(int i=shapesUI.size()-1; i>=0; i--) {
			v = shapesUI.get(i);
			
			if(v.isIn(point))
				return v;
		}
		
		return null;
	}
	


	@Override
	public void paint(Graphics g) {
		requestFocus();
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());

		for(ShapeUI s : shapesUI)
			s.paint(g2);
	}



	public ArrayList<ShapeUI> getShapesUI() {
		return shapesUI;
	}

	
	public void removeShape(ShapeUI shape) {
		if(shape!=null)
			shapesUI.remove(shape);
	}
	
	
	public void removeShapeAt(int position) {
		if(position>=-1 && position <shapesUI.size())
			shapesUI.remove(position==-1 ? shapesUI.size()-1 : position);
	}
	
	
	public boolean addShape(ShapeUI shape) {
		if(shape==null || shapesUI.contains(shape))
			return false;
		
		shapesUI.add(shape);
		
		return true;
	}



	public void addShape(int position, ShapeUI shape) {
		if(shape!=null && position<shapesUI.size() && position>=0)
			shapesUI.add(position, shape);
		else
			if((position==-1 || position==shapesUI.size()) && shape!=null)
				shapesUI.add(shape);
	}


	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}


	public Pickable getPickableAt(Point2D point) {
		Pickable p = getViewAt(point);
		
		return p==null ? contains((int)point.getX(), (int)point.getY()) ? this : null : p;
	}



	public Picker getPickerAt(Point2D point) {
		return null;
	}



	public Point2D getRelativePoint(Point2D pt, Object o) {
		return getViewAt(pt)==null ? null : pt;
	}
}
