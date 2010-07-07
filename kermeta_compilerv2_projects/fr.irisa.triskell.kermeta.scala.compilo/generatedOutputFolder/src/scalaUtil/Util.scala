package scalaUtil
 object Util {
    def getMetaClass(t:String):fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass(t);
if (cd !=null){
            var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure. RichFactory.createClass
            cl.setTypeDefinition(cd)
          return cl
        }else
            return null;
}
}

