package kermeta.exceptions;
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.behavior._
class Exception extends java.lang.Throwable{
var message:String=null;
var nestedException:Exception=null; 
var stackTrace:String=null;
} 
class RuntimeError{
var expression:Expression=null;
}
class CallOnVoidTarget{
}
class TypeCastError{
}
class NotImplementedException extends java.lang.Throwable{
}
class UpperBoundReachedError{
}
class AbstractClassInstantiationError{
}
class IncompatibleTypeError{
}
class DivisionByZero{
}
class OverflowError{
}
class VoidOperandError{
}
class StringIndexOutOfBound{
}
class StringFormatException{
}
class IndexOutOfBound{
}
class EmptyCollection{
}
class IteratorIsOff{
}
class IOException{
}
class FileNotFoundException{
}
class ConstraintViolatedException{
var constraintAppliedTo:Object = None.get;
var failedConstraint:Constraint= None.get;
}
class ConstraintViolatedPre{
}
class ConstraintViolatedPost{
}
class ConstraintViolatedInv{
}
class ResourceLoadException{
}
class ResourceSaveException{
var failedWhileSaving:Object= None.get; 
}
class ResourceMixedLevelsException{
}
class ResourceCreateException{
}
class ResourceUnconformityException{
}
class UnregisteredMetamodelException{
}
class DynamicExpressionException{
}


