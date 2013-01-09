package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
trait SlicerAspectGenerator extends `_root_`.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.Generator{

    def initialise(slicer : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator):_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator
    override def generateCode():_root_.scala.Unit
    def generateAspectFeedableOtherClasses():_root_.java.lang.String
    def generateVisitFeedCallBlock(clazz : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String
    def generateVisitFeedCallExpression(ref : _root_.org.eclipse.emf.ecore.EReference):_root_.java.lang.String
    def generateExternAspect(clazz : _root_.org.eclipse.emf.ecore.EClass, mainPackageName : _root_.java.lang.String, packages : _root_.k2.standard.KermetaBag[_root_.java.lang.String]):_root_.scala.Unit
    def generateCopyOfRequiredAttributesOfClass(eclass : _root_.org.eclipse.emf.ecore.EClass, varName : _root_.java.lang.String, doSuper : _root_.java.lang.Boolean):_root_.java.lang.String
    def createImplementationOperationCreateFrom(eclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String
    def generateAspect(eclass : _root_.org.eclipse.emf.ecore.EClass, considerSlicerVisitor : _root_.java.lang.Boolean):_root_.java.lang.String
    def generateCheckOperation(clazz : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String
    def generateInitialiseOppositeOperation(slicedProp : _root_.org2.kermeta.kompren.slicer.SlicedProperty):_root_.java.lang.String
    def generateRelationCall(ref : _root_.org.eclipse.emf.ecore.EReference, isOption : _root_.java.lang.Boolean, visitMethodName : _root_.java.lang.String, nameVarPruner : _root_.java.lang.String, classVisit : _root_.java.lang.Boolean):_root_.java.lang.String
    def generateRelationCalls(eclass : _root_.org.eclipse.emf.ecore.EClass, classVisit : _root_.java.lang.Boolean):_root_.java.lang.String
    def generateAddRelations(classVisit : _root_.java.lang.Boolean, relation : _root_.org.eclipse.emf.ecore.EReference):_root_.java.lang.String
    def generateVisitAspect():_root_.java.lang.String
}

