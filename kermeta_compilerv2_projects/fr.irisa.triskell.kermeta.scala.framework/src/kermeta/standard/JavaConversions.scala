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
import org.eclipse.emf.common.util.EList

object JavaConversions {
  import java.{ lang => jl, util => ju }
  import java.util.{ concurrent => juc }
  import scala.collection.{ generic, immutable, mutable, Traversable }
  import scala.reflect.ClassManifest
  
  class RichKermetaList[A] ( value : ju.List[A]) extends  fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation with  EObjectImplForPrimitive with EList[A]{
	  
    def first() = value.get(0)


    def move( newPosition : Int, o : A){
      if(value.contains(o)){
        value.remove(o)
        value.add(newPosition, o)
      }
    }
    def move(newPos : Int , old : Int):A ={
      move(newPos,value.get(old))
      value.get(newPos)
    }
	 
	
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
    def at(index:Int) :A={return value.get(index)}
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
    def each(func : A=> Unit):Unit ={
      var clone : ju.List[A] = new ju.ArrayList[A]
      clone.addAll(value)
      var i : ju.Iterator[A] = clone.iterator; while (i.hasNext){func(i.next)  }
    }
    /*TODO*///def collect(collector : A=> Unit) :Sequence[A]={return null}
    def elementAt(arg:Int):A={
      return value.get(arg)
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
    def addUnique(a:A) :Unit = {
      if (!value.contains(a))
        value.add(a)
      //var res : java.util.List[A] = new java.util.ArrayList[A];
      //this.each{e=> res.add(e)}
      //return res
    }

    def addAllUnique(a:ju.Collection[A]) :Unit = {
      var i : ju.Iterator[A] = a.iterator
      while (i.hasNext){
        var element:A  = i.next
        if (!value.contains(element))
          value.add(element)
      }
      //var res : java.util.List[A] = new java.util.ArrayList[A];
      //this.each{e=> res.add(e)}
      //return res
    }

    def addAt(arg:Int,elem : A){
      value.add(arg, elem)
    }
    def removeAt(arg:Int){
      value.remove(arg)
    }

        def add(e:A) :Boolean= {
		return value.add(e);
	}


    def add(index:Int, element:A) ={
		value.add(index, element);
	}


	def addAll(c : ju.Collection[_<:A]):Boolean ={

		return value.addAll(c);
	}


	def addAll(index:Int, c: ju.Collection[_<:A]):Boolean ={
		return value.addAll(index, c);
	}


	def clear() ={

		value.clear();
	}


	override def clone():Object = {

		return null;
	}


	def contains( o:Object) :Boolean = {

		return value.contains(o);
	}




	def get(index:Int) : A= {

		return value.get(index);
	}


	def indexOf(o: Object):Int= {

		return value.indexOf(o);
	}


	def  isEmpty() :Boolean = {

		return value.isEmpty();
	}


	def lastIndexOf( o:Object):Int= {

		return value.lastIndexOf(o);
	}


	def remove(index:Int):A= {

		return value.remove(index);
	}


	def remove( o:Object):Boolean= {

		return value.remove(o);
	}



           def  toArray [T](x$1: Array[T with java.lang.Object]) : Array[T with java.lang.Object]={
               return null;//value.toArray(x$1)
           }

	def set(index:Int, element:A):A= {

		return value.set(index, element);
	}


	def size() :Int = {

		return value.size();
	}


	def toArray(): Array[Object] = {

		return value.toArray();
	}


        def listIterator() : 	ju.ListIterator[A] ={

		return value.listIterator();
	}


	def  listIterator( arg0:Int): ju.ListIterator[A]= {

		return value.listIterator(arg0);
	}


	def subList(arg0:Int, arg1:Int) : ju.List[A] = {

		return value.subList(arg0, arg1);
	}

	/*public <T> T[] toArray(T[] a) {

		return value.toArray(a);
	}*/





	override def equals( arg0:Any) :Boolean = {

		return value.equals(arg0);
	}


	override def hashCode() :Int= {

		return value.hashCode();
	}


	def iterator() :ju.Iterator[A]={

		return value.iterator();
	}


	


	

	

	def containsAll( arg0:ju.Collection[_]) :Boolean ={

		return value.containsAll(arg0);
	}


	def removeAll( arg0 :ju.Collection[_] ) :Boolean= {

		return value.removeAll(arg0);
	}


	def retainAll(arg0 :ju.Collection[_]) :Boolean = {

		return value.retainAll(arg0);
	}



    //TODO
    override def isVoid() :Boolean= {value == null}
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



