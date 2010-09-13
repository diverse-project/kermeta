package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.event.MouseInputAdapter;

import control.MoyenControl;

public class SymbolsLibrary extends JPanel {
	private JPanel enginePanel = new JPanel();
	private JPanel ambulancePanel = new JPanel();
	private TransferHandler handler;
	private MouseInputAdapter listener;
	private MoyenControl control;
	private List<ItemType> items = new ArrayList<ItemType>();

	public SymbolsLibrary(MoyenControl c) {
		super();
		control = c;
		setLayout(new GridLayout(1, 1));
		setPreferredSize(new Dimension(100,100));
		setSize(new Dimension(100,100));
		setBounds(0,0,100,100);
		add(enginePanel);
		add(ambulancePanel);
		init();
		control.addView(this);
	}
	
	private void init()
	{
		handler = new DragHandler();
		listener = new MouseInputAdapter() {
			public void mouseDragged(MouseEvent e)
			{
				JComponent jc = (JComponent)e.getSource();
		        TransferHandler th = jc.getTransferHandler();
		        th.exportAsDrag(jc, e, TransferHandler.COPY);
			}
		};
		items = control.getItems();
		for (int i=0; i<items.size(); i++)
		{
			ItemType item = items.get(i);
			if (item.getColor() == Color.red)
				enginePanel.add(item);
			else
				ambulancePanel.add(item);
			item.setTransferHandler(handler);
			item.addMouseMotionListener(listener);
		}
	}
	
	public void addItem(ItemType item)
	{
		items.add(item);
		if (item.getColor() == Color.red)
		{
			enginePanel.add(item);
			enginePanel.repaint();
			enginePanel.revalidate();
		}
		else
		{
			ambulancePanel.add(item);
			ambulancePanel.repaint();
			ambulancePanel.revalidate();
		}
		item.setTransferHandler(handler);
		item.addMouseMotionListener(listener);
	}
	
	public void update(int[] ind, String desc)
	{
		JPanel panel = enginePanel;
		int nbLines = 0;
		Color c = Color.red;
		List<ItemType> it = new ArrayList<ItemType>();
		for (int i=0; i<ind.length; i++)
		{
			if (i == 0)
			{
				if (items.get(ind[i]).getColor() == Color.blue)
				{
					panel = ambulancePanel;
					c = Color.blue;
				}
				nbLines = items.get(ind[i]).getLines().length;
			}
			panel.remove(items.get(ind[i]));
			it.add(items.get(ind[i]));
		}
		items.removeAll(it);
		ItemType item = new ItemType(c,desc,nbLines);
		items.add(item);
		item.setTransferHandler(handler);
		item.addMouseMotionListener(listener);
		panel.add(item);
		panel.repaint();
		panel.revalidate();
	}
}