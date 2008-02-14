/* $Id: KermetaEditorEventListener.java,v 1.2 2008-02-14 07:13:42 uid21732 Exp $
 * Project : fr.irisa.triskell.kermeta.texteditor
 * File : KermetaEditorEventListener.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 9 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package org.kermeta.texteditor;

import java.util.EventListener;


import fr.irisa.triskell.kermeta.language.structure.Object;

//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * Interface that must be implemted to be notified of changes in the Kermeta editor
 *
 */
public interface KermetaEditorEventListener extends EventListener {
	public void unitGotFocus(KermetaTextEditor editor);
	public void selectionChanged();

	public void outlineSelectionChanged(Object fobj);
	public void textHoverCalled(Object fobj);

	public void contentAssistSelectionChanged(Object o);
}
