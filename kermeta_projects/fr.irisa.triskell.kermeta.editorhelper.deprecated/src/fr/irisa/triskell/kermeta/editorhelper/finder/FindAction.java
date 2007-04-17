/*$Id: FindAction.java,v 1.3 2007-04-17 07:55:44 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

/*******************************************************************************
 * Copyright (c) 2007 Ecliptical Software Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ecliptical Software Inc. - initial API and implementation
 *     http://www.eclipticalsoftware.com - http://www.eclipticalsoftware.com/emf/
 *******************************************************************************/
package fr.irisa.triskell.kermeta.editorhelper.finder;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;

public class FindAction extends Action {
	
	private final IEditorPart editor;
	
	// Added for Kermeta
	private final String editorID;
	
	public FindAction(IEditorPart editor, String editorID) {
		this.editor = editor;
		this.editorID = editorID;
	}
	
	public void run() {
		FindPlugin.getDefault().openFindDialog(editor, editorID);
	}
}
