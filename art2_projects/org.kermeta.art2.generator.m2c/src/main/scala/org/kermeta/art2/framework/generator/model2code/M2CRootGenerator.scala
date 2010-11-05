/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator.model2code

import java.io.File
import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import scala.collection.JavaConversions._


class M2CRootGenerator extends ComponentTypeGenerator
with PomGenerator {

   private final var JAVA_SRC_FOLDER : String = "src/main/java"
   private final var SCALA_SRC_FOLDER : String = "src/main/scala"
   private final var RES_FOLDER : String = "src/main/resources"
   private final var JAVA_TEST_FOLDER : String = "src/test/java"
   private final var SCALA_TEST_FOLDER : String = "src/test/scala"
   private final var TEST_RES_FOLDER : String = "src/test/resources"


  def generate(root:ContainerRoot,generateAllProject:Boolean,genRootLocation:String) = {


    if(generateAllProject){
      generateProjectStructure(genRootLocation)
      generatePom(root,genRootLocation)
    }
    
    generateComponentClasses(root,genRootLocation + "/" + JAVA_SRC_FOLDER)
  }

  private def generateProjectStructure(location:String) = {
    createFolder(location,"")
    createFolder(location,JAVA_SRC_FOLDER)
  }

  private def createFolder(location:String,folder:String) = {
    var f = new File(location + "/"+folder)
    if(!f.exists) {
      f.mkdirs
    }
  }

  private def generateComponentClasses(root:ContainerRoot,location:String) = {
    root.getTypeDefinitions.foreach{typeDef => typeDef match {
        case (componentType : ComponentType) => {
            generateComponentType(root, componentType, location)
          }
        case _ => printf("Generation not implemented yet for type " + typeDef.getClass.getName + "\n")
      }
    }
  }

}
