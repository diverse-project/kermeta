/* $Id: Spline.java,v 1.1 2005-12-05 19:14:30 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : Spline.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 28 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 * Important note:
 * 		Original code is from Kirby A. Baker
 * 		http://www.math.ucla.edu/~baker/java/hoefer/ 
 * 		I've found no license in the provided source so I used it here ...   
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;



//This class implements interpolation using relaxed cubic splines
//The user can click on six points and move them around and the
//spline will be redrawn in real time
import java.awt.*;
public class Spline  {
	Point[] points;	//points to be interpolated
	Point[] control;	//control points
	int numpoints;
	double t;	//time variable
	static final double k = .05; //partition length
	int moveflag;	//point movement
	Button polygon;
	boolean poly = false;
	//this method initializes the class (good presentation is with 6 points)
	public void init(Point newPoints[]) {
		//start off with 6 points
		points = newPoints;
		control = new Point[newPoints.length];
		numpoints = newPoints.length;
		moveflag = numpoints;
		
		System.out.println("num point="+numpoints);
		
	}
	//this method is called by the repaint() method
	public void update(Graphics g) {
		paint(g);
	}
	public void paint(Graphics g) {
		//points to be plotted
		int x1,y1,x2,y2;
		//check if user wants control polygon and points drawn
		
		if(poly) {
//			draw control polygon and control points
			for(int i=0;i<numpoints-1;i++) {
				g.fillOval(points[i].x-2,points[i].y-2,4,4);
				g.fillOval((int)(.6667*control[i].x+.3333*control[i+1].x)-2,
						(int)(.6667*control[i].y+.3333*control[i+1].y)-2,4,4);
				g.fillOval((int)(.3333*control[i].x+.6667*control[i+1].x)-2,
						(int)(.3333*control[i].y+.6667*control[i+1].y)-2,4,4);
				g.fillOval(points[i+1].x-2,points[i+1].y-2,4,4);
				g.drawLine(points[i].x,points[i].y,
						(int)(.6667*control[i].x+.3333*control[i+1].x),
						(int)(.6667*control[i].y+.3333*control[i+1].y));
				g.drawLine((int)(.6667*control[i].x+.3333*control[i+1].x),						
						(int)(.6667*control[i].y+.3333*control[i+1].y),					
						(int)(.3333*control[i].x+.6667*control[i+1].x),
						(int)(.3333*control[i].y+.6667*control[i+1].y));
				g.drawLine((int)(.3333*control[i].x+.6667*control[i+1].x),						
						(int)(.3333*control[i].y+.6667*control[i+1].y),
						points[i+1].x,
						points[i+1].y);
			}
		}
//		Change interpolating points into control points
		control[0] = new Point(points[0].x,points[0].y);
		control[numpoints-1] = new Point(points[numpoints-1].x,
				points[numpoints-1].y);
		x1=(int)(1.6077*(double)points[1].x-.26794*(double)points[0].x-
				.43062*(double)points[2].x+.11483*(double)points[3].x-
				.028708*(double)points[4].x+.004785*(double)points[5].x);
		y1=(int)(1.6077*(double)points[1].y-.26794*(double)points[0].y-
				.43062*(double)points[2].y+.11483*(double)points[3].y-				
				.028708*(double)points[4].y+.004785*(double)points[5].y);
		
		control[1] = new Point(x1,y1);
		x1=(int)(-.43062*(double)points[1].x+.07177*(double)points[0].x+
				1.7225*(double)points[2].x-.45933*(double)points[3].x+
				.11483*(double)points[4].x-.019139*(double)points[3].x);
		
		y1=(int)(-.43062*(double)points[1].y+.07177*(double)points[0].y+
				1.7225*(double)points[2].y-.45933*(double)points[3].y+
				.11483*(double)points[4].y-.019139*(double)points[3].y);
		
		control[2] = new Point(x1,y1);
		x1=(int)(.11483*(double)points[1].x-.019139*(double)points[0].x-
				.45933*(double)points[2].x+1.7225*(double)points[3].x-
				.43062*(double)points[4].x+.07177*(double)points[5].x);
		
		y1=(int)(.11483*(double)points[1].y-.019139*(double)points[0].y-
				.45933*(double)points[2].y+1.7225*(double)points[3].y-
				.43062*(double)points[4].y+.07177*(double)points[5].y);
		
		control[3] = new Point(x1,y1);
		x1=(int)(-.028708*(double)points[1].x+.004785*(double)points[0].x+
				.114835*(double)points[2].x-.43062*(double)points[3].x+
				1.6077*(double)points[4].x-.26794*(double)points[5].x);
		
		y1=(int)(-.028708*(double)points[1].y+.004785*(double)points[0].y+
				.114835*(double)points[2].y-.43062*(double)points[3].y+
				1.6077*(double)points[4].y-.26794*points[5].y);
		
		control[4] = new Point(x1,y1);
//		Plot points
		for(int i=0;i<numpoints;i++)
			g.fillOval(points[i].x-2,points[i].y-2,4,4);
		
//		draw n bezier curves using Bernstein Polynomials
		x1=points[0].x;
		y1=points[0].y;
		for(int i=1;i<numpoints;i++) {
			for(t=i-1;t<=i;t+=k) {
				x2=(int)((double)points[i-1].x+(t-(i-1))*(-3*(double)points[i-1].x+
						3*(.6667*(double)control[i-1].x+.3333*(double)control[i].x)+
						(t-(i-1))*(3*(double)points[i-1].x-6*(.6667*(double)control[i-1 ].x+
								.3333*(double)control[i].x)+3*(.3333*(double)control[i-1].x+
										.6667*(double)control[i].x)+(-(double)points[i-1].x+
												3*(.6667*(double)control[i-1].x+.3333*(double)control[i].x)-
												3*(.3333*(double)control[i-1].x+.6667*(double)control[i].x)+
												(double)points[i].x)*(t-(i-1)))));
				y2=(int)((double)points[i-1].y+(t-(i-1))*(-3*(double)points[i-1].y+
						3*(.6667*(double)control[i-1].y+.3333*(double)control[i].y)+
						(t-(i-1))*(3*(double)points[i-1].y-6*(.6667*(double)control[i-1].y+
								.3333*(double)control[i].y)+3*(.3333*(double)control[i-1].y+
										.6667*(double)control[i].y)+(-(double)points[i-1].y+
												3*(.6667*(double)control[i-1].y+.3333*(double)control[i].y)-												
												3*(.3333*(double)control[i-1].y+.6667*(double)control[i].y)+
												(double)points[i].y)*(t-(i-1)))));
				g.drawLine(x1,y1,x2,y2);
				x1=x2;
				y1=y2;
			}
		}
	}
	
	
	
}
