/* $Id: KermetaEditorEventListener.java,v 1.1 2005-11-11 07:13:15 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.texteditor
 * File : KermetaEditorEventListener.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 9 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.EventListener;

import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * Interface that must be implemted to be notified of changes in the Kermeta editor
 *
 */
public interface KermetaEditorEventListener extends EventListener {
	public void unitGotFocus(Editor editor);
	public void selectionChanged();

	public void outlineSelectionChanged(FObject fobj);
	public void textHoverCalled(FObject fobj);
}
