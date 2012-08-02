/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package  k2.utils
import org.eclipse.emf.ecore._

object UTilScala {

    def isInstanceOf(o:k2.standard.KermetaObject, typ:org.kermeta.language.structure.Type):Boolean={
      if(o==null)
        return true
      var metaClass = o.getMetaClass()
      typ match {
        case typ:org.kermeta.language.structure.Class if(metaClass!=null) => typ.equals(metaClass) || getAllSuperClasses(metaClass).contains(typ) 
        case typ:org.kermeta.language.structure.Class => false
        case typ => false
      }
    }
    
    /**
     * If the object is a ScalaWrapper, unpack it.
     */
    def getValue(o:k2.standard.KermetaObject):Object={
      o match {
        case o:k2.standard.ScalaWrapper => o.getValue()
        case o => o
      } 
    }
    
    def getAllSuperClasses(cl:org.kermeta.language.structure.Class):java.util.List[org.kermeta.language.structure.Class]={
      import scala.collection.JavaConversions._
      if(cl.getSuperClass().size==0)
        return new java.util.ArrayList[org.kermeta.language.structure.Class]
      
      val result = new java.util.ArrayList[org.kermeta.language.structure.Class]
      cl.getSuperClass().foreach{sc => 
        result.add(sc)
        result.addAll(getAllSuperClasses(sc))}
      result
    }

    def newInstance(o:org.kermeta.language.structure.Class): k2.standard.KermetaObject ={
      import k2.standard.PrimitiveConversion._
      
       // println("newInstance " + o + " " +o.getName)
        var name: _root_.java.lang.String = getQualifiedNamePackage(o.getTypeDefinition.eContainer.asInstanceOf[org.kermeta.language.structure.Package],".")
        var packName = k2.utils.TypeEquivalence.getPackageEquivalence(name)
        if (!(packName == "kermeta.exceptions" ||
          packName == "kermeta.io"||
          packName == "kermeta.kunit"||
          packName == "kermeta.persistence"||
          packName == "kermeta.standard"
        )){
          //packName = scalaAspectPrefix +"." + packName
        }



        var factoryName = packName + ".KerRichFactory$"
        var methodName = "create" + o.getTypeDefinition.getName
        // Dirty patch, supposed to be temporary
        // See bug 2188
        val clazz = 
          try{
            java.lang.Class.forName(factoryName)
          } catch{
            case e:java.lang.ClassNotFoundException => java.lang.Class.forName(scalaAspectPrefix +"." + factoryName)
          }
        val obj = clazz.getField("MODULE$").get(clazz)
        var meth :_root_.java.lang.reflect.Method = clazz.getMethods.filter(m=> m.getName.equals(methodName)).first
        //println(meth.getName + " " + meth.getParameterTypes.size)
        val numbers = Array()
        
        meth.invoke(obj, numbers: _*) match {
          case e:k2.standard.KermetaObject => return e
          case e:java.lang.String => return string2kermeta(e)
          case e:java.lang.Double => return double2kermeta(e)
          case e:java.lang.Integer => return integer2kermeta(e)
          case e:java.lang.Long => return long2kermeta(e)
          case e:java.lang.Short => return short2kermeta(e)
          case e:java.lang.Boolean => return boolean2kermeta(e)
          case e:java.lang.Character => return character2kermeta(e)
          case e:java.lang.StringBuilder => return stringbuffer2kermeta(e)
          // default
          case e => return e.asInstanceOf[k2.standard.KermetaObject] 
        }
    }
    
    def isNotEqual(o:k2.standard.KermetaObject,o1:k2.standard.KermetaObject):java.lang.Boolean={
      if(o==null)
        o1!=null
      else
        o.isNotEqual(o1)
    }
    
    def toString(o:Any):java.lang.String={
      if(o==null)
        "void"
      else
        o.toString
    }

 @scala.reflect.BeanProperty
 var scalaAspectPrefix : _root_.java.lang.String = "ScalaAspect"

  def getQualifiedNamePackage(pack : org.kermeta.language.structure.Package,sep: _root_.java.lang.String):String ={
    var res : _root_.java.lang.String=""
    if (pack.getNestingPackage !=null){
      res = getQualifiedNamePackage(pack.getNestingPackage,sep) +sep
    }
    res = res + pack.getName
    return res
  }

