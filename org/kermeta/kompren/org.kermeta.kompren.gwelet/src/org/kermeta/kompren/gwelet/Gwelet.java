package org.kermeta.kompren.gwelet;

import javax.swing.UIManager;

import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicerrunner.MainRunner;

public class Gwelet {
	public static void main(final String[] args) {
		MainRunner.init();

		if(System.getProperty("os.name").toLowerCase().contains("linux"))
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			}catch(Exception e) { e.printStackTrace(); }
		if(System.getProperty("os.name").toLowerCase().contains("win"))
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}catch(Exception e) { e.printStackTrace(); }

		GweletFrame frame = new GweletFrame();
		frame.getComposer().compose(null);
		frame.setVisible(true);
		frame.open("./examples/UML.km");
		frame.getCanvas().requestFocusInWindow();
//		((GweletUIBuilder)frame.getComposer()).formular.setVisible(true);// EVAL
	}
}
