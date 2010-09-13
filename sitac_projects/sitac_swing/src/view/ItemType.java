package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

import javax.swing.JLabel;

public class ItemType extends JLabel {
	private Rectangle rect;
	private Color color;
	private Line2D.Float[] lines;
	private String name;

	private static final Rectangle r = new Rectangle(5, 5, 40, 20);
	private static final Line2D.Float[][] l = new Line2D.Float[][] {
			new Line2D.Float[] { new Line2D.Float(25, 5, 25, 0) },
			new Line2D.Float[] { new Line2D.Float(23, 5, 23, 0),
					new Line2D.Float(27, 5, 27, 0) },
			new Line2D.Float[] { new Line2D.Float(20, 5, 20, 0),
					new Line2D.Float(25, 5, 25, 0),
					new Line2D.Float(30, 5, 30, 0) } };

	public ItemType(Color c, String name, int nbLine) {
		super();
		this.setPreferredSize(new Dimension(50,30));
		rect = r;
		color = c;
		lines = l[nbLine];
		this.name = name;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		g2.draw(rect);
		for (int i = 0; i < lines.length; i++)
			g2.draw(lines[i]);
		g2.drawString(name, 10, 15);
	}

	public Rectangle getRectangle() {
		return rect;
	}

	public Color getColor() {
		return color;
	}

	public Line2D.Float[] getLines() {
		return lines;
	}

	public String getName() {
		return name;
	}
}
