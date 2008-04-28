package fr.irisa.triskell.kermeta.directedgraph;

import java.util.ArrayList;

public class DirectedGraphTest implements DirectedGraphInterface {
	public ArrayList getAllNodes() {
		ArrayList list=new ArrayList();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("5");
		list.add("3");
		list.add("4");
		
		return list;
	}

	public ArrayList getTargetsforNode(Object node) {
		ArrayList vertecs=new ArrayList();
		if (node.equals("0")){
			vertecs.add("2");
			vertecs.add("1");
		}
		if (node.equals("1")){
			vertecs.add("0");
		}
		if (node.equals("2")){
			vertecs.add("1");	
		}
		/*
		if (node.equals("5")){
			System.out.println("passe par 5");
			vertecs.add("0");	
		}
		if (node.equals("3")){
			vertecs.add("4");	
		}
		if (node.equals("4")){
			vertecs.add("3");	
		}*/
		return vertecs;
	}

}
