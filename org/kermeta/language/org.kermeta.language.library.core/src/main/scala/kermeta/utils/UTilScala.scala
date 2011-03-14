/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package  kermeta.utils

object UTilScala {
 
    def isInstanceOf(o:Object, typ:Object):Boolean={
        if (o.getClass.getName.equals(typ.getClass.getName))
            return true
        if (typ.isInstanceOf[org.kermeta.language.structure.PrimitiveType]){
            if ( typ.asInstanceOf[org.kermeta.language.structure.PrimitiveType].getName.equals("EString") && o.getClass.getName.equals("kermeta.standard.RichString") )
            return true
                
           // println("toto " + typ.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.PrimitiveType].getName)
        }
       // println(o + "" + typ)
        return false;
    }
    
    def newInstance(o:org.kermeta.language.structure.Class): kermeta.standard.KermetaObject ={
       // println("newInstance " + o + " " +o.getName)
        var name: String = getQualifiedNamePackage(o.getTypeDefinition.eContainer.asInstanceOf[org.kermeta.language.structure.Package],".")
        var factoryName = scalaAspectPrefix +"." + kermeta.utils.TypeEquivalence.getPackageEquivalence(name) + ".RichFactory$"
        var methodName = "create" + o.getTypeDefinition.getName
          val clazz = java.lang.Class.forName(factoryName)
        val obj = clazz.getField("MODULE$").get(clazz)
        var meth :java.lang.reflect.Method = clazz.getMethods.filter(m=> m.getName.equals(methodName)).first
        //println(meth.getName + " " + meth.getParameterTypes.size)
        val numbers = Array()
        return meth.invoke(obj, numbers: _*).asInstanceOf[ kermeta.standard.KermetaObject]
    }
    
 @scala.reflect.BeanProperty
 var scalaAspectPrefix : String = "ScalaAspect"
  
  def getQualifiedNamePackage(pack : org.kermeta.language.structure.Package,sep: String):String ={
    var res : String=""
    if (pack.getNestingPackage !=null){
      res = getQualifiedNamePackage(pack.getNestingPackage,sep) +sep
    }
    res = res + pack.getName
    return res
  }

   def getQualifiedNameClass(pack : org.kermeta.language.structure.GenericTypeDefinition, sep: String):String ={
       return    kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[org.kermeta.language.structure.Package],sep)) + sep+ pack.getName();
    }
 def getQualifiedNameType(pack : org.kermeta.language.structure.Type, sep: String):String ={
     if (pack.isInstanceOf[org.kermeta.language.structure.Class]){
         return getQualifiedNameClass(pack.asInstanceOf[org.kermeta.language.structure.Class].getTypeDefinition,sep)
     }else if(pack.isInstanceOf[org.kermeta.language.structure.DataType]){
      return   kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[org.kermeta.language.structure.Package],sep) )+ sep+ pack.asInstanceOf[org.kermeta.language.structure.DataType].getName();
         
     }else
         return ""
    } 

}
