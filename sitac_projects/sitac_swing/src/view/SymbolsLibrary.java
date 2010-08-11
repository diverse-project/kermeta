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

import control.Ctrl;

public class SymbolsLibrary extends JPanel {
	private JLabel engineLabel = new JLabel("Engines");
	private JLabel ambLabel = new JLabel("Ambulances");
	private JLabel placeLabel = new JLabel("Places");
	private ItemType engine1;
	private ItemType engine2;
	private ItemType engine3;
	private ItemType amb1;
	private ItemType amb2;
	private ItemType amb3;
	private ItemType place;
	//private Ctrl controller;

	public SymbolsLibrary(Ctrl c) {
		super();
		//controller=c;
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