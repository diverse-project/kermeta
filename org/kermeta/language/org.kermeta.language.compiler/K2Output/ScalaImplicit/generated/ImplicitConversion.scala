package ScalaImplicit.generated
object ImplicitConversion {
 implicit def richAspect(v : _root_.java.lang.Object) :fr.irisa.triskell.kermeta.language.structure.Object = v.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
      implicit def richAspect1(o : _root_.java.lang.Object) : fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect = {
     if (o != null && o.isInstanceOf[java.lang.String]){
       return new kermeta.standard.RichString(o.asInstanceOf[java.lang.String])
     }
     else if (o != null && o.isInstanceOf[java.lang.Boolean]){
       return new kermeta.standard.RichJavaBoolean(o.asInstanceOf[java.lang.Boolean])
     }
     else if (o != null && o.isInstanceOf[java.lang.Integer]){
       return new kermeta.standard.RichInteger(o.asInstanceOf[java.lang.Integer].intValue)
     }
     else if (o != null && o.isInstanceOf[java.util.List[_]]){
       return new kermeta.standard.JavaConversions.RichKermetaList(o.asInstanceOf[java.util.List[_]])
     }
     if ( o.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object])
       return o.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
     else if (o!=null)
     {
      return new kermeta.standard.RichEnum(o)
}
     else
       null.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
   }
 implicit def richAspect(v : helloworld.HelloWorld) = v.asInstanceOf[helloworld.HelloWorldAspect]
 implicit def richAspect(v : helloworld.HelloWorldAspect) = v.asInstanceOf[helloworld.HelloWorld]
 implicit def richAspect(v : kermeta.exception.NotImplementedException) = v.asInstanceOf[kermeta.exception.NotImplementedExceptionAspect]
 implicit def richAspect(v : kermeta.exception.NotImplementedExceptionAspect) = v.asInstanceOf[kermeta.exception.NotImplementedException]
}

