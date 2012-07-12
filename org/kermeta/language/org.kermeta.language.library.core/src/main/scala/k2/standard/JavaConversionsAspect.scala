package k2.standard;


import org.eclipse.emf.common.util.EList
import java.{ util => ju , lang => jl}
import scala.collection.JavaConversions._
  
    trait KermetaColAspect[A] extends EObjectImplForPrimitive with EList[A] with _root_.k2.standard.KermetaObject with KermetaCol[A]{
	
	// TODO : optimize by removing every intermediate collection created by the lambdas
  
    	val value:ju.List[A]=new java.util.ArrayList[A]
    	
    	def add(e:A):Boolean={
    	  value.add(e)
    	}
    	
        def addSafe(e:Any)(implicit m:Manifest[A]) :Unit= {
          if (m.erasure.isInstance(e))
            this.add(e.asInstanceOf[A])
        }

        def remove(e:A):Unit={
          val i=value.listIterator()
          while(i.hasNext()){
            if(i.next.equals(e)) 
              i.remove
          }
        }
        
        def clear() : Unit ={
          value.clear()
        }
        
        def addAll(elts:KermetaCol[A]):Unit={
          elts.each(e => this.add(e))
        }
        
        def contains(e:Any):Boolean={
          value.contains(e)
        }
        
        /** OCL compatibility:
         * does the same than contains
         */
        def includes(e:A)=contains(e)
        
        def containsAll(elts:KermetaCol[A]):Boolean={
          elts.forAll(this.contains)
        }
        
        /** OCL compatibility:
         * does the same than containsall
         */
        def includesAll(elts:KermetaCol[A]):Boolean=containsAll(elts)
        
        def excludes(e:A):Boolean={
          !this.contains(e)
        }
        
        def excludesAll(elts:KermetaCol[A]):Boolean={
          elts.forAll(this.excludes)
        }
        
        def size()=value.size
        
        def empty():Boolean={
          value.isEmpty
        }
        
        /** OCL compatibility:
         * does the same than empty
         */
        final def isEmpty=empty
        
        def isNotEmpty={!empty}
        
        def iterator():ju.Iterator[A]=value.iterator
        
        def one() : A={
            if (!value.isEmpty)
                return  value.iterator.next
            else
                return null.asInstanceOf[A]
        }
        
        def any():A={
          if(value.isEmpty)
            throw k2.exceptions.KerRichFactory.createEmptyCollection
           else
             return value.iterator.next
        }
        
        /**
         * each is protected against concurrent modification, 
         * i.e. it is possible to modify the collection while iterating with each
         */
        def each(func : A=> Unit):Unit ={
        	val clone=new ju.ArrayList(value)
        	clone.foreach(e=>func(e))
        }
  
        /**
         * indexedEach is not protected against concurrent modification, 
         * i.e. it is possible to modify the collection while iterating with each
         */
        def indexedEach(func:(A,EachContext)=>Unit):Unit = {
        	val clone=new ju.ArrayList(value)
        	var context = new EachContext
        	var index = 0
        	
            clone.foreach{v=>
                  context.initialize(index, index==0, index==value.size-1)
                  func(v, context)
                  index+=1
            }
        }

        def forAll(f : A=>Boolean) :Boolean={
        	value.forall(f)
        }

        def forAllCpl(f : (A,A)=>Boolean) :Boolean={
          value.forall(x=>value.forall(f(x,_)))
        }
        
        def exists(func:A=>Boolean):Boolean={
          value.exists(func)
        }
        
        def existsCpl(f:(A,A)=>Boolean):Boolean = {
          value.exists(x=>value.exists(f(x,_)))
        }
        
        def collect[T](collector:A=>T):KermetaSequence[T]={
          new RichKermetaSequence[T](value.map(collector))
        }

        def isUnique[T](collector:A=>T):Boolean={
          val collected=value.map(collector)
          collected.forall{x => collected.filter(_.equals(x)).size==1}
        }
        
        def detect(detector : A=>Boolean):A={
          value.find(detector) match {
            case Some(x)=>x
            case None=>null.asInstanceOf[A]
          }
        }
        
        def select(selector:A=>Boolean):KermetaSequence[A]={
          new RichKermetaSequence[A](value.filter(selector))
        }
        
        def selectOne(selector:A=>Boolean):KermetaSequence[A]={
          new RichKermetaSequence[A](value.filter(selector).take(1))
        }
        
        def reject(rejector:A=>Boolean):KermetaSequence[A]={
          new RichKermetaSequence[A](value.filterNot(rejector))
        }
        
        def count(e:A):Int={
          value.count(_.equals(e))
        }
        
        def sum():A={
          if(!value.forall(x=>x.isInstanceOf[Summable[A]]))
            throw new IllegalStateException("Some elements of the collection are not summable")
          else if(value.size==0)
            throw new IllegalStateException("Cannot sum an empty collection")
          value.reduceLeft((x,y)=>x.asInstanceOf[Summable[A]].plus(y))
        }
        
    	def asBag() : KermetaBag[A] = {
    	  val res=new RichKermetaBag[A]
    	  res.addAll(value)
    	  res
        }
    	
    	def asSet() : KermetaSet[A] = {
    	  val res=new RichKermetaSet[A]
    	  res.addAll(value)
    	  res
    	}
        
        def asSequence() :KermetaSequence[A] = {
          val res=new RichKermetaSequence[A]
          res.addAll(value)
          res
        }
        
        def asSequenceType[T](implicit m:Manifest[T]):KermetaSequence[T]={
          new RichKermetaSequence[T](value.collect{case x:T if m.erasure.isInstance(x) => x})
        }

        def asOrderedSet() : KermetaOrderedSet[A] = {
    	  val res=new RichKermetaOrderedSet[A]
    	  res.addAll(value)
    	  res
        }
        
        /////////////////////////////////////////////////////////////////////////////////////////
        // The following methods are not part of the KermetaCol specification,
        // but are necessary from an EList point of view
        /////////////////////////////////////////////////////////////////////////////////////////
        
        override def add(index:Int,o:A):Unit=value.add(index,o)
        
        override def addAll(c:ju.Collection[_<:A]):Boolean={
          val oldsize=value.size
          c.foreach(this.add)
          value.size-oldsize!=0
        }

        override def addAll(index:Int,c:ju.Collection[_<:A]):Boolean={
          var i=index
          c.foreach{e=>val oldsize=value.size; this.add(i,e); i+=value.size-oldsize}
          
          i!=0
        }
        
        override def containsAll(c:ju.Collection[_]):Boolean=value.containsAll(c)
        
        override def get(index:Int):A=value.get(index)
        
        override def indexOf(o:Object):Int=value.indexOf(o)
        
        override def lastIndexOf(o:Object):Int=value.lastIndexOf(o)
        
        override def listIterator():ju.ListIterator[A]=new k2.utils.ListIterator[A](this)
        
        override def listIterator(index:Int):ju.ListIterator[A]=new k2.utils.ListIterator[A](this,index)
        
        override def move(newPosition:Int, obj:A):Unit={
          if(value.contains(obj)){
            value.remove(obj)
            value.add(newPosition,obj)
          }
        }

        override def move(oldPosition:Int,newPosition:Int):A={
          val obj=value.remove(oldPosition)
          value.add(newPosition,obj)
          obj
        }
        
        override def remove(o:Object):Boolean=value.remove(o)
        
        override def remove(index:Int):A=value.remove(index)
        
        override def removeAll(c:ju.Collection[_]):Boolean=value.removeAll(c)
        
        override def retainAll(c:ju.Collection[_]):Boolean=value.retainAll(c)
        
        override def set(index:Int,o:A):A={
          val oldsize=value.size
          this.add(index,o)
          if(value.size-oldsize==1)
        	value.remove(index+1)
          else
            null.asInstanceOf[A]
        }
        
        override def subList(fromIndex:Int,toIndex:Int):ju.List[A]={
          new k2.utils.SubList[A](this,fromIndex,toIndex)
        }
        
        override def toArray():Array[Object]=value.toArray()
        
        override def toArray[T](a:Array[T with Object]):Array[T with Object]=value.toArray[T](a)
        
        override def hashCode():Int=value.foldLeft(0)((acc,e)=>acc+e.hashCode())
        
        ///////////////////////////////////////////////////////////////////////////////
        // Optimization methods
        // Handle with care
        // Perform NO verification (of unicity for example)
        ///////////////////////////////////////////////////////////////////////////////
        
        final def unsafeAdd(e:A)=value.add(e)
        
        final def unsafeAddAll(c:ju.Collection[_<:A])=value.addAll(c)
    }
    
    trait KermetaSetAspect[A] extends KermetaColAspect[A] with KermetaSet[A] {
      
      override def add(e:A):Boolean={
        if(!this.contains(e))
          value.add(e)
        else
          false
      }
      
      override def remove(e:A):Unit={
          val i=value.listIterator()
          var found=false
          while(i.hasNext() && !found){
            if(i.next.equals(e)){
              i.remove
              found = true
            }
          }
      }
      
      override def equals(e:KermetaObject):jl.Boolean={
        e match{
          case e:KermetaOrderedCol[_] => false
          case e:KermetaCol[A]=> e.size==value.size && value.forall(x => e.count(x)==1)
          case _ => false
        }
      }
      
      override def count(e:A):Int={
        if(this.contains(e))
          1
        else
          0  
      }

      override def asSet():KermetaSet[A]={
        val res=new RichKermetaSet[A]
        res.unsafeAddAll(value)
        res
      }
      
      override def asOrderedSet():KermetaOrderedSet[A]={
        val res=new RichKermetaOrderedSet[A]
        res.unsafeAddAll(value)
        res
      }
      
      def union(elements:KermetaSet[A]):KermetaSet[A]={
        val res=new RichKermetaSet[A]
        res.unsafeAddAll(value)
        res.addAll(elements)
        res
      }
      
      def unionWithBag(elements:KermetaBag[A]):KermetaBag[A]={
        val res=new RichKermetaBag[A]
        res.addAll(value)
        res.addAll(elements)
        res
      }
      
      def intersection(elts:KermetaCol[A]):KermetaSet[A]={
        val res=new RichKermetaSet[A]
        res.unsafeAddAll(value.filter(elts.contains))
        res
      }
      
      def minus(elements:KermetaSet[A]):KermetaSet[A]={
        val res=new RichKermetaSet[A]
        res.unsafeAddAll(value.filterNot(elements.contains))
        res
      }
      
      def symmetricDifference(s:KermetaSet[A]):KermetaSet[A]={
        val res=new RichKermetaSet[A]
        res.unsafeAddAll(value.filterNot(s.contains))
        res.unsafeAddAll(s.select(x => !value.contains(x)))
        res
      }
      
      def flatten():KermetaSet[Any]={
    	val res = new RichKermetaSet[Any] 
    	value.foreach{e => if(!e.isInstanceOf[KermetaCol[_]]) res.unsafeAdd(e)}
    	value.foreach{e => if(e.isInstanceOf[KermetaCol[_]]) res.addAll(e.asInstanceOf[KermetaCol[_]])}
    	res
      }
      
      def sortedBy(comparator:(A,A)=>Int):KermetaOrderedSet[A]={
    	val less:KermetaSet[A]=new RichKermetaSet[A]
    	val eq:KermetaSet[A]=new RichKermetaSet[A]
    	val greater:KermetaSet[A]=new RichKermetaSet[A]
    	
    	if(this.size<=1)
    	  return this.asOrderedSet()
    	
    	val pivot=this.one()
    	
    	value.foreach{e => comparator(pivot,e) match{
    	  case n if n<0 => less.unsafeAdd(e)
    	  case n if n==0 => eq.unsafeAdd(e)
    	  case n if n>0 => greater.unsafeAdd(e)
    	  }
    	}
    	
    	val res=new RichKermetaOrderedSet[A]
    	res.unsafeAddAll(less.sortedBy(comparator))
    	res.unsafeAddAll(eq)
    	res.unsafeAddAll(greater.sortedBy(comparator))
    	res
      }
      
      //EList
     override def add(index:Int,o:A):Unit={
       if(!this.contains(o))
         value.add(index,o)
     }
    }
    
    trait KermetaBagAspect[A] extends KermetaColAspect[A] with KermetaBag[A]{
      
      override def equals(e:KermetaObject):jl.Boolean={
        e match {
        case e:KermetaOrderedCol[_] => false
        case e:KermetaSet[A] => e.equals(this)
        case e:KermetaBag[A] => {
          if(value.size()!=e.size)
            return false
    	  val thisCount=this.asSet().map(e=>(e,this.count(e)))
    	  val otherCount=e.asSet().map(e=>(e,this.count(e)))
    	  thisCount.forall(t2=>otherCount.contains(t2)) &&
    	  	otherCount.forall(t2=>thisCount.contains(t2))
        }
        case _ => false
        }
      }
      
      def union(elements:KermetaCol[A]):KermetaBag[A]={
        val res=new RichKermetaBag[A]
        res.addAll(value)
        res.addAll(elements)
        res
      }
      
      def intersection(elements:KermetaCol[A]):KermetaBag[A]={
        val res=new RichKermetaBag[A]
        val thisCount = this.asSet.map(e=>(e,this.count(e)))
        thisCount.foreach{t2 =>
          val min=Math.min(elements.count(t2._1),t2._2)
          for(_<-0 until min)
            res.add(t2._1)
        }
        res
      }
      
      def intersectionWithSet(elements:KermetaSet[A]):KermetaSet[A]={
        val res=new RichKermetaSet[A]
        elements.each(e=>if(this.contains(e))res.unsafeAdd(e))
        res
      }
      
      def removeFromOid(elementOid:Int):Unit={
    	val it = value.listIterator()
    	while(it.hasNext()){
    	  if(it.next().asInstanceOf[KermetaObject].oid==elementOid)
    	    it.remove
    	}
      }
      
      def removeOne(element:A):Unit={
        value.remove(element)
      }
      
      def including(element : A):KermetaBag[A]={
        val res=new RichKermetaBag[A]
        res.addAll(value)
        res.add(element)
        res
      }
      
      def excluding(element:A):KermetaBag[A]={
        val res=new RichKermetaBag[A]
        res.addAll(value)
        res.remove(element)
        res
      }
      
      def flatten():KermetaBag[Any]={
        val res=new RichKermetaBag[Any]
        value.foreach{_ match {
          case e:KermetaCol[_] => res.addAll(e)
          case e => res.add(e)
          }
        }
        res
      }
      
      def sortedBy(comparator:(A,A)=>Int):KermetaSequence[A]={
    	val less=new RichKermetaBag[A]
    	val eq=new RichKermetaBag[A]
    	val greater=new RichKermetaBag[A]
    	
    	if(this.size<=1)
    	  return this.asSequence()
    	
    	val pivot=this.one()
    	
    	value.foreach{e => comparator(pivot,e) match{
    	  case n if n<0 => less.add(e)
    	  case n if n==0 => eq.add(e)
    	  case n if n>0 => greater.add(e)
    	  }
    	}
    	
    	val res=new RichKermetaSequence[A]
    	res.addAll(less.sortedBy(comparator))
    	res.addAll(eq)
    	res.addAll(greater.sortedBy(comparator))
    	res
      }
      
    }
    
    trait KermetaOrderedColAspect[A] extends KermetaColAspect[A] with KermetaOrderedCol[A]{

    	def addAt(index:Int,element:A):Unit={
    	  if(index<0||index>value.size)
    	    throw k2.exceptions.KerRichFactory.createIndexOutOfBound
    	  value.add(index,element)
    	}
    	
    	def removeAt(index:Int):Unit={
    	  if(index<0||index>=value.size)
    	    throw k2.exceptions.KerRichFactory.createIndexOutOfBound
    	  value.remove(index)
    	}
    	
    	def elementAt(index:Int):A={
    	  if(index<0||index>=value.size)
    	    throw k2.exceptions.KerRichFactory.createIndexOutOfBound
    	  value.get(index)
    	}
    	
    	def first():A={
    	  if(value.isEmpty())
    	    throw k2.exceptions.KerRichFactory.createEmptyCollection
    	  value.get(0)
    	}
    	
    	def last():A={
    	  if(value.isEmpty())
    	    throw k2.exceptions.KerRichFactory.createEmptyCollection
    	  value.get(value.size-1)
    	}
    	
    	override final def equals(o:Any):Boolean={
    	  o match{
    	    case o:KermetaOrderedCol[_] => value.equals(o) // relies on ju.List.equals
    	    case _ => false
    	  }
    	}
    	
    	// hashCode specified by ju.List
    	override final def hashCode():Int={
    	  value.foldLeft(1){(acc,e) => 
    	    31*acc+{
    	      if(e==null)
    	        0
    	      else
    	        e.hashCode()
    	    }
    	  }
    	}
    	
    	def index0f(element:A):Int={
    	  value.indexOf(element)
    	}

      def at(index:Int):A={
        if(index<0||index>=value.size)
          throw k2.exceptions.KerRichFactory.createIndexOutOfBound
        value.get(index)
      }
    }
    
    trait KermetaOrderedSetAspect[A] extends KermetaSetAspect[A] with KermetaOrderedColAspect[A] with KermetaOrderedSet[A]{
      
      override def addAt(index:Int,element:A):Unit={
        if(index<0||index>value.size)
          throw k2.exceptions.KerRichFactory.createIndexOutOfBound
        if(!value.contains(element))
          value.add(index,element)
      }
      
      def subSet(min:Int,max:Int):KermetaOrderedSet[A]={
        if(min<0||max>value.size||min>max)
          throw k2.exceptions.KerRichFactory.createIndexOutOfBound
        val res=new RichKermetaOrderedSet[A]
        res.unsafeAddAll(value.subList(min,max))
        res
      }
      
      def append(element:A):KermetaOrderedSet[A]={
        val res=new RichKermetaOrderedSet[A]
        res.unsafeAddAll(value)
        res.add(element)
        res
      }
      
      def prepend(element:A):KermetaOrderedSet[A]={
        val res=new RichKermetaOrderedSet[A]
        res.unsafeAddAll(value)
        res.addAt(0,element)
        res
      }
      
      def insertAt(index:Int,element:A):KermetaOrderedSet[A]={
        if(index<0||index>value.size)
          throw k2.exceptions.KerRichFactory.createIndexOutOfBound
        val res=new RichKermetaOrderedSet[A]
        res.unsafeAddAll(value)
        res.addAt(index,element)
        res
      }
    }
    
    trait KermetaSequenceAspect[A] extends KermetaBagAspect[A] with KermetaOrderedColAspect[A]{
      
      def subSequence(min:Int,max:Int):KermetaSequence[A]={
        if(min<0||max>value.size||min>max)
          throw k2.exceptions.KerRichFactory.createIndexOutOfBound
        val res=new RichKermetaSequence[A]
        res.addAll(value.subList(min,max))
        res
      }
      
      def insertAt(index:Int,element:A):KermetaSequence[A]={
        if(index<0||index>value.size)
          throw k2.exceptions.KerRichFactory.createIndexOutOfBound
        val res=new RichKermetaSequence[A]
        res.addAll(value)
        res.addAt(index,element)
        res
      }
      
      def append(element:A):KermetaSequence[A]={
        val res=new RichKermetaSequence[A]
        res.addAll(value)
        res.add(element)
        res
      }
      
      def prepend(element:A):KermetaSequence[A]={
        val res=new RichKermetaSequence[A]
        res.addAll(value)
        res.addAt(0,element)
        res
      }
      
    }
    
    class RichKermetaSet[A](override val value:ju.List[A]=new ju.ArrayList[A]) extends KermetaSet[A] with KermetaSetAspect[A]{
    }
    
    class RichKermetaBag[A](override val value:ju.List[A]=new ju.ArrayList[A]) extends KermetaBag[A] with KermetaBagAspect[A]{
    }

    class RichKermetaSequence[A](override val value:ju.List[A]=new ju.ArrayList[A]) extends KermetaSequence[A] with KermetaSequenceAspect[A]{
    }
    
    class RichKermetaOrderedSet[A](override val value:ju.List[A]=new ju.ArrayList[A]) extends KermetaOrderedSet[A] with KermetaOrderedSetAspect[A]{
    }

   