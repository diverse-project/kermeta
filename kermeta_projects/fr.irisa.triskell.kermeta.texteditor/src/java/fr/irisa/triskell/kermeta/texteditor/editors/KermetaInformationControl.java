/* $Id: KermetaInformationControl.java,v 1.4 2007-06-27 14:43:05 cfaucher Exp $
* Project : Kermeta (First iteration)
* File : KermetaInformationControl.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 apr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlExtension;
import org.eclipse.jface.text.IInformationControlExtension2;
import org.eclipse.jface.text.IInformationControlExtension3;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;

/**
 * @author Franck Fleurey
 */
public class KermetaInformationControl implements IInformationControl, IInformationControlExtension, IInformationControlExtension2,IInformationControlExtension3,  DisposeListener {
    
	/** Border thickness in pixels. */
	private static final int BORDER= 1;
	
	/** The control's shell */
	private Shell fShell;
	/** The control's text widget */
	private StyledText fText;
	/** The information presenter */
	//private IInformationPresenter fPresenter;
	/** A cached text presentation */
	private TextPresentation fPresentation = new TextPresentation();
	/** The control width constraint */
	private int fMaxWidth= -1;
	/** The control height constraint */
	private int fMaxHeight= -1;
	/**
	 * The font of the optional status text label.
	 * 
	 * @since 3.0
	 */
	private Font fStatusTextFont;
    
