package kermeta.standard;

/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2006-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://www.scala-lang.org/           **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$


 
/** <p>
 *    A collection of implicit conversions supporting interoperability between
 *    Scala and Java collections.
 *  </p> 
 *  <p>
 *    The following conversions are supported:
 *  </p>
 *  <ul>
 *    <li><code>scala.collection.Iterable</code> <=> <code>java.lang.Iterable</code></li>
 *    <li><code>scala.collection.Iterable</code> <=> <code>java.util.Collection</code></li>
 *    <li><code>scala.collection.Iterator</code> <=> <code>java.util.{ Iterator, Enumeration }</code></li>
 *    <li><code>scala.collection.mutable.Buffer</code> <=> <code>java.util.List</code></li>
 *    <li><code>scala.collection.mutable.Set</code> <=> <code>java.util.Set</code></li>
 *    <li><code>scala.collection.mutable.Map</code> <=> <code>java.util.Map</code></li>
 *  </ul>
 *  <p>
 *    In all cases, converting from a source type to a target type and back
 *    again will return the original source object, eg.
 *  </p>
 *  <pre>
 *    <b>import</b> scala.collection.JavaConversions._
 * 
 *    <b>val</b> sl = <b>new</b> scala.collection.mutable.ListBuffer[Int]
 *    <b>val</b> jl : java.util.List[Int] = sl
 *    <b>val</b> sl2 : scala.collection.mutable.Buffer[Int] = jl
 *    assert(sl eq sl2)g</pre>
 *  <p>
 *    Note that no conversion is provided from <code>scala.collection.immutable.List</code>
 *    to <code>java.util.List</code>. Instead it is convertible to an immutable
 *    <code>java.util.Collection</code> which provides size and interation
 *    capabilities, but not access by index as would be provided by
 *    <code>java.util.List</code>.<br/>
 *    This is intentional: in combination the implementation of
 *    <code>scala.collection.immutable.List</code> and the typical usage
 *    patterns of <code>java.util.List</code> would perform extremely poorly.
 *  </p>
 * 
 *  @author Miles Sabin
 *  @since  2.8
 */
object JavaConversions {
  import java.{ lang => jl, util => ju }
  import scala.collection.{ generic, immutable, mutable, Traversable }
  import scala.reflect.ClassManifest

    trait KermetaCollection[A] extends scala.collection.mutable.Buffer[A]{
	def reject(rejector: A => scala.Boolean) :Sequence[A]={  
	 	  return this.filterNot{e=> var l: Boolean = rejector(e) ;println(l); l}
	}
	def countElement(element : A) :Int={
		return this.count{e => e.equals(element)}; 
	}  
	/*TODO*/def excludes(element : A) :scala.Boolean={return true;}
	def one() :A={iterator.next}
	/*TODO*/def containsAll(elts : Collection[A]) :scala.Boolean={ true}
	/*TODO*/def sum() :A={return elements.next}
	//def contains(element : A) :Boolean={return elements.has(element)}
	//def add(element : A)={elements.add(element)}
	def includes(element : A) :Boolean={return this.contains(element)}
	/*TODO*/def excludesAll(elements : Collection[A]) :Boolean={/*TODO*/return true}
	def isUnique(collector : A) :Boolean={return this.countElement(collector)==1}
	def any() :A={return elements.next}
	def empty() :Boolean={return elements.toList.isEmpty}
	def forAllCpl(f : A,A:A=>Boolean) :Boolean={return true}
	def existsCpl(f : A,A:A=>Boolean) :Boolean={return true}
	def isNotEmpty() :Boolean={return !elements.toList.isEmpty}
	def detect(detector : A=> Boolean) :A={return elements.filter(e=> detector(e)).next}
	override def iterator() :Iterator[A]={return elements}
	/*TODO*/def addAll(elts : Collection[A])={//println("addAll")
                                           elts.foreach(e=> elements.toList)} 
	/*TODO*/def includesAll(elements : Collection[A]) :Boolean={return true}
	def select(selector : A=> scala.Boolean) :Sequence[A]={return this.filter{e=> selector(e)}}
	override def size() :Int={return this.length}
	def each(func : A=> Unit) ={elements.foreach(e=> func(e))}
	/*TODO*///def collect(collector : A=> Unit) :Sequence[A]={return null}
	def asSet() :java.util.List[A] = {
		var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each{e=> res.add(e)}
		return res
	}
	def asOrderedSet() :java.util.List[A] = {
		var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each{e=> res.add(e)}
		return res
	}
	def asBag() :java.util.List[A] = {
		var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each{e=> res.add(e)}
		return res
	}
	def asSequence() :java.util.List[A] = {
		var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each{e=> res.add(e)}
		return res
	}
	   
  }
  

  
  // Scala => Java
  
  implicit def asIterator[A](i : Iterator[A]) = i match {
    case JIteratorWrapper(wrapped) => wrapped
    case _ => IteratorWrapper(i)
  }
  implicit def asEnumeration[A](i : Iterator[A]) = i match {
    case JEnumerationWrapper(wrapped) => wrapped
    case _ => IteratorWrapper(i)
  }

