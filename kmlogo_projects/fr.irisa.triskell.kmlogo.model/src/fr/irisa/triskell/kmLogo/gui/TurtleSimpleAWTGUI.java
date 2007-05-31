/* $Id: TurtleSimpleAWTGUI.java,v 1.1 2007-05-31 16:10:49 dvojtise Exp $
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

import javax.swing.JFrame;



@SuppressWarnings("serial")
class TurtleCanvas extends Canvas {
    private Image image;
    private int size;
    TurtleCanvas(Image i, int size)      {
        this.image = i;
        this.size = size;
    }

    public void paint(Graphics g) {
    	g.drawImage(image, 0, 0, size, size, null);
    }
}

@SuppressWarnings("serial")
public class TurtleSimpleAWTGUI extends JFrame  implements ITurtleGUI {
	private BufferedImage image;
    private int size;
	
	public TurtleSimpleAWTGUI (String name, int size) {
		super("Turtle " + name);
		image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		this.size = size;
		setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE ) ;
        setSize (size,size) ;
        getContentPane().add(new TurtleCanvas(image, size));
        setVisible(true); 

		System.out.println("java side");
        
	}
	
	

	// implementation on the interface required by the conroler
	
	public void clearDrawing() {
		
		image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		image.getGraphics().drawLine(x1, y1, x2, y2);
		repaint();
		//this.rep
		System.out.println("java side");
	}

	public void drawTurtle(int x, int y, double angle, boolean isPenUp) {
		// TODO Auto-generated method stub
		
	}
}
