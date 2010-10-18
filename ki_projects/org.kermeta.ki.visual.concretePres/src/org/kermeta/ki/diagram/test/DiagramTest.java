package org.kermeta.ki.diagram.test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

import org.kermeta.ki.diagram.view.impl.DiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.kompren.view.ClassDiagramView;
import org.kermeta.ki.kompren.view.ClassModelBasicStrategy;
import org.kermeta.ki.kompren.view.ClassView;
import org.kermeta.ki.kompren.view.InheritanceView;
import org.kermeta.ki.kompren.view.RelationClassView;
import org.kermeta.ki.kompren.view.RoleView.Cardinality;

public class DiagramTest {

	public static void main(String[] args) {
		try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); } 
		catch(Exception e) { /* */ }
		
		JFrame frame 			= new JFrame();
		JToggleButton handB 	= new JToggleButton();
		DiagramView diag		= createEcoreClassDiagram();
		diag.getHand().setHandButton(handB);
		handB.setSelected(true);
		
		frame.getContentPane().setLayout(new BorderLayout());
		JScrollPane sp = diag.getScrollPane();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int width  = (int)(screen.width*0.85);
		int height = (int)(screen.height*0.8);
		sp.setPreferredSize(new Dimension(width, height));
		
		frame.getContentPane().add(sp, BorderLayout.CENTER);
		frame.setLocation(100, 100);
		frame.setVisible(true);
		frame.pack();
		diag.refresh();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static DiagramView createEcoreClassDiagram() {
		ClassDiagramView diag 	= new ClassDiagramView(true);
		ClassView eclass 		= (ClassView) diag.addEntity("EClass", -1, false);
//		IRelationView rel  		= new RelationClassView(eclass, eclass, true, true, null, "supertypes", null, Cardinality.ONE_MULTI);
		IRelationView rel  		= diag.addRelation(eclass, eclass, true, true, null, "supertypes", null, "0..*", -1);
		
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.addAttribute("toto", "fdsfsdfsdff");
		eclass.update();
//		diag.addRelation(rel);
		
		diag.setLayoutStrategy(new ClassModelBasicStrategy(diag));
		diag.updateLayout();
		
		return diag;
	}
	
	
	
	public static DiagramView createBasicClassDiagram() {
		ClassDiagramView diag = new ClassDiagramView(true);
		
		ClassView class1   = (ClassView) diag.addEntity("Class1", -1, false);
		ClassView class2   = new ClassView("Class2");
		ClassView class3   = new ClassView("Class3");
		IRelationView rel  = new RelationClassView(class1, class2, true, true, null, "role2", Cardinality.ONE, Cardinality.ONE_MULTI);
		IRelationView rel2 = new InheritanceView(class2, class3);
		IRelationView rel3 = new InheritanceView(class3, class1);
		IRelationView rel4 = new RelationClassView(class1, class1, true, true, null, "role3", Cardinality.ONE, Cardinality.ZERO_ONE);

		diag.addEntity(class2);
		diag.addEntity(class3);
		diag.addRelation(rel);
		diag.addRelation(rel2);
		diag.addRelation(rel3);
		diag.addRelation(rel4);
		
		class1.addAttribute("myAttr1", "int");
		class1.addAttribute("thisisabigattr", "String");
		class1.addAttribute("attr", "YourNotMyType");
		class1.addOperation("opName", "opTypeName", true);
		class1.update();
		class2.update();
		class3.addAttribute("myAttr2222", "MyType");
		class3.addAttribute("a", "A");
		class3.addAttribute("attribute", "YourReallyNotMyType");
		class3.addOperation("opName", "myopTypeName", true);
		class3.addOperation("opNameAgain", "myopTypeName2", true);
		class3.update();
		
		diag.setLayoutStrategy(new ClassModelBasicStrategy(diag));
		diag.updateLayout();
		
		return diag;
	}
}
