/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser

import fr.irisa.triskell.kermeta.KmPackage
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit
import java.util.HashMap
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

object LoadSaveKM {



  def loadKmModel(uri:String): TreeIterator[EObject] ={
    var rs:ResourceSetImpl  = new ResourceSetImpl();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
    rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    return  rs.getResource(URI.createURI(uri),true).getAllContents();

  }



  def saveKmModel( uri: String, r:Resource ) = {
    var rs :ResourceSetImpl = new ResourceSetImpl();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
    rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    var uri1:URI   = URI.createURI(uri);//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
    r.setURI(uri1);
    r.save(new HashMap());
		
  }

  def saveKmModelingUnit( uri: String, r:ModelingUnit ) = {
    var rs :ResourceSetImpl = new ResourceSetImpl();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
    rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    var uri1:URI   = URI.createURI(uri)
    var res : Resource = rs.createResource(uri1)
    res.getContents.add(r)
    res.save(new HashMap());
  
  }
}
