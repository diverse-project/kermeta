package org.kermeta.java.jamoppc.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.impl.EObjectImpl;

public class Node<T> extends EObjectImpl{
	
	private T self;
	private List<Node<T>> childs;
	
	public Node(T o){
		self = o;
		this.childs = new ArrayList<Node<T>>();
	}

	public void addChild(T o){
		this.childs.add(new Node<T>(o));
	}
	
	public void addChild(Node<T> node){
		this.childs.add(node);
	}
	
	public void removeChild(T o){
		this.childs.remove(o);
	}
	
	public List<Node<T>> getChilds() {
		return childs;
	}
	
	public void setChilds(List<Node<T>> childs) {
		this.childs = childs;
	}
	
	public String toString(){
		System.out.println(self.toString());
		for (Node<T> child : this.childs) {
			System.out.println("\t"+child.toString());
		}
		return "";
	}
	
	public T getValue(){
		return self;
	}
	
	public boolean existsInHierarchy(T c){
		boolean exists = false;
		if (self.equals(c))
			exists = true;
		for (Node<T> n : this.getChilds()) {
			exists = exists || n.existsInHierarchy(c);
		}
		return exists;
	}
	
	public Node<T> findNode(T c){
		Node<T> node = null;
		if (self.equals(c))
			node = this;
		else {
			for (Node<T> n : this.getChilds()) {
				node = n.findNode(c);
				if (node != null)
					break;
			}
		}
		return node;
	}

	public int getSize() {
		int size = 1;
		for (Node<T> node : childs) {
			size += node.getSize();
		}
		return size;
	}
}
