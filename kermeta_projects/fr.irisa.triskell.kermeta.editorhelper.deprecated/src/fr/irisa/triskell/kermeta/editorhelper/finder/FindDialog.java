/*$Id: FindDialog.java,v 1.1 2007-02-28 09:41:57 cfaucher Exp $*/
/*******************************************************************************
 * Copyright (c) 2007 Ecliptical Software Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ecliptical Software Inc. - initial API and implementation
 *     http://www.eclipticalsoftware.com - http://www.eclipticalsoftware.com/emf/
 *******************************************************************************/
package fr.irisa.triskell.kermeta.editorhelper.finder;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;

public class FindDialog extends TrayDialog {
	
	public static final int FIND_ID = IDialogConstants.CLIENT_ID;
	
	public static final String FIND_LABEL = "Fi&nd";
	
	private IEditorPart editor;
	
	private Text searchText;
	
	private Button caseSensitiveButton;
	
	private Button wrapButton;
	
	private Label messageLabel;
	
	public FindDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.CLOSE);
		setBlockOnOpen(false);
	}
	
	IEditorPart getEditor() {
		return editor;
	}
	
	public void setEditor(IEditorPart editor) {
		if (this.editor == editor)
			return;
		
		this.editor = editor;

		Button findButton = getButton(FIND_ID);
		if (findButton != null && !findButton.isDisposed())
			findButton.setEnabled(editor != null && searchText.getText().trim().length() > 0);
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Find");
	}

	protected Control createDialogArea(Composite parent) {
		parent = (Composite) super.createDialogArea(parent);
		GridLayout layout = (GridLayout) parent.getLayout();
		layout.marginBottom = -layout.marginHeight;
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		composite.setLayout(layout);
		
		Label label = new Label(composite, SWT.LEFT);
		label.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));
		label.setText("&Find:");
		
		searchText = new Text(composite, SWT.BORDER);
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		searchText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				Button findButton = getButton(FIND_ID);
				boolean isEmpty = searchText.getText().trim().length() == 0;
				if (findButton.isEnabled() && isEmpty)
					findButton.setEnabled(false);
				else if (!findButton.isEnabled() && !isEmpty)
					findButton.setEnabled(true);
			}
		});
		
		Group optionsGroup = new Group(composite, SWT.NONE);
		optionsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		optionsGroup.setLayout(new GridLayout(2, true));
		optionsGroup.setText("Options");
		
		caseSensitiveButton = new Button(optionsGroup, SWT.CHECK);
		caseSensitiveButton.setText("&Case Sensitive");
		
		wrapButton = new Button(optionsGroup, SWT.CHECK);
		wrapButton.setText("Wra&p Search");
		
    	messageLabel = new Label(composite, SWT.LEFT);
    	messageLabel.setLayoutData(new GridData(SWT.FILL, SWT.END, true, false, 2, 1));

		return parent;
	}
	
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);
    	
    	IDialogSettings settings = getDialogSettings();
    	String storedSearchText = settings.get("searchText");
    	if (storedSearchText != null)
    		searchText.setText(storedSearchText);
    	
    	caseSensitiveButton.setSelection(settings.getBoolean("caseSensitive"));
    	wrapButton.setSelection(settings.getBoolean("wrapSearch"));
		
    	return contents;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, FIND_ID, FIND_LABEL, true);
		createButton(parent, IDialogConstants.CLOSE_ID, IDialogConstants.CLOSE_LABEL, false);
	}
	
	protected void buttonPressed(int buttonId) {
		switch (buttonId) {
		case FIND_ID:
			findPressed();
			break;
		case IDialogConstants.CLOSE_ID:
			closePressed();
			break;
		default:
			super.buttonPressed(buttonId);
		}
	}
	
	protected void findPressed() {
		messageLabel.setText("");
		
		// TODO catch this earlier
		if (!(editor instanceof IEditingDomainProvider) || !(editor instanceof IViewerProvider))
			return;
 
		ContentViewer viewer = (ContentViewer) ((IViewerProvider) editor).getViewer();
		Object input = viewer.getInput();
		Object selection = null;
		
		ISelection sel = viewer.getSelection();
		if (sel instanceof IStructuredSelection)
			selection = ((IStructuredSelection) sel).getFirstElement();
		
		if (selection == null)
			selection = input;
		
		ILabelProvider labelProvider = (ILabelProvider) viewer.getLabelProvider();
		String searchString = searchText.getText().trim();
		boolean caseSensitive = caseSensitiveButton.getSelection();
		if (!caseSensitive)
			searchString = searchString.toLowerCase();
		
		EditingDomain domain = ((IEditingDomainProvider) editor).getEditingDomain();

		for (int pass = 0; pass < 2; ++pass) {
			boolean pastSelection = false;
			for (Iterator i = new DomainTreeIterator(domain, input); i.hasNext();) {
				Object item = i.next();
				if (!pastSelection) {
					if (item == selection)
						pastSelection = true;
	
					continue;
				}
				
				selection = item;
				String label = labelProvider.getText(selection);
				if (!caseSensitive)
					label = label.toLowerCase();
				
				if (match(label, searchString)) {
					if (viewer instanceof StructuredViewer)
						((StructuredViewer) viewer).reveal(selection);
					
					viewer.setSelection(new StructuredSelection(selection), true);
					return;
				}
			}
		
			if (!wrapButton.getSelection())
				break;

			selection = input;
		}
		
		messageLabel.setText("String not found.");
		getShell().getDisplay().beep();
	}
	
	protected void closePressed() {
		close();
	}
	
	public boolean close() {
		if (getShell() != null && !getShell().isDisposed())
			saveDialogSettings();
		
		return super.close();
	}
	
	protected IDialogSettings getDialogBoundsSettings() {
		IDialogSettings root = FindPlugin.getDefault().getDialogSettings();
		IDialogSettings settings = root.getSection(getClass().getName() + "_bounds");
		if (settings == null)
			settings = root.addNewSection(getClass().getName() + "_bounds");
		
		return settings;
	}
	
	protected int getDialogBoundsStrategy() {
		return DIALOG_PERSISTLOCATION;
	}
	
	private IDialogSettings getDialogSettings() {
		IDialogSettings root = FindPlugin.getDefault().getDialogSettings();
		IDialogSettings settings = root.getSection(getClass().getName());
		if (settings == null)
			settings = root.addNewSection(getClass().getName());
		
		return settings;
	}
	
	private void saveDialogSettings() {
		IDialogSettings settings = getDialogSettings();
		String searchString = searchText.getText().trim();
		settings.put("searchText", searchString);
		settings.put("caseSensitive", caseSensitiveButton.getSelection());
		settings.put("wrapSearch", wrapButton.getSelection());
	}
	
	protected boolean match(String label, String searchString) {
		return label.indexOf(searchString) != -1;
	}
	
	private class DomainTreeIterator extends EcoreUtil.ContentTreeIterator {
		
		private static final long serialVersionUID = -2709513334570919767L;
		
		private final EditingDomain domain;
		
		public DomainTreeIterator(EditingDomain domain, Object object) {
			super(object, false);
			includeRoot = true;
			this.domain = domain;
		}
		
		public Iterator getChildren(Object object) {
			Object unwrapped = AdapterFactoryEditingDomain.unwrap(object);
			if (unwrapped instanceof ResourceSet)
				return getResourceSetChildren(object);
			
			return getObjectChildren(object);
		}
		
		protected Iterator getResourceSetChildren(Object wrappedResourceSet) {
			Collection children = domain.getChildren(wrappedResourceSet);
			if (children instanceof List)
				return resourceSetIterator = new ResourcesIterator((List) children);
			
			return children.iterator();
		}
		
		protected Iterator getObjectChildren(Object object) {
			return domain.getChildren(object).iterator();
		}
	}
}
