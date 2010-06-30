package org.kermeta.art2.runtime.gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.kermeta.art2.runtime.ArtRuntimeService;


public class MainGuiFrame extends JFrame {
	
	
	private ArtRuntimeService artService;
	
	public ArtRuntimeService getArtService() {
		return artService;
	}

	public void setArtService(ArtRuntimeService artService) {
		this.artService = artService;
	}

	public void init(){
            artService.update("file:empty.xmi");

		final JFrame pointer = this;
		final JTextField linetxt = new JTextField();
		linetxt.setColumns(15);
		JButton buttonBrowse = new JButton("Browse");
		JButton button = new JButton("Update");
		final JFileChooser fc = new JFileChooser();
		
		
		
		setSize(500, 200);
		setPreferredSize(getSize());
		JPanel panel = new JPanel();
		panel.add(linetxt);
		panel.add(button);
		panel.add(buttonBrowse);
		add(panel);
		pack();
		setVisible(true);
		
		button.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				artService.update(linetxt.getText());
			}
			
		});
		
		buttonBrowse.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int returnVal = fc.showOpenDialog(pointer);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
			        File file = fc.getSelectedFile();
			        linetxt.setText(file.getAbsolutePath());
				}
			}
		});
		
	}
	
	public void stop(){
		setVisible(false);
	}

}
