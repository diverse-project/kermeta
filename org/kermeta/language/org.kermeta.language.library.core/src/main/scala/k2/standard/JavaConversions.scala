package k2.standard;


import org.eclipse.emf.common.util.EList
import java.{ util => ju , lang => jl}
import scala.collection.JavaConversions._
import org.eclipse.emf.common.util.UniqueEList
  
    trait KermetaCol[A] extends EObjectImplForPrimitive with EList[A] with _root_.k2.standard.KermetaObject {
	
    	def add(e:A):Boolean
    	
        def addSafe(e:Any)(implicit m:Manifest[A]) :Unit

        def remove(e:A):Unit
        
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
        
        override def remove(o:Object):Boolean
        
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
      
      override def remove(e:A):Unit
      
      override def equals(e:KermetaObject):jl.Boolean
      
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
      
      override def equals(e:KermetaObject):jl.Boolean
      
      def union(elements:KermetaCol[A]):KermetaBag[A]
      
      def intersection(elements:KermetaCol[A]):KermetaBag[A]
      
      def intersectionWithSet(elements:KermetaSet[A]):KermetaSet[A]
      
      def removeFromOid(elementOid:Int):Unit
      
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



