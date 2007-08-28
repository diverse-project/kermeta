/*$Id: ModelingUnitView.java,v 1.1 2007-08-28 13:30:23 cfaucher Exp $
* Project : org.kermeta.diagramregistration
* File : 	ModelingUnitView.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 june 07
* Authors : cfaucher
*/

package org.kermeta.registration.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.part.ViewPart;

public class ModelingUnitView extends ViewPart {
	
	private ListViewer lv;
	
	//private StructuredSelection selection;
	
	public static final String ID = "org.kermeta.registration.modelingunitview";
	
	public static final String ROOT_RESOURCE_ATTRIBUTE = "kmt-or-km-as-Modeling-Unit-root";
	
	/**
	 * 
	 */
	public ModelingUnitView() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {
        
        lv = new ListViewer(parent);
        
        // TODO To comment
        lv.setContentProvider( new IStructuredContentProvider() {

			public Object[] getElements(Object inputElement) {
				return ((List) inputElement).toArray();
			}

			public void dispose() {
			}

			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}
        	
        });
        
        // Give as an element is displayed
        lv.setLabelProvider( new ILabelProvider() {

        	/**
        	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
        	 */
			public Image getImage(Object element) {
				Image result = null;
				return result;
			}

			/**
        	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
        	 */
			public String getText(Object element) {
				
				String label = "";
				
				if(element instanceof String) {
					label = element.toString();
				}
				
				if(element instanceof IConfigurationElement) {
					IConfigurationElement elt = (IConfigurationElement) element;
					if(elt.getName().equals("kermetaModelingUnit")) {
						label = getTextElementAttribute(elt, "name") 
						+ " (" + getTextPathElement(elt, ROOT_RESOURCE_ATTRIBUTE) + ")" 
						+ ": " + getTextElementAttribute(elt, "uri")
						+ ": " + getTextElementAttribute(elt, "description");
					} else if(elt.getName().equals("related-Kermeta-resource")) {
						label = " - " + getTextPathElement(elt, "kmt-or-km-file") 
						+ ": " + getTextElementAttribute(elt, "description");
					}
				}
				
				return label;
			}

			/* (non-Javadoc)
			 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
			 */
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
			}

			public void dispose() {
				// TODO Auto-generated method stub
			}

			/* (non-Javadoc)
			 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
			 */
			public boolean isLabelProperty(Object element, String property) {
				// TODO Auto-generated method stub
				return false;
			}

			/* (non-Javadoc)
			 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
			 */
			public void removeListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub

			}
        	
        });
        
        lv.setInput(fillListViewer());
        
	}

	@Override
	public void setFocus() {
		//fillListViewer(lv.getList());
	}
	
	/**
	 * Fill the ListViewer data
	 */
	protected List fillListViewer() {

		ArrayList pList = new ArrayList();
		
		IExtensionRegistry registry = RegistryFactory.getRegistry();
		
		IExtensionPoint extensionPoint = registry.getExtensionPoint("org.kermeta.registration.kermetaModelingUnit");
		IExtension[] extensions = extensionPoint.getExtensions();
		
		List<IConfigurationElement> simuList = new ArrayList<IConfigurationElement>();
		List<IConfigurationElement> transfoList = new ArrayList<IConfigurationElement>();
		List<IConfigurationElement> checkingList = new ArrayList<IConfigurationElement>();
		
		// An extension can have one or more registration (one registration corresponds to one ConfigurationElement)
		for ( int i = 0; i < extensions.length; i++ ) {
			
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			
			for ( int j = 0; j < elements.length; j++ ) {
				List<IConfigurationElement> tmpList = new ArrayList<IConfigurationElement>();
				tmpList.add(elements[j]);
				if(elements[j].getChildren("related-Kermeta-resource")!=null) {
					
					for ( int k = 0; k < elements[j].getChildren("related-Kermeta-resource").length; k++ ) {
						tmpList.add(elements[j].getChildren("related-Kermeta-resource")[k]);
					}
				}
				String category = elements[j].getAttribute("category");
				if(category.equals("model simulation")) {
					simuList.addAll(tmpList);
				} else if(category.equals("model transformation")) {
					transfoList.addAll(tmpList);
				} else if(category.equals("model checking")) {
					checkingList.addAll(tmpList);
				}
			}

		}
		
		if(simuList.size()>0) {
			pList.add(" *** Model Simulation ***");
			pList.addAll(simuList);
			pList.add("");
		}
		if(transfoList.size()>0) {
			pList.add(" *** Model Transformation ***");
			pList.addAll(transfoList);
			pList.add("");
		}
		if(checkingList.size()>0) {
			pList.add(" *** Model Checking ***");
			pList.addAll(checkingList);
		}
		return pList;
		
	}
	
	/**
	 * 
	 * @param element
	 * @return
	 */
	private String getTextPathElement(IConfigurationElement element, String attributeId) {
		
		String path = "";
		
		if(element.getContributor()!=null && element.getAttribute(attributeId)!=null) {
			
			path += "platform:/plugin/" + element.getContributor().getName() + "/" + element.getAttribute(attributeId);
		}

		return path;
	}
	
	/**
	 * Utils method
	 * 
	 * Returns "" if the attribute is empty
	 * 
	 * @param element
	 * @param attributeName
	 * @return
	 */
	public String getTextElementAttribute(IConfigurationElement element, String attributeName) {
		String text = "";
		if(element.getAttribute(attributeName)!=null) {
			text += element.getAttribute(attributeName);
		}
		return text;
	}
	
	/**
	 * Never used for the moment
	 * Utils method
	 * 
	 * @param element
	 * @param attributeName
	 * @return
	 */
	public boolean existElementAttribute(IConfigurationElement element, String attributeName) {
		if( element.getAttribute(attributeName) != null && !element.getAttribute(attributeName).equals("") ) {
			return true;
		}
		return false;
	}
}
