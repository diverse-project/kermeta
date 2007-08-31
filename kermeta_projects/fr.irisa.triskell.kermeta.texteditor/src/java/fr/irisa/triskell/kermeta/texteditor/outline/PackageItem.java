

/*$Id: PackageItem.java,v 1.4 2007-08-31 13:30:23 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	PackageItem.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 juil. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.red.KermetaIconsRed;

public class PackageItem  implements Comparable<PackageItem> {

	private String name = "";
	
	private HashMap<String, OutlineItem> typeDefinitions = new HashMap<String, OutlineItem> ();
	
	private int addingCounter = 0;
	
	private boolean isMerged = false;
	
	private boolean isLocal = false;
	
	private KermetaOutline outline = null;
	
	public PackageItem(String name, boolean isLoacal, KermetaOutline outline) {
		this.name = name;
		this.isLocal = isLoacal;
		this.outline = outline;
	}
	
	public String getName() {
		return name;
	}
	
	public Image getImage() {
	    
	    if (typeDefinitions.size() == 0)
	        return KermetaSpecialIcons.PACKAGE_GRAY;
	    
	    if ( isMerged )
	    	return KermetaSpecialIcons.PACKAGE_BLUE_RED;
	    
	    if ( isLocal )
	    	return KermetaIconsRed.PACKAGE;
	    else
	    	return KermetaIconsBlue.PACKAGE;

	}
	
	public void addAllTypeDefinitions(List<TypeDefinition> value) {
		addingCounter++;
		if ( addingCounter > 1 )
			isMerged = true;
		for ( TypeDefinition typeDefinition : value ) {
			OutlineItem item = new OutlineItem(typeDefinition, this, outline);
			typeDefinitions.put( typeDefinition.getName(), item );
		}
	}
	
	public Collection<OutlineItem> getTypeDefinitions() {
		if ( outline.prefSortedOutline() ) {
			List <OutlineItem> list = new ArrayList <OutlineItem> ();
			list.addAll( typeDefinitions.values() );
			Collections.sort( list );
			return list;
		}
		return typeDefinitions.values();
	}

	public int compareTo(PackageItem o) {
		if ( o instanceof PackageItem )
			return getName().compareTo( ((PackageItem) o).getName() );
		return 0;
	}

}


