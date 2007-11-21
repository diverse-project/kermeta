

/*$Id: KermetaModelHelper.java,v 1.1 2007-11-21 13:14:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	KermetaModelHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.model;

import org.kermeta.model.internal.PrimitiveTypeHelper;

import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;

public class KermetaModelHelper {
	
	final static public NamedElementProxy NamedElement = new NamedElementProxy();
	
	static public class NamedElementProxy {
		
		/**
		 * 
		 * @see NamedElementHelper#qualifiedName(NamedElement)
		 * 
		 */
		public String qualifiedName(NamedElement element) {
			return NamedElementHelper.qualifiedName(element);
		}
		
		/**
		 * 
		 * @see NamedElementHelper#qualifiedName(NamedElement, String)
		 * 
		 */
		public String qualifiedName(NamedElement element, String separator) {
			return NamedElementHelper.qualifiedName(element, separator);
		}
		
	}
	
	
	final static public PrimitiveTypeProxy PrimitiveType = new PrimitiveTypeProxy();
	
	static public class PrimitiveTypeProxy extends NamedElementHelper {

		/**
		 *
		 * @see PrimitiveTypeHelper#create(String)
		 * 
		 */
		public PrimitiveType create(String name) {
			return PrimitiveTypeHelper.create(name);
		}
		
		/**
		 *
		 * @see PrimitiveTypeHelper#create(String, Type)
		 * 
		 */
		public PrimitiveType create(String name, Type type) {
			return PrimitiveTypeHelper.create(name, type);
		}
	}
	
	
	final static public PackageProxy Package = new PackageProxy();
	
	static public class PackageProxy  extends NamedElementProxy {
		
		public Package create(String name) {
			return PackageHelper.create(name);
		}
		
		public Package create(String name, String uri) {
			return PackageHelper.create(name, uri);
		}
		
	}
}


