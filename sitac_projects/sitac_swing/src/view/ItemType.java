package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

import javax.swing.JLabel;

public class ItemType extends JLabel{
	private Rectangle rect;
	private Color color;
	private Line2D.Float[] lines;
	
	public ItemType(Rectangle r, Color c, Line2D.Float[] l)
	{
		super();
		rect=r;
		color=c;
		lines=l;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2=(Graphics2D)g;
		g2.setColor(color);
		g2.draw(rect);
		for (int i=0;i<lines.length;i++)
			g2.draw(lines[i]);
	}
	
	public Rectangle getRectangle()
	{
		return rect;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public Line2D.Float[] getLines()
	{
		return lines;
	}
}
