/*$Id: $
* Project : org.kermeta.language.filegraph
* File : 	FileGraph.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2010
* Authors : Didier Vojtisek
*/

package filegraph.mockup;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.language.filegraph.CycleGraph;
import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.IFileGraphService;
import org.kermeta.language.filegraph.SimpleGraph;

public class FileGraphService implements IFileGraphService{

	public CycleGraph getCycleGraph(File rootFileURI) {
		CycleGraph result = new CycleGraph();
		GraphNode rootNode = new GraphNode();
		rootNode.setName("root");
		for ( Integer i=0; i<4; ++i ) {
			GraphNode n = new GraphNode();
			n.setName(i.toString());
			rootNode.getDirectReferences().add(n);
			for ( Integer i2=0; i2<1+i; ++i2 ) {
				GraphNode n2 = new GraphNode();
				n2.setName(i.toString()+"\n"+i2.toString());
				n.getDirectReferences().add(n2);
				
		    }
			// add a cycle
			for ( Integer i2=0; i2<n.getDirectReferences().size(); ++i2 ) {
				if(i2 == n.getDirectReferences().size()-1)
					n.getDirectReferences().get(i2).getDirectReferences().add(n.getDirectReferences().get(0));
				else
					n.getDirectReferences().get(i2).getDirectReferences().add(n.getDirectReferences().get(i2+1));				
		    }
			List<GraphNode> cycle = new ArrayList<GraphNode>();
			cycle.addAll(n.getDirectReferences());
			result.getCycles().add(cycle);
	    }
		result.setRootNode(rootNode);
		return result;
	}

	public SimpleGraph getSimpleGraph(File rootFileURI) {
		SimpleGraph result = new SimpleGraph();
		GraphNode rootNode = new GraphNode();
		rootNode.setName("root");
		for ( Integer i=0; i<4; ++i ) {
			GraphNode n = new GraphNode();
			n.setName(i.toString());
			rootNode.getDirectReferences().add(n);
			for ( Integer i2=0; i2<5; ++i2 ) {
				GraphNode n2 = new GraphNode();
				n2.setName(i.toString()+"_"+i2.toString());
				n.getDirectReferences().add(n2);
		    }
	    }
		result.setRootNode(rootNode);
		return result;
	}

	public List<String> getAllRequired(File rootFile) {
		// TODO Auto-generated method stub
		return null;
	}

}