  implicit def asIterable[A](i : Iterable[A]) = i match {
    case JIterableWrapper(wrapped) => wrapped
    case _ => IterableWrapper(i)
  }

  implicit def asCollection[A](i : Iterable[A]) = i match {
    case JCollectionWrapper(wrapped) => wrapped
    case _ => new IterableWrapper(i)
  }
  
  implicit def asList[A](b : KermetaCollection[A]) : ju.List[A] = b match {
    case JListWrapper(wrapped) => wrapped
    case _ => new MutableBufferWrapper(b)
  }
  
  implicit def asSet[A](s : mutable.Set[A])(implicit m : ClassManifest[A]) : ju.Set[A] = s match {
    case JSetWrapper(wrapped) => wrapped
    case _ => new MutableSetWrapper(s)(m)
  }

  implicit def asMap[A, B](m : mutable.Map[A, B])(implicit ma : ClassManifest[A]) : ju.Map[A, B] = m match {
    case JMapWrapper(wrapped) => wrapped
    case _ => new MutableMapWrapper(m)(ma)
  }
  
  // Java => Scala
  
  implicit def asIterator[A](i : ju.Iterator[A]) = i match {
    case IteratorWrapper(wrapped) => wrapped
    case _ => JIteratorWrapper(i)
  }
  
  implicit def asIterator[A](i : ju.Enumeration[A]) = i match {
    case IteratorWrapper(wrapped) => wrapped
    case _ => JEnumerationWrapper(i)
  }
  
  implicit def asIterable[A](i : jl.Iterable[A]) = i match {
    case IterableWrapper(wrapped) => wrapped
    case _ => JIterableWrapper(i)
  }
  
  implicit def asIterable[A](i : ju.Collection[A]) = i match {
    case IterableWrapper(wrapped) => wrapped
    case _ => JCollectionWrapper(i)
  }
  
  implicit def asBuffer[A](l : ju.List[A]) : KermetaCollection[A] = l match {
    case MutableBufferWrapper(wrapped) => wrapped
    case _ =>new JListWrapper(l)
  }

  implicit def asSet[A](s : ju.Set[A]) = s match {
    case MutableSetWrapper(wrapped) => wrapped
    case _ =>new JSetWrapper(s)
  }

  implicit def asMap[A, B](m : ju.Map[A, B]) = m match {
    case MutableMapWrapper(wrapped) => wrapped
    case _ =>new JMapWrapper(m)
  }

  // Private implementations ...

  case class IteratorWrapper[A](underlying : Iterator[A]) extends ju.Iterator[A] with ju.Enumeration[A] {
    def hasNext = underlying.hasNext
    def next = underlying.next
    def hasMoreElements = underlying.hasNext
    def nextElement = underlying.next
    def remove = throw new UnsupportedOperationException
  }

  case class JIteratorWrapper[A](underlying : ju.Iterator[A]) extends Iterator[A] {
    def hasNext = underlying.hasNext
    def next = underlying.next
  }

  case class JEnumerationWrapper[A](underlying : ju.Enumeration[A]) extends Iterator[A] {
    def hasNext = underlying.hasMoreElements
    def next = underlying.nextElement
  }
 
  case class IterableWrapper[A](underlying : Iterable[A]) extends ju.AbstractCollection[A] {
    def iterator = underlying.iterator
    def size = underlying.size
    override def isEmpty = underlying.isEmpty
  }

  case class JIterableWrapper[A](underlying : jl.Iterable[A]) extends Iterable[A] {
    def iterator = underlying.iterator
    def newBuilder[B] = new mutable.ArrayBuffer[B]
  }

  case class JCollectionWrapper[A](underlying : ju.Collection[A]) extends Iterable[A] {
    def iterator = underlying.iterator
    override def size = underlying.size
    override def isEmpty = underlying.isEmpty
    def newBuilder[B] = new mutable.ArrayBuffer[B] with KermetaCollection[B]
    
  }
  
  
  case class MutableBufferWrapper[A](underlying : KermetaCollection[A]) extends ju.AbstractList[A] {
    def size = underlying.length
    def get(i : Int) = underlying(i)
    override def set(i : Int, elem: A) = { val p = underlying(i) ; underlying(i) = elem ; p }
    override def add(elem : A) = { println("toto") 
    	underlying.append(elem) ; true }
    override def remove(i : Int) = underlying.remove(i)
  }
  
  case class JListWrapper[A](val underlying : ju.List[A]) extends mutable.Buffer[A] with KermetaCollection[A]{
    def length = underlying.size
    override def isEmpty = underlying.isEmpty
    override def iterator : Iterator[A] = underlying.iterator
    def apply(i : Int) = underlying.get(i)
    def update(i : Int, elem : A) = underlying.set(i, elem)
    def +=:(elem : A) = { underlying.subList(0, 0).add(elem) ; this } 
    def +=(elem : A): this.type = { underlying.add(elem); this }
    def insertAll(i : Int, elems : Traversable[A]) = { val ins = underlying.subList(0, i) ;  elems.foreach(ins.add(_)) }
    def remove(i : Int) = underlying.remove(i)
    def clear = {println("passe par la")
    	underlying.clear}    
    def result = this
    
    
 
  }
  
