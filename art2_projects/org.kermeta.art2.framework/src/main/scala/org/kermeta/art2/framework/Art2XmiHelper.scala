/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import art2.Art2Package
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.util.HashMap
import org.eclipse.emf.common.util.URI

object Art2XmiHelper {
  def save(uri:String,root : art2.ContainerRoot) = {
    var rs :ResourceSetImpl = new ResourceSetImpl();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
    rs.getPackageRegistry().put(art2.Art2Package.eNS_URI, art2.Art2Package.eINSTANCE);
    var uri1:URI   = URI.createURI(uri)
    var res : Resource = rs.createResource(uri1)
    res.getContents.add(root)
    res.save(new HashMap());
  }

}
