package kermeta.ki.util
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait KermetaExpressionPrinterAspect  extends kermeta.ki.util.ExpressionVisitorAspect with kermeta.ki.util.KermetaExpressionPrinter{

    override def visitAssignment(assignment : _root_.fr.irisa.triskell.kermeta.language.behavior.Assignment):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
((assignment).Scalatarget).accept(this)
(Scalaout).append(" := ")
((assignment).Scalavalue).accept(this)}
 return result
}

    override def visitVoidLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.VoidLiteral):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append("void")}
 return result
}

    override def visitIntegerLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append((((lit).Scalavalue)+""))}
 return result
}

    override def visitCallFeature(callFeature : _root_.fr.irisa.triskell.kermeta.language.behavior.CallFeature):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
if ((kermeta.standard.RichFactory.isVoid(((callFeature).Scalatarget))).not())

{
((callFeature).Scalatarget).accept(this)
(Scalaout).append(".")}

(Scalaout).append((callFeature).Scalaname)
if ((((callFeature).Scalaparameters).size()) != (0))

{
(Scalaout).append("(")
var it : _root_.java.util.Iterator[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression] = ((callFeature).Scalaparameters).iterator();
((it).next()).accept(this)


{var i : _root_.java.util.Iterator[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression] = it;
while (!((i).isOff()))


{
(Scalaout).append(", ")
((i).next()).accept(this)}
}
(Scalaout).append(")")}
}
 return result
}

    override def visitConditional(cond : _root_.fr.irisa.triskell.kermeta.language.behavior.Conditional):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append("if ")
((cond).Scalacondition).accept(this)
(((Scalaout).append(" then")).nl()).indent()
((cond).ScalathenBody).accept(this)
((Scalaout).deindent()).nl()
if (kermeta.standard.RichFactory.isVoid(((cond).ScalaelseBody)))

{
((Scalaout).append("end")).nl()}
else 


{
(((Scalaout).append("else")).nl()).indent()
((cond).ScalaelseBody).accept(this)
((((Scalaout).nl()).deindent()).append("end")).nl()}
}
 return result
}

    override def visitCallValue(callValue : _root_.fr.irisa.triskell.kermeta.language.behavior.CallValue):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append((callValue).Scalaname)}
 return result
}

    override def visitBlock(block : _root_.fr.irisa.triskell.kermeta.language.behavior.Block):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
((block).Scalastatement).each({(s)=>

{
(s).accept(this)
(Scalaout).nl()}
})}
 return result
}

    override def visitStringLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.StringLiteral):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append((("\"").plus(((lit).Scalavalue).replace("\"", "\\\""))).plus("\""))}
 return result
}

    override def visitCallVariable(callVariable : _root_.fr.irisa.triskell.kermeta.language.behavior.CallVariable):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append((callVariable).Scalaname)}
 return result
}

    override def visitSelfExpression(expr : _root_.fr.irisa.triskell.kermeta.language.behavior.SelfExpression):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append("self")}
 return result
}

    override def visitBooleanLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append(if ((lit).Scalavalue)

{
"true"}
else 


{
"false"}
)}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.ki.util.KermetaExpressionPrinter"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

