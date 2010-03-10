package org.kermeta.java.jamoppc.ecore;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * A Tree implementation
 * @author mclavreu
 *
 * @param <T> Type of the tree nodes
 */
public class Tree<T> extends EObjectImpl{
	
	public Node<T> root = null;
	
	/**
	 * Constructor
	 * @param o the root element
	 */
	public Tree(T o){
		root = new Node<T>(o);
	}
	
	/**
	 * Constructor
	 * @param node the root Node
	 */
	public Tree(Node<T> node){
		root = node;
	}
	
	/**
	 * Constructor
	 */
	public Tree(){
	}
	
	/**
	 * Getter of the root Node
	 * @return the root Node
	 */
	public Node<T> getRoot(){
		return this.root;
	}
	
	/**
	 * Setter of the root Node
	 * @param node the root Node to set
	 */
	public void setRoot(Node<T> node){
		root = node;
	}
	
	/**
	 * Adds a new Node to the Tree
	 * @param node node to add
	 */
	public void addNode(T node){
		root.addChild(node);
	}
		
	/**
	 * Removes a node in the Tree
	 * @param node node to remove
	 */
	public void removeNode(T node){
		root.removeChild(node);
	}
	
	/**
	 * Adds a child for a specific Node
	 * @param node the node
	 * @param child the node to add
	 */
	public void addChildForANode(T node, T child){
		root.getChildren().get(root.getChildren().indexOf(node)).addChild(child);
	}
	
	/**
	 * Removes a child of a specific Node
	 * @param node the node
	 * @param child the node to remove
	 */
	public void removeChildForANode(T node, T child){
		root.getChildren().get(root.getChildren().indexOf(node)).removeChild(child);
	}
	
	/**
	 * Displays the root Node
	 */
	public String toString(){
		return this.root.toString();
	}

	/**
	 * Checks if an element exists in the Tree
	 * @param c the element
	 * @return true if the element exists, false otherwise
	 */
	public boolean existsInHierarchy(T c) {
		return this.root.existsInHierarchy(c);
	}
	
	/**
	 * Locates a Node
	 * @param c the value we are looking for
	 * @return a Node
	 */
	public Node<T> findNode(T c){
		Node<T> node = this.root.findNode(c);
		return node;
	}

	/**
	 * Returns the size of the Tree
	 * @return the size of the Tree, 0 if the Tree is not populated
	 */
	public int getSize() {
		int size = 0;
		size += this.root.getSize();
		return size;
	}
}
