/*******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.gymnast.runtime.core.ast;

/**
 * @author cjdaly@us.ibm.com
 *
 */
public interface OutlineNode {

	public OutlineNode getOutlineParent();
	
	public boolean hasOutlineChildren();
	public OutlineNode[] getOutlineChildren();

	public String getOutlineText();
	
	public int getOutlineOffset();
	public int getOutlineLength();

}
