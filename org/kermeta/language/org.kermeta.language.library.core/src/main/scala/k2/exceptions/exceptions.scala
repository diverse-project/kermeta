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
import k2.standard.JavaConversions._
import k2.standard.PrimitiveConversion._
 
trait Exception extends ExceptionAspect with k2.standard.KermetaObject with k2.standard.EObjectImplForPrimitive
trait ExceptionAspect extends _root_.java.lang.Throwable with org.eclipse.emf.ecore.EObject{
	// Constructor stuff
    // removing junk internal call stack from init to fillInStackTrace
    setStackTrace(getStackTrace().drop(4)) 
    
	var message:String="Exception";
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
trait RuntimeErrorAspect extends Exception{
  message="RuntimeError"
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
  message = "IndexOutOfBound"
}
trait IndexOutOfBound extends IndexOutOfBoundAspect{
}


trait EmptyCollectionAspect extends Exception{
  message="EmptyCollection"
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



trait ConstraintViolatedPreAspect extends ConstraintViolatedException{
}
trait ConstraintViolatedPre extends ConstraintViolatedPreAspect{
}


trait ConstraintViolatedPostAspect extends ConstraintViolatedException{
}
trait ConstraintViolatedPost extends ConstraintViolatedPostAspect{
}


trait ConstraintViolatedInvAspect extends ConstraintViolatedException{
  message="ConstraintViolatedInv"
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



