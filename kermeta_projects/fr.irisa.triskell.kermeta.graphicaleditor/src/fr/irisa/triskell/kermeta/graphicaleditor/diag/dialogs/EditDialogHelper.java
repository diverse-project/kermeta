/* $Id: EditDialogHelper.java,v 1.1 2006-10-04 08:37:17 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : EditDialogHelper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : May 18, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diag.dialogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * This class contains userful common methods for the edit dialogs, so that they can share them from here.
 * @author zdrey
 *
 */
public class EditDialogHelper {
	
	List<Type> sortedTypes;
	List<String> sortedTypeNames;

	public EditDialogHelper(ClassDefinition classdef)
	{
		initializeTypesAndTypeNames(classdef);
	}
	
	/**
	 * Return an array with 2 objects : first one is of type List<Type>, second one
	 * is of type List<String>
	 * @param classdef
	 * @return
	 */
	public void initializeTypesAndTypeNames(ClassDefinition classdef)
	{
		List<Type> typelist = KermetaUtils.getDefault().getOwnedTypes(classdef);
		Hashtable<String, Type> result = new Hashtable<String, Type>();
		// Construct a hashtable
		for (Type type : typelist) {
			result.put(KermetaUtils.getDefault().getLabelForType(type), type);
		}
		//return getNamesOfTypes(initializeTypes(classdef));
		String[] keyArray = result.keySet().toArray(new String[result.size()]); 
		Arrays.sort(keyArray);
		
		// Sort the list of Types
		sortedTypes = new ArrayList<Type>();
		sortedTypeNames = new ArrayList<String>();
		for (String string : keyArray) {
			sortedTypes.add(result.get(string));
			sortedTypeNames.add(string);
		}
	}

	/**
	 * @return Returns the sortedTypeNames.
	 */
	public List<String> getSortedTypeNames() {
		return sortedTypeNames;
	}

	/**
	 * @return Returns the sortedTypes.
	 */
	public List<Type> getSortedTypes() {
		return sortedTypes;
	}
	


}
