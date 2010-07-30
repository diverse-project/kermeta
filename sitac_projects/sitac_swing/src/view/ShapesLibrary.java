package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ShapesLibrary extends JPanel{
	private JToggleButton lineBtn=new JToggleButton("Line");
	private JToggleButton zoneBtn=new JToggleButton("Zone");
	private JToggleButton brushBtn=new JToggleButton("Brush");
	private JToggleButton redBtn=new JToggleButton();
	private JToggleButton greenBtn=new JToggleButton();
	private JToggleButton blueBtn=new JToggleButton();
	
	public ShapesLibrary()
	{
		super();
		setLayout(null);
		ActionListener listener=new ShapeButtonListener();
		lineBtn.setBounds(50,10,100,20);
		lineBtn.addActionListener(listener);
		zoneBtn.setBounds(50,40,100,20);
		zoneBtn.addActionListener(listener);
		brushBtn.setBounds(50,70,100,20);
		brushBtn.addActionListener(listener);
		listener=new ColorButtonListener();
		redBtn.setBackground(Color.red);
		redBtn.setForeground(Color.red);
		redBtn.setBounds(50,100,100,20);
		redBtn.addActionListener(listener);
		greenBtn.setBackground(Color.green);
		greenBtn.setForeground(Color.green);
		greenBtn.setBounds(50,130,100,20);
		greenBtn.addActionListener(listener);
		blueBtn.setBackground(Color.blue);
		blueBtn.setForeground(Color.blue);
		blueBtn.setBounds(50,160,100,20);
		blueBtn.addActionListener(listener);
		add(redBtn);
		add(greenBtn);
		add(blueBtn);
		add(lineBtn);
		add(zoneBtn);
		add(brushBtn);
	}
	
	public boolean isLineSelected()
	{
		return lineBtn.isSelected();
	}
	
	public boolean isZoneSelected()
	{
		return zoneBtn.isSelected();
	}
	
	public boolean isBrushSelected()
	{
		return brushBtn.isSelected();
	}
	
	public boolean isRedSelected()
	{
		return redBtn.isSelected();
	}
	
	public boolean isGreenSelected()
	{
		return greenBtn.isSelected();
	}
	
	public boolean isBlueSelected()
	{
		return blueBtn.isSelected();
	}
	
	class ShapeButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			JToggleButton btn=(JToggleButton)e.getSource();
			if (btn.isSelected())
			{
				lineBtn.setSelected(false);
				zoneBtn.setSelected(false);
				brushBtn.setSelected(false);
				btn.setSelected(true);
			}
		}
	}
	
	class ColorButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			JToggleButton btn=(JToggleButton)e.getSource();
			if (btn.isSelected())
			{
				redBtn.setSelected(false);
				greenBtn.setSelected(false);
				blueBtn.setSelected(false);
				btn.setSelected(true);
			}
		}
	}
}
