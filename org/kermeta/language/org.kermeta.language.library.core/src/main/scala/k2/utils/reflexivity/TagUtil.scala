package  k2.utils.reflexivity
import org.eclipse.emf.ecore._
import scala.collection.JavaConversions._
import org.kermeta.language.structure.KermetaModelElement
import org.kermeta.language.structure.Tag


/**
 * Helper about tag in the reflexivity layer
 */
object TagUtil {
  
  /**
   * Check if a model element has an Ecore Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasEcoreTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "ecore".equals(e.asInstanceOf[Tag].getName()))
  }
}