package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
object KerRichFactory extends org2.kermeta.kompren.slicer.impl.SlicerFactoryImpl{
 override def createSlicer() : org2.kermeta.kompren.slicer.Slicer = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichSlicer }
 override def createConstraint() : org2.kermeta.kompren.slicer.Constraint = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichConstraint }
 override def createRadius() : org2.kermeta.kompren.slicer.Radius = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichRadius }
 override def createSlicedClass() : org2.kermeta.kompren.slicer.SlicedClass = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichSlicedClass }
 override def createSlicedProperty() : org2.kermeta.kompren.slicer.SlicedProperty = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichSlicedProperty }
 override def createOppositeCreation() : org2.kermeta.kompren.slicer.OppositeCreation = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichOppositeCreation }
 override def createVarDecl() : org2.kermeta.kompren.slicer.VarDecl = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichVarDecl }
 def createKomprenCompiler() : org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KomprenCompiler = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichKomprenCompiler }
 def createSlicerAspectGenerator() : org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichSlicerAspectGenerator }
 def createSlicerClassGenerator() : org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichSlicerClassGenerator }
 def createSlicerGenerator() : org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.RichSlicerGenerator }
}

