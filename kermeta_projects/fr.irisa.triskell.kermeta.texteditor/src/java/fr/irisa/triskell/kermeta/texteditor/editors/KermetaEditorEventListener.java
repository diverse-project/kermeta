/* $Id: KermetaEditorEventListener.java,v 1.4 2007-12-17 14:05:06 ftanguy Exp $
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

import fr.irisa.triskell.kermeta.language.structure.Object;

//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * Interface that must be implemted to be notified of changes in the Kermeta editor
 *
 */
public interface KermetaEditorEventListener extends EventListener {
	public void unitGotFocus(KMTEditor editor);
	public void selectionChanged();

	public void outlineSelectionChanged(Object fobj);
	public void textHoverCalled(Object fobj);

	public void contentAssistSelectionChanged(Object o);
}
