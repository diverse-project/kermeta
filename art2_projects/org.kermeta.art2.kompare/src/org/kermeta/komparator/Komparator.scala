package org.kermeta.komparator
trait Komparator extends fr.irisa.triskell.kermeta.language.structure.Object{

    def kompare(runtimeModel : _root_.art2.ContainerRoot, updateModel : _root_.art2.ContainerRoot, deployNodeName : _root_.java.lang.String, factory : _root_.org.kermeta.art.deployer.AbtractCommandFactory) : _root_.java.util.List[_root_.org.kermeta.art.deployer.Command]
    def updateNode(runtimeNode : _root_.art2.ContainerNode, updateNode : _root_.art2.ContainerNode, factory : _root_.org.kermeta.art.deployer.AbtractCommandFactory) : _root_.java.util.List[_root_.org.kermeta.art.deployer.Command]
    def initNode(node : _root_.art2.ContainerNode, factory : _root_.org.kermeta.art.deployer.AbtractCommandFactory) : _root_.java.util.List[_root_.org.kermeta.art.deployer.Command]}

