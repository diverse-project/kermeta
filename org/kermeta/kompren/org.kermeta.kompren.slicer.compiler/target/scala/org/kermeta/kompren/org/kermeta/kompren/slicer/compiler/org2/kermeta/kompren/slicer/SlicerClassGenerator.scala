package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
trait SlicerClassGenerator extends `_root_`.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.Generator{

    def initialise(slicer : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator):_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator
    override def generateCode():_root_.scala.Unit
    def generateOnEndMethod():_root_.java.lang.String
    def generateOnStartMethod():_root_.java.lang.String
    def generateRelationClasses():_root_.java.lang.String
    def generateAddOperations():_root_.java.lang.String
    def generateLaunchOperation():_root_.java.lang.String
    def generateIntialiseOperation():_root_.java.lang.String
    def generateAddedAttributes():_root_.java.lang.String
    def generateRequiredAttributes():_root_.java.lang.String
}

