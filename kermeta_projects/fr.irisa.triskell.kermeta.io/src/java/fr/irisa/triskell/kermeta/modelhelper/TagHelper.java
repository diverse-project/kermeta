/* $Id: TagHelper.java,v 1.1 2007-02-15 13:53:50 dvojtise Exp $
 * Project   : Kermeta 
 * File      : TagHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 14 févr. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

public class TagHelper {
	/** create a tag if it doesn't already exist
	 * 
	 * @return the created tag, null if it already exist
	 */
	public static Tag createNonExistingTagFromNameAndValue(fr.irisa.triskell.kermeta.language.structure.Object element, String tagname, String tagvalue ){
		
		Tag existingTag = findTagFromNameAndValue(element, tagname, tagvalue);
		if(existingTag == null){
			Tag newTag =  StructurePackageImpl.init().getStructureFactory().createTag();
			newTag.setName(tagname);
			newTag.setValue(tagvalue);
			element.getTag().add(newTag);
			return newTag;
		}
		else return null;
	}
	/**
	 * retreives a tag on the element with the given name
	 * if there is more than one tag with this name, it will return the first
	 * @param element
	 * @param tagname
	 * @return the retreived tag or null
	 */	
	public static Tag findTagFromName(fr.irisa.triskell.kermeta.language.structure.Object element, String tagname){
		Tag result = null;
		boolean found = false;
		Iterator it = element.getTag().iterator();
		while(it.hasNext() && !found){
			Tag retreivedTag = (Tag)it.next();
			if(retreivedTag.getName().equals(tagname)){
				found = true;
				result = retreivedTag;
			}
		}
		return result;
	}
	/**
	 * retreives the first tag on the element with both name and value
	 * @param element
	 * @param tagname
	 * @param tagvalue
	 * @return the retreived tag or null
	 */
	public static Tag findTagFromNameAndValue(fr.irisa.triskell.kermeta.language.structure.Object element, String tagname, String tagvalue){
		Tag result = null;
		boolean found = false;
		Iterator it = element.getTag().iterator();
		// Note: cannot reuse findTagFromName because we cannot garantee that the first tag with 
		// this name will have this value in the case of several tags
		while(it.hasNext() && !found){
			Tag retreivedTag = (Tag)it.next();
			if(retreivedTag.getName().equals(tagname) && retreivedTag.getValue().equals(tagvalue)){
				found = true;
				result = retreivedTag;
			}
		}
		return result;
	}
}
