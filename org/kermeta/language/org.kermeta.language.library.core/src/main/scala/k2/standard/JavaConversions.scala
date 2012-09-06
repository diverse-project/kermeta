package k2.standard;


import org.eclipse.emf.common.util.EList
import java.{ util => ju , lang => jl}
import scala.collection.JavaConversions._
import org.eclipse.emf.common.util.UniqueEList
  
    trait KermetaCol[A] extends EObjectImplForPrimitive with EList[A] with _root_.k2.standard.KermetaObject {
	
    	def add(e:A):Boolean
    	
        def addSafe(e:Any)(implicit m:Manifest[A]) :Unit

        def remove(e:Any):Boolean
        
        def clear() : Unit
        
        def addAll(elts:KermetaCol[A]):Unit
        
        def contains(e:Any):Boolean
        
        /** OCL compatibility:
         * does the same than contains
         */
        def includes(e:A):Boolean
        
        def containsAll(elts:KermetaCol[A]):Boolean
        
        /** OCL compatibility:
         * does the same than containsall
         */
        def includesAll(elts:KermetaCol[A]):Boolean
        
        def excludes(e:A):Boolean
        
        def excludesAll(elts:KermetaCol[A]):Boolean
        
        def size():Int
        
        def empty():Boolean
        
        /** OCL compatibility:
         * does the same than empty
         */
        def isEmpty():Boolean
        
        def isNotEmpty():Boolean
        
        def iterator():ju.Iterator[A]
        
        def one() : A
        
        def any():A
        
        /**
         * each is protected against concurrent modification, 
         * i.e. it is possible to modify the collection while iterating with each
         */
        def each(func : A=> Unit):Unit
  
        /**
         * indexedEach is not protected against concurrent modification, 
         * i.e. it is possible to modify the collection while iterating with each
         */
        def indexedEach(func:(A,EachContext)=>Unit):Unit

        def forAll(f : A=>Boolean) :Boolean

        def forAllCpl(f : (A,A)=>Boolean) :Boolean
        
        def exists(func:A=>Boolean):Boolean
        
        def existsCpl(f:(A,A)=>Boolean):Boolean 
        
        def collect[T](collector:A=>T):KermetaSequence[T]

        def isUnique[T](collector:A=>T):Boolean
        
        def detect(detector : A=>Boolean):A
        
        def select(selector:A=>Boolean):KermetaSequence[A]
        
        def selectOne(selector:A=>Boolean):KermetaSequence[A]
        
        def reject(rejector:A=>Boolean):KermetaSequence[A]
        
        def count(e:A):Int
        
        def sum():A
        
    	def asBag() : KermetaBag[A]
    	
    	def asSet() : KermetaSet[A]
        
        def asSequence() :KermetaSequence[A]
        
        def asSequenceType[T](implicit m:Manifest[T]):KermetaSequence[T]

        def asOrderedSet() : KermetaOrderedSet[A]
        
        /////////////////////////////////////////////////////////////////////////////////////////
        // The following methods are not part of the KermetaCol specification,
        // but are necessary from an EList point of view
        /////////////////////////////////////////////////////////////////////////////////////////
        
        override def add(index:Int,o:A):Unit
        
        override def addAll(c:ju.Collection[_<:A]):Boolean

        override def addAll(index:Int,c:ju.Collection[_<:A]):Boolean
        
        override def containsAll(c:ju.Collection[_]):Boolean
        
        override def get(index:Int):A
        
        override def indexOf(o:Object):Int
        
        override def lastIndexOf(o:Object):Int
        
        override def listIterator():ju.ListIterator[A]
        
        override def listIterator(index:Int):ju.ListIterator[A]
        
        override def move(newPosition:Int, obj:A):Unit

        override def move(oldPosition:Int,newPosition:Int):A
        
        override def remove(index:Int):A
        
        override def removeAll(c:ju.Collection[_]):Boolean
        
        override def retainAll(c:ju.Collection[_]):Boolean
        
        override def set(index:Int,o:A):A
        
        override def subList(fromIndex:Int,toIndex:Int):ju.List[A]
        
        override def toArray():Array[Object]
        
        override def toArray[T](a:Array[T with Object]):Array[T with Object]
        
        override def hashCode():Int
        
        ///////////////////////////////////////////////////////////////////////////////
        // Optimization methods
        // Handle with care
        // Perform NO verification (of unicity for example)
        ///////////////////////////////////////////////////////////////////////////////
        
        def unsafeAdd(e:A):Unit
        
        def unsafeAddAll(c:ju.Collection[_<:A]):Unit
    }
    
    trait KermetaSet[A] extends KermetaCol[A] {
      
      override def add(e:A):Boolean
      
      override def remove(e:Any):Boolean
      
      override def equals(e:Any):Boolean
      
      override def count(e:A):Int

      override def asSet():KermetaSet[A]
      
      override def asOrderedSet():KermetaOrderedSet[A]

      def union(elements:KermetaSet[A]):KermetaSet[A]
      
      def unionWithBag(elements:KermetaBag[A]):KermetaBag[A]
      
      def intersection(elts:KermetaCol[A]):KermetaSet[A]
      
      def minus(elements:KermetaSet[A]):KermetaSet[A]
      
      def symmetricDifference(s:KermetaSet[A]):KermetaSet[A]
      
      def flatten():KermetaSet[Any]
      
      def sortedBy(comparator:(A,A)=>Int):KermetaOrderedSet[A]
      
    }
    
    trait KermetaBag[A] extends KermetaCol[A]{
      
      override def equals(e:Any):Boolean

      def union(elements:KermetaCol[A]):KermetaBag[A]
      
      def intersection(elements:KermetaCol[A]):KermetaBag[A]
      
      def intersectionWithSet(elements:KermetaSet[A]):KermetaSet[A]
      
      def removeFromOid(element : A):Unit
      
      def removeOne(element:A):Unit
      
      def including(element : A):KermetaBag[A]
      
      def excluding(element:A):KermetaBag[A]
      
      def flatten():KermetaBag[Any]
      
      def sortedBy(comparator:(A,A)=>Int):KermetaSequence[A]
      
    }
    
    trait KermetaOrderedCol[A] extends KermetaCol[A]{

    	def addAt(index:Int,element:A):Unit
    	
    	def removeAt(index:Int):Unit
    	
    	def elementAt(index:Int):A
    	
    	def first():A
    	
    	def last():A
    	
    	override def equals(o:Any):Boolean
    	
    	// hashCode specified by ju.List
    	override def hashCode():Int
    	
    	def index0f(element:A):Int

        def at(index:Int):A
    }
    
    trait KermetaOrderedSet[A] extends KermetaSet[A] with KermetaOrderedCol[A]{
      
      override def addAt(index:Int,element:A):Unit
      
      def subSet(min:Int,max:Int):KermetaOrderedSet[A]
      
      def append(element:A):KermetaOrderedSet[A]
      
      def prepend(element:A):KermetaOrderedSet[A]
      
      def insertAt(index:Int,element:A):KermetaOrderedSet[A]
      
    }
    
    trait KermetaSequence[A] extends KermetaBag[A] with KermetaOrderedCol[A]{
      
      def subSequence(min:Int,max:Int):KermetaSequence[A]
      
      def insertAt(index:Int,element:A):KermetaSequence[A]
      
      def append(element:A):KermetaSequence[A]
      
      def prepend(element:A):KermetaSequence[A]
      
    }
    
