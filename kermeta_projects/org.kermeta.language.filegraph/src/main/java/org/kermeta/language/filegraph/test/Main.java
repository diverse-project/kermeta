/**
 * 
 */
package org.kermeta.language.filegraph.test;

import java.io.File;
import java.util.List;

import org.kermeta.language.filegraph.GraphNode;
import org.kermeta.language.filegraph.SimpleGraph;
import org.kermeta.language.filegraph.impl.FileGraphService;

/**
 * @author hrambelo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileGraphService sce = new FileGraphService();
		File f = new File("/home/hrambelo/Applications/Eclipses/32/E_CodeCamp_Kermeta/runtime-New_configuration/kermeta_preparser/nouveau dossier/req1.kermeta_contour");
		SimpleGraph graph = sce.getSimpleGraph(f);
		List<GraphNode> innerNodes = graph.getRootNode().getDirectReferences();
		System.out.println("nodes in req1.kermeta_contour");
		for (GraphNode node : innerNodes){
			System.out.println(node.getName());
		}
	}

}
