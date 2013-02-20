package k2.standard;

/**
 * Reflective collection contained by an object of type A and containing objects of type B
 */
trait ReflectiveCollection[A,B] extends KermetaCol[B]{
  val owner : A = null.asInstanceOf[A]
  val hasOpposite : Boolean = false
  val thisUpper :Integer = -1
  val oppositeUpper : Integer = 1
  val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()}
  val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()}
  val oppositeScalaGetter : B => ReflectiveCollection[B,A] = {b:B=>null}
  
  override def add(e:B):Boolean
  
  override def clear():Unit
  
  def unsafeRemoveOne(e:B):Unit
  
  def takeCareOfOppositeAdd(e:B) : Unit
  
  def takeCareOfOppositeRemove(e:B) : Unit
  
  override def remove(e:Any) : Boolean
}

trait ReflectiveCollectionAspect[A,B] extends ReflectiveCollection[A,B] with KermetaColAspect[B]{

  override def add(e:B):Boolean = {
    if(e==null)
      throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Illegal argument: cannot add void in a reflective collection")
    if(thisUpper != -1 && this.size >= thisUpper)
      throw k2.exceptions.KerRichFactory.createUpperBoundReachedError
    takeCareOfOppositeAdd(e)
    super.add(e)
  }
  
  override def clear():Unit ={
    this.each(e=>this.remove(e))
  }
  
  override def takeCareOfOppositeAdd(e:B) : Unit ={
    if(hasOpposite && oppositeUpper==1){
      oppositeScalaSetter(e,null.asInstanceOf[A])
      oppositeKerSetter(e,owner)
    } else if(hasOpposite){ // upper == -1 || upper > 1
      val opposite = oppositeScalaGetter(e)
      if(oppositeUpper != -1 && opposite.size >= oppositeUpper)
        throw k2.exceptions.KerRichFactory.createUpperBoundReachedError.initialize("Opposite has reached its upper bound")
      if(opposite.isInstanceOf[KermetaSet[_]] && opposite.contains(this))
        throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Opposite is a set and already contains this")
      opposite.unsafeAdd(owner)
    }
  }
  
  override def takeCareOfOppositeRemove(e:B) : Unit = {
    if(hasOpposite && oppositeUpper==1)
      oppositeKerSetter(e,null.asInstanceOf[A])
    else if(hasOpposite) // upper == -1 || upper > 1
      oppositeScalaGetter(e).unsafeRemoveOne(owner)
  }
}

trait ReflectiveSet[A,B] extends KermetaSet[B] with ReflectiveCollection[A,B]{
  
  override def add(e:B) : Boolean
  
  override def remove(e:Any):Boolean
  
  override def unsafeRemoveOne(e:B):Unit
}

trait ReflectiveSetAspect[A,B] extends ReflectiveSet[A,B] with KermetaSetAspect[B] with ReflectiveCollectionAspect[A,B]{
  
  override def add(e:B) : Boolean = {
    if(!this.contains(e))
      super[ReflectiveCollectionAspect].add(e)
    else
      throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Cannot add an element in a reflective set where it already is")
  }
  
  override def remove(e:Any):Boolean = {
	if(!super[KermetaSetAspect].remove(e))
	  return false
	  
    e match {
      case e:B if hasOpposite => takeCareOfOppositeRemove(e)
      case _ =>
    }
	true
  }
  
  override def unsafeRemoveOne(e:B):Unit={
    value.remove(e)
  }
}

trait ReflectiveBag[A,B] extends KermetaBag[B] with ReflectiveCollection[A,B]{

  override def remove(e:Any):Boolean
  
  override def removeFromOid(e:B) : Unit
  
  override def removeOne(e:B) : Unit
  
  override def unsafeRemoveOne(e:B):Unit
}

trait ReflectiveBagAspect[A,B] extends ReflectiveBag[A,B] with KermetaBagAspect[B] with ReflectiveCollectionAspect[A,B] {

