package k2.exceptions;
import org.kermeta.language.structure._
import org.kermeta._
import org.kermeta.language._
import org.kermeta.language.behavior._
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore._
import k2.standard.JavaCollectionConversions._
import k2.standard.PrimitiveConversion._
 
trait Exception extends ExceptionAspect with k2.standard.KermetaObject with k2.standard.EObjectImplForPrimitive
trait ExceptionAspect extends _root_.java.lang.Throwable with org.eclipse.emf.ecore.EObject{
	// Constructor stuff
    // removing junk internal call stack from init to fillInStackTrace
    setStackTrace(getStackTrace().drop(4)) 
    
	var message:String=null;
	var nestedException:Exception=null; 
	
	/**
	 * StackTrace representation as a String, used by Kermeta.
	 * DO NOT forget to keep it synchronized every time the stack trace is modified.
	 */
	var stackTrace:String={
	  val res = new java.io.StringWriter
	  this.printStackTrace(new java.io.PrintWriter(res))
	  res.toString()
	}
	
	def Scalamessage : _root_.java.lang.String={return this.message}
	def Scalamessage_=(arg : _root_.java.lang.String)={message  = arg}
	def ScalanestedException : Exception={return this.nestedException }
	def ScalanestedException_=(arg : Exception)={nestedException = arg}
	def ScalastackTrace : _root_.java.lang.String={return this.stackTrace}
	def ScalastackTrace_=(arg: _root_.java.lang.String)={stackTrace=arg}
	
	def initialize(message : String) : ExceptionAspect = {
	  this.message = message
	  return this;
	}
	
	// Throwable method redefined as aliases to Exception method
	override def getLocalizedMessage=Scalamessage
	override def getMessage=Scalamessage
	def initCause=ScalanestedException_= _
	def setStackTrace=ScalastackTrace_= _
	
	// Redefinition of return type
	override def getCause():Exception=ScalanestedException
	
	override def initCause(cause:Throwable)={
	  cause match {
	    case c:Exception => ScalanestedException_=(c)
	    case _ => k2.io.StdIO.errorln("Trying to nest a Java exception in a Kermeta exception.") 
	  }
	  this
	}
	
	override def printStackTrace()={
	  val writer=new java.io.StringWriter
	  printStackTrace(new java.io.PrintWriter(writer))
	  k2.io.StdIO.errorln(writer.toString())
	}
	
	def printStackTrace(s:java.lang.StringBuilder):Unit={
	  val writer=new java.io.StringWriter
	  printStackTrace(new java.io.PrintWriter(writer))
	  s.append(writer)
	}
	
	override def fillInStackTrace()={
	  super.fillInStackTrace()
	  // removing internal call stack of fillInStackTraces
	  setStackTrace(getStackTrace().drop(3))
	  val writer=new java.io.StringWriter
	  printStackTrace(new java.io.PrintWriter(writer))
	  ScalastackTrace_=(writer.toString())
	  this
	}
}  
class RichException extends Exception

trait RuntimeErrorAspect extends Exception{
  var expression:Expression=null;
  def KergetExpression() = expression
  def KersetExpression(e:Expression)={expression=e}
  def Scalaexpression = this.KergetExpression()
  def Scalaexpression_=(e:Expression)=this.KersetExpression(e)
}
trait RuntimeError extends RuntimeErrorAspect{
}
class RichRuntimeError extends RuntimeError

trait CallOnVoidTargetAspect extends Exception{
}
trait CallOnVoidTarget extends CallOnVoidTargetAspect{
}
class RichCallOnVoidTarget extends CallOnVoidTarget


trait TypeCastErrorAspect extends Exception{
}

trait TypeCastError extends TypeCastErrorAspect{
}
class RichTypeCastError extends TypeCastError


trait NotImplementedExceptionAspect extends Exception{
}

trait NotImplementedException extends NotImplementedExceptionAspect{
}
class RichNotImplementedException extends NotImplementedException


trait UpperBoundReachedErrorAspect extends Exception{
}

trait UpperBoundReachedError extends UpperBoundReachedErrorAspect{
}
class RichUpperBoundReachedError extends UpperBoundReachedError


trait AbstractClassInstantiationErrorAspect extends Exception{
}

trait AbstractClassInstantiationError extends AbstractClassInstantiationErrorAspect{
}
class RichAbstractClassInstantiationError extends AbstractClassInstantiationError


trait IncompatibleTypeErrorAspect extends Exception{
}

trait IncompatibleTypeError extends IncompatibleTypeErrorAspect{
}
class RichIncompatibleTypeError extends IncompatibleTypeError



trait DivisionByZeroAspect extends Exception{
}

trait DivisionByZero extends DivisionByZeroAspect{
}
class RichDivisionByZero extends DivisionByZero


trait OverflowErrorAspect extends Exception{
}
trait OverflowError extends OverflowErrorAspect{
}
class RichOverflowError extends OverflowError


trait VoidOperandErrorAspect extends Exception{
}
trait VoidOperandError extends VoidOperandErrorAspect{
}
class RichVoidOperandError extends VoidOperandError


trait StringIndexOutOfBoundAspect extends Exception{
}
trait StringIndexOutOfBound extends StringIndexOutOfBoundAspect{
}
class RichStringIndexOutOfBound extends StringIndexOutOfBound


trait StringFormatExceptionAspect extends Exception{
}
trait StringFormatException extends StringFormatExceptionAspect{
}
class RichStringFormatException extends StringFormatException


