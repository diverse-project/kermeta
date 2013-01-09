package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
trait KomprenCompiler extends `_root_`.k2.standard.KermetaObject{

    def compile(uriSlicer : _root_.java.lang.String):_root_.scala.Unit
    def getEcoreModel(uriEcoreModel : _root_.java.lang.String):_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EPackage]
    def getSlicerModel(uriSlicerModel : _root_.java.lang.String):_root_.org2.kermeta.kompren.slicer.Slicer
    def generateKermetaPruningSlicer():_root_.scala.Unit
}

