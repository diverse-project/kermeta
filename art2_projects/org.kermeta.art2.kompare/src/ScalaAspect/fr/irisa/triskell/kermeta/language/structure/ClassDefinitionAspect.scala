package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ClassDefinitionAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinitionAspect with ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeContainerAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.ClassDefinition{
def ScalaownedOperation : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]={this.getOwnedOperation()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]]
def ScalaownedOperation_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation])={this.getOwnedOperation().clear
this.getOwnedOperation().addAll(value)
}
var `_allAttributeCache` : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]= _
def Kerget_allAttributeCache() : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]={this.`_allAttributeCache`}
def Kerset_allAttributeCache(arg:_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property])={ this.`_allAttributeCache` = arg}
def Scala_allAttributeCache : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]={this.Kerget_allAttributeCache()}.asInstanceOf[_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]]
def Scala_allAttributeCache_=(value : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property])={this.Kerset_allAttributeCache(value)}
def ScalaisAbstract : java.lang.Boolean={this.isIsAbstract()}.asInstanceOf[java.lang.Boolean]
def ScalaisAbstract_=(value : java.lang.Boolean)={this.setIsAbstract(value)}
var `_allSuperTypesCache` : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]= _
def Kerget_allSuperTypesCache() : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]={this.`_allSuperTypesCache`}
def Kerset_allSuperTypesCache(arg:_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type])={ this.`_allSuperTypesCache` = arg}
def Scala_allSuperTypesCache : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]={this.Kerget_allSuperTypesCache()}.asInstanceOf[_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]]
def Scala_allSuperTypesCache_=(value : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type])={this.Kerset_allSuperTypesCache(value)}
def ScalasuperType : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]={this.getSuperType()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]]
def ScalasuperType_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type])={this.getSuperType().clear
this.getSuperType().addAll(value)
}
def Scalainv : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint]={this.getInv()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint]]
def Scalainv_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint])={this.getInv().clear
this.getInv().addAll(value)
}
var allOperation : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation] = new java.util.ArrayList[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]
def KergetAllOperation() : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]={this.allOperation}
def ScalaallOperation : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]={var result : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation] = null.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]]; 


{
result = kermeta.standard.RichFactory.createSet[_root_.fr.irisa.triskell.kermeta.language.structure.Operation];
(result).addAllUnique((this).ScalaownedOperation)
((this).ScalasuperType).each({(t)=>

{
if (t.isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class])

{
var c : _root_.fr.irisa.triskell.kermeta.language.structure.Class = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class];
try{
c = t.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class];
}catch { case e:ClassCastException => {}}

var cDef : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
try{
cDef = (c).ScalatypeDefinition.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}

((cDef).ScalaallOperation).each({(p)=>

{
(result).addUnique(p)}
})}
}
})}
() 
 return result
}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]]
var allAttribute : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property] = new java.util.ArrayList[_root_.fr.irisa.triskell.kermeta.language.structure.Property]
def KergetAllAttribute() : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]={this.allAttribute}
def ScalaallAttribute : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]={var result : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property] = null.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]]; 


{
result = kermeta.standard.RichFactory.createSet[_root_.fr.irisa.triskell.kermeta.language.structure.Property];
(result).addAllUnique((this).ScalaownedAttribute)
((this).ScalasuperType).each({(t)=>

{
if (t.isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class])

{
var c : _root_.fr.irisa.triskell.kermeta.language.structure.Class = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class];
try{
c = t.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class];
}catch { case e:ClassCastException => {}}

var cDef : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
try{
cDef = (c).ScalatypeDefinition.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}

((cDef).ScalaallAttribute).each({(p)=>

{
(result).addUnique(p)}
})}
}
})}
() 
 return result
}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]]
def ScalaownedAttribute : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]={this.getOwnedAttribute()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]]
def ScalaownedAttribute_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property])={this.getOwnedAttribute().clear
this.getOwnedAttribute().addAll(value)
}

    def getCachedAllAttribute():_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property] = {
var result : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property] = null.asInstanceOf[_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]]; 


{
if (kermeta.standard.RichFactory.isVoid((Scala_allAttributeCache)))

{
Scala_allAttributeCache = ScalaallAttribute;}

result = Scala_allAttributeCache;}
 return result
}

    def getCachedAllSuperTypes():_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type] = {
var result : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type] = null.asInstanceOf[_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]]; 


{
if (kermeta.standard.RichFactory.isVoid((Scala_allSuperTypesCache)))

{
Scala_allSuperTypesCache = allSuperTypes();}

result = Scala_allSuperTypesCache;}
 return result
}

    def allSuperTypes():_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type] = {
var result : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type] = null.asInstanceOf[_root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]]; 


{
var allSuperClasses : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type] = kermeta.standard.RichFactory.createSet[_root_.fr.irisa.triskell.kermeta.language.structure.Type];
var superClasses : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type] = kermeta.standard.RichFactory.createSet[_root_.fr.irisa.triskell.kermeta.language.structure.Type];
(superClasses).addAllUnique((this).ScalasuperType)


{((superClasses).isEmpty()).not()
while (!((superClasses).isEmpty()))


{
(allSuperClasses).addAllUnique(superClasses)
var temp : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type] = kermeta.standard.RichFactory.createSet[_root_.fr.irisa.triskell.kermeta.language.structure.Type];
(superClasses).each({(s)=>

{
if ((s).isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ParameterizedType])

{
if ((((s).asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ParameterizedType]).ScalatypeDefinition).isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition])

{
(temp).addAllUnique(((((s).asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ParameterizedType]).ScalatypeDefinition).asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition]).ScalasuperType)}
}
}
})
(superClasses).clear()
(superClasses).addAllUnique(temp)}
}
result = allSuperClasses;}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.ClassDefinition"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

