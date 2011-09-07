package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import _root_.java.util._
import org.eclipse.emf.ecore.EObject
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait CallSuperOperationAspect extends KermetaModelElementAspect with LogAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
    log.debug("CallSuperOperation={}",this.getName())
    /* SEARCH FOR CONTAINER OPERATION */
    var actualEObject : EObject = this
    while(!actualEObject.eClass().getName().equals("Operation")){
      log.debug("Search For super Operation {}",actualEObject.eClass.getName)
      actualEObject = actualEObject.eContainer()
    }
    log.debug("Operation Found {}",actualEObject)
    var actualOperation = actualEObject.asInstanceOf[Operation]
    /* Out EObject Iinstance of Operaiton */


     // the behaviorResolver has already prepared the correct search to the Operation
     var superClassFromName =  this.getStaticOperation.getOwningClass.getName
     var superTrait = this.getStaticOperation.getOwningClass


   // var superClassFromName = actualOperation.getSuperOperation().asInstanceOf[Operation].getOwningClass.getName

    //var classFrom = actualOperation.getOwningClass

    //SEARCH THE FIRST LEVEL SUPER TYPE WHERE OPERATION COMING FROM
    //var superTrait = classFrom.getSuperType.filter({s=>isSubTypeOf(s, superClassFromName)}).head
    /* var superTrait : Type = null
    var maxLevel : Int = 2
    classFrom.getSuperType.filter({s=>isSubTypeOf(s, superClassFromName)}).foreach{stype=>
      log.debug("Selecting classFrom {} or {}",stype.getQualifiedNameCompilo, classFrom.getQualifiedNameCompilo)
      if (stype.getQualifiedNameCompilo == classFrom.getQualifiedNameCompilo) {
        superTrait = stype
        maxLevel = 1
        log.debug("Found stype level 1 {}",superTrait.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName)
      }
      else {
        if (maxLevel == 2 ){
          superTrait = stype
          log.debug("Found stype level 2 {}",superTrait.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName)
        }
      }

    }*/

    log.debug("operation {} from {}",actualOperation.getName, superClassFromName)
    log.debug(" => {}",superTrait.getName         )
    res.append("super["+superTrait.getName+"Aspect]")
    res.append("."+Util.getEcoreRenameOperation(this.getStaticOperation))
    res.append("(")
    Util.generateScalaCodeEach(res,this.getParameters,",")
    //this.getParameters().foreach(par => par.generateScalaCode(res))
    res.append(")")
  }


  def isSubTypeOf(typ : Type ,superClassName : String) : Boolean = {
    //log.error("ECHOECHO "+typ.getQualifiedNameCompilo + " "+superClassName)
    if(typ.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName.equals(superClassName)){
      return true
    } else {
      
      typ.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getSuperType.exists({s=>isSubTypeOf(s, superClassName) } )
    }
  }

}


