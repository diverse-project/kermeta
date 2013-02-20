package  k2.utils.reflexivity
import org.eclipse.emf.ecore._
import scala.collection.JavaConversions._
import org.kermeta.language.structure.KermetaModelElement
import org.kermeta.language.structure.Metamodel

/**
 * Helper on KermetaModelelement in the reflexivity layer
 */
object KermetaModelElementUtil {
  
  def getMetamodel(k : KermetaModelElement) : Metamodel = {
    var container = k.eContainer()
    container match {
      case m : Metamodel => {
        return m
      }
      case kme : KermetaModelElement => {
        return getMetamodel(kme)
      }
      case o => {
        // should never occur
        return null
      }
    }
  }
}