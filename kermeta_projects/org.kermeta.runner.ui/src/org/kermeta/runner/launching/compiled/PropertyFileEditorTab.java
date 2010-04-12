/* $RCSfile: PropertyFileEditor.java,v $
 * Created on 19.09.2002, 21:02:25 by Oliver David
 * $Source: /cvsroot/eclpropfileedit/eclpropfileedit/src/org/sourceforge/eclpropfileedit/editor/PropertyFileEditor.java,v $
 * $Id: PropertyFileEditor.java,v 1.3 2002/11/18 21:31:42 davoli Exp $
 * Copyright (c) 2000-2002 Oliver David. All rights reserved. */
package org.kermeta.runner.launching.compiled;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.kermeta.runner.compiler.propertieseditor.core.PropertyException;
import org.kermeta.runner.compiler.propertieseditor.core.PropertyFileUtil;
import org.kermeta.runner.compiler.propertieseditor.core.PropertyLineWrapper;
import org.kermeta.runner.compiler.propertieseditor.service.PropertyFileService;
import org.kermeta.runner.launching.KConstants;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;

/**
 * @author Oliver
 * @version $Revision: 1.3 $
 */
public class PropertyFileEditorTab extends AbstractLaunchConfigurationTab
		implements SelectionListener, MouseListener, ModifyListener,
		KeyListener, FocusListener, TraverseListener {

	private File i_file;

	private PropertyFileService i_propertiesFileService;

	private HashMap i_dataMap;
	private Collection i_initData;

	private Table i_propertiesTable;

	private Label i_commentLabel;
	private Label i_valueLabel;
	private Text i_commentText;
	private Text i_valueText;
	private Button i_newButton;
	private Button i_delButton;
	private Button i_nullButton;

	private PropertyFileDialog i_propertiesFileDialog;

	private PropertyLineWrapper i_lastSelectedProperty;

	private int i_lastSelectedIndex;

	private Image i_image;

	private boolean i_isReadOnly = false;

	KermetaLaunchCompiledConfigTabGroup kermetaLaunchCompiledConfigTabGroup;

	/**
	 * Constructor for SampleEditor.
	 * 
	 * @param kermetaLaunchCompiledConfigTabGroup
	 */
	public PropertyFileEditorTab(
			KermetaLaunchCompiledConfigTabGroup kermetaLaunchCompiledConfigTabGroup) {
		super();
		this.kermetaLaunchCompiledConfigTabGroup = kermetaLaunchCompiledConfigTabGroup;

	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPart#dispose()
	 */
	public void dispose() {
		super.dispose();
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPart#createPartControl(Composite)
	 */
	public void createPartControl(Composite parent) {

		Composite area = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		area.setLayout(gl);
		area.layout();
		setControl(area);

		parent.setData(this);

		/*
		 * GridLayout gridLayout = new GridLayout (); gridLayout.marginHeight =
		 * 10; gridLayout.verticalSpacing = 10; gridLayout.marginWidth = 10;
		 * gridLayout.horizontalSpacing = 10; gridLayout.numColumns = 3;
		 * parent.setLayout (gridLayout);
		 */
		// create the table
		i_propertiesTable = new Table(area, SWT.BORDER | SWT.H_SCROLL
				| SWT.FULL_SELECTION | SWT.CHECK);
		i_propertiesTable.setVisible(false);
		i_propertiesTable.setLinesVisible(true);
		i_propertiesTable.setRedraw(false);
		i_propertiesTable.setLinesVisible(true);
		i_propertiesTable.setHeaderVisible(true);
		i_propertiesTable.addSelectionListener(this);
		i_propertiesTable.addMouseListener(this);
		i_propertiesTable.setToolTipText("Check to comment out this property");
		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.FILL;
		data.horizontalSpan = 3;
		data.grabExcessVerticalSpace = true;
		i_propertiesTable.setLayoutData(data);

		// create the columns
		TableColumn keyColumn = new TableColumn(i_propertiesTable, SWT.LEFT);
		TableColumn valueColumn = new TableColumn(i_propertiesTable, SWT.LEFT);
		keyColumn.setText("Key");
		valueColumn.setText("Value");
		keyColumn.setResizable(true);
		valueColumn.setResizable(true);

		// key column
		ColumnLayoutData keyColumnLayout = new ColumnPixelData(350, true);// ColumnWeightData(50,
		// true);
		// value column
		ColumnLayoutData valueColumnLayout = new ColumnPixelData(350, false);// ColumnWeightData(50,
		// false);

		// set columns in Table layout
		TableLayout layout = new TableLayout();
		layout.addColumnData(keyColumnLayout);
		layout.addColumnData(valueColumnLayout);
		i_propertiesTable.setLayout(layout);
		i_propertiesTable.layout();

		// create the comment's label
		i_commentLabel = new Label(area, SWT.NONE);
		i_commentLabel.setVisible(false);
		i_commentLabel.setAlignment(SWT.LEFT);
		i_commentLabel.setText("Comment:");
		data = new GridData();
		data.verticalAlignment = GridData.BEGINNING;
		i_commentLabel.setLayoutData(data);

		// create the comment's textfield
		i_commentText = new Text(area, SWT.BORDER);
		i_commentText.setVisible(false);
		i_commentText.setText("");
		i_commentText.addKeyListener(this);
		i_commentText.addFocusListener(this);
		data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		i_commentText.setLayoutData(data);

		// create the "new" button
		i_newButton = new Button(area, SWT.PUSH);
		i_newButton.setVisible(false);
		i_newButton.setText("New Property...");
		i_newButton.addMouseListener(this);
		data = new GridData();
		data.widthHint = 105;
		data.horizontalAlignment = GridData.END;
		data.verticalAlignment = GridData.BEGINNING;
		i_newButton.setLayoutData(data);

		// create the value's label
		i_valueLabel = new Label(area, SWT.NONE);
		i_valueLabel.setVisible(false);
		i_valueLabel.setAlignment(SWT.LEFT);
		i_valueLabel.setText("Value:");
		data = new GridData();
		data.verticalAlignment = GridData.BEGINNING;
		i_valueLabel.setLayoutData(data);

		// create the value's textfield
		i_valueText = new Text(area, SWT.BORDER/* | SWT.WRAP | SWT.V_SCROLL */);
		i_valueText.setVisible(false);
		i_valueText.setText("");
		i_valueText.addKeyListener(this);
		i_valueText.addFocusListener(this);
		data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		i_valueText.setLayoutData(data);

		// create the textfield
		i_delButton = new Button(area, SWT.PUSH);
		i_delButton.setVisible(false);
		i_delButton.setText("Remove Property...");
		i_delButton.addMouseListener(this);
		data = new GridData();
		data.widthHint = 105;
		data.horizontalAlignment = GridData.END;
		data.verticalAlignment = GridData.BEGINNING;
		i_delButton.setLayoutData(data);

		area.pack();

		// initialize and populate the table with the data of the file received
		// from
		// the PropertyFileService object
		System.err.println(i_initData.size());
		initPropertiesTable(i_initData);

		if (isReadOnly()) {
			i_commentText.setEditable(false);
			i_valueText.setEditable(false);
			i_newButton.setEnabled(false);
			i_delButton.setEnabled(false);
		}

		// set the widgets visible
		i_propertiesTable.setVisible(true);
		i_commentLabel.setVisible(true);
		i_valueLabel.setVisible(true);
		i_commentText.setVisible(true);
		i_valueText.setVisible(true);
		i_newButton.setVisible(true);
		i_delButton.setVisible(true);

		// set the focus on the table and select the first item if existing
		i_propertiesTable.select(0);
		// i_propertiesTable.setFocus();

		TableItem[] firstItem = i_propertiesTable.getSelection();
		if (firstItem.length > 0) {
			String key = firstItem[0].getText(0);
			PropertyLineWrapper propertiesLine = (PropertyLineWrapper) i_dataMap
					.get(key);
			i_commentText.setText(propertiesLine.getCommentString());
			i_valueText.setText(propertiesLine.getValueString());
			i_lastSelectedProperty = propertiesLine;
			i_lastSelectedIndex = 0;
			setFocusOnRow();
		}

		// this is necessary because the other buttons would respond if you hit
		// "Enter" with opening the dialogs
		i_nullButton = new Button(area, SWT.PUSH);
		i_nullButton.addTraverseListener(this);
		i_nullButton.setVisible(false);
	}

	/**
	 * Method initPropertiesTable. Populates the data table with the data of the
	 * file
	 * 
	 * @param properties
	 */
	private void initPropertiesTable(Collection properties) {
		i_dataMap = new HashMap();

		Iterator iter = PropertyFileUtil.getSortedIterator(properties);
		while (iter.hasNext()) {
			PropertyLineWrapper element = (PropertyLineWrapper) iter.next();
			TableItem keyValueItem = new TableItem(i_propertiesTable, SWT.NONE);
			keyValueItem.setText(new String[] { element.getKeyString().trim(),
					element.getValueString() });
			keyValueItem.setChecked(element.isCommentedProperty());
			i_dataMap.put(element.getKeyString(), element);
		}
		i_propertiesTable.setRedraw(true);
		i_initData = null;
	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(SelectionEvent)
	 */
	public void widgetDefaultSelected(SelectionEvent e) {

	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(SelectionEvent)
	 */
	public void widgetSelected(SelectionEvent e) {
		getTableSelection();
		if (!isReadOnly()) {
			if (e.getSource() == i_propertiesTable) {
				updateData();
			}
		} else {
			if (e.getSource() == i_propertiesTable) {

				TableItem[] tableItems = i_propertiesTable.getItems();
				for (int i = 0; i < tableItems.length; i++) {
					TableItem tableItem = tableItems[i];
					String key = tableItem.getText(0);
					PropertyLineWrapper propertiesLine = (PropertyLineWrapper) i_dataMap
							.get(key);
					boolean isCurrentDataItemChecked = propertiesLine
							.isCommentedProperty();
					tableItems[i].setChecked(isCurrentDataItemChecked);
				}
			}
		}
	}

	/**
	 * @see org.eclipse.swt.events.MouseListener#mouseDoubleClick(MouseEvent)
	 */
	public void mouseDoubleClick(MouseEvent e) {
		if (!isReadOnly()) {
			if (e.getSource() == i_propertiesTable) {
				openEditPropertyDialog();
			}
		} else {
			openReadOnlyDialog();
		}
	}

	/**
	 * @see org.eclipse.swt.events.MouseListener#mouseUp(MouseEvent)
	 */
	public void mouseUp(MouseEvent e) {
		if (!isReadOnly()) {
			if (e.getSource() == i_newButton) {
				openNewPropertyDialog();

			}

			if (e.getSource() == i_delButton) {
				TableItem[] tableItems = i_propertiesTable.getSelection();

				String keyString = null;
				if (tableItems.length != 0) {
					keyString = tableItems[0].getText(0).trim();
				}

				if (keyString == null || keyString == "") {
					MessageDialog messageDialog = new MessageDialog(
							getShell(),
							"Remove Property",
							getLogo(),
							"Please select the item you want to remove from the table",
							MessageDialog.INFORMATION, new String[] { "OK" }, 0);
					messageDialog.open();
				} else {
					MessageDialog messageDialog = new MessageDialog(getShell(),
							"Remove Property", getLogo(),
							"Do you really want to remove the property with the key \""
									+ keyString + "\" ?",
							MessageDialog.QUESTION,
							new String[] { "Yes", "No" }, 0);
					messageDialog.open();
					if (messageDialog.getReturnCode() == MessageDialog.OK) {
						removeProperty((PropertyLineWrapper) i_dataMap
								.get(keyString));
					}
				}
				i_propertiesTable.setFocus();
				i_propertiesTable.select(0);
			}
		}
	}

	/**
	 * @see org.eclipse.swt.events.MouseListener#mouseDown(MouseEvent)
	 */
	public void mouseDown(MouseEvent e) {
	}

	/**
	 * Method openNewPropertyDialog.
	 */
	private void openNewPropertyDialog() {
		i_propertiesFileDialog = new PropertyFileDialog(getShell(), this);
		i_propertiesFileDialog.create();
		i_propertiesFileDialog.setKeyTextEditable(true);
		i_propertiesFileDialog.getShell().setText("Create a new property...");
		i_propertiesFileDialog.getShell().setImage(getLogo());
		i_propertiesFileDialog.setNew(true);
		i_propertiesFileDialog.open();
	}

	/**
	 * Method openEditPropertyDialog.
	 */
	private void openEditPropertyDialog() {
		i_propertiesFileDialog = new PropertyFileDialog(getShell(), this);

		TableItem[] tableItems = i_propertiesTable.getSelection();
		String keyString = tableItems[0].getText(0).trim();
		PropertyLineWrapper propertiesLineWrapper = (PropertyLineWrapper) i_dataMap
				.get(keyString);
		String valueString = propertiesLineWrapper.getValueString();
		String commentString = propertiesLineWrapper.getCommentString();
		boolean isCommentedProperty = propertiesLineWrapper
				.isCommentedProperty();

		i_propertiesFileDialog.create();
		i_propertiesFileDialog.setKeyString(keyString);
		i_propertiesFileDialog.setValueString(valueString);
		i_propertiesFileDialog.setCommentString(commentString);
		i_propertiesFileDialog.setCommentedProperty(isCommentedProperty);

		// make the key mutable after all
		i_propertiesFileDialog.setKeyTextEditable(true);
		i_propertiesFileDialog.getShell().setText(
				"Edit an existing property...");
		i_propertiesFileDialog.getShell().setImage(getLogo());
		i_propertiesFileDialog.open();
	}

	/**
	 * @see org.eclipse.swt.events.KeyListener#keyPressed(KeyEvent)
	 */
	public void keyPressed(KeyEvent e) {

		int input;
		if (e.keyCode != 0) {
			input = e.keyCode | e.stateMask;
		} else {
			input = e.character | e.stateMask;
		}

		if (!isReadOnly()) {
			if (e.getSource() == i_commentText) {
				if (e.character == SWT.CR) {
					i_lastSelectedProperty.setCommentString(i_commentText
							.getText());
					addNewProperty(i_lastSelectedProperty, null);
					i_commentText.setText(i_lastSelectedProperty
							.getCommentString());
					i_valueText
							.setText(i_lastSelectedProperty.getValueString());
					setFocusOnRow();
				}

				if (isPaste(input)) {
					// works without it...
					// i_commentText.paste();
				}

				if (isCopy(input)) {
					i_commentText.copy();
				}

				// if(isCut(input))
				// {
				// i_commentText.cut();
				// }
			}

			if (e.getSource() == i_valueText) {
				if (e.character == SWT.CR) {
					i_lastSelectedProperty
							.setValueString(i_valueText.getText());
					addNewProperty(i_lastSelectedProperty, null);
					i_commentText.setText(i_lastSelectedProperty
							.getCommentString());
					i_valueText
							.setText(i_lastSelectedProperty.getValueString());
					setFocusOnRow();
				}

				if (isPaste(input)) {
					// works without it...
					// i_valueText.paste();
				}

				if (isCopy(input)) {
					i_valueText.copy();
				}

				// if(isCut(input))
				// {
				// i_valueText.cut();
				// }
			}
		}
	}

	/**
	 * @see org.eclipse.swt.events.KeyListener#keyReleased(KeyEvent)
	 */
	public void keyReleased(KeyEvent e) {
	}

	/**
	 * Method saveToPropertyFile.
	 */
	private void saveToPropertyFile() {
		if (i_propertiesFileService != null) {
			i_propertiesFileService.writeToPropertiesFile(i_file, i_dataMap);
		}
		setDirty(false);
	}

	protected void setDirty(boolean dirty) {
		super.setDirty(dirty);
	}

	/**
	 * Method addNewProperty.
	 * 
	 * @param propertiesLineWrapper
	 */
	public void addNewProperty(PropertyLineWrapper propertiesLineWrapper,
			String selectedKey) {
		String key = propertiesLineWrapper.getKeyString();
		if (selectedKey != null && !selectedKey.equals(key)) {
			i_dataMap.remove(selectedKey);
		}
		i_dataMap.put(key, propertiesLineWrapper);
		updatePropertiesTable();
		i_lastSelectedIndex = 0;
		i_propertiesTable.select(i_lastSelectedIndex);
		getTableSelection();
	}

	/**
	 * Method removeProperty.
	 * 
	 * @param propertiesLineWrapper
	 */
	private void removeProperty(PropertyLineWrapper propertiesLineWrapper) {
		i_dataMap.remove(propertiesLineWrapper.getKeyString());
		updatePropertiesTable();
		setDirty(true);
		i_lastSelectedIndex = 0;
		i_propertiesTable.select(i_lastSelectedIndex);
		getTableSelection();
		canSave();
		updateLaunchConfigurationDialog();
	}

	/**
	 * Method updatePropertiesTable.
	 */
	private void updatePropertiesTable() {
		i_propertiesTable.setRedraw(false);
		i_propertiesTable.removeAll();

		Iterator iter = PropertyFileUtil.getSortedIterator(i_dataMap.values());
		while (iter.hasNext()) {
			PropertyLineWrapper element = (PropertyLineWrapper) iter.next();
			TableItem keyValueItem = new TableItem(i_propertiesTable, SWT.NONE);
			keyValueItem.setText(new String[] { element.getKeyString().trim(),
					element.getValueString() });
			keyValueItem.setChecked(element.isCommentedProperty());
		}
		i_propertiesTable.setRedraw(true);
	}

	/**
	 * Method update.
	 */
	public void update() {
		updatePropertiesTable();
		try {
			if (configuration.isWorkingCopy())
				((ILaunchConfigurationWorkingCopy) configuration).setAttribute(
						"change", !configuration.getAttribute("change", true));

		} catch (CoreException e) {
			e.printStackTrace();
		}
		setDirty(true);
		canSave();
		updateLaunchConfigurationDialog();

	}

	/**
	 * @see org.eclipse.swt.events.FocusListener#focusGained(FocusEvent)
	 */
	public void focusGained(FocusEvent e) {
		if (e.getSource() == i_propertiesTable) {
			setFocusOnRow();
		}
	}

	/**
	 * @see org.eclipse.swt.events.FocusListener#focusLost(FocusEvent)
	 */
	public void focusLost(FocusEvent e) {
		if (!isReadOnly()) {
			if (e.getSource() == i_valueText
					&& i_valueText.getText() != null
					&& i_lastSelectedProperty != null
					&& !i_valueText.getText().equals(
							i_lastSelectedProperty.getValueString())) {
				i_lastSelectedProperty
						.setCommentString(i_commentText.getText());
				i_lastSelectedProperty.setValueString(i_valueText.getText());
				addNewProperty(i_lastSelectedProperty, null);
			}

			if (e.getSource() == i_commentText
					&& i_commentText.getText() != null
					&& i_lastSelectedProperty != null
					&& !i_commentText.getText().equals(
							i_lastSelectedProperty.getCommentString())) {
				i_lastSelectedProperty
						.setCommentString(i_commentText.getText());
				i_lastSelectedProperty.setValueString(i_valueText.getText());
				addNewProperty(i_lastSelectedProperty, null);
			}
			i_propertiesTable.select(i_lastSelectedIndex);
			getTableSelection();
		}
	}

	/**
	 * Returns the propertiesTable.
	 * 
	 * @return Table
	 */
	public void setFocusOnRow() {
		i_propertiesTable.setFocus();
		i_propertiesTable.select(i_lastSelectedIndex);
	}

	/**
	 * Method getTableSelection.
	 */
	private void getTableSelection() {
		TableItem[] tableItems = i_propertiesTable.getSelection();
		if (tableItems.length > 0) {
			String keyString = tableItems[0].getText(0);
			PropertyLineWrapper propertiesLineWrapper = (PropertyLineWrapper) i_dataMap
					.get(keyString);
			String valueString = propertiesLineWrapper.getValueString();
			String commentString = propertiesLineWrapper.getCommentString();
			i_valueText.setText(valueString);
			i_commentText.setText(commentString);
			i_lastSelectedIndex = i_propertiesTable.getSelectionIndex();
			i_lastSelectedProperty = propertiesLineWrapper;
		}
	}

	/**
	 * Method getLogo.
	 * 
	 * @return Image
	 */
	public Image getLogo() {
		return i_image;
	}

	/**
	 * Method isCopy.
	 * 
	 * @param input
	 * @return boolean
	 */
	private boolean isCopy(int input) {

		if (input == (SWT.DEL | SWT.SHIFT)) {
			return true;
		}

		return false;

	}

	/**
	 * Method isCut.
	 * 
	 * @param input
	 * @return boolean
	 */
	private boolean isCut(int input) {
		return false;
	}

	/**
	 * Method isPaste.
	 * 
	 * @param input
	 * @return boolean
	 */
	private boolean isPaste(int input) {
		if (input == (SWT.INSERT | SWT.SHIFT)) {
			return true;
		}

		return false;
	}

	/**
	 * Method updateData.
	 */
	private void updateData() {
		TableItem[] tableItems = i_propertiesTable.getItems();
		for (int i = 0; i < tableItems.length; i++) {
			TableItem tableItem = tableItems[i];
			String key = tableItem.getText(0);
			PropertyLineWrapper propertiesLine = (PropertyLineWrapper) i_dataMap
					.get(key);
			boolean isCurrentTableItemChecked = tableItem.getChecked();
			boolean isCurrentDataItemChecked = propertiesLine
					.isCommentedProperty();
			propertiesLine.setCommentedProperty(isCurrentTableItemChecked);
			i_dataMap.put(key, propertiesLine);
			// setDirty(true);

		}
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPart#setFocus()
	 */
	public void setFocus() {
		setFocusOnRow();
	}

	/**
	 * Returns the dataMap.
	 * 
	 * @return HashMap
	 */
	public HashMap getDataMap() {
		return i_dataMap;
	}

	/**
	 * @see org.eclipse.swt.events.TraverseListener#keyTraversed(TraverseEvent)
	 */
	public void keyTraversed(TraverseEvent e) {
		if (e.getSource() == i_nullButton) {
			i_nullButton.traverse(SWT.TRAVERSE_TAB_NEXT);
		}
	}

	/**
	 * Returns the isReadOnly.
	 * 
	 * @return boolean
	 */
	public boolean isReadOnly() {
		return i_isReadOnly;
	}

	/**
	 * Method openReadOnlyDialog.
	 */
	private void openReadOnlyDialog() {
		MessageDialog messageDialog = new MessageDialog(getShell(),
				"Read-only File", getLogo(),
				"This file is marked as read-only!", MessageDialog.INFORMATION,
				new String[] { "OK" }, 0);
		messageDialog.open();
	}

	/**
	 * Method getNewPropertIndex.
	 * 
	 * @param key
	 * @return int
	 */
	private int getNewPropertIndex(String key) {
		int index = -1;
		Iterator iter = PropertyFileUtil.getSortedIterator(i_dataMap.values());
		while (iter.hasNext()) {
			PropertyLineWrapper element = (PropertyLineWrapper) iter.next();
			index++;
			if (key.equals(element.getKeyString())) {
				break;
			}
		}
		return index;
	}

	public void createControl(Composite parent) {
		this.i_initData = new ArrayList<PropertyLineWrapper>();

		createPartControl(parent);
	}

	public String getName() {
		return "Configuration globale";
	}

	private void initTab() {
		IProject p = null;

		try {
			String projectPath = configuration.getAttribute(
					KConstants.KM_PROJECTNAME, (String) null);
			System.err.println(projectPath);
			if (projectPath != null)
				p = ResourceHelper.getIProject(projectPath);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		if (p == null) {
			if (i_newButton != null) {
				i_newButton.setEnabled(false);
				i_delButton.setEnabled(false);
			}
		} else {
			if (i_newButton != null) {
				i_newButton.setEnabled(true);
				i_delButton.setEnabled(true);
			}
		}

		if (p != null) {
			// System.out.println("project is not null");
			IFile f = p.getFile("Compiler.properties");
			if (f.exists()) {
				this.i_file = new File(f.getLocation().toOSString());
				i_propertiesFileService = new PropertyFileService(i_file);
			} else {
				this.i_file = new File(f.getLocation().toOSString());
				try {
					this.i_file.createNewFile();
					PrintWriter w = new PrintWriter(this.i_file);
					w
							.println("#optimisation, use default pre compiled aspect\n"
									+ "use.default.aspect.uml = false\n"
									+ "use.default.aspect.ecore = false\n"
									+ "use.default.aspect.km = false\n"
									+ "\n"
									+ "user.additional.classpath =\n"
									+ "\n"
									+ "project.group.id = org.kermeta.default.output\n"
									+ "project.artefact.id = org.kermeta.default.output\n"
									+ "\n"
									+ "#use a specified file as output stream, default is System.out\n"
									+ "output.target.default.output = output\n"
									+ "\n"
									+ "#specify target compilation steps\n"
									+ "output.target.embeddedCompileAndRun = true\n"
									+ "output.target.mavenCompileAndRun = true\n"
									+ "output.target.mavenFullPackage = false\n"
									+ "output.target.package = false\n"
									+ "\n"
									+ "#specified output project output, default is temporary file\n"
									+ "output.target.folder = /home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.output\n"
									+ "\n"
									+ "#workspace loader mapping\n"
									+ "workspace.plugin.uri =\n"
									+ "workspace.platform.uri =\n"
									+ "\n"
									+ "#clean before compile\n"									
									+ "clean = true\n"
									+ "#create package using maven\n"
									+ "createPackage = true\n"
									+ "#Exec Output\n"
									+ "exec = true\n"
									+ "#Create a standalone big jar with everything\n"
									+ "standalone =false \n"
									);
					w.flush();
					w.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			try {
				this.i_initData = i_propertiesFileService.readPropertiesFile();
				initPropertiesTable(this.i_initData);
				updatePropertiesTable();
			} catch (PropertyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("project is null");
		}

	}

	public void initializeFrom(ILaunchConfiguration configuration) {
		this.configuration = configuration;
		this.i_initData = new ArrayList<PropertyLineWrapper>();
		this.initTab();
		System.out.println("initializeFrom");

	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		System.out.println(this.configuration);
		System.out.println(configuration);
		System.out.println(this.configuration == configuration);
		this.configuration = configuration;
		System.out.println("Perform Apply");
		this.saveToPropertyFile();

	}

	ILaunchConfiguration configuration;

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		this.configuration = configuration;
		this.i_initData = new ArrayList<PropertyLineWrapper>();
		this.initTab();

		System.out.println("setDefaults");
	}

	public void modifyText(ModifyEvent e) {
		setDirty(true);
		canSave();
		updateLaunchConfigurationDialog();

	}

	/**
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#canSave()
	 */
	public boolean canSave() {
		return validateFileLocation();
	}

	/**
	 * @return true if the selected file is a valid kermeta file, false
	 *         otherwise NOTE : do not put UI changes, otherwise, canSave()
	 *         method will be called undefinitely
	 */
	protected boolean validateFileLocation() {

		setErrorMessage(null);
		return true;
	}

}