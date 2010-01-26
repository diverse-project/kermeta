package kermeta.exceptions;
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.behavior._
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore._

import kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
 

trait Exception extends java.lang.Throwable with fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect{
var message:String=null;
var nestedException:Exception=null; 
var stackTrace:String=null;
def Scalamessage : java.lang.String={return this.message}
def Scalamessage_=(arg : java.lang.String)={message  = arg}
def ScalanestedException : Exception={return this.nestedException }
def ScalanestedException_=(arg : Exception)={nestedException = arg}
def ScalastackTrace : java.lang.String={return this.stackTrace }
def ScalastackTrace_=(arg : java.lang.String)={stackTrace  = arg}
	
	
   def eClass():EClass =null
   def eResource():Resource =null
   def eContainer():EObject =null
   def eContainingFeature():EStructuralFeature =null
   def eContainmentFeature():EReference =null
   override def eContents():EList[EObject] =null;
   override def eAllContents():TreeIterator[EObject] =null;
   def eIsProxy():Boolean =false;
   override def eCrossReferences():EList[EObject] =null;
   def eGet(feature:EStructuralFeature ) : Object=null;
   def eGet(feature:EStructuralFeature , resolve:Boolean ):Object =null;
   def eSet(feature:EStructuralFeature , newValue:Any   ) :Unit =null;
   def eIsSet(feature:EStructuralFeature ) : Boolean = false;
   override def eUnset( feature:EStructuralFeature) : Unit = null;
   override def eAdapters(): EList[org.eclipse.emf.common.notify.Adapter] =null;
   def eDeliver():Boolean =true;
   def eSetDeliver(deliver:Boolean):Unit=null;
   def eNotify( notification:org.eclipse.emf.common.notify.Notification):Unit=null;
   
}  
trait RuntimeError extends Exception{
var expression:Expression=null;
}
trait CallOnVoidTarget extends Exception{
}
trait TypeCastError extends Exception{
}
trait NotImplementedException extends Exception{
}
trait UpperBoundReachedError extends Exception{
}
trait AbstractClassInstantiationError extends Exception{
}
trait IncompatibleTypeError extends Exception{
}
trait DivisionByZero extends Exception{
}
trait OverflowError extends Exception{
}
trait VoidOperandError extends Exception{
}
trait StringIndexOutOfBound extends Exception{
}
trait StringFormatException extends Exception{
}
trait IndexOutOfBound extends Exception{
}
trait EmptyCollection extends Exception{
}
trait IteratorIsOff extends Exception{
}
trait IOException extends Exception{
}
trait FileNotFoundException extends Exception{
}
trait ConstraintViolatedException extends Exception{
var constraintAppliedTo:Object = None.get;
var failedConstraint:Constraint= None.get;
}
trait ConstraintViolatedPre extends Exception{
}
trait ConstraintViolatedPost extends Exception{
}
trait ConstraintViolatedInv extends Exception{
}
trait ResourceLoadException extends Exception{
}
trait ResourceSaveException extends Exception{
var failedWhileSaving:Object= None.get; 
}
trait ResourceMixedLevelsException extends Exception{
}
trait ResourceCreateException extends Exception{
}
trait ResourceUnconformityException extends Exception{
}
trait UnregisteredMetamodelException extends Exception{
}
trait DynamicExpressionException extends Exception{
}