   def getQualifiedNameClassJava(pack : org.kermeta.language.structure.GenericTypeDefinition, sep: _root_.java.lang.String):String ={
       return    k2.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[org.kermeta.language.structure.Package],sep)) + sep+ pack.getName();
    }
 def getQualifiedNameTypeJava(pack : org.kermeta.language.structure.Type, sep: _root_.java.lang.String):_root_.java.lang.String ={
     if (pack.isInstanceOf[org.kermeta.language.structure.Class]){
         return getQualifiedNameClassJava(pack.asInstanceOf[org.kermeta.language.structure.Class].getTypeDefinition,sep)
     }else if(pack.isInstanceOf[org.kermeta.language.structure.DataType]){
      return   k2.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNamePackage(pack.eContainer().asInstanceOf[org.kermeta.language.structure.Package],sep) )+ sep+ pack.asInstanceOf[org.kermeta.language.structure.DataType].getName();

     }else
         return ""
    }



   def getQualifiedNameClassKermeta(pack : org.kermeta.language.structure.GenericTypeDefinition, sep: _root_.java.lang.String):_root_.java.lang.String ={
       return    getQualifiedNamePackage(pack.eContainer().asInstanceOf[org.kermeta.language.structure.Package],sep) + sep+ pack.getName();
    }
 def getQualifiedNameTypeKermeta(pack : org.kermeta.language.structure.Type, sep: _root_.java.lang.String):_root_.java.lang.String ={
     if (pack.isInstanceOf[org.kermeta.language.structure.Class]){
         return getQualifiedNameClassKermeta(pack.asInstanceOf[org.kermeta.language.structure.Class].getTypeDefinition,sep)
     }else if(pack.isInstanceOf[org.kermeta.language.structure.DataType]){
      return   getQualifiedNamePackage(pack.eContainer().asInstanceOf[org.kermeta.language.structure.Package],sep) + sep+ pack.asInstanceOf[org.kermeta.language.structure.DataType].getName();

     }else
         return ""
    }

}

object ConvertGenericType{
  def convert(r : EGenericType):EGenericType ={
      var result =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init.getEcoreFactory.createEGenericType;

    if (r.getEClassifier.isInstanceOf[org.kermeta.language.structure.KermetaModelElement])
      result.setEClassifier(r.getEClassifier)
    else{
      if (r.getEClassifier.isInstanceOf[EClass])
        result.setEClassifier(ConvertEClass.convert(r.getEClassifier.asInstanceOf[EClass]))
      else
        result.setEClassifier(ConvertDataType.convert(r.getEClassifier.asInstanceOf[EDataType]))
    }
    result.setELowerBound(r.getELowerBound)
    result.setETypeParameter(r.getETypeParameter)
    result.setEUpperBound(r.getEUpperBound)
    result.getETypeArguments.clear
    result.getETypeArguments.addAll(r.getETypeArguments)

    if (r.eContainer.isInstanceOf[EClass]){
      var c = r.eContainer.asInstanceOf[EClass]
      c.getEGenericSuperTypes.remove(r)
      c.getEGenericSuperTypes.add(result)
    }else if (r.eContainer.isInstanceOf[EStructuralFeature]){
      var c = r.eContainer.asInstanceOf[EStructuralFeature]
      c.setEGenericType(result)
    }else if (r.eContainer.isInstanceOf[EGenericType]){
      var c = r.eContainer.asInstanceOf[EGenericType]
      if (r == c.getELowerBound)
        c.setELowerBound(result)
      else if (r == c.getEUpperBound)
        c.setEUpperBound(result)
    }else if (r.eContainer.isInstanceOf[ETypeParameter]){
      var c = r.eContainer.asInstanceOf[ETypeParameter]
            c.getEBounds.remove(r)
            c.getEBounds.add(result)
    }
    return result

  }
}

  object ConvertDataType{
  def convert(r : EDataType):EDataType ={
    println("TOTO" + r)
      var result =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init.getEcoreFactory.createEDataType;

    result.setInstanceClass(r.getInstanceClass);
    result.setName(r.getName);
    result.setInstanceClassName(r.getInstanceClassName);
    result.setInstanceTypeName(r.getInstanceTypeName);
    result.setSerializable(r.isSerializable)
    result.getEAnnotations.clear
    result.getEAnnotations.addAll(r.getEAnnotations)

    if (r.eContainer.isInstanceOf[EPackage]){
      var c = r.eContainer.asInstanceOf[EPackage]
      c.getEClassifiers.remove(r)
      c.getEClassifiers.add(result)
    }
    return result

  }

}

