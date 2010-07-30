package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class SymbolsLibrary extends JPanel {
	private JLabel engineLabel = new JLabel("Engines");
	private JLabel ambLabel = new JLabel("Ambulances");
	private JLabel placeLabel = new JLabel("Places");
	/*private Rectangle engine1 = new Rectangle(90, 10, 20, 20);
	private Rectangle engine2 = new Rectangle(120, 10, 20, 20);
	private Rectangle engine3 = new Rectangle(150, 10, 20, 20);
	private Rectangle amb1 = new Rectangle(90, 40, 20, 20);
	private Rectangle amb2 = new Rectangle(120, 40, 20, 20);
	private Rectangle amb3 = new Rectangle(150, 40, 20, 20);
	private Rectangle place = new Rectangle(90, 70, 20, 20);
	private Rectangle dragged = new Rectangle(20, 20);*/
	private ItemType engine1;
	private ItemType engine2;
	private ItemType engine3;
	private ItemType amb1;
	private ItemType amb2;
	private ItemType amb3;
	private ItemType place;
	/*private Color color;
	private boolean isDragged = false;
	private int nbLines;*/

	public SymbolsLibrary() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(100,100));
		setSize(new Dimension(100,100));
		setBounds(0,0,100,100);
		engineLabel.setBounds(10, 10, 80, 20);
		ambLabel.setBounds(10, 40, 80, 20);
		placeLabel.setBounds(10, 70, 80, 20);
		add(engineLabel);
		add(ambLabel);
		add(placeLabel);
		init();
	}
	
	private void init()
	{
		Rectangle r=new Rectangle(5,5,20,20);
		Line2D.Float[] l1=new Line2D.Float[]{new Line2D.Float(15,5,15,0)};
		Line2D.Float[] l2=new Line2D.Float[]{new Line2D.Float(13,5,13,0),new Line2D.Float(17,5,17,0)};
		Line2D.Float[] l3=new Line2D.Float[]{new Line2D.Float(10,5,10,0),new Line2D.Float(15,5,15,0),
				new Line2D.Float(20,5,20,0)};
		Line2D.Float[] l4=new Line2D.Float[]{new Line2D.Float(5,0,25,0)};
		engine1=new ItemType(r,Color.red,l1);
		engine2=new ItemType(r,Color.red,l2);
		engine3=new ItemType(r,Color.red,l3);
		amb1=new ItemType(r,Color.blue,l1);
		amb2=new ItemType(r,Color.blue,l2);
		amb3=new ItemType(r,Color.blue,l3);
		place=new ItemType(r,Color.green,l4);
		engine1.setBounds(90,5,30,30);
		engine2.setBounds(120,5,30,30);
		engine3.setBounds(150,5,30,30);
		amb1.setBounds(90,35,30,30);
		amb2.setBounds(120,35,30,30);
		amb3.setBounds(150,35,30,30);
		place.setBounds(90,65,30,30);
		add(engine1);
		add(engine2);
		add(engine3);
		add(amb1);
		add(amb2);
		add(amb3);
		add(place);
		TransferHandler handler=new DragHandler();
		engine1.setTransferHandler(handler);
		engine2.setTransferHandler(handler);
		engine3.setTransferHandler(handler);
		amb1.setTransferHandler(handler);
		amb2.setTransferHandler(handler);
		amb3.setTransferHandler(handler);
		place.setTransferHandler(handler);
		MouseListener listener=new MouseAdapter() {
			public void mousePressed(MouseEvent e)
			{
				JComponent jc = (JComponent)e.getSource();
		        TransferHandler th = jc.getTransferHandler();
		        th.exportAsDrag(jc, e, TransferHandler.COPY);
			}
		};
		engine1.addMouseListener(listener);
		engine2.addMouseListener(listener);
		engine3.addMouseListener(listener);
		amb1.addMouseListener(listener);
		amb2.addMouseListener(listener);
		amb3.addMouseListener(listener);
		place.addMouseListener(listener);
	}
}
	
	/*public boolean isDragged()
	{
		return isDragged;
	}
	
	public int getNbLines()
	{
		return nbLines;
	}
	
	public Color getColor()
	{
		return color;
	}*/

	/*public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.red);
		g.drawRect(90, 10, 20, 20);
		g.drawLine(100, 10, 100, 5);
		g.drawRect(120, 10, 20, 20);
		g.drawLine(128, 10, 128, 5);
		g.drawLine(132, 10, 132, 5);
		g.drawRect(150, 10, 20, 20);
		g.drawLine(155, 10, 155, 5);
		g.drawLine(160, 10, 160, 5);
		g.drawLine(165, 10, 165, 5);

		g.setColor(Color.blue);
		g.drawRect(90, 40, 20, 20);
		g.drawLine(100, 40, 100, 35);
		g.drawRect(120, 40, 20, 20);
		g.drawLine(128, 40, 128, 35);
		g.drawLine(132, 40, 132, 35);
		g.drawRect(150, 40, 20, 20);
		g.drawLine(155, 40, 155, 35);
		g.drawLine(160, 40, 160, 35);
		g.drawLine(165, 40, 165, 35);

		g.setColor(Color.green);
		g.drawRect(90, 70, 20, 20);
		g.drawLine(90, 65, 110, 65);

		if (isDragged) {
			g1.setColor(color);
			g1.draw(dragged);
			switch (nbLines) {
			case 0:
				int x = (int) (dragged.getX());
				int y = (int) (dragged.getY() - 5);
				g.drawLine(x, y, x + 20, y);
				break;
			case 1:
				x = (int) (dragged.getX() + dragged.getWidth() / 2);
				y = (int) (dragged.getY());
				g.drawLine(x, y, x, y - 5);
				break;
			case 2:
				x = (int) (dragged.getX() + 8);
				y = (int) (dragged.getY());
				g.drawLine(x, y, x, y - 5);
				g.drawLine(x + 4, y, x + 4, y - 5);
				break;
			case 3:
				x = (int) (dragged.getX() + 5);
				y = (int) (dragged.getY());
				g.drawLine(x, y, x, y - 5);
				g.drawLine(x + 5, y, x + 5, y - 5);
				g.drawLine(x + 10, y, x + 10, y - 5);
				break;
			}
		}
	}*/

	/*class DragListener extends MouseInputAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			if (engine1.contains(x, y)) {
				dragged.setLocation(x, y);
				color = Color.red;
				nbLines = 1;
				isDragged = true;
			} else if (engine2.contains(x, y)) {
				dragged.setLocation(x, y);
				color = Color.red;
				nbLines = 2;
				isDragged = true;
			} else if (engine3.contains(x, y)) {
				dragged.setLocation(x, y);
				color = Color.red;
				nbLines = 3;
				isDragged = true;
			} else if (amb1.contains(x, y)) {
				dragged.setLocation(x, y);
				color = Color.blue;
				nbLines = 1;
				isDragged = true;
			} else if (amb2.contains(x, y)) {
				dragged.setLocation(x, y);
				color = Color.blue;
				nbLines = 2;
				isDragged = true;
			} else if (amb3.contains(x, y)) {
				dragged.setLocation(x, y);
				color = Color.blue;
				nbLines = 3;
				isDragged = true;
			} else if (place.contains(x, y)) {
				dragged.setLocation(x, y);
				color = Color.green;
				nbLines = 0;
				isDragged = true;
			} else {
				isDragged = false;
			}
		}

		public void mouseReleased(MouseEvent e) {
			isDragged = false;
			JPanel panel = (JPanel) e.getSource();
			panel.repaint();
		}

		public void mouseDragged(MouseEvent e) {
			System.out.println("symbol");
			if (isDragged) {
				int x = e.getX();
				int y = e.getY();
				dragged.setLocation(x, y);
				JPanel panel = (JPanel) e.getSource();
				panel.repaint();
			}
		}
	}*/

