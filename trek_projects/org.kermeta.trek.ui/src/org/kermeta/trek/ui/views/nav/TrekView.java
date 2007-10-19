package org.kermeta.trek.ui.views.nav;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.kermeta.trek.ui.views.nav.operations.CreateKTag;
import org.kermeta.trek.ui.views.nav.operations.CreateKUsecase;
import org.kermeta.trek.ui.views.nav.operations.CreateKUserStory;

public class TrekView extends ViewPart {
	
	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	
	
	private KustomAction upperButtonAction;
	
	
	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new TrekViewContentProvider(getViewSite()));
		viewer.setLabelProvider(new TrekViewLabelProvider());
     	viewer.setInput(getViewSite());
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
		
	}

	private void fillLocalToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator());
	}

	private void fillLocalPullDown(IMenuManager menuManager) {
		menuManager.add(new Separator());
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				
			}
		});
		
	}
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("CreateKusecase#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				TrekView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	protected void fillContextMenu(IMenuManager manager) {
		
		if(((TreeSelection)this.viewer.getSelection()).getFirstElement() instanceof KStaticElement){
			KStaticElement selection=(KStaticElement) ((TreeSelection)this.viewer.getSelection()).getFirstElement();
			if(selection.getKind()==KTreeElementKind.STATIC_TAG){
				this.upperButtonAction=new CreateKTag();
			}
			else if(selection.getKind()==KTreeElementKind.STATIC_USECASE){
				this.upperButtonAction=new CreateKUsecase();
			}
			else if(selection.getKind()==KTreeElementKind.STATIC_TESTCASE){
				this.upperButtonAction=new KustomAction();
			}
			else if(selection.getKind()==KTreeElementKind.STATIC_USERSTORY){
				this.upperButtonAction=new CreateKUserStory();
			}
			this.upperButtonAction.setSelected(selection);
			manager.add(this.upperButtonAction);
		}
		else{
			
		}
	}

	private void makeActions() {
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

}
