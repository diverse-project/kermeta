/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects

import org.kermeta.language.behavior._
import org.kermeta.language.compiler.aspects.sub.RichBlock
import org.kermeta.language.compiler.aspects.sub._
import org.kermeta.language.structure.ModelingUnit
import org.kermeta.language.structure.{Class => KClass}
import org.kermeta.language.structure.{ClassDefinition => KClassDefinition}
import org.kermeta.language.structure.{Object => KObject}
import org.kermeta.language.structure.{Operation => KOpertation}
import org.kermeta.language.structure.{Package => KPackage}
import org.kermeta.language.structure.{Enumeration => KEnumeration}
import sub._

object ImplicitAspects {

  implicit def richModelingUnit(c : ModelingUnit) = RichModelingUnit(c)
  implicit def richBlock(c : Block) = RichBlock(c)
  implicit def richClass(c : KClass) = RichClass(c)
  implicit def richOperation(c : KOpertation) = RichOperation(c)
  implicit def richEnumeration(c : KEnumeration) = RichEnumeration(c)
  implicit def richClassDefinition(c : KClassDefinition) = RichClassDefinition(c)
  implicit def richPackage(c : KPackage) = RichPackage(c)

  implicit def richObject(c : KObject) : ObjectAspect = {
    c match {
      case c : CallVariable => RichCallVariable(c)
      case c : StringLiteral => RichStringLiteral(c)
      case c : CallTypeLiteral => RichCallTypeLiteral(c)
      case c : CallOperation => RichCallOperation(c)
      case c : EmptyExpression => RichEmptyExpression(c)
      case c : Block => RichBlock(c)
      case c : KClass => RichClass(c)
      case _ @ n => {println("name"+n);RichObject(c)}
      //case c : Object => RichObject(c)
    }

  }

  //implicit def richObject(c : KObject) = RichObject(c)

}
