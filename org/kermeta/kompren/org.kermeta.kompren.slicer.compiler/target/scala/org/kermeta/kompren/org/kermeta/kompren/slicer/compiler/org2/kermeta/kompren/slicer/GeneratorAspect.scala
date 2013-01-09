package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait GeneratorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.Generator{
var slicerGenerator : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator= _
def KergetSlicerGenerator() : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator={this.slicerGenerator}
def KersetSlicerGenerator(arg:_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator)={ this.slicerGenerator = arg}
def ScalaslicerGenerator : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator={this.KergetSlicerGenerator().asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator]}
def ScalaslicerGenerator_=(`~value` : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator):Unit={this.KersetSlicerGenerator(`~value`)}
var generatedCode : _root_.java.lang.String= _
def KergetGeneratedCode() : _root_.java.lang.String={this.generatedCode}
def KersetGeneratedCode(arg:_root_.java.lang.String)={ this.generatedCode = arg}
def ScalageneratedCode : _root_.java.lang.String={this.KergetGeneratedCode().asInstanceOf[_root_.java.lang.String]}
def ScalageneratedCode_=(`~value` : _root_.java.lang.String):Unit={this.KersetGeneratedCode(`~value`)}

    def generateCode():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 
        }
 
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.Generator"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

