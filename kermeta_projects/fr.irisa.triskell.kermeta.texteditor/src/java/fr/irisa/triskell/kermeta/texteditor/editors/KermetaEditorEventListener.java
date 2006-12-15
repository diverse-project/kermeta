/* $Id: KermetaEditorEventListener.java,v 1.3 2006-12-15 15:16:23 ftanguy Exp $
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

//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * Interface that must be implemted to be notified of changes in the Kermeta editor
 *
 */
public interface KermetaEditorEventListener extends EventListener {
	public void unitGotFocus(KMTEditor editor);
	public void selectionChanged();

	public void outlineSelectionChanged(fr.irisa.triskell.kermeta.language.structure.Object fobj);
	public void textHoverCalled(fr.irisa.triskell.kermeta.language.structure.Object fobj);
}