object ConvertEClass{
def convert(r : EClass):EClass ={
   var result =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init.getEcoreFactory.createEClass;
  result.setInstanceClass(r.getInstanceClass);
  result.setName(r.getName);
  result.setInstanceClassName(r.getInstanceClassName);
  result.setInstanceTypeName(r.getInstanceTypeName);
  result.setInterface(r.isInterface)
  result.setAbstract(r.isAbstract)
  result.getEStructuralFeatures.clear
  result.getEStructuralFeatures.addAll(r.getEStructuralFeatures)
  result.getEGenericSuperTypes.clear
  result.getEGenericSuperTypes.addAll(r.getEGenericSuperTypes)
  result.getEOperations.clear
  result.getEOperations.addAll(r.getEOperations)
  result.getESuperTypes.clear
  result.getESuperTypes.addAll(r.getESuperTypes)
  result.getEAnnotations.clear
  result.getEAnnotations.addAll(r.getEAnnotations)


  if (r.eContainer.isInstanceOf[EPackage]){
    var c = r.eContainer.asInstanceOf[EPackage]
    c.getEClassifiers.remove(r)
    c.getEClassifiers.add(result)
  }
  return result

}

}

/**
 * A List intended to be returned as a result of java.util.List::subList<br/>
 */
class SubList[E](val list:java.util.List[E],var fromIndex:Int,var toIndex:Int) extends java.util.List[E]{
 // fromIndex is inclusive, and toIndex exclusive
  
  import java.{util=>ju}
  import scala.collection.JavaConversions._
  
  if(toIndex>list.size()||fromIndex<0||fromIndex>toIndex)
    throw new IndexOutOfBoundsException
    
  /**
   * Returns always true, according to java.util.List::add specification
   */
  override def add(e:E):Boolean={
    val oldsize = list.size()
    list.add(toIndex,e)
    toIndex+=list.size()-oldsize
    true
  }
  
  override def add(index:Int,e:E):Unit={
    if(index<0||index>this.size)
      throw new IndexOutOfBoundsException
    val oldsize=list.size
    list.add(index+fromIndex,e)
    toIndex+=list.size-oldsize
  }
  
  override def addAll(c:ju.Collection[_<:E]):Boolean={
    val oldsize=list.size
    val res=list.addAll(toIndex,c)
    toIndex+=list.size()-oldsize
    res
  }
  
  override def addAll(index:Int,c:ju.Collection[_<:E]):Boolean={
    if(index<0||index>this.size)
      throw new IndexOutOfBoundsException
    val oldsize=list.size
    val res=list.addAll(index+fromIndex,c)
    toIndex+=list.size-oldsize
    res
  }
  
  override def clear():Unit={
    for(_ <- fromIndex until toIndex)
      list.remove(fromIndex)
    toIndex=fromIndex
  }
  
  override def contains(o:Object):Boolean={
    for(i <-fromIndex until toIndex){
      val obj=list.get(i)
      if(obj==null && o==null)
        return true
      else if(obj.equals(o))
        return true
    }
    false
  }
  
  override def containsAll(c:ju.Collection[_]):Boolean={
    c.forall(this.contains(_))
  }
  
  override def equals(o:Any):Boolean={
    o match{
      case o:ju.List[_] => o.size==this.size() && {
        var test = true
    	var i=0
    	while(test && i<o.size()){
    	  test = (list.get(fromIndex+i).equals(o.get(i)))
    	  i+=1
    	}
    	test
      }
      case _ => false
    }
  }
  
  override def get(index:Int):E={
    if(index<0||index>this.size)
      throw new IndexOutOfBoundsException
    list.get(fromIndex+index)
  }
  
  override def hashCode():Int={
    (fromIndex until toIndex).foldLeft(1){(acc,index) =>
      val obj=list.get(index)
      31*acc+{if(obj==null) 0 else obj.hashCode()}
    }
  }
  
  override def indexOf(o:Object):Int={
    for(i <- fromIndex until toIndex){
      val obj=list.get(i)
      if((obj==null && o==null) || obj.equals(o))
        return i-fromIndex
    }
    -1
  }
  
  override def isEmpty():Boolean={
    toIndex==fromIndex
  }
  
