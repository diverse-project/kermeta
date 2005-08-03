/* $Id: IKermetaEditorActionDefinitionIds.java,v 1.1 2005-08-03 07:51:17 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : IKermetaEditorActionDefinitionIds.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 29, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.texteditor.actions;

import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;

/**
 * This is a clone of IJavaEditorActionDefinitionIds to handle actions that can be 
 * made inside an editor
 */
public interface IKermetaEditorActionDefinitionIds extends ITextEditorActionDefinitionIds 
{
    
	/**
	 * Action definition ID of the edit -> show Kermetadoc action
	 * (value <code>"fr.irisa.triskell.kermeta.texteditors.showkermetadoc"</code>).
	 */
	public static final String SHOW_KDOC= "fr.irisa.triskell.kermeta.texteditors.showkermetadoc"; //$NON-NLS-1$
	
	
	


}
