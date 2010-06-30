package org.kermeta.art.deployer
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory{
 def createOSGiCommandFactory : org.kermeta.art.deployer.OSGiCommandFactory = { new org.kermeta.art.deployer.RichOSGiCommandFactory }
 def createAddComponentType : org.kermeta.art.deployer.AddComponentType = { new org.kermeta.art.deployer.RichAddComponentType }
 def createRemoveComponentType : org.kermeta.art.deployer.RemoveComponentType = { new org.kermeta.art.deployer.RichRemoveComponentType }
 def createAddComponentInstance : org.kermeta.art.deployer.AddComponentInstance = { new org.kermeta.art.deployer.RichAddComponentInstance }
 def createRemoveComponentInstance : org.kermeta.art.deployer.RemoveComponentInstance = { new org.kermeta.art.deployer.RichRemoveComponentInstance }
 def createUpdateComponentInstance : org.kermeta.art.deployer.UpdateComponentInstance = { new org.kermeta.art.deployer.RichUpdateComponentInstance }
 def createCommandContext : org.kermeta.art.deployer.CommandContext = { new org.kermeta.art.deployer.RichCommandContext }
}

