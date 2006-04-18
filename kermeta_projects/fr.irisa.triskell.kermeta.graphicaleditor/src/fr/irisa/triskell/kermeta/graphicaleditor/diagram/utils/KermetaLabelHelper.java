/* $Id: KermetaLabelHelper.java,v 1.1 2006-04-18 12:32:37 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : KermetaLabelHelper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 18, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 * /*******************************************************************************
	 * Copyright (c) 2005 AIRBUS FRANCE.
	 * All rights reserved. This program and the accompanying materials
	 * are made available under the terms of the Eclipse Public License v1.0
	 * which accompanies this distribution, and is available at
	 * http://www.eclipse.org/legal/epl-v10.html
	 *
	 * Contributors:
	 *    David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
	 *    Jacques Lescot (Anyware Technologies) - initial API and implementation
	 ******************************************************************************
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils;

import org.topcased.modeler.utils.LabelHelper;
import org.topcased.modeler.utils.Utils;

import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.editor.MixedEditDomain;
import org.topcased.modeler.extensions.DiagramDescriptor;
import org.topcased.modeler.extensions.DiagramsManager;
import org.topcased.modeler.providers.ILabelFeatureProvider;

import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Property;


/**
 * Javadoc from @link org.topcased.modeler.utils.LabelHelper
 * This helper class is used to get the name of an EObject for a given
 * EditDomain. The class provides also utilities to find an available name to
 * give to the newly created EObject.
 * 
 * Created 2 juin 2005
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 * 
 */
public class KermetaLabelHelper extends LabelHelper {
	
	/**
	 * The Constructor
	 */
	public KermetaLabelHelper()
	{
		super();
	}
	
	/**
	 * This returns a name to give to the new EObject
	 * 
	 * @param editDomain the EditDomain
	 * @param parentEObject the parent EObject
	 * @param childEObject the new EObject to add
	 * @return the text for the LabelFeature
	 * @see LabelHelper#findName(org.eclipse.gef.EditDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	public String findName(EditDomain editDomain, EObject parentEObject, EObject childEObject)
	{
		String result = "";
		int cpt = 1;
		while (!isNameAvailable(editDomain, parentEObject, childEObject, cpt))
		{
			// isNameAvailable(editDomain, parentEObject, childEObject, cpt++);
			cpt++;
		}
		if (childEObject instanceof Property)
			result = KermetaUtils.getDefault().getLabelForType(((Property)childEObject).getType()).toLowerCase();
		else
			result = childEObject.eClass().getName().toLowerCase();
		return result + cpt;
	}
	
	/**
	 * Check if a name is available
	 * (this method is identical to its super method -> was private, so we have to redefine it)
	 * @param editDomain the EditDomain
	 * @param parentEObject the parent EObject
	 * @param childEObject the new EObject to add
	 * @param currentCpt the current cpt
	 * @return true if the name is available
	 * @see LabelHelper#isNameAvailable(org.eclipse.gef.EditDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, int)
	 */
	protected boolean isNameAvailable(EditDomain editDomain, EObject parentEObject, EObject childEObject, int currentCpt)
	{
		TreeIterator it = parentEObject.eAllContents();
		while (it.hasNext())
		{
			EObject child = (EObject) it.next();
			// check if the current child is the same type of the childEObject
			// test was : childEObject.eClass().getName().equals(child.eClass().getName())
			if (getDisplayName(child).equals(getDisplayName(childEObject)))
			{
				String nameToMatch = "";
				//String nameToMatch = child.eClass().getName() + currentCpt;
				if (childEObject instanceof Property)
					nameToMatch = KermetaUtils.getDefault().getLabelForType(((Property)childEObject).getType()).toLowerCase() + currentCpt;
				else
					nameToMatch = child.eClass().getName() + currentCpt;
				if (nameToMatch.equals(getName(editDomain, child)))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Get the displayed name of the given EObject
	 */
	protected String getDisplayName(EObject eObject)
	{
		String result = "";
		if (eObject instanceof Property)
			result = KermetaUtils.getDefault().getLabelForType(((Property)eObject).getType()).toLowerCase() ;
		else
			result = eObject.eClass().getName();
		return result;
			
	}
}
