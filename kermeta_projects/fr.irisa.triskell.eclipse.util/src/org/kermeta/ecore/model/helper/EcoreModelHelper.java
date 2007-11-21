

/*$Id: EcoreModelHelper.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EcoreHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.ecore.model.helper;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.kermeta.ecore.internal.model.helper.EAnnotationHelper;
import org.kermeta.ecore.internal.model.helper.EDataTypeHelper;
import org.kermeta.ecore.internal.model.helper.EEnumHelper;
import org.kermeta.ecore.internal.model.helper.EEnumLiteralHelper;
import org.kermeta.ecore.internal.model.helper.EModelElementHelper;
import org.kermeta.ecore.internal.model.helper.EPackageHelper;

public class EcoreModelHelper {

	final static public EDataTypeProxy EDataType = new EDataTypeProxy();
		
	static public class EDataTypeProxy {
		
		/**
		 * 
		 * @see EDataTypeHelper#create(String)
		 * 
		 */
		public EDataType create(String name) {
			return EDataTypeHelper.create(name);
		}
		
		/**
		 * 
		 * @see EDataTypeHelper#create(String, String)
		 * 
		 */
		public EDataType create(String name, String instanceClassName) {
			return EDataTypeHelper.create(name, instanceClassName);
		}
		
		/**
		 * 
		 * @see EDataTypeHelper#create(String, String, Boolean)
		 * 
		 */
		static public EDataType create(String name, String instanceClassName, Boolean isSerializable) {
			return EDataTypeHelper.create(name, instanceClassName, isSerializable);
		}
			
	}
	
	
	final static public EEnumProxy EEnum = new EEnumProxy();
	
	static public class EEnumProxy {
		
		/**
		 * 
		 * @see EEnumHelper#create(String)
		 * 
		 */
		public EEnum create(String name) {
			return EEnumHelper.create(name);
		}
		
		/**
		 * 
		 * @see EEnumHelper#create(String, String)
		 * 
		 */
		public EEnum create(String name, String instanceClassName) {
			return EEnumHelper.create(name, instanceClassName);
		}
		
		/**
		 * 
		 * @see EEnumHelper#create(String, Boolean)
		 * 
		 */
		public EEnum create(String name, Boolean isSerializable) {
			return EEnumHelper.create(name, isSerializable);
		}
		
		/**
		 * 
		 * @see EEnumHelper#create(String, String, Boolean)
		 * 
		 */
		static public EEnum create(String name, String instanceClassName, Boolean isSerializable) {
			return EEnumHelper.create(name, instanceClassName, isSerializable);
		}
		
	}
	
	
	final static public EEnumLiteralProxy EEnumLiteral = new EEnumLiteralProxy();
	
	static public class EEnumLiteralProxy {
		
		/**
		 * 
		 * @see EEnumLiteralHelper#create(String, Boolean)
		 * 
		 */
		public EEnumLiteral create(String name, int value) {
			return EEnumLiteralHelper.create(name, value);
		}
	
		/**
		 * 
		 * @see EEnumLiteralHelper#create(String, Boolean)
		 * 
		 */
		public EEnumLiteral create(String name, String value) {
			return EEnumLiteralHelper.create(name, value);
		}

	}
	
	
	final static public EAnnotationProxy EAnnotation = new EAnnotationProxy();
	
	static public class EAnnotationProxy {
		
		/**
		 * 
		 * @see EAnnotationHelper#create(String)
		 * 
		 */
		public EAnnotation create(String source) {
			return EAnnotationHelper.create(source);
		}

		/**
		 * 
		 * @see EAnnotationHelper#addDetails(EAnnotation, String, String)
		 * 
		 */
		public void addDetails(EAnnotation annotation, String key, String value) {
			EAnnotationHelper.addDetails(annotation, key, value);
		}
	}
	
	
	final static public EModelElementProxy EModelElement = new EModelElementProxy();
	
	static public class EModelElementProxy {
		
		/**
		 * 
		 * @see EModelElementHelper#getEAnnotation(EModelElement, String)
		 * 
		 */
		public EAnnotation getEAnnotation(EModelElement element, String source) {
			return EModelElementHelper.getEAnnotation(element, source);
		}
		
		/**
		 * 
		 * @see EModelElementHelper#getEAnnotation(EModelElement, String, boolean)
		 * 
		 */
		public EAnnotation getEAnnotation(EModelElement element, String source, boolean create) {
			return EModelElementHelper.getEAnnotation(element, source, create);
		}
		
	}
	
	
	final static public EPackageProxy EPackage = new EPackageProxy();
	
	static public class EPackageProxy {
		
		/**
		 * 
		 * @see EPackageHelper#create(String)
		 * 
		 */
		public EPackage create(String name) {
			return EPackageHelper.create(name);
		}
		
		/**
		 * 
		 * @see EPackageHelper#create(String, String, String)
		 * 
		 */
		public EPackage create(String name, String nsURI, String nsPrefix) {
			return EPackageHelper.create(name, nsURI, nsPrefix);
		}
		
	}
}


