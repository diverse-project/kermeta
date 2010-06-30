package org.kermeta.artKomparator
trait Launcher extends fr.irisa.triskell.kermeta.language.structure.Object{

    def loadART2Model(model : _root_.java.lang.String) : _root_.art2.ContainerRoot
    def launchFromURL(newModelUrl : _root_.java.lang.String) : Unit
    def launchFromModel(newModel : _root_.art2.ContainerRoot) : Unit}

