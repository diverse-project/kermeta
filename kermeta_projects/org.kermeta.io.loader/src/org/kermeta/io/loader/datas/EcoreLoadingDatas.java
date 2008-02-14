

/*$Id: EcoreLoadingDatas.java,v 1.2 2008-02-14 07:12:49 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	EcoreLoadingDatas.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.datas;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMDatas;


public class EcoreLoadingDatas extends LoadingDatas {
	
	public EList<EObject> contents = new BasicEList<EObject>();
	
	public Ecore2KMDatas ecore2kmDatas = new Ecore2KMDatas();
	
	public Hashtable<Operation, ArrayList<Operation>> opTable;
}


