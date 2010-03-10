package org.kermeta.java.jamoppc.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * A Node implementation
 * @author mclavreu
 *
 * @param <T> Value of the Node
 */
public class Node<T> extends EObjectImpl{
	
	private T self;
	private List<Node<T>> children;
	
	/**
	 * Constructor
	 * @param o the value of the Node
	 */
	public Node(T o){
		self = o;
		this.children = new ArrayList<Node<T>>();
	}

	/**
	 * Adds a child to this Node
	 * @param o the value of the child Node
	 */
	public void addChild(T o){
		this.children.add(new Node<T>(o));
	}
	
	/**
	 * Adds a child to this Node
	 * @param node the node to add
	 */
	public void addChild(Node<T> node){
		this.children.add(node);
	}
	
	/**
	 * Removes a child from this Node
	 * @param o the value of the child Node
	 */
	public void removeChild(T o){
		this.children.remove(o);
	}
	
	/**
	 * Gets the children of this Node
	 * @return the children of this Node
	 */
	public List<Node<T>> getChildren() {
		return children;
	}
	
	/**
	 * Sets the children of this Node
	 * @param childs the new Collection of children
	 */
	public void setChildren(List<Node<T>> children) {
		this.children = children;
	}
	
	/**
	 * Displays the Node and its children
	 */
	public String toString(){
		System.out.println(self.toString());
		for (Node<T> child : this.children) {
			System.out.println("\t"+child.toString());
		}
		return "";
	}
	
	/**
	 * Getter for the Node value
	 * @return the value of the Node
	 */
	public T getValue(){
		return self;
	}
	
	/**
	 * Checks if a value exists in the subTree
	 * @param c the value we are looking for
	 * @return true if the value if a child of this node, false otherwise
	 */
	public boolean existsInHierarchy(T c){
		boolean exists = false;
		if (self.equals(c))
			exists = true;
		for (Node<T> n : this.getChildren()) {
			exists = exists || n.existsInHierarchy(c);
		}
		return exists;
	}
	
	/**
	 * Locates a Node
	 * @param c the value of the Node
	 * @return the Node
	 */
	public Node<T> findNode(T c){
		Node<T> node = null;
		if (self.equals(c))
			node = this;
		else {
			for (Node<T> n : this.getChildren()) {
				node = n.findNode(c);
				if (node != null)
					break;
			}
		}
		return node;
	}

	/**
	 * Gets the size of the subTree that starts from this Node
	 * @return the size of the subTree, 1 otherwise
	 */
	public int getSize() {
		int size = 1;
		for (Node<T> node : children) {
			size += node.getSize();
		}
		return size;
	}
}
