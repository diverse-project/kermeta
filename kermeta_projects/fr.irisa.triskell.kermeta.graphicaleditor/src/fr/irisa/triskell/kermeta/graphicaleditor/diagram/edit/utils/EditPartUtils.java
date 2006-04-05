/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : EditPartUtils.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 2, 2006
 * Authors       : zdrey <zoe.drey@irisa.fr>
 * Contributors  : http://www.topcased.org
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.topcased.draw2d.figures.EditableLabel;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.OperationFigure;

/**
 * This class gathers some useful methods related to graphical presentation. 
 *
 */
public class EditPartUtils {
	
	public static Boolean ITALIC_FONT_OK = false;

	public EditPartUtils() {
		super();
	}
	
	/**
	 * 
	 * @param setItalic if set to true, then change the font to italic. otherwise, set 
	 * normal font.
	 * @param wasItalicDefined used to avoid registeric the italic font twice, i.e,
	 * once it is set to true.
	 * @return the font to set on wanted label
	 * TODO : we could add a parameter to set another kind than the ItalicFont
	 */
	public static Font changeFont(Boolean setItalic)
	{
		if (setItalic)
        {
            if (!ITALIC_FONT_OK)
            {
                FontData[] fData = Display.getDefault().getSystemFont().getFontData();
                fData[0].setStyle(SWT.ITALIC);
                JFaceResources.getFontRegistry().put("ItalicFont", fData);
                ITALIC_FONT_OK = true;
            }
            return JFaceResources.getFontRegistry().get("ItalicFont");
        }
        else
        {
        	return Display.getDefault().getSystemFont();
        }
	}
	
	
	public static void changeIcon(Boolean setItalic, OperationFigure op)
	{
		if (setItalic)
        {
            if (!ITALIC_FONT_OK)
            {
                FontData[] fData = Display.getDefault().getSystemFont().getFontData();
                fData[0].setStyle(SWT.ITALIC);
                JFaceResources.getFontRegistry().put("ItalicFont", fData);
                ITALIC_FONT_OK = true;
            }
            ((EditableLabel) op.getLabel()).setIcon(StructureImageRegistry
    				.getImage("OPERATION_ABSTRACT"));
        }
        else
        {
        	((EditableLabel) op.getLabel()).setIcon(StructureImageRegistry
    				.getImage("OPERATION"));
        }
	}

}
