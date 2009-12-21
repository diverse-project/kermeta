package fr.irisa.triskell.kermeta.scala.framework.language.structure

import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._
import kermeta.exceptions._

trait ObjectAspect extends EObject with Contracted {
	
	def getMetaClass() = this.eClass()
	def classDefinition = this.asInstanceOf[EClass]
	def ScalaclassDefinition = classDefinition
	def typedefinition = this
	def container() = this.eContainer()
	override def equals(o : Any) : Boolean = o == this /*TODO*/ 
	def isNotEqual(o : Any) : Boolean = !equals(o)
	def isKindOf(cl : EClass) : Boolean = this.eClass().equals(cl)
	def get(prop : EStructuralFeature) = this.eGet(prop)
	def set(prop : EStructuralFeature,o : Any) = this.eSet(prop, o)
	def isSet(prop : EStructuralFeature) =  this.eIsSet(prop)
	def unset(prop : EStructuralFeature) = this.eUnset(prop)
	def oid() : Int = this.hashCode() /*TODO*/
	override def toString : String = super.toString()//"["+this.eClass().getName()+":"+oid.toString()+"]"
	//def isFrozen : Boolean  /*TODO*/
	def isVoid() : Boolean = false
	def hashcode : Int = this.hashCode() 
	def getKerMetaClass(): Class[_] =this.getClass
	//def freeze  /*TODO*/
	//def asType(t : EClass) = this.asInstanceOf[t.getName]
	//def isInstanceOf(t : EClass) = this.isInstanceOf(t.getMetaClass().getName)
	
	
	/* Contracted */
	type Condition = () => Boolean
	def checkParamInvariants(inv : scala.collection.immutable.HashMap[String,Condition]) = {
		if(inv !=  null ){
			for(cond <- inv){
				if(!cond._2()){
					var constraintException : Exception  = kermeta.exceptions.RichFactory.createConstraintViolatedInvException
					constraintException.message = "Contraint Invariant Exception "+cond._1
					throw constraintException
				}
			}
		}
	}
	/* Default Method Overloaded in by each class definition */
	def checkInvariants() = { 
		val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap[String,Condition]()
		checkParamInvariants(invariants)
	}
	def checkAllInvariants() = { /*TODO*/ println("todo checkAllInvariant") }	
	
	
}
