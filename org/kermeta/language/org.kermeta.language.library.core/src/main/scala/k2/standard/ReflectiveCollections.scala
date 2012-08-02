package k2.standard;

/**
 * Reflective collection contained by an object of type A and containing objects of type B
 */
trait ReflectiveCollection[A,B] extends KermetaColAspect[B]{
  val owner : A = null.asInstanceOf[A]
  val hasOpposite : Boolean = false
  val oppositeUpper : Integer = 1
  val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()}
  val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()}
  
  override def add(e:B):Boolean = {
    takeCareOfOpposite(e)
    super.add(e)
  }
  
  def takeCareOfOpposite(e:B) : Unit ={
    if(hasOpposite && oppositeUpper==1){
      oppositeScalaSetter(e,null.asInstanceOf[A])
      oppositeKerSetter(e,owner)
    }
  }
}

class RichReflectiveSet[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends ReflectiveCollection[A,B] with KermetaSetAspect[B]{
  
  override def add(e:B) : Boolean = {
    if(!this.contains(e))
      super[ReflectiveCollection].add(e)
    else
      false
  }
}

class RichReflectiveBag[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends KermetaBagAspect[B] with ReflectiveCollection[A,B] {}

trait ReflectiveOrderedCollection[A,B] extends ReflectiveCollection[A,B] with KermetaOrderedColAspect[B]{
  
  override def add(e:B) : Boolean = super[ReflectiveCollection].add(e)
  
  override def addAt(index:Int,e:B) : Unit ={
	takeCareOfOpposite(e)
    super.addAt(index,e)
  }
}

class RichReflectiveOrderedSet[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends KermetaOrderedSetAspect[B] with ReflectiveOrderedCollection[A,B] {
  
  override def add(e:B) : Boolean = {
    if(!this.contains(e))
      super[ReflectiveOrderedCollection].add(e)
    else
      false
  }
  
  override def addAt(index:Int,e:B) : Unit ={
    if(!this.contains(e))
      super[ReflectiveOrderedCollection].addAt(index,e)
  }

}

class RichReflectiveSequence[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends KermetaSequenceAspect[B] with ReflectiveOrderedCollection[A,B] {}
