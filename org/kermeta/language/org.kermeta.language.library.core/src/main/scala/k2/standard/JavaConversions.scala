package k2.standard;

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
import scala.collection.immutable.ListSet

object JavaConversions {
    import java.{ lang => jl, util => ju }
    import java.util.{ concurrent => juc }
    import scala.collection.{ generic, immutable, mutable, Traversable }
    import scala.reflect.ClassManifest
  
    class RichKermetaList[A] ( value : ju.List[A]) extends EObjectImplForPrimitive with EList[A] with _root_.k2.standard.KermetaObject {
	
        /*def flatten():Set[_] = {
            
        	if (A.isSubtypeOf(Collection)) {
          
	        	var result : Set[Object] = new ListSet[Object]()
	        	var i : ju.Iterator[A] = value.iterator()
	        	while (i.hasNext()) {
	        		var current : Collection[_] = i.next().asInstanceOf[Collection[_]]
	        		var icurrent : ju.Iterator[Object] = current.iterator()
	        	}
        		return result
        	}
        	else {
        		
        	}
        }*/

        def intersection(elements : ju.Collection[A]) : ju.Collection[A] = {
    		var result : ju.Collection[A] = new ju.ArrayList[A]()
    		var tmpSet : ju.Set[A] = new ju.HashSet[A]()
    		var richElements : RichKermetaCol[A] = new RichKermetaCol[A](elements)
    		var i : ju.Iterator[A] = value.iterator()
    		while (i.hasNext()) {
    			var elem : A = i.next()
    			if (elements.contains(elem)) {
    				tmpSet.add(elem)
    			}
    		}
    		i = tmpSet.iterator()
    		while (i.hasNext()) {
    			var elem : A = i.next()
    			var nbElem : Int = Math.min(countElement(elem), richElements.countElement(elem))
    			val range = 0.until(nbElem)
    			for (j <- range) {
    				result.add(elem)
    			}    			
    		}
    		return result
    	}
      
        def first():A = {
            if (value.size>0)  
                return value.get(0)
            else
                return null.asInstanceOf[A]
        }

        def last():A = {
                        if (value.size>0)  
                return   value.get(value.size-1)
            else
                return null.asInstanceOf[A]
        }
          

        def move( newPosition : Int, o : A){
            if(value.contains(o)){
                value.remove(o)
                value.add(newPosition, o)
            }
        }
        
        def removeOne( o : A){
            if(value.contains(o)){
                value.remove(o)
            }
        }

        def move(newPos : Int , old : Int):A ={
            move(newPos,value.get(old))
            value.get(newPos)
        }
	 
	
        def asSequenceType[B]() :java.util.List[B]={
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

        def excludes(element : A) :java.lang.Boolean={return !value.contains(element)}
        def one():A ={
        
            if (value.iterator.hasNext)
                return  value.iterator.next
            else
                return null.asInstanceOf[A]
        }

        def sum() :A={
        	var i : ju.Iterator[A] = value.iterator
        	var result : A = i.next
        	
        	if (!result.isInstanceOf[Summable[A]]) {
        		throw new RuntimeException("Collection contains elements which are not summable.")
        	}
        	
        	while (i.hasNext()) {
        		var current : A = i.next()
        		if (current.isInstanceOf[Summable[A]]) {
        			var summableCurrent : Summable[A] = current.asInstanceOf[Summable[A]]
        			result = result.asInstanceOf[Summable[A]].plus(current)
        		}
        		else {
        			throw new RuntimeException("Collection contains elements which are not summable.")
        		}
        	}
        	return result
        }
        def includes(element : A) :Boolean={return value.contains(element)}
        
        def excludesAll(elements : ju.Collection[A]) :Boolean={
        	var i : ju.Iterator[A] = value.iterator
        	while (i.hasNext()) {
        		if (value.contains(i.next)) {
        			return false
        		}
        	}
        	return true
        }
        def isUnique(a : A) :Boolean={return this.countElement(a)==1}
        def any() :A={return one()}
        def at(index:Int) :A={return value.get(index)}
        
        def empty() :Boolean={return value.size==0}

        def forAllCpl(f : (A,A)=>Boolean) :Boolean={        	
          this.forAll(
              {(x : A)=>
                	{this.forAll(
                	      {(y : A) => {f(x, y)}}
                	)}
              }
          )
        }
        
        def forAll(f : A=>Boolean) :Boolean={
        		var i : ju.Iterator[A] = value.iterator
                while (i.hasNext) {
                	if (!f(i.next())) {
                		return false
                	}
                }
                return true
        }
        
        def exists(f : A=>Boolean) :Boolean={ 
            var i : ju.Iterator[A] = value.iterator
            while (i.hasNext) {
                if (f(i.next()))
                    return true
            }
            return false
        }
	
        def existsCpl(f : (A,A)=>Boolean) :Boolean={
          this.exists(
              {(x : A)=>
                	{this.exists(
                	      {(y : A) => {f(x, y)}}
                	)}
              }
          )
        }
        
        
        def isNotEmpty() :java.lang.Boolean={return !(value.size==0)}
        def detect(detector : A=> Boolean) :A={
            //val res = this.select(e=> detector(e))
            //if(res != null && res.size>0) { return res.get(0)} else { return null.asInstanceOf[A] }
            var it : ju.Iterator[A] = value.iterator
            var elem : A = null.asInstanceOf[A]
            while (it.hasNext) {
              elem = it.next
              if (detector(elem)) {
                return elem
              }
            }
            return null.asInstanceOf[A]
        }
        //def iterator() :java.laIterator[A]={return value.iterator}

        def includesAll(elements : ju.Collection[A]) :Boolean={return containsAll(elements)}
        
        
        def select(selector : A=> scala.Boolean) :java.util.List[A]={
            var res : java.util.List[A] = new java.util.ArrayList[A];
            this.each(e=> if(selector(e)) {res.add(e)})
            return res

        }
        //override def size() :Int={return value.length}
        def each(func : A=> Unit):Unit ={
            var clone : ju.List[A] = new ju.ArrayList[A]
            if (value != null){
                clone.addAll(value)
                var i : ju.Iterator[A] = clone.iterator; while (i.hasNext){func(i.next)  }
            }
        }

        def collect[B](collector : A=> B) :java.util.List[B]={var res = new ju.ArrayList[B](); this.each(e=> res.add(collector(e)))  ; return res  }
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
            // println("addUnique " + a + value.size)
            if (!value.contains(a))
                value.add(a)
            //var res : java.util.List[A] = new java.util.ArrayList[A];
            //this.each{e=> res.add(e)}
            //return res
        }

