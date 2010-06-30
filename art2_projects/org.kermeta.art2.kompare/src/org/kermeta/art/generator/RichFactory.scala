package org.kermeta.art.generator
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory{
 def createComponentWrapperGenerator : org.kermeta.art.generator.ComponentWrapperGenerator = { new org.kermeta.art.generator.RichComponentWrapperGenerator }
 def createFeatureGenerator : org.kermeta.art.generator.FeatureGenerator = { new org.kermeta.art.generator.RichFeatureGenerator }
 def createComponentInstanceGenerator : org.kermeta.art.generator.ComponentInstanceGenerator = { new org.kermeta.art.generator.RichComponentInstanceGenerator }
}