trait IndexOutOfBoundAspect extends Exception{
}
trait IndexOutOfBound extends IndexOutOfBoundAspect{
}
class RichIndexOutOfBound extends IndexOutOfBound


trait EmptyCollectionAspect extends Exception{
}
trait EmptyCollection extends EmptyCollectionAspect{
}
class RichEmptyCollection extends EmptyCollection


trait IteratorIsOffAspect extends Exception{
}
trait IteratorIsOff extends IteratorIsOffAspect{
}
class RichIteratorIsOff extends IteratorIsOff


trait IOExceptionAspect extends Exception{
}
trait IOException extends IOExceptionAspect{
}
class RichIOException extends IOException


trait FileNotFoundExceptionAspect extends Exception{
}
trait FileNotFoundException extends FileNotFoundExceptionAspect{
}
class RichFileNotFoundException extends FileNotFoundException


trait ConstraintViolatedExceptionAspect extends Exception{
	message="ConstraintViolatedException"
	var constraintAppliedTo:org.eclipse.emf.ecore.EObject = _;
	var failedConstraint:Constraint= _;
	def ScalaconstraintAppliedTo:org.eclipse.emf.ecore.EObject = constraintAppliedTo
	def ScalaconstraintAppliedTo_=(arg:org.eclipse.emf.ecore.EObject) = {constraintAppliedTo = arg}
	def ScalafailedConstraint:Constraint = failedConstraint
	def ScalafailedConstraint_=(arg:Constraint) = {failedConstraint = arg}
}

trait ConstraintViolatedException extends ConstraintViolatedExceptionAspect{
}
class RichConstraintViolatedException extends ConstraintViolatedException



trait ConstraintViolatedPreAspect extends ConstraintViolatedException{
}
trait ConstraintViolatedPre extends ConstraintViolatedPreAspect{
}
class RichConstraintViolatedPre extends ConstraintViolatedPre


trait ConstraintViolatedPostAspect extends ConstraintViolatedException{
}
trait ConstraintViolatedPost extends ConstraintViolatedPostAspect{
}
class RichConstraintViolatedPost extends ConstraintViolatedPost 


trait ConstraintViolatedInvAspect extends ConstraintViolatedException{
}

trait ConstraintViolatedInv extends ConstraintViolatedInvAspect{
}
class RichConstraintViolatedInv extends ConstraintViolatedInv 

trait ResourceLoadExceptionAspect extends Exception{
}
trait ResourceLoadException extends ResourceLoadExceptionAspect{
}
class RichResourceLoadException extends ResourceLoadException


trait ResourceSaveExceptionAspect extends Exception{
var failedWhileSaving:Object= None.get; 
}
trait ResourceSaveException extends ResourceSaveExceptionAspect{
}
class RichResourceSaveException extends ResourceSaveException


trait ResourceMixedLevelsExceptionAspect extends Exception{
}
trait ResourceMixedLevelsException extends ResourceMixedLevelsExceptionAspect{
}
class RichResourceMixedLevelsException extends ResourceMixedLevelsException


trait ResourceCreateExceptionAspect extends Exception{
}
trait ResourceCreateException extends ResourceCreateExceptionAspect{
}
class RichResourceCreateException extends ResourceCreateException


trait ResourceUnconformityExceptionAspect extends Exception{
}
trait ResourceUnconformityException extends ResourceUnconformityExceptionAspect{
}
class RichResourceUnconformityException extends ResourceUnconformityException


trait UnregisteredMetamodelExceptionAspect extends Exception{
}
trait UnregisteredMetamodelException extends UnregisteredMetamodelExceptionAspect{
}
class RichUnregisteredMetamodelException extends UnregisteredMetamodelException


trait DynamicExpressionExceptionAspect extends Exception{
}
trait DynamicExpressionException extends DynamicExpressionExceptionAspect{
}
class RichDynamicExpressionException extends DynamicExpressionException

trait ConstraintsDiagnosticAspect extends Exception{
    message="ConstraintsDiagnostic"
      
    var setConstraints : _root_.k2.standard.KermetaSequence[ConstraintViolatedInv] = new _root_.k2.standard.RichKermetaSequence[ConstraintViolatedInv]
    def ScalasetConstraints : _root_.k2.standard.KermetaSequence[ConstraintViolatedInv]={return this.setConstraints}
    def ScalasetConstraints_=(arg : _root_.k2.standard.KermetaSequence[ConstraintViolatedInv])={this.setConstraints.clear; this.setConstraints.addAll(arg)}
	
	/* Initialize */
	def initialize() : ConstraintsDiagnostic={
		setConstraints = new _root_.k2.standard.RichKermetaSequence[ConstraintViolatedInv]
		return this.asInstanceOf[ConstraintsDiagnostic];
	}
	
	/* Adds a ConstraintViolatedInv object to setConstraints */	
	def add(cons : ConstraintViolatedInv)={
        setConstraints.add(cons)
    }
	
	/* Prints the content */
	def prettyPrint() ={
		import scala.collection.JavaConversions._
		k2.io.StdIO.writeln("Number of violated constraints : " + setConstraints.size.toString)
		setConstraints.foreach(constraint => k2.io.StdIO.writeln("  "+constraint.Scalamessage))
		//Clean the markers on the associated resources
	}



}

trait ConstraintsDiagnostic extends ConstraintsDiagnosticAspect{

}
class RichConstraintsDiagnostic extends ConstraintsDiagnostic


