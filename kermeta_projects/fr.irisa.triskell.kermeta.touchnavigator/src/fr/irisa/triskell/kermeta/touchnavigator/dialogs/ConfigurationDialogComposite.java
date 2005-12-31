/* $Id: ConfigurationDialogComposite.java,v 1.2 2005-12-31 09:58:03 dvojtise Exp $
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

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;

/**
 * Composite content of the Configuration dialog 
 * Note: use of a separate class extending Composite in order to be able to use VE
 *
 */
public class ConfigurationDialogComposite extends Composite {

	public ConfigurationDialog parentConfigurationDialog;
	
	private Group eventConfigurationGroup = null;
	private Group presentationGroup = null;
	private Label labelUpdateTextHover = null;
	public Button updateOnTextHoverCheckBox = null;
	private Label labelUpdateOutline = null;
	public Button updateOnOutlineSelectionCheckBox = null;
	private Label labelPrimitiveTypeCombo = null;
	public Combo primitiveTypesPresentationCombo = null;
	private Label labelAssociationLinesCombo = null;
	public Combo associationLinePresentationCombo = null;
	private Label labelAssociationEndsCombo = null;
	public Combo associationEndPresentationCombo = null;
	private Label labelUpdateEditor = null;
	public Button updateOnEditorChangeCheckBox = null;
	public Combo inheritancePresentationCombo = null;
	private Label labelInheritanceCombo = null;
	private Label labelSelectedNodeColor = null;
	private Button buttonSelectedNodeColor = null;
	private Label labelDistantNodeColor = null;
	private Button buttonDistantNodeColor = null;
	public ConfigurationDialogComposite(Composite parent, int style, ConfigurationDialog newParentConfigurationDialog) {
		super(parent, style);
		parentConfigurationDialog = newParentConfigurationDialog;
		initialize();
	}

