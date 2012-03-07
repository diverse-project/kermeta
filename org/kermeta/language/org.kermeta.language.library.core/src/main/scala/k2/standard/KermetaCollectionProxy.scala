package k2.standard
import java.{ lang => jl, util => ju }
import org.eclipse.emf.common.util.EList

/*
 * Proxy class used to convert List<EObject> to List<KermetaObject> since their content are supposed to convert using implicit conversion
 * TODO : find a way to reuse code from JavaConversion.scala ?
 */

class KermetaListProxy[A <: _root_.k2.standard.KermetaObject] ( value : ju.List[_root_.org.eclipse.emf.ecore.EObject]) extends   EObjectImplForPrimitive with ju.List[A] with  _root_.k2.standard.KermetaObject{

  def add(e:A) :Boolean= {
		  return value.add(e);
  }
  def add(index:Int, element:A) ={
    value.add(index, element);
  }


  def addAll(c : ju.Collection[_ <: A]):Boolean ={
	  return value.addAll(c);
  }
  
  def addAll(index:Int, c: ju.Collection[_ <: A]):Boolean ={
    return value.addAll(index, c);
  }
  
  
  def clear() ={
	  value.clear();
  }
  def contains( o:Object) :Boolean = {
    if (value == null)
    	return false
    else
    	return value.contains(o);
  }
  def containsAll( arg0:ju.Collection[_]) :Boolean ={
	  return value.containsAll(arg0);
  }
  
  def get(index:Int) : A= {
	  return value.get(index).asInstanceOf[A];
  }
  def indexOf(o: Object):Int= {
    return value.indexOf(o);
  }
  def  isEmpty() :Boolean = {
    return value.isEmpty();
  }
  def iterator() :ju.Iterator[A]={
	return listIterator( );
  }
  def move( newPosition : Int, o : A){
	if(value.contains(o)){
		value.remove(o)
		value.add(newPosition, o)
	 }
  }
  
  def lastIndexOf( o:Object):Int= {
    return value.lastIndexOf(o);
  }
  def  listIterator( ): ju.ListIterator[A]= {
    return new KermetaListIteratorProxy(value.listIterator()) ;
  }
  def  listIterator( arg0:Int): ju.ListIterator[A]= {
    return new KermetaListIteratorProxy(value.listIterator(arg0)) ;
  }
  
  def remove(obj:Int):A= {
    return this.remove(new java.lang.Integer(obj));
  }


  def remove( o:Object):Boolean= {
  	return value.remove(o);
  }
  def removeAll( arg0 :ju.Collection[_] ) :Boolean= {
		  return value.removeAll(arg0);
  }
  def retainAll(arg0 :ju.Collection[_]) :Boolean = {
    return value.retainAll(arg0);
  }
  def set(index:Int, element:A):A= {
    return value.set(index, element).asInstanceOf[A];
  }
  def size() :Int = {
    return value.size();
  }
  def subList(arg0:Int, arg1:Int) : ju.List[A] = {
	return new KermetaListProxy[A](value.subList(arg0, arg1));
  }
  def toArray(): Array[Object] = {
    return value.toArray();
  }
  
  /*
   * Copy from the toArray operation in RichKermetaList (JavaConversions.scala)
   */
  def  toArray [T](x$1: Array[T with java.lang.Object]) : Array[T with java.lang.Object]={
     var result : Array[T with java.lang.Object] = new Array[T with java.lang.Object](value.size())
        	var i : ju.Iterator[A] = iterator()
        	var index : Integer = 0
        	while (i.hasNext()) {
        		var current : A = i.next()
        		if (current.isInstanceOf[T with java.lang.Object]) {
        			result(index) = current.asInstanceOf[T with java.lang.Object]
        			index = index + 1
        		}
        	}
            return result
  }
}



class KermetaListIteratorProxy[A <: _root_.k2.standard.KermetaObject]( value : ju.ListIterator[_root_.org.eclipse.emf.ecore.EObject]) extends ju.ListIterator[A] {
	def add(o : A){
	  value.add(o)
	}
	def set(o : A){
	  value.set(o)
	}
	def remove(){
	  value.remove()
	}
	def previousIndex() : Int = {
	  return value.previousIndex()
	}
	
	def nextIndex() : Int = {
	  return value.nextIndex()
	}
	def hasPrevious() : Boolean = {
	  return value.hasPrevious()
	}
	def hasNext() : Boolean = {
	  return value.hasNext()
	}
	
	
	def previous() : A = {
	  return value.previous().asInstanceOf[A]
	}
	def next() : A = {
	  return value.next().asInstanceOf[A]
	}
}