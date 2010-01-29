package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ClassDefinitionAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.GenericTypeDefinitionAspect with fr.irisa.triskell.kermeta.language.structure.TypeContainer with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.ClassDefinition{
def ScalaownedOperation : java.util.List[fr.irisa.triskell.kermeta.language.structure.Operation]={this.getOwnedOperation()}
def ScalaownedOperation_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Operation])={this.getOwnedOperation().clear
this.getOwnedOperation().addAll(arg)
}
def ScalaisAbstract : Boolean={this.isIsAbstract()}
def ScalaisAbstract_=(arg : Boolean)={this.setIsAbstract(arg)}
var _allAttributeCache : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]= _
def Kerget_allAttributeCache() : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]={this._allAttributeCache}
def Kerset_allAttributeCache(arg:java.util.List[fr.irisa.triskell.kermeta.language.structure.Property])={ this._allAttributeCache = arg}
def Scala_allAttributeCache : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]={this.Kerget_allAttributeCache()}
def Scala_allAttributeCache_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property])={this.Kerset_allAttributeCache(arg)}
var _allSuperTypesCache : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]= _
def Kerget_allSuperTypesCache() : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]={this._allSuperTypesCache}
def Kerset_allSuperTypesCache(arg:java.util.List[fr.irisa.triskell.kermeta.language.structure.Type])={ this._allSuperTypesCache = arg}
def Scala_allSuperTypesCache : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]={this.Kerget_allSuperTypesCache()}
def Scala_allSuperTypesCache_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type])={this.Kerset_allSuperTypesCache(arg)}
def ScalasuperType : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]={this.getSuperType()}
def ScalasuperType_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type])={this.getSuperType().clear
this.getSuperType().addAll(arg)
}
def Scalainv : java.util.List[fr.irisa.triskell.kermeta.language.structure.Constraint]={this.getInv()}
def Scalainv_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Constraint])={this.getInv().clear
this.getInv().addAll(arg)
}
var allOperation : java.util.List[fr.irisa.triskell.kermeta.language.structure.Operation] = new java.util.ArrayList[fr.irisa.triskell.kermeta.language.structure.Operation]
def KergetAllOperation() : java.util.List[fr.irisa.triskell.kermeta.language.structure.Operation]={this.allOperation}
def ScalaallOperation : java.util.List[fr.irisa.triskell.kermeta.language.structure.Operation]={this.KergetAllOperation()}
var allAttribute : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property] = new java.util.ArrayList[fr.irisa.triskell.kermeta.language.structure.Property]
def KergetAllAttribute() : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]={this.allAttribute}
def ScalaallAttribute : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]={this.KergetAllAttribute()}
def ScalaownedAttribute : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]={this.getOwnedAttribute()}
def ScalaownedAttribute_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property])={this.getOwnedAttribute().clear
this.getOwnedAttribute().addAll(arg)
}

    def getCachedAllAttribute():java.util.List[fr.irisa.triskell.kermeta.language.structure.Property] = {
var result : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property] = null.asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]]; 


{
if (Scala_allAttributeCache.isVoid())

{
Scala_allAttributeCache = ScalaallAttribute;}

result = Scala_allAttributeCache;}
 return result
}

    def getCachedAllSuperTypes():java.util.List[fr.irisa.triskell.kermeta.language.structure.Type] = {
var result : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type] = null.asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]]; 


{
if (Scala_allSuperTypesCache.isVoid())

{
Scala_allSuperTypesCache = allSuperTypes();}

result = Scala_allSuperTypesCache;}
 return result
}

    def allSuperTypes():java.util.List[fr.irisa.triskell.kermeta.language.structure.Type] = {
var result : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type] = null.asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]]; 


{
var allSuperClasses : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type] = kermeta.standard.RichFactory.createSet[fr.irisa.triskell.kermeta.language.structure.Type];
var superClasses : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type] = kermeta.standard.RichFactory.createSet[fr.irisa.triskell.kermeta.language.structure.Type];
superClasses.addAll(this.ScalasuperType)


{superClasses.isEmpty().not()
while (!(superClasses.isEmpty()))


{
allSuperClasses.addAll(superClasses)
var temp : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type] = kermeta.standard.RichFactory.createSet[fr.irisa.triskell.kermeta.language.structure.Type];
superClasses.each({(s)=>

{
if (s.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.ParameterizedType])

{
if (s.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ParameterizedType].ScalatypeDefinition.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.ClassDefinition])

{
temp.addAll(s.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ParameterizedType].ScalatypeDefinition.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ClassDefinition].ScalasuperType)}
}
}
})
superClasses.clear()
superClasses.addAll(temp)}
}
result = allSuperClasses;}
 return result
}
}

