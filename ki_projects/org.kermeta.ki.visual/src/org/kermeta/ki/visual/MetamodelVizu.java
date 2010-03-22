package org.kermeta.ki.visual;


public class MetamodelVizu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MetamodelVizuFrame frame = new MetamodelVizuFrame(null);
		
		/*		MetamodelView mm = frame.mmView;
		EntityView b = new ClassView("B");
		b.setCentre(60, 266);
		b.setVisible(true);
		b.update();
		
		EntityView a = new ClassView("A");
		a.setCentre(267, 287);
		a.setVisible(true);
		a.update();
		
		LinkView link = new RelationView(b, a);
		link.update();
		
		mm.addEntity(-1, a);
		mm.addEntity(-1, b);
		mm.addLink(-1, link);
		mm.updatePreferredSize();*/
		
		frame.setVisible(true);
	}
}
