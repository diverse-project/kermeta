/* $Id: ConfigurationDialogComposite.java,v 1.1 2005-11-28 23:09:15 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : ConfigurationDialogComposite.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 28 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.dialogs;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.layout.GridData;

/**
 * Composite content of the Configuration dialog 
 * Note: use of a separate class extending Composite in order to be able to use VE
 *
 */
public class ConfigurationDialogComposite extends Composite {

	private Group eventConfigurationGroup = null;
	private Group presentationGroup = null;
	private Label label = null;
	private Button updateOnTextHoverCheckBox = null;
	private Label label3 = null;
	private Label label4 = null;
	private Label label6 = null;
	private Button updateOnOutlineSelectionCheckBox = null;
	private Label label1 = null;
	private Combo primitiveTypesPresentationCombo = null;
	private Label label5 = null;
	private Combo associationLinePresentationCombo = null;
	private Label label9 = null;
	private Combo associationEndPresentationCombo = null;
	private Label label8 = null;
	private Button updateOnEditorChangecheckBox = null;
	private Combo inheritancePresentationCombo = null;
	private Label label7 = null;
	public ConfigurationDialogComposite(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	private void initialize() {
		FillLayout fillLayout = new FillLayout();
		fillLayout.type = org.eclipse.swt.SWT.VERTICAL;
		this.setLayout(fillLayout);
		this.setSize(new org.eclipse.swt.graphics.Point(277,263));
		createEventConfiguration();
		createPresentationGroup();
	}

	public void initValues(boolean updateOnTextHover, 
			boolean updateOnOutlineSelection,
			boolean updateOnEditorChange,
			int primitiveTypePresentation,
			int associationLinesPresentation,
			int associationEndsPresentation,
			int inheritancePresentation){
		this.inheritancePresentationCombo.select(inheritancePresentation);
		this.associationEndPresentationCombo.select(associationEndsPresentation);
		this.associationLinePresentationCombo.select(associationLinesPresentation);
		this.primitiveTypesPresentationCombo.select(primitiveTypePresentation);
		this.updateOnEditorChangecheckBox.setSelection(updateOnEditorChange);
		this.updateOnOutlineSelectionCheckBox.setSelection(updateOnOutlineSelection);
		this.updateOnTextHoverCheckBox.setSelection(updateOnTextHover);
	}
	/**
	 * This method initializes eventConfiguration	
	 *
	 */
	private void createEventConfiguration() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		eventConfigurationGroup = new Group(this, SWT.NONE);
		eventConfigurationGroup.setText("Update event rules");
		eventConfigurationGroup.setLayout(gridLayout);
		label = new Label(eventConfigurationGroup, SWT.NONE);
		label.setText("update view on text hover events: ");
		updateOnTextHoverCheckBox = new Button(eventConfigurationGroup, SWT.CHECK);
		label3 = new Label(eventConfigurationGroup, SWT.NONE);
		label3.setText("update view on outline selection events: ");
		updateOnOutlineSelectionCheckBox = new Button(eventConfigurationGroup, SWT.CHECK);
		label8 = new Label(eventConfigurationGroup, SWT.NONE);
		label8.setText("update on editor change event:");
		label8.setToolTipText("The view will update each time a compatible editor view is selected ");
		updateOnEditorChangecheckBox = new Button(eventConfigurationGroup, SWT.CHECK);
		label4 = new Label(eventConfigurationGroup, SWT.NONE);
		label6 = new Label(eventConfigurationGroup, SWT.NONE);
	}

	/**
	 * This method initializes presentationGroup	
	 *
	 */
	private void createPresentationGroup() {
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 2;
		presentationGroup = new Group(this, SWT.NONE);
		presentationGroup.setText("Presentation configuration");
		presentationGroup.setLayout(gridLayout1);
		label1 = new Label(presentationGroup, SWT.NONE);
		label1.setText("Primitives types");
		createPrimitiveTypesPresentationCombo();
		label5 = new Label(presentationGroup, SWT.NONE);
		label5.setText("Associations lines");
		createAssociationPresentationCombo();
		label9 = new Label(presentationGroup, SWT.NONE);
		label9.setText("Associations ends");
		createAssociationEndPresentationCombo();
		label7 = new Label(presentationGroup, SWT.NONE);
		label7.setText("Inheritance");
		createInheritancePresentationCombo();
	}

	/**
	 * This method initializes primitiveTypesPresentationCombo	
	 *
	 */
	private void createPrimitiveTypesPresentationCombo() {
		GridData gridData = new org.eclipse.swt.layout.GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		primitiveTypesPresentationCombo = new Combo(presentationGroup, SWT.READ_ONLY | SWT.BORDER);
		primitiveTypesPresentationCombo.setText("");
		primitiveTypesPresentationCombo.setLayoutData(gridData);
		primitiveTypesPresentationCombo.setEnabled(false);
		primitiveTypesPresentationCombo.add("displayed as classes",0);
		primitiveTypesPresentationCombo.add("displayed as in labels",1);
		primitiveTypesPresentationCombo.add("not displayed",2);
		primitiveTypesPresentationCombo.select(0);
	}

	/**
	 * This method initializes associationPresentationCombo	
	 *
	 */
	private void createAssociationPresentationCombo() {
		GridData gridData1 = new org.eclipse.swt.layout.GridData();
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		associationLinePresentationCombo = new Combo(presentationGroup, SWT.READ_ONLY);
		associationLinePresentationCombo.setEnabled(false);
		associationLinePresentationCombo.setLayoutData(gridData1);
		associationLinePresentationCombo.add("as straight lines",0);
		associationLinePresentationCombo.add("as splines",1);
		associationLinePresentationCombo.select(0);
		
	}

	/**
	 * This method initializes associationEndPresentationCombo	
	 *
	 */
	private void createAssociationEndPresentationCombo() {
		GridData gridData2 = new org.eclipse.swt.layout.GridData();
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData2.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		associationEndPresentationCombo = new Combo(presentationGroup, SWT.READ_ONLY | SWT.DROP_DOWN);
		associationEndPresentationCombo.setEnabled(false);
		associationEndPresentationCombo.setLayoutData(gridData2);
		associationEndPresentationCombo.add("Class features next to the class");
		associationEndPresentationCombo.add("UML like (feature name next to the destination)");
		associationEndPresentationCombo.select(0);
	}

	/**
	 * This method initializes inheritancePresentationCombo	
	 *
	 */
	private void createInheritancePresentationCombo() {
		GridData gridData3 = new org.eclipse.swt.layout.GridData();
		gridData3.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData3.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		inheritancePresentationCombo = new Combo(presentationGroup, SWT.NONE);
		inheritancePresentationCombo.setEnabled(false);
		inheritancePresentationCombo.setLayoutData(gridData3);
		inheritancePresentationCombo.add("separated links (straight)",0);
		inheritancePresentationCombo.add("separated links (spline)",1);
		inheritancePresentationCombo.add("join links where parents are the same (straight)",2);
		inheritancePresentationCombo.add("join links where childdren are the same (straight)",3);
		inheritancePresentationCombo.select(0);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
