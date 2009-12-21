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
		log.debug("CallSuperOperation Generation {},{}",this.getName())
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
		
		res.append("super["+superClassFromName+"Aspect]")
		res.append("."+actualOperation.getName())
		res.append("(")
		this.getParameters().foreach(par => par.generateScalaCode(res))
		res.append(")")
	}

}