  override def remove(e:Any):Boolean ={
    import k2.standard.PrimitiveConversion.any2kermeta
    e match {
      case e:B if hasOpposite => 
        val elts = this.select(elt => elt==e)
        elts.each(this.removeFromOid)
        elts.size!=0
      case _ => super[KermetaBagAspect].remove(e)
    }
  }
  
  override def removeFromOid(e:B) : Unit ={
    val oldsize = this.size
    super.removeFromOid(e)
    if(this.size!=oldsize)
      takeCareOfOppositeRemove(e)
  }
  
  override def removeOne(e:B) : Unit = removeFromOid(e)

  override def unsafeRemoveOne(e:B):Unit={
    super[KermetaBagAspect].removeFromOid(e)
  }
}

trait ReflectiveOrderedCollection[A,B] extends ReflectiveCollection[A,B] with KermetaOrderedColAspect[B]{
  
  override def addAt(index:Int,e:B) : Unit
  
  override def removeAt(index:Int) : Unit
}

trait ReflectiveOrderedCollectionAspect[A,B] extends ReflectiveOrderedCollection[A,B] with KermetaOrderedColAspect[B] with ReflectiveCollectionAspect[A,B]{
  
  override def addAt(index:Int,e:B) : Unit ={
    if(index<0||index>=this.size)
      throw k2.exceptions.KerRichFactory.createIndexOutOfBound
    if(e==null)
      throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Illegal argument: cannot add void in a reflective collection")
    if(thisUpper != -1 && this.size >= thisUpper)
      throw k2.exceptions.KerRichFactory.createUpperBoundReachedError
	takeCareOfOppositeAdd(e)
    super.addAt(index,e)
  }
  
  override def removeAt(index:Int) : Unit = {
    if(index<0||index>=this.size)
      throw k2.exceptions.KerRichFactory.createIndexOutOfBound
    val e = elementAt(index)
    super.removeAt(index)
    if(hasOpposite && e.isInstanceOf[B])
      takeCareOfOppositeRemove(e.asInstanceOf[B])
  }
}

trait ReflectiveOrderedSet[A,B] extends KermetaOrderedSet[B] with ReflectiveOrderedCollection[A,B] with ReflectiveSet[A,B]{
  
  override def addAt(index:Int,e:B) : Unit
  
}

trait ReflectiveOrderedSetAspect[A,B] extends ReflectiveOrderedSet[A,B] with KermetaOrderedSetAspect[B] with ReflectiveOrderedCollectionAspect[A,B] with ReflectiveSetAspect[A,B]{
  
  override def addAt(index:Int,e:B) : Unit ={
    if(!this.contains(e))
      super[ReflectiveOrderedCollectionAspect].addAt(index,e)
    else
      throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Cannot add an element in a reflective set where it already is")
  }
}

trait ReflectiveSequence[A,B] extends KermetaSequence[B] with ReflectiveOrderedCollection[A,B] with ReflectiveBag[A,B]{
}

trait ReflectiveSequenceAspect[A,B] extends ReflectiveSequence[A,B] with KermetaSequenceAspect[B] with ReflectiveOrderedCollectionAspect[A,B] with ReflectiveBagAspect[A,B]{
}

class RichReflectiveSet[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaGetter : B => ReflectiveCollection[B,A] = {b:B=>null},
  override val value:java.util.List[B]
) extends ReflectiveSet[A,B] with ReflectiveSetAspect[A,B]

class RichReflectiveBag[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaGetter : B => ReflectiveCollection[B,A] = {b:B=>null},
  override val value:java.util.List[B]
) extends ReflectiveBag[A,B] with ReflectiveBagAspect[A,B]

class RichReflectiveOrderedSet[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaGetter : B => ReflectiveCollection[B,A] = {b:B=>null},
  override val value:java.util.List[B]
) extends ReflectiveOrderedSet[A,B] with ReflectiveOrderedSetAspect[A,B]

class RichReflectiveSequence[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaGetter : B => ReflectiveCollection[B,A] = {b:B=>null},
  override val value:java.util.List[B]
) extends ReflectiveSequence[A,B] with ReflectiveSequenceAspect[A,B]