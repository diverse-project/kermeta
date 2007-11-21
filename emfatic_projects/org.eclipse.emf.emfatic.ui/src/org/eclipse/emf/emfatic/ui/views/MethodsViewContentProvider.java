package org.eclipse.emf.emfatic.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MethodsViewContentProvider implements IStructuredContentProvider {
	
	private TypesView _typesView = null;

	public MethodsViewContentProvider(TypesView tv) {
		_typesView  = tv; 
	}

	public Object[] getElements(Object inputElement) {
		EClass eC = (EClass) inputElement;
		List<EObject> members = new ArrayList<EObject>();
		if (_typesView.isShowingInheritedMembers()) {
			members.addAll(eC.getEAllAttributes());
			members.addAll(eC.getEAllReferences());
			members.addAll(eC.getEAllOperations());
		} else {
			members.addAll(eC.getEAttributes());
			members.addAll(eC.getEReferences());
			members.addAll(eC.getEOperations());
		}
		EObject[] res = new EObject[members.size()]; 
		members.toArray(res);
		return res;
	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// we're not listening for property changes
	}

}