  override def iterator():ju.Iterator[E]={
    new ListIterator[E](this)
  }
  
  override def lastIndexOf(o:Object):Int={
    for(i <- (toIndex-1) to fromIndex){
      val obj=list.get(i)
      if((obj==null && o==null) || obj.equals(o))
        return i-fromIndex
    }
    -1
  }
  
  override def listIterator():ju.ListIterator[E]={
    new ListIterator[E](this)
  }
  
  override def listIterator(index:Int):ju.ListIterator[E]={
    if(index<0||index>this.size)
      throw new IndexOutOfBoundsException
    new ListIterator[E](this,index)
  }
  
  override def remove(index:Int):E={
    if(index<0||index>this.size)
      throw new IndexOutOfBoundsException
    val res=list.remove(fromIndex+index)
    toIndex-=1
    res
  }
  
  override def remove(o:Object):Boolean={
	for(i <-fromIndex until toIndex){
	  val obj=list.get(i)
	  if((obj==null && o==null) || obj.equals(o)){
	    list.remove(i)
	    toIndex-=1
	    return true
	  }
	}
	false
  }
  
  override def removeAll(c:ju.Collection[_]):Boolean={
    val oldsize=list.size
    c.foreach(o=>this.remove(o.asInstanceOf[Object]))
    list.size!=oldsize
  }
  
  override def retainAll(c:ju.Collection[_]):Boolean={
    val oldsize=list.size
    val i=list.listIterator(fromIndex)
    while(i.hasNext && i.nextIndex()<toIndex){
      if(!c.contains(i.next))
        i.remove()
    }
    toIndex+=list.size()-oldsize
    list.size()!=oldsize
  }
  
  override def set(index:Int,element:E):E={
    if(index<0||index>this.size())
      throw new IndexOutOfBoundsException
    list.set(fromIndex+index,element)
  }
  
  override def size():Int={
    toIndex-fromIndex
  }
  
  override def subList(fromIndex:Int,toIndex:Int):ju.List[E]={
    new SubList[E](this,fromIndex,toIndex)
  }
  
  override def toArray():Array[Object]={
    val res:Array[Object]=new Array[Object](this.size)
    for(i<-fromIndex until toIndex)
      res.update(i,list.get(i).asInstanceOf[Object])
    res
  }
  
  override def toArray[T](a:Array[T with Object])={
    for(i<-fromIndex until toIndex){
      if(!list.get(i).isInstanceOf[T with Object])
        throw new ArrayStoreException
    }
    val res={
      if(a.length < this.size()){
        a(this.size)=null.asInstanceOf[T with Object]
        a
      } else if (a.length==this.size)
        a
      else
        new Array[T with Object](this.size)
    }
    for(i<-0 until this.size)
      res(i)=list.get(fromIndex+i).asInstanceOf[T with Object]
    res
  }
  
}

/**
 * A simple list iterator
 */
class ListIterator[E](list:java.util.List[E]) extends java.util.ListIterator[E]{
  import java.{util=>ju}
  
  var cursor:Int=0
  var last:Option[Int]=None
  
  def this(list:java.util.List[E],index:Int)={
    this(list)
    if(index<0||index>list.size)
      throw k2.exceptions.KerRichFactory.createIndexOutOfBound
    cursor=index
  }
  
  override def add(e:E):Unit={
    list.add(cursor,e)
    cursor+=1
    last=None
  }
  
  override def hasNext():Boolean={
    cursor<list.size()
  }
  
  override def hasPrevious():Boolean={
    cursor > -1
  }
  
  override def next():E={
    if(cursor==list.size)
      throw new ju.NoSuchElementException
    last=Some(cursor)
    cursor+=1
    list.get(cursor-1)
  }
  
  override def nextIndex():Int={
    cursor
  }
  
  override def previous():E={
    if(cursor==0)
      throw new ju.NoSuchElementException
    cursor-=1
    last=Some(cursor)
    list.get(cursor)
  }
  
  override def previousIndex():Int={
    cursor-1
  }
  
  override def remove():Unit={
    last match{
      case Some(index)=>list.remove(index)
      case None => throw new IllegalStateException
    }
    last=None
  }
  
  override def set(e:E):Unit={
    last match{
      case Some(index)=>list.set(index,e)
      case None => throw new IllegalStateException
    }
  }
}


