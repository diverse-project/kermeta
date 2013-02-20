package k2.standard;

import org.eclipse.emf.common.util.EList
import java.{ util => ju, lang => jl }
import org.eclipse.emf.common.util.UniqueEList


/**
 * contains the implicit conversions from the various java List, Collection to kermeta collections
 */
object JavaCollectionConversions {
  implicit def julist2kermeta[G](value: ju.List[G]): KermetaSequence[G] = { new RichKermetaSequence[G](value) }
  implicit def elist2kermeta[G](value: EList[G]): KermetaOrderedCol[G] = {
    if (value.isInstanceOf[UniqueEList[G]])
      new RichKermetaSet[G](value)
    else
      new RichKermetaSequence[G](value)
  }
  implicit def juSet2Kermeta[A](l: ju.Set[A]): KermetaSet[A] = {
    // make sure to use the wrapper in order to avoid cyclic implicit conversion
    new RichKermetaSet(new juSet2juListWrapper(l)) 
  }
  implicit def juCollection2Kermeta[A](l: ju.Collection[A]): KermetaCol[A] = {
    if (l.isInstanceOf[ju.Set[A]])
      // make sure to use the wrapper in order to avoid cyclic implicit conversion
      new RichKermetaSet[A](new juSet2juListWrapper(l.asInstanceOf[ju.Set[A]]))
    else
      new RichKermetaSequence[A](l) // todo should also write a wrapper for Sequence other wise we may fall again in a stackoverflow
  }
}