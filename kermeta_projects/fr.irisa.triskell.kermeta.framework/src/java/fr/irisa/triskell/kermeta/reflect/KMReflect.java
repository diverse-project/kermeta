/* $Id: KMReflect.java,v 1.1 2005-03-21 10:39:47 jpthibau Exp $
* Project : Kermeta (First iteration)
* File : KMReflect.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 mars 2005
* Author : jpthibau
* Description : describe here file content
* TODO :
*     - write here your TODO actions
*  - ...
*/
package fr.irisa.triskell.kermeta.reflect;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import antlr.collections.impl.Vector;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FPackage;

/**
 * @author jpthibau
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class KMReflect {
	
/*	public static String getQualifiedName(FClassDefinition classdef) {
		List names=new ArrayList();
		String result="";
		FPackage container=(FPackage)classdef.eContainer();
		do {
			names.add(container.getFName());
			container=(FPackage)container.eContainer();
		} while (container != null);
		for (int i=names.size()-1;i>=0;i--)
			result=result+names.get(i)+"::";
		result=result+classdef.getFName();
		return result;
	}*/
	public static String getQualifiedName(FNamedElement element) {
	String previousElts="";
	if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
		previousElts=getQualifiedName( (FNamedElement)element.eContainer() ) + "::";
	return previousElts+element.getFName();
	}


	public static List allAttributes(RuntimeObject metaclass) {
		List result=new ArrayList();
//		FClassDefinition classdef=(FClassDefinition)metaclass.getData().get("kcoreObject");
		Hashtable attributes=(Hashtable)metaclass.getProperties().get("FOwnedAttributes");
		Iterator it=attributes.keySet().iterator();
		while (it.hasNext()) {
			result.add(attributes.get((String)it.next()));
		}
		Iterator parentIt = allSuperTypes(metaclass).iterator();
		while (parentIt.hasNext()) {
			attributes=(Hashtable)((RuntimeObject)parentIt.next()).getProperties().get("FOwnedAttributes");
			it=attributes.keySet().iterator();
			while (it.hasNext()) {
				result.add(attributes.get((String)it.next()));
			}
		}
		return result;
	}
	
	public static List allSuperTypes(RuntimeObject mc) {
		FClassDefinition classdef=(FClassDefinition)mc.getData().get("kcoreObject");
		List result=new ArrayList();
		Iterator it=classdef.getFSuperType().iterator();
		while (it.hasNext()) {
			FClass c=(FClass)it.next();
			FClassDefinition parentclassdef=c.getFClassDefinition();
			String parentqualifiedName=KMReflect.getQualifiedName(parentclassdef);
			RuntimeObject metaclass=(RuntimeObject)mc.getFactory().getTypeDefinitionByName(parentqualifiedName);
			if (metaclass==null) System.err.println("parent metaclass not found : "+parentqualifiedName);
			else {
				if (!result.contains(metaclass))
					result.add(metaclass);
				List allParents =allSuperTypes(metaclass);
				Iterator it2=allParents.iterator();
				while (it2.hasNext()) {
					Object parent=it2.next();
					if (!result.contains(parent))
						result.add(parent);
					
				}
			}
		}
		return result;
	}	
	
}