	private void initialize() {
		FillLayout fillLayout = new FillLayout();
		fillLayout.type = org.eclipse.swt.SWT.VERTICAL;
		this.setLayout(fillLayout);
		this.setSize(new org.eclipse.swt.graphics.Point(350,300));
		createEventConfiguration();
		createPresentationGroup();
		
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
		labelUpdateTextHover = new Label(eventConfigurationGroup, SWT.NONE);
		labelUpdateTextHover.setText("update view on text hover events: ");
		updateOnTextHoverCheckBox = new Button(eventConfigurationGroup, SWT.CHECK);
		labelUpdateOutline = new Label(eventConfigurationGroup, SWT.NONE);
		labelUpdateOutline.setText("update view on outline selection events: ");
		updateOnOutlineSelectionCheckBox = new Button(eventConfigurationGroup, SWT.CHECK);
		labelUpdateEditor = new Label(eventConfigurationGroup, SWT.NONE);
		labelUpdateEditor.setText("update on editor change event:");
		labelUpdateEditor.setToolTipText("The view will update each time a compatible editor view is selected ");
		updateOnEditorChangeCheckBox = new Button(eventConfigurationGroup, SWT.CHECK);
		labelSelectedNodeColor = new Label(eventConfigurationGroup, SWT.NONE);
		labelSelectedNodeColor.setText("Color for the selected node");
		buttonSelectedNodeColor = new Button(eventConfigurationGroup, SWT.BORDER);
		buttonSelectedNodeColor.setToolTipText(parentConfigurationDialog.selectedNodeColor.toString());
		buttonSelectedNodeColor.setImage(createColorImage(new Color(Display.getCurrent(), parentConfigurationDialog.selectedNodeColor)));
		buttonSelectedNodeColor.setSize(12,12);
		//buttonSelectedNodeColor.setText("Color");
		buttonSelectedNodeColor.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {
		          ColorDialog cd = new ColorDialog(new Shell());
		          cd.setText("Selected node color");
		          cd.setRGB(parentConfigurationDialog.selectedNodeColor);
		          RGB newColor = cd.open();
		          parentConfigurationDialog.selectedNodeColor = newColor;
		          if (newColor == null) {
		            return;
		          }
		          buttonSelectedNodeColor.setBackground(new Color(Display.getCurrent(), newColor));
		          buttonSelectedNodeColor.setImage(createColorImage(new Color(getDisplay(), newColor)));
		  		  buttonSelectedNodeColor.setToolTipText(parentConfigurationDialog.selectedNodeColor.toString());
		        }
		      });
		labelDistantNodeColor = new Label(eventConfigurationGroup, SWT.NONE);
		labelDistantNodeColor.setText("Color for the distant nodes");
		buttonDistantNodeColor = new Button(eventConfigurationGroup, SWT.BORDER);
		buttonDistantNodeColor.setImage(createColorImage(new Color(Display.getCurrent(), parentConfigurationDialog.distantNodesColor)));
		buttonDistantNodeColor.setToolTipText(parentConfigurationDialog.distantNodesColor.toString());
		buttonDistantNodeColor.setSize(12, 12);
		buttonDistantNodeColor.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {
		          ColorDialog cd = new ColorDialog(new Shell());
		          cd.setText("Distant node color");
		          cd.setRGB(parentConfigurationDialog.distantNodesColor);
		          RGB newColor = cd.open();
		          parentConfigurationDialog.distantNodesColor = newColor;
		          if (newColor == null) {
		            return;
		          }
		          buttonDistantNodeColor.setBackground(new Color(getDisplay(), newColor));
		          buttonDistantNodeColor.setImage(createColorImage(new Color(getDisplay(), newColor)));
		          buttonDistantNodeColor.setToolTipText(parentConfigurationDialog.distantNodesColor.toString());
		        }
		      });
		
		buttonDistantNodeColor.setBackground(new Color(this.getDisplay(),27,27,27));
		//buttonDistantNodeColor.setText("Color");
		buttonDistantNodeColor.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
	}

	public void reinitValues()
	{
		buttonSelectedNodeColor.setImage(createColorImage(new Color(Display.getCurrent(), parentConfigurationDialog.selectedNodeColor)));
		buttonDistantNodeColor.setImage(createColorImage(new Color(Display.getCurrent(), parentConfigurationDialog.distantNodesColor)));
		
	}
	private Image createColorImage(Color theColor)
	{
		Display display = Display.getCurrent();
	   // Color red = display.getSystemColor(SWT.COLOR_RED);
	    Color white = display.getSystemColor(SWT.COLOR_WHITE);
	    Color black = display.getSystemColor(SWT.COLOR_BLACK);

	    Image image = new Image(display, 12, 12);
	    GC gc = new GC(image);
	    gc.setBackground(theColor);
	    gc.fillRectangle(0, 0, 12, 12);
	    gc.dispose();
	    ImageData imageData = image.getImageData();

	    PaletteData palette = new PaletteData(new RGB[] { new RGB(0, 0, 0),
	        new RGB(0xFF, 0xFF, 0xFF), });
	    ImageData maskData = new ImageData(12, 12, 1, palette);
	    Image mask = new Image(display, maskData);
	    gc = new GC(mask);
	    gc.setBackground(black);
	    gc.fillRectangle(0, 0, 12, 12);
	    gc.setBackground(white);
	    gc.fillRectangle(0, 0, 12, 12);
	    gc.dispose();
	    maskData = mask.getImageData();

	    return new Image(display, imageData, maskData);
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
		labelPrimitiveTypeCombo = new Label(presentationGroup, SWT.NONE);
		labelPrimitiveTypeCombo.setText("Primitives types");
		createPrimitiveTypesPresentationCombo();
		labelAssociationLinesCombo = new Label(presentationGroup, SWT.NONE);
		labelAssociationLinesCombo.setText("Associations lines");
		createAssociationPresentationCombo();
		labelAssociationEndsCombo = new Label(presentationGroup, SWT.NONE);
		labelAssociationEndsCombo.setText("Associations ends");
		createAssociationEndPresentationCombo();
		labelInheritanceCombo = new Label(presentationGroup, SWT.NONE);
		labelInheritanceCombo.setText("Inheritance");
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
