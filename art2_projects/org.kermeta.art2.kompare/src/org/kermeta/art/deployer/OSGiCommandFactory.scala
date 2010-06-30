package org.kermeta.art.deployer
trait OSGiCommandFactory extends org.kermeta.art.deployer.AbtractCommandFactory{

    override def createCommandRemoveComponentInstance(ci : _root_.art2.ComponentInstance) : _root_.org.kermeta.art.deployer.Command
    override def createCommandAddComponentType(ct : _root_.art2.ComponentType) : _root_.org.kermeta.art.deployer.Command
    override def createCommandAddComponentInstance(ci : _root_.art2.ComponentInstance) : _root_.org.kermeta.art.deployer.Command
    override def createCommandRemoveComponentType(ct : _root_.art2.ComponentType) : _root_.org.kermeta.art.deployer.Command
    override def createCommandUpdateComponentInstance(ci : _root_.art2.ComponentInstance) : _root_.org.kermeta.art.deployer.Command}

