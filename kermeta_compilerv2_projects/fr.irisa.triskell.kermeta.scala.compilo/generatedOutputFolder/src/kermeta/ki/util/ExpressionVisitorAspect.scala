package kermeta.ki.util
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ExpressionVisitorAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with kermeta.ki.util.ExpressionVisitor{
var out : _root_.kermeta.ki.util.SourcePrinter= _
def KergetOut() : _root_.kermeta.ki.util.SourcePrinter={this.out}
def KersetOut(arg:_root_.kermeta.ki.util.SourcePrinter)={ this.out = arg}
def Scalaout : _root_.kermeta.ki.util.SourcePrinter={this.KergetOut()}.asInstanceOf[_root_.kermeta.ki.util.SourcePrinter]
def Scalaout_=(value : _root_.kermeta.ki.util.SourcePrinter)={this.KersetOut(value)}

    def visitAssignment(assignment : _root_.fr.irisa.triskell.kermeta.language.behavior.Assignment):Unit

    def visitVoidLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.VoidLiteral):Unit

    def visitConditional(cond : _root_.fr.irisa.triskell.kermeta.language.behavior.Conditional):Unit

    def visitCallValue(callValue : _root_.fr.irisa.triskell.kermeta.language.behavior.CallValue):Unit

    def visitStringLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.StringLiteral):Unit

    def visitBooleanLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral):Unit

    def visitEmptyExpression(expr : _root_.fr.irisa.triskell.kermeta.language.behavior.EmptyExpression):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
}
 return result
}

    def visitIntegerLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral):Unit

    def visitCallFeature(callFeature : _root_.fr.irisa.triskell.kermeta.language.behavior.CallFeature):Unit

    def visitBlock(block : _root_.fr.irisa.triskell.kermeta.language.behavior.Block):Unit

    def visitCallVariable(callVariable : _root_.fr.irisa.triskell.kermeta.language.behavior.CallVariable):Unit

    def visitSelfExpression(expr : _root_.fr.irisa.triskell.kermeta.language.behavior.SelfExpression):Unit

    def initialize(out : _root_.kermeta.ki.util.SourcePrinter):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(this).Scalaout = out;}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.ki.util.ExpressionVisitor"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

