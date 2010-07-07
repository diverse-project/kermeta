package kermeta.ki.util
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait JavaExpressionPrinterAspect  extends kermeta.ki.util.ExpressionVisitorAspect with kermeta.ki.util.JavaExpressionPrinter{
var unopsMap : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]= _
def KergetUnopsMap() : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]={this.unopsMap}
def KersetUnopsMap(arg:_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String])={ this.unopsMap = arg}
def ScalaunopsMap : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]={this.KergetUnopsMap()}.asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]]
def ScalaunopsMap_=(value : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String])={this.KersetUnopsMap(value)}
var binopsMap : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]= _
def KergetBinopsMap() : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]={this.binopsMap}
def KersetBinopsMap(arg:_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String])={ this.binopsMap = arg}
def ScalabinopsMap : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]={this.KergetBinopsMap()}.asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]]
def ScalabinopsMap_=(value : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String])={this.KersetBinopsMap(value)}

    override def visitAssignment(assignment : _root_.fr.irisa.triskell.kermeta.language.behavior.Assignment):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
((assignment).Scalatarget).accept(this)
(Scalaout).append(" = ")
((assignment).Scalavalue).accept(this)}
 return result
}

    override def visitVoidLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.VoidLiteral):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append("null")}
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
if ((((((((callFeature).Scalaname) == ("dif")))).and((kermeta.standard.RichFactory.isVoid(((callFeature).Scalatarget))).not()))).and(((((callFeature).Scalaparameters).size()) == (1))))

{
(Scalaout).append("!")
((callFeature).Scalatarget).accept(this)
(Scalaout).append(".equals(")
(((callFeature).Scalaparameters).at(0)).accept(this)
(Scalaout).append(")")}
else 


{
if ((((((ScalabinopsMap).containsKey((callFeature).Scalaname))).and((kermeta.standard.RichFactory.isVoid(((callFeature).Scalatarget))).not()))).and(((((callFeature).Scalaparameters).size()) == (1))))

{
((callFeature).Scalatarget).accept(this)
(Scalaout).append(((" ").plus((ScalabinopsMap).get((callFeature).Scalaname))).plus(" "))
(((callFeature).Scalaparameters).at(0)).accept(this)}
else 


{
if ((((ScalaunopsMap).containsKey((callFeature).Scalaname))).and((kermeta.standard.RichFactory.isVoid(((callFeature).Scalatarget))).not()))

{
(Scalaout).append((ScalaunopsMap).get((callFeature).Scalaname))
((callFeature).Scalatarget).accept(this)}
else 


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
}
}
}
 return result
}

    override def visitCallValue(callValue : _root_.fr.irisa.triskell.kermeta.language.behavior.CallValue):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append((callValue).Scalaname)}
 return result
}

    override def visitConditional(cond : _root_.fr.irisa.triskell.kermeta.language.behavior.Conditional):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(Scalaout).append("if (")
((cond).Scalacondition).accept(this)
(((Scalaout).append(") {")).nl()).indent()
((cond).ScalathenBody).accept(this)
(((Scalaout).nl()).deindent()).append("}")
if ((kermeta.standard.RichFactory.isVoid(((cond).ScalaelseBody))).not())

{
(((Scalaout).append(" else {")).nl()).indent()
((cond).ScalaelseBody).accept(this)
(((Scalaout).nl()).deindent()).append("}")}

(Scalaout).nl()}
 return result
}

    override def visitBlock(block : _root_.fr.irisa.triskell.kermeta.language.behavior.Block):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
((block).Scalastatement).each({(s)=>

{
if ((s.isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.EmptyExpression]).not())

{
(s).accept(this)
((Scalaout).append(";")).nl()}
}
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
(Scalaout).append("this")}
 return result
}

    override def initialize(out : _root_.kermeta.ki.util.SourcePrinter):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
super[ExpressionVisitorAspect].initialize(out)
ScalabinopsMap = kermeta.utils.RichFactory.createHashtable[_root_.java.lang.String,_root_.java.lang.String];
(ScalabinopsMap).put("isLower", "<")
(ScalabinopsMap).put("isLowerOrEqual", "<=")
(ScalabinopsMap).put("isGreater", ">")
(ScalabinopsMap).put("isGreaterOrEqual", ">=")
(ScalabinopsMap).put("minus", "-")
(ScalabinopsMap).put("plus", "+")
(ScalabinopsMap).put("mult", "*")
(ScalabinopsMap).put("div", "/")
(ScalabinopsMap).put("and", "&&")
(ScalabinopsMap).put("or", "||")
ScalaunopsMap = kermeta.utils.RichFactory.createHashtable[_root_.java.lang.String,_root_.java.lang.String];
(ScalaunopsMap).put("uminus", "-")
(ScalaunopsMap).put("not", "!")}
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
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.ki.util.JavaExpressionPrinter"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