    /**
     * @param parent
     */
    public KermetaInformationControl(Shell parent) {
        
        int shellStyle = SWT.NO_TRIM;
       // int style = SWT.NONE;
        
        //String statusFieldText = null;
        
        GridLayout layout;
		GridData gd;

		fShell= new Shell(parent, SWT.NO_FOCUS | SWT.ON_TOP | shellStyle);
		Display display= fShell.getDisplay();
		fShell.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
		
		Composite composite= fShell;
		//composite.set
		layout= new GridLayout(1, false);
		int border= 1; 
		layout.marginHeight= border;
		layout.marginWidth= border;
		composite.setLayout(layout);
		
		Composite panel = new Composite( composite, SWT.NONE);
		gd= new GridData(GridData.CENTER | GridData.FILL_BOTH);
		panel.setLayoutData(gd);
		panel.setForeground(display.getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		panel.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		layout= new GridLayout(2, false);
		panel.setLayout(layout);
		
		//composite.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		//gd= new GridData(GridData.FILL_BOTH);
		//composite.setLayoutData(gd);
/*
		if (statusFieldText != null) {
			composite= new Composite(composite, SWT.NONE);
			layout= new GridLayout(1, false);
			layout.marginHeight= 0;
			layout.marginWidth= 0;
			composite.setLayout(layout);
			gd= new GridData(GridData.FILL_BOTH);
			composite.setLayoutData(gd);
			composite.setForeground(display.getSystemColor(SWT.COLOR_INFO_FOREGROUND));
			composite.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		}		
*/
		// Button
		Label icon = new Label(panel, SWT.CENTER);
		gd= new GridData(GridData.BEGINNING);
		icon.setLayoutData(gd);
		icon.setImage(KermetaSpecialIcons.KERMETA_LOGO);
		
		// Text field
		fText= new StyledText(panel, SWT.MULTI | SWT.READ_ONLY);
		gd= new GridData(GridData.END | GridData.FILL_BOTH);
		fText.setLayoutData(gd);
		fText.setForeground(display.getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		fText.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		fText.setWordWrap(true);
		fText.addKeyListener(new KeyListener() {
			
			public void keyPressed(KeyEvent e)  {
				if (e.character == 0x1B) // ESC
					fShell.dispose();
			}
			
			public void keyReleased(KeyEvent e) {}
		});
		
		//fPresenter= presenter;

		/*/ Status field
		if (statusFieldText != null) {

			// Horizontal separator line
			Label separator= new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL | SWT.LINE_DOT);
			separator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			// Status field label
			Label statusField= new Label(composite, SWT.RIGHT);
			statusField.setText(statusFieldText);
			Font font= statusField.getFont();
			FontData[] fontDatas= font.getFontData();
			for (int i= 0; i < fontDatas.length; i++)
				fontDatas[i].setHeight(fontDatas[i].getHeight() * 9 / 10);
			fStatusTextFont= new Font(statusField.getDisplay(), fontDatas);
			statusField.setFont(fStatusTextFont);
			gd= new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING);
			statusField.setLayoutData(gd);

			statusField.setForeground(display.getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW));

			statusField.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		}
		*/
		addDisposeListener(this);
    }
    
    
    
    /**
     * Replaces the method setInformation
     */
    public void setInput(Object input) {
        String toDisplay = ""+input;
        fText.setText(toDisplay);
        /*
        if (fPresenter == null) {
			fText.setText(input.toString());
		} else {
			fPresentation.clear();
			//content= fPresenter.updatePresentation(fShell.getDisplay(), content, fPresentation, fMaxWidth, fMaxHeight);
			if (input != null) {
				fText.setText(input.toString());
				TextPresentation.applyTextPresentation(fPresentation, fText);
			} else {
				fText.setText(""); //$NON-NLS-1$
			}
		}
		*/
    }
    
	/*
	 * @see IInformationControl#setInformation(String)
	 */
	public void setInformation(String content) {
		// NOTHING
	}
	
	/*
	 * @see IInformationControl#setVisible(boolean)
	 */
	public void setVisible(boolean visible) {
	    	if (visible) fShell.pack();
			fShell.setVisible(visible);
	}
	
	/*
	 * @see IInformationControl#dispose()
	 */
	public void dispose() {
		if (fShell != null && !fShell.isDisposed())
			fShell.dispose();
		else
			widgetDisposed(null);
	}

	/*
	 * @see org.eclipse.swt.events.DisposeListener#widgetDisposed(org.eclipse.swt.events.DisposeEvent)
	 * @since 3.0
	 */
	public void widgetDisposed(DisposeEvent event) {
		if (fStatusTextFont != null && !fStatusTextFont.isDisposed())
			fStatusTextFont.dispose();
		
		fShell= null;
		fText= null;
		fStatusTextFont= null;
	}

	/*
	 * @see IInformationControl#setSize(int, int)
	 */
	public void setSize(int width, int height) {
		fShell.setSize(width, height);
	}
	
	/*
	 * @see IInformationControl#setLocation(Point)
	 */
	public void setLocation(Point location) {
		Rectangle trim= fShell.computeTrim(0, 0, 0, 0);
		Point textLocation= fText.getLocation();				
		location.x += trim.x - textLocation.x;		
		location.y += trim.y - textLocation.y;		
		fShell.setLocation(location);		
	}
	
	/*
	 * @see IInformationControl#setSizeConstraints(int, int)
	 */
	public void setSizeConstraints(int maxWidth, int maxHeight) {
		fMaxWidth= maxWidth;
		fMaxHeight= maxHeight;
	}
	
	/*
	 * @see IInformationControl#computeSizeHint()
	 */
	public Point computeSizeHint() {
		return fShell.computeSize(SWT.DEFAULT, SWT.DEFAULT);
	}

	/*
	 * @see org.eclipse.jface.text.IInformationControlExtension3#computeTrim()
	 * @since 3.0
	 */
	public Rectangle computeTrim() {
		return fShell.computeTrim(0, 0, 0, 0);
	}
	
	/*
	 * @see org.eclipse.jface.text.IInformationControlExtension3#getBounds()
	 * @since 3.0
	 */
	public Rectangle getBounds() {
		return fShell.getBounds();
	}
	
	/*
	 * @see org.eclipse.jface.text.IInformationControlExtension3#restoresLocation()
	 * @since 3.0
	 */
	public boolean restoresLocation() {
		return false;
	}
	
	/*
	 * @see org.eclipse.jface.text.IInformationControlExtension3#restoresSize()
	 * @since 3.0
	 */
	public boolean restoresSize() {
		return false;
	}
    
    /*
	 * @see IInformationControl#addDisposeListener(DisposeListener)
	 */
	public void addDisposeListener(DisposeListener listener) {
		fShell.addDisposeListener(listener);
	}
	
	/*
	 * @see IInformationControl#removeDisposeListener(DisposeListener)
	 */
	public void removeDisposeListener(DisposeListener listener) {
		fShell.removeDisposeListener(listener);
	}
	
	/*
	 * @see IInformationControl#setForegroundColor(Color)
	 */
	public void setForegroundColor(Color foreground) {
		fText.setForeground(foreground);
	}
	
	/*
	 * @see IInformationControl#setBackgroundColor(Color)
	 */
	public void setBackgroundColor(Color background) {
		fText.setBackground(background);
	}
	
	/*
	 * @see IInformationControl#isFocusControl()
	 */
	public boolean isFocusControl() {
		return fText.isFocusControl();
	}
	
	/*
	 * @see IInformationControl#setFocus()
	 */
	public void setFocus() {
		fShell.forceFocus();
		fText.setFocus();
	}
	
	/*
	 * @see IInformationControl#addFocusListener(FocusListener)
	 */
	public void addFocusListener(FocusListener listener) {
		fText.addFocusListener(listener);
	}
	
	/*
	 * @see IInformationControl#removeFocusListener(FocusListener)
	 */
	public void removeFocusListener(FocusListener listener) {
		fText.removeFocusListener(listener);
	}
	
	/*
	 * @see IInformationControlExtension#hasContents()
	 */
	public boolean hasContents() {
		return fText.getCharCount() > 0;
	}
    
	

}
