package org.kermeta.art.deployer
trait AbtractCommandFactory extends fr.irisa.triskell.kermeta.language.structure.Object{

    def createCommandRemoveComponentInstance(c : _root_.art2.ComponentInstance) : _root_.org.kermeta.art.deployer.Command
    def createCommandAddComponentType(ct : _root_.art2.ComponentType) : _root_.org.kermeta.art.deployer.Command
    def createCommandAddComponentInstance(c : _root_.art2.ComponentInstance) : _root_.org.kermeta.art.deployer.Command
    def createCommandRemoveComponentType(ct : _root_.art2.ComponentType) : _root_.org.kermeta.art.deployer.Command
    def createCommandUpdateComponentInstance(c : _root_.art2.ComponentInstance) : _root_.org.kermeta.art.deployer.Command}