        def addAllUnique(a: ju.Collection[A]) :Unit = {
            
           
            // create a temporary collection for safe iteration
            var tempColl : java.util.List[A] = new java.util.ArrayList[A];
            tempColl.addAll(a)
            var i : ju.Iterator[A] = tempColl.iterator
            while (i.hasNext){
                var element:A  = i.next
                if (!value.contains(element))
                    value.add(element)
            }
            
        }

        def addAt(arg:Int,elem : A){
            value.add(arg, elem)
        }
        def removeAt(index:Int){
            value.remove(value.get(index))
        }

        def addSafe(e:java.lang.Object) :Boolean= {
          if (e.isInstanceOf[A])
            return value.add(e.asInstanceOf[A])
          else
            return false;
        }
        
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


        override def clone():Object = {

            return null;
        }


        def contains( o:Object) :Boolean = {
            if (value == null)
                return false
            else
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


        def remove(obj:Int):A= {
            this.remove(new java.lang.Integer(obj));
            if(obj.isInstanceOf[A])
            	return obj.asInstanceOf[A];
            return null.asInstanceOf[A];
        }


        def remove( o:Object):Boolean= {
                return value.remove(o);
        }



        def  toArray [T](x$1: Array[T with java.lang.Object]) : Array[T with java.lang.Object]={
        	var result : Array[T with java.lang.Object] = new Array[T with java.lang.Object](value.size())
        	var i : ju.Iterator[A] = value.iterator()
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

        override def isVoid() :Boolean= {value == null}
    }

    class RichKermetaSet[A] ( value : ju.Set[A]) extends RichKermetaCol[A] ( value ) {
    	     
    	def intersection(elements : ju.Set[A]) : ju.Set[A] = {
    		var result : ju.Set[A] = new ju.HashSet[A]()
    		var i : ju.Iterator[A] = value.iterator()
    		while (i.hasNext()) {
    			var elem : A = i.next()
    			if (elements.contains(elem)) {
    				result.add(elem)
    			}
    		}
    		return result
    	}
    }

    class RichKermetaCol[A] ( value : ju.Collection[A]) {
	  
    	def intersection(elements : ju.Collection[A]) : ju.Collection[A] = {
    		var result : ju.Collection[A] = new ju.ArrayList[A]()
    		var tmpSet : ju.Set[A] = new ju.HashSet[A]()
    		var richElements : RichKermetaCol[A] = new RichKermetaCol[A](elements)
    		var i : ju.Iterator[A] = value.iterator()
    		while (i.hasNext()) {
    			var elem : A = i.next()
    			if (elements.contains(elem)) {
    				tmpSet.add(elem)
    			}
    		}
    		i = tmpSet.iterator()
    		while (i.hasNext()) {
    			var elem : A = i.next()
    			var nbElem : Int = Math.min(countElement(elem), richElements.countElement(elem))
    			val range = 0.until(nbElem)
    			for (j <- range) {
    				result.add(elem)
    			}
    			
    		}
    		return result
    	}
    	
    	
      
        def asSequenceType[B]() :java.util.List[B]={
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
        def addSafe(e:java.lang.Object) :Boolean= {
          if (e.isInstanceOf[A])
            return value.add(e.asInstanceOf[A])
          else
            return false;
        }
        
        def excludes(element : A) :java.lang.Boolean={
        	return !value.contains(element)
        }
        def one() : A={

            if (value.iterator.hasNext)
                return  value.iterator.next
            else
                return null.asInstanceOf[A]
        

        }

        def containsAll(elts : ju.Collection[A]) :scala.Boolean={
        	return value.containsAll(elts)
        }
        
        def sum() :A={
        	var i : ju.Iterator[A] = value.iterator
        	var result : A = i.next
        	
        	if (!result.isInstanceOf[Summable[A]]) {
        		throw new RuntimeException("Collection contains elements which are not summable.")
        	}
        	
        	while (i.hasNext()) {
        		var current : A = i.next()
        		if (current.isInstanceOf[Summable[A]]) {
        			var summableCurrent : Summable[A] = current.asInstanceOf[Summable[A]]
        			result = result.asInstanceOf[Summable[A]].plus(current)
        		}
        		else {
        			throw new RuntimeException("Collection contains elements which are not summable.")
        		}
        	}
        	return result
        }
        
        def includes(element : A) :Boolean={
        	return value.contains(element)
        }

        def excludesAll(elements : ju.Collection[A]) :Boolean={
        	var i : ju.Iterator[A] = value.iterator
        	while (i.hasNext()) {
        		if (value.contains(i.next)) {
        			return false
        		}
        	}
        	return true
        }
        def isUnique(a : A) :Boolean={return this.countElement(a)==1}
        
        def any() : A={return one()}

        def empty() :Boolean={return value.size==0}

        def forAllCpl(f : (A,A)=>Boolean) :Boolean={
          this.forAll(
              {(x : A)=>
                	{this.forAll(
                	      {(y : A) => {f(x, y)}}
                	)}
              }
          )
        }
        def forAll(f : A=>Boolean) :Boolean={ var i : ju.Iterator[A] = value.iterator
        	while (i.hasNext) {
                if (!f(i.next())) {
                    return false
                }
            }
        	return true
        }

        def exists(f : A=>Boolean) :Boolean={
        	var i : ju.Iterator[A] = value.iterator
            while (i.hasNext) {
            	if (f(i.next())) {
            		return true
            	}
            }
        	return false
        }
	
        def existsCpl(f : (A,A)=>Boolean) :Boolean={
        	this.exists(
              {(x : A)=>
                	{this.exists(
                	      {(y : A) => {f(x, y)}}
                	)}
              }
        	)
        }
        
        def isNotEmpty() :java.lang.Boolean={return !(value.size==0)}
        
        def detect(detector : A=> Boolean) :A={
            val res = this.select(e=> detector(e))
            if(res != null && res.size>0) { return res.get(0)} else { return null.asInstanceOf[A] }
        }
        
        //def iterator() :java.laIterator[A]={return value.iterator}
        
        def includesAll(elements : ju.Collection[A]) :Boolean={
          return containsAll(elements)
        }
        
        def select(selector : A=> scala.Boolean) :java.util.List[A]={
            var res : java.util.List[A] = new java.util.ArrayList[A];
            this.each(e=> if(selector(e)) {res.add(e)})
            return res
        }
        
        //override def size() :Int={return value.length}
        
        def each(func : A=> Unit):Unit ={
        	var clone : ju.List[A] = new ju.ArrayList[A]
        	if (value != null){
                clone.addAll(value)
                var i : ju.Iterator[A] = clone.iterator;
                while (i.hasNext){
                  func(i.next)
                }
            }
        }
  
        def collect[B](collector : A=> B) :java.util.List[B]={
        	var res = new ju.ArrayList[B]();
        	this.each(e=> res.add(collector(e)));
        	return res
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

        def isVoid() :Boolean= {this==null}
    }

  
    implicit def asBuffer[A](l : ju.List[A]) = new RichKermetaList(l)//l match {
    implicit def asSet[A](l : ju.Set[A]) = new RichKermetaSet(l)//l match {
    implicit def asCol[A](l : ju.Collection[A]) = new RichKermetaCol(l)//l match {
  	
  
    
  
}



