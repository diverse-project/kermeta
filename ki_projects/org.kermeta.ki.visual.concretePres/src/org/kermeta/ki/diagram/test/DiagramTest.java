package org.kermeta.ki.diagram.test;

import java.awt.Dimension;
import java.awt.geom.Point2D;

import javax.swing.JFrame;

import org.kermeta.ki.diagram.view.impl.DiagramView;
import org.kermeta.ki.diagram.view.impl.PolygonDecorationView;
import org.kermeta.ki.diagram.view.impl.RelationView;
import org.kermeta.ki.kompren.view.ClassView;

public class DiagramTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		DiagramView diag = new DiagramView();
		ClassView class1 = new ClassView("Class1");
		ClassView class2 = new ClassView("Class2");
		RelationView rel = new RelationView(class1, class2);
		rel.setSourceDecoration(new PolygonDecorationView(rel, new Point2D.Double(0., 0.), 
								new Point2D.Double(15., 7.5), new Point2D.Double(30., 0.), new Point2D.Double(15., -7.5)));
		
		class1.setCentre(200, 200);
		class1.addAttribute("myAttr1", "int");
		class1.addAttribute("thisisabigattr", "String");
		class1.addAttribute("attr", "YourNotMyType");
		class1.addOperation("opName", "opTypeName", true);
		class1.update();
		class2.setCentre(400, 400);
		class2.update();
		rel.update();
		
		diag.addEntity(class1);
		diag.addEntity(class2);
		diag.addRelation(rel);
		
		diag.setPreferredSize(new Dimension(1000, 800));
		frame.getContentPane().add(diag);
		frame.setLocation(100, 100);
		frame.setVisible(true);
		frame.pack();
		diag.refresh();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
