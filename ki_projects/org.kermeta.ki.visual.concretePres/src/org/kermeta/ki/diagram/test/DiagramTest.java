package org.kermeta.ki.diagram.test;

import java.awt.Dimension;

import javax.swing.JFrame;

import org.kermeta.ki.diagram.view.impl.DiagramView;
import org.kermeta.ki.diagram.view.impl.RelationView;
import org.kermeta.ki.kompren.view.ClassView;
import org.kermeta.ki.kompren.view.CompositionDecorationView;
import org.kermeta.ki.kompren.view.InheritanceDecorationView;

public class DiagramTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		DiagramView diag = new DiagramView();
		ClassView class1 = new ClassView("Class1");
		ClassView class2 = new ClassView("Class2");
		ClassView class3 = new ClassView("Class3");
		RelationView rel = new RelationView(class1, class2);
		RelationView rel2 = new RelationView(class2, class3);
		RelationView rel3 = new RelationView(class3, class1);
		rel.setSourceDecoration(new CompositionDecorationView(rel));
		rel.setTargetDecoration(new CompositionDecorationView(rel));
		rel.setTargetDecoration(new CompositionDecorationView(rel));
		rel2.setSourceDecoration(new InheritanceDecorationView(rel2));
		rel2.setTargetDecoration(new InheritanceDecorationView(rel2));
		rel3.setSourceDecoration(new InheritanceDecorationView(rel3));
		rel3.setTargetDecoration(new InheritanceDecorationView(rel3));
		
		class1.setCentre(200, 200);
		class1.addAttribute("myAttr1", "int");
		class1.addAttribute("thisisabigattr", "String");
		class1.addAttribute("attr", "YourNotMyType");
		class1.addOperation("opName", "opTypeName", true);
		class1.update();
		class2.setCentre(400, 400);
		class2.update();
		class3.addAttribute("myAttr2222", "MyType");
		class3.addAttribute("a", "A");
		class3.addAttribute("attribute", "YourReallyNotMyType");
		class3.addOperation("opName", "myopTypeName", true);
		class3.addOperation("opNameAgain", "myopTypeName2", true);
		class3.setCentre(500, 100);
		class3.update();
		rel.update();
		rel2.update();
		rel3.update();
		
		diag.addEntity(class1);
		diag.addEntity(class2);
		diag.addEntity(class3);
		diag.addRelation(rel);
		diag.addRelation(rel2);
		diag.addRelation(rel3);
		
		diag.setPreferredSize(new Dimension(1000, 800));
		frame.getContentPane().add(diag);
		frame.setLocation(100, 100);
		frame.setVisible(true);
		frame.pack();
		diag.refresh();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
