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
  
  /**
   * Check if a model element has an ScalaCompilerName tag
   * @param obj model element to test
   * @return true if ScalaCompilerName tag is found
   */
  def hasScalaCompilerNameTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags.exists(e => "ScalaCompilerName".equals(e.asInstanceOf[Tag].getName()))
  }
  /**
   * Check if a model element has an ScalaCompilerName Tag
   * @param obj model element to test
   * @return the value of the tag
   */
  def getScalaCompilerNameTag(obj: KermetaModelElement): String = {
    obj.getKOwnedTags().find(e => "ScalaCompilerName".equals(e.asInstanceOf[Tag].getName())).get.getValue()
  }
}