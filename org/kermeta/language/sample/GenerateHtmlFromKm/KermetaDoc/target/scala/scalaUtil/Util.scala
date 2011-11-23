package scalaUtil
 object Util {
    def getMetaClass(t:String):org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass(t);
if (cd !=null){
            var cl = group.KermetaDoc.org.kermeta.language.structure. KerRichFactory.createClass
            cl.setTypeDefinition(cd)
          return cl
        }else
            return null;
}
    def clone(t:org.kermeta.language.structure.Class, o:Any):Any={return null;
}
}

