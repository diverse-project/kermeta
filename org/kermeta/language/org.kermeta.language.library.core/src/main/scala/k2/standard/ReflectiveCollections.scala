package k2.standard;

/**
 * Reflective collection contained by an object of type A and containing objects of type B
 */
trait ReflectiveCollection[A,B] extends KermetaColAspect[B]{
  val owner : A = null.asInstanceOf[A]
  val hasOpposite : Boolean = false
  val thisUpper :Integer = -1
  val oppositeUpper : Integer = 1
  val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()}
  val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()}
  
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
  
  def takeCareOfOppositeAdd(e:B) : Unit ={
    if(hasOpposite && oppositeUpper==1){
      oppositeScalaSetter(e,null.asInstanceOf[A])
      oppositeKerSetter(e,owner)
    }
  }
  
  def takeCareOfOppositeRemove(e:B) : Unit = {
    if(hasOpposite && oppositeUpper==1)
      oppositeKerSetter(e,null.asInstanceOf[A])
  }
}

class RichReflectiveSet[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends KermetaSetAspect[B] with ReflectiveCollection[A,B]{
  
  override def add(e:B) : Boolean = {
    if(!this.contains(e))
      super[ReflectiveCollection].add(e)
    else
      throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Trying to add an element in a reflective set where it already is")
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
  
  override def clear() : Unit = super[ReflectiveCollection].clear
}

class RichReflectiveBag[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends KermetaBagAspect[B] with ReflectiveCollection[A,B] {
  
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

  override def clear() : Unit = super[ReflectiveCollection].clear
}

trait ReflectiveOrderedCollection[A,B] extends ReflectiveCollection[A,B] with KermetaOrderedColAspect[B]{
  
  override def add(e:B) : Boolean = super[ReflectiveCollection].add(e)
  
  override def addAt(index:Int,e:B) : Unit ={
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

  override def clear() : Unit = super[ReflectiveCollection].clear
}

class RichReflectiveOrderedSet[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends KermetaOrderedSetAspect[B] with ReflectiveOrderedCollection[A,B] {
  
  override def add(e:B) : Boolean = {
    if(!this.contains(e))
      super[ReflectiveOrderedCollection].add(e)
    else
      throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Trying to add an element in a reflective set where it already is")
  }
  
  override def addAt(index:Int,e:B) : Unit ={
    if(!this.contains(e))
      super[ReflectiveOrderedCollection].addAt(index,e)
    else
      throw k2.exceptions.KerRichFactory.createRuntimeError.initialize("Trying to add an element in a reflective set where it already is")
  }
  
  override def remove(e:Any):Boolean = {
	if(!super[KermetaOrderedSetAspect].remove(e))
	  return false
	  
    e match {
      case e:B if hasOpposite => takeCareOfOppositeRemove(e)
      case _ =>
    }
	true
  }

  override def clear() : Unit = super[ReflectiveOrderedCollection].clear
}

class RichReflectiveSequence[A,B]( 
  override val owner : A = null.asInstanceOf[A],
  override val hasOpposite : Boolean = false,
  override val thisUpper : Integer = -1,
  override val oppositeUpper : Integer = 1,
  override val oppositeKerSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val oppositeScalaSetter : (B,A) => Unit = {(b:B,a:A)=>()},
  override val value:java.util.List[B]
) extends KermetaSequenceAspect[B] with ReflectiveOrderedCollection[A,B] {
  
  override def remove(e:Any):Boolean ={
    import k2.standard.PrimitiveConversion.any2kermeta
    e match {
      case e:B if hasOpposite => 
        val elts = this.select(elt => elt==e)
        elts.each(this.removeFromOid)
        elts.size!=0
      case _ => super[KermetaSequenceAspect].remove(e)
    }
  }
  
  override def removeFromOid(e:B) : Unit ={
    val oldsize = this.size
    super.removeFromOid(e)
    if(this.size!=oldsize)
      takeCareOfOppositeRemove(e)
  }
  
  override def removeOne(e:B) : Unit = removeFromOid(e)

  override def clear() : Unit = super[ReflectiveOrderedCollection].clear

}
