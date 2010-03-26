package org.kermeta.ki.visual;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.kermeta.ki.visual.view.ClassView;
import org.kermeta.ki.visual.view.EntityView;
import org.kermeta.ki.visual.view.LinkView;
import org.kermeta.ki.visual.view.MetamodelView;
import org.kermeta.ki.visual.view.RelationView;


public class MetamodelVizu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MetamodelVizuFrame frame = new MetamodelVizuFrame(null, new JPanel());
		
		MetamodelView mm = frame.mmView;
		EntityView b = new ClassView("B");
		b.setVisible(true);
		
		EntityView c = new ClassView("C");
		c.setVisible(true);
		
		EntityView d = new ClassView("D");
		d.setVisible(true);
		
		EntityView a = new ClassView("A");
		a.setVisible(true);
		
		LinkView link = new RelationView(b, a);
		link.update();
		
		LinkView link2 = new RelationView(c, a);
		link2.update();
		
		LinkView link3 = new RelationView(d, a);
		link3.update();
		
		LinkView link4 = new RelationView(b, d);
		link4.update();
		
		LinkView link5 = new RelationView(d, c);
		link5.update();
		
		mm.addEntity(-1, a);
		mm.addEntity(-1, b);
		mm.addEntity(-1, c);
		mm.addEntity(-1, d);
		mm.addLink(-1, link);
		mm.addLink(-1, link2);
		mm.addLink(-1, link3);
		mm.addLink(-1, link4);
		mm.addLink(-1, link5);
		
		mm.initialiseForest();
		mm.setTreeLayout();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
