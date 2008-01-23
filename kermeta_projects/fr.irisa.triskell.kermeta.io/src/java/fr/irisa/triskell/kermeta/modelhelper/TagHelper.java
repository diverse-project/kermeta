/* $Id: TagHelper.java,v 1.5 2008-01-23 10:49:48 cfaucher Exp $
 * Project   : Kermeta 
 * File      : TagHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 14 f�vr. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

/**
 * this class proposes various helper functions that applies to Tag in the Kermeta model
 *
 */
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
			element.getOwnedTags().add(newTag); // tag owned by the element
			element.getTag().add(newTag); // the element is tagged
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
		Iterator<Tag> it = element.getTag().iterator();
		while(it.hasNext() && !found){
			Tag retreivedTag = it.next();
			if( (retreivedTag.getName() != null) && retreivedTag.getName().equals(tagname)){
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
		Iterator<Tag> it = element.getTag().iterator();
		// Note: cannot reuse findTagFromName because we cannot garantee that the first tag with 
		// this name will have this value in the case of several tags
		while(it.hasNext() && !found){
			Tag retreivedTag = it.next();
			if ( retreivedTag.getName() != null ) {
				if(retreivedTag.getName().equals(tagname) && retreivedTag.getValue().equals(tagvalue)){
					found = true;
					result = retreivedTag;
				}
			}
		}
		return result;
	}
}