  case class MutableSetWrapper[A](underlying : mutable.Set[A])(m : ClassManifest[A]) extends ju.AbstractSet[A] {
    self =>
    def size = underlying.size
    override def add(elem: A) = { val sz = underlying.size ; underlying += elem ; sz < underlying.size }
    override def remove(elem : AnyRef) = {
      m.erasure.isInstance(elem) && {
        val sz = underlying.size
        underlying -= elem.asInstanceOf[A]
        sz > underlying.size
      }
    }
    def iterator = new ju.Iterator[A] {
      val ui = underlying.iterator
      var prev : Option[A] = None
      
      def hasNext = ui.hasNext
      def next = { val e = ui.next ; prev = Some(e) ; e }
      def remove = prev match {
        case Some(e) => self.remove(e.asInstanceOf[AnyRef]) ; prev = None
        case _ => throw new IllegalStateException("next must be called at least once before remove")
      }
    }

  }
  
  case class JSetWrapper[A](underlying : ju.Set[A]) extends mutable.Set[A] with mutable.SetLike[A, JSetWrapper[A]] {
    override def size = underlying.size

    def iterator = underlying.iterator
  
    def contains(elem: A): Boolean = underlying.contains(elem)
  
    def +=(elem: A): this.type = { underlying.add(elem); this }
    def -=(elem: A): this.type = { underlying.remove(elem); this }

    override def add(elem: A): Boolean = underlying.add(elem)
    override def remove(elem: A): Boolean = underlying.remove(elem)
  
    override def clear = underlying.clear

    override def empty = JSetWrapper(new ju.HashSet[A])
  }
  
  case class MutableMapWrapper[A, B](underlying : mutable.Map[A, B])(m : ClassManifest[A]) extends ju.AbstractMap[A, B] {
    self =>
    override def size = underlying.size

    override def put(k : A, v : B) = underlying.put(k, v) match {
      case Some(v1) => v1
      case None => null.asInstanceOf[B]
    }
    
    override def remove(k : AnyRef) = {
      if (!m.erasure.isInstance(k))
        null.asInstanceOf[B]
      else {
        val k1 = k.asInstanceOf[A]
        underlying.get(k1) match {
          case Some(v) => underlying -= k1 ; v
          case None => null.asInstanceOf[B]
        }
      }
    }
    
    override def entrySet : ju.Set[ju.Map.Entry[A, B]] = new ju.AbstractSet[ju.Map.Entry[A, B]] {
      def size = self.size

      def iterator = new ju.Iterator[ju.Map.Entry[A, B]] {
        val ui = underlying.iterator
        var prev : Option[A] = None
        
        def hasNext = ui.hasNext
      
        def next = {
          val (k, v) = ui.next
          prev = Some(k)
          new ju.Map.Entry[A, B] {
            def getKey = k
            def getValue = v
            def setValue(v1 : B) = self.put(k, v1)
            override def equals(other : Any) = other match {
              case e : ju.Map.Entry[_, _] => k == e.getKey && v == e.getValue
              case _ => false
            }
          }
        }
        
        def remove = prev match {
          case Some(k) => val v = self.remove(k.asInstanceOf[AnyRef]) ; prev = None ; v
          case _ => throw new IllegalStateException("next must be called at least once before remove")
        }
      }
    }
  }
  
  case class JMapWrapper[A, B](underlying : ju.Map[A, B]) extends mutable.Map[A, B] with mutable.MapLike[A, B, JMapWrapper[A, B]] {
    override def size = underlying.size
    
    def get(k : A) = {
      val v = underlying.get(k)
      if (v != null)
        Some(v)
      else if(underlying.containsKey(k))
        Some(null.asInstanceOf[B])
      else
        None
    }

    def +=(kv: (A, B)): this.type = { underlying.put(kv._1, kv._2); this }
    def -=(key: A): this.type = { underlying.remove(key); this }

    override def put(k : A, v : B): Option[B] = {
      val r = underlying.put(k, v)
      if (r != null) Some(r) else None
    }
      
    override def update(k : A, v : B) { underlying.put(k, v) }
    
    override def remove(k : A): Option[B] = { 
      val r = underlying.remove(k)
      if (r != null) Some(r) else None
    }

    def iterator = new Iterator[(A, B)] {
      val ui = underlying.entrySet.iterator
      def hasNext = ui.hasNext
      def next = { val e = ui.next ; (e.getKey, e.getValue) }
    }
    
    override def clear = underlying.clear

    override def empty = JMapWrapper(new ju.HashMap[A, B])
  }
}
