/* $Id: TurtleSimpleAWTGUI.java,v 1.7 2008-05-29 12:09:43 vmahe Exp $
 * Project    : fr.irisa.triskell.kmLogo
 * File       : TurtleSimpleAWTGUI.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 */
package fr.irisa.triskell.kmLogo.gui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.lang.Math;

import javax.swing.JFrame;





@SuppressWarnings("serial")
public class TurtleSimpleAWTGUI extends JFrame  implements ITurtleGUI {

    private Image image;
    private int size;
    private TurtleCanvas turtleCanvas;
	
	public TurtleSimpleAWTGUI (String name, int size) {
		super("Turtle GUI : " + name);
		this.image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		this.size = size;
		setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE ) ;
        setSize (size,size) ;
        turtleCanvas = new TurtleCanvas();
        getContentPane().add(turtleCanvas);
        setVisible(true); 
        
	}
	

	// implementation on the interface required by the conroler
	
	public void clearDrawing() {
		image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		repaint();
	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		image.getGraphics().drawLine(size/2+x1, size/2+y1, size/2+x2, size/2+y2);
		turtleCanvas.repaint();
	}

	public void drawTurtle(int x, int y, double angle, boolean isPenUp) {
		angle = angle * Math.PI / 180 - Math.PI/2;
		int nPoints = 4;
		int xPoints[] = new int[nPoints];
		int yPoints[] = new int[nPoints];
		xPoints[0]= (int)(size/2+x + (20*Math.cos(angle)));
		yPoints[0]= (int)(size/2+y + (20*Math.sin(angle)));

		xPoints[1]= (int)(size/2+x + (10*Math.cos(angle + Math.PI/1.5)));
		yPoints[1]= (int)(size/2+y + (10*Math.sin(angle + Math.PI/1.5)));
		
		xPoints[2]= (int)(size/2+x);
		yPoints[2]= (int)(size/2+y);
		
		xPoints[3]= (int)(size/2+x + (10*Math.cos(angle - Math.PI/1.5)));
		yPoints[3]= (int)(size/2+y + (10*Math.sin(angle - Math.PI/1.5)));
				
		image.getGraphics().drawPolygon(xPoints, yPoints, nPoints);
		
		if(!isPenUp)
			image.getGraphics().fillPolygon(xPoints, yPoints, nPoints);
		else
			image.getGraphics().drawPolygon(xPoints, yPoints, nPoints);
		
		repaint();
	}
	
	//private class
	/**
	 * the canvas is responsible for drawing the image
	 */
	class TurtleCanvas extends Canvas {
	    TurtleCanvas(){
	    }

	    public void paint(Graphics g) {
	    	g.drawImage(image, 0, 0, size, size, null);
	    }
	    
	}

}
