package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait KomprenCompilerAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KomprenCompiler{

    def compile(uriSlicer : _root_.java.lang.String):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var slicerModel : _root_.org2.kermeta.kompren.slicer.Slicer = (this).getSlicerModel(uriSlicer);
var pkg : _root_.org.eclipse.emf.ecore.EPackage = ((this).getEcoreModel((slicerModel).ScalauriMetamodel)).one();
var slicer : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator = (_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createSlicerGenerator).initialise(slicerModel, pkg, (slicerModel).ScalauriMetamodel);
(slicer).generateSlicer()
(slicer).saveCode()}
        }
 
}

    def getEcoreModel(uriEcoreModel : _root_.java.lang.String):_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EPackage] = {
var `~result` : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EPackage] = null.asInstanceOf[_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EPackage]]; 
  { 


{
var repository : _root_.org.eclipse.emf.ecore.resource.ResourceSet = _root_.k2.persistence.KerRichFactory.createResourceSet;
var resource : _root_.org.eclipse.emf.ecore.resource.Resource = (repository).createResource(uriEcoreModel, "http://www.eclipse.org/emf/2002/Ecore");
(resource).load(null)
`~result` = (_root_.k2.standard.KerRichFactory.createBag[_root_.org.eclipse.emf.ecore.EPackage]).asInstanceOf[_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EPackage]];
((resource).kgetContents()).each({(obj : Any)=>

{
if ((obj).isInstanceOf[_root_.org.eclipse.emf.ecore.EPackage])

{
(`~result`).add((obj).asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage])}
}
})}
        }
 return `~result`
}

    def getSlicerModel(uriSlicerModel : _root_.java.lang.String):_root_.org2.kermeta.kompren.slicer.Slicer = {
var `~result` : _root_.org2.kermeta.kompren.slicer.Slicer = null.asInstanceOf[_root_.org2.kermeta.kompren.slicer.Slicer]; 
  { 


{
var repository : _root_.org.eclipse.emf.ecore.resource.ResourceSet = _root_.k2.persistence.KerRichFactory.createResourceSet;
var resource : _root_.org.eclipse.emf.ecore.resource.Resource = (repository).createResource(uriSlicerModel, "platform:/resource/org.kermeta.kompren.slicer.compiler/metamodel/kompren.ecore");
(resource).load(null)
`~result` = (null).asInstanceOf[_root_.org2.kermeta.kompren.slicer.Slicer];


{var it : _root_.java.util.Iterator[Any] = ((resource).kgetContents()).iterator();
while (!((it).isOff()))


{
var next : _root_.k2.standard.KermetaObject = (it).next();
if ((next).isInstanceOf[_root_.org2.kermeta.kompren.slicer.Slicer])

{
try{
`~result` = (next).asInstanceOf[_root_.org2.kermeta.kompren.slicer.Slicer];
}catch { case e:ClassCastException => {}}
}
}
}}
        }
 return `~result`
}

    def generateKermetaPruningSlicer():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var modelURI : _root_.java.lang.String = "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/kermetaPruning/kermeta.ecore";
var slicerModel : _root_.org2.kermeta.kompren.slicer.Slicer = (this).getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/kermetaPruning/modelTransfo.kompren");
var pkg : _root_.org.eclipse.emf.ecore.EPackage = ((this).getEcoreModel(modelURI)).one();
var slicer : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator = (_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createSlicerGenerator).initialise(slicerModel, pkg, modelURI);
(slicer).generateSlicer()
(slicer).saveCode()}
        }
 
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.KomprenCompiler"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

