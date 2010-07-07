package kermeta.ki.test
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait TestFouquetsParserAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with kermeta.ki.test.TestFouquetsParser{
var expression : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression= _
def KergetExpression() : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.expression}
def KersetExpression(arg:_root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={ this.expression = arg}
def Scalaexpression : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.KergetExpression()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalaexpression_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.KersetExpression(value)}
var javaPrinter : _root_.kermeta.ki.util.ExpressionVisitor= _
def KergetJavaPrinter() : _root_.kermeta.ki.util.ExpressionVisitor={this.javaPrinter}
def KersetJavaPrinter(arg:_root_.kermeta.ki.util.ExpressionVisitor)={ this.javaPrinter = arg}
def ScalajavaPrinter : _root_.kermeta.ki.util.ExpressionVisitor={this.KergetJavaPrinter()}.asInstanceOf[_root_.kermeta.ki.util.ExpressionVisitor]
def ScalajavaPrinter_=(value : _root_.kermeta.ki.util.ExpressionVisitor)={this.KersetJavaPrinter(value)}
var kmtPrinter : _root_.kermeta.ki.util.ExpressionVisitor= _
def KergetKmtPrinter() : _root_.kermeta.ki.util.ExpressionVisitor={this.kmtPrinter}
def KersetKmtPrinter(arg:_root_.kermeta.ki.util.ExpressionVisitor)={ this.kmtPrinter = arg}
def ScalakmtPrinter : _root_.kermeta.ki.util.ExpressionVisitor={this.KergetKmtPrinter()}.asInstanceOf[_root_.kermeta.ki.util.ExpressionVisitor]
def ScalakmtPrinter_=(value : _root_.kermeta.ki.util.ExpressionVisitor)={this.KersetKmtPrinter(value)}
var out : _root_.kermeta.ki.util.SourcePrinter= _
def KergetOut() : _root_.kermeta.ki.util.SourcePrinter={this.out}
def KersetOut(arg:_root_.kermeta.ki.util.SourcePrinter)={ this.out = arg}
def Scalaout : _root_.kermeta.ki.util.SourcePrinter={this.KergetOut()}.asInstanceOf[_root_.kermeta.ki.util.SourcePrinter]
def Scalaout_=(value : _root_.kermeta.ki.util.SourcePrinter)={this.KersetOut(value)}

    def initialize():Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
Scalaout = kermeta.ki.util.RichFactory.createSourcePrinter;
ScalakmtPrinter = kermeta.ki.util.RichFactory.createKermetaExpressionPrinter;
(ScalakmtPrinter).initialize(Scalaout)
ScalajavaPrinter = kermeta.ki.util.RichFactory.createJavaExpressionPrinter;
(ScalajavaPrinter).initialize(Scalaout)}
 return result
}

    def main():Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
var expr : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression];
initialize()
try{
expr = org.kermeta.interpreter.helper.ExpressionParser.parse("if true then a := b else a := c end").asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression];
}catch { case e:ClassCastException => {}}

(Scalaout).initialize(kermeta.utils.RichFactory.createStringBuffer)
(expr).accept(ScalakmtPrinter)
(stdio).writeln(((Scalaout)+""))
(Scalaout).initialize(kermeta.utils.RichFactory.createStringBuffer)
(expr).accept(ScalajavaPrinter)
(stdio).writeln(((Scalaout)+""))}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.ki.test.TestFouquetsParser"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

