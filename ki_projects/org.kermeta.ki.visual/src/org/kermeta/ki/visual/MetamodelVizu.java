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
		EntityView c = new ClassView("C");
		EntityView d = new ClassView("D");
		EntityView a = new ClassView("A");
		
		LinkView link = new RelationView(b, a, false, true, null, null, null, null);
		link.update();
		
		LinkView link2 = new RelationView(c, a, false, true, null, null, null, null);
		link2.update();
		
		LinkView link3 = new RelationView(d, a, true, true, null, null, null, null);
		link3.update();
		
		LinkView link4 = new RelationView(b, d, false, true, null, null, null, null);
		link4.update();
		
		LinkView link5 = new RelationView(d, c, true, true, null, null, null, null);
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
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
