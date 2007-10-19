package org.kermeta.trek.ui.views.nav;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.part.ViewPart;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.UseKaseModel;

public class TrekViewContentProvider implements IStructuredContentProvider,
		ITreeContentProvider {

	private KStaticElement[] roots;
	
	private UseKaseModel modelRoot=null;
	
	private IViewSite view;
	
	private boolean init=false;
	
	public TrekViewContentProvider(IViewSite viewSite){
		this.view=viewSite;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement.equals(view)) {
			if(!init){
				initialize();
			}
			return roots;
		}
		return this.getChildren(inputElement);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getChildren(Object parentElement) {

		if(parentElement instanceof KStaticElement){
			return ((KStaticElement)parentElement).getChilds().toArray(new KDynamicElement[0]);
		}
		else if(parentElement instanceof KDynamicElement){
			return ((KDynamicElement)parentElement).getLowers().toArray(new KDynamicElement[0]);
		}
		return null;
	}

	private void initialize() {
		//fetch the model...
		if(this.modelRoot==null){
			this.modelRoot=TrekFactory.eINSTANCE.createUseKaseModel();
		}
		
		this.roots=new KStaticElement[4];
		this.roots[0]=new KStaticElement(Knames.kusecase_name,this.modelRoot,KTreeElementKind.STATIC_USECASE);
		this.roots[1]=new KStaticElement(Knames.kuserstory_name,this.modelRoot,KTreeElementKind.STATIC_USERSTORY);
		this.roots[2]=new KStaticElement(Knames.ktestcase_name,this.modelRoot,KTreeElementKind.STATIC_TESTCASE);
		this.roots[3]=new KStaticElement(Knames.ktags,this.modelRoot,KTreeElementKind.STATIC_TAG);
		
		
		//fill the elements
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof KStaticElement){
			return ((KStaticElement)element);
		}
		else if(element instanceof KDynamicElement){
			if(((KDynamicElement)element).getUpper()!=null){
				return ((KDynamicElement)element).getUpper();
			}
			else return ((KDynamicElement)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof KStaticElement){
			return ((KStaticElement)element).hasFamily();
		}
		else if(element instanceof KDynamicElement){
			return ((KDynamicElement)element).hasFamily();
		}
		return false;
	}

}
