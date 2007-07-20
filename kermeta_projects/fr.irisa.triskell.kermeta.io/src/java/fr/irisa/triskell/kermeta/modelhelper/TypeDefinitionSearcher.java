

/*$Id: TypeDefinitionSearcher.java,v 1.2 2007-07-20 15:08:10 ftanguy Exp $
* Project : org.kermeta.io
* File : 	TypeDefinitionSearcher.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class TypeDefinitionSearcher {

	static public Set <TypeDefinition> getTypesDefinition(KermetaUnit kermetaUnit) {
		Set <TypeDefinition> set = new HashSet <TypeDefinition> ();
		for ( Package p : (List<Package>) kermetaUnit.getPackages() )
			set.addAll( p.getOwnedTypeDefinition() );
		return set;
	}
	
	static public Set <TypeDefinition> getTypesDefinitionByQualifiedName(KermetaUnit kermetaUnit, String qualifiedName) {
		Set <TypeDefinition> set = new HashSet <TypeDefinition> ();
		set.addAll( getExternalTypesDefinition(kermetaUnit, qualifiedName) );
		set.add( getInternalTypeDefinition(kermetaUnit, qualifiedName) );
		return set;
	}
	
	
	static public TypeDefinition getInternalTypeDefinition(KermetaUnit kermetaUnit, String qualifiedName) {
		
		Iterator <Package> itOnPackages = kermetaUnit.getInternalPackages().iterator();
		while ( itOnPackages.hasNext() ) {
			Package currentPackage = itOnPackages.next();
			Iterator <TypeDefinition> itOnTypeDefinition = currentPackage.getOwnedTypeDefinition().iterator();
			while ( itOnTypeDefinition.hasNext() ) {
				TypeDefinition currentTypeDefinition = itOnTypeDefinition.next();
				String currentQualifiedName = NamedElementHelper.getQualifiedName(currentTypeDefinition);
				if ( qualifiedName.equals( currentQualifiedName ) )
					return currentTypeDefinition;
			}
		}
		
		return null;
		
	}
	
	static public Set <TypeDefinition> getExternalTypesDefinition(KermetaUnit kermetaUnit, String qualifiedName) {
		Set <TypeDefinition> set = new HashSet <TypeDefinition> ();
		Iterator <Package> itOnPackages = kermetaUnit.getExternalPackages().iterator();
		while ( itOnPackages.hasNext() ) {
			Package currentPackage = itOnPackages.next();
			Iterator <TypeDefinition> itOnTypeDefinition = currentPackage.getOwnedTypeDefinition().iterator();
			while ( itOnTypeDefinition.hasNext() ) {
				TypeDefinition currentTypeDefinition = itOnTypeDefinition.next();
				String currentQualifiedName = NamedElementHelper.getQualifiedName(currentTypeDefinition);
				if ( qualifiedName.equals( currentQualifiedName ) )
					set.add( currentTypeDefinition );
			}
		}
		return set;
	}
	
	static public Set <TypeDefinition> getInternalTypesDefinition(KermetaUnit kermetaUnit) {
		Set <TypeDefinition> set = new HashSet <TypeDefinition> ();
		Iterator <Package> itOnPackages = kermetaUnit.getInternalPackages().iterator();
		while ( itOnPackages.hasNext() ) {
			Package currentPackage = itOnPackages.next();
			set.addAll( currentPackage.getOwnedTypeDefinition() );
		}
		return set;
	}
	
	static public Set <TypeDefinition> getExternalTypesDefinition(KermetaUnit kermetaUnit) {
		Set <TypeDefinition> set = new HashSet <TypeDefinition> ();
		Iterator <Package> itOnPackages = kermetaUnit.getExternalPackages().iterator();
		while ( itOnPackages.hasNext() ) {
			Package currentPackage = itOnPackages.next();
			set.addAll( currentPackage.getOwnedTypeDefinition() );
		}
		return set;
	}
	
}


