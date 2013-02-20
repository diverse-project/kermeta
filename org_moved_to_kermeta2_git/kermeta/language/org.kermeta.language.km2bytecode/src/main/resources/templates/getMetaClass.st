     override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
        var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("$ClassName$");
        if (cd !=null){
            var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure. RichFactory.createClass
            cl.setTypeDefinition(cd)
            return cl
        }else
            return null;
     }
