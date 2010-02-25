package kermeta.standard;

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
  import java.util.{ concurrent => juc }
  import scala.collection.{ generic, immutable, mutable, Traversable }
  import scala.reflect.ClassManifest
  
   class RichKermetaList[A] ( value : ju.List[A]) {
	  
	  def first() = value.get(0)
	  
	 
	
	def asSetType[B]() :java.util.List[B]={  
	 	var res : java.util.List[B] = new java.util.ArrayList[B];
		this.each{e=> res.add(e.asInstanceOf[B])}
		return res
	}  
	def reject(rejector: A => scala.Boolean) :java.util.List[A]={  
	 	var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each(e=> if(!rejector(e)) {res.add(e)})
		return res 
	}
	def countElement(element : A) :java.lang.Integer={
		return this.select(e => e.equals(element)).size
	}  
	//TODO
	def excludes(element : A) :java.lang.Boolean={return true;}
	def one() :A={value.iterator.next}
	//TODO
	def containsAll(elts : Collection[A]) :scala.Boolean={ true}
	//TODO
	def sum() :A={return value.iterator.next}
	def includes(element : A) :Boolean={return value.contains(element)}
	//TODO
	def excludesAll(elements : Collection[A]) :Boolean={/*TODO*/return true}
	def isUnique(a : A) :Boolean={return this.countElement(a)==1}
	def any() :A={return one()}
	//TODO
	def empty() :Boolean={return value.size==0}
	//TODO
	def forAllCpl(f : A,A:A=>Boolean) :Boolean={return true}
	def forAll(f : A=>Boolean) :Boolean={ var i : ju.Iterator[A] = value.iterator
		while (i.hasNext) {
			if (!f(i.next())) 
				return false
		} 
	return true
	}
	//TODO
	def exists(f : A=>Boolean) :Boolean={ var i : ju.Iterator[A] = value.iterator
		while (i.hasNext) {
			if (f(i.next())) 
				return true
		}
	return false
	}
	
	def existsCpl(f : A,A:A=>Boolean) :Boolean={return true}
	def isNotEmpty() :java.lang.Boolean={return !(value.size==0)}
	def detect(detector : A=> Boolean) :A={
		val res = this.select(e=> detector(e))
		if(res != null && res.size>0) { return res.get(0)} else { return null.asInstanceOf[A] }
	}
	//def iterator() :java.laIterator[A]={return value.iterator}
	/*TODO*/def includesAll(elements : Collection[A]) :Boolean={return true}
	def select(selector : A=> scala.Boolean) :java.util.List[A]={
		var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each(e=> if(selector(e)) {res.add(e)})		
		return res 

	}
	//override def size() :Int={return value.length}
	def each(func : A=> Unit):Unit ={ var i : ju.Iterator[A] = value.iterator; while (i.hasNext){func(i.next)  } }
	/*TODO*///def collect(collector : A=> Unit) :Sequence[A]={return null}
	def elementAt(arg:Int):A={
		return value.get(arg)
	}
	def getMetaClass():String={
		return this.getClass().toString();
	}
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
	//TODO
	def isVoid() :Boolean= {this==null}
  }

  class RichKermetaSet[A] ( value : ju.Set[A]) {
	  
	 
	
	def asSetType[B]() :java.util.List[B]={  
	 	var res : java.util.List[B] = new java.util.ArrayList[B];
		this.each(e=> res.add(e.asInstanceOf[B]))
		return res
	}  
	def reject(rejector: A => scala.Boolean) :java.util.List[A]={  
	 	var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each(e=> if(!rejector(e)) {res.add(e)})
		return res 
	}
	def countElement(element : A) :java.lang.Integer={
		return this.select(e => e.equals(element)).size
	}  
	//TODO
	def excludes(element : A) :java.lang.Boolean={return true;}
	def one() :A={value.iterator.next}
	//TODO
	def containsAll(elts : Collection[A]) :scala.Boolean={ true}
	//TODO
	def sum() :A={return value.iterator.next}
	def includes(element : A) :Boolean={return value.contains(element)}
	//TODO
	def excludesAll(elements : Collection[A]) :Boolean={/*TODO*/return true}
	def isUnique(a : A) :Boolean={return this.countElement(a)==1}
	def any() :A={return one()}
	//TODO
	def empty() :Boolean={return value.size==0}
	//TODO
	def forAllCpl(f : A,A:A=>Boolean) :Boolean={return true}
	def forAll(f : A=>Boolean) :Boolean={ var i : ju.Iterator[A] = value.iterator
		while (i.hasNext) {
			if (!f(i.next())) 
				return false
		} 
	return true
	}
	//TODO
	def exists(f : A=>Boolean) :Boolean={ var i : ju.Iterator[A] = value.iterator
		while (i.hasNext) {
			if (f(i.next())) 
				return true
		}
	return false
	}
	
	def existsCpl(f : A,A:A=>Boolean) :Boolean={return true}
	def isNotEmpty() :java.lang.Boolean={return !(value.size==0)}
	def detect(detector : A=> Boolean) :A={
		val res = this.select(e=> detector(e))
		if(res != null && res.size>0) { return res.get(0)} else { return null.asInstanceOf[A] }
	}
	//def iterator() :java.laIterator[A]={return value.iterator}
	/*TODO*/def includesAll(elements : Collection[A]) :Boolean={return true}
	def select(selector : A=> scala.Boolean) :java.util.List[A]={
		var res : java.util.List[A] = new java.util.ArrayList[A];
		this.each(e=> if(selector(e)) {res.add(e)})		
		return res 

	}
	//override def size() :Int={return value.length}
	def each(func : A=> Unit):Unit ={ var i : ju.Iterator[A] = value.iterator; while (i.hasNext){func(i.next)  } }
	/*TODO*///def collect(collector : A=> Unit) :Sequence[A]={return null}
	def getMetaClass():String={
		return this.getClass().toString();
	}
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
	//TODO
	def isVoid() :Boolean= {this==null}
  }

  
  implicit def asBuffer[A](l : ju.List[A]) = new RichKermetaList(l)//l match {
  implicit def asSet[A](l : ju.Set[A]) = new RichKermetaSet(l)//l match {

  
  
  
}



