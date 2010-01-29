package test.resource.testCases.LoadSaveKm
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait LoadKmAspect  extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion{

    def LoadKmTest():Void = {
var result : Void = null.asInstanceOf[Void]; 


{
stdio.writeln("Loadind KM")
this.loadModel("000HelloWorld.km").each({(e)=>

{
e.Scalapackages.each({(e)=>

{
stdio.writeln(e.Scalaname)}
})}
})
stdio.writeln("End of Loading KM")}
 return result
}

    def loadModel(inputKMFile : java.lang.String):java.util.List[fr.irisa.triskell.kermeta.language.structure.ModelingUnit] = {
var result : java.util.List[fr.irisa.triskell.kermeta.language.structure.ModelingUnit] = null.asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.language.structure.ModelingUnit]]; 


{
var repository : kermeta.persistence.Repository = kermeta.persistence.RichFactory.createEMFRepository;
var resource : kermeta.persistence.Resource = repository.getResource(inputKMFile);
result = kermeta.standard.RichFactory.createSequence[fr.irisa.triskell.kermeta.language.structure.ModelingUnit];
resource.each({(modelingUnit)=>

{
result.add(modelingUnit.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ModelingUnit])}
})}
 return result
}
}

