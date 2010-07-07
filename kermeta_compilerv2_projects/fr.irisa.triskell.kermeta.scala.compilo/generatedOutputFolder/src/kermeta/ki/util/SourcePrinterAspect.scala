package kermeta.ki.util
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait SourcePrinterAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with kermeta.ki.util.SourcePrinter{
var indentLevel : Int= _
def KergetIndentLevel() : Int={this.indentLevel}
def KersetIndentLevel(arg:Int)={ this.indentLevel = arg}
def ScalaindentLevel : Int={this.KergetIndentLevel()}.asInstanceOf[Int]
def ScalaindentLevel_=(value : Int)={this.KersetIndentLevel(value)}
var firstChars : _root_.java.lang.Boolean= _
def KergetFirstChars() : _root_.java.lang.Boolean={this.firstChars}
def KersetFirstChars(arg:_root_.java.lang.Boolean)={ this.firstChars = arg}
def ScalafirstChars : _root_.java.lang.Boolean={this.KergetFirstChars()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalafirstChars_=(value : _root_.java.lang.Boolean)={this.KersetFirstChars(value)}
var out : _root_.scala.StringBuilder= _
def KergetOut() : _root_.scala.StringBuilder={this.out}
def KersetOut(arg:_root_.scala.StringBuilder)={ this.out = arg}
def Scalaout : _root_.scala.StringBuilder={this.KergetOut()}.asInstanceOf[_root_.scala.StringBuilder]
def Scalaout_=(value : _root_.scala.StringBuilder)={this.KersetOut(value)}

    def append(text : _root_.java.lang.String):_root_.kermeta.ki.util.SourcePrinter = {
var result : _root_.kermeta.ki.util.SourcePrinter = null.asInstanceOf[_root_.kermeta.ki.util.SourcePrinter]; 


{
if ((text).contains("\n"))

{
var lines : _root_.java.util.List[_root_.java.lang.String] = (text).ksplit("\\n");
var it : _root_.java.util.Iterator[_root_.java.lang.String] = (lines).iterator();
if (ScalafirstChars)

{
ScalafirstChars = false;
(ScalaindentLevel).times({(i)=>

{
(Scalaout).append("\t")}
})}

(Scalaout).append((it).next())


{var i : _root_.java.util.Iterator[_root_.java.lang.String] = it;
while (!((i).isOff()))


{
(Scalaout).append("\n")
(ScalaindentLevel).times({(i)=>

{
(Scalaout).append("\t")}
})
(Scalaout).append((i).next())}
}}
else 


{
if (ScalafirstChars)

{
ScalafirstChars = false;
(ScalaindentLevel).times({(i)=>

{
(Scalaout).append("\t")}
})}

(Scalaout).append(text)}

result = this;}
 return result
}

    def indent():_root_.kermeta.ki.util.SourcePrinter = {
var result : _root_.kermeta.ki.util.SourcePrinter = null.asInstanceOf[_root_.kermeta.ki.util.SourcePrinter]; 


{
ScalaindentLevel = (ScalaindentLevel).plus(1);
result = this;}
 return result
}

    override def toString():_root_.java.lang.String = {
var result : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 


{
result = ((Scalaout)+"");}
 return result
}

    def nl():_root_.kermeta.ki.util.SourcePrinter = {
var result : _root_.kermeta.ki.util.SourcePrinter = null.asInstanceOf[_root_.kermeta.ki.util.SourcePrinter]; 


{
(Scalaout).append("\n")
ScalafirstChars = true;
result = this;}
 return result
}

    def deindent():_root_.kermeta.ki.util.SourcePrinter = {
var result : _root_.kermeta.ki.util.SourcePrinter = null.asInstanceOf[_root_.kermeta.ki.util.SourcePrinter]; 


{
if ((ScalaindentLevel).isGreater(0))

{
ScalaindentLevel = (ScalaindentLevel).minus(1);}

result = this;}
 return result
}

    def initialize(out : _root_.scala.StringBuilder):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(this).Scalaout = out;
ScalaindentLevel = 0;
ScalafirstChars = true;}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.ki.util.SourcePrinter"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

