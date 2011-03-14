package kermeta.exceptions;
import org.kermeta.language.structure._
import org.kermeta._
import org.kermeta.language._
import org.kermeta.language.behavior._
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore._

import kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
 
trait Exception extends ExceptionAspect with kermeta.standard.KermetaObject{}
trait ExceptionAspect extends _root_.java.lang.Throwable with org.eclipse.emf.ecore.EObject{
var message:String=null;
var nestedException:Exception=null; 
var stackTrace:String=null;
def Scalamessage : _root_.java.lang.String={return this.message}
def Scalamessage_=(arg : _root_.java.lang.String)={message  = arg}
def ScalanestedException : Exception={return this.nestedException }
def ScalanestedException_=(arg : Exception)={nestedException = arg}
def ScalastackTrace : _root_.java.lang.String={return this.stackTrace }
def ScalastackTrace_=(arg : _root_.java.lang.String)={stackTrace  = arg}


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
  def eInvoke(x1: org.eclipse.emf.ecore.EOperation,x2: org.eclipse.emf.common.util.EList[_]):_root_.java.lang.Object = null
   
}  
trait RuntimeErrorAspect extends Exception{
var expression:Expression=null;

}
trait RuntimeError extends RuntimeErrorAspect{
}

trait CallOnVoidTargetAspect extends Exception{
}
trait CallOnVoidTarget extends CallOnVoidTargetAspect{
}


trait TypeCastErrorAspect extends Exception{
}

trait TypeCastError extends TypeCastErrorAspect{
}


trait NotImplementedExceptionAspect extends Exception{
}

trait NotImplementedException extends NotImplementedExceptionAspect{
}


trait UpperBoundReachedErrorAspect extends Exception{
}

trait UpperBoundReachedError extends UpperBoundReachedErrorAspect{
}


trait AbstractClassInstantiationErrorAspect extends Exception{
}

trait AbstractClassInstantiationError extends AbstractClassInstantiationErrorAspect{
}


trait IncompatibleTypeErrorAspect extends Exception{
}

trait IncompatibleTypeError extends IncompatibleTypeErrorAspect{
}



trait DivisionByZeroAspect extends Exception{
}

trait DivisionByZero extends DivisionByZeroAspect{
}


trait OverflowErrorAspect extends Exception{
}
trait OverflowError extends OverflowErrorAspect{
}


trait VoidOperandErrorAspect extends Exception{
}
trait VoidOperandError extends VoidOperandErrorAspect{
}


trait StringIndexOutOfBoundAspect extends Exception{
}
trait StringIndexOutOfBound extends StringIndexOutOfBoundAspect{
}


trait StringFormatExceptionAspect extends Exception{
}
trait StringFormatException extends StringFormatExceptionAspect{
}


trait IndexOutOfBoundAspect extends Exception{
}
trait IndexOutOfBound extends IndexOutOfBoundAspect{
}


trait EmptyCollectionAspect extends Exception{
}
trait EmptyCollection extends EmptyCollectionAspect{
}


trait IteratorIsOffAspect extends Exception{
}
trait IteratorIsOff extends IteratorIsOffAspect{
}


trait IOExceptionAspect extends Exception{
}
trait IOException extends IOExceptionAspect{
}


trait FileNotFoundExceptionAspect extends Exception{
}
trait FileNotFoundException extends FileNotFoundExceptionAspect{
}


trait ConstraintViolatedExceptionAspect extends Exception{
var constraintAppliedTo:org.eclipse.emf.ecore.EObject = None.get;
var failedConstraint:Constraint= None.get;
def ScalaconstraintAppliedTo:org.eclipse.emf.ecore.EObject = constraintAppliedTo
def ScalaconstraintAppliedTo_=(arg:org.eclipse.emf.ecore.EObject) = {constraintAppliedTo = arg}
def ScalafailedConstraint:Constraint = failedConstraint
def ScalafailedConstraint_=(arg:Constraint) = {failedConstraint = arg}

}
trait ConstraintViolatedException extends ConstraintViolatedExceptionAspect{
}



trait ConstraintViolatedPreAspect extends ConstraintViolatedException{
}
trait ConstraintViolatedPre extends ConstraintViolatedPreAspect{
}


trait ConstraintViolatedPostAspect extends ConstraintViolatedException{
}
trait ConstraintViolatedPost extends ConstraintViolatedPostAspect{
}


trait ConstraintViolatedInvAspect extends ConstraintViolatedException{
/*  var failedConstraint : Constraint = null;
  def ScalafailedConstraint : Constraint={return this.failedConstraint}
  def ScalafailedConstraint_=(arg : Constraint)={failedConstraint  = arg}*/
}

trait ConstraintViolatedInv extends ConstraintViolatedInvAspect{
}


trait ResourceLoadExceptionAspect extends Exception{
}
trait ResourceLoadException extends ResourceLoadExceptionAspect{
}


trait ResourceSaveExceptionAspect extends Exception{
var failedWhileSaving:Object= None.get; 
}
trait ResourceSaveException extends ResourceSaveExceptionAspect{
}


trait ResourceMixedLevelsExceptionAspect extends Exception{
}
trait ResourceMixedLevelsException extends ResourceMixedLevelsExceptionAspect{
}


trait ResourceCreateExceptionAspect extends Exception{
}
trait ResourceCreateException extends ResourceCreateExceptionAspect{
}


trait ResourceUnconformityExceptionAspect extends Exception{
}
trait ResourceUnconformityException extends ResourceUnconformityExceptionAspect{
}


trait UnregisteredMetamodelExceptionAspect extends Exception{
}
trait UnregisteredMetamodelException extends UnregisteredMetamodelExceptionAspect{
}


trait DynamicExpressionExceptionAspect extends Exception{
}
trait DynamicExpressionException extends DynamicExpressionExceptionAspect{
}

trait ConstraintsDiagnosticAspect extends Exception{
    
    var setConstraints : _root_.java.util.List[ConstraintViolatedInv] = new _root_.java.util.ArrayList[ConstraintViolatedInv]
    def ScalasetConstraints : _root_.java.util.List[ConstraintViolatedInv]={return this.setConstraints}
    def ScalasetConstraints_=(arg : _root_.java.util.List[ConstraintViolatedInv])={this.setConstraints.clear; this.setConstraints.addAll(arg)}
	
	/* Initialize */
	def initialize() : ConstraintsDiagnostic={
            setConstraints = new _root_.java.util.ArrayList[ConstraintViolatedInv]
		return this.asInstanceOf[ConstraintsDiagnostic];
        }
	
	/* Adds a ConstraintViolatedInv object to setConstraints */	
	def add(cons : ConstraintViolatedInv)={
            setConstraints.add(cons)
        }
	
	/* Prints the content */
	def prettyPrint() ={
		//stdio.writeln("Number of violated constraints : " + setConstraints.size.toString)
	
		//Clean the markers on the associated resources
		
		
	}



}

trait ConstraintsDiagnostic extends ConstraintsDiagnosticAspect{

}



