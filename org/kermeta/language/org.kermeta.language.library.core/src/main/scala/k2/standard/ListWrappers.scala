package k2.standard;


import java.{ util => ju, lang => jl }

/**
 * Wrapper class that allows to manipulate a java.util.Set as a java.util.List
 * ie.it implements the missing operation by raising NotImplementedException
 */
class juSet2juListWrapper[A](underlying: ju.Set[A]) extends ju.List[A] {
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

  override def get(x$1: Int) = {
    throw new RuntimeException("get(x$1: Any) not implemented when wrapping a java.util.Set into a java.util.List ")
  }

  override def listIterator(x$1: Int) = {
    throw new RuntimeException("istIterator(x$1: Int) not implemented when wrapping a java.util.Set into a java.util.List ")
  }
  override def listIterator() = {
    throw new RuntimeException("istIterator() not implemented when wrapping a java.util.Set into a java.util.List ")
  }
  override def lastIndexOf(x$1: Object) = {
    throw new RuntimeException("lastIndexOf(x$1: Any) not implemented when wrapping a java.util.Set into a java.util.List ")
  }
  override def indexOf(x$1: Object) = {
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

  def isEmpty = underlying.isEmpty()
  def contains(o: Object) = underlying.contains(o)
  override def toArray() = underlying.toArray()
  override def toArray[T](x$1: Array[T with java.lang.Object]) = { //underlying.toArray(x$1) not sure if this work
    throw new RuntimeException("toArray[T](x$1: Array[T with java.lang.Object]) not implemented when wrapping a java.util.Set into a java.util.List ")
  }
}