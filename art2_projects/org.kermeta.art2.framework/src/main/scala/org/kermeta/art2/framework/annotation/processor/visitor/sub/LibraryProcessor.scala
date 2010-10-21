/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor.sub

import com.sun.mirror.declaration.TypeDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.TypeDefinition
import scala.collection.JavaConversions._

trait LibraryProcessor {
  
  def processLibrary(typeDef : TypeDefinition,classdef : TypeDeclaration)={

    var root = typeDef.eContainer.asInstanceOf[ContainerRoot]

    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Library]) != null){
      var libannot = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Library])
      /* CREATE LIBRARY IF NEEDED */
      root.getLibraries.find({lib=>lib.getName== libannot.name}) match {
        case Some(lib)=> lib.getSubTypes.add(typeDef)
        case None => {
            var newlib = Art2Factory.eINSTANCE.createTypeLibrary
            newlib.setName(libannot.name)
            newlib.getSubTypes.add(typeDef)
            root.getLibraries.add(newlib)
          }
      }
    }


  }

}
