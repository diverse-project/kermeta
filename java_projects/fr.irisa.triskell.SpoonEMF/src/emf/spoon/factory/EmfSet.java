package emf.spoon.factory;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.spoon.reflect.declaration.impl.ext.EmfConstructorImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfParameterImpl;

public class EmfSet implements List, EList, Set, InternalEList {

	private InternalEList value;

	public EmfSet(List value) {
		super();
		this.value = (InternalEList) value;
	}

	public int size() {
		return value.size();
	}

	public boolean isEmpty() {
		return value.isEmpty();
	}

	public boolean contains(Object o) {
		return value.contains(o);
	}

	public Iterator iterator() {
		return value.iterator();
	}

	public Object[] toArray() {
		return value.toArray();
	}

	public Object[] toArray(Object[] a) {
		return value.toArray(a);
	}

	public boolean add(Object o) {
		//value.addUnique(object)
		boolean res =true;
//		System.err.println("size " +((org.eclipse.emf.common.notify.impl.NotifyingListImpl)value).size());
		if (o instanceof EObjectWithInverseResolvingEList)
			{org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList o1 = (EObjectWithInverseResolvingEList) value;;
			o1.grow(20);
			}
		try{
			if (o!=null){
			//if (!value.contains(o)){
				value.add(o);
				return true;
				
			//}	
		}
		}catch(Exception e){
			e.printStackTrace();
			//value.add(o);
			org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList o1 = (EObjectWithInverseResolvingEList) value;;
			o1.grow(20);
			//return true;
			System.err.println(this.value.getClass());
			System.err.println("toto " + o.toString() + " " + ((EmfParameterImpl)o).getParent() + "\n\t" +((EmfConstructorImpl)((EmfParameterImpl)o).getParent()).getDeclaringType());
		}
		return false;
	}

	public boolean remove(Object o) {
		return value.remove(o);
	}

	public boolean containsAll(Collection c) {
		return value.containsAll(c);
	}

	public boolean addAll(Collection c) {

		return value.addAll(c);
	}

	public boolean retainAll(Collection c) {

		return value.retainAll(c);
	}

	public boolean removeAll(Collection c) {

		return value.removeAll(c);
	}

	public void clear() {
		value.clear();

	}

	public boolean addAll(int index, Collection c) {
		return value.addAll(index, c);
	}

	public Object get(int index) {
		return value.get(index);
	}

	public Object set(int index, Object element) {
		return value.set(index, element);
	}

	public void add(int index, Object element) {
		value.add(index, element);

	}

	public Object remove(int index) {
		return value.remove(index);
	}

	public int indexOf(Object o) {
		return value.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return value.lastIndexOf(o);
	}

	public ListIterator listIterator() {
		return value.listIterator();
	}

	public ListIterator listIterator(int index) {
		return value.listIterator(index);
	}

	public List subList(int fromIndex, int toIndex) {
		return value.subList(fromIndex, toIndex);
	}

	public void move(int newPosition, Object object) {
		value.move(newPosition, object);
	}

	public Object move(int newPosition, int oldPosition) {
		return value.move(newPosition, oldPosition);
	}

	public Object basicGet(int index) {
		return value.basicGet(index);
	}

	public List basicList() {
		return value.basicList();
	}

	public Iterator basicIterator() {
		return value.basicIterator();
	}

	public ListIterator basicListIterator() {
		return value.basicListIterator();
	}

	public ListIterator basicListIterator(int index) {
		return value.basicListIterator(index);
	}

	public NotificationChain basicRemove(Object object,
			NotificationChain notifications) {
		return value.basicRemove(object, notifications);
	}

	public NotificationChain basicAdd(Object object,
			NotificationChain notifications) {
		return value.basicAdd(object, notifications);
	}

	public void addUnique(Object object) {
		value.addUnique(object);
	}

	public void addUnique(int index, Object object) {
		value.addUnique(index, object);
	}

	public Object setUnique(int index, Object object) {
		return value.setUnique(index, object);
	}

	public boolean addAllUnique(Collection collection) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAllUnique(int index, Collection collection) {

		return value.addAllUnique(index, collection);
	}

	public boolean basicContains(Object object) {
		return value.basicContains(object);
	}

	public boolean basicContainsAll(Collection collection) {
		return value.basicContainsAll(collection);
	}

	public int basicIndexOf(Object object) {

		return value.basicIndexOf(object);
	}

	public int basicLastIndexOf(Object object) {
		return value.basicLastIndexOf(object);
	}

	public Object[] basicToArray() {
		return value.basicToArray();
	}

	public Object[] basicToArray(Object[] array) {
		return value.basicToArray(array);
	}

}
