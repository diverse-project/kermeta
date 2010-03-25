package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import org.eclipse.emf.ecore.EObject

trait CallSuperOperationAspect extends RichAspectImplicit with ObjectAspect with LogAspect {
	
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

    var superClassFromName = actualOperation.getSuperOperation().getOwningClass.getName
    var classFrom = actualOperation.getOwningClass

    //SEARCH THE FIRST LEVEL SUPER TYPE WHERE OPERATION COMING FROM
    var superTrait = classFrom.getSuperType.filter({s=>isSubTypeOf(s, superClassFromName)}).head
                
    res.append("super["+superTrait.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName+"Aspect]")
    res.append("."+actualOperation.getName())
    res.append("(")
                
    this.getParameters().foreach(par => par.generateScalaCode(res))
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


