/*$Id: FindAction.java,v 1.1 2007-02-28 09:41:57 cfaucher Exp $*/
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
	
	public FindAction(IEditorPart editor) {
		this.editor = editor;
	}
	
	public void run() {
		FindPlugin.getDefault().openFindDialog(editor);
	}
}
