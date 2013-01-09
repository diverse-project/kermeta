package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
trait SlicerGenerator extends `_root_`.k2.standard.KermetaObject{

    def initialise(slicerModel : _root_.org2.kermeta.kompren.slicer.Slicer, metamodel : _root_.org.eclipse.emf.ecore.EPackage, modelURI : _root_.java.lang.String):_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator
    def updateModelForStrictSlicing():_root_.scala.Unit
    def checkClassesToSlice():_root_.scala.Unit
    def computeRootClass():_root_.org.eclipse.emf.ecore.EClass
    def defineClassesToAspectise():_root_.scala.Unit
    def generateSlicer():_root_.scala.Unit
    def getRequiresFromClasses(classes : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.EClass]):_root_.java.lang.String
    def getUsingsFromClasses(classes : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.EClass]):_root_.java.lang.String
    def getPackageFromClasses(classes : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.EClass]):_root_.java.lang.String
    def generateCodeKP(modelAspectFileName : _root_.java.lang.String, slicerFileName : _root_.java.lang.String, requiredAspectFileNames : _root_.k2.standard.KermetaBag[_root_.java.lang.String]):_root_.java.lang.String
    def copyMetamodel():_root_.scala.Unit
    def saveCode():_root_.scala.Unit
}