object JavaConversions {
  implicit def julist2kermeta[G](value:ju.List[G]):KermetaSequence[G]={new RichKermetaSequence[G](value)}
  implicit def elist2kermeta[G](value:EList[G]):KermetaOrderedCol[G]={
    if(value.isInstanceOf[UniqueEList[G]]) 
      new RichKermetaSet[G](value)
    else
      new RichKermetaSequence[G](value)
  }
  implicit def juSet2Kermeta[A](l: ju.Set[A]):KermetaSet[A] = {
    new RichKermetaSet(new juSet2juListWrapper(l)) 
  }
  implicit def juCollection2Kermeta[A](l: ju.Collection[A]):KermetaCol[A] = {
    if(l.isInstanceOf[ju.Set[A]]) 
      new RichKermetaSet[A](new juSet2juListWrapper(l))
    else
      new RichKermetaSequence[A](l) // todo should also write a wrapper for Sequence other wise we may fall again in a stackoverflow
  }
}

/**
 * Wrapper class that allows to manipulate a java.util.Set as a java.util.List
 * ie.it implements the missing operation by raising NotImplementedException
 */
class juSet2juListWrapper[A](underlying : ju.Set[A]) extends ju.List[A]{
	def size = underlying.size
			
    def iterator = underlying.iterator
  
    
    override def add(elem: A) = underlying.add(elem)
    override def add(pos: Int, elem: A) = {
	  throw new RuntimeException("add(pos: Int, elem: A) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
	override def addAll(coll: java.util.Collection[_ <: A]) = underlying.addAll(coll)
    override def addAll(pos: Int, coll: java.util.Collection[_ <: A]) = {
	  throw new RuntimeException("addAll(pos: Int, coll: java.util.Collection[_]) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
	override def containsAll(coll: java.util.Collection[_]) = underlying.containsAll(coll)
	
	override def get(x$1: Int) ={
	  throw new RuntimeException("get(x$1: Any) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
	
	
	override def listIterator(x$1: Int) ={
	  throw new RuntimeException("istIterator(x$1: Int) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
	override def listIterator() ={
	  throw new RuntimeException("istIterator() not implemented when wrapping a java.util.Set into a java.util.List ")
	}
	override def lastIndexOf(x$1: Object) ={
	  throw new RuntimeException("lastIndexOf(x$1: Any) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
	override def indexOf(x$1: Object) ={
	  throw new RuntimeException("indexOf(x$1: Any) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
	override def set(pos: Int, elem: A) = {
	  throw new RuntimeException("set(pos: Int, elem: A) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
    override def remove(elem: Object) = underlying.remove(elem)
    override def remove(pos: Int) = {
	  throw new RuntimeException("remove(pos: Int) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
    override def removeAll(x$1: java.util.Collection[_]) = underlying.removeAll(x$1)
    
    override def retainAll(x$1: java.util.Collection[_]) = underlying.retainAll(x$1)
    override def subList(pos1: Int, pos2: Int) = {
	  throw new RuntimeException("subList(pos1: Int, pos2: Int) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
  
    def clear = underlying.clear

    def isEmpty =underlying.isEmpty()
    def contains(o : Object) = underlying.contains(o)
    override def toArray() = underlying.toArray()
    override def toArray[T](x$1: Array[T with java.lang.Object]) = { //underlying.toArray(x$1) not sure if this work
	  throw new RuntimeException("toArray[T](x$1: Array[T with java.lang.Object]) not implemented when wrapping a java.util.Set into a java.util.List ")
	}
} 

class EachContext {
	var index:Integer = -1
	var isFirst:Boolean = false
	var isLast:Boolean = false
	
	def Scalaindex : Integer = this.index
	def ScalaisFirst : Boolean = this.isFirst
	def ScalaisLast : Boolean = this.isLast

	def initialize(index:Integer, first:Boolean, last:Boolean) : EachContext = {
	  this.index=index
	  this.isFirst=first
	  this.isLast=last
	  return this;
	}
}



