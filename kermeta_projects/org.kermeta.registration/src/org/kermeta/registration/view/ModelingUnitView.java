/*$Id: ModelingUnitView.java,v 1.2 2007-08-29 08:14:33 cfaucher Exp $
* Project : org.kermeta.diagramregistration
* File : 	ModelingUnitView.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 July 07
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
	
	// ID of the view
	public static final String ID = "org.kermeta.registration.modelingunitview";
	
	public static final String KERMETA_MODELING_UNIT = "kermetaModelingUnit";
	public static final String CATEGORY_ATTRIBUTE = "category";
	public static final String DESCRIPTION_ATTRIBUTE = "description";
	public static final String NAME_ATTRIBUTE = "name";
	public static final String URI_ATTRIBUTE = "uri";
	public static final String DOC_URL_ATTRIBUTE = "doc-url";
	public static final String[] CATEGORY_TAB = new String[]{"model simulation", "model transformation", "model checking"};
	public static final String ROOT_RESOURCE_ATTRIBUTE = "kmt-or-km-as-Modeling-Unit-root";
	public static final String RELATED_RESOURCE_CHILD = "related-resource";
	
	public static final String RELATED_RESOURCE_ATTRIBUTE = "file";
	
	private ListViewer lv;
	
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
					
					if(elt.getName().equals(KERMETA_MODELING_UNIT)) {
						label = getTextElementAttribute(elt, NAME_ATTRIBUTE) 
						+ " (" + getTextPathElement(elt, ROOT_RESOURCE_ATTRIBUTE) + ")" 
						+ " " + getTextElementAttribute(elt, URI_ATTRIBUTE)
						+ " - " + getTextElementAttribute(elt, DESCRIPTION_ATTRIBUTE)
						+ " - see at " + getTextElementAttribute(elt, DOC_URL_ATTRIBUTE);
					}
					else if(elt.getName().equals(RELATED_RESOURCE_CHILD)) {
						label = " - " + getTextPathElement(elt, RELATED_RESOURCE_ATTRIBUTE) 
						+ ": " + getTextElementAttribute(elt, DESCRIPTION_ATTRIBUTE);
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

		List pList = new ArrayList();
		
		IExtensionRegistry registry = RegistryFactory.getRegistry();
				
		IExtensionPoint extensionPoint = registry.getExtensionPoint("org.kermeta.registration.kermetaModelingUnit");
		IExtension[] extensions = extensionPoint.getExtensions();
		
		// Each category has got its list of elements
		List<IConfigurationElement> simuList = new ArrayList<IConfigurationElement>();
		List<IConfigurationElement> transfoList = new ArrayList<IConfigurationElement>();
		List<IConfigurationElement> checkingList = new ArrayList<IConfigurationElement>();
		
		// An extension can have one or more registration (one registration corresponds to one ConfigurationElement)
		for ( int i = 0; i < extensions.length; i++ ) {
			
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			
			for ( int j = 0; j < elements.length; j++ ) {
				List<IConfigurationElement> tmpList = new ArrayList<IConfigurationElement>();
				tmpList.add(elements[j]);
				
				IConfigurationElement[] childrenResources = elements[j].getChildren(RELATED_RESOURCE_CHILD);
				if(childrenResources != null) {
					for ( int k = 0; k < childrenResources.length; k++ ) {
						tmpList.add(childrenResources[k]);
					}
				}
				String categoryLbl = elements[j].getAttribute(CATEGORY_ATTRIBUTE);
				if(categoryLbl.equals(CATEGORY_TAB[0])) {
					simuList.addAll(tmpList);
				} else if(categoryLbl.equals(CATEGORY_TAB[1])) {
					transfoList.addAll(tmpList);
				} else if(categoryLbl.equals(CATEGORY_TAB[2])) {
					checkingList.addAll(tmpList);
				}
			}

		}
		
		if(simuList.size()>0) {
			pList.add(" *** Model Simulation ***");
			pList.addAll(simuList);
			pList.add(""); // empty line
		}
		if(transfoList.size()>0) {
			pList.add(" *** Model Transformation ***");
			pList.addAll(transfoList);
			pList.add(""); // empty line
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
	 * @param attributeId
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
