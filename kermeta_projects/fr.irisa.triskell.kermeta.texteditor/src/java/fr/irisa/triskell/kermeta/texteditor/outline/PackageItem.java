

/*$Id: PackageItem.java,v 1.9 2008-06-10 11:41:25 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	PackageItem.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 juil. 07
* Authors : 
*		Francois Tanguy
*		Didier vojtisek
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.red.KermetaIconsRed;

/**
 * 
 * Item that represent a Package in Kermeta Outline
 *
 */
public class PackageItem  implements Comparable<PackageItem> {

	private String name = "";
	
	private HashMap<String, ModelElementOutlineItem> typeDefinitions = new HashMap<String, ModelElementOutlineItem> ();
	
	private int addingCounter = 0;
	
	//private boolean isMerged = false;
	
	private boolean isLocal = false;
	
	private KermetaOutline outline = null;
	
	/**
	 * Set of the Model elemnt package that constitute this PackageItem in the outline
	 */
	protected Set<Package> packageParts = new HashSet<Package>();
	public Package initialPackage = null;
	
	public PackageItem(String name, boolean isLocal, KermetaOutline outline, Package initialPackage) {
		this.name = name;
		this.isLocal = isLocal;
		this.outline = outline;
		packageParts.add(initialPackage);
		this.initialPackage = initialPackage;
	}
	
	public String getName() {
		return name;
	}
	
	public Image getImage() {
	    
	    if (typeDefinitions.size() == 0)
	        return KermetaSpecialIcons.PACKAGE_GRAY;
	    
	    if ( isPartiallyImported() )
	    	return KermetaSpecialIcons.PACKAGE_BLUE_RED;
	    
	    if ( isLocal )
	    	return KermetaIconsRed.PACKAGE;
	    else
	    	return KermetaIconsBlue.PACKAGE;

	}
	
    /**
     * returns true if it contains at least one imported typedefinition and one local typeDefintion 
     * @return
     */
    public boolean isPartiallyImported(){
    	
    	boolean hasLocal = false;
    	boolean hasImported = false;        
        
        for( ModelElementOutlineItem tdMEOI : getTypeDefinitions()){        
	        boolean isTDImported = tdMEOI.isTypeDefinitionImported();
	        if (isTDImported) hasImported = true;
	        else hasLocal = true;      
	        if (hasLocal && hasImported) break;    
        }
        return hasLocal && hasImported;
    }
    
	public void addAllTypeDefinitions(List<TypeDefinition> value) {
		addingCounter++;
		//if ( addingCounter > 1 )
		//	isMerged = true;
		for ( TypeDefinition typeDefinition : value ) {
			ModelElementOutlineItem item = new ModelElementOutlineItem(typeDefinition, this, outline);
			typeDefinitions.put( typeDefinition.getName(), item );		
		}
	}
	
	public Collection<ModelElementOutlineItem> getTypeDefinitions() {
		if ( outline.prefSortedOutline() ) {
			List <ModelElementOutlineItem> list = new ArrayList <ModelElementOutlineItem> ();
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

	public Set<Package> getPackageParts() {
		return packageParts;
	}

	public boolean isErroneous() {
		return outline.isErroneous( initialPackage );
	}
	
	public boolean isWarned() {
		return outline.isWarned( initialPackage );
	}
	
}


