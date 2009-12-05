package fr.irisa.triskell.kermeta.scala.framework.language.structure

import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._

trait ObjectAspect extends EObject {
	
	def getMetaClass() = this.eClass()
	def classDefinition = this.asInstanceOf[EClass]
	def ScalaclassDefinition = classDefinition
	def typedefinition = this
	def container = this.eContainer()
	def checkInvariants = { /*TODO*/ }
	def checkAllInvariants = { /*TODO*/ }
	override def equals(o : Any) : Boolean = this.equals(o) /*TODO*/ 
	def isNotEqual(o : Any) : Boolean = !equals(o)
	def isKindOf(cl : EClass) : Boolean = this.eClass().equals(cl)
	def get(prop : EStructuralFeature) = this.eGet(prop)
	def set(prop : EStructuralFeature,o : Any) = this.eSet(prop, o)
	def isSet(prop : EStructuralFeature) =  this.eIsSet(prop)
	def unset(prop : EStructuralFeature) = this.eUnset(prop)
	def oid : Integer = this.hashCode() /*TODO*/
	override def toString : String = super.toString()//"["+this.eClass().getName()+":"+oid.toString()+"]"
	//def isFrozen : Boolean  /*TODO*/
	def isVoid() : Boolean = false
	def hashcode : Int = this.hashCode()   
	//def freeze  /*TODO*/
	//def asType(t : EClass) = this.asInstanceOf[t.getName]
	//def isInstanceOf(t : EClass) = this.isInstanceOf(t.getMetaClass().getName)
	
	
}
