/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Bjorn Freeman-Benson - initial API and implementation
 *******************************************************************************/
package org.kermeta.runner.ui.model;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.kermeta.runner.model.KStackFrame;
import org.kermeta.runner.model.variable.KAttribute;
import org.kermeta.runner.model.variable.KParameter;
import org.kermeta.runner.model.variable.KReference;
import org.kermeta.runner.model.variable.KVariable;

import fr.irisa.triskell.kermeta.provider.KermetaEditPlugin;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

/**
 * Renders Kermeta debug elements
 */
public class KModelPresentation extends LabelProvider implements IDebugModelPresentation {
	
	private Image _variableImage = null;
	
	private Image _parameterImage = null;
	
	private Image _referenceImage = null;
	
	private Image _attributeImage = null;
	
	private Image _propertyImage = null;
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.IDebugModelPresentation#setAttribute(java.lang.String, java.lang.Object)
	 */
	public void setAttribute(String attribute, Object value) {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object element) {
		if ( element instanceof KVariable ) {
			if ( _variableImage == null ) {
				URL url = KermetaEditPlugin.getPlugin().getBundle().getEntry("icons/full/obj16/VariableDecl.gif");
				ImageDescriptor descriptor = ImageDescriptor.createFromURL(url);
				_variableImage = descriptor.createImage();
			}
			return _variableImage;
		}
		
		if ( element instanceof KParameter ) {
			if ( _parameterImage == null ) {
				URL url = KermetaEditPlugin.getPlugin().getBundle().getEntry("icons/full/obj16/Parameter.gif");
				ImageDescriptor descriptor = ImageDescriptor.createFromURL(url);
				_parameterImage = descriptor.createImage();
			}
			return _parameterImage;			
		}
		
		if ( element instanceof KAttribute ) {
			if ( _attributeImage == null ) {
				URL url = TexteditorPlugin.getDefault().getBundle().getEntry("src/java/fr/irisa/triskell/kermeta/texteditor/icons/red/property_contained.png");
				ImageDescriptor descriptor = ImageDescriptor.createFromURL(url);
				_attributeImage = descriptor.createImage();
			}
			return _attributeImage;
		}
		
		if ( element instanceof KReference ) {
			if ( _referenceImage == null ) {
				URL url = TexteditorPlugin.getDefault().getBundle().getEntry("src/java/fr/irisa/triskell/kermeta/texteditor/icons/red/property.png");				
				ImageDescriptor descriptor = ImageDescriptor.createFromURL(url);
				_referenceImage = descriptor.createImage();
			}
			return _referenceImage;
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		if ( element instanceof KStackFrame )
			return ((KStackFrame) element).getDisplayString();
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.IDebugModelPresentation#computeDetail(org.eclipse.debug.core.model.IValue, org.eclipse.debug.ui.IValueDetailListener)
	 */
	public void computeDetail(IValue value, IValueDetailListener listener) {
		String detail = "";
		try {
			detail = value.getValueString();
		} catch (DebugException e) {
		}
		listener.detailComputed(value, detail);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ISourcePresentation#getEditorInput(java.lang.Object)
	 */
	public IEditorInput getEditorInput(Object element) {
		if (element instanceof IFile) {
			return new FileEditorInput((IFile)element);
		}
		if (element instanceof ILineBreakpoint) {
			return new FileEditorInput((IFile)((ILineBreakpoint)element).getMarker().getResource());
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ISourcePresentation#getEditorId(org.eclipse.ui.IEditorInput, java.lang.Object)
	 */
	public String getEditorId(IEditorInput input, Object element) {
		if ( element instanceof IFile ) {
			IFile f = (IFile) element;
			return getEditorId(f);
		}
		if (element instanceof ILineBreakpoint) {
			IResource r = ((ILineBreakpoint) element).getMarker().getResource();
			if ( r instanceof IFile )
				return getEditorId( (IFile) r );
		}
		return null;
	}
	
	private String getEditorId(IFile f) {
		if ( f.getFileExtension().equals("kmt") )
			//return "org.eclipse.ui.DefaultTextEditor";
			return "org.kermeta.ui.editors.kmt.editor";
		else
			return "org.eclipse.ui.DefaultTextEditor";
	}
}
