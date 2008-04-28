package fr.irisa.triskell.kermeta.directedgraph;

import java.util.ArrayList;

public interface DirectedGraphInterface {
	
	public ArrayList getAllNodes();
	public ArrayList getTargetsforNode(Object node);

}
