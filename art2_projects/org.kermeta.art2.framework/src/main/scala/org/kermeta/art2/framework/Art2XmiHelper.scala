/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2.Art2Package
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.kermeta.art2.ContainerRoot
import java.util.HashMap
import org.eclipse.emf.common.util.URI

object Art2XmiHelper {
  def save(uri:String,root : ContainerRoot) = {
    var rs :ResourceSetImpl = new ResourceSetImpl();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
    rs.getPackageRegistry().put(Art2Package.eNS_URI, Art2Package.eINSTANCE);
    var uri1:URI   = URI.createURI(uri)
    var res : Resource = rs.createResource(uri1)
    res.getContents.add(root)
    res.save(new HashMap());
  }

  def load(uri:String) : ContainerRoot = {
        var rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        rs.getPackageRegistry().put(Art2Package.eNS_URI, Art2Package.eINSTANCE);
        return rs.getResource(URI.createURI(uri), true).getContents().get(0).asInstanceOf[ContainerRoot];
  }

}
